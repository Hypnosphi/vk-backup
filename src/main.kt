@file:Suppress("UNNECESSARY_SAFE_CALL", "SENSELESS_COMPARISON")

import kotlinx.html.*
import kotlinx.html.stream.*
import node.fs.*
import node.process.*
import vk.sdk.*
import kotlin.js.*

fun main(args: Array<String>) {
    dotenv.config()
    val groupId = process.env.VK_GROUP_ID
    val api = vkApi {
        logger = ConsoleLogger()
        token = process.env.VK_TOKEN
        useQueue = true
    }

    api.getAllPosts {
        owner_id = groupId
        photo_sizes = 1
    }.then {posts ->
        val htmlString = buildString {
            append("<!DOCTYPE html>")
            appendHTML().html {
                lang = "ru"
                head {
                    meta { charset = "utf-8" }
                    link("index.css", "stylesheet")
                    script {
                        unsafe {
                            +"""
                                document.addEventListener('keydown', function(event) {
                                    if (event.key === 'g') {
                                        document.body.classList.toggle('grid');
                                    }
                                });
                            """.trimIndent()
                        }
                    }
                }
                body {
                    h1 {
                        +"Комитет Общественной Самозащиты"
                    }
                    posts.forEach { post ->
                        article {
                            post.text.split(Regex("\\n+")).forEachIndexed { i, paragraph ->
                                if (i == 0 && paragraph.length <= 100) {
                                    h4 { +paragraph }
                                } else {
                                    p { +paragraph }
                                }
                            }
                            @Suppress("UNNECESSARY_SAFE_CALL")
                            post.attachments?.forEach {
                                //                                console.log(it)
                                @Suppress("UNNECESSARY_SAFE_CALL")
                                it.photo?.let {
                                    img {
                                        src = it.sizes.maxBy { it.width.toInt() + it.height.toInt() }!!.src
                                    }
                                }
                                @Suppress("UNNECESSARY_SAFE_CALL")
                                it.link?.let {
                                    a(it.url) {
                                        it.photo?.let {
                                            div {
                                                img {
                                                    src = it.sizes.maxBy { it.width.toInt() + it.height.toInt() }!!.src
                                                }
                                            }
                                        }
                                        +it.title
                                    }
                                }
                                it.video?.photo_800?.let {
                                    img {
                                        src = it
                                    }
                                }
                            }
                        }
                        hr()
                    }
                }
            }
        }
        writeFile("public/index.html", htmlString) {
            if (it != null) throw it
            process.exit(0)
        }
    }.catch { process.exit(1) }
}

@file:Suppress("UNNECESSARY_SAFE_CALL", "SENSELESS_COMPARISON")

import kotlinx.html.*
import kotlinx.html.stream.*
import node.fs.*
import node.process.*
import vk.sdk.*
import kotlin.js.*

const val MAX_VIDEOS = 50

fun HtmlBlockTag.post(post: WallWallpost) {
    post.text.split(Regex("\\n+")).forEachIndexed { i, paragraph ->
        if (i == 0 && paragraph.length <= 100) {
            h4 { +paragraph }
        } else {
            p { +paragraph }
        }
    }
    @Suppress("UNNECESSARY_SAFE_CALL")
    post.attachments?.forEach {
        //                                    console.log(it)
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
        it.video?.let {
            if (it.player == null) {
                console.error("No player:", it)
                it.photo_800?.let {
                    img {
                        src = it
                    }
                }
            } else {
                iframe {
                    src = it.player
                }
            }
        }
    }
}

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
        val videoAttachments = posts
            .mapNotNull { it.attachments }
            .flatMap { it.toList() }
            .filter { it.type == "video" }
        val videoPromises = videoAttachments
            .map { it.video }
            .distinctBy { it.id }
            .chunked(MAX_VIDEOS)
            .map { vids ->
                console.log(vids.size)
                api.videoGet {
                    count = MAX_VIDEOS
                    videos = vids.map { it.request }.toTypedArray()
                }.then {
                    console.log(it.items.size)
                    it.items.forEach { video ->
                        videoAttachments
                            .filter {
                                it.video.id == video.id
                            }
                            .forEach {
                                it.video = video
                            }
                    }
                }.catch { console.error(it) }
            }
            .toTypedArray()

        Promise.all(videoPromises).then {
            val htmlString = buildString {
                append("<!DOCTYPE html>")
                appendHTML().html {
                    lang = "ru"
                    head {
                        meta { charset = "utf-8" }
                        title("КОС")
                        link("favicon.ico", "shortcut icon", "image/x-icon")
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
                                post(post)
                                post.copy_history?.let {
                                    blockQuote {
                                        post(it[0])
                                    }
                                }
                            }
                            img("solidarity", "solidarity.svg", "solidarity")
                        }
                    }
                }
            }
            writeFile("public/index.html", htmlString) {
                if (it != null) throw it
                process.exit(0)
            }
        }
    }.catch {
        console.error(it)
        process.exit(1)
    }
}

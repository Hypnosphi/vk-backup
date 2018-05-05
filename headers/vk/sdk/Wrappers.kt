package vk.sdk
import kotlinext.js.*
import kotlin.js.*

fun vkApi(init: VKApiOptions.() -> Unit = {}) = VKApi(jsObject(init))
fun VKApi.wallGet(init: WallGetParams.() -> Unit = {}) = wallGet(jsObject(init))
fun VKApi.photosGetById(init: PhotosGetByIdParams.() -> Unit = {}) = photosGetById(jsObject(init))
fun VKApi.videoGet(init: VideoGetParams.() -> Unit = {}) = videoGet(jsObject(init))

const val PAGE_SIZE = 100

fun VKApi.getAllPosts(init: WallGetParams.() -> Unit = {}): Promise<List<WallWallpostFull>> {
    val posts = mutableListOf<WallWallpostFull>()
    fun getAll(offset: Int = 0): Promise<List<WallWallpostFull>> =
        wallGet {
            init()
            this.offset = offset
            count = PAGE_SIZE
        }.then {
            console.log(offset)
            posts.addAll(it.items)
            val nextOffset = offset + PAGE_SIZE
            if (nextOffset <= it.count.toInt()) {
                getAll(nextOffset)
            } else {
                Promise.resolve(posts)
            }
        // https://youtrack.jetbrains.com/issue/KT-19672
        }.then { it }
    return getAll()
}

fun PhotosPhoto.ownerId(groupId: Number) = if (owner_id == 100) groupId else owner_id

fun PhotosPhoto.request(groupId: Number) = listOf(ownerId(groupId), id, access_key)
    .filterNotNull()
    .joinToString("_")

val VideoVideo.request get() = listOf(owner_id, id, access_key)
    .filterNotNull()
    .joinToString("_")

@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package vk.sdk

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface UsersGetParams {
    var user_ids: Array<String>? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UsersSearchParams {
    var q: String? get() = definedExternally; set(value) = definedExternally
    var sort: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var city: Number? get() = definedExternally; set(value) = definedExternally
    var country: Number? get() = definedExternally; set(value) = definedExternally
    var hometown: String? get() = definedExternally; set(value) = definedExternally
    var university_country: Number? get() = definedExternally; set(value) = definedExternally
    var university: Number? get() = definedExternally; set(value) = definedExternally
    var university_year: Number? get() = definedExternally; set(value) = definedExternally
    var university_faculty: Number? get() = definedExternally; set(value) = definedExternally
    var university_chair: Number? get() = definedExternally; set(value) = definedExternally
    var sex: Number? get() = definedExternally; set(value) = definedExternally
    var status: Number? get() = definedExternally; set(value) = definedExternally
    var age_from: Number? get() = definedExternally; set(value) = definedExternally
    var age_to: Number? get() = definedExternally; set(value) = definedExternally
    var birth_day: Number? get() = definedExternally; set(value) = definedExternally
    var birth_month: Number? get() = definedExternally; set(value) = definedExternally
    var birth_year: Number? get() = definedExternally; set(value) = definedExternally
    var online: Boolean? get() = definedExternally; set(value) = definedExternally
    var has_photo: Boolean? get() = definedExternally; set(value) = definedExternally
    var school_country: Number? get() = definedExternally; set(value) = definedExternally
    var school_city: Number? get() = definedExternally; set(value) = definedExternally
    var school_class: Number? get() = definedExternally; set(value) = definedExternally
    var school: Number? get() = definedExternally; set(value) = definedExternally
    var school_year: Number? get() = definedExternally; set(value) = definedExternally
    var religion: String? get() = definedExternally; set(value) = definedExternally
    var interests: String? get() = definedExternally; set(value) = definedExternally
    var company: String? get() = definedExternally; set(value) = definedExternally
    var position: String? get() = definedExternally; set(value) = definedExternally
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var from_list: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UsersIsAppUserParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UsersGetSubscriptionsParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UsersGetFollowersParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UsersReportParams {
    var user_id: Number
    var type: String
    var comment: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UsersGetNearbyParams {
    var latitude: Number
    var longitude: Number
    var accuracy: Number? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var radius: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AuthCheckPhoneParams {
    var phone: String
    var client_id: Number? get() = definedExternally; set(value) = definedExternally
    var client_secret: String
    var auth_by_phone: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AuthSignupParams {
    var first_name: String
    var last_name: String
    var birthday: String
    var client_id: Number
    var client_secret: String
    var phone: String
    var password: String? get() = definedExternally; set(value) = definedExternally
    var test_mode: Boolean? get() = definedExternally; set(value) = definedExternally
    var voice: Boolean? get() = definedExternally; set(value) = definedExternally
    var sex: Number? get() = definedExternally; set(value) = definedExternally
    var sid: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AuthConfirmParams {
    var client_id: Number
    var client_secret: String
    var phone: String
    var code: String
    var password: String? get() = definedExternally; set(value) = definedExternally
    var test_mode: Boolean? get() = definedExternally; set(value) = definedExternally
    var intro: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AuthRestoreParams {
    var phone: String
    var last_name: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallGetParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var domain: String? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var filter: String? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var photo_sizes: BaseBoolInt?
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallSearchParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var domain: String? get() = definedExternally; set(value) = definedExternally
    var query: String? get() = definedExternally; set(value) = definedExternally
    var owners_only: Boolean? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosCreateAlbumParams {
    var title: String
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var description: String? get() = definedExternally; set(value) = definedExternally
    var privacy_view: Array<String>? get() = definedExternally; set(value) = definedExternally
    var privacy_comment: Array<String>? get() = definedExternally; set(value) = definedExternally
    var upload_by_admins_only: Boolean? get() = definedExternally; set(value) = definedExternally
    var comments_disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosEditAlbumParams {
    var album_id: Number
    var title: String? get() = definedExternally; set(value) = definedExternally
    var description: String? get() = definedExternally; set(value) = definedExternally
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var privacy_view: Array<String>? get() = definedExternally; set(value) = definedExternally
    var privacy_comment: Array<String>? get() = definedExternally; set(value) = definedExternally
    var upload_by_admins_only: Boolean? get() = definedExternally; set(value) = definedExternally
    var comments_disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetAlbumsParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var need_system: Boolean? get() = definedExternally; set(value) = definedExternally
    var need_covers: Boolean? get() = definedExternally; set(value) = definedExternally
    var photo_sizes: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_id: String? get() = definedExternally; set(value) = definedExternally
    var photo_ids: Array<String>? get() = definedExternally; set(value) = definedExternally
    var rev: Boolean? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var feed_type: String? get() = definedExternally; set(value) = definedExternally
    var feed: Number? get() = definedExternally; set(value) = definedExternally
    var photo_sizes: Boolean? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetAlbumsCountParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetByIdParams {
    var photos: Array<String>
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var photo_sizes: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetUploadServerParams {
    var album_id: Number? get() = definedExternally; set(value) = definedExternally
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetOwnerCoverPhotoUploadServerParams {
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var crop_x: Number? get() = definedExternally; set(value) = definedExternally
    var crop_y: Number? get() = definedExternally; set(value) = definedExternally
    var crop_x2: Number? get() = definedExternally; set(value) = definedExternally
    var crop_y2: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetOwnerPhotoUploadServerParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetChatUploadServerParams {
    var chat_id: Number
    var crop_x: Number? get() = definedExternally; set(value) = definedExternally
    var crop_y: Number? get() = definedExternally; set(value) = definedExternally
    var crop_width: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetMarketUploadServerParams {
    var group_id: Number
    var main_photo: Boolean? get() = definedExternally; set(value) = definedExternally
    var crop_x: Number? get() = definedExternally; set(value) = definedExternally
    var crop_y: Number? get() = definedExternally; set(value) = definedExternally
    var crop_width: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetMarketAlbumUploadServerParams {
    var group_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosSaveMarketPhotoParams {
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo: String
    var server: Number
    var hash: String
    var crop_data: String? get() = definedExternally; set(value) = definedExternally
    var crop_hash: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosSaveOwnerCoverPhotoParams {
    var photo: String
    var hash: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosSaveMarketAlbumPhotoParams {
    var group_id: Number
    var photo: String
    var server: Number
    var hash: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosSaveOwnerPhotoParams {
    var server: String? get() = definedExternally; set(value) = definedExternally
    var hash: String? get() = definedExternally; set(value) = definedExternally
    var photo: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosSaveWallPhotoParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo: String
    var server: Number? get() = definedExternally; set(value) = definedExternally
    var hash: String? get() = definedExternally; set(value) = definedExternally
    var latitude: Number? get() = definedExternally; set(value) = definedExternally
    var longitude: Number? get() = definedExternally; set(value) = definedExternally
    var caption: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetWallUploadServerParams {
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetMessagesUploadServerParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosSaveMessagesPhotoParams {
    var photo: String
    var server: Number? get() = definedExternally; set(value) = definedExternally
    var hash: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosReportParams {
    var owner_id: Number
    var photo_id: Number
    var reason: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosReportCommentParams {
    var owner_id: Number
    var comment_id: Number
    var reason: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosSearchParams {
    var q: String? get() = definedExternally; set(value) = definedExternally
    var lat: Number? get() = definedExternally; set(value) = definedExternally
    var long: Number? get() = definedExternally; set(value) = definedExternally
    var start_time: Number? get() = definedExternally; set(value) = definedExternally
    var end_time: Number? get() = definedExternally; set(value) = definedExternally
    var sort: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var radius: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsGetParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var order: String? get() = definedExternally; set(value) = definedExternally
    var list_id: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsGetOnlineParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var list_id: Number? get() = definedExternally; set(value) = definedExternally
    var online_mobile: Boolean? get() = definedExternally; set(value) = definedExternally
    var order: String? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsGetMutualParams {
    var source_uid: Number? get() = definedExternally; set(value) = definedExternally
    var target_uid: Number? get() = definedExternally; set(value) = definedExternally
    var target_uids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var order: String? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsGetRecentParams {
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsGetRequestsParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var need_mutual: Boolean? get() = definedExternally; set(value) = definedExternally
    var out: Boolean? get() = definedExternally; set(value) = definedExternally
    var sort: Number? get() = definedExternally; set(value) = definedExternally
    var suggested: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsAddParams {
    var user_id: Number
    var text: String? get() = definedExternally; set(value) = definedExternally
    var follow: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsEditParams {
    var user_id: Number
    var list_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsDeleteParams {
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsGetListsParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var return_system: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsAddListParams {
    var name: String
    var user_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsEditListParams {
    var name: String? get() = definedExternally; set(value) = definedExternally
    var list_id: Number
    var user_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var add_user_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var delete_user_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsDeleteListParams {
    var list_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsGetAppUsersParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsGetByPhonesParams {
    var phones: Array<String>? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsDeleteAllRequestsParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsGetSuggestionsParams {
    var filter: Array<String>? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsAreFriendsParams {
    var user_ids: Array<Number>
    var need_sign: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsGetAvailableForCallParams {
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FriendsSearchParams {
    var user_id: Number
    var q: String? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WidgetsGetCommentsParams {
    var widget_api_id: Number? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var page_id: String? get() = definedExternally; set(value) = definedExternally
    var order: String? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WidgetsGetPagesParams {
    var widget_api_id: Number? get() = definedExternally; set(value) = definedExternally
    var order: String? get() = definedExternally; set(value) = definedExternally
    var period: String? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesBanOwnerParams {
    var owners_ids: Array<Number>
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesDeleteParams {
    var owner_id: Number
    var story_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesGetParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesGetBannedParams {
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesGetByIdParams {
    var stories: Array<String>? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesGetPhotoUploadServerParams {
    var add_to_news: Boolean? get() = definedExternally; set(value) = definedExternally
    var user_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var reply_to_story: String? get() = definedExternally; set(value) = definedExternally
    var link_text: String? get() = definedExternally; set(value) = definedExternally
    var link_url: String? get() = definedExternally; set(value) = definedExternally
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesGetRepliesParams {
    var owner_id: Number
    var story_id: Number
    var access_key: String? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesGetStatsParams {
    var owner_id: Number
    var story_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesGetVideoUploadServerParams {
    var add_to_news: Boolean? get() = definedExternally; set(value) = definedExternally
    var user_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var reply_to_story: String? get() = definedExternally; set(value) = definedExternally
    var link_text: String? get() = definedExternally; set(value) = definedExternally
    var link_url: String? get() = definedExternally; set(value) = definedExternally
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesGetViewersParams {
    var owner_id: Number
    var story_id: Number
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesHideAllRepliesParams {
    var owner_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesHideReplyParams {
    var owner_id: Number
    var story_id: Number
    var access_key: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StoriesUnbanOwnerParams {
    var owners_ids: Array<Number>
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface SecureGetAppBalanceParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface SecureGetTransactionsHistoryParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface SecureGetSMSHistoryParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var date_from: Number? get() = definedExternally; set(value) = definedExternally
    var date_to: Number? get() = definedExternally; set(value) = definedExternally
    var limit: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface SecureSendSMSNotificationParams {
    var user_id: Number
    var message: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface SecureSendNotificationParams {
    var user_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var message: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface SecureSetCounterParams {
    var counters: Array<String>? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var counter: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface SecureSetUserLevelParams {
    var levels: Array<String>? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var level: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface SecureGetUserLevelParams {
    var user_ids: Array<Number>
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StreamingGetServerUrlParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StorageGetParams {
    var key: String? get() = definedExternally; set(value) = definedExternally
    var keys: Array<String>? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StorageSetParams {
    var key: String
    var value: String? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StorageGetKeysParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface OrdersGetParams {
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var test_mode: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface OrdersGetByIdParams {
    var order_id: Number? get() = definedExternally; set(value) = definedExternally
    var order_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var test_mode: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface OrdersChangeStateParams {
    var order_id: Number
    var action: String
    var app_order_id: Number? get() = definedExternally; set(value) = definedExternally
    var test_mode: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface OrdersGetAmountParams {
    var user_id: Number
    var votes: Array<String>
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosSaveParams {
    var album_id: Number? get() = definedExternally; set(value) = definedExternally
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var server: Number? get() = definedExternally; set(value) = definedExternally
    var photos_list: String? get() = definedExternally; set(value) = definedExternally
    var hash: String? get() = definedExternally; set(value) = definedExternally
    var latitude: Number? get() = definedExternally; set(value) = definedExternally
    var longitude: Number? get() = definedExternally; set(value) = definedExternally
    var caption: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosCopyParams {
    var owner_id: Number
    var photo_id: Number
    var access_key: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosEditParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo_id: Number
    var caption: String? get() = definedExternally; set(value) = definedExternally
    var latitude: Number? get() = definedExternally; set(value) = definedExternally
    var longitude: Number? get() = definedExternally; set(value) = definedExternally
    var place_str: String? get() = definedExternally; set(value) = definedExternally
    var foursquare_id: String? get() = definedExternally; set(value) = definedExternally
    var delete_place: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosMoveParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var target_album_id: Number
    var photo_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosMakeCoverParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo_id: Number
    var album_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosReorderAlbumsParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_id: Number
    var before: Number? get() = definedExternally; set(value) = definedExternally
    var after: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosReorderPhotosParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo_id: Number
    var before: Number? get() = definedExternally; set(value) = definedExternally
    var after: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetAllParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var photo_sizes: Boolean? get() = definedExternally; set(value) = definedExternally
    var no_service_albums: Boolean? get() = definedExternally; set(value) = definedExternally
    var need_hidden: Boolean? get() = definedExternally; set(value) = definedExternally
    var skip_hidden: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetUserPhotosParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var sort: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosDeleteAlbumParams {
    var album_id: Number
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosDeleteParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosRestoreParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosConfirmTagParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo_id: String
    var tag_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetCommentsParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo_id: Number
    var need_likes: Boolean? get() = definedExternally; set(value) = definedExternally
    var start_comment_id: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var sort: String? get() = definedExternally; set(value) = definedExternally
    var access_key: String? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetAllCommentsParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_id: Number? get() = definedExternally; set(value) = definedExternally
    var need_likes: Boolean? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosCreateCommentParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo_id: Number
    var message: String? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var from_group: Boolean? get() = definedExternally; set(value) = definedExternally
    var reply_to_comment: Number? get() = definedExternally; set(value) = definedExternally
    var sticker_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_key: String? get() = definedExternally; set(value) = definedExternally
    var guid: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosDeleteCommentParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var comment_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosRestoreCommentParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var comment_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosEditCommentParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var comment_id: Number
    var message: String? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetTagsParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo_id: Number
    var access_key: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosPutTagParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo_id: Number
    var user_id: Number
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var x2: Number? get() = definedExternally; set(value) = definedExternally
    var y2: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosRemoveTagParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var photo_id: Number
    var tag_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PhotosGetNewTagsParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallGetByIdParams {
    var posts: Array<String>
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var copy_history_depth: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallPostParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var friends_only: Boolean? get() = definedExternally; set(value) = definedExternally
    var from_group: Boolean? get() = definedExternally; set(value) = definedExternally
    var message: String? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var services: String? get() = definedExternally; set(value) = definedExternally
    var signed: Boolean? get() = definedExternally; set(value) = definedExternally
    var publish_date: Number? get() = definedExternally; set(value) = definedExternally
    var lat: Number? get() = definedExternally; set(value) = definedExternally
    var long: Number? get() = definedExternally; set(value) = definedExternally
    var place_id: Number? get() = definedExternally; set(value) = definedExternally
    var post_id: Number? get() = definedExternally; set(value) = definedExternally
    var guid: String? get() = definedExternally; set(value) = definedExternally
    var mark_as_ads: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallRepostParams {
    var `object`: String
    var message: String? get() = definedExternally; set(value) = definedExternally
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var mark_as_ads: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallGetRepostsParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var post_id: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallEditParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var post_id: Number
    var friends_only: Boolean? get() = definedExternally; set(value) = definedExternally
    var message: String? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var services: String? get() = definedExternally; set(value) = definedExternally
    var signed: Boolean? get() = definedExternally; set(value) = definedExternally
    var publish_date: Number? get() = definedExternally; set(value) = definedExternally
    var lat: Number? get() = definedExternally; set(value) = definedExternally
    var long: Number? get() = definedExternally; set(value) = definedExternally
    var place_id: Number? get() = definedExternally; set(value) = definedExternally
    var mark_as_ads: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallDeleteParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var post_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallRestoreParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var post_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallPinParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var post_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallUnpinParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var post_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallGetCommentsParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var post_id: Number
    var need_likes: Boolean? get() = definedExternally; set(value) = definedExternally
    var start_comment_id: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var sort: String? get() = definedExternally; set(value) = definedExternally
    var preview_length: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallCreateCommentParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var post_id: Number
    var from_group: Number? get() = definedExternally; set(value) = definedExternally
    var message: String? get() = definedExternally; set(value) = definedExternally
    var reply_to_comment: Number? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var sticker_id: Number? get() = definedExternally; set(value) = definedExternally
    var guid: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallEditCommentParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var comment_id: Number
    var message: String? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallDeleteCommentParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var comment_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallRestoreCommentParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var comment_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallReportPostParams {
    var owner_id: Number
    var post_id: Number
    var reason: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface WallReportCommentParams {
    var owner_id: Number
    var comment_id: Number
    var reason: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StatusGetParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StatusSetParams {
    var text: String? get() = definedExternally; set(value) = definedExternally
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface LeadsCompleteParams {
    var vk_sid: String
    var secret: String
    var comment: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface LeadsStartParams {
    var lead_id: Number
    var secret: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface LeadsGetStatsParams {
    var lead_id: Number
    var secret: String? get() = definedExternally; set(value) = definedExternally
    var date_start: String? get() = definedExternally; set(value) = definedExternally
    var date_end: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface LeadsGetUsersParams {
    var offer_id: Number
    var secret: String
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var status: Number? get() = definedExternally; set(value) = definedExternally
    var reverse: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface LeadsCheckUserParams {
    var lead_id: Number
    var test_result: Number? get() = definedExternally; set(value) = definedExternally
    var age: Number? get() = definedExternally; set(value) = definedExternally
    var country: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface LeadsMetricHitParams {
    var data: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PagesGetParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var page_id: Number? get() = definedExternally; set(value) = definedExternally
    var global: Boolean? get() = definedExternally; set(value) = definedExternally
    var site_preview: Boolean? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var need_source: Boolean? get() = definedExternally; set(value) = definedExternally
    var need_html: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PagesSaveParams {
    var text: String? get() = definedExternally; set(value) = definedExternally
    var page_id: Number? get() = definedExternally; set(value) = definedExternally
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PagesSaveAccessParams {
    var page_id: Number
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var view: Number? get() = definedExternally; set(value) = definedExternally
    var edit: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PagesGetHistoryParams {
    var page_id: Number
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PagesGetTitlesParams {
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PagesGetVersionParams {
    var version_id: Number
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var need_html: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PagesParseWikiParams {
    var text: String
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PagesClearCacheParams {
    var url: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsIsMemberParams {
    var group_id: String
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var user_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetByIdParams {
    var group_ids: Array<String>? get() = definedExternally; set(value) = definedExternally
    var group_id: String? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var filter: Array<String>? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetMembersParams {
    var group_id: String? get() = definedExternally; set(value) = definedExternally
    var sort: String? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var filter: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsJoinParams {
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var not_sure: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsLeaveParams {
    var group_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsSearchParams {
    var q: String
    var type: String? get() = definedExternally; set(value) = definedExternally
    var country_id: Number? get() = definedExternally; set(value) = definedExternally
    var city_id: Number? get() = definedExternally; set(value) = definedExternally
    var future: Boolean? get() = definedExternally; set(value) = definedExternally
    var market: Boolean? get() = definedExternally; set(value) = definedExternally
    var sort: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetCatalogParams {
    var category_id: Number? get() = definedExternally; set(value) = definedExternally
    var subcategory_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetCatalogInfoParams {
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var subcategories: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetInvitesParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetInvitedUsersParams {
    var group_id: Number
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsBanUserParams {
    var group_id: Number
    var user_id: Number
    var end_date: Number? get() = definedExternally; set(value) = definedExternally
    var reason: Number? get() = definedExternally; set(value) = definedExternally
    var comment: String? get() = definedExternally; set(value) = definedExternally
    var comment_visible: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsUnbanUserParams {
    var group_id: Number
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetBannedParams {
    var group_id: Number
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsCreateParams {
    var title: String
    var description: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var public_category: Number? get() = definedExternally; set(value) = definedExternally
    var subtype: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsEditParams {
    var group_id: Number
    var title: String? get() = definedExternally; set(value) = definedExternally
    var description: String? get() = definedExternally; set(value) = definedExternally
    var screen_name: String? get() = definedExternally; set(value) = definedExternally
    var access: Number? get() = definedExternally; set(value) = definedExternally
    var website: String? get() = definedExternally; set(value) = definedExternally
    var subject: String? get() = definedExternally; set(value) = definedExternally
    var email: String? get() = definedExternally; set(value) = definedExternally
    var phone: String? get() = definedExternally; set(value) = definedExternally
    var rss: String? get() = definedExternally; set(value) = definedExternally
    var event_start_date: Number? get() = definedExternally; set(value) = definedExternally
    var event_finish_date: Number? get() = definedExternally; set(value) = definedExternally
    var event_group_id: Number? get() = definedExternally; set(value) = definedExternally
    var public_category: Number? get() = definedExternally; set(value) = definedExternally
    var public_subcategory: Number? get() = definedExternally; set(value) = definedExternally
    var public_date: String? get() = definedExternally; set(value) = definedExternally
    var wall: Number? get() = definedExternally; set(value) = definedExternally
    var topics: Number? get() = definedExternally; set(value) = definedExternally
    var photos: Number? get() = definedExternally; set(value) = definedExternally
    var video: Number? get() = definedExternally; set(value) = definedExternally
    var audio: Number? get() = definedExternally; set(value) = definedExternally
    var links: Boolean? get() = definedExternally; set(value) = definedExternally
    var events: Boolean? get() = definedExternally; set(value) = definedExternally
    var places: Boolean? get() = definedExternally; set(value) = definedExternally
    var contacts: Boolean? get() = definedExternally; set(value) = definedExternally
    var docs: Number? get() = definedExternally; set(value) = definedExternally
    var wiki: Number? get() = definedExternally; set(value) = definedExternally
    var messages: Boolean? get() = definedExternally; set(value) = definedExternally
    var age_limits: Number? get() = definedExternally; set(value) = definedExternally
    var market: Boolean? get() = definedExternally; set(value) = definedExternally
    var market_comments: Boolean? get() = definedExternally; set(value) = definedExternally
    var market_country: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var market_city: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var market_currency: Number? get() = definedExternally; set(value) = definedExternally
    var market_contact: Number? get() = definedExternally; set(value) = definedExternally
    var market_wiki: Number? get() = definedExternally; set(value) = definedExternally
    var obscene_filter: Boolean? get() = definedExternally; set(value) = definedExternally
    var obscene_stopwords: Boolean? get() = definedExternally; set(value) = definedExternally
    var obscene_words: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsEditPlaceParams {
    var group_id: Number
    var title: String? get() = definedExternally; set(value) = definedExternally
    var address: String? get() = definedExternally; set(value) = definedExternally
    var country_id: Number? get() = definedExternally; set(value) = definedExternally
    var city_id: Number? get() = definedExternally; set(value) = definedExternally
    var latitude: Number? get() = definedExternally; set(value) = definedExternally
    var longitude: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetSettingsParams {
    var group_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetRequestsParams {
    var group_id: Number
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsEditManagerParams {
    var group_id: Number
    var user_id: Number
    var role: String? get() = definedExternally; set(value) = definedExternally
    var is_contact: Boolean? get() = definedExternally; set(value) = definedExternally
    var contact_position: String? get() = definedExternally; set(value) = definedExternally
    var contact_phone: String? get() = definedExternally; set(value) = definedExternally
    var contact_email: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsInviteParams {
    var group_id: Number
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsAddLinkParams {
    var group_id: Number
    var link: String
    var text: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsDeleteLinkParams {
    var group_id: Number
    var link_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsEditLinkParams {
    var group_id: Number
    var link_id: Number
    var text: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsReorderLinkParams {
    var group_id: Number
    var link_id: Number
    var after: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsRemoveUserParams {
    var group_id: Number
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsApproveRequestParams {
    var group_id: Number
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetCallbackConfirmationCodeParams {
    var group_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetCallbackSettingsParams {
    var group_id: Number
    var server_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsSetCallbackSettingsParams {
    var group_id: Number
    var server_id: Number? get() = definedExternally; set(value) = definedExternally
    var message_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var message_reply: Boolean? get() = definedExternally; set(value) = definedExternally
    var message_allow: Boolean? get() = definedExternally; set(value) = definedExternally
    var message_deny: Boolean? get() = definedExternally; set(value) = definedExternally
    var photo_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var audio_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var video_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var wall_reply_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var wall_reply_edit: Boolean? get() = definedExternally; set(value) = definedExternally
    var wall_reply_delete: Boolean? get() = definedExternally; set(value) = definedExternally
    var wall_reply_restore: Boolean? get() = definedExternally; set(value) = definedExternally
    var wall_post_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var wall_repost: Boolean? get() = definedExternally; set(value) = definedExternally
    var board_post_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var board_post_edit: Boolean? get() = definedExternally; set(value) = definedExternally
    var board_post_restore: Boolean? get() = definedExternally; set(value) = definedExternally
    var board_post_delete: Boolean? get() = definedExternally; set(value) = definedExternally
    var photo_comment_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var photo_comment_edit: Boolean? get() = definedExternally; set(value) = definedExternally
    var photo_comment_delete: Boolean? get() = definedExternally; set(value) = definedExternally
    var photo_comment_restore: Boolean? get() = definedExternally; set(value) = definedExternally
    var video_comment_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var video_comment_edit: Boolean? get() = definedExternally; set(value) = definedExternally
    var video_comment_delete: Boolean? get() = definedExternally; set(value) = definedExternally
    var video_comment_restore: Boolean? get() = definedExternally; set(value) = definedExternally
    var market_comment_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var market_comment_edit: Boolean? get() = definedExternally; set(value) = definedExternally
    var market_comment_delete: Boolean? get() = definedExternally; set(value) = definedExternally
    var market_comment_restore: Boolean? get() = definedExternally; set(value) = definedExternally
    var poll_vote_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var group_join: Boolean? get() = definedExternally; set(value) = definedExternally
    var group_leave: Boolean? get() = definedExternally; set(value) = definedExternally
    var user_block: Boolean? get() = definedExternally; set(value) = definedExternally
    var user_unblock: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetLongPollServerParams {
    var group_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsGetLongPollSettingsParams {
    var group_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GroupsSetLongPollSettingsParams {
    var group_id: Number
    var message_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var message_reply: Boolean? get() = definedExternally; set(value) = definedExternally
    var message_edit: Boolean? get() = definedExternally; set(value) = definedExternally
    var message_allow: Boolean? get() = definedExternally; set(value) = definedExternally
    var message_deny: Boolean? get() = definedExternally; set(value) = definedExternally
    var photo_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var audio_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var video_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var wall_reply_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var wall_reply_edit: Boolean? get() = definedExternally; set(value) = definedExternally
    var wall_reply_delete: Boolean? get() = definedExternally; set(value) = definedExternally
    var wall_reply_restore: Boolean? get() = definedExternally; set(value) = definedExternally
    var wall_post_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var wall_repost: Boolean? get() = definedExternally; set(value) = definedExternally
    var board_post_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var board_post_edit: Boolean? get() = definedExternally; set(value) = definedExternally
    var board_post_restore: Boolean? get() = definedExternally; set(value) = definedExternally
    var board_post_delete: Boolean? get() = definedExternally; set(value) = definedExternally
    var photo_comment_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var photo_comment_edit: Boolean? get() = definedExternally; set(value) = definedExternally
    var photo_comment_delete: Boolean? get() = definedExternally; set(value) = definedExternally
    var photo_comment_restore: Boolean? get() = definedExternally; set(value) = definedExternally
    var video_comment_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var video_comment_edit: Boolean? get() = definedExternally; set(value) = definedExternally
    var video_comment_delete: Boolean? get() = definedExternally; set(value) = definedExternally
    var video_comment_restore: Boolean? get() = definedExternally; set(value) = definedExternally
    var market_comment_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var market_comment_edit: Boolean? get() = definedExternally; set(value) = definedExternally
    var market_comment_delete: Boolean? get() = definedExternally; set(value) = definedExternally
    var market_comment_restore: Boolean? get() = definedExternally; set(value) = definedExternally
    var poll_vote_new: Boolean? get() = definedExternally; set(value) = definedExternally
    var group_join: Boolean? get() = definedExternally; set(value) = definedExternally
    var group_leave: Boolean? get() = definedExternally; set(value) = definedExternally
    var user_block: Boolean? get() = definedExternally; set(value) = definedExternally
    var user_unblock: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardGetTopicsParams {
    var group_id: Number
    var topic_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var order: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var preview: Number? get() = definedExternally; set(value) = definedExternally
    var preview_length: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardGetCommentsParams {
    var group_id: Number
    var topic_id: Number
    var need_likes: Boolean? get() = definedExternally; set(value) = definedExternally
    var start_comment_id: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var sort: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardAddTopicParams {
    var group_id: Number
    var title: String
    var text: String? get() = definedExternally; set(value) = definedExternally
    var from_group: Boolean? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardCreateCommentParams {
    var group_id: Number
    var topic_id: Number
    var message: String? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var from_group: Boolean? get() = definedExternally; set(value) = definedExternally
    var sticker_id: Number? get() = definedExternally; set(value) = definedExternally
    var guid: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardDeleteTopicParams {
    var group_id: Number
    var topic_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardEditTopicParams {
    var group_id: Number
    var topic_id: Number
    var title: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardEditCommentParams {
    var group_id: Number
    var topic_id: Number
    var comment_id: Number
    var message: String? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardRestoreCommentParams {
    var group_id: Number
    var topic_id: Number
    var comment_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardDeleteCommentParams {
    var group_id: Number
    var topic_id: Number
    var comment_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardOpenTopicParams {
    var group_id: Number
    var topic_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardCloseTopicParams {
    var group_id: Number
    var topic_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardFixTopicParams {
    var group_id: Number
    var topic_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface BoardUnfixTopicParams {
    var group_id: Number
    var topic_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoGetParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var videos: Array<String>? get() = definedExternally; set(value) = definedExternally
    var album_id: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoEditParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var video_id: Number
    var name: String? get() = definedExternally; set(value) = definedExternally
    var desc: String? get() = definedExternally; set(value) = definedExternally
    var privacy_view: Array<String>? get() = definedExternally; set(value) = definedExternally
    var privacy_comment: Array<String>? get() = definedExternally; set(value) = definedExternally
    var no_comments: Boolean? get() = definedExternally; set(value) = definedExternally
    var repeat: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoAddParams {
    var target_id: Number? get() = definedExternally; set(value) = definedExternally
    var video_id: Number
    var owner_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoSaveParams {
    var name: String? get() = definedExternally; set(value) = definedExternally
    var description: String? get() = definedExternally; set(value) = definedExternally
    var is_private: Boolean? get() = definedExternally; set(value) = definedExternally
    var wallpost: Boolean? get() = definedExternally; set(value) = definedExternally
    var link: String? get() = definedExternally; set(value) = definedExternally
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_id: Number? get() = definedExternally; set(value) = definedExternally
    var privacy_view: Array<String>? get() = definedExternally; set(value) = definedExternally
    var privacy_comment: Array<String>? get() = definedExternally; set(value) = definedExternally
    var no_comments: Boolean? get() = definedExternally; set(value) = definedExternally
    var repeat: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoDeleteParams {
    var video_id: Number
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var target_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoRestoreParams {
    var video_id: Number
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoSearchParams {
    var q: String
    var sort: Number? get() = definedExternally; set(value) = definedExternally
    var hd: Number? get() = definedExternally; set(value) = definedExternally
    var adult: Boolean? get() = definedExternally; set(value) = definedExternally
    var filters: Array<String>? get() = definedExternally; set(value) = definedExternally
    var search_own: Boolean? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var longer: Number? get() = definedExternally; set(value) = definedExternally
    var shorter: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoGetUserVideosParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoGetAlbumsParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoGetAlbumByIdParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoAddAlbumParams {
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var privacy: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoEditAlbumParams {
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_id: Number
    var title: String
    var privacy: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoDeleteAlbumParams {
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoReorderAlbumsParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_id: Number
    var before: Number? get() = definedExternally; set(value) = definedExternally
    var after: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoReorderVideosParams {
    var target_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_id: Number? get() = definedExternally; set(value) = definedExternally
    var owner_id: Number
    var video_id: Number
    var before_owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var before_video_id: Number? get() = definedExternally; set(value) = definedExternally
    var after_owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var after_video_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoAddToAlbumParams {
    var target_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var owner_id: Number
    var video_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoRemoveFromAlbumParams {
    var target_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_id: Number? get() = definedExternally; set(value) = definedExternally
    var album_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var owner_id: Number
    var video_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoGetAlbumsByVideoParams {
    var target_id: Number? get() = definedExternally; set(value) = definedExternally
    var owner_id: Number
    var video_id: Number
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoGetCommentsParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var video_id: Number
    var need_likes: Boolean? get() = definedExternally; set(value) = definedExternally
    var start_comment_id: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var sort: String? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoCreateCommentParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var video_id: Number
    var message: String? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var from_group: Boolean? get() = definedExternally; set(value) = definedExternally
    var reply_to_comment: Number? get() = definedExternally; set(value) = definedExternally
    var sticker_id: Number? get() = definedExternally; set(value) = definedExternally
    var guid: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoDeleteCommentParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var comment_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoRestoreCommentParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var comment_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoEditCommentParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var comment_id: Number
    var message: String? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoGetTagsParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var video_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoPutTagParams {
    var user_id: Number
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var video_id: Number
    var tagged_name: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoRemoveTagParams {
    var tag_id: Number
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var video_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoGetNewTagsParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoReportParams {
    var owner_id: Number
    var video_id: Number
    var reason: Number? get() = definedExternally; set(value) = definedExternally
    var comment: String? get() = definedExternally; set(value) = definedExternally
    var search_query: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoReportCommentParams {
    var owner_id: Number
    var comment_id: Number
    var reason: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoGetCatalogParams {
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var items_count: Number? get() = definedExternally; set(value) = definedExternally
    var from: String? get() = definedExternally; set(value) = definedExternally
    var filters: Array<String>? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoGetCatalogSectionParams {
    var section_id: String
    var from: String
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoHideCatalogSectionParams {
    var section_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NotesGetParams {
    var note_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NotesGetByIdParams {
    var note_id: Number
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NotesAddParams {
    var title: String
    var text: String
    var privacy_view: Array<String>? get() = definedExternally; set(value) = definedExternally
    var privacy_comment: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NotesEditParams {
    var note_id: Number
    var title: String
    var text: String
    var privacy_view: Array<String>? get() = definedExternally; set(value) = definedExternally
    var privacy_comment: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NotesDeleteParams {
    var note_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NotesGetCommentsParams {
    var note_id: Number
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NotesCreateCommentParams {
    var note_id: Number
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var reply_to: Number? get() = definedExternally; set(value) = definedExternally
    var message: String
    var guid: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NotesEditCommentParams {
    var comment_id: Number
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var message: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NotesDeleteCommentParams {
    var comment_id: Number
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NotesRestoreCommentParams {
    var comment_id: Number
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PlacesAddParams {
    var type: Number? get() = definedExternally; set(value) = definedExternally
    var title: String
    var latitude: Number
    var longitude: Number
    var country: Number? get() = definedExternally; set(value) = definedExternally
    var city: Number? get() = definedExternally; set(value) = definedExternally
    var address: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PlacesGetByIdParams {
    var places: Array<Number>
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PlacesSearchParams {
    var q: String? get() = definedExternally; set(value) = definedExternally
    var city: Number? get() = definedExternally; set(value) = definedExternally
    var latitude: Number
    var longitude: Number
    var radius: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PlacesCheckinParams {
    var place_id: Number? get() = definedExternally; set(value) = definedExternally
    var text: String? get() = definedExternally; set(value) = definedExternally
    var latitude: Number? get() = definedExternally; set(value) = definedExternally
    var longitude: Number? get() = definedExternally; set(value) = definedExternally
    var friends_only: Boolean? get() = definedExternally; set(value) = definedExternally
    var services: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PlacesGetCheckinsParams {
    var latitude: Number? get() = definedExternally; set(value) = definedExternally
    var longitude: Number? get() = definedExternally; set(value) = definedExternally
    var place: Number? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var timestamp: Number? get() = definedExternally; set(value) = definedExternally
    var friends_only: Boolean? get() = definedExternally; set(value) = definedExternally
    var need_places: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PlacesGetTypesParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountGetCountersParams {
    var filter: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountSetNameInMenuParams {
    var user_id: Number
    var name: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountSetOnlineParams {
    var voip: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountSetOfflineParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountLookupContactsParams {
    var contacts: Array<String>? get() = definedExternally; set(value) = definedExternally
    var service: String
    var mycontact: String? get() = definedExternally; set(value) = definedExternally
    var return_all: Boolean? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountRegisterDeviceParams {
    var token: String
    var device_model: String? get() = definedExternally; set(value) = definedExternally
    var device_year: Number? get() = definedExternally; set(value) = definedExternally
    var device_id: String
    var system_version: String? get() = definedExternally; set(value) = definedExternally
    var settings: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountUnregisterDeviceParams {
    var device_id: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountSetSilenceModeParams {
    var device_id: String? get() = definedExternally; set(value) = definedExternally
    var time: Number? get() = definedExternally; set(value) = definedExternally
    var peer_id: Number? get() = definedExternally; set(value) = definedExternally
    var sound: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountGetPushSettingsParams {
    var device_id: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountSetPushSettingsParams {
    var device_id: String
    var settings: String? get() = definedExternally; set(value) = definedExternally
    var key: String? get() = definedExternally; set(value) = definedExternally
    var value: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountGetAppPermissionsParams {
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountGetActiveOffersParams {
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountBanUserParams {
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountUnbanUserParams {
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountGetBannedParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountGetInfoParams {
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountSetInfoParams {
    var name: String? get() = definedExternally; set(value) = definedExternally
    var value: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountChangePasswordParams {
    var restore_sid: String? get() = definedExternally; set(value) = definedExternally
    var change_password_hash: String? get() = definedExternally; set(value) = definedExternally
    var old_password: String? get() = definedExternally; set(value) = definedExternally
    var new_password: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountGetProfileInfoParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccountSaveProfileInfoParams {
    var first_name: String? get() = definedExternally; set(value) = definedExternally
    var last_name: String? get() = definedExternally; set(value) = definedExternally
    var maiden_name: String? get() = definedExternally; set(value) = definedExternally
    var screen_name: String? get() = definedExternally; set(value) = definedExternally
    var cancel_request_id: Number? get() = definedExternally; set(value) = definedExternally
    var sex: Number? get() = definedExternally; set(value) = definedExternally
    var relation: Number? get() = definedExternally; set(value) = definedExternally
    var relation_partner_id: Number? get() = definedExternally; set(value) = definedExternally
    var bdate: String? get() = definedExternally; set(value) = definedExternally
    var bdate_visibility: Number? get() = definedExternally; set(value) = definedExternally
    var home_town: String? get() = definedExternally; set(value) = definedExternally
    var country_id: Number? get() = definedExternally; set(value) = definedExternally
    var city_id: Number? get() = definedExternally; set(value) = definedExternally
    var status: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesGetParams {
    var out: Boolean? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var filter: Number? get() = definedExternally; set(value) = definedExternally
    var time_offset: Number? get() = definedExternally; set(value) = definedExternally
    var preview_length: Number? get() = definedExternally; set(value) = definedExternally
    var last_message_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesGetDialogsParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var start_message_id: Number? get() = definedExternally; set(value) = definedExternally
    var preview_length: Number? get() = definedExternally; set(value) = definedExternally
    var unread: Boolean? get() = definedExternally; set(value) = definedExternally
    var important: Boolean? get() = definedExternally; set(value) = definedExternally
    var unanswered: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesGetByIdParams {
    var message_ids: Array<Number>
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesSearchParams {
    var q: String? get() = definedExternally; set(value) = definedExternally
    var peer_id: Number? get() = definedExternally; set(value) = definedExternally
    var date: Number? get() = definedExternally; set(value) = definedExternally
    var preview_length: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesGetHistoryParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var peer_id: Number? get() = definedExternally; set(value) = definedExternally
    var start_message_id: Number? get() = definedExternally; set(value) = definedExternally
    var rev: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesGetHistoryAttachmentsParams {
    var peer_id: Number
    var media_type: String? get() = definedExternally; set(value) = definedExternally
    var start_from: String? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var photo_sizes: Boolean? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesSendParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var random_id: Number? get() = definedExternally; set(value) = definedExternally
    var peer_id: Number? get() = definedExternally; set(value) = definedExternally
    var domain: String? get() = definedExternally; set(value) = definedExternally
    var chat_id: Number? get() = definedExternally; set(value) = definedExternally
    var user_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var message: String? get() = definedExternally; set(value) = definedExternally
    var lat: Number? get() = definedExternally; set(value) = definedExternally
    var long: Number? get() = definedExternally; set(value) = definedExternally
    var attachment: String? get() = definedExternally; set(value) = definedExternally
    var forward_messages: String? get() = definedExternally; set(value) = definedExternally
    var sticker_id: Number? get() = definedExternally; set(value) = definedExternally
    var notification: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesDeleteParams {
    var message_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var spam: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesDeleteDialogParams {
    var user_id: String? get() = definedExternally; set(value) = definedExternally
    var peer_id: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesRestoreParams {
    var message_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesMarkAsReadParams {
    var message_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var peer_id: String? get() = definedExternally; set(value) = definedExternally
    var start_message_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesMarkAsImportantParams {
    var message_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var important: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesMarkAsImportantDialogParams {
    var peer_id: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var important: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesMarkAsUnansweredDialogParams {
    var peer_id: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var important: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesGetLongPollServerParams {
    var lp_version: Number? get() = definedExternally; set(value) = definedExternally
    var need_pts: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesGetLongPollHistoryParams {
    var ts: Number? get() = definedExternally; set(value) = definedExternally
    var pts: Number? get() = definedExternally; set(value) = definedExternally
    var preview_length: Number? get() = definedExternally; set(value) = definedExternally
    var onlines: Boolean? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var events_limit: Number? get() = definedExternally; set(value) = definedExternally
    var msgs_limit: Number? get() = definedExternally; set(value) = definedExternally
    var max_msg_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesGetChatParams {
    var chat_id: Number? get() = definedExternally; set(value) = definedExternally
    var chat_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesCreateChatParams {
    var user_ids: Array<Number>
    var title: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesEditChatParams {
    var chat_id: Number
    var title: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesGetChatUsersParams {
    var chat_id: Number? get() = definedExternally; set(value) = definedExternally
    var chat_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesSetActivityParams {
    var user_id: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var peer_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesSearchDialogsParams {
    var q: String? get() = definedExternally; set(value) = definedExternally
    var limit: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesAddChatUserParams {
    var chat_id: Number
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesRemoveChatUserParams {
    var chat_id: Number
    var user_id: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesGetLastActivityParams {
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesSetChatPhotoParams {
    var file: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesDeleteChatPhotoParams {
    var chat_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesDenyMessagesFromGroupParams {
    var group_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesAllowMessagesFromGroupParams {
    var group_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagesIsMessagesFromGroupAllowedParams {
    var group_id: Number
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedGetParams {
    var filters: Array<String>? get() = definedExternally; set(value) = definedExternally
    var return_banned: Boolean? get() = definedExternally; set(value) = definedExternally
    var start_time: Number? get() = definedExternally; set(value) = definedExternally
    var end_time: Number? get() = definedExternally; set(value) = definedExternally
    var max_photos: Number? get() = definedExternally; set(value) = definedExternally
    var source_ids: Array<String>? get() = definedExternally; set(value) = definedExternally
    var start_from: String? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedGetRecommendedParams {
    var start_time: Number? get() = definedExternally; set(value) = definedExternally
    var end_time: Number? get() = definedExternally; set(value) = definedExternally
    var max_photos: Number? get() = definedExternally; set(value) = definedExternally
    var start_from: String? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedGetCommentsParams {
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var filters: Array<String>? get() = definedExternally; set(value) = definedExternally
    var reposts: String? get() = definedExternally; set(value) = definedExternally
    var start_time: Number? get() = definedExternally; set(value) = definedExternally
    var end_time: Number? get() = definedExternally; set(value) = definedExternally
    var start_from: String? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedGetMentionsParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var start_time: Number? get() = definedExternally; set(value) = definedExternally
    var end_time: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedGetBannedParams {
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedAddBanParams {
    var user_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var group_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedDeleteBanParams {
    var user_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var group_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedIgnoreItemParams {
    var type: String
    var owner_id: Number
    var item_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedUnignoreItemParams {
    var type: String
    var owner_id: Number
    var item_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedSearchParams {
    var q: String? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var latitude: Number? get() = definedExternally; set(value) = definedExternally
    var longitude: Number? get() = definedExternally; set(value) = definedExternally
    var start_time: Number? get() = definedExternally; set(value) = definedExternally
    var end_time: Number? get() = definedExternally; set(value) = definedExternally
    var start_from: String? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedGetListsParams {
    var list_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedSaveListParams {
    var list_id: Number? get() = definedExternally; set(value) = definedExternally
    var title: String
    var source_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var no_reposts: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedDeleteListParams {
    var list_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedUnsubscribeParams {
    var type: String
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var item_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NewsfeedGetSuggestedSourcesParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var shuffle: Boolean? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface LikesGetListParams {
    var type: String
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var item_id: Number? get() = definedExternally; set(value) = definedExternally
    var page_url: String? get() = definedExternally; set(value) = definedExternally
    var filter: String? get() = definedExternally; set(value) = definedExternally
    var friends_only: Boolean? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var skip_own: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface LikesAddParams {
    var type: String
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var item_id: Number
    var access_key: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface LikesDeleteParams {
    var type: String
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var item_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface LikesIsLikedParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var type: String
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var item_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PollsGetByIdParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var is_board: Boolean? get() = definedExternally; set(value) = definedExternally
    var poll_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PollsAddVoteParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var poll_id: Number
    var answer_id: Number
    var is_board: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PollsDeleteVoteParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var poll_id: Number
    var answer_id: Number
    var is_board: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PollsGetVotersParams {
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var poll_id: Number
    var answer_ids: Array<Number>
    var is_board: Boolean? get() = definedExternally; set(value) = definedExternally
    var friends_only: Boolean? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PollsCreateParams {
    var question: String? get() = definedExternally; set(value) = definedExternally
    var is_anonymous: Boolean? get() = definedExternally; set(value) = definedExternally
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var add_answers: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface PollsEditParams {
    var owner_id: Number
    var poll_id: Number
    var question: String? get() = definedExternally; set(value) = definedExternally
    var add_answers: String? get() = definedExternally; set(value) = definedExternally
    var edit_answers: String? get() = definedExternally; set(value) = definedExternally
    var delete_answers: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DocsGetParams {
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var owner_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DocsGetByIdParams {
    var docs: Array<String>
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DocsGetUploadServerParams {
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DocsGetWallUploadServerParams {
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DocsSaveParams {
    var file: String
    var title: String? get() = definedExternally; set(value) = definedExternally
    var tags: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DocsDeleteParams {
    var owner_id: Number
    var doc_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DocsAddParams {
    var owner_id: Number
    var doc_id: Number
    var access_key: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DocsGetTypesParams {
    var owner_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DocsSearchParams {
    var q: String
    var search_own: Boolean? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DocsEditParams {
    var owner_id: Number
    var doc_id: Number
    var title: String? get() = definedExternally; set(value) = definedExternally
    var tags: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FaveGetUsersParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FaveGetPhotosParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var photo_sizes: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FaveGetPostsParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FaveGetVideosParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FaveGetLinksParams {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FaveGetMarketItemsParams {
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FaveAddUserParams {
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FaveRemoveUserParams {
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FaveAddGroupParams {
    var group_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FaveRemoveGroupParams {
    var group_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FaveAddLinkParams {
    var link: String
    var text: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface FaveRemoveLinkParams {
    var link_id: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NotificationsGetParams {
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var start_from: String? get() = definedExternally; set(value) = definedExternally
    var filters: Array<String>? get() = definedExternally; set(value) = definedExternally
    var start_time: Number? get() = definedExternally; set(value) = definedExternally
    var end_time: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface NotificationsMarkAsViewedParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StatsGetParams {
    var group_id: Number? get() = definedExternally; set(value) = definedExternally
    var app_id: Number? get() = definedExternally; set(value) = definedExternally
    var date_from: String? get() = definedExternally; set(value) = definedExternally
    var date_to: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StatsTrackVisitorParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface StatsGetPostReachParams {
    var owner_id: Number
    var post_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface SearchGetHintsParams {
    var q: String? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var limit: Number? get() = definedExternally; set(value) = definedExternally
    var filters: Array<String>? get() = definedExternally; set(value) = definedExternally
    var search_global: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AppsGetCatalogParams {
    var sort: String? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number
    var platform: String? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var return_friends: Boolean? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var q: String? get() = definedExternally; set(value) = definedExternally
    var genre_id: Number? get() = definedExternally; set(value) = definedExternally
    var filter: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AppsGetParams {
    var app_id: Number? get() = definedExternally; set(value) = definedExternally
    var app_ids: Array<String>? get() = definedExternally; set(value) = definedExternally
    var platform: String? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var name_case: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AppsSendRequestParams {
    var user_id: Number
    var text: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var key: String? get() = definedExternally; set(value) = definedExternally
    var separate: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AppsDeleteAppRequestsParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AppsGetFriendsListParams {
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AppsGetLeaderboardParams {
    var type: String
    var global: Boolean? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface SecureAddAppEventParams {
    var user_id: Number
    var activity_id: Number
    var value: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AppsGetScoreParams {
    var user_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UtilsCheckLinkParams {
    var url: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UtilsDeleteFromLastShortenedParams {
    var key: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UtilsGetLastShortenedLinksParams {
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UtilsGetLinkStatsParams {
    var key: String
    var access_key: String? get() = definedExternally; set(value) = definedExternally
    var interval: String? get() = definedExternally; set(value) = definedExternally
    var intervals_count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UtilsGetShortLinkParams {
    var url: String
    var private: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UtilsResolveScreenNameParams {
    var screen_name: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface UtilsGetServerTimeParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DatabaseGetCountriesParams {
    var need_all: Boolean? get() = definedExternally; set(value) = definedExternally
    var code: String? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DatabaseGetRegionsParams {
    var country_id: Number
    var q: String? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DatabaseGetStreetsByIdParams {
    var street_ids: Array<Number>
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DatabaseGetCountriesByIdParams {
    var country_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DatabaseGetCitiesParams {
    var country_id: Number
    var region_id: Number? get() = definedExternally; set(value) = definedExternally
    var q: String? get() = definedExternally; set(value) = definedExternally
    var need_all: Boolean? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DatabaseGetCitiesByIdParams {
    var city_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DatabaseGetUniversitiesParams {
    var q: String? get() = definedExternally; set(value) = definedExternally
    var country_id: Number? get() = definedExternally; set(value) = definedExternally
    var city_id: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DatabaseGetSchoolsParams {
    var q: String? get() = definedExternally; set(value) = definedExternally
    var city_id: Number
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DatabaseGetSchoolClassesParams {
    var country_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DatabaseGetFacultiesParams {
    var university_id: Number
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface DatabaseGetChairsParams {
    var faculty_id: Number
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface GiftsGetParams {
    var user_id: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetAccountsParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetClientsParams {
    var account_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsCreateClientsParams {
    var account_id: Number
    var data: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsUpdateClientsParams {
    var account_id: Number
    var data: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsDeleteClientsParams {
    var account_id: Number
    var ids: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetCampaignsParams {
    var account_id: Number
    var client_id: Number? get() = definedExternally; set(value) = definedExternally
    var include_deleted: Boolean? get() = definedExternally; set(value) = definedExternally
    var campaign_ids: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsCreateCampaignsParams {
    var account_id: Number
    var data: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsUpdateCampaignsParams {
    var account_id: Number
    var data: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsDeleteCampaignsParams {
    var account_id: Number
    var ids: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetAdsParams {
    var account_id: Number
    var client_id: Number? get() = definedExternally; set(value) = definedExternally
    var include_deleted: Boolean? get() = definedExternally; set(value) = definedExternally
    var campaign_ids: String? get() = definedExternally; set(value) = definedExternally
    var ad_ids: String? get() = definedExternally; set(value) = definedExternally
    var limit: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetAdsLayoutParams {
    var account_id: Number
    var client_id: Number? get() = definedExternally; set(value) = definedExternally
    var include_deleted: Boolean? get() = definedExternally; set(value) = definedExternally
    var campaign_ids: String? get() = definedExternally; set(value) = definedExternally
    var ad_ids: String? get() = definedExternally; set(value) = definedExternally
    var limit: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetAdsTargetingParams {
    var account_id: Number
    var client_id: Number? get() = definedExternally; set(value) = definedExternally
    var include_deleted: Boolean? get() = definedExternally; set(value) = definedExternally
    var campaign_ids: String? get() = definedExternally; set(value) = definedExternally
    var ad_ids: String? get() = definedExternally; set(value) = definedExternally
    var limit: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsCreateAdsParams {
    var account_id: Number
    var data: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsUpdateAdsParams {
    var account_id: Number
    var data: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsDeleteAdsParams {
    var account_id: Number
    var ids: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsCheckLinkParams {
    var account_id: Number
    var link_type: String
    var link_url: String
    var campaign_id: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetStatisticsParams {
    var account_id: Number
    var ids_type: String
    var ids: String
    var period: String
    var date_from: String
    var date_to: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetDemographicsParams {
    var account_id: Number
    var ids_type: String
    var ids: String
    var period: String
    var date_from: String
    var date_to: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetAdsPostsReachParams {
    var account_id: Number
    var ads_ids: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetBudgetParams {
    var account_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetOfficeUsersParams {
    var account_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsAddOfficeUsersParams {
    var account_id: Number
    var data: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsRemoveOfficeUsersParams {
    var account_id: Number
    var ids: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetTargetingStatsParams {
    var account_id: Number
    var criteria: String? get() = definedExternally; set(value) = definedExternally
    var ad_id: Number? get() = definedExternally; set(value) = definedExternally
    var ad_format: Number? get() = definedExternally; set(value) = definedExternally
    var ad_platform: String? get() = definedExternally; set(value) = definedExternally
    var link_url: String
    var link_domain: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetSuggestionsParams {
    var section: String
    var ids: String? get() = definedExternally; set(value) = definedExternally
    var q: String? get() = definedExternally; set(value) = definedExternally
    var country: Number? get() = definedExternally; set(value) = definedExternally
    var cities: String? get() = definedExternally; set(value) = definedExternally
    var lang: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetCategoriesParams {
    var lang: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetUploadURLParams {
    var ad_format: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetVideoUploadURLParams {
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetFloodStatsParams {
    var account_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetRejectionReasonParams {
    var account_id: Number
    var ad_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsCreateTargetGroupParams {
    var account_id: Number
    var client_id: Number? get() = definedExternally; set(value) = definedExternally
    var name: String
    var domain: String? get() = definedExternally; set(value) = definedExternally
    var lifetime: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsUpdateTargetGroupParams {
    var account_id: Number
    var client_id: Number? get() = definedExternally; set(value) = definedExternally
    var target_group_id: Number
    var name: String
    var domain: String? get() = definedExternally; set(value) = definedExternally
    var lifetime: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsDeleteTargetGroupParams {
    var account_id: Number
    var client_id: Number? get() = definedExternally; set(value) = definedExternally
    var target_group_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsGetTargetGroupsParams {
    var account_id: Number
    var client_id: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface AdsImportTargetContactsParams {
    var account_id: Number
    var client_id: Number? get() = definedExternally; set(value) = definedExternally
    var target_group_id: Number
    var contacts: String
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface SecureCheckTokenParams {
    var token: String? get() = definedExternally; set(value) = definedExternally
    var ip: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketGetParams {
    var owner_id: Number
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketGetByIdParams {
    var item_ids: Array<String>
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketSearchParams {
    var owner_id: Number
    var q: String? get() = definedExternally; set(value) = definedExternally
    var price_from: Number? get() = definedExternally; set(value) = definedExternally
    var price_to: Number? get() = definedExternally; set(value) = definedExternally
    var tags: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var rev: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketGetAlbumsParams {
    var owner_id: Number
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketGetAlbumByIdParams {
    var owner_id: Number
    var album_ids: Array<Number>
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketCreateCommentParams {
    var owner_id: Number
    var item_id: Number
    var message: String? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var from_group: Boolean? get() = definedExternally; set(value) = definedExternally
    var reply_to_comment: Number? get() = definedExternally; set(value) = definedExternally
    var sticker_id: Number? get() = definedExternally; set(value) = definedExternally
    var guid: String? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketGetCommentsParams {
    var owner_id: Number
    var item_id: Number
    var need_likes: Boolean? get() = definedExternally; set(value) = definedExternally
    var start_comment_id: Number? get() = definedExternally; set(value) = definedExternally
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var sort: String? get() = definedExternally; set(value) = definedExternally
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var fields: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketDeleteCommentParams {
    var owner_id: Number
    var comment_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketRestoreCommentParams {
    var owner_id: Number
    var comment_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketEditCommentParams {
    var owner_id: Number
    var comment_id: Number
    var message: String? get() = definedExternally; set(value) = definedExternally
    var attachments: Array<String>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketReportCommentParams {
    var owner_id: Number
    var comment_id: Number
    var reason: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketGetCategoriesParams {
    var count: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketReportParams {
    var owner_id: Number
    var item_id: Number
    var reason: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketAddParams {
    var owner_id: Number
    var name: String
    var description: String
    var category_id: Number
    var price: Number
    var deleted: Boolean? get() = definedExternally; set(value) = definedExternally
    var main_photo_id: Number
    var photo_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketEditParams {
    var owner_id: Number
    var item_id: Number
    var name: String
    var description: String
    var category_id: Number
    var price: Number
    var deleted: Boolean? get() = definedExternally; set(value) = definedExternally
    var main_photo_id: Number
    var photo_ids: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketDeleteParams {
    var owner_id: Number
    var item_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketRestoreParams {
    var owner_id: Number
    var item_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketReorderItemsParams {
    var owner_id: Number
    var album_id: Number? get() = definedExternally; set(value) = definedExternally
    var item_id: Number
    var before: Number? get() = definedExternally; set(value) = definedExternally
    var after: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketReorderAlbumsParams {
    var owner_id: Number
    var album_id: Number
    var before: Number? get() = definedExternally; set(value) = definedExternally
    var after: Number? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketAddAlbumParams {
    var owner_id: Number
    var title: String
    var photo_id: Number? get() = definedExternally; set(value) = definedExternally
    var main_album: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketEditAlbumParams {
    var owner_id: Number
    var album_id: Number
    var title: String
    var photo_id: Number? get() = definedExternally; set(value) = definedExternally
    var main_album: Boolean? get() = definedExternally; set(value) = definedExternally
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketDeleteAlbumParams {
    var owner_id: Number
    var album_id: Number
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketRemoveFromAlbumParams {
    var owner_id: Number
    var item_id: Number
    var album_ids: Array<Number>
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}
external interface MarketAddToAlbumParams {
    var owner_id: Number
    var item_id: Number
    var album_ids: Array<Number>
    var access_token: String? get() = definedExternally; set(value) = definedExternally
}

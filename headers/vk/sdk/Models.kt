@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package vk.sdk

typealias BaseOkResponse = Number

external interface AccountAccountCounters {
    var friends: Number
    var messages: Number
    var photos: Number
    var videos: Number
    var gifts: Number
    var events: Number
    var groups: Number
    var notifications: Number
    var app_requests: Number
    var friends_suggestions: Number
}
external interface AccountLookupResult {
    var found: Array<AccountUserXtrContact>
    var other: Array<AccountOtherContact>
}
external interface AccountNameRequest {
    var id: Number
    var status: String
    var first_name: String
    var last_name: String
}
external interface AccountOffer {
    var id: Number
    var title: String
    var instruction: String
    var instruction_html: String
    var short_description: String
    var description: String
    var img: String
    var tag: String
    var price: Number
}
external interface AccountOtherContact {
    var contact: String
    var common_count: Number
}
external interface AccountPushConversations {
    var count: Number
    var items: Array<AccountPushConversationsItem>
}
external interface AccountPushConversationsItem {
    var peer_id: Number
    var sound: Number
    var disabled_until: Number
}
external interface AccountPushParams {
    var msg: Array<String>
    var chat: Array<String>
    var friend: Array<String>
    var friend_found: Array<String>
    var friend_accepted: Array<String>
    var reply: Array<String>
    var comment: Array<String>
    var mention: Array<String>
    var like: Array<String>
    var repost: Array<String>
    var wall_post: Array<String>
    var wall_publish: Array<String>
    var group_invite: Array<String>
    var group_accepted: Array<String>
    var event_soon: Array<String>
    var photos_tag: Array<String>
    var app_request: Array<String>
    var sdk_open: Array<String>
    var new_post: Array<String>
    var birthday: Array<String>
}
external interface AccountPushSettings {
    var disabled: Number
    var disabled_until: Number
    var conversations: AccountPushConversations
    var settings: AccountPushParams
}
external interface AccountUserSettings {
    var first_name: String
    var last_name: String
    var maiden_name: String
    var screen_name: String
    var sex: Number
    var relation: Number
    var relation_partner: UsersUserMin
    var relation_pending: Number
    var relation_requests: Array<UsersUserMin>
    var bdate: String
    var bdate_visibility: Number
    var home_town: String
    var country: BaseCountry
    var city: BaseObject
    var status: String
    var phone: String
    var name_request: AccountNameRequest
}
external interface AccountUserXtrContact {
    var id: Number
    var first_name: String
    var last_name: String
    var deactivated: String
    var hidden: Number
    var sex: Number
    var screen_name: String
    var photo_50: String
    var photo_100: String
    var online: Number
    var online_mobile: Number
    var online_app: Number
    var nickname: String
    var maiden_name: String
    var domain: String
    var bdate: String
    var city: BaseObject
    var country: BaseCountry
    var timezone: Number
    var photo_200: String
    var photo_max: String
    var photo_200_orig: String
    var photo_400_orig: String
    var photo_max_orig: String
    var photo_id: String
    var has_photo: Number
    var trending: Number
    var has_mobile: Number
    var is_friend: Number
    var friend_status: Number
    var wall_comments: Number
    var can_post: Number
    var can_see_all_posts: Number
    var can_see_audio: Number
    var can_write_private_message: Number
    var can_send_friend_request: Number
    var mobile_phone: String
    var home_phone: String
    var skype: String
    var facebook: String
    var facebook_name: String
    var twitter: String
    var livejournal: String
    var instagram: String
    var site: String
    var status_audio: AudioAudioFull
    var status: String
    var activity: String
    var last_seen: UsersLastSeen
    var exports: UsersExports
    var crop_photo: UsersCropPhoto
    var verified: Number
    var followers_count: Number
    var blacklisted: Number
    var blacklisted_by_me: Number
    var is_favorite: Number
    var is_hidden_from_feed: Number
    var common_count: Number
    var occupation: UsersOccupation
    var career: Array<UsersCareer>
    var military: Array<UsersMilitary>
    var university: Number
    var university_name: String
    var faculty: Number
    var faculty_name: String
    var graduation: Number
    var education_form: String
    var education_status: String
    var home_town: String
    var relation: Number
    var relation_partner: UsersUserMin
    var personal: UsersPersonal
    var interests: String
    var music: String
    var activities: String
    var movies: String
    var tv: String
    var books: String
    var games: String
    var universities: Array<UsersUniversity>
    var schools: Array<UsersSchool>
    var about: String
    var relatives: Array<UsersRelative>
    var quotes: String
    var contact: String
    var request_sent: Number
    var sort_num: Number
}
external interface AccountInfo {
    var country: String
    var https_required: Number
    var own_posts_default: Number
    var no_wall_replies: Number
    var intro: Number
    var lang: Number
    var twoFaRequired: Number
}
external interface AdsAccesses {
    var client_id: String
    var role: String
}
external interface AdsAccount {
    var account_id: Number
    var account_type: String
    var account_status: Number
    var access_role: String
}
external interface AdsAd {
    var id: Number
    var campaign_id: Number
    var ad_format: Number
    var cost_type: Number
    var cpc: Number
    var cpm: Number
    var impressions_limit: Number
    var impressions_limited: Number
    var ad_platform: Any
    var all_limit: Number
    var category1_id: Number
    var category2_id: Number
    var status: Number
    var name: String
    var approved: Number
    var video: Number
    var disclaimer_medical: Number
    var disclaimer_specialist: Number
    var disclaimer_supplements: Number
}
external interface AdsAdLayout {
    var id: Number
    var campaign_id: Number
    var ad_format: Number
    var cost_type: Number
    var video: Number
    var title: String
    var description: String
    var link_url: String
    var link_domain: String
    var preview_link: Any
    var image_src: Number
    var image_src_2x: Number
}
external interface AdsCampaign {
    var id: Number
    var type: String
    var name: String
    var status: Number
    var day_limit: String
    var all_limit: String
    var start_time: Number
    var stop_time: Number
}
external interface AdsCategory {
    var id: Number
    var name: String
    var subcategories: Array<BaseObjectWithName>
}
external interface AdsClient {
    var id: Number
    var name: String
    var day_limit: String
    var all_limit: String
}
external interface AdsCriteria {
    var sex: Number
    var age_from: Number
    var age_to: Number
    var birthday: Number
    var country: Number
    var cities: String
    var cities_not: String
    var statuses: String
    var groups: String
    var apps: String
    var apps_not: String
    var districts: String
    var stations: String
    var streets: String
    var schools: String
    var positions: String
    var religions: String
    var interests: String
    var interest_categories: String
    var user_devices: String
    var user_os: String
    var user_browsers: String
    var retargeting_groups: String
    var retargeting_groups_not: String
    var paying: Number
    var travellers: Number
    var school_from: Number
    var school_to: Number
    var uni_from: Number
    var uni_to: Number
}
external interface AdsDemoStats {
    var id: Number
    var type: String
    var stats: AdsDemostatsFormat
}
external interface AdsDemostatsFormat {
    var day: String
    var month: String
    var overall: Number
    var sex: Array<AdsStatsSex>
    var age: Array<AdsStatsAge>
    var sex_age: Array<AdsStatsSexAge>
    var cities: Array<AdsStatsCities>
}
external interface AdsFloodStats {
    var left: Number
    var refresh: Number
}
external interface AdsLinkStatus {
    var status: String
    var description: String
    var redirect_url: String
}
external interface AdsParagraphs {
    var paragraph: String
}
external interface AdsRejectReason {
    var comment: String
    var rules: Array<AdsRules>
}
external interface AdsRules {
    var title: String
    var paragraphs: Array<AdsParagraphs>
}
external interface AdsStats {
    var id: Number
    var type: String
    var stats: AdsStatsFormat
}
external interface AdsStatsFormat {
    var day: String
    var month: String
    var overall: Number
    var spent: Number
    var impressions: Number
    var clicks: Number
    var reach: Number
    var video_views: Number
    var video_views_half: Number
    var video_views_full: Number
    var video_clicks_site: Number
    var join_rate: Number
}
external interface AdsStatsAge {
    var impressions_rate: Number
    var clicks_rate: Number
    var value: String
}
external interface AdsStatsCities {
    var impressions_rate: Number
    var clicks_rate: Number
    var value: Number
    var name: String
}
external interface AdsStatsSex {
    var impressions_rate: Number
    var clicks_rate: Number
    var value: String
}
external interface AdsStatsSexAge {
    var impressions_rate: Number
    var clicks_rate: Number
    var value: String
}
external interface AdsTargStats {
    var audience_count: Number
    var recommended_cpc: Number
    var recommended_cpm: Number
}
external interface AdsTargSuggestions {
    var id: Number
    var name: String
}
external interface AdsTargSuggestionsRegions {
    var id: Number
    var name: String
    var type: String
}
external interface AdsTargSuggestionsCities {
    var id: Number
    var name: String
    var parent: String
}
external interface AdsTargSuggestionsSchools {
    var id: Number
    var name: String
    var desc: String
    var type: String
    var parent: String
}
external interface AdsTargSettings {
    var id: Number
    var campaign_id: Number
    var sex: Number
    var age_from: Number
    var age_to: Number
    var birthday: Number
    var country: Number
    var cities: String
    var cities_not: String
    var statuses: String
    var groups: String
    var apps: String
    var apps_not: String
    var districts: String
    var stations: String
    var streets: String
    var schools: String
    var positions: String
    var religions: String
    var interests: String
    var interest_categories: String
    var user_devices: String
    var user_os: String
    var user_browsers: String
    var retargeting_groups: String
    var retargeting_groups_not: String
    var paying: Number
    var travellers: Number
    var school_from: Number
    var school_to: Number
    var uni_from: Number
    var uni_to: Number
}
external interface AdsTargetGroup {
    var id: Number
    var name: String
    var domain: String
    var audience_count: Number
    var lifetime: Number
    var pixel: String
}
external interface AdsUsers {
    var user_id: Number
    var accesses: Array<AdsAccesses>
}
external interface AdsPostStats {
    var ad_id: Number
    var reach_subscribers: Number
    var reach_total: Number
    var links: Number
    var to_group: Number
    var join_group: Number
    var report: Number
    var hide: Number
    var unsubscribe: Number
}
external interface AppsApp {
    var id: Number
    var title: String
    var screen_name: String
    var description: String
    var icon_278: String
    var icon_150: String
    var icon_139: String
    var icon_75: String
    var banner_560: String
    var banner_1120: String
    var type: String
    var section: String
    var author_url: String
    var author_id: Number
    var author_group: Number
    var members_count: Number
    var published_date: Number
    var catalog_position: Number
    var screenshots: Array<PhotosPhoto>
    var international: Number
    var leaderboard_type: Number
    var genre_id: Number
    var genre: String
    var platform_id: Number
    var is_in_catalog: Number
}
external interface AppsLeaderboard {
    var score: Number
    var level: Number
    var points: Number
    var user_id: Number
}
external interface AudioAudio {
    var id: Number
    var owner_id: Number
    var artist: String
    var title: String
    var url: String
    var access_key: String
}
external interface AudioAudioFull {
    var id: Number
    var owner_id: Number
    var artist: String
    var title: String
    var url: String
    var access_key: String
    var duration: Number
    var date: Number
    var album_id: Number
    var lyrics_id: Number
    var genre_id: Number
    var no_search: Number
    var is_hq: Number
}
external interface AudioLyrics {
    var lyrics_id: Number
    var text: String
}
external interface AudioAudioUploadResponse {
    var redirect: String
    var server: Number
    var audio: String
    var hash: String
}
typealias BaseBoolInt = Number
external interface BaseCommentsInfo {
    var count: Number
    var can_post: Number
    var groups_can_post: Number
}
external interface BaseCountry {
    var id: Number
    var title: String
}
external interface BaseError {
    var error_code: Number
    var error_msg: String
    var request_params: Array<BaseRequestParam>
}
external interface BaseRequestParam {
    var key: String
    var value: String
}
external interface BaseGeo {
    var type: String
    var coordinates: String
    var place: BasePlace
    var showmap: Number
}
external interface BaseLikesInfo {
    var count: Number
    var user_likes: Number
    var can_like: Number
    var can_publish: Number
}
external interface BaseLikes {
    var user_likes: Number
    var count: Number
}
external interface BaseLink {
    var url: String
    var title: String
    var caption: String
    var description: String
    var photo: PhotosPhoto?
    var preview_url: String
    var preview_page: String
    var button: BaseLinkButton
    var product: BaseLinkProduct
    var rating: BaseLinkRating
    var application: BaseLinkApplication
}
external interface BaseLinkButton {
    var title: String
    var action: BaseLinkButtonAction
}
external interface BaseLinkButtonAction {
    var type: String
    var url: String
}
external interface BaseLinkProduct {
    var price: MarketPrice
}
external interface BaseLinkApplication {
    var app_id: Number
    var store: BaseLinkApplicationStore
}
external interface BaseLinkApplicationStore {
    var id: Number
    var name: String
}
external interface BaseLinkRating {
    var stars: Number
    var reviews_count: Number
}
external interface BaseObject {
    var id: Number
    var title: String
}
external interface BaseObjectWithName {
    var id: Number
    var name: String
}
external interface BaseObjectCount {
    var count: Number
}
external interface BasePlace {
    var id: Number
    var title: String
    var latitude: Number
    var longitude: Number
    var created: Number
    var icon: String
    var checkins: Number
    var type: String
    var country: String
    var city: String
    var address: String
}
external interface BaseRepostsInfo {
    var count: Number
    var user_reposted: Number
}
external interface BaseSticker {
    var id: Number
    var product_id: Number
    var photo_64: String
    var photo_128: String
    var photo_256: String
    var photo_352: String
    var width: Number
    var height: Number
}
external interface BaseUserId {
    var user_id: Number
}
typealias BoardDefaultOrder = Number
external interface BoardTopicPoll {
    var poll_id: Number
    var owner_id: Number
    var created: Number
    var is_closed: Number
    var question: String
    var votes: String
    var answer_id: Number
    var answers: Array<PollsAnswer>
}
external interface BoardTopic {
    var id: Number
    var title: String
    var created: Number
    var created_by: Number
    var updated: Number
    var updated_by: Number
    var is_closed: Number
    var is_fixed: Number
    var comments: Number
}
external interface BoardTopicComment {
    var id: Number
    var from_id: Number
    var date: Number
    var text: String
    var attachments: Array<WallCommentAttachment>
    var real_offset: Number
}
external interface BaseImage {
    var url: String
    var width: Number
    var height: Number
}
external interface DatabaseCity {
    var id: Number
    var title: String
    var area: String
    var region: String
    var important: Number
}
external interface DatabaseFaculty {
    var id: Number
    var title: String
}
external interface DatabaseRegion {
    var id: Number
    var title: String
}
external interface DatabaseSchool {
    var id: Number
    var title: String
}
external interface DatabaseStreet {
    var id: Number
    var title: String
}
external interface DatabaseUniversity {
    var id: Number
    var title: String
}
external interface DocsDoc {
    var id: Number
    var owner_id: Number
    var title: String
    var size: Number
    var ext: String
    var url: String
    var date: Number
    var type: Number
    var preview: DocsDocPreview
    var access_key: String
}
external interface DocsDocTypes {
    var id: Number
    var title: String
    var count: Number
}
external interface DocsDocUploadResponse {
    var file: String
}
external interface DocsDocPreview {
    var photo: DocsDocPreviewPhoto
    var video: DocsDocPreviewVideo
}
external interface DocsDocPreviewPhoto {
    var sizes: Array<PhotosPhotoSizes>
}
external interface DocsDocPreviewVideo {
    var src: String
    var width: Number
    var height: Number
    var filesize: Number
}
external interface FaveFavesLink {
    var id: Number
    var url: String
    var title: String
    var description: String
    var photo_50: String
    var photo_100: String
    var photo_200: String
}
external interface FriendsFriendsList {
    var name: String
    var id: Number
}
external interface FriendsRequests {
    var user_id: Number
    var from: String
    var mutual: FriendsRequestsMutual
}
external interface FriendsRequestsMutual {
    var count: Number
    var users: Array<Number>
}
external interface FriendsRequestsXtrMessage {
    var user_id: Number
    var from: String
    var mutual: FriendsRequestsMutual
    var message: String
}
external interface FriendsMutualFriend {
    var id: Number
    var common_count: Number
    var common_friends: Array<Number>
}
external interface FriendsFriendStatus {
    var user_id: Number
    var friend_status: Number
    var request_message: String
    var read_state: Number
    var sign: String
}
external interface FriendsUserXtrLists {
    var id: Number
    var first_name: String
    var last_name: String
    var deactivated: String
    var hidden: Number
    var sex: Number
    var screen_name: String
    var photo_50: String
    var photo_100: String
    var online: Number
    var online_mobile: Number
    var online_app: Number
    var nickname: String
    var maiden_name: String
    var domain: String
    var bdate: String
    var city: BaseObject
    var country: BaseCountry
    var timezone: Number
    var photo_200: String
    var photo_max: String
    var photo_200_orig: String
    var photo_400_orig: String
    var photo_max_orig: String
    var photo_id: String
    var has_photo: Number
    var trending: Number
    var has_mobile: Number
    var is_friend: Number
    var friend_status: Number
    var wall_comments: Number
    var can_post: Number
    var can_see_all_posts: Number
    var can_see_audio: Number
    var can_write_private_message: Number
    var can_send_friend_request: Number
    var mobile_phone: String
    var home_phone: String
    var skype: String
    var facebook: String
    var facebook_name: String
    var twitter: String
    var livejournal: String
    var instagram: String
    var site: String
    var status_audio: AudioAudioFull
    var status: String
    var activity: String
    var last_seen: UsersLastSeen
    var exports: UsersExports
    var crop_photo: UsersCropPhoto
    var verified: Number
    var followers_count: Number
    var blacklisted: Number
    var blacklisted_by_me: Number
    var is_favorite: Number
    var is_hidden_from_feed: Number
    var common_count: Number
    var occupation: UsersOccupation
    var career: Array<UsersCareer>
    var military: Array<UsersMilitary>
    var university: Number
    var university_name: String
    var faculty: Number
    var faculty_name: String
    var graduation: Number
    var education_form: String
    var education_status: String
    var home_town: String
    var relation: Number
    var relation_partner: UsersUserMin
    var personal: UsersPersonal
    var interests: String
    var music: String
    var activities: String
    var movies: String
    var tv: String
    var books: String
    var games: String
    var universities: Array<UsersUniversity>
    var schools: Array<UsersSchool>
    var about: String
    var relatives: Array<UsersRelative>
    var quotes: String
    var lists: Array<Number>
}
external interface FriendsUserXtrPhone {
    var id: Number
    var first_name: String
    var last_name: String
    var deactivated: String
    var hidden: Number
    var sex: Number
    var screen_name: String
    var photo_50: String
    var photo_100: String
    var online: Number
    var online_mobile: Number
    var online_app: Number
    var nickname: String
    var maiden_name: String
    var domain: String
    var bdate: String
    var city: BaseObject
    var country: BaseCountry
    var timezone: Number
    var photo_200: String
    var photo_max: String
    var photo_200_orig: String
    var photo_400_orig: String
    var photo_max_orig: String
    var photo_id: String
    var has_photo: Number
    var trending: Number
    var has_mobile: Number
    var is_friend: Number
    var friend_status: Number
    var wall_comments: Number
    var can_post: Number
    var can_see_all_posts: Number
    var can_see_audio: Number
    var can_write_private_message: Number
    var can_send_friend_request: Number
    var mobile_phone: String
    var home_phone: String
    var skype: String
    var facebook: String
    var facebook_name: String
    var twitter: String
    var livejournal: String
    var instagram: String
    var site: String
    var status_audio: AudioAudioFull
    var status: String
    var activity: String
    var last_seen: UsersLastSeen
    var exports: UsersExports
    var crop_photo: UsersCropPhoto
    var verified: Number
    var followers_count: Number
    var blacklisted: Number
    var blacklisted_by_me: Number
    var is_favorite: Number
    var is_hidden_from_feed: Number
    var common_count: Number
    var occupation: UsersOccupation
    var career: Array<UsersCareer>
    var military: Array<UsersMilitary>
    var university: Number
    var university_name: String
    var faculty: Number
    var faculty_name: String
    var graduation: Number
    var education_form: String
    var education_status: String
    var home_town: String
    var relation: Number
    var relation_partner: UsersUserMin
    var personal: UsersPersonal
    var interests: String
    var music: String
    var activities: String
    var movies: String
    var tv: String
    var books: String
    var games: String
    var universities: Array<UsersUniversity>
    var schools: Array<UsersSchool>
    var about: String
    var relatives: Array<UsersRelative>
    var quotes: String
    var phone: String
}
external interface GiftsLayout {
    var id: Number
    var thumb_256: String
    var thumb_96: String
    var thumb_48: String
}
external interface GiftsGift {
    var id: Number
    var from_id: Number
    var message: String
    var date: Number
    var gift: GiftsLayout
    var privacy: Number
    var gift_hash: String
}
external interface GroupsBanInfo {
    var admin_id: Number
    var date: Number
    var reason: Number
    var comment: String
    var end_date: Number
}
external interface GroupsGroupsArray {
    var count: Number
    var items: Array<Number>
}
external interface GroupsGroupCategory {
    var id: Number
    var name: String
    var subcategories: Array<BaseObjectWithName>
}
external interface GroupsGroupCategoryFull {
    var id: Number
    var name: String
    var subcategories: Array<GroupsGroupCategory>
    var page_count: Number
    var page_previews: Array<GroupsGroup>
}
external interface GroupsContactsItem {
    var user_id: Number
    var desc: String
    var email: String
    var phone: String
}
external interface GroupsCountersGroup {
    var photos: Number
    var albums: Number
    var topics: Number
    var videos: Number
    var audios: Number
    var docs: Number
    var market: Number
}
external interface GroupsCover {
    var enabled: Number
    var images: Array<BaseImage>
}
external interface GroupsGroupBanInfo {
    var end_date: Number
    var comment: String
}
external interface GroupsGroup {
    var id: Number
    var name: String
    var screen_name: String
    var deactivated: String
    var is_closed: Number
    var type: String
    var is_admin: Number
    var admin_level: Number
    var is_member: Number
    var photo_50: String
    var photo_100: String
    var photo_200: String
}
external interface GroupsGroupFull {
    var id: Number
    var name: String
    var screen_name: String
    var deactivated: String
    var is_closed: Number
    var type: String
    var is_admin: Number
    var admin_level: Number
    var is_member: Number
    var photo_50: String
    var photo_100: String
    var photo_200: String
    var market: GroupsMarketInfo
    var member_status: Number
    var is_favorite: Number
    var is_subscribed: Number
    var city: BaseObject
    var country: BaseCountry
    var verified: Number
    var description: String
    var wiki_page: String
    var members_count: Number
    var counters: GroupsCountersGroup
    var cover: GroupsCover
    var can_post: Number
    var can_see_all_posts: Number
    var activity: String
    var fixed_post: Number
    var can_create_topic: Number
    var can_upload_video: Number
    var has_photo: Number
    var status: String
    var main_album_id: Number
    var links: Array<GroupsLinksItem>
    var contacts: Array<GroupsContactsItem>
    var site: String
    var main_section: Number
    var trending: Number
    var can_message: Number
    var is_messages_allowed: Number
    var start_date: Number
    var finish_date: Number
    var age_limits: Number
    var ban_info: GroupsGroupBanInfo
}
external interface GroupsGroupXtrInvitedBy {
    var id: String
    var name: String
    var screen_name: String
    var is_closed: Number
    var type: String
    var is_admin: Number
    var admin_level: Number
    var is_member: Number
    var photo_50: String
    var photo_100: String
    var photo_200: String
    var invited_by: Number
}
external interface GroupsGroupLink {
    var id: Number
    var url: String
    var edit_title: Number
    var desc: String
    var image_processing: Number
}
external interface GroupsLinksItem {
    var id: Number
    var url: String
    var edit_title: Number
    var name: String
    var desc: String
    var photo_50: String
    var photo_100: String
}
external interface GroupsMarketInfo {
    var enabled: Number
    var price_min: Number
    var price_max: Number
    var main_album_id: Number
    var contact_id: Number
    var currency: MarketCurrency
    var currency_text: String
}
external interface GroupsMemberRole {
    var id: Number
    var role: String
}
external interface GroupsMemberStatus {
    var member: Number
    var user_id: Number
}
external interface GroupsMemberStatusFull {
    var member: Number
    var user_id: Number
    var invitation: Number
    var request: Number
}
external interface GroupsGroupCategoryType {
    var id: Number
    var name: String
}
external interface GroupsGroupPublicCategoryList {
    var id: Number
    var name: String
    var subtypes_list: Array<GroupsGroupCategoryType>
}
external interface GroupsGroupSettings {
    var title: String
    var description: String
    var address: String
    var place: PlacesPlaceMin
    var wall: Number
    var photos: Number
    var video: Number
    var audio: Number
    var docs: Number
    var topics: Number
    var wiki: Number
    var obscene_filter: Number
    var public_category: Number
    var public_subcategory: Number
    var public_category_list: Array<GroupsGroupPublicCategoryList>
    var obscene_stopwords: Number
    var obscene_words: String
    var access: Number
    var subject: Number
    var subject_list: Array<GroupsSubjectItem>
    var rss: String
    var website: String
}
external interface GroupsSubjectItem {
    var id: Number
    var name: String
}
external interface GroupsOwnerXtrBanInfo {
    var type: String
    var group: GroupsGroup
    var profile: UsersUser
    var ban_info: GroupsBanInfo
}
external interface GroupsUserXtrRole {
    var id: Number
    var first_name: String
    var last_name: String
    var deactivated: String
    var hidden: Number
    var sex: Number
    var screen_name: String
    var photo_50: String
    var photo_100: String
    var online: Number
    var online_mobile: Number
    var online_app: Number
    var nickname: String
    var maiden_name: String
    var domain: String
    var bdate: String
    var city: BaseObject
    var country: BaseCountry
    var timezone: Number
    var photo_200: String
    var photo_max: String
    var photo_200_orig: String
    var photo_400_orig: String
    var photo_max_orig: String
    var photo_id: String
    var has_photo: Number
    var trending: Number
    var has_mobile: Number
    var is_friend: Number
    var friend_status: Number
    var wall_comments: Number
    var can_post: Number
    var can_see_all_posts: Number
    var can_see_audio: Number
    var can_write_private_message: Number
    var can_send_friend_request: Number
    var mobile_phone: String
    var home_phone: String
    var skype: String
    var facebook: String
    var facebook_name: String
    var twitter: String
    var livejournal: String
    var instagram: String
    var site: String
    var status_audio: AudioAudioFull
    var status: String
    var activity: String
    var last_seen: UsersLastSeen
    var exports: UsersExports
    var crop_photo: UsersCropPhoto
    var verified: Number
    var followers_count: Number
    var blacklisted: Number
    var blacklisted_by_me: Number
    var is_favorite: Number
    var is_hidden_from_feed: Number
    var common_count: Number
    var occupation: UsersOccupation
    var career: Array<UsersCareer>
    var military: Array<UsersMilitary>
    var university: Number
    var university_name: String
    var faculty: Number
    var faculty_name: String
    var graduation: Number
    var education_form: String
    var education_status: String
    var home_town: String
    var relation: Number
    var relation_partner: UsersUserMin
    var personal: UsersPersonal
    var interests: String
    var music: String
    var activities: String
    var movies: String
    var tv: String
    var books: String
    var games: String
    var universities: Array<UsersUniversity>
    var schools: Array<UsersSchool>
    var about: String
    var relatives: Array<UsersRelative>
    var quotes: String
    var role: String
}
external interface GroupsTokenPermissionSetting {
    var setting: Number
    var name: String
}
external interface GroupsTokenPermissions {
    var mask: Number
    var permissions: Array<GroupsTokenPermissionSetting>
}
external interface GroupsLongPollServer {
    var key: String
    var server: String
    var ts: Number
}
external interface GroupsLongPollSettings {
    var is_enabled: Boolean
    var events: GroupsLongPollEvents
}
external interface GroupsLongPollEvents {
    var message_new: Number
    var message_reply: Number
    var photo_new: Number
    var audio_new: Number
    var video_new: Number
    var wall_reply_new: Number
    var wall_reply_edit: Number
    var wall_reply_delete: Number
    var wall_reply_restore: Number
    var wall_post_new: Number
    var board_post_new: Number
    var board_post_edit: Number
    var board_post_restore: Number
    var board_post_delete: Number
    var photo_comment_new: Number
    var photo_comment_edit: Number
    var photo_comment_delete: Number
    var photo_comment_restore: Number
    var video_comment_new: Number
    var video_comment_edit: Number
    var video_comment_delete: Number
    var video_comment_restore: Number
    var market_comment_new: Number
    var market_comment_edit: Number
    var market_comment_delete: Number
    var market_comment_restore: Number
    var poll_vote_new: Number
    var group_join: Number
    var group_leave: Number
    var group_change_settings: Number
    var group_change_photo: Number
    var group_officers_edit: Number
    var message_allow: Number
    var message_deny: Number
    var wall_repost: Number
    var user_block: Number
    var user_unblock: Number
    var messages_edit: Number
}
external interface LeadsLead {
    var limit: Number
    var spent: Number
    var cost: Number
    var impressions: Number
    var started: Number
    var completed: Number
    var days: LeadsLeadDays
}
external interface LeadsLeadDays {
    var impressions: Number
    var started: Number
    var completed: Number
    var spent: Number
}
external interface LeadsStart {
    var test_mode: Number
    var vk_sid: String
}
external interface LeadsChecked {
    var result: String
    var reason: String
    var start_link: String
    var sid: String
}
external interface LeadsComplete {
    var limit: Number
    var spent: Number
    var cost: Number
    var test_mode: Number
    var success: Number
}
external interface LeadsEntry {
    var uid: Number
    var aid: Number
    var sid: String
    var date: Number
    var status: Number
    var test_mode: Number
    var start_date: Number
    var comment: String
}
external interface MarketMarketAlbum {
    var id: Number
    var owner_id: Number
    var title: String
    var count: Number
    var updated_time: Number
    var photo: PhotosPhoto
}
external interface MarketMarketCategory {
    var id: Number
    var name: String
    var section: MarketSection
}
external interface MarketCurrency {
    var id: Number
    var name: String
}
external interface MarketMarketItem {
    var id: Number
    var owner_id: Number
    var title: String
    var description: String
    var price: MarketPrice
    var category: MarketMarketCategory
    var date: Number
    var thumb_photo: String
    var availability: Number
}
external interface MarketMarketItemFull {
    var id: Number
    var owner_id: Number
    var title: String
    var description: String
    var price: MarketPrice
    var category: MarketMarketCategory
    var date: Number
    var thumb_photo: String
    var availability: Number
    var photos: Array<PhotosPhoto>
    var can_comment: Number
    var can_repost: Number
    var likes: BaseLikes
    var views_count: Number
}
external interface MarketPrice {
    var amount: String
    var currency: MarketCurrency
    var text: String
}
external interface MarketSection {
    var id: Number
    var name: String
}
external interface MessagesHistoryAttachment {
    var message_id: Number
    var attachment: MessagesHistoryMessageAttachment
}
external interface MessagesHistoryMessageAttachment {
    var type: String
    var photo: PhotosPhoto
    var video: VideoVideo
    var audio: AudioAudioFull
    var doc: DocsDoc
    var link: BaseLink
    var market: BaseLink
    var wall: BaseLink
    var share: BaseLink
}
external interface MessagesMessageAttachment {
    var photo: PhotosPhoto
    var audio: AudioAudioFull
    var video: VideoVideo
    var doc: DocsDoc
    var link: BaseLink
    var market: MarketMarketItem
    var market_market_album: MarketMarketAlbum
    var gift: GiftsLayout
    var sticker: BaseSticker
    var wall: WallWallpostAttached
    var wall_reply: WallWallComment
    var type: String
}
external interface MessagesChat {
    var id: Number
    var type: String
    var title: String
    var admin_id: Number
    var users: Array<Number>
    var push_settings: MessagesChatPushSettings
    var photo_50: String
    var photo_100: String
    var photo_200: String
    var left: Number
    var kicked: Number
}
external interface MessagesChatFull {
    var id: Number
    var type: String
    var title: String
    var admin_id: Number
    var users: Array<MessagesUserXtrInvitedBy>
    var push_settings: MessagesChatPushSettings
    var photo_50: String
    var photo_100: String
    var photo_200: String
    var left: Number
    var kicked: Number
}
external interface MessagesChatPushSettings {
    var sound: Number
    var disabled_until: Number
}
external interface MessagesDialog {
    var unread: Number
    var message: MessagesMessage
    var in_read: Number
    var out_read: Number
    var important: Number
    var unanswered: Number
}
external interface MessagesLastActivity {
    var online: Number
    var time: Number
}
external interface MessagesLongpollParams {
    var key: String
    var server: String
    var ts: Number
    var pts: Number
}
external interface MessagesLongpollMessages {
    var count: Number
    var items: Array<MessagesMessage>
}
external interface MessagesMessage {
    var id: Number
    var date: Number
    var out: Number
    var user_id: Number
    var from_id: Number
    var update_time: Number
    var random_id: Number
    var important: Number
    var deleted: Number
    var emoji: Number
    var fwd_messages: Array<MessagesMessage>
    var read_state: Number
    var title: String
    var body: String
    var attachments: Array<MessagesMessageAttachment>
    var chat_id: Number
    var geo: BaseGeo
    var chat_active: Array<Number>
    var push_settings: MessagesChatPushSettings
    var action: String
    var action_mid: Number
    var action_email: String
    var action_text: String
    var users_count: Number
    var admin_id: Number
    var photo_50: String
    var photo_100: String
    var photo_200: String
}
external interface MessagesUserXtrInvitedBy {
    var id: Number
    var first_name: String
    var last_name: String
    var deactivated: String
    var hidden: Number
    var sex: Number
    var screen_name: String
    var photo_50: String
    var photo_100: String
    var online: Number
    var online_mobile: Number
    var online_app: Number
    var type: String
    var invited_by: Number
}
external interface NewsfeedNewsfeedItem {
    var type: String
    var source_id: Number
    var date: Number
}
external interface NewsfeedItemAudio {
    var audio: NewsfeedItemAudioAudio
    var post_id: Number
}
external interface NewsfeedItemAudioAudio {
    var count: Number
    var items: Array<AudioAudioFull>
}
external interface NewsfeedItemFriendFriends {
    var count: Number
    var items: Array<BaseUserId>
}
external interface NewsfeedItemFriend {
    var friends: NewsfeedItemFriendFriends
}
external interface NewsfeedItemNote {
    var notes: NewsfeedItemNoteNotes
}
external interface NewsfeedItemNoteNotes {
    var count: Number
    var items: Array<NewsfeedNewsfeedNote>
}
external interface NewsfeedItemPhoto {
    var photos: NewsfeedItemPhotoPhotos
    var post_id: Number
}
external interface NewsfeedItemPhotoPhotos {
    var count: Number
    var items: Array<NewsfeedNewsfeedPhoto>
}
external interface NewsfeedItemPhotoTag {
    var photo_tags: NewsfeedItemPhotoTagPhotoTags
    var post_id: Number
}
external interface NewsfeedItemPhotoTagPhotoTags {
    var count: Number
    var items: Array<NewsfeedNewsfeedPhoto>
}
external interface NewsfeedItemTopic {
    var post_id: Number
    var text: String
    var comments: BaseCommentsInfo
    var likes: BaseLikesInfo
}
external interface NewsfeedItemVideo {
    var video: NewsfeedItemVideoVideo
}
external interface NewsfeedItemVideoVideo {
    var count: Number
    var items: Array<VideoVideo>
}
external interface NewsfeedItemWallpost {
    var post_id: Number
    var post_type: String
    var text: String
    var copy_history: Array<WallWallpost>
    var attachments: Array<WallWallpostAttachment>
    var geo: BaseGeo
    var post_source: WallPostSource
    var comments: BaseCommentsInfo
    var likes: BaseLikesInfo
    var reposts: BaseRepostsInfo
}
external interface NewsfeedList {
    var id: Number
    var title: String
}
external interface NewsfeedListFull {
    var id: Number
    var title: String
    var no_reposts: Number
    var source_ids: Array<Number>
}
external interface NewsfeedNewsfeedNote {
    var id: Number
    var owner_id: Number
    var title: String
    var comments: Number
}
external interface NewsfeedNewsfeedPhoto {
    var id: Number
    var album_id: Number
    var owner_id: Number
    var user_id: Number
    var images: Array<PhotosImage>
    var post_id: Number
    var width: Number
    var height: Number
    var text: String
    var date: Number
    var lat: Number
    var long: Number
    var access_key: String
    var likes: BaseLikes
    var comments: BaseObjectCount
    var can_comment: Number
    var can_repost: Number
}
external interface NotesNoteComment {
    var id: Number
    var uid: Number
    var nid: Number
    var oid: Number
    var date: Number
    var message: String
    var reply_to: Number
}
external interface NotesNote {
    var id: Number
    var owner_id: Number
    var comments: Number
    var can_comment: Number
    var date: Number
    var title: String
    var text: String
    var text_wiki: String
    var view_url: String
}
external interface NotificationsNotificationsComment {
    var id: Number
    var owner_id: Number
    var date: Number
    var text: String
    var photo: PhotosPhoto
    var video: VideoVideo
    var post: WallWallpost
    var topic: BoardTopic
}
external interface NotificationsNotificationParent {
    var id: Number
    var from_id: Number
    var to_id: Number
    var date: Number
    var post_id: Number
    var post_type: String
    var text: String
    var signer_id: Number
    var attachments: Array<WallWallpostAttachment>
    var geo: BaseGeo
    var post_source: WallPostSource
    var comments: Number
    var likes: BaseLikesInfo
    var reposts: BaseRepostsInfo
    var copy_owner_id: Number
    var copy_post_id: Number
    var album_id: Number
    var owner_id: Number
    var user_id: Number
    var images: Array<PhotosImage>
    var width: Number
    var height: Number
    var lat: Number
    var long: Number
    var access_key: String
    var title: String
    var created: Number
    var created_by: Number
    var updated: Number
    var updated_by: Number
    var is_closed: Number
    var is_fixed: Number
    var duration: Number
    var description: String
    var views: Number
    var photo_130: String
    var photo_320: String
    var photo_800: String
    var adding_date: Number
    var player: String
    var can_edit: Number
    var can_add: Number
    var processing: Number
    var live: Number
    var files: VideoVideoFiles
    var photo: PhotosPhoto
    var video: VideoVideo
    var post: WallWallpost
    var topic: BoardTopic
}
external interface NotificationsNotification {
    var type: String
    var date: Number
    var parent: NotificationsNotificationParent
    var feedback: NotificationsFeedback
    var reply: NotificationsReply
}
external interface NotificationsFeedback {
    var id: Number
    var to_id: Number
    var from_id: Number
    var text: String
    var likes: BaseLikesInfo
    var attachments: Array<WallWallpostAttachment>
    var geo: BaseGeo
}
external interface NotificationsReply {
    var id: Number
    var date: Number
    var text: Number
}
external interface OauthError {
    var error: String
    var error_description: String
    var redirect_uri: String
}
external interface OrdersOrder {
    var id: Number
    var app_order_id: Number
    var status: String
    var user_id: Number
    var receiver_id: Number
    var item: String
    var amount: Number
    var date: Number
    var transaction_id: Number
    var cancel_transaction_id: Number
}
external interface OrdersAmount {
    var amounts: Array<OrdersAmountItem>
    var currency: String
}
external interface OrdersAmountItem {
    var votes: String
    var amount: Number
    var description: String
}
external interface PagesWikipage {
    var id: Number
    var group_id: Number
    var title: String
    var who_can_view: Number
    var who_can_edit: Number
    var views: Number
    var editor_id: Number
    var editor_name: String
    var creator_id: Number
    var creator_name: Number
}
external interface PagesWikipageFull {
    var id: Number
    var group_id: Number
    var title: String
    var current_user_can_edit: Number
    var current_user_can_edit_access: Number
    var who_can_view: Number
    var who_can_edit: Number
    var edited: Number
    var created: Number
    var views: Number
    var editor_id: Number
    var creator_id: Number
    var source: String
    var html: String
    var view_url: String
}
external interface PagesWikipageVersion {
    var id: Number
    var length: Number
    var edited: Number
    var editor_id: Number
    var editor_name: String
}
external interface PhotosPhotoAlbum {
    var id: Number
    var thumb: PhotosPhoto
    var owner_id: Number
    var title: String
    var description: String
    var created: Number
    var updated: Number
    var size: Number
}
external interface PhotosPhotoAlbumFull {
    var id: Number
    var thumb_id: Number
    var thumb_src: String
    var owner_id: Number
    var title: String
    var description: String
    var created: Number
    var updated: Number
    var size: Number
    var privacy_view: Array<String>
    var privacy_comment: Array<String>
    var upload_by_admins_only: Number
    var comments_disabled: Number
    var can_upload: Number
    var thumb_is_last: Number
    var sizes: Array<PhotosPhotoSizes>
}
external interface PhotosCommentXtrPid {
    var id: Number
    var from_id: Number
    var date: Number
    var text: String
    var likes: BaseLikesInfo
    var reply_to_user: Number
    var reply_to_comment: Number
    var attachments: Array<WallCommentAttachment>
    var pid: Number
}
external interface PhotosMarketAlbumUploadResponse {
    var gid: Number
    var server: Number
    var photo: String
    var hash: String
}
external interface PhotosMarketUploadResponse {
    var group_id: Number
    var server: Number
    var photo: String
    var hash: String
    var crop_data: String
    var crop_hash: String
}
external interface PhotosMessageUploadResponse {
    var server: Number
    var photo: String
    var hash: String
}
external interface PhotosOwnerUploadResponse {
    var server: Number
    var photo: String
    var hash: String
}
external interface PhotosImage {
    var type: String
    var url: String
    var width: Number
    var height: Number
}
external interface PhotosPhoto {
    var id: Number
    var album_id: Number
    var owner_id: Number
    var user_id: Number
    var photo_604: String?
    var images: Array<PhotosImage>
    var post_id: Number
    var width: Number
    var height: Number
    var text: String
    var date: Number
    var lat: Number
    var long: Number
    var sizes: Array<PhotosPhotoSizes>
    var access_key: String?
}
external interface PhotosPhotoFull {
    var id: Number
    var album_id: Number
    var owner_id: Number
    var user_id: Number
    var images: Array<PhotosImage>
    var post_id: Number
    var width: Number
    var height: Number
    var text: String
    var date: Number
    var lat: Number
    var long: Number
    var access_key: String
    var likes: BaseLikes
    var reposts: BaseObjectCount
    var comments: BaseObjectCount
    var can_comment: Number
    var tags: BaseObjectCount
}
external interface PhotosPhotoFullXtrRealOffset {
    var id: Number
    var album_id: Number
    var owner_id: Number
    var user_id: Number
    var sizes: Array<PhotosPhotoSizes>
    var photo_75: String
    var photo_130: String
    var photo_604: String
    var photo_807: String
    var photo_1280: String
    var photo_2560: String
    var post_id: Number
    var width: Number
    var height: Number
    var text: String
    var date: Number
    var lat: Number
    var long: Number
    var access_key: String
    var likes: BaseLikes
    var reposts: BaseObjectCount
    var comments: BaseObjectCount
    var can_comment: Number
    var tags: BaseObjectCount
    var hidden: Number
    var real_offset: Number
}
external interface PhotosPhotoXtrRealOffset {
    var id: Number
    var album_id: Number
    var owner_id: Number
    var user_id: Number
    var sizes: Array<PhotosPhotoSizes>
    var photo_75: String
    var photo_130: String
    var photo_604: String
    var photo_807: String
    var photo_1280: String
    var photo_2560: String
    var post_id: Number
    var width: Number
    var height: Number
    var text: String
    var date: Number
    var lat: Number
    var long: Number
    var access_key: String
    var hidden: Number
    var real_offset: Number
}
external interface PhotosPhotoXtrTagInfo {
    var id: Number
    var album_id: Number
    var owner_id: Number
    var user_id: Number
    var sizes: Array<PhotosPhotoSizes>
    var photo_75: String
    var photo_130: String
    var photo_604: String
    var photo_807: String
    var photo_1280: String
    var photo_2560: String
    var post_id: Number
    var width: Number
    var height: Number
    var text: String
    var date: Number
    var lat: Number
    var long: Number
    var access_key: String
    var placer_id: Number
    var tag_created: Number
    var tag_id: Number
}
external interface PhotosPhotoSizes {
    var src: String
    var width: Number
    var height: Number
    var type: String
}
external interface PhotosPhotoTag {
    var user_id: Number
    var id: Number
    var placer_id: Number
    var tagged_name: String
    var date: Number
    var x: Number
    var y: Number
    var x2: Number
    var y2: Number
    var viewed: Number
}
external interface PhotosPhotoUpload {
    var upload_url: String
    var album_id: Number
    var user_id: Number
}
external interface PhotosPhotoUploadResponse {
    var server: Number
    var photos_list: String
    var aid: Number
    var hash: String
}
external interface PhotosWallUploadResponse {
    var server: Number
    var photo: String
    var hash: String
}
external interface PlacesCheckin {
    var id: Number
    var user_id: Number
    var date: Number
    var latitude: Number
    var longitude: Number
    var place_id: Number
    var text: String
    var distance: Number
    var place_title: String
    var place_country: Number
    var place_city: Number
    var place_type: String
    var place_icon: String
}
external interface PlacesPlaceMin {
    var id: Number
    var title: String
    var latitude: Number
    var longitude: Number
    var created: Number
    var icon: String
    var checkins: Number
    var type: String
    var country: Number
    var city: Number
    var address: String
}
external interface PlacesPlaceFull {
    var id: Number
    var title: String
    var latitude: Number
    var longitude: Number
    var created: Number
    var icon: String
    var checkins: Number
    var type: String
    var country: Number
    var city: Number
    var address: String
    var distance: Number
    var group_id: Number
    var group_photo: String
}
external interface PlacesTypes {
    var id: Number
    var title: String
    var icon: String
}
external interface PollsAnswer {
    var id: Number
    var text: String
    var votes: Number
    var rate: Number
}
external interface PollsPoll {
    var id: Number
    var owner_id: Number
    var created: Number
    var question: String
    var votes: String
    var answer_id: Number
    var answers: Array<PollsAnswer>
    var anonymous: Number
}
external interface PollsVoters {
    var answer_id: Number
    var users: PollsVotersUsers
}
external interface PollsVotersUsers {
    var count: Number
    var items: Array<Number>
}
external interface SearchHint {
    var type: String
    var section: String
    var description: String
    var global: Number
    var group: GroupsGroup
    var profile: UsersUserMin
}
external interface SecureLevel {
    var uid: Number
    var level: Number
}
external interface SecureSmsNotification {
    var id: Number
    var app_id: Number
    var user_id: Number
    var date: Number
    var message: String
}
external interface SecureTokenChecked {
    var success: Number
    var user_id: Number
    var date: Number
    var expire: Number
}
external interface SecureTransaction {
    var id: Number
    var uid_from: Number
    var uid_to: Number
    var votes: Number
    var date: Number
}
external interface StatsPeriod {
    var day: String
    var visitors: Number
    var views: Number
    var reach: Number
    var reach_subscribers: Number
    var sex: Array<StatsSexAge>
    var age: Array<StatsSexAge>
    var sex_age: Array<StatsSexAge>
    var countries: Array<StatsCountry>
    var cities: Array<StatsCity>
}
external interface StatsViews {
    var views: Number
    var visitors: Number
    var mobile_views: Number
    var sex: Array<StatsSexAge>
    var age: Array<StatsSexAge>
    var sex_age: Array<StatsSexAge>
    var countries: Array<StatsCountry>
    var cities: Array<StatsCity>
}
external interface StatsReach {
    var reach: Number
    var reach_subscribers: Number
    var mobile_views: Number
    var sex: Array<StatsSexAge>
    var age: Array<StatsSexAge>
    var sex_age: Array<StatsSexAge>
    var countries: Array<StatsCountry>
    var cities: Array<StatsCity>
}
external interface StatsActivity {
    var likes: Number
    var comments: Number
    var copies: Number
    var subscribed: Number
    var unsubscribed: Number
    var hidden: Number
}
external interface StatsSexAge {
    var visitors: Number
    var value: String
}
external interface StatsCountry {
    var visitors: Number
    var value: Number
    var code: String
    var name: String
}
external interface StatsCity {
    var visitors: Number
    var value: Number
    var name: String
}
external interface StatsWallpostStat {
    var reach_subscribers: Number
    var reach_total: Number
    var links: Number
    var to_group: Number
    var join_group: Number
    var report: Number
    var hide: Number
    var unsubscribe: Number
}
external interface StatusStatus {
    var text: String
    var audio: AudioAudioFull
}
external interface StoriesStoryStatsStat {
    var state: String
    var count: Number
}
external interface StoriesStoryStats {
    var views: StoriesStoryStatsStat
    var replies: StoriesStoryStatsStat
    var answer: StoriesStoryStatsStat
    var shares: StoriesStoryStatsStat
    var subscribers: StoriesStoryStatsStat
    var bans: StoriesStoryStatsStat
    var open_link: StoriesStoryStatsStat
}
external interface StoriesStoryVideo {
    var id: Number
    var owner_id: Number
    var title: String
    var duration: Number
    var description: String
    var date: Number
    var views: Number
    var comments: Number
    var photo_130: String
    var photo_320: String
    var photo_800: String
    var access_key: String
    var adding_date: Number
    var player: String
    var can_edit: Number
    var can_add: Number
    var processing: Number
    var live: Number
    var files: VideoVideoFiles
    var first_frame_800: String
    var first_frame_320: String
    var first_frame_160: String
    var first_frame_130: String
    var is_private: Number
}
external interface StoriesStoryLink {
    var text: String
    var url: String
}
external interface StoriesStory {
    var id: Number
    var owner_id: Number
    var date: Number
    var seen: Number
    var type: String
    var photo: PhotosPhoto
    var video: StoriesStoryVideo
    var views: Number
    var can_see: Number
    var can_reply: Number
    var can_share: Number
    var can_comment: Number
    var is_deleted: Boolean
    var is_expired: Boolean
    var access_key: String
    var parent_story_owner_id: Number
    var parent_story_id: Number
    var parent_story_access_key: String
    var parent_story: StoriesStory
    var owner_name: String
    var url: String
    var link: StoriesStoryLink
    var replies: Array<StoriesReplies>
}
external interface StoriesReplies {
    var count: Number
    var new: Number
}
external interface UtilsShortLink {
    var short_url: String
    var access_key: String
    var key: String
    var url: String
}
external interface UtilsLastShortenedLink {
    var timestamp: Number
    var url: String
    var short_url: String
    var key: String
    var views: Number
    var access_key: String
}
external interface UtilsLinkStats {
    var key: String
    var stats: Array<UtilsStats>
}
external interface UtilsLinkStatsExtended {
    var key: String
    var stats: Array<UtilsStatsExtended>
}
external interface UtilsStats {
    var timestamp: Number
    var views: Number
}
external interface UtilsStatsExtended {
    var timestamp: Number
    var views: Number
    var sex_age: Array<UtilsStatsSexAge>
    var countries: Array<UtilsStatsCountry>
    var cities: Array<UtilsStatsCity>
}
external interface UtilsStatsSexAge {
    var age_range: String
    var female: Number
    var male: Number
}
external interface UtilsStatsCountry {
    var country_id: Number
    var views: Number
}
external interface UtilsStatsCity {
    var city_id: Number
    var views: Number
}
external interface UtilsDomainResolved {
    var type: String
    var object_id: Number
}
external interface UtilsLinkChecked {
    var status: String
    var link: String
}
external interface UsersUsersArray {
    var count: Number
    var items: Array<Number>
}
external interface UsersUserCounters {
    var albums: Number
    var videos: Number
    var audios: Number
    var notes: Number
    var photos: Number
    var groups: Number
    var gifts: Number
    var friends: Number
    var online_friends: Number
    var user_photos: Number
    var user_videos: Number
    var followers: Number
    var subscriptions: Number
    var pages: Number
}
external interface UsersUser {
    var id: Number
    var first_name: String
    var last_name: String
    var deactivated: String
    var hidden: Number
    var sex: Number
    var screen_name: String
    var photo_50: String
    var photo_100: String
    var online: Number
    var online_mobile: Number
    var online_app: Number
}
external interface UsersUserFullXtrType {
    var id: Number
    var first_name: String
    var last_name: String
    var deactivated: String
    var hidden: Number
    var sex: Number
    var screen_name: String
    var photo_50: String
    var photo_100: String
    var online: Number
    var online_mobile: Number
    var online_app: Number
    var nickname: String
    var maiden_name: String
    var domain: String
    var bdate: String
    var city: BaseObject
    var country: BaseCountry
    var timezone: Number
    var photo_200: String
    var photo_max: String
    var photo_200_orig: String
    var photo_400_orig: String
    var photo_max_orig: String
    var photo_id: String
    var has_photo: Number
    var trending: Number
    var has_mobile: Number
    var is_friend: Number
    var friend_status: Number
    var wall_comments: Number
    var can_post: Number
    var can_see_all_posts: Number
    var can_see_audio: Number
    var can_write_private_message: Number
    var can_send_friend_request: Number
    var mobile_phone: String
    var home_phone: String
    var skype: String
    var facebook: String
    var facebook_name: String
    var twitter: String
    var livejournal: String
    var instagram: String
    var site: String
    var status_audio: AudioAudioFull
    var status: String
    var activity: String
    var last_seen: UsersLastSeen
    var exports: UsersExports
    var crop_photo: UsersCropPhoto
    var verified: Number
    var followers_count: Number
    var blacklisted: Number
    var blacklisted_by_me: Number
    var is_favorite: Number
    var is_hidden_from_feed: Number
    var common_count: Number
    var occupation: UsersOccupation
    var career: Array<UsersCareer>
    var military: Array<UsersMilitary>
    var university: Number
    var university_name: String
    var faculty: Number
    var faculty_name: String
    var graduation: Number
    var education_form: String
    var education_status: String
    var home_town: String
    var relation: Number
    var relation_partner: UsersUserMin
    var personal: UsersPersonal
    var interests: String
    var music: String
    var activities: String
    var movies: String
    var tv: String
    var books: String
    var games: String
    var universities: Array<UsersUniversity>
    var schools: Array<UsersSchool>
    var about: String
    var relatives: Array<UsersRelative>
    var quotes: String
    var type: String
}
external interface UsersUserXtrType {
    var id: Number
    var first_name: String
    var last_name: String
    var deactivated: String
    var hidden: Number
    var sex: Number
    var screen_name: String
    var photo_50: String
    var photo_100: String
    var online: Number
    var online_mobile: Number
    var online_app: Number
    var type: String
}
external interface UsersUserMin {
    var id: Number
    var first_name: String
    var last_name: String
    var deactivated: String
    var hidden: Number
}
external interface UsersUserBroadcast {
    var id: Number
    var first_name: String
    var last_name: String
    var deactivated: String
    var hidden: Number
    var status_audio: AudioAudioFull
}
external interface UsersUserFull {
    var id: Number
    var first_name: String
    var last_name: String
    var deactivated: String
    var hidden: Number
    var sex: Number
    var screen_name: String
    var photo_50: String
    var photo_100: String
    var online: Number
    var online_mobile: Number
    var online_app: Number
    var nickname: String
    var maiden_name: String
    var domain: String
    var bdate: String
    var city: BaseObject
    var country: BaseCountry
    var timezone: Number
    var photo_200: String
    var photo_max: String
    var photo_200_orig: String
    var photo_400_orig: String
    var photo_max_orig: String
    var photo_id: String
    var has_photo: Number
    var trending: Number
    var has_mobile: Number
    var is_friend: Number
    var friend_status: Number
    var wall_comments: Number
    var can_post: Number
    var can_see_all_posts: Number
    var can_see_audio: Number
    var can_write_private_message: Number
    var can_send_friend_request: Number
    var mobile_phone: String
    var home_phone: String
    var skype: String
    var facebook: String
    var facebook_name: String
    var twitter: String
    var livejournal: String
    var instagram: String
    var site: String
    var status_audio: AudioAudioFull
    var status: String
    var activity: String
    var last_seen: UsersLastSeen
    var exports: UsersExports
    var crop_photo: UsersCropPhoto
    var verified: Number
    var followers_count: Number
    var blacklisted: Number
    var blacklisted_by_me: Number
    var is_favorite: Number
    var is_hidden_from_feed: Number
    var common_count: Number
    var occupation: UsersOccupation
    var career: Array<UsersCareer>
    var military: Array<UsersMilitary>
    var university: Number
    var university_name: String
    var faculty: Number
    var faculty_name: String
    var graduation: Number
    var education_form: String
    var education_status: String
    var home_town: String
    var relation: Number
    var relation_partner: UsersUserMin
    var personal: UsersPersonal
    var interests: String
    var music: String
    var activities: String
    var movies: String
    var tv: String
    var books: String
    var games: String
    var universities: Array<UsersUniversity>
    var schools: Array<UsersSchool>
    var about: String
    var relatives: Array<UsersRelative>
    var quotes: String
}
external interface UsersCareer {
    var group_id: Number
    var company: String
    var country_id: Number
    var city_id: Number
    var from: Number
    var until: Number
    var position: String
}
external interface UsersExports {
    var twitter: Number
    var facebook: Number
    var livejournal: Number
}
external interface UsersMilitary {
    var unit: String
    var unit_id: Number
    var country_id: Number
    var from: Number
    var until: Number
}
external interface UsersRelative {
    var id: Number
    var type: String
}
external interface UsersUserLim {
    var id: Number
    var photo: String
    var name: String
    var name_gen: String
}
external interface UsersLastSeen {
    var time: Number
    var platform: Number
}
external interface UsersUniversity {
    var id: Number
    var country: Number
    var city: Number
    var name: String
    var faculty: Number
    var faculty_name: String
    var chair: Number
    var chair_name: String
    var graduation: Number
    var education_form: String
    var education_status: String
}
external interface UsersSchool {
    var id: String
    var country: Number
    var city: Number
    var name: String
    var year_from: Number
    var year_to: Number
    var year_graduated: Number
    var schoolClass: String
    var type: Number
    var type_str: String
}
external interface UsersCropPhoto {
    var photo: PhotosPhoto
    var crop: UsersCropPhotoCrop
    var rect: UsersCropPhotoRect
}
external interface UsersCropPhotoCrop {
    var x: Number
    var y: Number
    var x2: Number
    var y2: Number
}
external interface UsersCropPhotoRect {
    var x: Number
    var y: Number
    var x2: Number
    var y2: Number
}
external interface UsersOccupation {
    var type: String
    var id: Number
    var name: String
}
external interface UsersPersonal {
    var political: Number
    var langs: Array<String>
    var religion: String
    var inspired_by: String
    var people_main: Number
    var life_main: Number
    var smoking: Number
    var alcohol: Number
}
external interface UsersUserXtrCounters {
    var id: Number
    var first_name: String
    var last_name: String
    var deactivated: String
    var hidden: Number
    var sex: Number
    var screen_name: String
    var photo_50: String
    var photo_100: String
    var online: Number
    var online_mobile: Number
    var online_app: Number
    var nickname: String
    var maiden_name: String
    var domain: String
    var bdate: String
    var city: BaseObject
    var country: BaseCountry
    var timezone: Number
    var photo_200: String
    var photo_max: String
    var photo_200_orig: String
    var photo_400_orig: String
    var photo_max_orig: String
    var photo_id: String
    var has_photo: Number
    var trending: Number
    var has_mobile: Number
    var is_friend: Number
    var friend_status: Number
    var wall_comments: Number
    var can_post: Number
    var can_see_all_posts: Number
    var can_see_audio: Number
    var can_write_private_message: Number
    var can_send_friend_request: Number
    var mobile_phone: String
    var home_phone: String
    var skype: String
    var facebook: String
    var facebook_name: String
    var twitter: String
    var livejournal: String
    var instagram: String
    var site: String
    var status_audio: AudioAudioFull
    var status: String
    var activity: String
    var last_seen: UsersLastSeen
    var exports: UsersExports
    var crop_photo: UsersCropPhoto
    var verified: Number
    var followers_count: Number
    var blacklisted: Number
    var blacklisted_by_me: Number
    var is_favorite: Number
    var is_hidden_from_feed: Number
    var common_count: Number
    var occupation: UsersOccupation
    var career: Array<UsersCareer>
    var military: Array<UsersMilitary>
    var university: Number
    var university_name: String
    var faculty: Number
    var faculty_name: String
    var graduation: Number
    var education_form: String
    var education_status: String
    var home_town: String
    var relation: Number
    var relation_partner: UsersUserMin
    var personal: UsersPersonal
    var interests: String
    var music: String
    var activities: String
    var movies: String
    var tv: String
    var books: String
    var games: String
    var universities: Array<UsersUniversity>
    var schools: Array<UsersSchool>
    var about: String
    var relatives: Array<UsersRelative>
    var quotes: String
    var counters: UsersUserCounters
}
external interface VideoVideoAlbum {
    var id: Number
    var owner_id: Number
    var title: String
}
external interface VideoVideoAlbumFull {
    var id: Number
    var owner_id: Number
    var title: String
    var count: Number
    var photo_160: String
    var photo_320: String
    var updated_time: Number
    var is_system: Number
}
external interface VideoCatBlock {
    var items: Array<VideoCatElement>
    var next: String
    var name: String
    var id: Number
    var view: String
    var can_hide: Number
    var type: String
}
external interface VideoCatElement {
    var id: Number
    var owner_id: Number
    var title: String
    var type: String
    var description: String
    var duration: Number
    var photo_130: String
    var photo_160: String
    var photo_320: String
    var photo_640: String
    var photo_800: String
    var date: Number
    var views: Number
    var comments: Number
    var can_add: Number
    var can_edit: Number
    var is_private: Number
    var count: Number
    var updated_time: Number
}
external interface VideoSaveResult {
    var upload_url: String
    var video_id: Number
    var owner_id: Number
    var title: String
    var description: String
}
external interface VideoVideoTag {
    var user_id: Number
    var id: Number
    var placer_id: Number
    var tagged_name: String
    var date: Number
    var viewed: Number
}
external interface VideoUploadResponse {
    var size: Number
    var video_id: Number
}
external interface VideoVideo {
    var id: Number
    var owner_id: Number
    var title: String
    var duration: Number
    var description: String
    var date: Number
    var views: Number
    var comments: Number
    var photo_130: String
    var photo_320: String
    var photo_800: String
    var access_key: String
    var adding_date: Number
    var player: String
    var can_edit: Number
    var can_add: Number
    var processing: Number
    var live: Number
    var files: VideoVideoFiles
}
external interface VideoVideoFiles {
    var mp_240: String
    var mp_360: String
    var mp_480: String
    var mp_720: String
    var mp_1080: String
    var external: String
}
external interface VideoVideoTagInfo {
    var id: Number
    var owner_id: Number
    var title: String
    var duration: Number
    var description: String
    var date: Number
    var views: Number
    var comments: Number
    var photo_130: String
    var photo_320: String
    var photo_800: String
    var access_key: String
    var adding_date: Number
    var player: String
    var can_edit: Number
    var can_add: Number
    var processing: Number
    var live: Number
    var files: VideoVideoFiles
    var placer_id: Number
    var tag_created: Number
    var tag_id: Number
}
external interface VideoVideoFull {
    var id: Number
    var owner_id: Number
    var title: String
    var duration: Number
    var description: String
    var date: Number
    var views: Number
    var comments: Number
    var photo_130: String
    var photo_320: String
    var photo_800: String
    var access_key: String
    var adding_date: Number
    var player: String
    var can_edit: Number
    var can_add: Number
    var processing: Number
    var live: Number
    var files: VideoVideoFiles
    var privacy_view: Array<String>
    var privacy_comment: Array<String>
    var can_comment: Number
    var can_repost: Number
    var likes: BaseLikes
    var repeat: Number
}
external interface WallAppPost {
    var id: Number
    var name: String
    var photo_130: String
    var photo_604: String
}
external interface WallAttachedNote {
    var id: Number
    var owner_id: Number
    var comments: Number
    var read_comments: Number
    var date: Number
    var title: String
    var view_url: String
}
external interface WallCommentAttachment {
    var photo: PhotosPhoto
    var audio: AudioAudioFull
    var video: VideoVideo
    var doc: DocsDoc
    var link: BaseLink
    var note: WallAttachedNote
    var page: PagesWikipageFull
    var market_market_album: MarketMarketAlbum
    var market: MarketMarketItem
    var sticker: BaseSticker
    var type: String
}
external interface WallGraffiti {
    var id: Number
    var owner_id: Number
    var photo_200: String
    var photo_586: String
}
external interface WallPostSource {
    var type: String
    var platform: String
    var data: String
    var url: String
}
external interface WallPostedPhoto {
    var id: Number
    var owner_id: Number
    var photo_130: String
    var photo_604: String
}
external interface WallWallComment {
    var id: Number
    var from_id: Number
    var date: Number
    var text: String
    var likes: BaseLikesInfo
    var reply_to_user: Number
    var reply_to_comment: Number
    var attachments: Array<WallCommentAttachment>
    var real_offset: Number
}
external interface WallViews {
    var count: Number
}
external interface WallWallpost {
    var id: Number
    var from_id: Number
    var owner_id: Number
    var date: Number
    var views: WallViews
    var access_key: String
    var post_type: String
    var text: String
    var signer_id: Number
    var attachments: Array<WallWallpostAttachment>
    var geo: BaseGeo
    var post_source: WallPostSource
}
external interface WallWallpostAttached {
    var id: Number
    var from_id: Number
    var to_id: Number
    var date: Number
    var post_type: String
    var text: String
    var can_delete: Number
    var signer_id: Number
    var attachments: Array<WallWallpostAttachment>
    var geo: BaseGeo
    var post_source: WallPostSource
    var comments: BaseCommentsInfo
    var likes: BaseLikesInfo
    var reposts: BaseRepostsInfo
    var copy_owner_id: Number
    var copy_post_id: Number
    var copy_text: String
}
external interface WallWallpostAttachment {
    var photo: PhotosPhoto
    var posted_photo: WallPostedPhoto
    var audio: AudioAudioFull
    var video: VideoVideo
    var doc: DocsDoc
    var link: BaseLink?
    var graffiti: WallGraffiti
    var note: WallAttachedNote
    var app: WallAppPost
    var poll: PollsPoll
    var page: PagesWikipageFull
    var album: PhotosPhotoAlbum
    var photos_list: Array<String>
    var market_market_album: MarketMarketAlbum
    var market: MarketMarketItem
    var type: String
}
external interface WallWallpostToId {
    var id: Number
    var from_id: Number
    var to_id: Number
    var date: Number
    var post_id: Number
    var post_type: String
    var text: String
    var signer_id: Number
    var attachments: Array<WallWallpostAttachment>
    var geo: BaseGeo
    var post_source: WallPostSource
    var comments: BaseCommentsInfo
    var likes: BaseLikesInfo
    var reposts: BaseRepostsInfo
    var copy_owner_id: Number
    var copy_post_id: Number
}
external interface WallWallpostFull: WallWallpost {
    var copy_history: Array<WallWallpost>
    var can_edit: Number
    var created_by: Number
    var can_delete: Number
    var can_pin: Number
    var is_pinned: Number
    var comments: BaseCommentsInfo
    var likes: BaseLikesInfo
    var reposts: BaseRepostsInfo
    var marked_as_ads: Number
}
external interface WidgetsWidgetComment {
    var id: Number
    var from_id: Number
    var to_id: Number
    var date: Number
    var user: UsersUserFull
    var post_type: Number
    var text: String
    var can_delete: Number
    var media: WidgetsCommentMedia
    var attachments: Array<WallCommentAttachment>
    var post_source: WallPostSource
    var comments: WidgetsCommentReplies
    var likes: BaseLikesInfo
    var reposts: BaseRepostsInfo
}
external interface WidgetsCommentMedia {
    var type: String
    var owner_id: Number
    var item_id: Number
    var thumb_src: String
}
external interface WidgetsCommentReplies {
    var count: Number
    var can_post: Number
    var replies: Array<WidgetsCommentRepliesItem>
}
external interface WidgetsCommentRepliesItem {
    var cid: Number
    var uid: Number
    var date: Number
    var text: String
    var likes: WidgetsWidgetLikes
    var user: UsersUserFull
}
external interface WidgetsWidgetLikes {
    var count: Number
}
external interface WidgetsWidgetPage {
    var id: Number
    var title: String
    var description: String
    var photo: String
    var url: String
    var likes: BaseObjectCount
    var comments: BaseObjectCount
    var date: Number
    var page_id: String
}

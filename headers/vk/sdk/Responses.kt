@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package vk.sdk

external interface AccountChangePasswordResponse {
    var token: String
    var secret: String
}
external interface AccountGetActiveOffersResponse {
    var count: Number
    var items: Array<AccountOffer>
}
external interface AccountGetBannedResponse {
    var count: Number
    var items: Array<UsersUserMin>
}
external interface AccountSaveProfileInfoResponse {
    var changed: BaseBoolInt
    var name_request: AccountNameRequest
}
external interface AdsCreateTargetGroupResponse {
    var id: Number
    var pixel: String
}
external interface AdsGetCategoriesResponse {
    var v1: Array<AdsCategory>
    var v2: Array<AdsCategory>
}
external interface AppsGetCatalogResponse {
    var count: Number
    var items: Array<AppsApp>
}
external interface AppsGetLeaderboardResponse {
    var count: Number
    var items: Array<AppsLeaderboard>
}
external interface AppsGetLeaderboardExtendedResponse {
    var count: Number
    var items: Array<AppsLeaderboard>
    var profiles: Array<UsersUserMin>
}
external interface AppsGetResponse {
    var count: Number
    var items: Array<AppsApp>
}
external interface AppsGetFriendsListResponse {
    var count: Number
    var items: Array<UsersUserFull>
}
external interface AuthSignupResponse {
    var sid: String
}
external interface AuthConfirmResponse {
    var success: Number
    var user_id: Number
}
external interface AuthRestoreResponse {
    var success: Number
    var sid: String
}
external interface BoardGetTopicsResponse {
    var count: Number
    var items: Array<BoardTopic>
    var default_order: BoardDefaultOrder
    var can_add_topics: BaseBoolInt
}
external interface BoardGetTopicsExtendedResponse {
    var count: Number
    var items: Array<BoardTopic>
    var default_order: BoardDefaultOrder
    var can_add_topics: BaseBoolInt
    var profiles: Array<UsersUserMin>
}
external interface BoardGetCommentsResponse {
    var count: Number
    var items: Array<BoardTopicComment>
    var poll: BoardTopicPoll
}
external interface BoardGetCommentsExtendedResponse {
    var count: Number
    var items: Array<BoardTopicComment>
    var poll: BoardTopicPoll
    var profiles: Array<UsersUser>
    var groups: Array<GroupsGroup>
}
external interface DatabaseGetCountriesResponse {
    var count: Number
    var items: Array<BaseCountry>
}
external interface DatabaseGetRegionsResponse {
    var count: Number
    var items: Array<DatabaseRegion>
}
external interface DatabaseGetChairsResponse {
    var count: Number
    var items: Array<BaseObject>
}
external interface DatabaseGetCitiesResponse {
    var count: Number
    var items: Array<DatabaseCity>
}
external interface DatabaseGetUniversitiesResponse {
    var count: Number
    var items: Array<DatabaseUniversity>
}
external interface DatabaseGetSchoolsResponse {
    var count: Number
    var items: Array<DatabaseSchool>
}
external interface DatabaseGetFacultiesResponse {
    var count: Number
    var items: Array<DatabaseFaculty>
}
external interface DocsGetResponse {
    var count: Number
    var items: Array<DocsDoc>
}
external interface DocsGetUploadServerResponse {
    var upload_url: String
}
external interface DocsGetWallUploadServerResponse {
    var upload_url: String
}
external interface DocsAddResponse {
    var id: Number
}
external interface DocsGetTypesResponse {
    var count: Number
    var items: Array<DocsDocTypes>
}
external interface DocsSearchResponse {
    var count: Number
    var items: Array<DocsDoc>
}
external interface FaveGetUsersResponse {
    var count: Number
    var items: Array<UsersUserMin>
}
external interface FaveGetPhotosResponse {
    var count: Number
    var items: Array<PhotosPhoto>
}
external interface FaveGetPostsResponse {
    var count: Number
    var items: Array<WallWallpostFull>
}
external interface FaveGetVideosResponse {
    var count: Number
    var items: Array<VideoVideo>
}
external interface FaveGetLinksResponse {
    var count: Number
    var items: Array<FaveFavesLink>
}
external interface FaveGetMarketItemsResponse {
    var count: Number
    var items: Array<MarketMarketItem>
}
external interface FriendsGetResponse {
    var count: Number
    var items: Array<Number>
}
external interface FriendsGetFieldsResponse {
    var count: Number
    var items: Array<FriendsUserXtrLists>
}
external interface FriendsGetOnlineOnlineMobileResponse {
    var online: Array<Number>
    var online_mobile: Array<Number>
}
external interface FriendsGetRequestsResponse {
    var count: Number
    var items: Array<Number>
    var count_unread: Number
}
external interface FriendsGetRequestsNeedMutualResponse {
    var count: Number
    var items: Array<FriendsRequests>
}
external interface FriendsGetRequestsExtendedResponse {
    var count: Number
    var items: Array<FriendsRequestsXtrMessage>
}
external interface FriendsDeleteResponse {
    var success: BaseOkResponse
    var friend_deleted: Number
    var out_request_deleted: Number
    var in_request_deleted: Number
    var suggestion_deleted: Number
}
external interface FriendsGetListsResponse {
    var count: Number
    var items: Array<FriendsFriendsList>
}
external interface FriendsAddListResponse {
    var list_id: Number
}
external interface FriendsGetSuggestionsResponse {
    var count: Number
    var items: Array<UsersUserFull>
}
external interface FriendsGetAvailableForCallResponse {
    var count: Number
    var items: Array<Number>
}
external interface FriendsGetAvailableForCallFieldsResponse {
    var count: Number
    var items: Array<UsersUserFull>
}
external interface FriendsSearchResponse {
    var count: Number
    var items: Array<UsersUserFull>
}
external interface GiftsGetResponse {
    var count: Number
    var items: Array<GiftsGift>
}
external interface GroupsIsMemberExtendedResponse {
    var member: BaseBoolInt
    var invitation: BaseBoolInt
    var request: BaseBoolInt
}
external interface GroupsGetCallbackConfirmationCodeResponse {
    var code: String
}
external interface GroupsGetCallbackSettingsResponse {
    var message_new: BaseBoolInt
    var message_edit: BaseBoolInt
    var message_reply: BaseBoolInt
    var message_allow: BaseBoolInt
    var message_deny: BaseBoolInt
    var photo_new: BaseBoolInt
    var audio_new: BaseBoolInt
    var video_new: BaseBoolInt
    var wall_reply_new: BaseBoolInt
    var wall_reply_edit: BaseBoolInt
    var wall_reply_delete: BaseBoolInt
    var wall_post_restore: BaseBoolInt
    var board_post_new: BaseBoolInt
    var board_post_edit: BaseBoolInt
    var board_post_restore: BaseBoolInt
    var board_post_delete: BaseBoolInt
    var photo_comment_new: BaseBoolInt
    var photo_comment_edit: BaseBoolInt
    var photo_comment_delete: BaseBoolInt
    var photo_comment_restore: BaseBoolInt
    var video_comment_new: BaseBoolInt
    var video_comment_edit: BaseBoolInt
    var video_comment_delete: BaseBoolInt
    var video_comment_restore: BaseBoolInt
    var market_comment_new: BaseBoolInt
    var market_comment_edit: BaseBoolInt
    var market_comment_delete: BaseBoolInt
    var market_comment_restore: BaseBoolInt
    var group_join: BaseBoolInt
    var group_leave: BaseBoolInt
}
external interface GroupsGetResponse {
    var count: Number
    var items: Array<Number>
}
external interface GroupsGetExtendedResponse {
    var count: Number
    var items: Array<GroupsGroupFull>
}
external interface GroupsGetMembersResponse {
    var count: Number
    var items: Array<Number>
}
external interface GroupsGetMembersFieldsResponse {
    var count: Number
    var items: Array<GroupsUserXtrRole>
}
external interface GroupsGetMembersFilterResponse {
    var count: Number
    var items: Array<GroupsMemberRole>
}
external interface GroupsSearchResponse {
    var count: Number
    var items: Array<GroupsGroup>
}
external interface GroupsGetCatalogResponse {
    var count: Number
    var items: Array<GroupsGroup>
}
external interface GroupsGetCatalogInfoResponse {
    var enabled: Number
    var categories: Array<GroupsGroupCategory>
}
external interface GroupsGetCatalogInfoExtendedResponse {
    var enabled: Number
    var categories: Array<GroupsGroupCategoryFull>
}
external interface GroupsGetInvitesResponse {
    var count: Number
    var items: Array<GroupsGroupXtrInvitedBy>
}
external interface GroupsGetInvitesExtendedResponse {
    var count: Number
    var items: Array<GroupsGroupXtrInvitedBy>
    var profiles: Array<UsersUserMin>
}
external interface GroupsGetInvitedUsersResponse {
    var count: Number
    var items: Array<UsersUserFull>
}
external interface GroupsGetBannedResponse {
    var count: Number
    var items: Array<GroupsOwnerXtrBanInfo>
}
external interface GroupsEditPlaceResponse {
    var success: BaseOkResponse
    var address: String
}
external interface GroupsGetRequestsResponse {
    var count: Number
    var items: Array<Number>
}
external interface GroupsGetRequestsFieldsResponse {
    var count: Number
    var items: Array<UsersUserFull>
}
external interface LeadsMetricHitResponse {
    var result: Boolean
    var redirect_link: String
}
external interface LikesGetListResponse {
    var count: Number
    var items: Array<Number>
}
external interface LikesGetListExtendedResponse {
    var count: Number
    var items: Array<UsersUserMin>
}
external interface LikesAddResponse {
    var likes: Number
}
external interface LikesDeleteResponse {
    var likes: Number
}
external interface LikesIsLikedResponse {
    var liked: BaseBoolInt
    var copied: BaseBoolInt
}
external interface MarketGetResponse {
    var count: Number
    var items: Array<MarketMarketItem>
}
external interface MarketGetExtendedResponse {
    var count: Number
    var items: Array<MarketMarketItemFull>
}
external interface MarketGetByIdResponse {
    var count: Number
    var items: Array<MarketMarketItem>
}
external interface MarketGetByIdExtendedResponse {
    var count: Number
    var items: Array<MarketMarketItemFull>
}
external interface MarketSearchResponse {
    var count: Number
    var items: Array<MarketMarketItem>
}
external interface MarketSearchExtendedResponse {
    var count: Number
    var items: Array<MarketMarketItemFull>
}
external interface MarketGetAlbumsResponse {
    var count: Number
    var items: Array<MarketMarketAlbum>
}
external interface MarketGetAlbumByIdResponse {
    var count: Number
    var items: Array<MarketMarketAlbum>
}
external interface MarketGetCommentsResponse {
    var count: Number
    var items: Array<WallWallComment>
}
external interface MarketGetCategoriesResponse {
    var count: Number
    var items: Array<MarketMarketCategory>
}
external interface MarketAddResponse {
    var market_item_id: Number
}
external interface MarketAddAlbumResponse {
    var market_album_id: Number
}
external interface MessagesGetResponse {
    var count: Number
    var items: Array<MessagesMessage>
}
external interface MessagesDeleteResponse
external interface MessagesGetDialogsResponse {
    var count: Number
    var unread_dialogs: Number
    var items: Array<MessagesDialog>
}
external interface MessagesGetByIdResponse {
    var count: Number
    var items: Array<MessagesMessage>
}
external interface MessagesSearchResponse {
    var count: Number
    var items: Array<MessagesMessage>
}
external interface MessagesGetHistoryResponse {
    var count: Number
    var unread: Number
    var items: Array<MessagesMessage>
    var in_read: Number
    var out_read: Number
}
external interface MessagesGetHistoryAttachmentsResponse {
    var items: Array<MessagesHistoryAttachment>
    var next_from: String
}
external interface MessagesGetLongPollHistoryResponse {
    var history: Array<Array<Number>>
    var groups: Array<GroupsGroup>
    var messages: MessagesLongpollMessages
    var profiles: Array<UsersUserFull>
    var chats: Array<MessagesChat>
    var new_pts: Number
    var more: BaseBoolInt
}
external interface MessagesGetChatUsersChatIdsResponse
external interface MessagesGetChatUsersChatIdsFieldsResponse
external interface MessagesSetChatPhotoResponse {
    var message_id: Number
    var chat: MessagesChat
}
external interface MessagesDeleteChatPhotoResponse {
    var message_id: Number
    var chat: MessagesChat
}
external interface MessagesIsMessagesFromGroupAllowedResponse {
    var is_allowed: BaseBoolInt
}
external interface NewsfeedGetResponse {
    var items: Array<NewsfeedNewsfeedItem>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
}
external interface NewsfeedGetRecommendedResponse {
    var items: Array<NewsfeedNewsfeedItem>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
    var new_offset: String
    var new_from: String
}
external interface NewsfeedGetCommentsResponse {
    var items: Array<NewsfeedNewsfeedItem>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
    var next_from: String
}
external interface NewsfeedGetMentionsResponse {
    var count: Number
    var items: Array<WallWallpostToId>
}
external interface NewsfeedGetBannedResponse {
    var groups: Array<Number>
    var members: Array<Number>
}
external interface NewsfeedGetBannedExtendedResponse {
    var groups: Array<UsersUserFull>
    var members: Array<GroupsGroupFull>
}
external interface NewsfeedSearchResponse {
    var items: Array<WallWallpostFull>
    var suggested_queries: Array<String>
}
external interface NewsfeedSearchExtendedResponse {
    var items: Array<WallWallpostFull>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
}
external interface NewsfeedGetListsResponse {
    var count: Number
    var items: Array<NewsfeedList>
}
external interface NewsfeedGetListsExtendedResponse {
    var count: Number
    var items: Array<NewsfeedListFull>
}
external interface NewsfeedGetSuggestedSourcesResponse {
    var count: Number
    var items: Array<Any>
}
external interface NotesGetResponse {
    var count: Number
    var items: Array<NotesNote>
}
external interface NotesGetCommentsResponse {
    var count: Number
    var items: Array<NotesNoteComment>
}
external interface NotificationsGetResponse {
    var count: Number
    var items: Array<NotificationsNotification>
    var profiles: Array<UsersUser>
    var groups: Array<GroupsGroup>
    var last_viewed: Number
}
external interface PhotosGetAlbumsResponse {
    var count: Number
    var items: Array<PhotosPhotoAlbumFull>
}
external interface PhotosGetResponse {
    var count: Number
    var items: Array<PhotosPhoto>
}
external interface PhotosGetExtendedResponse {
    var count: Number
    var items: Array<PhotosPhotoFull>
}
external interface PhotosGetOwnerCoverPhotoUploadServerResponse {
    var upload_url: String
}
external interface PhotosGetOwnerPhotoUploadServerResponse {
    var upload_url: String
}
external interface PhotosGetChatUploadServerResponse {
    var upload_url: String
}
external interface PhotosGetMarketUploadServerResponse {
    var upload_url: String
}
external interface PhotosGetMarketAlbumUploadServerResponse {
    var upload_url: String
}
external interface PhotosSaveOwnerPhotoResponse {
    var photo_hash: String
    var photo_src: String
}
external interface PhotosSearchResponse {
    var count: Number
    var items: Array<PhotosPhoto>
}
external interface PhotosGetAllResponse {
    var count: Number
    var items: Array<PhotosPhotoXtrRealOffset>
    var more: BaseBoolInt
}
external interface PhotosGetAllExtendedResponse {
    var count: Number
    var items: Array<PhotosPhotoFullXtrRealOffset>
    var more: BaseBoolInt
}
external interface PhotosGetUserPhotosResponse {
    var count: Number
    var items: Array<PhotosPhoto>
}
external interface PhotosGetUserPhotoExtendedResponse {
    var count: Number
    var items: Array<PhotosPhotoFull>
}
external interface PhotosGetCommentsResponse {
    var count: Number
    var real_offset: Number
    var items: Array<WallWallComment>
}
external interface PhotosGetCommentsExtendedResponse {
    var count: Number
    var real_offset: Number
    var items: Array<WallWallComment>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
}
external interface PhotosGetAllCommentsResponse {
    var count: Number
    var items: Array<PhotosCommentXtrPid>
}
external interface PhotosGetNewTagsResponse {
    var count: Number
    var items: Array<PhotosPhotoXtrTagInfo>
}
external interface PlacesAddResponse {
    var id: Number
}
external interface PlacesSearchResponse {
    var count: Number
    var items: Array<PlacesPlaceFull>
}
external interface PlacesCheckinResponse {
    var id: Number
}
external interface PlacesGetCheckinsResponse {
    var count: Number
    var items: Array<PlacesCheckin>
}
external interface SearchGetHintsResponse {
    var items: Array<SearchHint>
    var suggested_queries: Array<String>
}
external interface StreamingGetServerUrlResponse {
    var endpoint: String
    var key: String
}
external interface UsersSearchResponse {
    var count: Number
    var items: Array<UsersUserFull>
}
external interface UsersGetSubscriptionsResponse {
    var users: UsersUsersArray
    var groups: GroupsGroupsArray
}
external interface UsersGetSubscriptionsExtendedResponse {
    var count: Number
    var items: Array<Any>
}
external interface UsersGetFollowersResponse {
    var count: Number
    var items: Array<Number>
}
external interface UsersGetFollowersFieldsResponse {
    var count: Number
    var items: Array<UsersUserFull>
}
external interface UsersGetNearbyResponse {
    var count: Number
    var items: Array<UsersUserFull>
}
external interface UtilsGetLastShortenedLinksResponse {
    var count: Number
    var items: Array<UtilsLastShortenedLink>
}
external interface VideoGetResponse {
    var count: Number
    var items: Array<VideoVideo>
}
external interface VideoGetExtendedResponse {
    var count: Number
    var items: Array<VideoVideoFull>
    var profiles: Array<UsersUserMin>
    var groups: Array<GroupsGroupFull>
}
external interface VideoSearchResponse {
    var count: Number
    var items: Array<VideoVideo>
}
external interface VideoSearchExtendedResponse {
    var count: Number
    var items: Array<VideoVideo>
    var profiles: Array<UsersUserMin>
    var groups: Array<GroupsGroupFull>
}
external interface VideoGetUserVideosResponse {
    var count: Number
    var items: Array<VideoVideo>
}
external interface VideoGetUserVideosExtendedResponse {
    var count: Number
    var items: Array<VideoVideo>
    var profiles: Array<UsersUserMin>
    var groups: Array<GroupsGroupFull>
}
external interface VideoGetAlbumsResponse {
    var count: Number
    var items: Array<VideoVideoAlbumFull>
}
external interface VideoGetAlbumsExtendedResponse {
    var count: Number
    var items: Array<VideoVideoAlbumFull>
}
external interface VideoAddAlbumResponse {
    var album_id: Number
}
external interface VideoGetAlbumsByVideoExtendedResponse {
    var count: Number
    var items: Array<VideoVideoAlbumFull>
}
external interface VideoGetCommentsResponse {
    var count: Number
    var items: Array<WallWallComment>
    var profiles: Array<UsersUserMin>
    var groups: Array<GroupsGroupFull>
}
external interface VideoGetCommentsExtendedResponse {
    var count: Number
    var items: Array<WallWallComment>
}
external interface VideoGetNewTagsResponse {
    var count: Number
    var items: Array<VideoVideoTagInfo>
}
external interface VideoGetCatalogResponse {
    var items: Array<VideoCatBlock>
    var next: String
}
external interface VideoGetCatalogExtendedResponse {
    var items: Array<VideoCatBlock>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
    var next: String
}
external interface VideoGetCatalogSectionResponse {
    var items: Array<VideoCatElement>
    var next: String
}
external interface VideoGetCatalogSectionExtendedResponse {
    var items: Array<VideoCatElement>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
    var next: String
}
external interface WallGetResponse {
    var count: Number
    var items: Array<WallWallpostFull>
}
external interface WallGetExtendedResponse {
    var count: Number
    var items: Array<WallWallpostFull>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
}
external interface WallSearchResponse {
    var count: Number
    var items: Array<WallWallpostFull>
}
external interface WallSearchExtendedResponse {
    var count: Number
    var items: Array<WallWallpostFull>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
}
external interface WallGetByIdExtendedResponse {
    var items: Array<WallWallpostFull>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
}
external interface WallPostResponse {
    var post_id: Number
}
external interface WallRepostResponse {
    var success: BaseOkResponse
    var post_id: Number
    var reposts_count: Number
    var likes_count: Number
}
external interface WallGetRepostsResponse {
    var items: Array<WallWallpostFull>
    var profiles: Array<UsersUser>
    var groups: Array<GroupsGroup>
}
external interface WallGetCommentsResponse {
    var count: Number
    var items: Array<WallWallComment>
}
external interface WallGetCommentsExtendedResponse {
    var count: Number
    var items: Array<WallWallComment>
    var profiles: Array<UsersUser>
    var groups: Array<GroupsGroup>
}
external interface WallCreateCommentResponse {
    var comment_id: Number
}
external interface WidgetsGetCommentsResponse {
    var count: Number
    var posts: Array<WidgetsWidgetComment>
}
external interface WidgetsGetPagesResponse {
    var count: Number
    var pages: Array<WidgetsWidgetPage>
}
external interface StoriesGetResponse {
    var count: Number
    var items: Array<Array<StoriesStory>>
}
external interface StoriesGetExtendedResponse {
    var count: Number
    var items: Array<Array<StoriesStory>>
    var profiles: Array<UsersUser>
    var groups: Array<GroupsGroup>
}
external interface StoriesGetBannedResponse {
    var count: Number
    var items: Array<Number>
}
external interface StoriesGetBannedExtendedResponse {
    var count: Number
    var items: Array<Number>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
}
external interface StoriesGetByIdResponse {
    var count: Number
    var items: Array<StoriesStory>
}
external interface StoriesGetByIdExtendedResponse {
    var count: Number
    var items: Array<StoriesStory>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
}
external interface StoriesGetPhotoUploadServerResponse {
    var upload_url: String
    var user_ids: Array<Number>
}
external interface StoriesGetRepliesResponse {
    var count: Number
    var items: Array<Array<StoriesStory>>
}
external interface StoriesGetRepliesExtendedResponse {
    var count: Number
    var items: Array<Array<StoriesStory>>
    var profiles: Array<UsersUserFull>
    var groups: Array<GroupsGroupFull>
}
external interface StoriesGetVideoUploadServerResponse {
    var upload_url: String
    var user_ids: Array<Number>
}
external interface StoriesGetViewersResponse {
    var count: Number
    var items: Array<Number>
}
external interface StoriesGetViewersExtendedResponse {
    var count: Number
    var items: Array<UsersUserFull>
}

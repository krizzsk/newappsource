package com.moovit.analytics;

public enum AnalyticsEventKey {
    FOREGROUND,
    BACKGROUND,
    IS_ALIVE,
    CRASH,
    BUTTON_CLICK,
    SWIPE,
    CONTENT_SHOWN,
    CLOCK,
    ON_FOCUS,
    TASK_COMPLETED,
    MESSAGE_BAR_SHOWN,
    MESSAGE_BAR_TAPPED,
    STATUS_CHANGED,
    RESPONSE,
    OPEN_ACTIVITY,
    CLOSE_ACTIVITY,
    REQUEST_START,
    REQUEST_END,
    MAP_MOVED,
    REFRESH_CLICKED,
    PULL_TO_REFRESH,
    METRO_ID_MISMATCH,
    METRO_REVISION_MISMATCH,
    METRO_CRITICAL_MISMATCH,
    METRO_UPDATE_DIALOG_SHOWN,
    FEEDBACK_CLICKED,
    RATE_US_CLICKED,
    NOTIFICATION_SETTINGS_CHANGED,
    TRANSPORTATION_MAP_CLICK,
    USER_PROFILE_CHANGED,
    SPREAD_THE_LOVE_SHARE,
    SPREAD_THE_LOVE_SHARE_FOLLOW_ON_TWITTER,
    SPREAD_THE_LOVE_SHARE_FOLLOW_ON_INSTAGRAM,
    START_METRO_SWITCH,
    METRO_SYNC,
    CHANGE_METRO,
    RATE_US_POPUP_DIALOG,
    WEB_VIEW_LOAD,
    LAYOUT_CHANGED,
    CAMPAIGN_CLICKED,
    ON_READY,
    ON_ALL_DATA_PARTS_LOADED,
    ON_DATA_PART_LOADING_FAILURE,
    LOADER_START,
    LOADER_END,
    USER_CREATION_FAILURE,
    USER_CREATION_RETRY_CLICKED,
    USER_CREATION_FAILURE_METRO_SELECTED,
    NETWORK_SETTINGS_CLICKED,
    LOCATION_SETTINGS_CLICKED,
    TAXI_CLICKED,
    TAXI_EXPOSED,
    PUSH_RECEIVED,
    PUSH_CLICKED,
    PUSH_DISMISSED,
    PUSH_REJECTED,
    PUSH_PAYLOAD_DOWNLOADED,
    PUSH_POPUP_SHOWN,
    PUSH_PARSE_ERROR,
    OPEN_POPUP,
    CLOSE_POPUP,
    ALERT_MESSAGE_BAR_SHOWN,
    ALERT_MESSAGE_BAR_ACTION_TAPPED,
    FACEBOOK_LIKE_RESULT,
    FAVORITES_WIDGET_INSTALLED,
    FAVORITES_WIDGET_UNINSTALLED,
    FAVORITES_WIDGET_REFRESH,
    FAVORITES_WIDGET_SWITCH_STATIONS,
    FAVORITES_WIDGET_HEADER_TAPPED,
    FAVORITES_WIDGET_LINE_TAPPED,
    FAVORITES_WIDGET_TP_HOME,
    FAVORITES_WIDGET_TP_WORK,
    FAVORITES_WIDGET_EDIT_HOME,
    FAVORITES_WIDGET_EDIT_WORK,
    FAVORITES_WIDGET_AUTO_REFRESH,
    FAVORITES_WIDGET_OPEN_DASHBOARD,
    FAVORITES_WIDGET_UPDATE,
    SEARCH_RIDE_SHOWN,
    SEARCH_RIDE_SUCCEEDED,
    SEARCH_RIDE_FAILED,
    SEARCH_RIDE_LINE_CHOSEN,
    ACTIVE_RIDE_SHOWN,
    ACTIVE_RIDE_NAVIGATION_START,
    ACTIVE_RIDE_NAVIGATION_STOP,
    ACTIVE_RIDE_CHANGE_DEST_CLICKED,
    ACTIVE_RIDE_CHANGE_DEST,
    ACTIVE_RIDE_DISMISS_CLICKED,
    ACTIVE_RIDE_ADD_REPORT_CLICKED,
    ACTIVE_RIDE_LINE_NEWS_CLICKED,
    ACTIVE_RIDE_LINE_DETAILS_CLICKED,
    ACTIVE_RIDE_NOTIFICATION_ALERTS,
    ACTIVE_RIDE_PROGRESS_CHANGED,
    START_NAVIGATION,
    RESUME_NAVIGATION,
    STOP_NAVIGATION,
    USER_VISIBILITY_STATE_CHANGED,
    FOREGROUND_STATE_CHANGED,
    NAVIGATION_PROGRESS_CHANGED,
    PLUS_BUTTON_CLICKED,
    ACTION_SHEET_CLICKED,
    FAVORITE_LINE_CLICKED,
    LINE_SCHEDULE_CLICKED,
    STOP_DETAILS_CLICKED,
    ADD_LINE_REPORT_CLICKED,
    VIEW_LINE_REPORTS_CLICKED,
    ADD_STOP_REPORT_CLICKED,
    VIEW_STOP_REPORTS_CLICKED,
    REPORT_ITEM_CLICKED,
    REPORT_SEND_CLICKED,
    ORDER_TAXI_CLICKED,
    START_RIDE_CLICKED,
    EDIT_ORIGIN_CLICKED,
    EDIT_DEST_CLICKED,
    REFINE_ROUTES_CLICKED,
    SWITCH_DIRECTIONS_CLICKED,
    SEARCH_ROUTES_CLICKED,
    SEARCH_ROUTE_REQUEST,
    EDIT_TIME_CLICKED,
    EDIT_TIME_DIALOG,
    EDIT_ROUTE_TYPE_CLICKED,
    EDIT_ROUTE_TYPE_DIALOG,
    EDIT_TRANSIT_TYPES_CLICKED,
    EDIT_TRANSIT_TYPES_DIALOG,
    LOCATION_ADS_RECEIVED,
    LOCATION_ADS_EXPOSED,
    LOCATION_ADS_CLICKED,
    NEW_ROUTES_SNACKBAR_SHOWN,
    EDIT_DAYS_CLICKED,
    EDIT_DAYS_DIALOG,
    EDIT_DAY_PART_CLICKED,
    EDIT_DAY_PART_DIALOG,
    ACTIVITY_CREATED,
    ACTIVITY_STARTED,
    ACTIVITY_RESUMED,
    ACTIVITY_PAUSED,
    ACTIVITY_STOPPED,
    ACTIVITY_SAVED_INSTANCE,
    ACTIVITY_DESTROYED,
    SEARCH_BOX,
    SEARCH_LOCATIONS,
    NEAR_ME_STOPS_SHOWN,
    ORANGE_SNACK_BAR_SHOWN,
    ITINERARY_LOADED,
    ITINERARY_LOAD_FAILED,
    DROP_DOWN,
    NAVIGATION_STARTED,
    NAVIGATION_ENDED,
    DEVIATION_SHOWN,
    RETURN_TO_PATH,
    NAVIGATION_LEG_ADVANCE,
    MAXIMIZE,
    ETA_CHANGED,
    NAVIGATION_STATION_ADVANCE,
    WAS_LINE_CHANGED,
    STEP_VALIDATE_PHONE,
    STEP_WELCOME,
    STEP_PERSONAL_DETAILS,
    STEP_CREDIT_CARD,
    STEP_ENTER_PHONE,
    STEP_FACEBOOK_LOGIN,
    STEP_SETTINGS,
    STEP_EMAIL,
    CARPOOL_ZOOZ_REGISTRATION,
    CARPOOL_BOOK_RIDE_OCCURRED,
    RIDE_DETAILS_SHOWN,
    CARPOOL_SEARCH_RESULT,
    DETOUR_OFFERED,
    SUGGESTION_SURVEY_SHOWN,
    CARPOOL_ITINERARY_RECEIVED,
    CARPOOL_DRIVER_SHOW_REPORT,
    USER_CREATION_FAILURE_SELECT_METRO_CLICKED,
    ARRIVAL_REPORT_LIKED,
    EXTERNAL_INITIATOR,
    FAVORITE_SET,
    EXTERNAL_ITINERARY_REDIRECT,
    EXTERNAL_ITINERARY_FALLBACK,
    DATA_COLLECTION_TRIGGER_CANCELED,
    DATA_COLLECTION_TRIGGER_STARTED,
    SPIDER_LOGIC_FINISHED,
    DATA_COLLECTION_GEOFENCES_STATUS,
    AVATAR_CHANGED,
    LOGIN,
    LOGOUT,
    SMART_FEEDBACK_YES,
    SMART_FEEDBACK_NO,
    VIEW_TYPE_SHOWN,
    SERVICE_ALERT_SHOWN,
    SERVICE_ALERT_MENU_SHOWN,
    CARPOOL_SECTION_SHOWN,
    TOP_UP_SECTION_SHOWN,
    COMMUNITY_SECTION_SHOWN,
    FAVORITES_LOADED,
    PHOTO_SENT,
    MAP_ICON_SHOWN,
    SHARED_ENTITY_RECEIVED,
    SHARED_ENTITY_ERROR_SHOWN,
    SHARED_ENTITY_SHOWN,
    BEST_WAY_STATE,
    EDUCATIONAL_POPUP_SHOWN,
    LOCATION_SHEET_SHOWN,
    SET_AS_DESTINATION_CLICKED,
    SET_AS_ORIGIN_CLICKED,
    SET_AS_FAVORITE_CLICKED,
    STOP_LOADED,
    VALIDATE_COUPON_STATUS,
    SWIPE_CARD,
    BOOK_RESULT,
    RED_BADGE_EXIST,
    SURVEY_NOTIFICATION_RECEIVED,
    SURVEY_SHOWN,
    RT_HELP_BANNER_LINK_CLICKED,
    RT_HELP_BANNER_DISMISS_CLICKED,
    RT_HELP_ACTIVITY_ACTION_CLICKED,
    LINE_SELECTED,
    FORWARD_GEOCODER,
    REVERSE_GEOCODER,
    AUTO_CHOOSE_METRO_LANGUAGE,
    DEEP_LINK_LOADED,
    DEEP_LINK_INSTALL_IMPRESSION,
    IMAGE_ZOOM,
    STEP_COMPLETED,
    STEPS_COMPLETED,
    STEP_SKIPPED,
    TICKET_PURCHASE_RESULT,
    WALLET_CONTENT,
    PHONE_CODE_VERIFIED,
    PHOTO_TAKEN,
    SET_PANGO_CARD_RESULT,
    PAY_WITH_BIT_DEEPLINK_RESULT,
    SET_CREDIT_CARD_RESULT,
    MOT_TRIP_ALGORITHM,
    BOTTOM_SHEET_STATE_CHANGED,
    WEB_AUTH_VERIFIED,
    TOUCHPASS_MIGRATION,
    LICENSE_SET,
    OFF_ROUTE_DETECTED,
    REPORT_CLICK,
    QR_READ,
    AD,
    IAM_SHOWN,
    IAM_CLOSED,
    IAM_DISMISSED,
    IAM_MESSAGE_CLICK,
    IAM_BUTTON_CLICK,
    MICRO_MOBILITY_PURCHASE_RESULT,
    MICRO_MOBILITY_ACTION_RESULT,
    EMAIL_AUTH_VERIFIED,
    WEB_RESULT,
    WEB_LOGIN,
    SUBSCRIPTION_RESULT,
    SUBSCRIPTION_RESTORE_RESULT,
    SUBSCRIPTIONS_OFFERS,
    NOTIFY_DRIVER_SUCCESS,
    NOTIFY_DRIVER_FAILED,
    EXPERIMENT_DATA,
    DATA_LOADED
}

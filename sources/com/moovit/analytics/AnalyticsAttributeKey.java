package com.moovit.analytics;

public enum AnalyticsAttributeKey {
    FLOW_KEY_ID,
    REQUEST_SEQUENCE_ID,
    REQUEST_SERVICE_ID,
    ACTIVITY_NAME,
    READ_TRANSIT_STOPS_LOCAL_COUNT,
    READ_TRANSIT_STOPS_REMOTE_COUNT,
    READ_TRANSIT_LINES_LOCAL_COUNT,
    READ_TRANSIT_LINES_REMOTE_COUNT,
    READ_TRANSIT_LINE_GROUPS_LOCAL_COUNT,
    READ_TRANSIT_LINE_GROUPS_REMOTE_COUNT,
    MAP_FOLLOW_MODE,
    MAP_ZOOM,
    GPS_STATUS,
    GOOGLE_PLAY_ERROR_TYPE,
    GOOGLE_PLAY_STATUS_CODE,
    GOOGLE_PLAY_ERROR_MESSAGE,
    GOOGLE_PLAY_ACTION,
    GOOGLE_PLAY_DATA,
    METRO_ID,
    METRO_REVISION,
    SUCCESS,
    CHANGES_SUM,
    STATE,
    SHARE_VIA,
    WEB_VIEW_URL,
    FROM_METRO,
    TO_METRO,
    MAP_ID,
    BUTTON_CLICK,
    REQUEST_RESPONSE_CODE,
    STOP_ID,
    STOP_NAME,
    LINE_ID,
    STOPS_COUNT,
    LINES_COUNT,
    COUNT,
    TYPE,
    REASON,
    SET_MAP_SETTINGS,
    AVAILABLE_MAP_SETTINGS,
    CHOSEN_TIME,
    IS_LOCATION_SET,
    IS_FAVORITE,
    PUBLISHER,
    BALANCE,
    CURRENCY_CODE,
    AMOUNT,
    TRANSIT_TYPE,
    SCHEDULE_TYPE,
    FULL_SCHEDULE_DISPLAY_TYPE,
    IS_RECENT,
    INTRO_STEPS_SEEN,
    USER_CREATION_FAILURE_REASON,
    SELECTED_METRO_ID,
    MAX,
    URI,
    URL,
    IS_SCROLLED,
    ACTION,
    SECONDARY_ACTION,
    DISTANCE,
    SOURCE,
    ID,
    ITEM_ID,
    VEHICLE_TYPE_ID,
    VEHICLE_TYPE_NAME,
    AVAILABLE_SETTINGS_MASK,
    SET_SETTINGS_MASK,
    PROVIDER,
    SECONDS,
    LATENCY,
    FROM,
    TO,
    DEEP_LINK,
    TICKET,
    IS_VALID,
    ERROR_CODE,
    ERROR_MESSAGE,
    IS_CHECKED,
    FROM_STOP,
    TO_STOP,
    SELECTED_ITEM,
    LOCALE,
    RADIUS,
    IS_REAL_TIME,
    RIDE_ID,
    SORT_TYPE,
    ANALYTICS_FLOW_KEY_ID,
    TAGS,
    SESSION_ID,
    POPULAR,
    IS_DARK_MODE,
    NUM_OF_CORES,
    SUPPORTED_ABIS,
    TOTAL_MEMORY,
    AVAILABLE_MEMORY,
    TOTAL_INTERNAL_STORAGE,
    AVAILABLE_INTERNAL_STORAGE,
    TAXI_REGISTRATION_PHONE_NUMBER_VALIDATION,
    TAXI_REGISTRATION_PHONE_NUMBER,
    TAXI_ORDER_ORIGIN_ADDRESS,
    TAXI_ORDER_LOCATION_TYPE,
    TAXI_ORDER_HOUSE_NUMBER,
    TAXI_ORDER_MAP_MOVES,
    TAXI_ORDER_ID,
    TAXI_ORDER_PREVIOUS_ID,
    TAXI_ORDER_STATUS,
    TAXI_APP_INSTALLED,
    OPEN_TAXI_PROVIDER_APP,
    HAS_PROMOTION,
    PUSH_ID,
    PUSH_TYPE,
    PUSH_TOPIC,
    DIALOG_ACTION_TYPE,
    NAVIGABLE_ID,
    NAVIGATION_PROGRESS_TYPE,
    CLOSE_NAVIGABLE,
    IS_NOTIFICATION_ALERTS_ENABLED,
    IS_USER_VISIBLE,
    IS_FOREGROUND,
    ADD_FAVORITE,
    REPORT_TYPE,
    AB_TESTING_VARIABLE_NAME,
    AB_TESTING_VARIABLE_VALUE,
    SET_AS_DEFAULT,
    IS_IN_REFINE_MODE,
    IS_LOCATION_DESCRIPTORS_SET,
    TRIP_PLAN_TIME_TYPE,
    QUERY_STRING,
    SELECTED_TYPE,
    SELECTED_ID,
    SELECTED_CAPTION,
    SELECTED_GEOCODER_ID,
    SELECTED_INDEX,
    SELECTED_INACCURATE,
    SELECTED_FROM_HISTORY,
    SELECTED_FROM_TOP_LOCATION,
    SELECTED_LOCATION,
    NUMBER_OF_RESULTS,
    BACKSPACES_COUNT,
    CLEAR_TEXT_COUNT,
    UP_ARROW_COUNT,
    IS_SHOW_DETAILS_ACTION_CLICKED,
    FACEBOOK_IS_LIKED,
    FACEBOOK_COMPLETION,
    ARRIVING,
    ITINERARY_STEP_TYPE,
    ITINERARY_STEP_INDEX,
    ITINERARY_INDEX,
    NUMBER_OF_ITINERARIES,
    NUMBER_OF_STEPS,
    ITINERARY_GUID,
    NEW_ETA,
    BATTERY_CONSUMPTION,
    TOTAL_STOPS_IN_STEP,
    TOTAL_TIME_IN_STEP_MINUTES,
    STOP_INDEX,
    NUM_OF_ALTERNATIVES,
    LINE_CHANGED,
    LEGS_WITH_ALTERNATIVES,
    ROUTE_TYPE,
    NUM_OF_WAIT_ON_VEHICLE_LEGS,
    CARPOOL_RIDE_ID,
    CARPOOL_CREDIT_CARD_CLIENT_VALIDATION,
    CARPOOL_CREDIT_CARD_ZOOZ_VALIDATION,
    CARPOOL_SEARCH_SUGGESTED_RIDES_COUNT,
    CARPOOL_SEARCH_OTHER_RIDES_COUNT,
    CARPOOL_NUM_RIDES,
    REPORT_ID,
    CUSTOMER_ID,
    IS_LOCATION_SEARCH,
    DETOUR_REQUESTED,
    CONTAINS_PUBLIC_TRANSPORTATION,
    IS_NEW_DRIVER,
    IS_WAZE_CARPOOL_INSTALLED,
    REDIRECT_TYPE,
    LOCATIONS_COUNT,
    SCORE,
    STATUS,
    TIME,
    DATE,
    TRIGGER_TYPE_ID,
    CUSTOM_DATA,
    IS_LOGGED_IN,
    STRING_PICKER_SELECTED_ITEM,
    LINE_GROUP_ID,
    SERVICE_ALERT_TYPE,
    TWITTER_SHOWN,
    AGENCY_NAME,
    AGENCY_ID,
    ALERT_ID,
    NEW_ENTITY,
    SHARED_ENTITY_TYPE,
    SHARED_ENTITY_ID,
    FAVORITE_TYPE,
    FAVORITE_LINES_COUNT,
    FAVORITE_STOP_DISPLAY_COUNT,
    IS_CONNECTED_TO_STOP,
    LABEL_EDIT,
    LOCATION_EDIT,
    IS_EMPTY,
    EMPTY_STATE_SHOWN,
    IS_FIRST_TIME,
    REFERRAL_CODE,
    ORIGIN,
    DESTINATION,
    DEPARTURE_TIME,
    ARRIVAL_TIME,
    ADDRESS_TYPE,
    WHEELCHAIR_ACCESSIBLE,
    WALKING_ROUTE,
    AUTO_SEND,
    SERVER_RESPONSE,
    USER_TYPE,
    REQUEST_ID,
    NEW_COUPON,
    RIDE_STATE,
    PRICE_SET,
    RECOMMENDED,
    RED_BADGE_COUNT,
    UNREAD_MESSAGES_COUNT,
    TOTAL_MESSAGES_COUNT,
    NOTIFICATION_ENTITY_ID,
    BACKGROUND_LOCATION_TRACKING_STATE,
    SELLING_DATA_STATE,
    PERSONALIZED_ADS_STATE,
    GEOCODER_ENGINE,
    INACCURATE_COORDS,
    ACCURATE_COORDS,
    LOCATION_PERMISSIONS,
    LOCATION_PROVIDERS,
    IS_LOCATION_ENABLED,
    HAS_CAMERA_PERMISSION,
    ZOOM_IN,
    PROVIDER_VALIDATION_COUNT,
    ACTIVE_COUNT,
    VALID_COUNT,
    PASSBOOK_VALID_COUNT,
    ACTIVATION_DIALOG_STATE,
    IS_STORED_VALUE_SUPPORTED,
    IS_MIGRATED_USER,
    HAS_BIT_INSTALLED,
    MANUAL_SELECTION,
    IS_PRIMARY_CREDIT_CARD,
    PRIMARY_AMOUNT,
    SECONDARY_AMOUNT,
    IS_RESERVATION,
    DURATION,
    TIME_TO_PICKUP,
    PICK_UP,
    DROP_OFF,
    WALK_TO_PICKUP_TIME,
    WALK_TO_DESTINATION_TIME,
    TOD_RIDE_ACTION,
    TOD_VEHICLE_ACTION,
    TOD_PROVIDER_NAME,
    NUMBER_OF_ACCESSIBLE_SEATS,
    DEPART_NOW,
    SELECTED_DAYS,
    TOD_VEHICLE_LICENSE_PLATE,
    TOD_COLOR_ARGB,
    TOD_AC_FAN,
    TOD_AC_TEMP,
    TOD_AC_ENABLED,
    RATING,
    RATABLE,
    HAS_COMMENT,
    BOTTOM_SHEET_STATE,
    BREAK_STATUS,
    CURRENT_WAYPOINT_ID,
    NAVIGABLE_WAYPOINT_ID,
    NAVIGABLE_WAYPOINT_NUM_PICK_UPS,
    NAVIGABLE_WAYPOINT_NUM_DROP_OFFS,
    NUM_ORDERS_IN_VEHICLE,
    CURRENT_WAYPOINT_PICKUP_ORDER_IDS,
    CURRENT_WAYPOINT_DROP_OFF_ORDER_IDS,
    NAVIGABLE_WAYPOINT_PICKUP_ORDER_IDS,
    NAVIGABLE_WAYPOINT_DROP_OFF_ORDER_IDS,
    HAS_ARRIVAL_REPORTED,
    PICKUP_ORDER_IDS,
    DROP_OFF_ORDER_IDS,
    PICKUP_ORDER_IDS_ACCEPTED,
    PICKUP_ORDER_IDS_REJECTED,
    HAS_UPCOMING_BREAK,
    HAS_ACTIVE_BREAK,
    ZONE_ID,
    TRIP_ID,
    ORIGIN_INDEX,
    DESTINATION_INDEX,
    IS_CLOSEST_STATION,
    IS_TEST_DEVICE,
    BANNER_TYPE,
    AD_ID_KEY,
    AD_ID,
    BUTTON_ID,
    BUTTON_TEXT,
    CAMPAIGN,
    IAM_ID,
    IAM_TYPE,
    IAM_TP,
    BANK_NAME,
    DATA_SHARING_STATE,
    NUMBER_OF_OPTIONS,
    RESULTS_QUERY_STRING,
    IS_DEFERRED,
    IS_BLOCKED,
    PREDICTED_LINE_ID
}

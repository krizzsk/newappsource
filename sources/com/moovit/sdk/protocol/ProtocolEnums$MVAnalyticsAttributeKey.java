package com.moovit.sdk.protocol;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.location.places.Place;

public enum ProtocolEnums$MVAnalyticsAttributeKey {
    REQUEST_SEQUENCE_ID(1),
    METRO_ID(AdError.INTERNAL_ERROR_CODE),
    STOP_ID(AdError.INTERNAL_ERROR_2003),
    REQUESTED_OBJECT_ID(1002),
    REDIS_DURATION_MS(Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3),
    NEXT_BUS_DUTATION_MS(1004),
    TOTAL_DURATION_MS(1005),
    CLOUD_SEARCH_DURATION_MS(Place.TYPE_FLOOR),
    GEOCODER_DURATION_MS(1007),
    CLOUD_SEARCH_OTHER_RESPONSE_COUNT(Place.TYPE_LOCALITY),
    SIMILAR_ITINERARY_SUB_OPTION_NUMBER(10010),
    WALK_POLYLINE_HAS_RESPONSE(10011),
    OTP_DURATION_MS(10012),
    NUMBER_OF_RESULTS(10013),
    DB_DURATION_MS(10014),
    ACTIVE_LINES_COUNT(10015),
    INACTIVE_LINES_COUNT(10016),
    ADVERTISING_ID(10017),
    ANDROID_ID(10018),
    NUMBER_IF_MISSING_SYNC_ENTITIES(10019),
    MISSING_SYNC_ENTITIES_DATA(10020),
    SURVEY_ID(10021),
    SURVEY_PARAM_NAME(10022),
    SURVEY_PARAM_VALUE(10023),
    LATITUDE(10024),
    LONGITUDE(10025),
    SERVICE_NAME(10026),
    REQUEST_URI(10027),
    ORIGIN_ENTITY_ID(10028),
    NUMBER_OF_STOP_GAME_IMPRESSIONS(10029),
    AGENCY_ID(AdError.CACHE_ERROR_CODE),
    LINE_NUMBER(AdError.INTERNAL_ERROR_2004),
    HEADSIGN(2005),
    DIRECTION(AdError.INTERNAL_ERROR_2006),
    HAS_GTFS_ARRIVALS(2007),
    IS_AGENCY_AND_LINE_NUMBER_MATCHED(AdError.REMOTE_ADS_SERVICE_ERROR),
    MATCH_MODE(AdError.INTERSTITIAL_AD_TIMEOUT),
    PROVIDER_DIRECTION(20010),
    PROVIDER_HEADSIGN(20011),
    NEXT_ARRIVAL_RT(20012),
    NEXT_BUS_CACHE_MODE(20013),
    IS_VALID_FOR_RT(20014),
    HIT_STATUS(20015),
    NEXT_BUS_CLIENT_ID(20016),
    RT_REQUEST_UUID(20017),
    RT_EXPIRATION_TIME(20018),
    MATCH_SCORE(20019),
    RT_STATE_DESCRIPTION(20020),
    RT_LINE_ID(20021),
    TRIP_PATTERN_ID(20022),
    RT_ETA_1(20023),
    RT_ETA_2(20024),
    RT_ETA_3(20025),
    TRIP_ID(20026),
    NB_NUM_OF_ROUTES_IN_REQUEST(3001),
    NB_NUM_OF_ENTS_IN_RESPONSE(AuthApiStatusCodes.AUTH_API_CLIENT_ERROR),
    NB_RESPONSE_STATUS(AuthApiStatusCodes.AUTH_API_SERVER_ERROR),
    NB_HTTP_RESPONSE_CODE(AuthApiStatusCodes.AUTH_TOKEN_ERROR),
    NB_ERRORS(AuthApiStatusCodes.AUTH_URL_RESOLUTION),
    NB_STOP_ID_REQUESTED(AuthApiStatusCodes.AUTH_APP_CERT_ERROR),
    NB_PROVIDER_QUERY_DURATION(3007),
    NB_PARSE_RESPONSE_DURATION(3008),
    NB_CONCURRENCY_COUNTER(3009),
    NB_CONF_ID(30010),
    NB_CONCURRENCY_LIMIT(30011),
    USER_IP_ADDR(40010),
    SERVER_TYPE(40011),
    SERVER_ENVIRONMENT(40012),
    SERVER_HOSTNAME(40013),
    SERVER_VERSION(40014),
    SCREEN_NAME(3),
    SCREEN_SOURCE(40),
    READ_STOPS_LOCAL_COUNT(41),
    READ_STOPS_REMOTE_COUNT(42),
    READ_LINES_LOCAL_COUNT(43),
    READ_LINES_REMOTE_COUNT(44),
    READ_LINE_GROUPS_LOCAL_COUNT(45),
    READ_LINE_GROUPS_REMOTE_COUNT(46),
    MAP_ZOOM(49),
    GPS_STATE(50),
    MAP_FOLLOW_MODE_STATE(51),
    REQUEST_SERVER_SERVICE_TYPE_ID(52),
    WALKING_POLYLINE_DISTANCE(53),
    GOOGLE_PLAY_ERROR_TYPE(54),
    GOOGLE_PLAY_STATUS_CODE(55),
    GOOGLE_PLAY_ERROR_MESSAGE(56),
    GOOGLE_PLAY_ACTION(57),
    GOOGLE_PLAY_DATA(58),
    METRO_REVISION(59),
    SUCCESS(60),
    CHANGES_SUM(61),
    STATE(62),
    SHARE_VIA(63),
    WEB_VIEW_URL(64),
    FROM_METRO(65),
    TO_METRO(66),
    MAP_ID(67),
    BUTTON_CLICK(68),
    RESPONSE_CODE(69),
    NEAR_ME_RESULT_TYPE(70),
    STOPS_COUNT(71),
    LINES_COUNT(72),
    INTRO_STEPS_SEEN(73),
    USER_CREATION_FAILURE_REASON(74),
    SELECTED_METRO_ID(75),
    TAXI_REGISTRATION_PHONE_NUMBER_VALIDATION(76),
    TAXI_REGISTRATION_PHONE_NUMBER(77),
    TAXI_ORDER_ORIGIN_ADDRESS(78),
    TAXI_ORDER_LOCATION_TYPE(79),
    TAXI_ORDER_HOUSE_NUMBER(80),
    TAXI_ORDER_MAP_MOVES(81),
    TAXI_ORDER_ID(82),
    TAXI_ORDER_PREVIOUS_ID(83),
    TAXI_ORDER_STATUS(84),
    TAXI_APP_INSTALLED(85),
    FLOW_KEY_ID(87),
    LINE_ID(88),
    NAVIGABLE_ID(89),
    NAVIGATION_PROGRESS_TYPE(90),
    CLOSE_NAVIGABLE(91),
    IS_NOTIFICATION_ALERTS_ENABLED(92),
    IS_USER_VISIBLE(93),
    IS_FOREGROUND(94),
    ADD_FAVORITE(95),
    REPORT_TYPE(96),
    AB_TESTING_VARIABLE_NAME(97),
    AB_TESTING_VARIABLE_VALUE(98),
    STOPS_FOUND(101),
    STOPS_NOT_FOUND(102),
    FAILED_IN_OTHER_METRO(103),
    FAILED_NO_GPS(104),
    FAILED_UNEXPECTED_ERROR(105),
    NEW_INSTALL(106),
    NO_REFRESH(107),
    LINES_FOUND(108),
    POPUP_DISPLAY_METHOD(123),
    DIALOG_ACTION_TYPE(109),
    SET_AS_DEFAULT(110),
    IS_IN_REFINE_MODE(111),
    IS_LOCATION_DESCRIPTORS_SET(112),
    COUNT(113),
    MAX_QUERY_LENGTH(114),
    MAX_RESULTS_COUNT(115),
    CHOSEN_RESULT_INDEX(137),
    ARRIVING(118),
    RATING(119),
    FACEBOOK_IS_LIKED(120),
    FACEBOOK_COMPLETION(121),
    TYPE(122),
    REASON(124),
    ITINERARY_STEP_TYPE(125),
    ITINERARY_STEP_NUMBER(126),
    ITINERARY_INDEX(132),
    NUMBER_OF_ITINERARIES(133),
    NUMBER_OF_STEPS(134),
    ITINERARY_STEP_INDEX(135),
    ITINERARY_GUID(136),
    TAXI_PRICE_IS_RANGE(127),
    TAXI_PRICE_IS_PROMOTION(RecyclerView.C1119a0.FLAG_IGNORE),
    TAXI_PRICE(129),
    PUSH_ID(86),
    PUSH_TYPE(99),
    PUSH_TOPIC(130),
    OPEN_TAXI_PROVIDER_APP(131),
    NEW_ETA(138),
    PATH_STOP_INDEX(139),
    BATTERY_CONSUMPTION(140),
    TOTAL_STOPS_IN_STEP(141),
    TOTAL_TIME_IN_STEP_MINUTES(142),
    QUERY_STRING(143),
    SELECTED_TYPE(144),
    SELECTED_ID(145),
    SELECTED_CAPTION(146),
    SELECTED_GEOCODER_ID(147),
    SELECTED_INDEX(148),
    SELECTED_INACCURATE(149),
    SELECTED_FROM_HISTORY(150),
    BACKSPACES_COUNT(151),
    CLEAR_TEXT_COUNT(152),
    UP_ARROW_COUNT(153),
    REPORT_ID(154),
    CUSTOMER_ID(155),
    IS_LOCATION_SEARCH(156),
    ROLLOUT_VALUE(157),
    ANALYTICS_FLOW_KEY_ID(158),
    EMPTY_STATE_SHOWN(159),
    BIKES_COUNT(160),
    DRIVE_NOW_COUNT(161),
    CAMPAIGNS_COUNT(162),
    CARPOOL_RIDE_ID(163),
    CARPOOL_CREDIT_CARD_CLIENT_VALIDATION(164),
    CARPOOL_CREDIT_CARD_ZOOZ_VALIDATION(165),
    CLOUD_SEARCH_DOMAIN_END_POINT(166),
    CLOUD_SEARCH_DOMAIN_RESPONSE_COUNT(167),
    CLOUD_SEARCH_REQUESTS_NUM(168),
    CARPOOL_SEARCH_SUGGESTED_RIDES_COUNT(169),
    CARPOOL_SEARCH_OTHER_RIDES_COUNT(170),
    SET_MAP_SETTINGS(171),
    AVAILABLE_MAP_SETTINGS(172),
    FAVORITE_TYPE(173),
    FAVORITE_SAVED(174),
    REDIRECT_TYPE(175),
    LOCATIONS_COUNT(178),
    SCORE(179),
    STATUS(181),
    LOCATION_IS_SET(182),
    TIME(183),
    ADS_ID(184),
    IS_LOGGED_IN(185),
    INITIATOR_FLOW_KEY(186),
    TRIGGER_TYPE_ID(187),
    CUSTOM_DATA(188),
    RED_BADGE_COUNT(189),
    UNREAD_MESSAGES_COUNT(190),
    TOTAL_MESSAGES_COUNT(191),
    ADS_STATE(192),
    HOME_NOTIFICATIONS_CHECKED(193),
    WORK_NOTIFICATIONS_CHECKED(194),
    FROM_FLOW(195),
    TO_FLOW(196),
    HAS_PROMOTION(197),
    STRING_PICKER_SELECTED_ITEM(198),
    LINE_GROUP_ID(199),
    SERVICE_ALERT_TYPE(200),
    STOP_VIEW_ICON(201),
    SELECTED_FROM_TOP_LOCATIONS(202),
    AGENCY_NAME(203),
    TWITTER_SHOWN(204),
    CHOSEN_TIME(205),
    NEW_ENTITY(206),
    CARPOOL_NUM_RIDES(207),
    FROM_STOP(208),
    TO_STOP(209),
    IS_RECURRING_RIDE(210),
    RIDE_STATE(211),
    NUM_OF_REQ(212),
    NUM_OF_APPROVED(213),
    RIDE_ID(214),
    PASSENGER_STATE(215),
    IS_NEW_DRIVER(216),
    DESTINATION(217),
    DEEP_LINK(218),
    IS_EMPTY(219),
    ALLOW_LOCATION(220),
    ALLOW_PERMISSIONS(221),
    IS_FIRST_TIME(222),
    IS_FAVORITE(223),
    ORIGIN_STEP(224),
    PUBLISHER_NAME(225),
    BALANCE(226),
    DETOUR_REQUESTED(227),
    ORIGIN(228),
    SHARED_ENTITY_TYPE(229),
    SHARED_ENTITY_ID(230),
    CHANGE_METRO_CLICKED(231),
    STAY_IN_METRO_CLICKED(232),
    IS_BEST_WAY_SET(233),
    IS_CARPOOL_BEST_WAY_SET(234),
    IS_HOME_WORK_FAVORITES_SET(236),
    CONTAINS_PUBLIC_TRANS(237),
    CARPOOL_TO_STOP(238),
    CARPOOL_FROM_STOP(239),
    LEGS_WITH_ALTERNATIVES(240),
    NUM_OF_ALTERNATIVES(241),
    LINE_CHANGED(242),
    MORE_DETAILS_SCHEDULES_CLICKED(243),
    PRICE_RANK(235),
    FAVORITE_LINES_COUNT(244),
    FAVORITE_STOP_DISPLAY_COUNT(245),
    IS_CONNECTED_TO_STOP(246),
    SEVER_RESPONSE(247),
    REFERRAL_CODE(248),
    RIDE_FINAL_PRICE(249),
    COUPON(250),
    SERVER_RESPONSE(251),
    PARKING_CELL_STATE(252),
    MAP_MOVED(253),
    ADDRESS_TYPE(254),
    TRANSIT_TYPE(ValidationUtils.APPBOY_STRING_MAX_LENGTH),
    IS_RECENT(256),
    AUTO_SEND(257),
    WHEELCHAIR_ACCESSIBLE(258),
    WALKING_ROUTE(259),
    SHARE_TYPE(260),
    GOOGLE_SEARCH_FAILURE_REASON(261),
    MOOVIT_SEARCH_FAILURE_REASON(262),
    NUM_OF_CORES(263),
    SUPPORTED_ABIS(264),
    TOTAL_MEMORY(265),
    AVAILABLE_MEMORY(266),
    TOTAL_INTERNAL_STORAGE(267),
    AVAILABLE_INTERNAL_STORAGE(268),
    ROUTE_TYPE(269),
    PHONE_NUMBER(270),
    BIKE_ROUTE(271),
    ALLOW_AUTO_CONFIRMED(272),
    CURRENT_REMINDER_SETTINGS(273),
    MAX(274),
    LINE_FROM_LIST(275),
    USER_TYPE(276),
    REQUEST_ID(277),
    NEW_COUPON(278),
    PRICE_SET(279),
    RECOMMENDED(280),
    OS_VERSION_NAME(281),
    GO_TO_STATION_CLICKED_MAP(282),
    GO_TO_STATION_CLICKED_CARD(283),
    URI(284);
    
    private final int value;

    private ProtocolEnums$MVAnalyticsAttributeKey(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVAnalyticsAttributeKey findByValue(int i) {
        if (i == 1) {
            return REQUEST_SEQUENCE_ID;
        }
        if (i != 3) {
            if (i == 178) {
                return LOCATIONS_COUNT;
            }
            if (i == 179) {
                return SCORE;
            }
            switch (i) {
                case 3:
                    break;
                case 181:
                    return STATUS;
                case 182:
                    return LOCATION_IS_SET;
                case 183:
                    return TIME;
                case 184:
                    return ADS_ID;
                case 185:
                    return IS_LOGGED_IN;
                case 186:
                    return INITIATOR_FLOW_KEY;
                case 187:
                    return TRIGGER_TYPE_ID;
                case 188:
                    return CUSTOM_DATA;
                case 189:
                    return RED_BADGE_COUNT;
                case 190:
                    return UNREAD_MESSAGES_COUNT;
                case 191:
                    return TOTAL_MESSAGES_COUNT;
                case 192:
                    return ADS_STATE;
                case 193:
                    return HOME_NOTIFICATIONS_CHECKED;
                case 194:
                    return WORK_NOTIFICATIONS_CHECKED;
                case 195:
                    return FROM_FLOW;
                case 196:
                    return TO_FLOW;
                case 197:
                    return HAS_PROMOTION;
                case 198:
                    return STRING_PICKER_SELECTED_ITEM;
                case 199:
                    return LINE_GROUP_ID;
                case 200:
                    return SERVICE_ALERT_TYPE;
                case 201:
                    return STOP_VIEW_ICON;
                case 202:
                    return SELECTED_FROM_TOP_LOCATIONS;
                case 203:
                    return AGENCY_NAME;
                case 204:
                    return TWITTER_SHOWN;
                case 205:
                    return CHOSEN_TIME;
                case 206:
                    return NEW_ENTITY;
                case 207:
                    return CARPOOL_NUM_RIDES;
                case 208:
                    return FROM_STOP;
                case 209:
                    return TO_STOP;
                case 210:
                    return IS_RECURRING_RIDE;
                case 211:
                    return RIDE_STATE;
                case 212:
                    return NUM_OF_REQ;
                case 213:
                    return NUM_OF_APPROVED;
                case 214:
                    return RIDE_ID;
                case 215:
                    return PASSENGER_STATE;
                case 216:
                    return IS_NEW_DRIVER;
                case 217:
                    return DESTINATION;
                case 218:
                    return DEEP_LINK;
                case 219:
                    return IS_EMPTY;
                case 220:
                    return ALLOW_LOCATION;
                case 221:
                    return ALLOW_PERMISSIONS;
                case 222:
                    return IS_FIRST_TIME;
                case 223:
                    return IS_FAVORITE;
                case 224:
                    return ORIGIN_STEP;
                case 225:
                    return PUBLISHER_NAME;
                case 226:
                    return BALANCE;
                case 227:
                    return DETOUR_REQUESTED;
                case 228:
                    return ORIGIN;
                case 229:
                    return SHARED_ENTITY_TYPE;
                case 230:
                    return SHARED_ENTITY_ID;
                case 231:
                    return CHANGE_METRO_CLICKED;
                case 232:
                    return STAY_IN_METRO_CLICKED;
                case 233:
                    return IS_BEST_WAY_SET;
                case 234:
                    return IS_CARPOOL_BEST_WAY_SET;
                case 235:
                    return PRICE_RANK;
                case 236:
                    return IS_HOME_WORK_FAVORITES_SET;
                case 237:
                    return CONTAINS_PUBLIC_TRANS;
                case 238:
                    return CARPOOL_TO_STOP;
                case 239:
                    return CARPOOL_FROM_STOP;
                case 240:
                    return LEGS_WITH_ALTERNATIVES;
                case 241:
                    return NUM_OF_ALTERNATIVES;
                case 242:
                    return LINE_CHANGED;
                case 243:
                    return MORE_DETAILS_SCHEDULES_CLICKED;
                case 244:
                    return FAVORITE_LINES_COUNT;
                case 245:
                    return FAVORITE_STOP_DISPLAY_COUNT;
                case 246:
                    return IS_CONNECTED_TO_STOP;
                case 247:
                    return SEVER_RESPONSE;
                case 248:
                    return REFERRAL_CODE;
                case 249:
                    return RIDE_FINAL_PRICE;
                case 250:
                    return COUPON;
                case 251:
                    return SERVER_RESPONSE;
                case 252:
                    return PARKING_CELL_STATE;
                case 253:
                    return MAP_MOVED;
                case 254:
                    return ADDRESS_TYPE;
                case ValidationUtils.APPBOY_STRING_MAX_LENGTH:
                    return TRANSIT_TYPE;
                case 256:
                    return IS_RECENT;
                case 257:
                    return AUTO_SEND;
                case 258:
                    return WHEELCHAIR_ACCESSIBLE;
                case 259:
                    return WALKING_ROUTE;
                case 260:
                    return SHARE_TYPE;
                case 261:
                    return GOOGLE_SEARCH_FAILURE_REASON;
                case 262:
                    return MOOVIT_SEARCH_FAILURE_REASON;
                case 263:
                    return NUM_OF_CORES;
                case 264:
                    return SUPPORTED_ABIS;
                case 265:
                    return TOTAL_MEMORY;
                case 266:
                    return AVAILABLE_MEMORY;
                case 267:
                    return TOTAL_INTERNAL_STORAGE;
                case 268:
                    return AVAILABLE_INTERNAL_STORAGE;
                case 269:
                    return ROUTE_TYPE;
                case 270:
                    return PHONE_NUMBER;
                case 271:
                    return BIKE_ROUTE;
                case 272:
                    return ALLOW_AUTO_CONFIRMED;
                case 273:
                    return CURRENT_REMINDER_SETTINGS;
                case 274:
                    return MAX;
                case 275:
                    return LINE_FROM_LIST;
                case 276:
                    return USER_TYPE;
                case 277:
                    return REQUEST_ID;
                case 278:
                    return NEW_COUPON;
                case 279:
                    return PRICE_SET;
                case 280:
                    return RECOMMENDED;
                case 281:
                    return OS_VERSION_NAME;
                case 282:
                    return GO_TO_STATION_CLICKED_MAP;
                case 283:
                    return GO_TO_STATION_CLICKED_CARD;
                case 284:
                    return URI;
                case Place.TYPE_LOCALITY /*1009*/:
                    return CLOUD_SEARCH_OTHER_RESPONSE_COUNT;
                case 20010:
                    return PROVIDER_DIRECTION;
                case 20011:
                    return PROVIDER_HEADSIGN;
                case 20012:
                    return NEXT_ARRIVAL_RT;
                case 20013:
                    return NEXT_BUS_CACHE_MODE;
                case 20014:
                    return IS_VALID_FOR_RT;
                case 20015:
                    return HIT_STATUS;
                case 20016:
                    return NEXT_BUS_CLIENT_ID;
                case 20017:
                    return RT_REQUEST_UUID;
                case 20018:
                    return RT_EXPIRATION_TIME;
                case 20019:
                    return MATCH_SCORE;
                case 20020:
                    return RT_STATE_DESCRIPTION;
                case 20021:
                    return RT_LINE_ID;
                case 20022:
                    return TRIP_PATTERN_ID;
                case 20023:
                    return RT_ETA_1;
                case 20024:
                    return RT_ETA_2;
                case 20025:
                    return RT_ETA_3;
                case 20026:
                    return TRIP_ID;
                case 30010:
                    return NB_CONF_ID;
                case 30011:
                    return NB_CONCURRENCY_LIMIT;
                case 40010:
                    return USER_IP_ADDR;
                case 40011:
                    return SERVER_TYPE;
                case 40012:
                    return SERVER_ENVIRONMENT;
                case 40013:
                    return SERVER_HOSTNAME;
                case 40014:
                    return SERVER_VERSION;
                default:
                    switch (i) {
                        case 40:
                            return SCREEN_SOURCE;
                        case 41:
                            return READ_STOPS_LOCAL_COUNT;
                        case 42:
                            return READ_STOPS_REMOTE_COUNT;
                        case 43:
                            return READ_LINES_LOCAL_COUNT;
                        case 44:
                            return READ_LINES_REMOTE_COUNT;
                        case 45:
                            return READ_LINE_GROUPS_LOCAL_COUNT;
                        case 46:
                            return READ_LINE_GROUPS_REMOTE_COUNT;
                        default:
                            switch (i) {
                                case 49:
                                    return MAP_ZOOM;
                                case 50:
                                    return GPS_STATE;
                                case 51:
                                    return MAP_FOLLOW_MODE_STATE;
                                case 52:
                                    return REQUEST_SERVER_SERVICE_TYPE_ID;
                                case 53:
                                    return WALKING_POLYLINE_DISTANCE;
                                case 54:
                                    return GOOGLE_PLAY_ERROR_TYPE;
                                case 55:
                                    return GOOGLE_PLAY_STATUS_CODE;
                                case 56:
                                    return GOOGLE_PLAY_ERROR_MESSAGE;
                                case 57:
                                    return GOOGLE_PLAY_ACTION;
                                case 58:
                                    return GOOGLE_PLAY_DATA;
                                case 59:
                                    return METRO_REVISION;
                                case 60:
                                    return SUCCESS;
                                case 61:
                                    return CHANGES_SUM;
                                case 62:
                                    return STATE;
                                case 63:
                                    return SHARE_VIA;
                                case 64:
                                    return WEB_VIEW_URL;
                                case 65:
                                    return FROM_METRO;
                                case 66:
                                    return TO_METRO;
                                case 67:
                                    return MAP_ID;
                                case 68:
                                    return BUTTON_CLICK;
                                case 69:
                                    return RESPONSE_CODE;
                                case 70:
                                    return NEAR_ME_RESULT_TYPE;
                                case 71:
                                    return STOPS_COUNT;
                                case 72:
                                    return LINES_COUNT;
                                case 73:
                                    return INTRO_STEPS_SEEN;
                                case 74:
                                    return USER_CREATION_FAILURE_REASON;
                                case 75:
                                    return SELECTED_METRO_ID;
                                case 76:
                                    return TAXI_REGISTRATION_PHONE_NUMBER_VALIDATION;
                                case 77:
                                    return TAXI_REGISTRATION_PHONE_NUMBER;
                                case 78:
                                    return TAXI_ORDER_ORIGIN_ADDRESS;
                                case 79:
                                    return TAXI_ORDER_LOCATION_TYPE;
                                case 80:
                                    return TAXI_ORDER_HOUSE_NUMBER;
                                case 81:
                                    return TAXI_ORDER_MAP_MOVES;
                                case 82:
                                    return TAXI_ORDER_ID;
                                case 83:
                                    return TAXI_ORDER_PREVIOUS_ID;
                                case 84:
                                    return TAXI_ORDER_STATUS;
                                case 85:
                                    return TAXI_APP_INSTALLED;
                                case 86:
                                    return PUSH_ID;
                                case 87:
                                    return FLOW_KEY_ID;
                                case 88:
                                    return LINE_ID;
                                case 89:
                                    return NAVIGABLE_ID;
                                case 90:
                                    return NAVIGATION_PROGRESS_TYPE;
                                case 91:
                                    return CLOSE_NAVIGABLE;
                                case 92:
                                    return IS_NOTIFICATION_ALERTS_ENABLED;
                                case 93:
                                    return IS_USER_VISIBLE;
                                case 94:
                                    return IS_FOREGROUND;
                                case 95:
                                    return ADD_FAVORITE;
                                case 96:
                                    return REPORT_TYPE;
                                case 97:
                                    return AB_TESTING_VARIABLE_NAME;
                                case 98:
                                    return AB_TESTING_VARIABLE_VALUE;
                                case 99:
                                    return PUSH_TYPE;
                                default:
                                    switch (i) {
                                        case 101:
                                            return STOPS_FOUND;
                                        case 102:
                                            return STOPS_NOT_FOUND;
                                        case 103:
                                            return FAILED_IN_OTHER_METRO;
                                        case 104:
                                            return FAILED_NO_GPS;
                                        case 105:
                                            return FAILED_UNEXPECTED_ERROR;
                                        case 106:
                                            return NEW_INSTALL;
                                        case 107:
                                            return NO_REFRESH;
                                        case 108:
                                            return LINES_FOUND;
                                        case 109:
                                            return DIALOG_ACTION_TYPE;
                                        case 110:
                                            return SET_AS_DEFAULT;
                                        case 111:
                                            return IS_IN_REFINE_MODE;
                                        case 112:
                                            return IS_LOCATION_DESCRIPTORS_SET;
                                        case 113:
                                            return COUNT;
                                        case 114:
                                            return MAX_QUERY_LENGTH;
                                        case 115:
                                            return MAX_RESULTS_COUNT;
                                        default:
                                            switch (i) {
                                                case 118:
                                                    return ARRIVING;
                                                case 119:
                                                    return RATING;
                                                case 120:
                                                    return FACEBOOK_IS_LIKED;
                                                case 121:
                                                    return FACEBOOK_COMPLETION;
                                                case 122:
                                                    return TYPE;
                                                case 123:
                                                    return POPUP_DISPLAY_METHOD;
                                                case 124:
                                                    return REASON;
                                                case 125:
                                                    return ITINERARY_STEP_TYPE;
                                                case 126:
                                                    return ITINERARY_STEP_NUMBER;
                                                case 127:
                                                    return TAXI_PRICE_IS_RANGE;
                                                case RecyclerView.C1119a0.FLAG_IGNORE:
                                                    return TAXI_PRICE_IS_PROMOTION;
                                                case 129:
                                                    return TAXI_PRICE;
                                                case 130:
                                                    return PUSH_TOPIC;
                                                case 131:
                                                    return OPEN_TAXI_PROVIDER_APP;
                                                case 132:
                                                    return ITINERARY_INDEX;
                                                case 133:
                                                    return NUMBER_OF_ITINERARIES;
                                                case 134:
                                                    return NUMBER_OF_STEPS;
                                                case 135:
                                                    return ITINERARY_STEP_INDEX;
                                                case 136:
                                                    return ITINERARY_GUID;
                                                case 137:
                                                    return CHOSEN_RESULT_INDEX;
                                                case 138:
                                                    return NEW_ETA;
                                                case 139:
                                                    return PATH_STOP_INDEX;
                                                case 140:
                                                    return BATTERY_CONSUMPTION;
                                                case 141:
                                                    return TOTAL_STOPS_IN_STEP;
                                                case 142:
                                                    return TOTAL_TIME_IN_STEP_MINUTES;
                                                case 143:
                                                    return QUERY_STRING;
                                                case 144:
                                                    return SELECTED_TYPE;
                                                case 145:
                                                    return SELECTED_ID;
                                                case 146:
                                                    return SELECTED_CAPTION;
                                                case 147:
                                                    return SELECTED_GEOCODER_ID;
                                                case 148:
                                                    return SELECTED_INDEX;
                                                case 149:
                                                    return SELECTED_INACCURATE;
                                                case 150:
                                                    return SELECTED_FROM_HISTORY;
                                                case 151:
                                                    return BACKSPACES_COUNT;
                                                case 152:
                                                    return CLEAR_TEXT_COUNT;
                                                case 153:
                                                    return UP_ARROW_COUNT;
                                                case 154:
                                                    return REPORT_ID;
                                                case 155:
                                                    return CUSTOMER_ID;
                                                case 156:
                                                    return IS_LOCATION_SEARCH;
                                                case 157:
                                                    return ROLLOUT_VALUE;
                                                case 158:
                                                    return ANALYTICS_FLOW_KEY_ID;
                                                case 159:
                                                    return EMPTY_STATE_SHOWN;
                                                case 160:
                                                    return BIKES_COUNT;
                                                case 161:
                                                    return DRIVE_NOW_COUNT;
                                                case 162:
                                                    return CAMPAIGNS_COUNT;
                                                case 163:
                                                    return CARPOOL_RIDE_ID;
                                                case 164:
                                                    return CARPOOL_CREDIT_CARD_CLIENT_VALIDATION;
                                                case 165:
                                                    return CARPOOL_CREDIT_CARD_ZOOZ_VALIDATION;
                                                case 166:
                                                    return CLOUD_SEARCH_DOMAIN_END_POINT;
                                                case 167:
                                                    return CLOUD_SEARCH_DOMAIN_RESPONSE_COUNT;
                                                case 168:
                                                    return CLOUD_SEARCH_REQUESTS_NUM;
                                                case 169:
                                                    return CARPOOL_SEARCH_SUGGESTED_RIDES_COUNT;
                                                case 170:
                                                    return CARPOOL_SEARCH_OTHER_RIDES_COUNT;
                                                case 171:
                                                    return SET_MAP_SETTINGS;
                                                case 172:
                                                    return AVAILABLE_MAP_SETTINGS;
                                                case 173:
                                                    return FAVORITE_TYPE;
                                                case 174:
                                                    return FAVORITE_SAVED;
                                                case 175:
                                                    return REDIRECT_TYPE;
                                                default:
                                                    switch (i) {
                                                        case 1002:
                                                            return REQUESTED_OBJECT_ID;
                                                        case Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3 /*1003*/:
                                                            return REDIS_DURATION_MS;
                                                        case 1004:
                                                            return NEXT_BUS_DUTATION_MS;
                                                        case 1005:
                                                            return TOTAL_DURATION_MS;
                                                        case Place.TYPE_FLOOR /*1006*/:
                                                            return CLOUD_SEARCH_DURATION_MS;
                                                        case 1007:
                                                            return GEOCODER_DURATION_MS;
                                                        default:
                                                            switch (i) {
                                                                case AdError.INTERNAL_ERROR_CODE:
                                                                    return METRO_ID;
                                                                case AdError.CACHE_ERROR_CODE:
                                                                    return AGENCY_ID;
                                                                case AdError.INTERNAL_ERROR_2003:
                                                                    return STOP_ID;
                                                                case AdError.INTERNAL_ERROR_2004:
                                                                    return LINE_NUMBER;
                                                                case 2005:
                                                                    return HEADSIGN;
                                                                case AdError.INTERNAL_ERROR_2006:
                                                                    return DIRECTION;
                                                                case 2007:
                                                                    return HAS_GTFS_ARRIVALS;
                                                                case AdError.REMOTE_ADS_SERVICE_ERROR:
                                                                    return IS_AGENCY_AND_LINE_NUMBER_MATCHED;
                                                                case AdError.INTERSTITIAL_AD_TIMEOUT:
                                                                    return MATCH_MODE;
                                                                default:
                                                                    switch (i) {
                                                                        case 3001:
                                                                            return NB_NUM_OF_ROUTES_IN_REQUEST;
                                                                        case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /*3002*/:
                                                                            return NB_NUM_OF_ENTS_IN_RESPONSE;
                                                                        case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /*3003*/:
                                                                            return NB_RESPONSE_STATUS;
                                                                        case AuthApiStatusCodes.AUTH_TOKEN_ERROR /*3004*/:
                                                                            return NB_HTTP_RESPONSE_CODE;
                                                                        case AuthApiStatusCodes.AUTH_URL_RESOLUTION /*3005*/:
                                                                            return NB_ERRORS;
                                                                        case AuthApiStatusCodes.AUTH_APP_CERT_ERROR /*3006*/:
                                                                            return NB_STOP_ID_REQUESTED;
                                                                        case 3007:
                                                                            return NB_PROVIDER_QUERY_DURATION;
                                                                        case 3008:
                                                                            return NB_PARSE_RESPONSE_DURATION;
                                                                        case 3009:
                                                                            return NB_CONCURRENCY_COUNTER;
                                                                        default:
                                                                            switch (i) {
                                                                                case 10010:
                                                                                    return SIMILAR_ITINERARY_SUB_OPTION_NUMBER;
                                                                                case 10011:
                                                                                    return WALK_POLYLINE_HAS_RESPONSE;
                                                                                case 10012:
                                                                                    return OTP_DURATION_MS;
                                                                                case 10013:
                                                                                    return NUMBER_OF_RESULTS;
                                                                                case 10014:
                                                                                    return DB_DURATION_MS;
                                                                                case 10015:
                                                                                    return ACTIVE_LINES_COUNT;
                                                                                case 10016:
                                                                                    return INACTIVE_LINES_COUNT;
                                                                                case 10017:
                                                                                    return ADVERTISING_ID;
                                                                                case 10018:
                                                                                    return ANDROID_ID;
                                                                                case 10019:
                                                                                    return NUMBER_IF_MISSING_SYNC_ENTITIES;
                                                                                case 10020:
                                                                                    return MISSING_SYNC_ENTITIES_DATA;
                                                                                case 10021:
                                                                                    return SURVEY_ID;
                                                                                case 10022:
                                                                                    return SURVEY_PARAM_NAME;
                                                                                case 10023:
                                                                                    return SURVEY_PARAM_VALUE;
                                                                                case 10024:
                                                                                    return LATITUDE;
                                                                                case 10025:
                                                                                    return LONGITUDE;
                                                                                case 10026:
                                                                                    return SERVICE_NAME;
                                                                                case 10027:
                                                                                    return REQUEST_URI;
                                                                                case 10028:
                                                                                    return ORIGIN_ENTITY_ID;
                                                                                case 10029:
                                                                                    return NUMBER_OF_STOP_GAME_IMPRESSIONS;
                                                                                default:
                                                                                    return null;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return SCREEN_NAME;
    }

    public int getValue() {
        return this.value;
    }
}

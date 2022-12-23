package com.tranzmate.moovit.protocol.kinesis;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.models.InAppMessageBase;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.nearby.messages.Strategy;

public enum MVAnalyticsFlowKey {
    WEAR_NEAR_ME(0),
    NEAR_ME(1),
    STOP_DETAIL(2),
    LINE_DETAIL(3),
    DASHBOARD(4),
    RIDE(5),
    MORE(6),
    OMNI_SEARCH(7),
    LOCATION_SEARCH(8),
    LINE_SCHEDULE(9),
    LINE_SCHEDULE_ITINERARY(10),
    SUGGEST_ROUTES(11),
    SETTINGS(12),
    TRIP_PLAN_SETTINGS(13),
    NOTIFICATION_SETTINGS(14),
    WEB_VIEW_SCREEN(15),
    SPREAD_THE_LOVE(16),
    TRANSPORTATION_MAPS(17),
    ABOUT(18),
    ACK(19),
    EDIT_PROFILE(20),
    AVATARS(21),
    TROPHIES(22),
    INTRO(23),
    USER_CREATION_FAILURE(24),
    CHANGE_METRO(25),
    SELECT_METRO(26),
    LINE_REPORTS_LIST(27),
    STOP_REPORTS_LIST(28),
    SERVICE_ALERT_DETAIL(29),
    NAMED_LOCATION(30),
    TRIP_HISTORY(31),
    ITINERARY(32),
    GOOGLE_AUTH_KEY_GENERATE(33),
    METRO_UPDATE_SERVICE(34),
    SWITCH_METRO(35),
    RATE_US(36),
    UPGRADE_LOADER(37),
    USER_LOADER(38),
    TAXI_REGISTRATION(39),
    TAXI_ORDER(40),
    OPEN_APP(41),
    PUSH(42),
    FAVORITES_WIDGET(43),
    NAVIGATION_SERVICE(44),
    CRASH(45),
    SERVICE_ALERTS(46),
    SERVICE_ALERTS_SELECTION(47),
    ACTIVITY_LIFECYCLE(48),
    APPLE_WATCH(49),
    HOME(50),
    LINE_SEARCH(51),
    STOP_GAME(52),
    RATING(53),
    POPUP(54),
    ORANGE(55),
    STEP_BY_STEP(56),
    MESSAGE_BAR(57),
    ROUTE_PREVIEW(58),
    SEARCH_RIDE(59),
    LIVE_DIRECTION(60),
    LIVE_BAR(61),
    GENIE(62),
    MULTILEG_NAVIGATION_SERVICE(63),
    APP_ICON_SHORTCUTS(64),
    FAVORITE_STOP_GEOFENCE(65),
    SPOT_LIGHT_SHORTCUTS(66),
    URI_SCHEME(67),
    CARPOOL_SEARCH_RIDES(68),
    CARPOOL_REGISTRATION(69),
    CARPOOL_RIDES_MAIN_TAB(70),
    CARPOOL_RIDE_DETAILS(71),
    CARPOOL_RIDES_HISTORY(72),
    CARPOOL_STREET_VIEW(73),
    LINES_TAB_NEARBY(74),
    LINES_TAB_ALL(75),
    LINES_TAB_RECENT(76),
    LINES_TAB_FAVORITES(77),
    MAP_VIEW(78),
    MAP_SETTINGS(79),
    FAVORITE_SETUP_POPUP(80),
    EXTERNAL_ITINERARY(81),
    CARPOOL_TEASER_POPUP(82),
    DATA_COLLECTION(83),
    HOMEPAGE_D(84),
    USER_LOGIN(85),
    USER_LOGIN_POPUP(86),
    USER_LOGOUT_POPUP(87),
    NOTIFICATION_CENTER(88),
    BADGE(89),
    RECENT_ITINERARY_STOP_GEOFENCE(90),
    LINE_DATA_REPORTS(91),
    LINE_REPORT_DETAILS(92),
    STOP_DATA_REPORTS(93),
    STOP_REPORT_DETAILS(94),
    CARPOOL_NOTIFICATION(97),
    ITINERARY_NO_GROUPING(98),
    EMAIL_CONNECT(99),
    SERVICE_ALERTS_TAB(100),
    LINE_TRIP_DETAIL(101),
    EDITOR_WELCOME(102),
    EDITOR_CONNECT(103),
    EDIT_STOP_OVERVIEW(104),
    EDIT_STOP(105),
    EDIT_PATHWAY(106),
    CARPOOL_ALL_SUGGSET_ROUTES(107),
    CARPOOL_CENTER(108),
    CARPOOL_INTRO(109),
    CARPOOL_PROFILE_POPUP(110),
    CARPOOL_DRIVER_REGISTRATION(111),
    CARPOOL_DRIVER_ALL_RIDES(112),
    CARPOOL_DRIVER_RIDE_DETAILS(113),
    CARPOOL_DRIVER_RIDE_DETAILS_MAP(114),
    CARPOOL_DRIVER_ADD_RIDE(115),
    CARPOOL_DRIVER_EDIT_RIDE(116),
    CARPOOL_DRIVER_PROFILE(117),
    CARPOOL_DRIVER_BANK_ACCOUNT(118),
    CARPOOL_DRIVER_SET_LOCATION(119),
    GALLERY(120),
    CARPOOL_LOCATION_SEARCH(121),
    DRIVER_WELCOME(122),
    DRIVER_ADD_RIDE_LOCATIONS(123),
    DRIVER_ADD_RIDE_SCHEDULE(124),
    DRIVER_CAR_DETAILS(125),
    DRIVER_ENTER_PHONE(126),
    DRIVER_PHONE_CONFIRMATION(127),
    DRIVER_FB_LOGIN_FROM_SIGNIN(RecyclerView.C1119a0.FLAG_IGNORE),
    DRIVER_FB_LOGIN_FROM_START(129),
    DRIVER_CONGRATULATIONS(130),
    CARPOOL_PASSENGER_DETAILS(131),
    DRIVER_REQUEST_HEAD(132),
    METRO_REVISION_UPDATE(133),
    FAVORITE_LOCATION_EDITOR(134),
    LINES(135),
    ONBOARDING(136),
    TUTORIAL(137),
    TAB_BAR(138),
    DEST_SEARCH(139),
    MOOVIT_CARPOOL_DRIVER_PROFILE(140),
    CARPOOL_FAVORITE_SETUP_POPUP(141),
    EDIT_LOCATION(142),
    CARPOOL_WORK_INFO(143),
    CARPOOL_BALANCE(144),
    APP(145),
    SHARED_ENTITY_PROXY(146),
    INTERSTITIAL_ADS(147),
    SET_PRICE(148),
    CARPOOL_FAVORITE_SETUP_OFFER(149),
    MORE_DETAILS_SCHEDULES(150),
    POPUP_METRO_CHANGE_TYPE(151),
    DAILY_RIDES_SETTINGS(152),
    CARPOOL_DAILY_RIDES_SETTINGS(153),
    ADD_FAVORITE_LINE_STOPS(154),
    CHOOSE_ON_MAP(155),
    TRIP_PLANNER_DASHBOARD(156),
    TRANSIT_TYPE_STATIONS(157),
    TRANSIT_TYPE_LINES(158),
    ONBOARDING_OFFLINE(159),
    STATIONS_SEARCH(160),
    GTFS_STATIC_LOADER(161),
    GTFS_CONFIGURATION_LOADER(162),
    GTFS_DYNAMIC_LOADER(163),
    GTFS_GRAPH_LOADER(164),
    GTFS_METRO_DATA_LOADER(165),
    GTFS_METRO_ENTITIES_LOADER(166),
    GTFS_METRO_INFO_LOADER(167),
    GTFS_REMOTE_IMAGES_LOADER(168),
    GTFS_TRANSIT_LINE_GROUPS_LOADER(169),
    GTFS_TRANSIT_PATTERNS_LOADER(170),
    GTFS_TRANSIT_STOPS_LOADER(171),
    GTFS_TRIPS_SCHEDULES_LOADER(172),
    OFFLINE_TRIP_PLANNER(173),
    STOP_SEARCH_TABS(174),
    SEND_FEEDBACK(175),
    CARPOOL_DRIVER_SEARCH_LOCATION(176),
    SHOW_ON_MAP(177),
    GRAPH_BUILD_FAILURE(178),
    PRIVATE_BIKE(179),
    SEARCH_LINE_DATA_LOADER(180),
    DRIVER_REMINDER_SETTINGS(181),
    HIRED_BIKE(182),
    ONBOARDING_LOCATION_FULL_SCREEN(183),
    CARPOOL_FAST_BOOKING_SCREEN(184),
    RIDE_REQUEST_DETAILS(185),
    SET_PRICE_SCREEN(186),
    GTFS_BICYCLE_STOPS_LOADER(187),
    HUAWEI_PROTECTED_APP_INTRO_SCREEN(188),
    GOOGLE_PLAY_SERVICE_UNAVAILABLE_SCREEN(189),
    SURVEY_NOTIFICATION(190),
    IOS_NOTIFICATION_PERMISSION(191),
    MAP_STOP_DETAIL(192),
    SURVEY_CONTAINER_SCREEN(193),
    STANDALONE_FAVORITE_LINE(194),
    LINES_AROUND_ME(195),
    RECENT_TRIPS(196),
    TABLESS(197),
    TABLESS_MIGRATION(198),
    REALTIME_EXPLAIN(199),
    OPERATION_HOURS(200),
    PRIVACY_UPDATE(201),
    PRIVACY_SETTINGS(202),
    IOS_LOCATION_PERMISSION(203),
    SERVICE_ALERT_LINE_DIGESTS_CHOOSER(204),
    NOTIFICATION_PERMISSION_FULL_SCREEN(205),
    LINE_SEARCH_TABS(206),
    EXPLORE(207),
    TRIP_PLAN_OPTIONS(208),
    RIDE_SHARING_CAMPAIGN(209),
    TRIP_PLAN_PREFERENCES_DIALOG(210),
    IOS_NOTIFY_PERMISSION_DENIED(211),
    PROMO_CODES(212),
    PROMO_CODES_CENTER(213),
    SEARCH_LOCATION(214),
    GTFS_LANGUAGE_SETTINGS(215),
    APPS_FLYER(216),
    CALENDAR_PERMISSION(217),
    CALENDAR_SETTINGS(218),
    ACCESSIBILITY_SETTINGS(219),
    CALENDAR_EVENTS(220),
    WONDO_CONSENT(221),
    WONDO_CODES(222),
    WONDO_CODE_DETAILS(223),
    WONDO_OFFERS(224),
    WONDO_OFFER_DETAILS(225),
    WONDO_REWARDS(226),
    WONDO_REWARD_DETAILS(227),
    WONDO_FULL_SCREEN(228),
    RIDE_SHARING_REGISTRATION(229),
    WONDO_INVITE(230),
    PAYMENT_ACCOUNT(231),
    TICKET_PURCHASE(232),
    TICKET_PURCHASE_CONFIRMED(233),
    TICKET_RECEIPT(234),
    TICKET_DETAILS(235),
    TICKETS_CENTER(236),
    EXPERIMENTS_SETTING(237),
    EXPERIMENTS(238),
    RIDE_PLAN(239),
    LIVE_RIDE(240),
    PAYMENT(241),
    RETRY_PAYMENT(242),
    RIDE_DETAILS(243),
    DISCOUNT_INFO(244),
    MOT_QR_RIDE_ACTIVATION(245),
    MOT_ACCOUNT_CREATION_WELCOME(246),
    RIDE_ACTIVATION(247),
    ACTIVATION_CONFIRMATION(248),
    ACTIVATION_DETAILS(249),
    ACTIVATION_CENTER(250),
    QR_VIEWER(251),
    MOT_UPCOMING_BILLS(252),
    MOT_FINALIZED_BILLS(253),
    FEEDBACK_TYPE_SELECTION(254),
    FEEDBACK_FORM(ValidationUtils.APPBOY_STRING_MAX_LENGTH),
    MOT_BIT_CONNECT(256),
    STEP_COMPLETED(257),
    MY_ACCOUNT_SCREEN(258),
    PAYMENT_ACCOUNT_DETAILS(259),
    PAYMENT_ACCOUNT_EDIT_DETAILS(260),
    PAYMENT_ACCOUNT_EDIT_PROFILE(261),
    PAYMENT_ACCOUNT_ADD_PROFILE(262),
    MOTQR_VIEWER_ACCOUNT_CREATION_WELCOME(263),
    ON_BOARDING_CAMPAIGN(264),
    WEB_PAGES(265),
    PENDING_PAYMENT(266),
    HELP_CENTER(267),
    MY_TRIPS(268),
    MOT_ACCOUNT_SCREEN(269),
    RIDE_ACTIVATION_ENTER_STATION(270),
    RIDE_ACTIVATION_EXIT_STATION(271),
    PAYMENT_ACCOUNT_CHANGE_CREDIT_CARD(272),
    TOD_RIDES_CENTER(273),
    TOD_ORDER(274),
    TOD_RIDE(275),
    TOD_RIDE_DETAILS(276),
    TRANSIT_AGENCY_SELECTION(278),
    STORED_VALUE_PURCHASE_CONFIRMED(279),
    WALLET(280),
    TRANSACTIONS(281),
    PAYMENT_ACCOUNT_JOIN_PAYMENT_SERVICE(282),
    UMO_REDEEM_BENEFIT(283),
    TOD_RIDE_RATING(284),
    UMO_ACCOUNT_SCREEN(285),
    UMO_ACCOUNT_ID_SCREEEN(286),
    DRIVER_LICENSE(287),
    DRIVER_LOGIN(288),
    DRIVER_NAVIGATION(289),
    QR_READER(290),
    PURCHASE_SPLIT(291),
    TOD_SHUTTLE_BOOKING(292),
    APP_THEME_SETTINGS(293),
    BRAZE_IAM(294),
    DASHBOARD_HOME_FRAGMENT(295),
    MOT_TRANSIT_TYPE_SELECTION_POPUP(296),
    MOT_EXISTING_RIDE_POPUP(297),
    MICRO_MOBILITY_REPORT_DAMAGE(298),
    MICRO_MOBILITY_REPORTED_DAMAGES(299),
    MICRO_MOBILITY_RIDE(Strategy.TTL_SECONDS_DEFAULT),
    MICRO_MOBILITY_RIDE_DETAILS(301),
    MICRO_MOBILITY_PURCHASE(302),
    UNIFIED_WALLET(303),
    TOD_RIDE_CHANGE_DESTINATION(304),
    ADS(305),
    PERSONALIZED_ADS_CONSENT(306),
    ADJUST_ADS_PREFERENCES(307),
    PAYMENT_ACCOUNT_UPDATE_EMAIL(308),
    PAYMENT_ACCOUNT_SETTINGS(310),
    ATT_PERMISSION(311),
    TRIP_PLAN_WALKING_PREF(312),
    USER_ACCESSIBILITY_PREF(313),
    GAMES(314),
    SUBSCRIPTIONS(315),
    USER_ONBOARDING(316),
    PAYMENT_CLEARANCE_PROVIDER(317),
    ACCOUNT_DELETION(318),
    ACCOUNT_ACTIONS(319),
    TOD_BOOKING_ORDER(320),
    ATT_PRE_PERMISSION(321),
    ACCOUNT_SUBSCRIPTIONS(322),
    PURCHASE_SHOPPING_CART(323),
    AD_ANALYTICS(324),
    TRIP_ARRIVALS(325),
    DUMMY_FLOW_PUSH_1(777),
    DUMMY_FLOW_PUSH_2(888),
    NO_FLOW(InAppMessageBase.INAPP_MESSAGE_DURATION_MIN_MILLIS);
    
    private final int value;

    private MVAnalyticsFlowKey(int i) {
        this.value = i;
    }

    public static MVAnalyticsFlowKey findByValue(int i) {
        if (i == 777) {
            return DUMMY_FLOW_PUSH_1;
        }
        if (i == 888) {
            return DUMMY_FLOW_PUSH_2;
        }
        if (i == 999) {
            return NO_FLOW;
        }
        switch (i) {
            case 0:
                return WEAR_NEAR_ME;
            case 1:
                return NEAR_ME;
            case 2:
                return STOP_DETAIL;
            case 3:
                return LINE_DETAIL;
            case 4:
                return DASHBOARD;
            case 5:
                return RIDE;
            case 6:
                return MORE;
            case 7:
                return OMNI_SEARCH;
            case 8:
                return LOCATION_SEARCH;
            case 9:
                return LINE_SCHEDULE;
            case 10:
                return LINE_SCHEDULE_ITINERARY;
            case 11:
                return SUGGEST_ROUTES;
            case 12:
                return SETTINGS;
            case 13:
                return TRIP_PLAN_SETTINGS;
            case 14:
                return NOTIFICATION_SETTINGS;
            case 15:
                return WEB_VIEW_SCREEN;
            case 16:
                return SPREAD_THE_LOVE;
            case 17:
                return TRANSPORTATION_MAPS;
            case 18:
                return ABOUT;
            case 19:
                return ACK;
            case 20:
                return EDIT_PROFILE;
            case 21:
                return AVATARS;
            case 22:
                return TROPHIES;
            case 23:
                return INTRO;
            case 24:
                return USER_CREATION_FAILURE;
            case 25:
                return CHANGE_METRO;
            case 26:
                return SELECT_METRO;
            case 27:
                return LINE_REPORTS_LIST;
            case 28:
                return STOP_REPORTS_LIST;
            case 29:
                return SERVICE_ALERT_DETAIL;
            case 30:
                return NAMED_LOCATION;
            case 31:
                return TRIP_HISTORY;
            case 32:
                return ITINERARY;
            case 33:
                return GOOGLE_AUTH_KEY_GENERATE;
            case 34:
                return METRO_UPDATE_SERVICE;
            case 35:
                return SWITCH_METRO;
            case 36:
                return RATE_US;
            case 37:
                return UPGRADE_LOADER;
            case 38:
                return USER_LOADER;
            case 39:
                return TAXI_REGISTRATION;
            case 40:
                return TAXI_ORDER;
            case 41:
                return OPEN_APP;
            case 42:
                return PUSH;
            case 43:
                return FAVORITES_WIDGET;
            case 44:
                return NAVIGATION_SERVICE;
            case 45:
                return CRASH;
            case 46:
                return SERVICE_ALERTS;
            case 47:
                return SERVICE_ALERTS_SELECTION;
            case 48:
                return ACTIVITY_LIFECYCLE;
            case 49:
                return APPLE_WATCH;
            case 50:
                return HOME;
            case 51:
                return LINE_SEARCH;
            case 52:
                return STOP_GAME;
            case 53:
                return RATING;
            case 54:
                return POPUP;
            case 55:
                return ORANGE;
            case 56:
                return STEP_BY_STEP;
            case 57:
                return MESSAGE_BAR;
            case 58:
                return ROUTE_PREVIEW;
            case 59:
                return SEARCH_RIDE;
            case 60:
                return LIVE_DIRECTION;
            case 61:
                return LIVE_BAR;
            case 62:
                return GENIE;
            case 63:
                return MULTILEG_NAVIGATION_SERVICE;
            case 64:
                return APP_ICON_SHORTCUTS;
            case 65:
                return FAVORITE_STOP_GEOFENCE;
            case 66:
                return SPOT_LIGHT_SHORTCUTS;
            case 67:
                return URI_SCHEME;
            case 68:
                return CARPOOL_SEARCH_RIDES;
            case 69:
                return CARPOOL_REGISTRATION;
            case 70:
                return CARPOOL_RIDES_MAIN_TAB;
            case 71:
                return CARPOOL_RIDE_DETAILS;
            case 72:
                return CARPOOL_RIDES_HISTORY;
            case 73:
                return CARPOOL_STREET_VIEW;
            case 74:
                return LINES_TAB_NEARBY;
            case 75:
                return LINES_TAB_ALL;
            case 76:
                return LINES_TAB_RECENT;
            case 77:
                return LINES_TAB_FAVORITES;
            case 78:
                return MAP_VIEW;
            case 79:
                return MAP_SETTINGS;
            case 80:
                return FAVORITE_SETUP_POPUP;
            case 81:
                return EXTERNAL_ITINERARY;
            case 82:
                return CARPOOL_TEASER_POPUP;
            case 83:
                return DATA_COLLECTION;
            case 84:
                return HOMEPAGE_D;
            case 85:
                return USER_LOGIN;
            case 86:
                return USER_LOGIN_POPUP;
            case 87:
                return USER_LOGOUT_POPUP;
            case 88:
                return NOTIFICATION_CENTER;
            case 89:
                return BADGE;
            case 90:
                return RECENT_ITINERARY_STOP_GEOFENCE;
            case 91:
                return LINE_DATA_REPORTS;
            case 92:
                return LINE_REPORT_DETAILS;
            case 93:
                return STOP_DATA_REPORTS;
            case 94:
                return STOP_REPORT_DETAILS;
            default:
                switch (i) {
                    case 97:
                        return CARPOOL_NOTIFICATION;
                    case 98:
                        return ITINERARY_NO_GROUPING;
                    case 99:
                        return EMAIL_CONNECT;
                    case 100:
                        return SERVICE_ALERTS_TAB;
                    case 101:
                        return LINE_TRIP_DETAIL;
                    case 102:
                        return EDITOR_WELCOME;
                    case 103:
                        return EDITOR_CONNECT;
                    case 104:
                        return EDIT_STOP_OVERVIEW;
                    case 105:
                        return EDIT_STOP;
                    case 106:
                        return EDIT_PATHWAY;
                    case 107:
                        return CARPOOL_ALL_SUGGSET_ROUTES;
                    case 108:
                        return CARPOOL_CENTER;
                    case 109:
                        return CARPOOL_INTRO;
                    case 110:
                        return CARPOOL_PROFILE_POPUP;
                    case 111:
                        return CARPOOL_DRIVER_REGISTRATION;
                    case 112:
                        return CARPOOL_DRIVER_ALL_RIDES;
                    case 113:
                        return CARPOOL_DRIVER_RIDE_DETAILS;
                    case 114:
                        return CARPOOL_DRIVER_RIDE_DETAILS_MAP;
                    case 115:
                        return CARPOOL_DRIVER_ADD_RIDE;
                    case 116:
                        return CARPOOL_DRIVER_EDIT_RIDE;
                    case 117:
                        return CARPOOL_DRIVER_PROFILE;
                    case 118:
                        return CARPOOL_DRIVER_BANK_ACCOUNT;
                    case 119:
                        return CARPOOL_DRIVER_SET_LOCATION;
                    case 120:
                        return GALLERY;
                    case 121:
                        return CARPOOL_LOCATION_SEARCH;
                    case 122:
                        return DRIVER_WELCOME;
                    case 123:
                        return DRIVER_ADD_RIDE_LOCATIONS;
                    case 124:
                        return DRIVER_ADD_RIDE_SCHEDULE;
                    case 125:
                        return DRIVER_CAR_DETAILS;
                    case 126:
                        return DRIVER_ENTER_PHONE;
                    case 127:
                        return DRIVER_PHONE_CONFIRMATION;
                    case RecyclerView.C1119a0.FLAG_IGNORE:
                        return DRIVER_FB_LOGIN_FROM_SIGNIN;
                    case 129:
                        return DRIVER_FB_LOGIN_FROM_START;
                    case 130:
                        return DRIVER_CONGRATULATIONS;
                    case 131:
                        return CARPOOL_PASSENGER_DETAILS;
                    case 132:
                        return DRIVER_REQUEST_HEAD;
                    case 133:
                        return METRO_REVISION_UPDATE;
                    case 134:
                        return FAVORITE_LOCATION_EDITOR;
                    case 135:
                        return LINES;
                    case 136:
                        return ONBOARDING;
                    case 137:
                        return TUTORIAL;
                    case 138:
                        return TAB_BAR;
                    case 139:
                        return DEST_SEARCH;
                    case 140:
                        return MOOVIT_CARPOOL_DRIVER_PROFILE;
                    case 141:
                        return CARPOOL_FAVORITE_SETUP_POPUP;
                    case 142:
                        return EDIT_LOCATION;
                    case 143:
                        return CARPOOL_WORK_INFO;
                    case 144:
                        return CARPOOL_BALANCE;
                    case 145:
                        return APP;
                    case 146:
                        return SHARED_ENTITY_PROXY;
                    case 147:
                        return INTERSTITIAL_ADS;
                    case 148:
                        return SET_PRICE;
                    case 149:
                        return CARPOOL_FAVORITE_SETUP_OFFER;
                    case 150:
                        return MORE_DETAILS_SCHEDULES;
                    case 151:
                        return POPUP_METRO_CHANGE_TYPE;
                    case 152:
                        return DAILY_RIDES_SETTINGS;
                    case 153:
                        return CARPOOL_DAILY_RIDES_SETTINGS;
                    case 154:
                        return ADD_FAVORITE_LINE_STOPS;
                    case 155:
                        return CHOOSE_ON_MAP;
                    case 156:
                        return TRIP_PLANNER_DASHBOARD;
                    case 157:
                        return TRANSIT_TYPE_STATIONS;
                    case 158:
                        return TRANSIT_TYPE_LINES;
                    case 159:
                        return ONBOARDING_OFFLINE;
                    case 160:
                        return STATIONS_SEARCH;
                    case 161:
                        return GTFS_STATIC_LOADER;
                    case 162:
                        return GTFS_CONFIGURATION_LOADER;
                    case 163:
                        return GTFS_DYNAMIC_LOADER;
                    case 164:
                        return GTFS_GRAPH_LOADER;
                    case 165:
                        return GTFS_METRO_DATA_LOADER;
                    case 166:
                        return GTFS_METRO_ENTITIES_LOADER;
                    case 167:
                        return GTFS_METRO_INFO_LOADER;
                    case 168:
                        return GTFS_REMOTE_IMAGES_LOADER;
                    case 169:
                        return GTFS_TRANSIT_LINE_GROUPS_LOADER;
                    case 170:
                        return GTFS_TRANSIT_PATTERNS_LOADER;
                    case 171:
                        return GTFS_TRANSIT_STOPS_LOADER;
                    case 172:
                        return GTFS_TRIPS_SCHEDULES_LOADER;
                    case 173:
                        return OFFLINE_TRIP_PLANNER;
                    case 174:
                        return STOP_SEARCH_TABS;
                    case 175:
                        return SEND_FEEDBACK;
                    case 176:
                        return CARPOOL_DRIVER_SEARCH_LOCATION;
                    case 177:
                        return SHOW_ON_MAP;
                    case 178:
                        return GRAPH_BUILD_FAILURE;
                    case 179:
                        return PRIVATE_BIKE;
                    case 180:
                        return SEARCH_LINE_DATA_LOADER;
                    case 181:
                        return DRIVER_REMINDER_SETTINGS;
                    case 182:
                        return HIRED_BIKE;
                    case 183:
                        return ONBOARDING_LOCATION_FULL_SCREEN;
                    case 184:
                        return CARPOOL_FAST_BOOKING_SCREEN;
                    case 185:
                        return RIDE_REQUEST_DETAILS;
                    case 186:
                        return SET_PRICE_SCREEN;
                    case 187:
                        return GTFS_BICYCLE_STOPS_LOADER;
                    case 188:
                        return HUAWEI_PROTECTED_APP_INTRO_SCREEN;
                    case 189:
                        return GOOGLE_PLAY_SERVICE_UNAVAILABLE_SCREEN;
                    case 190:
                        return SURVEY_NOTIFICATION;
                    case 191:
                        return IOS_NOTIFICATION_PERMISSION;
                    case 192:
                        return MAP_STOP_DETAIL;
                    case 193:
                        return SURVEY_CONTAINER_SCREEN;
                    case 194:
                        return STANDALONE_FAVORITE_LINE;
                    case 195:
                        return LINES_AROUND_ME;
                    case 196:
                        return RECENT_TRIPS;
                    case 197:
                        return TABLESS;
                    case 198:
                        return TABLESS_MIGRATION;
                    case 199:
                        return REALTIME_EXPLAIN;
                    case 200:
                        return OPERATION_HOURS;
                    case 201:
                        return PRIVACY_UPDATE;
                    case 202:
                        return PRIVACY_SETTINGS;
                    case 203:
                        return IOS_LOCATION_PERMISSION;
                    case 204:
                        return SERVICE_ALERT_LINE_DIGESTS_CHOOSER;
                    case 205:
                        return NOTIFICATION_PERMISSION_FULL_SCREEN;
                    case 206:
                        return LINE_SEARCH_TABS;
                    case 207:
                        return EXPLORE;
                    case 208:
                        return TRIP_PLAN_OPTIONS;
                    case 209:
                        return RIDE_SHARING_CAMPAIGN;
                    case 210:
                        return TRIP_PLAN_PREFERENCES_DIALOG;
                    case 211:
                        return IOS_NOTIFY_PERMISSION_DENIED;
                    case 212:
                        return PROMO_CODES;
                    case 213:
                        return PROMO_CODES_CENTER;
                    case 214:
                        return SEARCH_LOCATION;
                    case 215:
                        return GTFS_LANGUAGE_SETTINGS;
                    case 216:
                        return APPS_FLYER;
                    case 217:
                        return CALENDAR_PERMISSION;
                    case 218:
                        return CALENDAR_SETTINGS;
                    case 219:
                        return ACCESSIBILITY_SETTINGS;
                    case 220:
                        return CALENDAR_EVENTS;
                    case 221:
                        return WONDO_CONSENT;
                    case 222:
                        return WONDO_CODES;
                    case 223:
                        return WONDO_CODE_DETAILS;
                    case 224:
                        return WONDO_OFFERS;
                    case 225:
                        return WONDO_OFFER_DETAILS;
                    case 226:
                        return WONDO_REWARDS;
                    case 227:
                        return WONDO_REWARD_DETAILS;
                    case 228:
                        return WONDO_FULL_SCREEN;
                    case 229:
                        return RIDE_SHARING_REGISTRATION;
                    case 230:
                        return WONDO_INVITE;
                    case 231:
                        return PAYMENT_ACCOUNT;
                    case 232:
                        return TICKET_PURCHASE;
                    case 233:
                        return TICKET_PURCHASE_CONFIRMED;
                    case 234:
                        return TICKET_RECEIPT;
                    case 235:
                        return TICKET_DETAILS;
                    case 236:
                        return TICKETS_CENTER;
                    case 237:
                        return EXPERIMENTS_SETTING;
                    case 238:
                        return EXPERIMENTS;
                    case 239:
                        return RIDE_PLAN;
                    case 240:
                        return LIVE_RIDE;
                    case 241:
                        return PAYMENT;
                    case 242:
                        return RETRY_PAYMENT;
                    case 243:
                        return RIDE_DETAILS;
                    case 244:
                        return DISCOUNT_INFO;
                    case 245:
                        return MOT_QR_RIDE_ACTIVATION;
                    case 246:
                        return MOT_ACCOUNT_CREATION_WELCOME;
                    case 247:
                        return RIDE_ACTIVATION;
                    case 248:
                        return ACTIVATION_CONFIRMATION;
                    case 249:
                        return ACTIVATION_DETAILS;
                    case 250:
                        return ACTIVATION_CENTER;
                    case 251:
                        return QR_VIEWER;
                    case 252:
                        return MOT_UPCOMING_BILLS;
                    case 253:
                        return MOT_FINALIZED_BILLS;
                    case 254:
                        return FEEDBACK_TYPE_SELECTION;
                    case ValidationUtils.APPBOY_STRING_MAX_LENGTH:
                        return FEEDBACK_FORM;
                    case 256:
                        return MOT_BIT_CONNECT;
                    case 257:
                        return STEP_COMPLETED;
                    case 258:
                        return MY_ACCOUNT_SCREEN;
                    case 259:
                        return PAYMENT_ACCOUNT_DETAILS;
                    case 260:
                        return PAYMENT_ACCOUNT_EDIT_DETAILS;
                    case 261:
                        return PAYMENT_ACCOUNT_EDIT_PROFILE;
                    case 262:
                        return PAYMENT_ACCOUNT_ADD_PROFILE;
                    case 263:
                        return MOTQR_VIEWER_ACCOUNT_CREATION_WELCOME;
                    case 264:
                        return ON_BOARDING_CAMPAIGN;
                    case 265:
                        return WEB_PAGES;
                    case 266:
                        return PENDING_PAYMENT;
                    case 267:
                        return HELP_CENTER;
                    case 268:
                        return MY_TRIPS;
                    case 269:
                        return MOT_ACCOUNT_SCREEN;
                    case 270:
                        return RIDE_ACTIVATION_ENTER_STATION;
                    case 271:
                        return RIDE_ACTIVATION_EXIT_STATION;
                    case 272:
                        return PAYMENT_ACCOUNT_CHANGE_CREDIT_CARD;
                    case 273:
                        return TOD_RIDES_CENTER;
                    case 274:
                        return TOD_ORDER;
                    case 275:
                        return TOD_RIDE;
                    case 276:
                        return TOD_RIDE_DETAILS;
                    default:
                        switch (i) {
                            case 278:
                                return TRANSIT_AGENCY_SELECTION;
                            case 279:
                                return STORED_VALUE_PURCHASE_CONFIRMED;
                            case 280:
                                return WALLET;
                            case 281:
                                return TRANSACTIONS;
                            case 282:
                                return PAYMENT_ACCOUNT_JOIN_PAYMENT_SERVICE;
                            case 283:
                                return UMO_REDEEM_BENEFIT;
                            case 284:
                                return TOD_RIDE_RATING;
                            case 285:
                                return UMO_ACCOUNT_SCREEN;
                            case 286:
                                return UMO_ACCOUNT_ID_SCREEEN;
                            case 287:
                                return DRIVER_LICENSE;
                            case 288:
                                return DRIVER_LOGIN;
                            case 289:
                                return DRIVER_NAVIGATION;
                            case 290:
                                return QR_READER;
                            case 291:
                                return PURCHASE_SPLIT;
                            case 292:
                                return TOD_SHUTTLE_BOOKING;
                            case 293:
                                return APP_THEME_SETTINGS;
                            case 294:
                                return BRAZE_IAM;
                            case 295:
                                return DASHBOARD_HOME_FRAGMENT;
                            case 296:
                                return MOT_TRANSIT_TYPE_SELECTION_POPUP;
                            case 297:
                                return MOT_EXISTING_RIDE_POPUP;
                            case 298:
                                return MICRO_MOBILITY_REPORT_DAMAGE;
                            case 299:
                                return MICRO_MOBILITY_REPORTED_DAMAGES;
                            case Strategy.TTL_SECONDS_DEFAULT:
                                return MICRO_MOBILITY_RIDE;
                            case 301:
                                return MICRO_MOBILITY_RIDE_DETAILS;
                            case 302:
                                return MICRO_MOBILITY_PURCHASE;
                            case 303:
                                return UNIFIED_WALLET;
                            case 304:
                                return TOD_RIDE_CHANGE_DESTINATION;
                            case 305:
                                return ADS;
                            case 306:
                                return PERSONALIZED_ADS_CONSENT;
                            case 307:
                                return ADJUST_ADS_PREFERENCES;
                            case 308:
                                return PAYMENT_ACCOUNT_UPDATE_EMAIL;
                            default:
                                switch (i) {
                                    case 310:
                                        return PAYMENT_ACCOUNT_SETTINGS;
                                    case 311:
                                        return ATT_PERMISSION;
                                    case 312:
                                        return TRIP_PLAN_WALKING_PREF;
                                    case 313:
                                        return USER_ACCESSIBILITY_PREF;
                                    case 314:
                                        return GAMES;
                                    case 315:
                                        return SUBSCRIPTIONS;
                                    case 316:
                                        return USER_ONBOARDING;
                                    case 317:
                                        return PAYMENT_CLEARANCE_PROVIDER;
                                    case 318:
                                        return ACCOUNT_DELETION;
                                    case 319:
                                        return ACCOUNT_ACTIONS;
                                    case 320:
                                        return TOD_BOOKING_ORDER;
                                    case 321:
                                        return ATT_PRE_PERMISSION;
                                    case 322:
                                        return ACCOUNT_SUBSCRIPTIONS;
                                    case 323:
                                        return PURCHASE_SHOPPING_CART;
                                    case 324:
                                        return AD_ANALYTICS;
                                    case 325:
                                        return TRIP_ARRIVALS;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public int getValue() {
        return this.value;
    }
}

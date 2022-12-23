package com.moovit.sdk.protocol;

import androidx.recyclerview.widget.RecyclerView;

public enum ProtocolEnums$MVAnalyticsEventKey {
    END_SERVER_SIDE(1),
    APP_REALTIME_PROCESS(6),
    NB_REALTIME_PROCESS(51),
    SECURE_USER(2),
    SURVEY(105),
    MISSING_SYNC_ENTITIES(38),
    OPEN_SCREEN(3),
    START_ANOTHER_SCREEN(4),
    CLOSE_SCREEN(5),
    MAP_MOVED(7),
    REFRESH_CLICKED(8),
    AUTO_REFRESH(11),
    CALCULATING_WALKING_POLYLINE(12),
    REQUEST_START(9),
    REQUEST_END(10),
    GOOGLE_PLAY_VERIFICATION_FAILED(13),
    METRO_MISMATCH(14),
    METRO_CRITICAL_MISMATCH(15),
    METRO_UPDATE_DIALOG_SHOWN(16),
    FEEDBACK_CLICKED(17),
    RATE_US_CLICKED(18),
    NOTIFICATION_SETTINGS_CHANGED(19),
    TRANSPORTATION_MAP_CLICKED(20),
    USER_PROFILE_CHANGED(21),
    SPREAD_THE_LOVE_SHARE(22),
    SPREAD_THE_LOVE_FOLLOW_ON_TWITTER(23),
    START_METRO_SWITCH(24),
    METRO_SYNC(25),
    CHANGE_METRO(26),
    RATE_US_POPUP_DIALOG(27),
    WEAR_STOP_SHOW_ALL_LINES(28),
    WEAR_STOP_OPEN_ON_PHONE(29),
    WEAR_NEAR_ME_RESULT(30),
    USER_CREATION_FAILURE(31),
    USER_CREATION_RETRY_CLICKED(32),
    OPEN_VOLUNTEER_DIALOG(33),
    VOLUNTEER_REQUEST_SEND(34),
    USER_CREATION_FAILURE_METRO_SELECTED(35),
    USER_CREATION_FAILURE_SELECT_METRO_CLICKED(158),
    NETWORK_SETTINGS_CLICKED(36),
    LOCATION_SETTINGS_CLICKED(37),
    LOADER_START(39),
    LOADER_END(40),
    TAXI_REGISTRATION_ENTER_PHONE(41),
    TAXI_REGISTRATION_PHONE_SEND(42),
    TAXI_REGISTRATION_PHONE_CONFIRMATION(43),
    TAXI_REGISTRATION_VERIFICATION_CODE(44),
    TAXI_ORDER_VIEW(45),
    TAXI_CREATE_ORDER_CLICKED(46),
    TAXI_COMPLETE_ORDER_CLICKED(47),
    TAXI_TRY_AGAIN_CREATE_ORDER(48),
    CANCEL_TAXI_ORDER(49),
    DOWNLOAD_TAXI_APP_CLICKED(50),
    OPEN_APP(52),
    POPUP_SHOWN(102),
    POPUP_OK_CLICKED(103),
    FAVORITES_WIDGET_INSTALLED(57),
    FAVORITES_WIDGET_UNINSTALLED(58),
    FAVORITES_WIDGET_REFRESH(59),
    FAVORITES_WIDGET_SWITCH_STATIONS(60),
    FAVORITES_WIDGET_HEADER_TAPPED(61),
    FAVORITES_WIDGET_LINE_TAPPED(62),
    FAVORITES_WIDGET_TP_HOME(63),
    FAVORITES_WIDGET_TP_WORK(64),
    FAVORITES_WIDGET_EDIT_HOME(65),
    FAVORITES_WIDGET_EDIT_WORK(66),
    FAVORITES_WIDGET_AUTO_REFRESH(67),
    FAVORITES_WIDGET_OPEN_DASHBOARD(68),
    FAVORITES_WIDGET_SHOWN_SUCCESSFULLY(69),
    SEARCH_RIDE_SHOWN(70),
    SEARCH_RIDE_SUCCEEDED(71),
    SEARCH_RIDE_FAILED(72),
    SEARCH_RIDE_LINE_CHOSEN(73),
    ACTIVE_RIDE_SHOWN(74),
    ACTIVE_RIDE_NAVIGATION_START(75),
    ACTIVE_RIDE_NAVIGATION_STOP(76),
    ACTIVE_RIDE_CHANGE_DEST_CLICKED(150),
    ACTIVE_RIDE_CHANGE_DEST(77),
    ACTIVE_RIDE_DISMISS_CLICKED(78),
    ACTIVE_RIDE_ADD_REPORT_CLICKED(79),
    ACTIVE_RIDE_LINE_NEWS_CLICKED(80),
    ACTIVE_RIDE_LINE_DETAILS_CLICKED(81),
    ACTIVE_RIDE_NOTIFICATION_ALERTS(82),
    ACTIVE_RIDE_PROGRESS_CHANGED(83),
    START_NAVIGATION(84),
    RESUME_NAVIGATION(85),
    STOP_NAVIGATION(86),
    USER_VISIBILITY_STATE_CHANGED(87),
    FOREGROUND_STATE_CHANGED(88),
    NAVIGATION_PROGRESS_CHANGED(89),
    PLUS_BUTTON_CLICKED(90),
    ACTION_SHEET_CLICKED(91),
    FAVORITE_LINE_CLICKED(92),
    LINE_SCHEDULE_CLICKED(93),
    ADD_LINE_REPORT_CLICKED(94),
    VIEW_LINE_REPORTS_CLICKED(95),
    ADD_STOP_REPORT_CLICKED(96),
    VIEW_STOP_REPORTS_CLICKED(97),
    REPORT_ITEM_CLICKED(98),
    REPORT_SEND_CLICKED(99),
    ORDER_TAXI_CLICKED(100),
    CRASH(101),
    ACTIVITY_CREATED(106),
    ACTIVITY_STARTED(107),
    ACTIVITY_RESUMED(108),
    ACTIVITY_PAUSED(109),
    ACTIVITY_STOPPED(110),
    ACTIVITY_SAVED_INSTANCE(111),
    ACTIVITY_DESTROYED(112),
    WATCH_NEAR_ME_REQUEST(113),
    WATCH_NEAR_ME_RESULT(114),
    WATCH_LINES_REQUEST(115),
    WATCH_LINES_RESULT(116),
    WATCH_STOP_MAP(117),
    WATCH_LINE_INFO(118),
    TAXI_PERFORM_CREATE_ORDER(119),
    RIDE_BUTTON_CLICKED(120),
    TAXI_CTA_CLICKED(157),
    EDIT_ORIGIN_CLICKED(121),
    EDIT_DEST_CLICKED(122),
    EDIT_TIME_CLICKED(123),
    EDIT_TIME_DIALOG(124),
    EDIT_ROUTE_TYPE_CLICKED(125),
    EDIT_ROUTE_TYPE_DIALOG(126),
    EDIT_TRANSIT_TYPES_CLICKED(127),
    EDIT_TRANSIT_TYPES_DIALOG(RecyclerView.C1119a0.FLAG_IGNORE),
    REFINE_ROUTES_CLICKED(129),
    SWITCH_DIRECTIONS_CLICKED(130),
    SEARCH_ROUTES_CLICKED(131),
    HOME_TRIP_PLAN_CLICKED(132),
    HOME_NEAR_ME_CLICKED(133),
    HOME_SCHEDULES_CLICKED(134),
    TOP_LEVEL_DRAWER_OPENED(135),
    TOP_LEVEL_DRAWER_CLOSED(136),
    SEARCH_LOCATIONS(138),
    NEAR_ME_STOPS_SHOWN(139),
    BUTTON_CLICK(140),
    OPEN_POPUP(141),
    CLOSE_POPUP(142),
    FACEBOOK_LIKE_RESULT(143),
    SWIPE(145),
    ITINERARY_STEP_SELECTED(146),
    ITINERARY_STEP_SCROLLED_UP(147),
    END_OF_SCROLL(148),
    DROP_DOWN(159),
    ITINERARY_LOADED(160),
    DEVIATION_SHOWN(161),
    RETURN_TO_PATH(162),
    NAVIGATION_STARTED(163),
    NAVIGATION_ENDED(164),
    NAVIGATION_LEG_ADVANCE(165),
    MAXIMIZE(166),
    ORANGE_SNACK_BAR_SHOWN(149),
    PUSH_SENT(56),
    PUSH_RECEIVED(53),
    PUSH_CLICKED(54),
    PUSH_DISMISSED(55),
    PUSH_PAYLOAD_DOWNLOADED(104),
    PUSH_REJECTED(144),
    PUSH_PARSE_ERROR(151),
    ON_READY(152),
    ON_ALL_DATA_PARTS_LOADED(153),
    ON_DATA_PART_LOADING_FAILURE(154),
    MESSAGE_BAR_SHOWN(155),
    MESSAGE_BAR_TAPPED(156),
    ETA_CHANGED(167),
    NAVIGATION_STATION_ADVANCE(168),
    LIKE_LINE_REPORT(169),
    EXTERNAL_INITIATOR(170),
    MAP_ITEMS_SHOWN(171),
    EDIT_DAYS_CLICKED(172),
    EDIT_DAYS_DIALOG(173),
    EDIT_DAY_PART_CLICKED(174),
    EDIT_DAY_PART_DIALOG(175),
    STEP_ENTER_PHONE(177),
    STEP_VALIDATE_PHONE(178),
    STEP_FACEBOOK_LOGIN(179),
    STEP_CREDIT_CARD(180),
    CARPOOL_ZOOZ_REGISTRATION(181),
    CARPOOL_SEARCH_RESULT(182),
    LINE_CLICKED(183),
    OFFLINE_MAPS_SHOWN(184),
    STOP_DIALOG_SHOWN(185),
    FAVORITE_SET(186),
    EXTERNAL_ITINERARY_REDIRECT(187),
    EXTERNAL_ITINERARY_FALLBACK_TO_NEARME(188),
    CARPOOL_BOOK_RIDE_OCCURRED(189),
    DATA_COLLECTION_TRIGGER_CANCELED(190),
    SPIDER_LOGIC_FINISHED(191),
    WEB_VIEW_LOAD(192),
    STOP_DIALOG_SHOWN_AUTO(193),
    ADS_EXPOSED(194),
    ADS_CLICK(195),
    AVATAR_CHANGED(196),
    LOGIN(197),
    LOGOUT(198),
    RED_BADGE_EXIST(199),
    DATA_COLLECTION_TRIGGER_STARTED(200),
    SMART_FEEDBACK_YES(201),
    SMART_FEEDBACK_NO(202),
    CHANGE_FLOW(203),
    RIDE_DETAILS_SHOWN(204),
    TAXI_EXPOSED(205),
    SERVICE_ALERT_SHOWN(206),
    VIEW_TYPE_SHOWN(207),
    LOCATION_ADS_RECEIVED(208),
    LOCATION_ADS_EXPOSED(209),
    LOCATION_ADS_CLICKED(210),
    PHOTO_SENT(211),
    MAP_ICON_SHOWN(212),
    STEP_LOADED(213),
    FB_SUCCESS(214),
    PHONE_CONFIRMATION(215),
    SAVE_SUCCESS(216),
    RIDE_RECEIVED(217),
    OPEN_SIDE_MENU(218),
    LOCATION_CLICKED(219),
    REQUEST_HEAD_CLICKED(220),
    REQUEST_HEAD_DISMISSED(221),
    NEW_ROUTES_SNACKBAR_SHOWN(222),
    FAVORITES_LOADED(223),
    LOCATION_PERMISSIONS(224),
    NOTIFICATIONS_PERMISSIONS(225),
    CARPOOL_SECTION_SHOWN(226),
    TOP_UP_SECTION_SHOWN(227),
    SPREAD_THE_LOVE_SHARE_FOLLOW_ON_INSTAGRAM(228),
    SPREAD_THE_LOVE_SHARE_FOLLOW_ON_SNAPCHAT(229),
    DETOUR_OFFERED(230),
    DISMISS_SURVEY_SHOWN(231),
    FOREGROUND(232),
    BACKGROUND(233),
    SHARED_ENTITY_ERROR_SHOWN(234),
    BEST_WAY_STATE(245),
    CARPOOL_ITINERARY_RECIEVED(246),
    WAS_LINE_CHANGED(247),
    SHARED_ENTITY_RECEIVED(235),
    SHARED_ENTITY_SHOWN(236),
    ADS_SECTION_SHOWN(237),
    ADS_SWIPE(238),
    INTERSTITIAL_AD_LOAD_REQUEST(239),
    INTERSTITIAL_AD_LOAD_SUCCESS(240),
    INTERSTITIAL_AD_LOAD_FAILURE(241),
    INTERSTITIAL_AD_SHOWN(242),
    INTERSTITIAL_AD_DISMISSED(243),
    INTERSTITIAL_AD_CLICKED(244),
    COACH_MARK_SHOWN(248),
    EDUCATIONAL_POPUP_SHOWN(249),
    VALIDATE_COUPON_STATUS(250),
    PARKING_CELL_SHOWN(251),
    PARKING_RESERVED_POPUP_SHOWN(252),
    PARKING_NOT_RESERVED_POPUP_SHOWN(253),
    CHOOSE_MAP_CLICKED(254),
    CARPOOL_DRIVER_SHOW_REPORT(257),
    DATA_COLLECTION_GEOFENCES_STATUS(258),
    METRO_ID_MISMATCH(259),
    LOCATION_SHEET_SHOWN(260),
    SET_AS_ORIGIN_CLICKED(261),
    SET_AS_DESTINATION_CLICKED(262),
    SET_AS_FAVORITE_CLICKED(263),
    STOP_LOADED(264),
    SHARE_TYPE_CLICKED(265),
    CARPOOL_GOOGLE_SEARCH_FAILURE(266),
    CARPOOL_MOOVIT_SEARCH_FAILURE(267),
    PHONE_VALIDATION_FAILED(288),
    SWIPE_CARD(289),
    IS_ALIVE(290),
    SEARCH_BOX(291),
    BOOK_RESULT(292),
    COMMUNITY_SECTION_SHOWN(293),
    STOP_DETAILS_CLICKED(294),
    FILE_UPLOAD(295),
    GOOGLE_ANALYTICS_REPORTED(296);
    
    private final int value;

    private ProtocolEnums$MVAnalyticsEventKey(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVAnalyticsEventKey findByValue(int i) {
        switch (i) {
            case 1:
                return END_SERVER_SIDE;
            case 2:
                return SECURE_USER;
            case 3:
                return OPEN_SCREEN;
            case 4:
                return START_ANOTHER_SCREEN;
            case 5:
                return CLOSE_SCREEN;
            case 6:
                return APP_REALTIME_PROCESS;
            case 7:
                return MAP_MOVED;
            case 8:
                return REFRESH_CLICKED;
            case 9:
                return REQUEST_START;
            case 10:
                return REQUEST_END;
            case 11:
                return AUTO_REFRESH;
            case 12:
                return CALCULATING_WALKING_POLYLINE;
            case 13:
                return GOOGLE_PLAY_VERIFICATION_FAILED;
            case 14:
                return METRO_MISMATCH;
            case 15:
                return METRO_CRITICAL_MISMATCH;
            case 16:
                return METRO_UPDATE_DIALOG_SHOWN;
            case 17:
                return FEEDBACK_CLICKED;
            case 18:
                return RATE_US_CLICKED;
            case 19:
                return NOTIFICATION_SETTINGS_CHANGED;
            case 20:
                return TRANSPORTATION_MAP_CLICKED;
            case 21:
                return USER_PROFILE_CHANGED;
            case 22:
                return SPREAD_THE_LOVE_SHARE;
            case 23:
                return SPREAD_THE_LOVE_FOLLOW_ON_TWITTER;
            case 24:
                return START_METRO_SWITCH;
            case 25:
                return METRO_SYNC;
            case 26:
                return CHANGE_METRO;
            case 27:
                return RATE_US_POPUP_DIALOG;
            case 28:
                return WEAR_STOP_SHOW_ALL_LINES;
            case 29:
                return WEAR_STOP_OPEN_ON_PHONE;
            case 30:
                return WEAR_NEAR_ME_RESULT;
            case 31:
                return USER_CREATION_FAILURE;
            case 32:
                return USER_CREATION_RETRY_CLICKED;
            case 33:
                return OPEN_VOLUNTEER_DIALOG;
            case 34:
                return VOLUNTEER_REQUEST_SEND;
            case 35:
                return USER_CREATION_FAILURE_METRO_SELECTED;
            case 36:
                return NETWORK_SETTINGS_CLICKED;
            case 37:
                return LOCATION_SETTINGS_CLICKED;
            case 38:
                return MISSING_SYNC_ENTITIES;
            case 39:
                return LOADER_START;
            case 40:
                return LOADER_END;
            case 41:
                return TAXI_REGISTRATION_ENTER_PHONE;
            case 42:
                return TAXI_REGISTRATION_PHONE_SEND;
            case 43:
                return TAXI_REGISTRATION_PHONE_CONFIRMATION;
            case 44:
                return TAXI_REGISTRATION_VERIFICATION_CODE;
            case 45:
                return TAXI_ORDER_VIEW;
            case 46:
                return TAXI_CREATE_ORDER_CLICKED;
            case 47:
                return TAXI_COMPLETE_ORDER_CLICKED;
            case 48:
                return TAXI_TRY_AGAIN_CREATE_ORDER;
            case 49:
                return CANCEL_TAXI_ORDER;
            case 50:
                return DOWNLOAD_TAXI_APP_CLICKED;
            case 51:
                return NB_REALTIME_PROCESS;
            case 52:
                return OPEN_APP;
            case 53:
                return PUSH_RECEIVED;
            case 54:
                return PUSH_CLICKED;
            case 55:
                return PUSH_DISMISSED;
            case 56:
                return PUSH_SENT;
            case 57:
                return FAVORITES_WIDGET_INSTALLED;
            case 58:
                return FAVORITES_WIDGET_UNINSTALLED;
            case 59:
                return FAVORITES_WIDGET_REFRESH;
            case 60:
                return FAVORITES_WIDGET_SWITCH_STATIONS;
            case 61:
                return FAVORITES_WIDGET_HEADER_TAPPED;
            case 62:
                return FAVORITES_WIDGET_LINE_TAPPED;
            case 63:
                return FAVORITES_WIDGET_TP_HOME;
            case 64:
                return FAVORITES_WIDGET_TP_WORK;
            case 65:
                return FAVORITES_WIDGET_EDIT_HOME;
            case 66:
                return FAVORITES_WIDGET_EDIT_WORK;
            case 67:
                return FAVORITES_WIDGET_AUTO_REFRESH;
            case 68:
                return FAVORITES_WIDGET_OPEN_DASHBOARD;
            case 69:
                return FAVORITES_WIDGET_SHOWN_SUCCESSFULLY;
            case 70:
                return SEARCH_RIDE_SHOWN;
            case 71:
                return SEARCH_RIDE_SUCCEEDED;
            case 72:
                return SEARCH_RIDE_FAILED;
            case 73:
                return SEARCH_RIDE_LINE_CHOSEN;
            case 74:
                return ACTIVE_RIDE_SHOWN;
            case 75:
                return ACTIVE_RIDE_NAVIGATION_START;
            case 76:
                return ACTIVE_RIDE_NAVIGATION_STOP;
            case 77:
                return ACTIVE_RIDE_CHANGE_DEST;
            case 78:
                return ACTIVE_RIDE_DISMISS_CLICKED;
            case 79:
                return ACTIVE_RIDE_ADD_REPORT_CLICKED;
            case 80:
                return ACTIVE_RIDE_LINE_NEWS_CLICKED;
            case 81:
                return ACTIVE_RIDE_LINE_DETAILS_CLICKED;
            case 82:
                return ACTIVE_RIDE_NOTIFICATION_ALERTS;
            case 83:
                return ACTIVE_RIDE_PROGRESS_CHANGED;
            case 84:
                return START_NAVIGATION;
            case 85:
                return RESUME_NAVIGATION;
            case 86:
                return STOP_NAVIGATION;
            case 87:
                return USER_VISIBILITY_STATE_CHANGED;
            case 88:
                return FOREGROUND_STATE_CHANGED;
            case 89:
                return NAVIGATION_PROGRESS_CHANGED;
            case 90:
                return PLUS_BUTTON_CLICKED;
            case 91:
                return ACTION_SHEET_CLICKED;
            case 92:
                return FAVORITE_LINE_CLICKED;
            case 93:
                return LINE_SCHEDULE_CLICKED;
            case 94:
                return ADD_LINE_REPORT_CLICKED;
            case 95:
                return VIEW_LINE_REPORTS_CLICKED;
            case 96:
                return ADD_STOP_REPORT_CLICKED;
            case 97:
                return VIEW_STOP_REPORTS_CLICKED;
            case 98:
                return REPORT_ITEM_CLICKED;
            case 99:
                return REPORT_SEND_CLICKED;
            case 100:
                return ORDER_TAXI_CLICKED;
            case 101:
                return CRASH;
            case 102:
                return POPUP_SHOWN;
            case 103:
                return POPUP_OK_CLICKED;
            case 104:
                return PUSH_PAYLOAD_DOWNLOADED;
            case 105:
                return SURVEY;
            case 106:
                return ACTIVITY_CREATED;
            case 107:
                return ACTIVITY_STARTED;
            case 108:
                return ACTIVITY_RESUMED;
            case 109:
                return ACTIVITY_PAUSED;
            case 110:
                return ACTIVITY_STOPPED;
            case 111:
                return ACTIVITY_SAVED_INSTANCE;
            case 112:
                return ACTIVITY_DESTROYED;
            case 113:
                return WATCH_NEAR_ME_REQUEST;
            case 114:
                return WATCH_NEAR_ME_RESULT;
            case 115:
                return WATCH_LINES_REQUEST;
            case 116:
                return WATCH_LINES_RESULT;
            case 117:
                return WATCH_STOP_MAP;
            case 118:
                return WATCH_LINE_INFO;
            case 119:
                return TAXI_PERFORM_CREATE_ORDER;
            case 120:
                return RIDE_BUTTON_CLICKED;
            case 121:
                return EDIT_ORIGIN_CLICKED;
            case 122:
                return EDIT_DEST_CLICKED;
            case 123:
                return EDIT_TIME_CLICKED;
            case 124:
                return EDIT_TIME_DIALOG;
            case 125:
                return EDIT_ROUTE_TYPE_CLICKED;
            case 126:
                return EDIT_ROUTE_TYPE_DIALOG;
            case 127:
                return EDIT_TRANSIT_TYPES_CLICKED;
            case RecyclerView.C1119a0.FLAG_IGNORE:
                return EDIT_TRANSIT_TYPES_DIALOG;
            case 129:
                return REFINE_ROUTES_CLICKED;
            case 130:
                return SWITCH_DIRECTIONS_CLICKED;
            case 131:
                return SEARCH_ROUTES_CLICKED;
            case 132:
                return HOME_TRIP_PLAN_CLICKED;
            case 133:
                return HOME_NEAR_ME_CLICKED;
            case 134:
                return HOME_SCHEDULES_CLICKED;
            case 135:
                return TOP_LEVEL_DRAWER_OPENED;
            case 136:
                return TOP_LEVEL_DRAWER_CLOSED;
            default:
                switch (i) {
                    case 138:
                        return SEARCH_LOCATIONS;
                    case 139:
                        return NEAR_ME_STOPS_SHOWN;
                    case 140:
                        return BUTTON_CLICK;
                    case 141:
                        return OPEN_POPUP;
                    case 142:
                        return CLOSE_POPUP;
                    case 143:
                        return FACEBOOK_LIKE_RESULT;
                    case 144:
                        return PUSH_REJECTED;
                    case 145:
                        return SWIPE;
                    case 146:
                        return ITINERARY_STEP_SELECTED;
                    case 147:
                        return ITINERARY_STEP_SCROLLED_UP;
                    case 148:
                        return END_OF_SCROLL;
                    case 149:
                        return ORANGE_SNACK_BAR_SHOWN;
                    case 150:
                        return ACTIVE_RIDE_CHANGE_DEST_CLICKED;
                    case 151:
                        return PUSH_PARSE_ERROR;
                    case 152:
                        return ON_READY;
                    case 153:
                        return ON_ALL_DATA_PARTS_LOADED;
                    case 154:
                        return ON_DATA_PART_LOADING_FAILURE;
                    case 155:
                        return MESSAGE_BAR_SHOWN;
                    case 156:
                        return MESSAGE_BAR_TAPPED;
                    case 157:
                        return TAXI_CTA_CLICKED;
                    case 158:
                        return USER_CREATION_FAILURE_SELECT_METRO_CLICKED;
                    case 159:
                        return DROP_DOWN;
                    case 160:
                        return ITINERARY_LOADED;
                    case 161:
                        return DEVIATION_SHOWN;
                    case 162:
                        return RETURN_TO_PATH;
                    case 163:
                        return NAVIGATION_STARTED;
                    case 164:
                        return NAVIGATION_ENDED;
                    case 165:
                        return NAVIGATION_LEG_ADVANCE;
                    case 166:
                        return MAXIMIZE;
                    case 167:
                        return ETA_CHANGED;
                    case 168:
                        return NAVIGATION_STATION_ADVANCE;
                    case 169:
                        return LIKE_LINE_REPORT;
                    case 170:
                        return EXTERNAL_INITIATOR;
                    case 171:
                        return MAP_ITEMS_SHOWN;
                    case 172:
                        return EDIT_DAYS_CLICKED;
                    case 173:
                        return EDIT_DAYS_DIALOG;
                    case 174:
                        return EDIT_DAY_PART_CLICKED;
                    case 175:
                        return EDIT_DAY_PART_DIALOG;
                    default:
                        switch (i) {
                            case 177:
                                return STEP_ENTER_PHONE;
                            case 178:
                                return STEP_VALIDATE_PHONE;
                            case 179:
                                return STEP_FACEBOOK_LOGIN;
                            case 180:
                                return STEP_CREDIT_CARD;
                            case 181:
                                return CARPOOL_ZOOZ_REGISTRATION;
                            case 182:
                                return CARPOOL_SEARCH_RESULT;
                            case 183:
                                return LINE_CLICKED;
                            case 184:
                                return OFFLINE_MAPS_SHOWN;
                            case 185:
                                return STOP_DIALOG_SHOWN;
                            case 186:
                                return FAVORITE_SET;
                            case 187:
                                return EXTERNAL_ITINERARY_REDIRECT;
                            case 188:
                                return EXTERNAL_ITINERARY_FALLBACK_TO_NEARME;
                            case 189:
                                return CARPOOL_BOOK_RIDE_OCCURRED;
                            case 190:
                                return DATA_COLLECTION_TRIGGER_CANCELED;
                            case 191:
                                return SPIDER_LOGIC_FINISHED;
                            case 192:
                                return WEB_VIEW_LOAD;
                            case 193:
                                return STOP_DIALOG_SHOWN_AUTO;
                            case 194:
                                return ADS_EXPOSED;
                            case 195:
                                return ADS_CLICK;
                            case 196:
                                return AVATAR_CHANGED;
                            case 197:
                                return LOGIN;
                            case 198:
                                return LOGOUT;
                            case 199:
                                return RED_BADGE_EXIST;
                            case 200:
                                return DATA_COLLECTION_TRIGGER_STARTED;
                            case 201:
                                return SMART_FEEDBACK_YES;
                            case 202:
                                return SMART_FEEDBACK_NO;
                            case 203:
                                return CHANGE_FLOW;
                            case 204:
                                return RIDE_DETAILS_SHOWN;
                            case 205:
                                return TAXI_EXPOSED;
                            case 206:
                                return SERVICE_ALERT_SHOWN;
                            case 207:
                                return VIEW_TYPE_SHOWN;
                            case 208:
                                return LOCATION_ADS_RECEIVED;
                            case 209:
                                return LOCATION_ADS_EXPOSED;
                            case 210:
                                return LOCATION_ADS_CLICKED;
                            case 211:
                                return PHOTO_SENT;
                            case 212:
                                return MAP_ICON_SHOWN;
                            case 213:
                                return STEP_LOADED;
                            case 214:
                                return FB_SUCCESS;
                            case 215:
                                return PHONE_CONFIRMATION;
                            case 216:
                                return SAVE_SUCCESS;
                            case 217:
                                return RIDE_RECEIVED;
                            case 218:
                                return OPEN_SIDE_MENU;
                            case 219:
                                return LOCATION_CLICKED;
                            case 220:
                                return REQUEST_HEAD_CLICKED;
                            case 221:
                                return REQUEST_HEAD_DISMISSED;
                            case 222:
                                return NEW_ROUTES_SNACKBAR_SHOWN;
                            case 223:
                                return FAVORITES_LOADED;
                            case 224:
                                return LOCATION_PERMISSIONS;
                            case 225:
                                return NOTIFICATIONS_PERMISSIONS;
                            case 226:
                                return CARPOOL_SECTION_SHOWN;
                            case 227:
                                return TOP_UP_SECTION_SHOWN;
                            case 228:
                                return SPREAD_THE_LOVE_SHARE_FOLLOW_ON_INSTAGRAM;
                            case 229:
                                return SPREAD_THE_LOVE_SHARE_FOLLOW_ON_SNAPCHAT;
                            case 230:
                                return DETOUR_OFFERED;
                            case 231:
                                return DISMISS_SURVEY_SHOWN;
                            case 232:
                                return FOREGROUND;
                            case 233:
                                return BACKGROUND;
                            case 234:
                                return SHARED_ENTITY_ERROR_SHOWN;
                            case 235:
                                return SHARED_ENTITY_RECEIVED;
                            case 236:
                                return SHARED_ENTITY_SHOWN;
                            case 237:
                                return ADS_SECTION_SHOWN;
                            case 238:
                                return ADS_SWIPE;
                            case 239:
                                return INTERSTITIAL_AD_LOAD_REQUEST;
                            case 240:
                                return INTERSTITIAL_AD_LOAD_SUCCESS;
                            case 241:
                                return INTERSTITIAL_AD_LOAD_FAILURE;
                            case 242:
                                return INTERSTITIAL_AD_SHOWN;
                            case 243:
                                return INTERSTITIAL_AD_DISMISSED;
                            case 244:
                                return INTERSTITIAL_AD_CLICKED;
                            case 245:
                                return BEST_WAY_STATE;
                            case 246:
                                return CARPOOL_ITINERARY_RECIEVED;
                            case 247:
                                return WAS_LINE_CHANGED;
                            case 248:
                                return COACH_MARK_SHOWN;
                            case 249:
                                return EDUCATIONAL_POPUP_SHOWN;
                            case 250:
                                return VALIDATE_COUPON_STATUS;
                            case 251:
                                return PARKING_CELL_SHOWN;
                            case 252:
                                return PARKING_RESERVED_POPUP_SHOWN;
                            case 253:
                                return PARKING_NOT_RESERVED_POPUP_SHOWN;
                            case 254:
                                return CHOOSE_MAP_CLICKED;
                            default:
                                switch (i) {
                                    case 257:
                                        return CARPOOL_DRIVER_SHOW_REPORT;
                                    case 258:
                                        return DATA_COLLECTION_GEOFENCES_STATUS;
                                    case 259:
                                        return METRO_ID_MISMATCH;
                                    case 260:
                                        return LOCATION_SHEET_SHOWN;
                                    case 261:
                                        return SET_AS_ORIGIN_CLICKED;
                                    case 262:
                                        return SET_AS_DESTINATION_CLICKED;
                                    case 263:
                                        return SET_AS_FAVORITE_CLICKED;
                                    case 264:
                                        return STOP_LOADED;
                                    case 265:
                                        return SHARE_TYPE_CLICKED;
                                    case 266:
                                        return CARPOOL_GOOGLE_SEARCH_FAILURE;
                                    case 267:
                                        return CARPOOL_MOOVIT_SEARCH_FAILURE;
                                    default:
                                        switch (i) {
                                            case 288:
                                                return PHONE_VALIDATION_FAILED;
                                            case 289:
                                                return SWIPE_CARD;
                                            case 290:
                                                return IS_ALIVE;
                                            case 291:
                                                return SEARCH_BOX;
                                            case 292:
                                                return BOOK_RESULT;
                                            case 293:
                                                return COMMUNITY_SECTION_SHOWN;
                                            case 294:
                                                return STOP_DETAILS_CLICKED;
                                            case 295:
                                                return FILE_UPLOAD;
                                            case 296:
                                                return GOOGLE_ANALYTICS_REPORTED;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    public int getValue() {
        return this.value;
    }
}

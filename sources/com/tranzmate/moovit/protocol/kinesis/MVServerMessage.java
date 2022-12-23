package com.tranzmate.moovit.protocol.kinesis;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tranzmate.moovit.busdriver.MVDriverLocationUpdateRequest;
import com.tranzmate.moovit.busdriver.MVDriverMessageServerMessage;
import com.tranzmate.moovit.busdriver.MVDriverReportServerMessage;
import com.tranzmate.moovit.busdriver.MVUpdateTripRequest;
import com.tranzmate.moovit.protocol.Reports4_0.MVCreateReportRequest;
import com.tranzmate.moovit.protocol.Reports4_0.MVDeleteReportsRequest;
import com.tranzmate.moovit.protocol.Reports4_0.MVFlagInAppropriateReportRequest;
import com.tranzmate.moovit.protocol.Reports4_0.MVLikeReportRequest;
import com.tranzmate.moovit.protocol.Reports4_0.MVResetLikeUnlikeUserReportRequest;
import com.tranzmate.moovit.protocol.Reports4_0.MVUnLikeReportRequest;
import com.tranzmate.moovit.protocol.Reports4_0.MVUnflagInAppropriateReportRequest;
import com.tranzmate.moovit.protocol.Reports4_0.MVUsersReportsActionsForRedshift;
import com.tranzmate.moovit.protocol.Reports4_0.MVUsersReportsForRedshift;
import com.tranzmate.moovit.protocol.carpool.MVAddPotentialPointsRequest;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolSurveyAnswer;
import com.tranzmate.moovit.protocol.checkin.MVCheckOutRequest;
import com.tranzmate.moovit.protocol.common.MVCarPoolWorkDetails;
import com.tranzmate.moovit.protocol.crowd.MVStartDataCollectionNotification;
import com.tranzmate.moovit.protocol.datacollection.MVApplicationInfos;
import com.tranzmate.moovit.protocol.favorites.MVSetFavoriteLineGroupsAndStops;
import com.tranzmate.moovit.protocol.favorites.MVSetFavorites;
import com.tranzmate.moovit.protocol.metrics.MVDynamicMetricsServerMessage;
import com.tranzmate.moovit.protocol.metrics.MVStaticMetricsServerMessage;
import com.tranzmate.moovit.protocol.notificationsettings.MVUpdateUserSettingsRequest;
import com.tranzmate.moovit.protocol.reports.MVNavigationQualityReport;
import com.tranzmate.moovit.protocol.reports.MVPushNotificationReport;
import com.tranzmate.moovit.protocol.serviceAlerts.MVLineAlertSubscriptionUpdate;
import com.tranzmate.moovit.protocol.sync.MVSyncAckRequest;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingExternalPurchaseReport;
import com.tranzmate.moovit.protocol.tod.MVDriverLocationServerMessage;
import com.tranzmate.moovit.protocol.transitcardalert.MVTCATopupUserRequest;
import com.tranzmate.moovit.protocol.users.MVAddUserToWaitingMetroList;
import com.tranzmate.moovit.protocol.users.MVChangeUserLangRequest;
import com.tranzmate.moovit.protocol.users.MVPrivacyPolicyApprovalRequest;
import com.tranzmate.moovit.protocol.users.MVSetAdvertisingInfoRequest;
import com.tranzmate.moovit.protocol.users.MVSetGDPRPropertiesRequest;
import com.tranzmate.moovit.protocol.users.MVSetPrivacyPolicyRequest;
import com.tranzmate.moovit.protocol.users.MVSetUserExperimentInfo;
import com.tranzmate.moovit.protocol.users.MVSetUserHomeWorkRequest;
import com.tranzmate.moovit.protocol.users.MVUpdateConsentRequest;
import com.tranzmate.moovit.protocol.users.MVUpdateDeviceName;
import com.tranzmate.moovit.protocol.users.MVUpdateLimitAdTrackingEnabledState;
import com.tranzmate.moovit.protocol.users.MVUpdatePushToken;
import com.tranzmate.moovit.protocol.users.MVUpdateUserInfo;
import com.tranzmate.moovit.protocol.users.MVUpdateUserOsVersion;
import com.tranzmate.moovit.protocol.users.MVUpdateVersionRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TException;
import org.apache.thrift.TUnion;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TProtocolException;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import xi0.C25276a;

public class MVServerMessage extends TUnion<MVServerMessage, _Fields> {

    /* renamed from: A */
    public static final C25113c f26017A = new C25113c("otpScoringData", (byte) 12, 25);

    /* renamed from: A0 */
    public static final C25113c f26018A0 = new C25113c("todDriverMessage", (byte) 12, 64);

    /* renamed from: B */
    public static final C25113c f26019B = new C25113c("lineGameReport", (byte) 12, 26);

    /* renamed from: B0 */
    public static final C25113c f26020B0 = new C25113c("driverLocationUpdate", (byte) 12, 65);

    /* renamed from: C */
    public static final C25113c f26021C = new C25113c("usersReportsForRedshift", (byte) 12, 27);

    /* renamed from: C0 */
    public static final C25113c f26022C0 = new C25113c("todDriverLocation", (byte) 12, 66);

    /* renamed from: D */
    public static final C25113c f26023D = new C25113c("reportsActionsForRedshift", (byte) 12, 28);

    /* renamed from: D0 */
    public static final C25113c f26024D0 = new C25113c("privacyPolicyApproval", (byte) 12, 67);

    /* renamed from: E */
    public static final C25113c f26025E = new C25113c("userExperimentInfo", (byte) 12, 29);

    /* renamed from: E0 */
    public static final Map<_Fields, FieldMetaData> f26026E0;

    /* renamed from: F */
    public static final C25113c f26027F = new C25113c("carPoolRideSurvey", (byte) 12, 30);

    /* renamed from: G */
    public static final C25113c f26028G = new C25113c("startDataCollectionNotification", (byte) 12, 31);

    /* renamed from: H */
    public static final C25113c f26029H = new C25113c("applicationInfos", (byte) 12, 32);

    /* renamed from: I */
    public static final C25113c f26030I = new C25113c("userHomeWorkRequest", (byte) 12, 33);

    /* renamed from: J */
    public static final C25113c f26031J = new C25113c("setVerifiedPhoneNumber", (byte) 12, 34);

    /* renamed from: K */
    public static final C25113c f26032K = new C25113c("setFavoriteLineGroupsAndStops", (byte) 12, 35);

    /* renamed from: L */
    public static final C25113c f26033L = new C25113c("userTransitCardTopupRequest", (byte) 12, 36);

    /* renamed from: M */
    public static final C25113c f26034M = new C25113c("carPoolPassengersWorkDetails", (byte) 12, 37);

    /* renamed from: N */
    public static final C25113c f26035N = new C25113c("surveyAnswers", (byte) 12, 38);

    /* renamed from: O */
    public static final C25113c f26036O = new C25113c("userLocale", (byte) 12, 39);

    /* renamed from: P */
    public static final C25113c f26037P = new C25113c("profilerRecordingStart", (byte) 12, 40);

    /* renamed from: Q */
    public static final C25113c f26038Q = new C25113c("profilerRecordingStop", (byte) 12, 41);

    /* renamed from: R */
    public static final C25113c f26039R = new C25113c("metroRevisionUpdated", (byte) 12, 42);

    /* renamed from: S */
    public static final C25113c f26040S = new C25113c("clientConfigurationActivated", (byte) 12, 43);

    /* renamed from: T */
    public static final C25113c f26041T = new C25113c("dcConfigurationActivated", (byte) 12, 44);

    /* renamed from: U */
    public static final C25113c f26042U = new C25113c("dcRecordingStart", (byte) 12, 45);

    /* renamed from: X */
    public static final C25113c f26043X = new C25113c("dcRecordingStop", (byte) 12, 46);

    /* renamed from: Y */
    public static final C25113c f26044Y = new C25113c("locationStatus", (byte) 12, 47);

    /* renamed from: Z */
    public static final C25113c f26045Z = new C25113c("profilerConfigurationActivated", (byte) 12, 48);

    /* renamed from: c */
    public static final C17394d0 f26046c = new C17394d0("MVServerMessage");

    /* renamed from: d */
    public static final C25113c f26047d = new C25113c("updateUserInfo", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f26048e = new C25113c("limitAdTrackingEnabled", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f26049f = new C25113c("pushToken", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f26050g = new C25113c("addUserToWaitingMetroList", (byte) 12, 4);

    /* renamed from: h */
    public static final C25113c f26051h = new C25113c("upgradeVersion", (byte) 12, 5);

    /* renamed from: i */
    public static final C25113c f26052i = new C25113c("updateUserSettings", (byte) 12, 6);

    /* renamed from: j */
    public static final C25113c f26053j = new C25113c("syncAckRequest", (byte) 12, 7);

    /* renamed from: k */
    public static final C25113c f26054k = new C25113c("userReportCreateRequest", (byte) 12, 8);

    /* renamed from: l */
    public static final C25113c f26055l = new C25113c("userReportLikeRequest", (byte) 12, 9);

    /* renamed from: l0 */
    public static final C25113c f26056l0 = new C25113c("wifiStatus", (byte) 12, 49);

    /* renamed from: m */
    public static final C25113c f26057m = new C25113c("userReportUnlikeRequest", (byte) 12, 10);

    /* renamed from: m0 */
    public static final C25113c f26058m0 = new C25113c("addPotentialPoints", (byte) 12, 50);

    /* renamed from: n */
    public static final C25113c f26059n = new C25113c("userReportFlagInappropriateRequest", (byte) 12, 11);

    /* renamed from: n0 */
    public static final C25113c f26060n0 = new C25113c("staticMetrics", (byte) 12, 51);

    /* renamed from: o */
    public static final C25113c f26061o = new C25113c("userReportUnflagInappropriateRequest", (byte) 12, 12);

    /* renamed from: o0 */
    public static final C25113c f26062o0 = new C25113c("dynamicMetrics", (byte) 12, 52);

    /* renamed from: p */
    public static final C25113c f26063p = new C25113c("userReportDeleteRequest", (byte) 12, 13);

    /* renamed from: p0 */
    public static final C25113c f26064p0 = new C25113c("upgradeSdkUser", (byte) 12, 53);

    /* renamed from: q */
    public static final C25113c f26065q = new C25113c("userReportResetLikeUnlikeUserReportRequest", (byte) 12, 14);

    /* renamed from: q0 */
    public static final C25113c f26066q0 = new C25113c("questionnaireResult", (byte) 12, 54);

    /* renamed from: r */
    public static final C25113c f26067r = new C25113c("lineAlertSubscriptionUpdate", (byte) 12, 15);

    /* renamed from: r0 */
    public static final C25113c f26068r0 = new C25113c("setGDPRPropertiesRequest", (byte) 12, 55);

    /* renamed from: s */
    public static final C25113c f26069s = new C25113c("navigationQualityReport", (byte) 12, 16);

    /* renamed from: s0 */
    public static final C25113c f26070s0 = new C25113c("bdrDriverReport", (byte) 12, 56);

    /* renamed from: t */
    public static final C25113c f26071t = new C25113c("pushNotificationReport", (byte) 12, 17);

    /* renamed from: t0 */
    public static final C25113c f26072t0 = new C25113c("setPrivacyPolicyRequest", (byte) 12, 57);

    /* renamed from: u */
    public static final C25113c f26073u = new C25113c("actionType", (byte) 8, 18);

    /* renamed from: u0 */
    public static final C25113c f26074u0 = new C25113c("bdrDriverMessage", (byte) 12, 58);

    /* renamed from: v */
    public static final C25113c f26075v = new C25113c("updateUserOsVersion", (byte) 12, 19);

    /* renamed from: v0 */
    public static final C25113c f26076v0 = new C25113c("deepLinkInstallation", (byte) 12, 59);

    /* renamed from: w */
    public static final C25113c f26077w = new C25113c("setAdvertisingInfoRequest", (byte) 12, 20);

    /* renamed from: w0 */
    public static final C25113c f26078w0 = new C25113c("thirdPartyDataConsent", (byte) 12, 60);

    /* renamed from: x */
    public static final C25113c f26079x = new C25113c(ProductAction.ACTION_CHECKOUT, (byte) 12, 21);

    /* renamed from: x0 */
    public static final C25113c f26080x0 = new C25113c("updateTrip", (byte) 12, 61);

    /* renamed from: y */
    public static final C25113c f26081y = new C25113c("setFavorites", (byte) 12, 22);

    /* renamed from: y0 */
    public static final C25113c f26082y0 = new C25113c("ticketingExternalPurchaseReport", (byte) 12, 62);

    /* renamed from: z */
    public static final C25113c f26083z = new C25113c("updateDeviceName", (byte) 12, 24);

    /* renamed from: z0 */
    public static final C25113c f26084z0 = new C25113c("todDriverReport", (byte) 12, 63);

    public enum _Fields implements C25085c {
        UPDATE_USER_INFO(1, "updateUserInfo"),
        LIMIT_AD_TRACKING_ENABLED(2, "limitAdTrackingEnabled"),
        PUSH_TOKEN(3, "pushToken"),
        ADD_USER_TO_WAITING_METRO_LIST(4, "addUserToWaitingMetroList"),
        UPGRADE_VERSION(5, "upgradeVersion"),
        UPDATE_USER_SETTINGS(6, "updateUserSettings"),
        SYNC_ACK_REQUEST(7, "syncAckRequest"),
        USER_REPORT_CREATE_REQUEST(8, "userReportCreateRequest"),
        USER_REPORT_LIKE_REQUEST(9, "userReportLikeRequest"),
        USER_REPORT_UNLIKE_REQUEST(10, "userReportUnlikeRequest"),
        USER_REPORT_FLAG_INAPPROPRIATE_REQUEST(11, "userReportFlagInappropriateRequest"),
        USER_REPORT_UNFLAG_INAPPROPRIATE_REQUEST(12, "userReportUnflagInappropriateRequest"),
        USER_REPORT_DELETE_REQUEST(13, "userReportDeleteRequest"),
        USER_REPORT_RESET_LIKE_UNLIKE_USER_REPORT_REQUEST(14, "userReportResetLikeUnlikeUserReportRequest"),
        LINE_ALERT_SUBSCRIPTION_UPDATE(15, "lineAlertSubscriptionUpdate"),
        NAVIGATION_QUALITY_REPORT(16, "navigationQualityReport"),
        PUSH_NOTIFICATION_REPORT(17, "pushNotificationReport"),
        ACTION_TYPE(18, "actionType"),
        UPDATE_USER_OS_VERSION(19, "updateUserOsVersion"),
        SET_ADVERTISING_INFO_REQUEST(20, "setAdvertisingInfoRequest"),
        CHECKOUT(21, ProductAction.ACTION_CHECKOUT),
        SET_FAVORITES(22, "setFavorites"),
        UPDATE_DEVICE_NAME(24, "updateDeviceName"),
        OTP_SCORING_DATA(25, "otpScoringData"),
        LINE_GAME_REPORT(26, "lineGameReport"),
        USERS_REPORTS_FOR_REDSHIFT(27, "usersReportsForRedshift"),
        REPORTS_ACTIONS_FOR_REDSHIFT(28, "reportsActionsForRedshift"),
        USER_EXPERIMENT_INFO(29, "userExperimentInfo"),
        CAR_POOL_RIDE_SURVEY(30, "carPoolRideSurvey"),
        START_DATA_COLLECTION_NOTIFICATION(31, "startDataCollectionNotification"),
        APPLICATION_INFOS(32, "applicationInfos"),
        USER_HOME_WORK_REQUEST(33, "userHomeWorkRequest"),
        SET_VERIFIED_PHONE_NUMBER(34, "setVerifiedPhoneNumber"),
        SET_FAVORITE_LINE_GROUPS_AND_STOPS(35, "setFavoriteLineGroupsAndStops"),
        USER_TRANSIT_CARD_TOPUP_REQUEST(36, "userTransitCardTopupRequest"),
        CAR_POOL_PASSENGERS_WORK_DETAILS(37, "carPoolPassengersWorkDetails"),
        SURVEY_ANSWERS(38, "surveyAnswers"),
        USER_LOCALE(39, "userLocale"),
        PROFILER_RECORDING_START(40, "profilerRecordingStart"),
        PROFILER_RECORDING_STOP(41, "profilerRecordingStop"),
        METRO_REVISION_UPDATED(42, "metroRevisionUpdated"),
        CLIENT_CONFIGURATION_ACTIVATED(43, "clientConfigurationActivated"),
        DC_CONFIGURATION_ACTIVATED(44, "dcConfigurationActivated"),
        DC_RECORDING_START(45, "dcRecordingStart"),
        DC_RECORDING_STOP(46, "dcRecordingStop"),
        LOCATION_STATUS(47, "locationStatus"),
        PROFILER_CONFIGURATION_ACTIVATED(48, "profilerConfigurationActivated"),
        WIFI_STATUS(49, "wifiStatus"),
        ADD_POTENTIAL_POINTS(50, "addPotentialPoints"),
        STATIC_METRICS(51, "staticMetrics"),
        DYNAMIC_METRICS(52, "dynamicMetrics"),
        UPGRADE_SDK_USER(53, "upgradeSdkUser"),
        QUESTIONNAIRE_RESULT(54, "questionnaireResult"),
        SET_GDPRPROPERTIES_REQUEST(55, "setGDPRPropertiesRequest"),
        BDR_DRIVER_REPORT(56, "bdrDriverReport"),
        SET_PRIVACY_POLICY_REQUEST(57, "setPrivacyPolicyRequest"),
        BDR_DRIVER_MESSAGE(58, "bdrDriverMessage"),
        DEEP_LINK_INSTALLATION(59, "deepLinkInstallation"),
        THIRD_PARTY_DATA_CONSENT(60, "thirdPartyDataConsent"),
        UPDATE_TRIP(61, "updateTrip"),
        TICKETING_EXTERNAL_PURCHASE_REPORT(62, "ticketingExternalPurchaseReport"),
        TOD_DRIVER_REPORT(63, "todDriverReport"),
        TOD_DRIVER_MESSAGE(64, "todDriverMessage"),
        DRIVER_LOCATION_UPDATE(65, "driverLocationUpdate"),
        TOD_DRIVER_LOCATION(66, "todDriverLocation"),
        PRIVACY_POLICY_APPROVAL(67, "privacyPolicyApproval");
        
        private static final Map<String, _Fields> byName = null;
        private final String _fieldName;
        private final short _thriftId;

        /* access modifiers changed from: public */
        static {
            byName = new HashMap();
            Iterator<E> it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        private _Fields(short s, String str) {
            this._thriftId = s;
            this._fieldName = str;
        }

        public static _Fields findByName(String str) {
            return byName.get(str);
        }

        public static _Fields findByThriftId(int i) {
            switch (i) {
                case 1:
                    return UPDATE_USER_INFO;
                case 2:
                    return LIMIT_AD_TRACKING_ENABLED;
                case 3:
                    return PUSH_TOKEN;
                case 4:
                    return ADD_USER_TO_WAITING_METRO_LIST;
                case 5:
                    return UPGRADE_VERSION;
                case 6:
                    return UPDATE_USER_SETTINGS;
                case 7:
                    return SYNC_ACK_REQUEST;
                case 8:
                    return USER_REPORT_CREATE_REQUEST;
                case 9:
                    return USER_REPORT_LIKE_REQUEST;
                case 10:
                    return USER_REPORT_UNLIKE_REQUEST;
                case 11:
                    return USER_REPORT_FLAG_INAPPROPRIATE_REQUEST;
                case 12:
                    return USER_REPORT_UNFLAG_INAPPROPRIATE_REQUEST;
                case 13:
                    return USER_REPORT_DELETE_REQUEST;
                case 14:
                    return USER_REPORT_RESET_LIKE_UNLIKE_USER_REPORT_REQUEST;
                case 15:
                    return LINE_ALERT_SUBSCRIPTION_UPDATE;
                case 16:
                    return NAVIGATION_QUALITY_REPORT;
                case 17:
                    return PUSH_NOTIFICATION_REPORT;
                case 18:
                    return ACTION_TYPE;
                case 19:
                    return UPDATE_USER_OS_VERSION;
                case 20:
                    return SET_ADVERTISING_INFO_REQUEST;
                case 21:
                    return CHECKOUT;
                case 22:
                    return SET_FAVORITES;
                case 24:
                    return UPDATE_DEVICE_NAME;
                case 25:
                    return OTP_SCORING_DATA;
                case 26:
                    return LINE_GAME_REPORT;
                case 27:
                    return USERS_REPORTS_FOR_REDSHIFT;
                case 28:
                    return REPORTS_ACTIONS_FOR_REDSHIFT;
                case 29:
                    return USER_EXPERIMENT_INFO;
                case 30:
                    return CAR_POOL_RIDE_SURVEY;
                case 31:
                    return START_DATA_COLLECTION_NOTIFICATION;
                case 32:
                    return APPLICATION_INFOS;
                case 33:
                    return USER_HOME_WORK_REQUEST;
                case 34:
                    return SET_VERIFIED_PHONE_NUMBER;
                case 35:
                    return SET_FAVORITE_LINE_GROUPS_AND_STOPS;
                case 36:
                    return USER_TRANSIT_CARD_TOPUP_REQUEST;
                case 37:
                    return CAR_POOL_PASSENGERS_WORK_DETAILS;
                case 38:
                    return SURVEY_ANSWERS;
                case 39:
                    return USER_LOCALE;
                case 40:
                    return PROFILER_RECORDING_START;
                case 41:
                    return PROFILER_RECORDING_STOP;
                case 42:
                    return METRO_REVISION_UPDATED;
                case 43:
                    return CLIENT_CONFIGURATION_ACTIVATED;
                case 44:
                    return DC_CONFIGURATION_ACTIVATED;
                case 45:
                    return DC_RECORDING_START;
                case 46:
                    return DC_RECORDING_STOP;
                case 47:
                    return LOCATION_STATUS;
                case 48:
                    return PROFILER_CONFIGURATION_ACTIVATED;
                case 49:
                    return WIFI_STATUS;
                case 50:
                    return ADD_POTENTIAL_POINTS;
                case 51:
                    return STATIC_METRICS;
                case 52:
                    return DYNAMIC_METRICS;
                case 53:
                    return UPGRADE_SDK_USER;
                case 54:
                    return QUESTIONNAIRE_RESULT;
                case 55:
                    return SET_GDPRPROPERTIES_REQUEST;
                case 56:
                    return BDR_DRIVER_REPORT;
                case 57:
                    return SET_PRIVACY_POLICY_REQUEST;
                case 58:
                    return BDR_DRIVER_MESSAGE;
                case 59:
                    return DEEP_LINK_INSTALLATION;
                case 60:
                    return THIRD_PARTY_DATA_CONSENT;
                case 61:
                    return UPDATE_TRIP;
                case 62:
                    return TICKETING_EXTERNAL_PURCHASE_REPORT;
                case 63:
                    return TOD_DRIVER_REPORT;
                case 64:
                    return TOD_DRIVER_MESSAGE;
                case 65:
                    return DRIVER_LOCATION_UPDATE;
                case 66:
                    return TOD_DRIVER_LOCATION;
                case 67:
                    return PRIVACY_POLICY_APPROVAL;
                default:
                    return null;
            }
        }

        public static _Fields findByThriftIdOrThrow(int i) {
            _Fields findByThriftId = findByThriftId(i);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException(C25541a.m63878h("Field ", i, " doesn't exist!"));
        }

        public String getFieldName() {
            return this._fieldName;
        }

        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVServerMessage$a */
    public static /* synthetic */ class C8947a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26085a;

        /* JADX WARNING: Can't wrap try/catch for region: R(132:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(3:131|132|134)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(134:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|134) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0258 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0264 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x0270 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x027c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0288 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0294 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x02a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x02ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x02b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x02c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x02d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x02dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x02e8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x02f4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x0300 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x030c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0174 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0180 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x018c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0198 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x01bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01ec */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01f8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0204 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0210 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x021c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0228 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0234 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0240 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x024c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields[] r0 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26085a = r0
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.UPDATE_USER_INFO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.LIMIT_AD_TRACKING_ENABLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.PUSH_TOKEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.ADD_USER_TO_WAITING_METRO_LIST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.UPGRADE_VERSION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.UPDATE_USER_SETTINGS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.SYNC_ACK_REQUEST     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.USER_REPORT_CREATE_REQUEST     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.USER_REPORT_LIKE_REQUEST     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.USER_REPORT_UNLIKE_REQUEST     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.USER_REPORT_FLAG_INAPPROPRIATE_REQUEST     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.USER_REPORT_UNFLAG_INAPPROPRIATE_REQUEST     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.USER_REPORT_DELETE_REQUEST     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.USER_REPORT_RESET_LIKE_UNLIKE_USER_REPORT_REQUEST     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.LINE_ALERT_SUBSCRIPTION_UPDATE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.NAVIGATION_QUALITY_REPORT     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.PUSH_NOTIFICATION_REPORT     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.ACTION_TYPE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.UPDATE_USER_OS_VERSION     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.SET_ADVERTISING_INFO_REQUEST     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.CHECKOUT     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.SET_FAVORITES     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.UPDATE_DEVICE_NAME     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0120 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.OTP_SCORING_DATA     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x012c }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.LINE_GAME_REPORT     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0138 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.USERS_REPORTS_FOR_REDSHIFT     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0144 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.REPORTS_ACTIONS_FOR_REDSHIFT     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0150 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.USER_EXPERIMENT_INFO     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x015c }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.CAR_POOL_RIDE_SURVEY     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0168 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.START_DATA_COLLECTION_NOTIFICATION     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0174 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.APPLICATION_INFOS     // Catch:{ NoSuchFieldError -> 0x0174 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0174 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0174 }
            L_0x0174:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0180 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.USER_HOME_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x0180 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0180 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0180 }
            L_0x0180:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x018c }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.SET_VERIFIED_PHONE_NUMBER     // Catch:{ NoSuchFieldError -> 0x018c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018c }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018c }
            L_0x018c:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0198 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.SET_FAVORITE_LINE_GROUPS_AND_STOPS     // Catch:{ NoSuchFieldError -> 0x0198 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0198 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0198 }
            L_0x0198:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x01a4 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.USER_TRANSIT_CARD_TOPUP_REQUEST     // Catch:{ NoSuchFieldError -> 0x01a4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
            L_0x01a4:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x01b0 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.CAR_POOL_PASSENGERS_WORK_DETAILS     // Catch:{ NoSuchFieldError -> 0x01b0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b0 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b0 }
            L_0x01b0:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x01bc }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.SURVEY_ANSWERS     // Catch:{ NoSuchFieldError -> 0x01bc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01bc }
                r2 = 37
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01bc }
            L_0x01bc:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x01c8 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.USER_LOCALE     // Catch:{ NoSuchFieldError -> 0x01c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c8 }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c8 }
            L_0x01c8:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x01d4 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.PROFILER_RECORDING_START     // Catch:{ NoSuchFieldError -> 0x01d4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d4 }
                r2 = 39
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d4 }
            L_0x01d4:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x01e0 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.PROFILER_RECORDING_STOP     // Catch:{ NoSuchFieldError -> 0x01e0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e0 }
                r2 = 40
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e0 }
            L_0x01e0:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x01ec }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.METRO_REVISION_UPDATED     // Catch:{ NoSuchFieldError -> 0x01ec }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ec }
                r2 = 41
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ec }
            L_0x01ec:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x01f8 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.CLIENT_CONFIGURATION_ACTIVATED     // Catch:{ NoSuchFieldError -> 0x01f8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f8 }
                r2 = 42
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01f8 }
            L_0x01f8:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0204 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.DC_CONFIGURATION_ACTIVATED     // Catch:{ NoSuchFieldError -> 0x0204 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0204 }
                r2 = 43
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0204 }
            L_0x0204:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0210 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.DC_RECORDING_START     // Catch:{ NoSuchFieldError -> 0x0210 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0210 }
                r2 = 44
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0210 }
            L_0x0210:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x021c }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.DC_RECORDING_STOP     // Catch:{ NoSuchFieldError -> 0x021c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x021c }
                r2 = 45
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x021c }
            L_0x021c:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0228 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.LOCATION_STATUS     // Catch:{ NoSuchFieldError -> 0x0228 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0228 }
                r2 = 46
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0228 }
            L_0x0228:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0234 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.PROFILER_CONFIGURATION_ACTIVATED     // Catch:{ NoSuchFieldError -> 0x0234 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0234 }
                r2 = 47
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0234 }
            L_0x0234:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0240 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.WIFI_STATUS     // Catch:{ NoSuchFieldError -> 0x0240 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0240 }
                r2 = 48
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0240 }
            L_0x0240:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x024c }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.ADD_POTENTIAL_POINTS     // Catch:{ NoSuchFieldError -> 0x024c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x024c }
                r2 = 49
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x024c }
            L_0x024c:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0258 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.STATIC_METRICS     // Catch:{ NoSuchFieldError -> 0x0258 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0258 }
                r2 = 50
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0258 }
            L_0x0258:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0264 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.DYNAMIC_METRICS     // Catch:{ NoSuchFieldError -> 0x0264 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0264 }
                r2 = 51
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0264 }
            L_0x0264:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0270 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.UPGRADE_SDK_USER     // Catch:{ NoSuchFieldError -> 0x0270 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0270 }
                r2 = 52
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0270 }
            L_0x0270:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x027c }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.QUESTIONNAIRE_RESULT     // Catch:{ NoSuchFieldError -> 0x027c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x027c }
                r2 = 53
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x027c }
            L_0x027c:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0288 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.SET_GDPRPROPERTIES_REQUEST     // Catch:{ NoSuchFieldError -> 0x0288 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0288 }
                r2 = 54
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0288 }
            L_0x0288:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0294 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.BDR_DRIVER_REPORT     // Catch:{ NoSuchFieldError -> 0x0294 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0294 }
                r2 = 55
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0294 }
            L_0x0294:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x02a0 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.SET_PRIVACY_POLICY_REQUEST     // Catch:{ NoSuchFieldError -> 0x02a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a0 }
                r2 = 56
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02a0 }
            L_0x02a0:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x02ac }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.BDR_DRIVER_MESSAGE     // Catch:{ NoSuchFieldError -> 0x02ac }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ac }
                r2 = 57
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02ac }
            L_0x02ac:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x02b8 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.DEEP_LINK_INSTALLATION     // Catch:{ NoSuchFieldError -> 0x02b8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b8 }
                r2 = 58
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02b8 }
            L_0x02b8:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x02c4 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.THIRD_PARTY_DATA_CONSENT     // Catch:{ NoSuchFieldError -> 0x02c4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c4 }
                r2 = 59
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02c4 }
            L_0x02c4:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x02d0 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.UPDATE_TRIP     // Catch:{ NoSuchFieldError -> 0x02d0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d0 }
                r2 = 60
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02d0 }
            L_0x02d0:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x02dc }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.TICKETING_EXTERNAL_PURCHASE_REPORT     // Catch:{ NoSuchFieldError -> 0x02dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02dc }
                r2 = 61
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02dc }
            L_0x02dc:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x02e8 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.TOD_DRIVER_REPORT     // Catch:{ NoSuchFieldError -> 0x02e8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02e8 }
                r2 = 62
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02e8 }
            L_0x02e8:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x02f4 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.TOD_DRIVER_MESSAGE     // Catch:{ NoSuchFieldError -> 0x02f4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02f4 }
                r2 = 63
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02f4 }
            L_0x02f4:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0300 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.DRIVER_LOCATION_UPDATE     // Catch:{ NoSuchFieldError -> 0x0300 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0300 }
                r2 = 64
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0300 }
            L_0x0300:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x030c }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.TOD_DRIVER_LOCATION     // Catch:{ NoSuchFieldError -> 0x030c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x030c }
                r2 = 65
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x030c }
            L_0x030c:
                int[] r0 = f26085a     // Catch:{ NoSuchFieldError -> 0x0318 }
                com.tranzmate.moovit.protocol.kinesis.MVServerMessage$_Fields r1 = com.tranzmate.moovit.protocol.kinesis.MVServerMessage._Fields.PRIVACY_POLICY_APPROVAL     // Catch:{ NoSuchFieldError -> 0x0318 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0318 }
                r2 = 66
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0318 }
            L_0x0318:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.kinesis.MVServerMessage.C8947a.<clinit>():void");
        }
    }

    static {
        String str = ProductAction.ACTION_CHECKOUT;
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.UPDATE_USER_INFO, new FieldMetaData("updateUserInfo", (byte) 3, new StructMetaData(MVUpdateUserInfo.class)));
        enumMap.put(_Fields.LIMIT_AD_TRACKING_ENABLED, new FieldMetaData("limitAdTrackingEnabled", (byte) 3, new StructMetaData(MVUpdateLimitAdTrackingEnabledState.class)));
        enumMap.put(_Fields.PUSH_TOKEN, new FieldMetaData("pushToken", (byte) 3, new StructMetaData(MVUpdatePushToken.class)));
        enumMap.put(_Fields.ADD_USER_TO_WAITING_METRO_LIST, new FieldMetaData("addUserToWaitingMetroList", (byte) 3, new StructMetaData(MVAddUserToWaitingMetroList.class)));
        enumMap.put(_Fields.UPGRADE_VERSION, new FieldMetaData("upgradeVersion", (byte) 3, new StructMetaData(MVUpdateVersionRequest.class)));
        enumMap.put(_Fields.UPDATE_USER_SETTINGS, new FieldMetaData("updateUserSettings", (byte) 3, new StructMetaData(MVUpdateUserSettingsRequest.class)));
        enumMap.put(_Fields.SYNC_ACK_REQUEST, new FieldMetaData("syncAckRequest", (byte) 3, new StructMetaData(MVSyncAckRequest.class)));
        enumMap.put(_Fields.USER_REPORT_CREATE_REQUEST, new FieldMetaData("userReportCreateRequest", (byte) 3, new StructMetaData(MVCreateReportRequest.class)));
        enumMap.put(_Fields.USER_REPORT_LIKE_REQUEST, new FieldMetaData("userReportLikeRequest", (byte) 3, new StructMetaData(MVLikeReportRequest.class)));
        enumMap.put(_Fields.USER_REPORT_UNLIKE_REQUEST, new FieldMetaData("userReportUnlikeRequest", (byte) 3, new StructMetaData(MVUnLikeReportRequest.class)));
        enumMap.put(_Fields.USER_REPORT_FLAG_INAPPROPRIATE_REQUEST, new FieldMetaData("userReportFlagInappropriateRequest", (byte) 3, new StructMetaData(MVFlagInAppropriateReportRequest.class)));
        enumMap.put(_Fields.USER_REPORT_UNFLAG_INAPPROPRIATE_REQUEST, new FieldMetaData("userReportUnflagInappropriateRequest", (byte) 3, new StructMetaData(MVUnflagInAppropriateReportRequest.class)));
        enumMap.put(_Fields.USER_REPORT_DELETE_REQUEST, new FieldMetaData("userReportDeleteRequest", (byte) 3, new StructMetaData(MVDeleteReportsRequest.class)));
        enumMap.put(_Fields.USER_REPORT_RESET_LIKE_UNLIKE_USER_REPORT_REQUEST, new FieldMetaData("userReportResetLikeUnlikeUserReportRequest", (byte) 3, new StructMetaData(MVResetLikeUnlikeUserReportRequest.class)));
        enumMap.put(_Fields.LINE_ALERT_SUBSCRIPTION_UPDATE, new FieldMetaData("lineAlertSubscriptionUpdate", (byte) 3, new StructMetaData(MVLineAlertSubscriptionUpdate.class)));
        enumMap.put(_Fields.NAVIGATION_QUALITY_REPORT, new FieldMetaData("navigationQualityReport", (byte) 3, new StructMetaData(MVNavigationQualityReport.class)));
        enumMap.put(_Fields.PUSH_NOTIFICATION_REPORT, new FieldMetaData("pushNotificationReport", (byte) 3, new StructMetaData(MVPushNotificationReport.class)));
        enumMap.put(_Fields.ACTION_TYPE, new FieldMetaData("actionType", (byte) 3, new EnumMetaData(MVUserActionType.class)));
        enumMap.put(_Fields.UPDATE_USER_OS_VERSION, new FieldMetaData("updateUserOsVersion", (byte) 3, new StructMetaData(MVUpdateUserOsVersion.class)));
        enumMap.put(_Fields.SET_ADVERTISING_INFO_REQUEST, new FieldMetaData("setAdvertisingInfoRequest", (byte) 3, new StructMetaData(MVSetAdvertisingInfoRequest.class)));
        enumMap.put(_Fields.CHECKOUT, new FieldMetaData(str, (byte) 3, new StructMetaData(MVCheckOutRequest.class)));
        enumMap.put(_Fields.SET_FAVORITES, new FieldMetaData("setFavorites", (byte) 3, new StructMetaData(MVSetFavorites.class)));
        enumMap.put(_Fields.UPDATE_DEVICE_NAME, new FieldMetaData("updateDeviceName", (byte) 3, new StructMetaData(MVUpdateDeviceName.class)));
        enumMap.put(_Fields.OTP_SCORING_DATA, new FieldMetaData("otpScoringData", (byte) 3, new StructMetaData(MVOTPScoringData.class)));
        enumMap.put(_Fields.LINE_GAME_REPORT, new FieldMetaData("lineGameReport", (byte) 3, new StructMetaData(MVLineGameReport.class)));
        enumMap.put(_Fields.USERS_REPORTS_FOR_REDSHIFT, new FieldMetaData("usersReportsForRedshift", (byte) 3, new StructMetaData(MVUsersReportsForRedshift.class)));
        enumMap.put(_Fields.REPORTS_ACTIONS_FOR_REDSHIFT, new FieldMetaData("reportsActionsForRedshift", (byte) 3, new StructMetaData(MVUsersReportsActionsForRedshift.class)));
        enumMap.put(_Fields.USER_EXPERIMENT_INFO, new FieldMetaData("userExperimentInfo", (byte) 3, new StructMetaData(MVSetUserExperimentInfo.class)));
        enumMap.put(_Fields.CAR_POOL_RIDE_SURVEY, new FieldMetaData("carPoolRideSurvey", (byte) 3, new StructMetaData(MVCarPoolSurveyAnswer.class)));
        enumMap.put(_Fields.START_DATA_COLLECTION_NOTIFICATION, new FieldMetaData("startDataCollectionNotification", (byte) 3, new StructMetaData(MVStartDataCollectionNotification.class)));
        enumMap.put(_Fields.APPLICATION_INFOS, new FieldMetaData("applicationInfos", (byte) 3, new StructMetaData(MVApplicationInfos.class)));
        enumMap.put(_Fields.USER_HOME_WORK_REQUEST, new FieldMetaData("userHomeWorkRequest", (byte) 3, new StructMetaData(MVSetUserHomeWorkRequest.class)));
        enumMap.put(_Fields.SET_VERIFIED_PHONE_NUMBER, new FieldMetaData("setVerifiedPhoneNumber", (byte) 3, new StructMetaData(MVSetVerifiedPhoneNumber.class)));
        enumMap.put(_Fields.SET_FAVORITE_LINE_GROUPS_AND_STOPS, new FieldMetaData("setFavoriteLineGroupsAndStops", (byte) 3, new StructMetaData(MVSetFavoriteLineGroupsAndStops.class)));
        enumMap.put(_Fields.USER_TRANSIT_CARD_TOPUP_REQUEST, new FieldMetaData("userTransitCardTopupRequest", (byte) 3, new StructMetaData(MVTCATopupUserRequest.class)));
        enumMap.put(_Fields.CAR_POOL_PASSENGERS_WORK_DETAILS, new FieldMetaData("carPoolPassengersWorkDetails", (byte) 3, new StructMetaData(MVCarPoolWorkDetails.class)));
        enumMap.put(_Fields.SURVEY_ANSWERS, new FieldMetaData("surveyAnswers", (byte) 3, new StructMetaData(MVSurveyAnswers.class)));
        enumMap.put(_Fields.USER_LOCALE, new FieldMetaData("userLocale", (byte) 3, new StructMetaData(MVChangeUserLangRequest.class)));
        enumMap.put(_Fields.PROFILER_RECORDING_START, new FieldMetaData("profilerRecordingStart", (byte) 3, new StructMetaData(MVProfilerRecordingStart.class)));
        enumMap.put(_Fields.PROFILER_RECORDING_STOP, new FieldMetaData("profilerRecordingStop", (byte) 3, new StructMetaData(MVProfilerRecordingStop.class)));
        enumMap.put(_Fields.METRO_REVISION_UPDATED, new FieldMetaData("metroRevisionUpdated", (byte) 3, new StructMetaData(MVMetroRevisionActivated.class)));
        enumMap.put(_Fields.CLIENT_CONFIGURATION_ACTIVATED, new FieldMetaData("clientConfigurationActivated", (byte) 3, new StructMetaData(MVClientConfigurationActivated.class)));
        enumMap.put(_Fields.DC_CONFIGURATION_ACTIVATED, new FieldMetaData("dcConfigurationActivated", (byte) 3, new StructMetaData(MVDCConfigurationActivated.class)));
        enumMap.put(_Fields.DC_RECORDING_START, new FieldMetaData("dcRecordingStart", (byte) 3, new StructMetaData(MVDCRecordingStart.class)));
        enumMap.put(_Fields.DC_RECORDING_STOP, new FieldMetaData("dcRecordingStop", (byte) 3, new StructMetaData(MVDCRecordingEnd.class)));
        enumMap.put(_Fields.LOCATION_STATUS, new FieldMetaData("locationStatus", (byte) 3, new StructMetaData(MVLocationStatus.class)));
        enumMap.put(_Fields.PROFILER_CONFIGURATION_ACTIVATED, new FieldMetaData("profilerConfigurationActivated", (byte) 3, new StructMetaData(MVProfilerConfigurationActivated.class)));
        enumMap.put(_Fields.WIFI_STATUS, new FieldMetaData("wifiStatus", (byte) 3, new StructMetaData(MVWifiStatus.class)));
        enumMap.put(_Fields.ADD_POTENTIAL_POINTS, new FieldMetaData("addPotentialPoints", (byte) 3, new StructMetaData(MVAddPotentialPointsRequest.class)));
        enumMap.put(_Fields.STATIC_METRICS, new FieldMetaData("staticMetrics", (byte) 3, new StructMetaData(MVStaticMetricsServerMessage.class)));
        enumMap.put(_Fields.DYNAMIC_METRICS, new FieldMetaData("dynamicMetrics", (byte) 3, new StructMetaData(MVDynamicMetricsServerMessage.class)));
        enumMap.put(_Fields.UPGRADE_SDK_USER, new FieldMetaData("upgradeSdkUser", (byte) 3, new StructMetaData(MVUpgradeSdkUser.class)));
        enumMap.put(_Fields.QUESTIONNAIRE_RESULT, new FieldMetaData("questionnaireResult", (byte) 3, new StructMetaData(MVQuestionnaireResult.class)));
        enumMap.put(_Fields.SET_GDPRPROPERTIES_REQUEST, new FieldMetaData("setGDPRPropertiesRequest", (byte) 3, new StructMetaData(MVSetGDPRPropertiesRequest.class)));
        enumMap.put(_Fields.BDR_DRIVER_REPORT, new FieldMetaData("bdrDriverReport", (byte) 3, new StructMetaData(MVDriverReportServerMessage.class)));
        enumMap.put(_Fields.SET_PRIVACY_POLICY_REQUEST, new FieldMetaData("setPrivacyPolicyRequest", (byte) 3, new StructMetaData(MVSetPrivacyPolicyRequest.class)));
        enumMap.put(_Fields.BDR_DRIVER_MESSAGE, new FieldMetaData("bdrDriverMessage", (byte) 3, new StructMetaData(MVDriverMessageServerMessage.class)));
        enumMap.put(_Fields.DEEP_LINK_INSTALLATION, new FieldMetaData("deepLinkInstallation", (byte) 3, new StructMetaData(MVDeepLinkInstallation.class)));
        enumMap.put(_Fields.THIRD_PARTY_DATA_CONSENT, new FieldMetaData("thirdPartyDataConsent", (byte) 3, new StructMetaData(MVUpdateConsentRequest.class)));
        enumMap.put(_Fields.UPDATE_TRIP, new FieldMetaData("updateTrip", (byte) 3, new StructMetaData(MVUpdateTripRequest.class)));
        enumMap.put(_Fields.TICKETING_EXTERNAL_PURCHASE_REPORT, new FieldMetaData("ticketingExternalPurchaseReport", (byte) 3, new StructMetaData(MVTicketingExternalPurchaseReport.class)));
        enumMap.put(_Fields.TOD_DRIVER_REPORT, new FieldMetaData("todDriverReport", (byte) 3, new StructMetaData(com.tranzmate.moovit.protocol.tod.MVDriverReportServerMessage.class)));
        enumMap.put(_Fields.TOD_DRIVER_MESSAGE, new FieldMetaData("todDriverMessage", (byte) 3, new StructMetaData(com.tranzmate.moovit.protocol.tod.MVDriverMessageServerMessage.class)));
        enumMap.put(_Fields.DRIVER_LOCATION_UPDATE, new FieldMetaData("driverLocationUpdate", (byte) 3, new StructMetaData(MVDriverLocationUpdateRequest.class)));
        enumMap.put(_Fields.TOD_DRIVER_LOCATION, new FieldMetaData("todDriverLocation", (byte) 3, new StructMetaData(MVDriverLocationServerMessage.class)));
        enumMap.put(_Fields.PRIVACY_POLICY_APPROVAL, new FieldMetaData("privacyPolicyApproval", (byte) 3, new StructMetaData(MVPrivacyPolicyApprovalRequest.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26026E0 = unmodifiableMap;
        FieldMetaData.m61947a(MVServerMessage.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            mo25201C1(new C25112b(new C25276a((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            mo25202X0(new C25112b(new C25276a((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: a */
    public final C25085c mo25504a(short s) {
        return _Fields.findByThriftIdOrThrow(s);
    }

    /* renamed from: b */
    public final C25113c mo25505b(C25085c cVar) {
        _Fields _fields = (_Fields) cVar;
        switch (C8947a.f26085a[_fields.ordinal()]) {
            case 1:
                return f26047d;
            case 2:
                return f26048e;
            case 3:
                return f26049f;
            case 4:
                return f26050g;
            case 5:
                return f26051h;
            case 6:
                return f26052i;
            case 7:
                return f26053j;
            case 8:
                return f26054k;
            case 9:
                return f26055l;
            case 10:
                return f26057m;
            case 11:
                return f26059n;
            case 12:
                return f26061o;
            case 13:
                return f26063p;
            case 14:
                return f26065q;
            case 15:
                return f26067r;
            case 16:
                return f26069s;
            case 17:
                return f26071t;
            case 18:
                return f26073u;
            case 19:
                return f26075v;
            case 20:
                return f26077w;
            case 21:
                return f26079x;
            case 22:
                return f26081y;
            case 23:
                return f26083z;
            case 24:
                return f26017A;
            case 25:
                return f26019B;
            case 26:
                return f26021C;
            case 27:
                return f26023D;
            case 28:
                return f26025E;
            case 29:
                return f26027F;
            case 30:
                return f26028G;
            case 31:
                return f26029H;
            case 32:
                return f26030I;
            case 33:
                return f26031J;
            case 34:
                return f26032K;
            case 35:
                return f26033L;
            case 36:
                return f26034M;
            case 37:
                return f26035N;
            case 38:
                return f26036O;
            case 39:
                return f26037P;
            case 40:
                return f26038Q;
            case 41:
                return f26039R;
            case 42:
                return f26040S;
            case 43:
                return f26041T;
            case 44:
                return f26042U;
            case 45:
                return f26043X;
            case 46:
                return f26044Y;
            case 47:
                return f26045Z;
            case 48:
                return f26056l0;
            case 49:
                return f26058m0;
            case 50:
                return f26060n0;
            case 51:
                return f26062o0;
            case 52:
                return f26064p0;
            case 53:
                return f26066q0;
            case 54:
                return f26068r0;
            case 55:
                return f26070s0;
            case 56:
                return f26072t0;
            case 57:
                return f26074u0;
            case 58:
                return f26076v0;
            case 59:
                return f26078w0;
            case 60:
                return f26080x0;
            case 61:
                return f26082y0;
            case 62:
                return f26084z0;
            case 63:
                return f26018A0;
            case 64:
                return f26020B0;
            case 65:
                return f26022C0;
            case 66:
                return f26024D0;
            default:
                throw new IllegalArgumentException("Unknown field id " + _fields);
        }
    }

    public final int compareTo(Object obj) {
        MVServerMessage mVServerMessage = (MVServerMessage) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVServerMessage.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVServerMessage.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVServerMessage mVServerMessage;
        if (!(obj instanceof MVServerMessage) || (mVServerMessage = (MVServerMessage) obj) == null || this.setField_ != mVServerMessage.setField_ || !this.value_.equals(mVServerMessage.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f26046c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            switch (C8947a.f26085a[findByThriftId.ordinal()]) {
                case 1:
                    byte b = cVar.f63356b;
                    if (b == 12) {
                        MVUpdateUserInfo mVUpdateUserInfo = new MVUpdateUserInfo();
                        mVUpdateUserInfo.mo25201C1(gVar);
                        return mVUpdateUserInfo;
                    }
                    C25122h.m63098a(gVar, b);
                    return null;
                case 2:
                    byte b2 = cVar.f63356b;
                    if (b2 == 12) {
                        MVUpdateLimitAdTrackingEnabledState mVUpdateLimitAdTrackingEnabledState = new MVUpdateLimitAdTrackingEnabledState();
                        mVUpdateLimitAdTrackingEnabledState.mo25201C1(gVar);
                        return mVUpdateLimitAdTrackingEnabledState;
                    }
                    C25122h.m63098a(gVar, b2);
                    return null;
                case 3:
                    byte b3 = cVar.f63356b;
                    if (b3 == 12) {
                        MVUpdatePushToken mVUpdatePushToken = new MVUpdatePushToken();
                        mVUpdatePushToken.mo25201C1(gVar);
                        return mVUpdatePushToken;
                    }
                    C25122h.m63098a(gVar, b3);
                    return null;
                case 4:
                    byte b4 = cVar.f63356b;
                    if (b4 == 12) {
                        MVAddUserToWaitingMetroList mVAddUserToWaitingMetroList = new MVAddUserToWaitingMetroList();
                        mVAddUserToWaitingMetroList.mo25201C1(gVar);
                        return mVAddUserToWaitingMetroList;
                    }
                    C25122h.m63098a(gVar, b4);
                    return null;
                case 5:
                    byte b5 = cVar.f63356b;
                    if (b5 == 12) {
                        MVUpdateVersionRequest mVUpdateVersionRequest = new MVUpdateVersionRequest();
                        mVUpdateVersionRequest.mo25201C1(gVar);
                        return mVUpdateVersionRequest;
                    }
                    C25122h.m63098a(gVar, b5);
                    return null;
                case 6:
                    byte b6 = cVar.f63356b;
                    if (b6 == 12) {
                        MVUpdateUserSettingsRequest mVUpdateUserSettingsRequest = new MVUpdateUserSettingsRequest();
                        mVUpdateUserSettingsRequest.mo25201C1(gVar);
                        return mVUpdateUserSettingsRequest;
                    }
                    C25122h.m63098a(gVar, b6);
                    return null;
                case 7:
                    byte b7 = cVar.f63356b;
                    if (b7 == 12) {
                        MVSyncAckRequest mVSyncAckRequest = new MVSyncAckRequest();
                        mVSyncAckRequest.mo25201C1(gVar);
                        return mVSyncAckRequest;
                    }
                    C25122h.m63098a(gVar, b7);
                    return null;
                case 8:
                    byte b8 = cVar.f63356b;
                    if (b8 == 12) {
                        MVCreateReportRequest mVCreateReportRequest = new MVCreateReportRequest();
                        mVCreateReportRequest.mo25201C1(gVar);
                        return mVCreateReportRequest;
                    }
                    C25122h.m63098a(gVar, b8);
                    return null;
                case 9:
                    byte b9 = cVar.f63356b;
                    if (b9 == 12) {
                        MVLikeReportRequest mVLikeReportRequest = new MVLikeReportRequest();
                        mVLikeReportRequest.mo25201C1(gVar);
                        return mVLikeReportRequest;
                    }
                    C25122h.m63098a(gVar, b9);
                    return null;
                case 10:
                    byte b11 = cVar.f63356b;
                    if (b11 == 12) {
                        MVUnLikeReportRequest mVUnLikeReportRequest = new MVUnLikeReportRequest();
                        mVUnLikeReportRequest.mo25201C1(gVar);
                        return mVUnLikeReportRequest;
                    }
                    C25122h.m63098a(gVar, b11);
                    return null;
                case 11:
                    byte b12 = cVar.f63356b;
                    if (b12 == 12) {
                        MVFlagInAppropriateReportRequest mVFlagInAppropriateReportRequest = new MVFlagInAppropriateReportRequest();
                        mVFlagInAppropriateReportRequest.mo25201C1(gVar);
                        return mVFlagInAppropriateReportRequest;
                    }
                    C25122h.m63098a(gVar, b12);
                    return null;
                case 12:
                    byte b13 = cVar.f63356b;
                    if (b13 == 12) {
                        MVUnflagInAppropriateReportRequest mVUnflagInAppropriateReportRequest = new MVUnflagInAppropriateReportRequest();
                        mVUnflagInAppropriateReportRequest.mo25201C1(gVar);
                        return mVUnflagInAppropriateReportRequest;
                    }
                    C25122h.m63098a(gVar, b13);
                    return null;
                case 13:
                    byte b14 = cVar.f63356b;
                    if (b14 == 12) {
                        MVDeleteReportsRequest mVDeleteReportsRequest = new MVDeleteReportsRequest();
                        mVDeleteReportsRequest.mo25201C1(gVar);
                        return mVDeleteReportsRequest;
                    }
                    C25122h.m63098a(gVar, b14);
                    return null;
                case 14:
                    byte b15 = cVar.f63356b;
                    if (b15 == 12) {
                        MVResetLikeUnlikeUserReportRequest mVResetLikeUnlikeUserReportRequest = new MVResetLikeUnlikeUserReportRequest();
                        mVResetLikeUnlikeUserReportRequest.mo25201C1(gVar);
                        return mVResetLikeUnlikeUserReportRequest;
                    }
                    C25122h.m63098a(gVar, b15);
                    return null;
                case 15:
                    byte b16 = cVar.f63356b;
                    if (b16 == 12) {
                        MVLineAlertSubscriptionUpdate mVLineAlertSubscriptionUpdate = new MVLineAlertSubscriptionUpdate();
                        mVLineAlertSubscriptionUpdate.mo25201C1(gVar);
                        return mVLineAlertSubscriptionUpdate;
                    }
                    C25122h.m63098a(gVar, b16);
                    return null;
                case 16:
                    byte b17 = cVar.f63356b;
                    if (b17 == 12) {
                        MVNavigationQualityReport mVNavigationQualityReport = new MVNavigationQualityReport();
                        mVNavigationQualityReport.mo25201C1(gVar);
                        return mVNavigationQualityReport;
                    }
                    C25122h.m63098a(gVar, b17);
                    return null;
                case 17:
                    byte b18 = cVar.f63356b;
                    if (b18 == 12) {
                        MVPushNotificationReport mVPushNotificationReport = new MVPushNotificationReport();
                        mVPushNotificationReport.mo25201C1(gVar);
                        return mVPushNotificationReport;
                    }
                    C25122h.m63098a(gVar, b18);
                    return null;
                case 18:
                    byte b19 = cVar.f63356b;
                    if (b19 == 8) {
                        return MVUserActionType.findByValue(gVar.mo61696i());
                    }
                    C25122h.m63098a(gVar, b19);
                    return null;
                case 19:
                    byte b21 = cVar.f63356b;
                    if (b21 == 12) {
                        MVUpdateUserOsVersion mVUpdateUserOsVersion = new MVUpdateUserOsVersion();
                        mVUpdateUserOsVersion.mo25201C1(gVar);
                        return mVUpdateUserOsVersion;
                    }
                    C25122h.m63098a(gVar, b21);
                    return null;
                case 20:
                    byte b22 = cVar.f63356b;
                    if (b22 == 12) {
                        MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest = new MVSetAdvertisingInfoRequest();
                        mVSetAdvertisingInfoRequest.mo25201C1(gVar);
                        return mVSetAdvertisingInfoRequest;
                    }
                    C25122h.m63098a(gVar, b22);
                    return null;
                case 21:
                    byte b23 = cVar.f63356b;
                    if (b23 == 12) {
                        MVCheckOutRequest mVCheckOutRequest = new MVCheckOutRequest();
                        mVCheckOutRequest.mo25201C1(gVar);
                        return mVCheckOutRequest;
                    }
                    C25122h.m63098a(gVar, b23);
                    return null;
                case 22:
                    byte b24 = cVar.f63356b;
                    if (b24 == 12) {
                        MVSetFavorites mVSetFavorites = new MVSetFavorites();
                        mVSetFavorites.mo25201C1(gVar);
                        return mVSetFavorites;
                    }
                    C25122h.m63098a(gVar, b24);
                    return null;
                case 23:
                    byte b25 = cVar.f63356b;
                    if (b25 == 12) {
                        MVUpdateDeviceName mVUpdateDeviceName = new MVUpdateDeviceName();
                        mVUpdateDeviceName.mo25201C1(gVar);
                        return mVUpdateDeviceName;
                    }
                    C25122h.m63098a(gVar, b25);
                    return null;
                case 24:
                    byte b26 = cVar.f63356b;
                    if (b26 == 12) {
                        MVOTPScoringData mVOTPScoringData = new MVOTPScoringData();
                        mVOTPScoringData.mo25201C1(gVar);
                        return mVOTPScoringData;
                    }
                    C25122h.m63098a(gVar, b26);
                    return null;
                case 25:
                    byte b27 = cVar.f63356b;
                    if (b27 == 12) {
                        MVLineGameReport mVLineGameReport = new MVLineGameReport();
                        mVLineGameReport.mo25201C1(gVar);
                        return mVLineGameReport;
                    }
                    C25122h.m63098a(gVar, b27);
                    return null;
                case 26:
                    byte b28 = cVar.f63356b;
                    if (b28 == 12) {
                        MVUsersReportsForRedshift mVUsersReportsForRedshift = new MVUsersReportsForRedshift();
                        mVUsersReportsForRedshift.mo25201C1(gVar);
                        return mVUsersReportsForRedshift;
                    }
                    C25122h.m63098a(gVar, b28);
                    return null;
                case 27:
                    byte b29 = cVar.f63356b;
                    if (b29 == 12) {
                        MVUsersReportsActionsForRedshift mVUsersReportsActionsForRedshift = new MVUsersReportsActionsForRedshift();
                        mVUsersReportsActionsForRedshift.mo25201C1(gVar);
                        return mVUsersReportsActionsForRedshift;
                    }
                    C25122h.m63098a(gVar, b29);
                    return null;
                case 28:
                    byte b31 = cVar.f63356b;
                    if (b31 == 12) {
                        MVSetUserExperimentInfo mVSetUserExperimentInfo = new MVSetUserExperimentInfo();
                        mVSetUserExperimentInfo.mo25201C1(gVar);
                        return mVSetUserExperimentInfo;
                    }
                    C25122h.m63098a(gVar, b31);
                    return null;
                case 29:
                    byte b32 = cVar.f63356b;
                    if (b32 == 12) {
                        MVCarPoolSurveyAnswer mVCarPoolSurveyAnswer = new MVCarPoolSurveyAnswer();
                        mVCarPoolSurveyAnswer.mo25201C1(gVar);
                        return mVCarPoolSurveyAnswer;
                    }
                    C25122h.m63098a(gVar, b32);
                    return null;
                case 30:
                    byte b33 = cVar.f63356b;
                    if (b33 == 12) {
                        MVStartDataCollectionNotification mVStartDataCollectionNotification = new MVStartDataCollectionNotification();
                        mVStartDataCollectionNotification.mo25201C1(gVar);
                        return mVStartDataCollectionNotification;
                    }
                    C25122h.m63098a(gVar, b33);
                    return null;
                case 31:
                    byte b34 = cVar.f63356b;
                    if (b34 == 12) {
                        MVApplicationInfos mVApplicationInfos = new MVApplicationInfos();
                        mVApplicationInfos.mo25201C1(gVar);
                        return mVApplicationInfos;
                    }
                    C25122h.m63098a(gVar, b34);
                    return null;
                case 32:
                    byte b35 = cVar.f63356b;
                    if (b35 == 12) {
                        MVSetUserHomeWorkRequest mVSetUserHomeWorkRequest = new MVSetUserHomeWorkRequest();
                        mVSetUserHomeWorkRequest.mo25201C1(gVar);
                        return mVSetUserHomeWorkRequest;
                    }
                    C25122h.m63098a(gVar, b35);
                    return null;
                case 33:
                    byte b36 = cVar.f63356b;
                    if (b36 == 12) {
                        MVSetVerifiedPhoneNumber mVSetVerifiedPhoneNumber = new MVSetVerifiedPhoneNumber();
                        mVSetVerifiedPhoneNumber.mo25201C1(gVar);
                        return mVSetVerifiedPhoneNumber;
                    }
                    C25122h.m63098a(gVar, b36);
                    return null;
                case 34:
                    byte b37 = cVar.f63356b;
                    if (b37 == 12) {
                        MVSetFavoriteLineGroupsAndStops mVSetFavoriteLineGroupsAndStops = new MVSetFavoriteLineGroupsAndStops();
                        mVSetFavoriteLineGroupsAndStops.mo25201C1(gVar);
                        return mVSetFavoriteLineGroupsAndStops;
                    }
                    C25122h.m63098a(gVar, b37);
                    return null;
                case 35:
                    byte b38 = cVar.f63356b;
                    if (b38 == 12) {
                        MVTCATopupUserRequest mVTCATopupUserRequest = new MVTCATopupUserRequest();
                        mVTCATopupUserRequest.mo25201C1(gVar);
                        return mVTCATopupUserRequest;
                    }
                    C25122h.m63098a(gVar, b38);
                    return null;
                case 36:
                    byte b39 = cVar.f63356b;
                    if (b39 == 12) {
                        MVCarPoolWorkDetails mVCarPoolWorkDetails = new MVCarPoolWorkDetails();
                        mVCarPoolWorkDetails.mo25201C1(gVar);
                        return mVCarPoolWorkDetails;
                    }
                    C25122h.m63098a(gVar, b39);
                    return null;
                case 37:
                    byte b41 = cVar.f63356b;
                    if (b41 == 12) {
                        MVSurveyAnswers mVSurveyAnswers = new MVSurveyAnswers();
                        mVSurveyAnswers.mo25201C1(gVar);
                        return mVSurveyAnswers;
                    }
                    C25122h.m63098a(gVar, b41);
                    return null;
                case 38:
                    byte b42 = cVar.f63356b;
                    if (b42 == 12) {
                        MVChangeUserLangRequest mVChangeUserLangRequest = new MVChangeUserLangRequest();
                        mVChangeUserLangRequest.mo25201C1(gVar);
                        return mVChangeUserLangRequest;
                    }
                    C25122h.m63098a(gVar, b42);
                    return null;
                case 39:
                    byte b43 = cVar.f63356b;
                    if (b43 == 12) {
                        MVProfilerRecordingStart mVProfilerRecordingStart = new MVProfilerRecordingStart();
                        mVProfilerRecordingStart.mo25201C1(gVar);
                        return mVProfilerRecordingStart;
                    }
                    C25122h.m63098a(gVar, b43);
                    return null;
                case 40:
                    byte b44 = cVar.f63356b;
                    if (b44 == 12) {
                        MVProfilerRecordingStop mVProfilerRecordingStop = new MVProfilerRecordingStop();
                        mVProfilerRecordingStop.mo25201C1(gVar);
                        return mVProfilerRecordingStop;
                    }
                    C25122h.m63098a(gVar, b44);
                    return null;
                case 41:
                    byte b45 = cVar.f63356b;
                    if (b45 == 12) {
                        MVMetroRevisionActivated mVMetroRevisionActivated = new MVMetroRevisionActivated();
                        mVMetroRevisionActivated.mo25201C1(gVar);
                        return mVMetroRevisionActivated;
                    }
                    C25122h.m63098a(gVar, b45);
                    return null;
                case 42:
                    byte b46 = cVar.f63356b;
                    if (b46 == 12) {
                        MVClientConfigurationActivated mVClientConfigurationActivated = new MVClientConfigurationActivated();
                        mVClientConfigurationActivated.mo25201C1(gVar);
                        return mVClientConfigurationActivated;
                    }
                    C25122h.m63098a(gVar, b46);
                    return null;
                case 43:
                    byte b47 = cVar.f63356b;
                    if (b47 == 12) {
                        MVDCConfigurationActivated mVDCConfigurationActivated = new MVDCConfigurationActivated();
                        mVDCConfigurationActivated.mo25201C1(gVar);
                        return mVDCConfigurationActivated;
                    }
                    C25122h.m63098a(gVar, b47);
                    return null;
                case 44:
                    byte b48 = cVar.f63356b;
                    if (b48 == 12) {
                        MVDCRecordingStart mVDCRecordingStart = new MVDCRecordingStart();
                        mVDCRecordingStart.mo25201C1(gVar);
                        return mVDCRecordingStart;
                    }
                    C25122h.m63098a(gVar, b48);
                    return null;
                case 45:
                    byte b49 = cVar.f63356b;
                    if (b49 == 12) {
                        MVDCRecordingEnd mVDCRecordingEnd = new MVDCRecordingEnd();
                        mVDCRecordingEnd.mo25201C1(gVar);
                        return mVDCRecordingEnd;
                    }
                    C25122h.m63098a(gVar, b49);
                    return null;
                case 46:
                    byte b51 = cVar.f63356b;
                    if (b51 == 12) {
                        MVLocationStatus mVLocationStatus = new MVLocationStatus();
                        mVLocationStatus.mo25201C1(gVar);
                        return mVLocationStatus;
                    }
                    C25122h.m63098a(gVar, b51);
                    return null;
                case 47:
                    byte b52 = cVar.f63356b;
                    if (b52 == 12) {
                        MVProfilerConfigurationActivated mVProfilerConfigurationActivated = new MVProfilerConfigurationActivated();
                        mVProfilerConfigurationActivated.mo25201C1(gVar);
                        return mVProfilerConfigurationActivated;
                    }
                    C25122h.m63098a(gVar, b52);
                    return null;
                case 48:
                    byte b53 = cVar.f63356b;
                    if (b53 == 12) {
                        MVWifiStatus mVWifiStatus = new MVWifiStatus();
                        mVWifiStatus.mo25201C1(gVar);
                        return mVWifiStatus;
                    }
                    C25122h.m63098a(gVar, b53);
                    return null;
                case 49:
                    byte b54 = cVar.f63356b;
                    if (b54 == 12) {
                        MVAddPotentialPointsRequest mVAddPotentialPointsRequest = new MVAddPotentialPointsRequest();
                        mVAddPotentialPointsRequest.mo25201C1(gVar);
                        return mVAddPotentialPointsRequest;
                    }
                    C25122h.m63098a(gVar, b54);
                    return null;
                case 50:
                    byte b55 = cVar.f63356b;
                    if (b55 == 12) {
                        MVStaticMetricsServerMessage mVStaticMetricsServerMessage = new MVStaticMetricsServerMessage();
                        mVStaticMetricsServerMessage.mo25201C1(gVar);
                        return mVStaticMetricsServerMessage;
                    }
                    C25122h.m63098a(gVar, b55);
                    return null;
                case 51:
                    byte b56 = cVar.f63356b;
                    if (b56 == 12) {
                        MVDynamicMetricsServerMessage mVDynamicMetricsServerMessage = new MVDynamicMetricsServerMessage();
                        mVDynamicMetricsServerMessage.mo25201C1(gVar);
                        return mVDynamicMetricsServerMessage;
                    }
                    C25122h.m63098a(gVar, b56);
                    return null;
                case 52:
                    byte b57 = cVar.f63356b;
                    if (b57 == 12) {
                        MVUpgradeSdkUser mVUpgradeSdkUser = new MVUpgradeSdkUser();
                        mVUpgradeSdkUser.mo25201C1(gVar);
                        return mVUpgradeSdkUser;
                    }
                    C25122h.m63098a(gVar, b57);
                    return null;
                case 53:
                    byte b58 = cVar.f63356b;
                    if (b58 == 12) {
                        MVQuestionnaireResult mVQuestionnaireResult = new MVQuestionnaireResult();
                        mVQuestionnaireResult.mo25201C1(gVar);
                        return mVQuestionnaireResult;
                    }
                    C25122h.m63098a(gVar, b58);
                    return null;
                case 54:
                    byte b59 = cVar.f63356b;
                    if (b59 == 12) {
                        MVSetGDPRPropertiesRequest mVSetGDPRPropertiesRequest = new MVSetGDPRPropertiesRequest();
                        mVSetGDPRPropertiesRequest.mo25201C1(gVar);
                        return mVSetGDPRPropertiesRequest;
                    }
                    C25122h.m63098a(gVar, b59);
                    return null;
                case 55:
                    byte b61 = cVar.f63356b;
                    if (b61 == 12) {
                        MVDriverReportServerMessage mVDriverReportServerMessage = new MVDriverReportServerMessage();
                        mVDriverReportServerMessage.mo25201C1(gVar);
                        return mVDriverReportServerMessage;
                    }
                    C25122h.m63098a(gVar, b61);
                    return null;
                case 56:
                    byte b62 = cVar.f63356b;
                    if (b62 == 12) {
                        MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest = new MVSetPrivacyPolicyRequest();
                        mVSetPrivacyPolicyRequest.mo25201C1(gVar);
                        return mVSetPrivacyPolicyRequest;
                    }
                    C25122h.m63098a(gVar, b62);
                    return null;
                case 57:
                    byte b63 = cVar.f63356b;
                    if (b63 == 12) {
                        MVDriverMessageServerMessage mVDriverMessageServerMessage = new MVDriverMessageServerMessage();
                        mVDriverMessageServerMessage.mo25201C1(gVar);
                        return mVDriverMessageServerMessage;
                    }
                    C25122h.m63098a(gVar, b63);
                    return null;
                case 58:
                    byte b64 = cVar.f63356b;
                    if (b64 == 12) {
                        MVDeepLinkInstallation mVDeepLinkInstallation = new MVDeepLinkInstallation();
                        mVDeepLinkInstallation.mo25201C1(gVar);
                        return mVDeepLinkInstallation;
                    }
                    C25122h.m63098a(gVar, b64);
                    return null;
                case 59:
                    byte b65 = cVar.f63356b;
                    if (b65 == 12) {
                        MVUpdateConsentRequest mVUpdateConsentRequest = new MVUpdateConsentRequest();
                        mVUpdateConsentRequest.mo25201C1(gVar);
                        return mVUpdateConsentRequest;
                    }
                    C25122h.m63098a(gVar, b65);
                    return null;
                case 60:
                    byte b66 = cVar.f63356b;
                    if (b66 == 12) {
                        MVUpdateTripRequest mVUpdateTripRequest = new MVUpdateTripRequest();
                        mVUpdateTripRequest.mo25201C1(gVar);
                        return mVUpdateTripRequest;
                    }
                    C25122h.m63098a(gVar, b66);
                    return null;
                case 61:
                    byte b67 = cVar.f63356b;
                    if (b67 == 12) {
                        MVTicketingExternalPurchaseReport mVTicketingExternalPurchaseReport = new MVTicketingExternalPurchaseReport();
                        mVTicketingExternalPurchaseReport.mo25201C1(gVar);
                        return mVTicketingExternalPurchaseReport;
                    }
                    C25122h.m63098a(gVar, b67);
                    return null;
                case 62:
                    byte b68 = cVar.f63356b;
                    if (b68 == 12) {
                        com.tranzmate.moovit.protocol.tod.MVDriverReportServerMessage mVDriverReportServerMessage2 = new com.tranzmate.moovit.protocol.tod.MVDriverReportServerMessage();
                        mVDriverReportServerMessage2.mo25201C1(gVar);
                        return mVDriverReportServerMessage2;
                    }
                    C25122h.m63098a(gVar, b68);
                    return null;
                case 63:
                    byte b69 = cVar.f63356b;
                    if (b69 == 12) {
                        com.tranzmate.moovit.protocol.tod.MVDriverMessageServerMessage mVDriverMessageServerMessage2 = new com.tranzmate.moovit.protocol.tod.MVDriverMessageServerMessage();
                        mVDriverMessageServerMessage2.mo25201C1(gVar);
                        return mVDriverMessageServerMessage2;
                    }
                    C25122h.m63098a(gVar, b69);
                    return null;
                case 64:
                    byte b71 = cVar.f63356b;
                    if (b71 == 12) {
                        MVDriverLocationUpdateRequest mVDriverLocationUpdateRequest = new MVDriverLocationUpdateRequest();
                        mVDriverLocationUpdateRequest.mo25201C1(gVar);
                        return mVDriverLocationUpdateRequest;
                    }
                    C25122h.m63098a(gVar, b71);
                    return null;
                case 65:
                    byte b72 = cVar.f63356b;
                    if (b72 == 12) {
                        MVDriverLocationServerMessage mVDriverLocationServerMessage = new MVDriverLocationServerMessage();
                        mVDriverLocationServerMessage.mo25201C1(gVar);
                        return mVDriverLocationServerMessage;
                    }
                    C25122h.m63098a(gVar, b72);
                    return null;
                case 66:
                    byte b73 = cVar.f63356b;
                    if (b73 == 12) {
                        MVPrivacyPolicyApprovalRequest mVPrivacyPolicyApprovalRequest = new MVPrivacyPolicyApprovalRequest();
                        mVPrivacyPolicyApprovalRequest.mo25201C1(gVar);
                        return mVPrivacyPolicyApprovalRequest;
                    }
                    C25122h.m63098a(gVar, b73);
                    return null;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            C25122h.m63098a(gVar, cVar.f63356b);
            return null;
        }
    }

    /* renamed from: h */
    public final void mo25510h(C25121g gVar) throws TException {
        switch (C8947a.f26085a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVUpdateUserInfo) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVUpdateLimitAdTrackingEnabledState) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVUpdatePushToken) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVAddUserToWaitingMetroList) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVUpdateVersionRequest) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVUpdateUserSettingsRequest) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVSyncAckRequest) this.value_).mo25202X0(gVar);
                return;
            case 8:
                ((MVCreateReportRequest) this.value_).mo25202X0(gVar);
                return;
            case 9:
                ((MVLikeReportRequest) this.value_).mo25202X0(gVar);
                return;
            case 10:
                ((MVUnLikeReportRequest) this.value_).mo25202X0(gVar);
                return;
            case 11:
                ((MVFlagInAppropriateReportRequest) this.value_).mo25202X0(gVar);
                return;
            case 12:
                ((MVUnflagInAppropriateReportRequest) this.value_).mo25202X0(gVar);
                return;
            case 13:
                ((MVDeleteReportsRequest) this.value_).mo25202X0(gVar);
                return;
            case 14:
                ((MVResetLikeUnlikeUserReportRequest) this.value_).mo25202X0(gVar);
                return;
            case 15:
                ((MVLineAlertSubscriptionUpdate) this.value_).mo25202X0(gVar);
                return;
            case 16:
                ((MVNavigationQualityReport) this.value_).mo25202X0(gVar);
                return;
            case 17:
                ((MVPushNotificationReport) this.value_).mo25202X0(gVar);
                return;
            case 18:
                gVar.mo61678B(((MVUserActionType) this.value_).getValue());
                return;
            case 19:
                ((MVUpdateUserOsVersion) this.value_).mo25202X0(gVar);
                return;
            case 20:
                ((MVSetAdvertisingInfoRequest) this.value_).mo25202X0(gVar);
                return;
            case 21:
                ((MVCheckOutRequest) this.value_).mo25202X0(gVar);
                return;
            case 22:
                ((MVSetFavorites) this.value_).mo25202X0(gVar);
                return;
            case 23:
                ((MVUpdateDeviceName) this.value_).mo25202X0(gVar);
                return;
            case 24:
                ((MVOTPScoringData) this.value_).mo25202X0(gVar);
                return;
            case 25:
                ((MVLineGameReport) this.value_).mo25202X0(gVar);
                return;
            case 26:
                ((MVUsersReportsForRedshift) this.value_).mo25202X0(gVar);
                return;
            case 27:
                ((MVUsersReportsActionsForRedshift) this.value_).mo25202X0(gVar);
                return;
            case 28:
                ((MVSetUserExperimentInfo) this.value_).mo25202X0(gVar);
                return;
            case 29:
                ((MVCarPoolSurveyAnswer) this.value_).mo25202X0(gVar);
                return;
            case 30:
                ((MVStartDataCollectionNotification) this.value_).mo25202X0(gVar);
                return;
            case 31:
                ((MVApplicationInfos) this.value_).mo25202X0(gVar);
                return;
            case 32:
                ((MVSetUserHomeWorkRequest) this.value_).mo25202X0(gVar);
                return;
            case 33:
                ((MVSetVerifiedPhoneNumber) this.value_).mo25202X0(gVar);
                return;
            case 34:
                ((MVSetFavoriteLineGroupsAndStops) this.value_).mo25202X0(gVar);
                return;
            case 35:
                ((MVTCATopupUserRequest) this.value_).mo25202X0(gVar);
                return;
            case 36:
                ((MVCarPoolWorkDetails) this.value_).mo25202X0(gVar);
                return;
            case 37:
                ((MVSurveyAnswers) this.value_).mo25202X0(gVar);
                return;
            case 38:
                ((MVChangeUserLangRequest) this.value_).mo25202X0(gVar);
                return;
            case 39:
                ((MVProfilerRecordingStart) this.value_).mo25202X0(gVar);
                return;
            case 40:
                ((MVProfilerRecordingStop) this.value_).mo25202X0(gVar);
                return;
            case 41:
                ((MVMetroRevisionActivated) this.value_).mo25202X0(gVar);
                return;
            case 42:
                ((MVClientConfigurationActivated) this.value_).mo25202X0(gVar);
                return;
            case 43:
                ((MVDCConfigurationActivated) this.value_).mo25202X0(gVar);
                return;
            case 44:
                ((MVDCRecordingStart) this.value_).mo25202X0(gVar);
                return;
            case 45:
                ((MVDCRecordingEnd) this.value_).mo25202X0(gVar);
                return;
            case 46:
                ((MVLocationStatus) this.value_).mo25202X0(gVar);
                return;
            case 47:
                ((MVProfilerConfigurationActivated) this.value_).mo25202X0(gVar);
                return;
            case 48:
                ((MVWifiStatus) this.value_).mo25202X0(gVar);
                return;
            case 49:
                ((MVAddPotentialPointsRequest) this.value_).mo25202X0(gVar);
                return;
            case 50:
                ((MVStaticMetricsServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 51:
                ((MVDynamicMetricsServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 52:
                ((MVUpgradeSdkUser) this.value_).mo25202X0(gVar);
                return;
            case 53:
                ((MVQuestionnaireResult) this.value_).mo25202X0(gVar);
                return;
            case 54:
                ((MVSetGDPRPropertiesRequest) this.value_).mo25202X0(gVar);
                return;
            case 55:
                ((MVDriverReportServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 56:
                ((MVSetPrivacyPolicyRequest) this.value_).mo25202X0(gVar);
                return;
            case 57:
                ((MVDriverMessageServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 58:
                ((MVDeepLinkInstallation) this.value_).mo25202X0(gVar);
                return;
            case 59:
                ((MVUpdateConsentRequest) this.value_).mo25202X0(gVar);
                return;
            case 60:
                ((MVUpdateTripRequest) this.value_).mo25202X0(gVar);
                return;
            case 61:
                ((MVTicketingExternalPurchaseReport) this.value_).mo25202X0(gVar);
                return;
            case 62:
                ((com.tranzmate.moovit.protocol.tod.MVDriverReportServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 63:
                ((com.tranzmate.moovit.protocol.tod.MVDriverMessageServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 64:
                ((MVDriverLocationUpdateRequest) this.value_).mo25202X0(gVar);
                return;
            case 65:
                ((MVDriverLocationServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 66:
                ((MVPrivacyPolicyApprovalRequest) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final Object mo25512i(C25121g gVar, short s) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(s);
        if (findByThriftId != null) {
            switch (C8947a.f26085a[findByThriftId.ordinal()]) {
                case 1:
                    MVUpdateUserInfo mVUpdateUserInfo = new MVUpdateUserInfo();
                    mVUpdateUserInfo.mo25201C1(gVar);
                    return mVUpdateUserInfo;
                case 2:
                    MVUpdateLimitAdTrackingEnabledState mVUpdateLimitAdTrackingEnabledState = new MVUpdateLimitAdTrackingEnabledState();
                    mVUpdateLimitAdTrackingEnabledState.mo25201C1(gVar);
                    return mVUpdateLimitAdTrackingEnabledState;
                case 3:
                    MVUpdatePushToken mVUpdatePushToken = new MVUpdatePushToken();
                    mVUpdatePushToken.mo25201C1(gVar);
                    return mVUpdatePushToken;
                case 4:
                    MVAddUserToWaitingMetroList mVAddUserToWaitingMetroList = new MVAddUserToWaitingMetroList();
                    mVAddUserToWaitingMetroList.mo25201C1(gVar);
                    return mVAddUserToWaitingMetroList;
                case 5:
                    MVUpdateVersionRequest mVUpdateVersionRequest = new MVUpdateVersionRequest();
                    mVUpdateVersionRequest.mo25201C1(gVar);
                    return mVUpdateVersionRequest;
                case 6:
                    MVUpdateUserSettingsRequest mVUpdateUserSettingsRequest = new MVUpdateUserSettingsRequest();
                    mVUpdateUserSettingsRequest.mo25201C1(gVar);
                    return mVUpdateUserSettingsRequest;
                case 7:
                    MVSyncAckRequest mVSyncAckRequest = new MVSyncAckRequest();
                    mVSyncAckRequest.mo25201C1(gVar);
                    return mVSyncAckRequest;
                case 8:
                    MVCreateReportRequest mVCreateReportRequest = new MVCreateReportRequest();
                    mVCreateReportRequest.mo25201C1(gVar);
                    return mVCreateReportRequest;
                case 9:
                    MVLikeReportRequest mVLikeReportRequest = new MVLikeReportRequest();
                    mVLikeReportRequest.mo25201C1(gVar);
                    return mVLikeReportRequest;
                case 10:
                    MVUnLikeReportRequest mVUnLikeReportRequest = new MVUnLikeReportRequest();
                    mVUnLikeReportRequest.mo25201C1(gVar);
                    return mVUnLikeReportRequest;
                case 11:
                    MVFlagInAppropriateReportRequest mVFlagInAppropriateReportRequest = new MVFlagInAppropriateReportRequest();
                    mVFlagInAppropriateReportRequest.mo25201C1(gVar);
                    return mVFlagInAppropriateReportRequest;
                case 12:
                    MVUnflagInAppropriateReportRequest mVUnflagInAppropriateReportRequest = new MVUnflagInAppropriateReportRequest();
                    mVUnflagInAppropriateReportRequest.mo25201C1(gVar);
                    return mVUnflagInAppropriateReportRequest;
                case 13:
                    MVDeleteReportsRequest mVDeleteReportsRequest = new MVDeleteReportsRequest();
                    mVDeleteReportsRequest.mo25201C1(gVar);
                    return mVDeleteReportsRequest;
                case 14:
                    MVResetLikeUnlikeUserReportRequest mVResetLikeUnlikeUserReportRequest = new MVResetLikeUnlikeUserReportRequest();
                    mVResetLikeUnlikeUserReportRequest.mo25201C1(gVar);
                    return mVResetLikeUnlikeUserReportRequest;
                case 15:
                    MVLineAlertSubscriptionUpdate mVLineAlertSubscriptionUpdate = new MVLineAlertSubscriptionUpdate();
                    mVLineAlertSubscriptionUpdate.mo25201C1(gVar);
                    return mVLineAlertSubscriptionUpdate;
                case 16:
                    MVNavigationQualityReport mVNavigationQualityReport = new MVNavigationQualityReport();
                    mVNavigationQualityReport.mo25201C1(gVar);
                    return mVNavigationQualityReport;
                case 17:
                    MVPushNotificationReport mVPushNotificationReport = new MVPushNotificationReport();
                    mVPushNotificationReport.mo25201C1(gVar);
                    return mVPushNotificationReport;
                case 18:
                    return MVUserActionType.findByValue(gVar.mo61696i());
                case 19:
                    MVUpdateUserOsVersion mVUpdateUserOsVersion = new MVUpdateUserOsVersion();
                    mVUpdateUserOsVersion.mo25201C1(gVar);
                    return mVUpdateUserOsVersion;
                case 20:
                    MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest = new MVSetAdvertisingInfoRequest();
                    mVSetAdvertisingInfoRequest.mo25201C1(gVar);
                    return mVSetAdvertisingInfoRequest;
                case 21:
                    MVCheckOutRequest mVCheckOutRequest = new MVCheckOutRequest();
                    mVCheckOutRequest.mo25201C1(gVar);
                    return mVCheckOutRequest;
                case 22:
                    MVSetFavorites mVSetFavorites = new MVSetFavorites();
                    mVSetFavorites.mo25201C1(gVar);
                    return mVSetFavorites;
                case 23:
                    MVUpdateDeviceName mVUpdateDeviceName = new MVUpdateDeviceName();
                    mVUpdateDeviceName.mo25201C1(gVar);
                    return mVUpdateDeviceName;
                case 24:
                    MVOTPScoringData mVOTPScoringData = new MVOTPScoringData();
                    mVOTPScoringData.mo25201C1(gVar);
                    return mVOTPScoringData;
                case 25:
                    MVLineGameReport mVLineGameReport = new MVLineGameReport();
                    mVLineGameReport.mo25201C1(gVar);
                    return mVLineGameReport;
                case 26:
                    MVUsersReportsForRedshift mVUsersReportsForRedshift = new MVUsersReportsForRedshift();
                    mVUsersReportsForRedshift.mo25201C1(gVar);
                    return mVUsersReportsForRedshift;
                case 27:
                    MVUsersReportsActionsForRedshift mVUsersReportsActionsForRedshift = new MVUsersReportsActionsForRedshift();
                    mVUsersReportsActionsForRedshift.mo25201C1(gVar);
                    return mVUsersReportsActionsForRedshift;
                case 28:
                    MVSetUserExperimentInfo mVSetUserExperimentInfo = new MVSetUserExperimentInfo();
                    mVSetUserExperimentInfo.mo25201C1(gVar);
                    return mVSetUserExperimentInfo;
                case 29:
                    MVCarPoolSurveyAnswer mVCarPoolSurveyAnswer = new MVCarPoolSurveyAnswer();
                    mVCarPoolSurveyAnswer.mo25201C1(gVar);
                    return mVCarPoolSurveyAnswer;
                case 30:
                    MVStartDataCollectionNotification mVStartDataCollectionNotification = new MVStartDataCollectionNotification();
                    mVStartDataCollectionNotification.mo25201C1(gVar);
                    return mVStartDataCollectionNotification;
                case 31:
                    MVApplicationInfos mVApplicationInfos = new MVApplicationInfos();
                    mVApplicationInfos.mo25201C1(gVar);
                    return mVApplicationInfos;
                case 32:
                    MVSetUserHomeWorkRequest mVSetUserHomeWorkRequest = new MVSetUserHomeWorkRequest();
                    mVSetUserHomeWorkRequest.mo25201C1(gVar);
                    return mVSetUserHomeWorkRequest;
                case 33:
                    MVSetVerifiedPhoneNumber mVSetVerifiedPhoneNumber = new MVSetVerifiedPhoneNumber();
                    mVSetVerifiedPhoneNumber.mo25201C1(gVar);
                    return mVSetVerifiedPhoneNumber;
                case 34:
                    MVSetFavoriteLineGroupsAndStops mVSetFavoriteLineGroupsAndStops = new MVSetFavoriteLineGroupsAndStops();
                    mVSetFavoriteLineGroupsAndStops.mo25201C1(gVar);
                    return mVSetFavoriteLineGroupsAndStops;
                case 35:
                    MVTCATopupUserRequest mVTCATopupUserRequest = new MVTCATopupUserRequest();
                    mVTCATopupUserRequest.mo25201C1(gVar);
                    return mVTCATopupUserRequest;
                case 36:
                    MVCarPoolWorkDetails mVCarPoolWorkDetails = new MVCarPoolWorkDetails();
                    mVCarPoolWorkDetails.mo25201C1(gVar);
                    return mVCarPoolWorkDetails;
                case 37:
                    MVSurveyAnswers mVSurveyAnswers = new MVSurveyAnswers();
                    mVSurveyAnswers.mo25201C1(gVar);
                    return mVSurveyAnswers;
                case 38:
                    MVChangeUserLangRequest mVChangeUserLangRequest = new MVChangeUserLangRequest();
                    mVChangeUserLangRequest.mo25201C1(gVar);
                    return mVChangeUserLangRequest;
                case 39:
                    MVProfilerRecordingStart mVProfilerRecordingStart = new MVProfilerRecordingStart();
                    mVProfilerRecordingStart.mo25201C1(gVar);
                    return mVProfilerRecordingStart;
                case 40:
                    MVProfilerRecordingStop mVProfilerRecordingStop = new MVProfilerRecordingStop();
                    mVProfilerRecordingStop.mo25201C1(gVar);
                    return mVProfilerRecordingStop;
                case 41:
                    MVMetroRevisionActivated mVMetroRevisionActivated = new MVMetroRevisionActivated();
                    mVMetroRevisionActivated.mo25201C1(gVar);
                    return mVMetroRevisionActivated;
                case 42:
                    MVClientConfigurationActivated mVClientConfigurationActivated = new MVClientConfigurationActivated();
                    mVClientConfigurationActivated.mo25201C1(gVar);
                    return mVClientConfigurationActivated;
                case 43:
                    MVDCConfigurationActivated mVDCConfigurationActivated = new MVDCConfigurationActivated();
                    mVDCConfigurationActivated.mo25201C1(gVar);
                    return mVDCConfigurationActivated;
                case 44:
                    MVDCRecordingStart mVDCRecordingStart = new MVDCRecordingStart();
                    mVDCRecordingStart.mo25201C1(gVar);
                    return mVDCRecordingStart;
                case 45:
                    MVDCRecordingEnd mVDCRecordingEnd = new MVDCRecordingEnd();
                    mVDCRecordingEnd.mo25201C1(gVar);
                    return mVDCRecordingEnd;
                case 46:
                    MVLocationStatus mVLocationStatus = new MVLocationStatus();
                    mVLocationStatus.mo25201C1(gVar);
                    return mVLocationStatus;
                case 47:
                    MVProfilerConfigurationActivated mVProfilerConfigurationActivated = new MVProfilerConfigurationActivated();
                    mVProfilerConfigurationActivated.mo25201C1(gVar);
                    return mVProfilerConfigurationActivated;
                case 48:
                    MVWifiStatus mVWifiStatus = new MVWifiStatus();
                    mVWifiStatus.mo25201C1(gVar);
                    return mVWifiStatus;
                case 49:
                    MVAddPotentialPointsRequest mVAddPotentialPointsRequest = new MVAddPotentialPointsRequest();
                    mVAddPotentialPointsRequest.mo25201C1(gVar);
                    return mVAddPotentialPointsRequest;
                case 50:
                    MVStaticMetricsServerMessage mVStaticMetricsServerMessage = new MVStaticMetricsServerMessage();
                    mVStaticMetricsServerMessage.mo25201C1(gVar);
                    return mVStaticMetricsServerMessage;
                case 51:
                    MVDynamicMetricsServerMessage mVDynamicMetricsServerMessage = new MVDynamicMetricsServerMessage();
                    mVDynamicMetricsServerMessage.mo25201C1(gVar);
                    return mVDynamicMetricsServerMessage;
                case 52:
                    MVUpgradeSdkUser mVUpgradeSdkUser = new MVUpgradeSdkUser();
                    mVUpgradeSdkUser.mo25201C1(gVar);
                    return mVUpgradeSdkUser;
                case 53:
                    MVQuestionnaireResult mVQuestionnaireResult = new MVQuestionnaireResult();
                    mVQuestionnaireResult.mo25201C1(gVar);
                    return mVQuestionnaireResult;
                case 54:
                    MVSetGDPRPropertiesRequest mVSetGDPRPropertiesRequest = new MVSetGDPRPropertiesRequest();
                    mVSetGDPRPropertiesRequest.mo25201C1(gVar);
                    return mVSetGDPRPropertiesRequest;
                case 55:
                    MVDriverReportServerMessage mVDriverReportServerMessage = new MVDriverReportServerMessage();
                    mVDriverReportServerMessage.mo25201C1(gVar);
                    return mVDriverReportServerMessage;
                case 56:
                    MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest = new MVSetPrivacyPolicyRequest();
                    mVSetPrivacyPolicyRequest.mo25201C1(gVar);
                    return mVSetPrivacyPolicyRequest;
                case 57:
                    MVDriverMessageServerMessage mVDriverMessageServerMessage = new MVDriverMessageServerMessage();
                    mVDriverMessageServerMessage.mo25201C1(gVar);
                    return mVDriverMessageServerMessage;
                case 58:
                    MVDeepLinkInstallation mVDeepLinkInstallation = new MVDeepLinkInstallation();
                    mVDeepLinkInstallation.mo25201C1(gVar);
                    return mVDeepLinkInstallation;
                case 59:
                    MVUpdateConsentRequest mVUpdateConsentRequest = new MVUpdateConsentRequest();
                    mVUpdateConsentRequest.mo25201C1(gVar);
                    return mVUpdateConsentRequest;
                case 60:
                    MVUpdateTripRequest mVUpdateTripRequest = new MVUpdateTripRequest();
                    mVUpdateTripRequest.mo25201C1(gVar);
                    return mVUpdateTripRequest;
                case 61:
                    MVTicketingExternalPurchaseReport mVTicketingExternalPurchaseReport = new MVTicketingExternalPurchaseReport();
                    mVTicketingExternalPurchaseReport.mo25201C1(gVar);
                    return mVTicketingExternalPurchaseReport;
                case 62:
                    com.tranzmate.moovit.protocol.tod.MVDriverReportServerMessage mVDriverReportServerMessage2 = new com.tranzmate.moovit.protocol.tod.MVDriverReportServerMessage();
                    mVDriverReportServerMessage2.mo25201C1(gVar);
                    return mVDriverReportServerMessage2;
                case 63:
                    com.tranzmate.moovit.protocol.tod.MVDriverMessageServerMessage mVDriverMessageServerMessage2 = new com.tranzmate.moovit.protocol.tod.MVDriverMessageServerMessage();
                    mVDriverMessageServerMessage2.mo25201C1(gVar);
                    return mVDriverMessageServerMessage2;
                case 64:
                    MVDriverLocationUpdateRequest mVDriverLocationUpdateRequest = new MVDriverLocationUpdateRequest();
                    mVDriverLocationUpdateRequest.mo25201C1(gVar);
                    return mVDriverLocationUpdateRequest;
                case 65:
                    MVDriverLocationServerMessage mVDriverLocationServerMessage = new MVDriverLocationServerMessage();
                    mVDriverLocationServerMessage.mo25201C1(gVar);
                    return mVDriverLocationServerMessage;
                case 66:
                    MVPrivacyPolicyApprovalRequest mVPrivacyPolicyApprovalRequest = new MVPrivacyPolicyApprovalRequest();
                    mVPrivacyPolicyApprovalRequest.mo25201C1(gVar);
                    return mVPrivacyPolicyApprovalRequest;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        switch (C8947a.f26085a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVUpdateUserInfo) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVUpdateLimitAdTrackingEnabledState) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVUpdatePushToken) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVAddUserToWaitingMetroList) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVUpdateVersionRequest) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVUpdateUserSettingsRequest) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVSyncAckRequest) this.value_).mo25202X0(gVar);
                return;
            case 8:
                ((MVCreateReportRequest) this.value_).mo25202X0(gVar);
                return;
            case 9:
                ((MVLikeReportRequest) this.value_).mo25202X0(gVar);
                return;
            case 10:
                ((MVUnLikeReportRequest) this.value_).mo25202X0(gVar);
                return;
            case 11:
                ((MVFlagInAppropriateReportRequest) this.value_).mo25202X0(gVar);
                return;
            case 12:
                ((MVUnflagInAppropriateReportRequest) this.value_).mo25202X0(gVar);
                return;
            case 13:
                ((MVDeleteReportsRequest) this.value_).mo25202X0(gVar);
                return;
            case 14:
                ((MVResetLikeUnlikeUserReportRequest) this.value_).mo25202X0(gVar);
                return;
            case 15:
                ((MVLineAlertSubscriptionUpdate) this.value_).mo25202X0(gVar);
                return;
            case 16:
                ((MVNavigationQualityReport) this.value_).mo25202X0(gVar);
                return;
            case 17:
                ((MVPushNotificationReport) this.value_).mo25202X0(gVar);
                return;
            case 18:
                gVar.mo61678B(((MVUserActionType) this.value_).getValue());
                return;
            case 19:
                ((MVUpdateUserOsVersion) this.value_).mo25202X0(gVar);
                return;
            case 20:
                ((MVSetAdvertisingInfoRequest) this.value_).mo25202X0(gVar);
                return;
            case 21:
                ((MVCheckOutRequest) this.value_).mo25202X0(gVar);
                return;
            case 22:
                ((MVSetFavorites) this.value_).mo25202X0(gVar);
                return;
            case 23:
                ((MVUpdateDeviceName) this.value_).mo25202X0(gVar);
                return;
            case 24:
                ((MVOTPScoringData) this.value_).mo25202X0(gVar);
                return;
            case 25:
                ((MVLineGameReport) this.value_).mo25202X0(gVar);
                return;
            case 26:
                ((MVUsersReportsForRedshift) this.value_).mo25202X0(gVar);
                return;
            case 27:
                ((MVUsersReportsActionsForRedshift) this.value_).mo25202X0(gVar);
                return;
            case 28:
                ((MVSetUserExperimentInfo) this.value_).mo25202X0(gVar);
                return;
            case 29:
                ((MVCarPoolSurveyAnswer) this.value_).mo25202X0(gVar);
                return;
            case 30:
                ((MVStartDataCollectionNotification) this.value_).mo25202X0(gVar);
                return;
            case 31:
                ((MVApplicationInfos) this.value_).mo25202X0(gVar);
                return;
            case 32:
                ((MVSetUserHomeWorkRequest) this.value_).mo25202X0(gVar);
                return;
            case 33:
                ((MVSetVerifiedPhoneNumber) this.value_).mo25202X0(gVar);
                return;
            case 34:
                ((MVSetFavoriteLineGroupsAndStops) this.value_).mo25202X0(gVar);
                return;
            case 35:
                ((MVTCATopupUserRequest) this.value_).mo25202X0(gVar);
                return;
            case 36:
                ((MVCarPoolWorkDetails) this.value_).mo25202X0(gVar);
                return;
            case 37:
                ((MVSurveyAnswers) this.value_).mo25202X0(gVar);
                return;
            case 38:
                ((MVChangeUserLangRequest) this.value_).mo25202X0(gVar);
                return;
            case 39:
                ((MVProfilerRecordingStart) this.value_).mo25202X0(gVar);
                return;
            case 40:
                ((MVProfilerRecordingStop) this.value_).mo25202X0(gVar);
                return;
            case 41:
                ((MVMetroRevisionActivated) this.value_).mo25202X0(gVar);
                return;
            case 42:
                ((MVClientConfigurationActivated) this.value_).mo25202X0(gVar);
                return;
            case 43:
                ((MVDCConfigurationActivated) this.value_).mo25202X0(gVar);
                return;
            case 44:
                ((MVDCRecordingStart) this.value_).mo25202X0(gVar);
                return;
            case 45:
                ((MVDCRecordingEnd) this.value_).mo25202X0(gVar);
                return;
            case 46:
                ((MVLocationStatus) this.value_).mo25202X0(gVar);
                return;
            case 47:
                ((MVProfilerConfigurationActivated) this.value_).mo25202X0(gVar);
                return;
            case 48:
                ((MVWifiStatus) this.value_).mo25202X0(gVar);
                return;
            case 49:
                ((MVAddPotentialPointsRequest) this.value_).mo25202X0(gVar);
                return;
            case 50:
                ((MVStaticMetricsServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 51:
                ((MVDynamicMetricsServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 52:
                ((MVUpgradeSdkUser) this.value_).mo25202X0(gVar);
                return;
            case 53:
                ((MVQuestionnaireResult) this.value_).mo25202X0(gVar);
                return;
            case 54:
                ((MVSetGDPRPropertiesRequest) this.value_).mo25202X0(gVar);
                return;
            case 55:
                ((MVDriverReportServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 56:
                ((MVSetPrivacyPolicyRequest) this.value_).mo25202X0(gVar);
                return;
            case 57:
                ((MVDriverMessageServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 58:
                ((MVDeepLinkInstallation) this.value_).mo25202X0(gVar);
                return;
            case 59:
                ((MVUpdateConsentRequest) this.value_).mo25202X0(gVar);
                return;
            case 60:
                ((MVUpdateTripRequest) this.value_).mo25202X0(gVar);
                return;
            case 61:
                ((MVTicketingExternalPurchaseReport) this.value_).mo25202X0(gVar);
                return;
            case 62:
                ((com.tranzmate.moovit.protocol.tod.MVDriverReportServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 63:
                ((com.tranzmate.moovit.protocol.tod.MVDriverMessageServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 64:
                ((MVDriverLocationUpdateRequest) this.value_).mo25202X0(gVar);
                return;
            case 65:
                ((MVDriverLocationServerMessage) this.value_).mo25202X0(gVar);
                return;
            case 66:
                ((MVPrivacyPolicyApprovalRequest) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }
}

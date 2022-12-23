package f10;

import ce0.C21100e;
import com.appboy.models.InAppMessageWithImageBase;
import com.appboy.models.MessageButton;
import com.moovit.MoovitNotificationChannel;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.gcm.condition.AlwaysValidGcmCondition;
import com.moovit.gcm.condition.GcmClientVersionCondition;
import com.moovit.gcm.condition.GcmCompoundCondition;
import com.moovit.gcm.condition.GcmMetroCondition;
import com.moovit.gcm.condition.GcmTimePeriodCondition;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.gcm.payload.CarpoolCenterPayload;
import com.moovit.gcm.payload.CarpoolInvitationToRidePayload;
import com.moovit.gcm.payload.CarpoolRidePayload;
import com.moovit.gcm.payload.EventInstancePayload;
import com.moovit.gcm.payload.FacebookInvitePayload;
import com.moovit.gcm.payload.FacebookLikePayload;
import com.moovit.gcm.payload.FavoritesPayload;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.gcm.payload.InfoPayload;
import com.moovit.gcm.payload.ItineraryPayload;
import com.moovit.gcm.payload.LinePayload;
import com.moovit.gcm.payload.LinesPayload;
import com.moovit.gcm.payload.LoginPayload;
import com.moovit.gcm.payload.NearbyPayload;
import com.moovit.gcm.payload.PopupLinkPayload;
import com.moovit.gcm.payload.RateUsPayload;
import com.moovit.gcm.payload.SendFeedbackPayload;
import com.moovit.gcm.payload.ServiceAlertPayload;
import com.moovit.gcm.payload.ShareDriverReferralPayload;
import com.moovit.gcm.payload.SpreadTheLovePayload;
import com.moovit.gcm.payload.SurveyPayload;
import com.moovit.gcm.payload.TodRidePayload;
import com.moovit.gcm.payload.TransitStopPayload;
import com.moovit.gcm.payload.TransportationMapsPayload;
import com.moovit.gcm.payload.TripPlanPayload;
import com.moovit.gcm.payload.UrlPayload;
import com.moovit.gcm.payload.UserMessagePayload;
import com.moovit.gcm.payload.UserReinstallPayload;
import com.moovit.gcm.popup.LocalPopup;
import com.moovit.gcm.popup.RemotePopup;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.users.MVNotificationPayload;
import com.tranzmate.moovit.protocol.users.MVPushAttribute;
import com.usebutton.sdk.internal.api.models.WidgetDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p810sz.C19617r;
import p824tp.C19740r;
import p977zz.C20944i0;
import p977zz.C20964s0;

/* renamed from: f10.g */
public final class C16936g {

    /* renamed from: a */
    public static final C19617r f43954a;

    /* renamed from: b */
    public static final C19617r f43955b;

    /* renamed from: c */
    public static final C19617r f43956c;

    static {
        C19617r.C19618a aVar = new C19617r.C19618a();
        aVar.mo51969a(1, InfoPayload.class, InfoPayload.f41547c, InfoPayload.f41548d);
        aVar.mo51969a(3, ServiceAlertPayload.class, ServiceAlertPayload.f41573d, ServiceAlertPayload.f41574e);
        aVar.mo51969a(4, TripPlanPayload.class, TripPlanPayload.f41594e, TripPlanPayload.f41595f);
        aVar.mo51969a(5, UrlPayload.class, UrlPayload.f41598f, UrlPayload.f41599g);
        aVar.mo51969a(6, SurveyPayload.class, SurveyPayload.f41580g, SurveyPayload.f41581h);
        aVar.mo51969a(7, PopupLinkPayload.class, PopupLinkPayload.f41567c, PopupLinkPayload.f41568d);
        aVar.mo51969a(8, FacebookInvitePayload.class, FacebookInvitePayload.f41540c, FacebookInvitePayload.f41541d);
        aVar.mo51969a(9, FacebookLikePayload.class, FacebookLikePayload.f41542c, FacebookLikePayload.f41543d);
        aVar.mo51969a(11, RateUsPayload.class, RateUsPayload.f41569c, RateUsPayload.f41570d);
        aVar.mo51969a(12, TransitStopPayload.class, TransitStopPayload.f41589d, TransitStopPayload.f41590e);
        aVar.mo51969a(13, CarpoolCenterPayload.class, CarpoolCenterPayload.f41528c, CarpoolCenterPayload.f41529d);
        aVar.mo51969a(14, CarpoolRidePayload.class, CarpoolRidePayload.f41533d, CarpoolRidePayload.f41534e);
        aVar.mo51969a(15, NearbyPayload.class, NearbyPayload.f41564d, NearbyPayload.f41565e);
        aVar.mo51969a(16, FavoritesPayload.class, FavoritesPayload.f41544c, FavoritesPayload.f41545d);
        aVar.mo51969a(19, LinePayload.class, LinePayload.f41554f, LinePayload.f41555g);
        aVar.mo51969a(20, CarpoolInvitationToRidePayload.class, CarpoolInvitationToRidePayload.f41530d, CarpoolInvitationToRidePayload.f41531e);
        aVar.mo51969a(23, ItineraryPayload.class, ItineraryPayload.f41549f, ItineraryPayload.f41550g);
        aVar.mo51969a(24, LoginPayload.class, LoginPayload.f41562c, LoginPayload.f41563d);
        aVar.mo51969a(26, ShareDriverReferralPayload.class, ShareDriverReferralPayload.f41576c, ShareDriverReferralPayload.f41577d);
        aVar.mo51969a(27, TransportationMapsPayload.class, TransportationMapsPayload.f41592c, TransportationMapsPayload.f41593d);
        aVar.mo51969a(28, SpreadTheLovePayload.class, SpreadTheLovePayload.f41578c, SpreadTheLovePayload.f41579d);
        aVar.mo51969a(29, LinesPayload.class, LinesPayload.f41559d, LinesPayload.f41560e);
        aVar.mo51969a(30, SendFeedbackPayload.class, SendFeedbackPayload.f41571c, SendFeedbackPayload.f41572d);
        aVar.mo51969a(31, UserReinstallPayload.class, UserReinstallPayload.f41606c, UserReinstallPayload.f41607d);
        aVar.mo51969a(32, EventInstancePayload.class, EventInstancePayload.f41536e, EventInstancePayload.f41537f);
        aVar.mo51969a(33, UserMessagePayload.class, UserMessagePayload.f41603d, UserMessagePayload.f41604e);
        aVar.mo51969a(34, TodRidePayload.class, TodRidePayload.f41586d, TodRidePayload.f41587e);
        f43954a = aVar.mo51970b();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        LocalPopup.C15985b bVar = LocalPopup.f41611e;
        LocalPopup.C15986c cVar = LocalPopup.f41612f;
        C21100e.m49373x(cVar, "reader");
        hashMap.put(LocalPopup.class, new C20944i0(1, bVar));
        hashMap2.put(1, cVar);
        RemotePopup.C15988b bVar2 = RemotePopup.f41613g;
        RemotePopup.C15989c cVar2 = RemotePopup.f41614h;
        C21100e.m49373x(cVar2, "reader");
        hashMap.put(RemotePopup.class, new C20944i0(2, bVar2));
        hashMap2.put(2, cVar2);
        f43955b = new C19617r(hashMap, hashMap2);
        C19617r.C19618a aVar2 = new C19617r.C19618a();
        aVar2.mo51969a(1, GcmTimePeriodCondition.class, GcmTimePeriodCondition.f41504d, GcmTimePeriodCondition.f41505e);
        aVar2.mo51969a(2, GcmMetroCondition.class, GcmMetroCondition.f41501c, GcmMetroCondition.f41502d);
        aVar2.mo51969a(3, GcmCompoundCondition.class, GcmCompoundCondition.f41498c, GcmCompoundCondition.f41499d);
        aVar2.mo51969a(4, GcmClientVersionCondition.class, GcmClientVersionCondition.f41495c, GcmClientVersionCondition.f41496d);
        AlwaysValidGcmCondition.C15883b bVar3 = AlwaysValidGcmCondition.f41494b;
        aVar2.mo51969a(5, AlwaysValidGcmCondition.class, bVar3, bVar3);
        f43956c = aVar2.mo51970b();
    }

    /* renamed from: a */
    public static GcmCompoundCondition m42765a(Map map) {
        long j;
        GcmMetroCondition gcmMetroCondition;
        ArrayList arrayList = new ArrayList(3);
        long f = m42770f(map);
        String str = (String) map.get("expiration_date");
        if (C20964s0.m49090h(str)) {
            j = 604800000 + f;
        } else {
            j = Long.parseLong(str);
        }
        arrayList.add(new GcmTimePeriodCondition(f, j));
        String str2 = (String) map.get("active_metro_id");
        GcmClientVersionCondition gcmClientVersionCondition = null;
        if (str2 == null) {
            gcmMetroCondition = null;
        } else {
            gcmMetroCondition = new GcmMetroCondition(ServerId.m11392b(str2));
        }
        if (gcmMetroCondition != null) {
            arrayList.add(gcmMetroCondition);
        }
        String str3 = (String) map.get("active_version");
        if (!C20964s0.m49090h(str3)) {
            gcmClientVersionCondition = new GcmClientVersionCondition(str3);
        }
        if (gcmClientVersionCondition != null) {
            arrayList.add(gcmClientVersionCondition);
        }
        return new GcmCompoundCondition(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: com.moovit.commons.geo.LatLonE6} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02d6, code lost:
        if (r2.equals("last") == false) goto L_0x02ef;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.moovit.gcm.payload.GcmPayload m42766b(java.util.Map<java.lang.String, java.lang.String> r19) {
        /*
            r0 = r19
            java.lang.String r1 = "id"
            java.lang.Object r1 = r0.get(r1)
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = "type"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            int r2 = r1.hashCode()
            r4 = 2
            java.lang.String r5 = "url"
            r6 = 0
            switch(r2) {
                case -1944285236: goto L_0x016a;
                case -1897773476: goto L_0x015f;
                case -1814390893: goto L_0x0154;
                case -1785238953: goto L_0x0149;
                case -1740302510: goto L_0x013e;
                case -1309620690: goto L_0x0133;
                case -1067192006: goto L_0x0128;
                case -1065161334: goto L_0x011d;
                case -1064550303: goto L_0x010f;
                case -1020179993: goto L_0x0101;
                case -891050150: goto L_0x00f3;
                case -731501420: goto L_0x00e5;
                case -600384912: goto L_0x00d7;
                case -398156029: goto L_0x00c9;
                case 116079: goto L_0x00bd;
                case 3237038: goto L_0x00af;
                case 3321844: goto L_0x00a1;
                case 3540994: goto L_0x0093;
                case 102977279: goto L_0x0085;
                case 103149417: goto L_0x0077;
                case 813484404: goto L_0x0069;
                case 844731372: goto L_0x005b;
                case 983464541: goto L_0x004d;
                case 1352565958: goto L_0x003f;
                case 1442959627: goto L_0x0031;
                case 1825773839: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0175
        L_0x0023:
            java.lang.String r2 = "near_me"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x002d
            goto L_0x0175
        L_0x002d:
            r2 = 25
            goto L_0x0176
        L_0x0031:
            java.lang.String r2 = "itinerary"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x003b
            goto L_0x0175
        L_0x003b:
            r2 = 24
            goto L_0x0176
        L_0x003f:
            java.lang.String r2 = "carpool_tab"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0049
            goto L_0x0175
        L_0x0049:
            r2 = 23
            goto L_0x0176
        L_0x004d:
            java.lang.String r2 = "rate_us"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0057
            goto L_0x0175
        L_0x0057:
            r2 = 22
            goto L_0x0176
        L_0x005b:
            java.lang.String r2 = "fb_invite"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0065
            goto L_0x0175
        L_0x0065:
            r2 = 21
            goto L_0x0176
        L_0x0069:
            java.lang.String r2 = "share_driver_referral"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0073
            goto L_0x0175
        L_0x0073:
            r2 = 20
            goto L_0x0176
        L_0x0077:
            java.lang.String r2 = "login"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0081
            goto L_0x0175
        L_0x0081:
            r2 = 19
            goto L_0x0176
        L_0x0085:
            java.lang.String r2 = "lines"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x008f
            goto L_0x0175
        L_0x008f:
            r2 = 18
            goto L_0x0176
        L_0x0093:
            java.lang.String r2 = "stop"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x009d
            goto L_0x0175
        L_0x009d:
            r2 = 17
            goto L_0x0176
        L_0x00a1:
            java.lang.String r2 = "line"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00ab
            goto L_0x0175
        L_0x00ab:
            r2 = 16
            goto L_0x0176
        L_0x00af:
            java.lang.String r2 = "info"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00b9
            goto L_0x0175
        L_0x00b9:
            r2 = 15
            goto L_0x0176
        L_0x00bd:
            boolean r2 = r1.equals(r5)
            if (r2 != 0) goto L_0x00c5
            goto L_0x0175
        L_0x00c5:
            r2 = 14
            goto L_0x0176
        L_0x00c9:
            java.lang.String r2 = "trip_plan"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00d3
            goto L_0x0175
        L_0x00d3:
            r2 = 13
            goto L_0x0176
        L_0x00d7:
            java.lang.String r2 = "ride_sharing_event"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00e1
            goto L_0x0175
        L_0x00e1:
            r2 = 12
            goto L_0x0176
        L_0x00e5:
            java.lang.String r2 = "user_reinstall"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00ef
            goto L_0x0175
        L_0x00ef:
            r2 = 11
            goto L_0x0176
        L_0x00f3:
            java.lang.String r2 = "survey"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00fd
            goto L_0x0175
        L_0x00fd:
            r2 = 10
            goto L_0x0176
        L_0x0101:
            java.lang.String r2 = "carpool_ride"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x010b
            goto L_0x0175
        L_0x010b:
            r2 = 9
            goto L_0x0176
        L_0x010f:
            java.lang.String r2 = "carpool_ride_invite"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0119
            goto L_0x0175
        L_0x0119:
            r2 = 8
            goto L_0x0176
        L_0x011d:
            java.lang.String r2 = "transportation_maps"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0126
            goto L_0x0175
        L_0x0126:
            r2 = 7
            goto L_0x0176
        L_0x0128:
            java.lang.String r2 = "fb_like"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0131
            goto L_0x0175
        L_0x0131:
            r2 = 6
            goto L_0x0176
        L_0x0133:
            java.lang.String r2 = "tod_ride"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x013c
            goto L_0x0175
        L_0x013c:
            r2 = 5
            goto L_0x0176
        L_0x013e:
            java.lang.String r2 = "service_alert"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0147
            goto L_0x0175
        L_0x0147:
            r2 = 4
            goto L_0x0176
        L_0x0149:
            java.lang.String r2 = "favorites"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0152
            goto L_0x0175
        L_0x0152:
            r2 = 3
            goto L_0x0176
        L_0x0154:
            java.lang.String r2 = "user_message"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x015d
            goto L_0x0175
        L_0x015d:
            r2 = 2
            goto L_0x0176
        L_0x015f:
            java.lang.String r2 = "send_feedback"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0168
            goto L_0x0175
        L_0x0168:
            r2 = 1
            goto L_0x0176
        L_0x016a:
            java.lang.String r2 = "spread_the_love"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            r2 = 0
            goto L_0x0176
        L_0x0175:
            r2 = -1
        L_0x0176:
            r7 = 0
            java.lang.String r8 = "stop_id"
            java.lang.String r9 = "in_app"
            java.lang.String r10 = "activity_title"
            java.lang.String r11 = "dest_lon"
            java.lang.String r12 = "dest_lat"
            java.lang.String r13 = "ride_id"
            switch(r2) {
                case 0: goto L_0x03da;
                case 1: goto L_0x03d4;
                case 2: goto L_0x03c6;
                case 3: goto L_0x03c0;
                case 4: goto L_0x03b2;
                case 5: goto L_0x03a6;
                case 6: goto L_0x03a0;
                case 7: goto L_0x039a;
                case 8: goto L_0x038a;
                case 9: goto L_0x037a;
                case 10: goto L_0x034f;
                case 11: goto L_0x0349;
                case 12: goto L_0x032b;
                case 13: goto L_0x0278;
                case 14: goto L_0x025c;
                case 15: goto L_0x0256;
                case 16: goto L_0x0220;
                case 17: goto L_0x0210;
                case 18: goto L_0x0202;
                case 19: goto L_0x01fc;
                case 20: goto L_0x01f6;
                case 21: goto L_0x01f0;
                case 22: goto L_0x01ea;
                case 23: goto L_0x01e4;
                case 24: goto L_0x01b4;
                case 25: goto L_0x0192;
                default: goto L_0x0186;
            }
        L_0x0186:
            com.moovit.commons.utils.ApplicationBugException r0 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r2 = "Received a GCM payload with unrecognized type: "
            java.lang.String r1 = p379.C25541a.m63881k(r2, r1)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0192:
            java.lang.Object r1 = r0.get(r12)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L_0x01ae
            if (r0 == 0) goto L_0x01ae
            double r1 = java.lang.Double.parseDouble(r1)
            double r4 = java.lang.Double.parseDouble(r0)
            com.moovit.commons.geo.LatLonE6 r7 = com.moovit.commons.geo.LatLonE6.m40176g(r1, r4)
        L_0x01ae:
            com.moovit.gcm.payload.NearbyPayload r0 = new com.moovit.gcm.payload.NearbyPayload
            r0.<init>(r3, r7)
            return r0
        L_0x01b4:
            java.lang.String r1 = "guid"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "guid_metro_id"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.moovit.network.model.ServerId r2 = com.moovit.network.model.ServerId.m11392b(r2)
            java.lang.String r4 = "initial_index"
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto L_0x01de
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            int r6 = java.lang.Math.max(r6, r0)
        L_0x01de:
            com.moovit.gcm.payload.ItineraryPayload r0 = new com.moovit.gcm.payload.ItineraryPayload
            r0.<init>(r3, r1, r2, r6)
            return r0
        L_0x01e4:
            com.moovit.gcm.payload.CarpoolCenterPayload r0 = new com.moovit.gcm.payload.CarpoolCenterPayload
            r0.<init>(r3)
            return r0
        L_0x01ea:
            com.moovit.gcm.payload.RateUsPayload r0 = new com.moovit.gcm.payload.RateUsPayload
            r0.<init>(r3)
            return r0
        L_0x01f0:
            com.moovit.gcm.payload.FacebookInvitePayload r0 = new com.moovit.gcm.payload.FacebookInvitePayload
            r0.<init>(r3)
            return r0
        L_0x01f6:
            com.moovit.gcm.payload.ShareDriverReferralPayload r0 = new com.moovit.gcm.payload.ShareDriverReferralPayload
            r0.<init>(r3)
            return r0
        L_0x01fc:
            com.moovit.gcm.payload.LoginPayload r0 = new com.moovit.gcm.payload.LoginPayload
            r0.<init>(r3)
            return r0
        L_0x0202:
            java.lang.String r1 = "tab"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.moovit.gcm.payload.LinesPayload r1 = new com.moovit.gcm.payload.LinesPayload
            r1.<init>(r3, r0)
            return r1
        L_0x0210:
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            com.moovit.network.model.ServerId r0 = com.moovit.network.model.ServerId.m11392b(r0)
            com.moovit.gcm.payload.TransitStopPayload r1 = new com.moovit.gcm.payload.TransitStopPayload
            r1.<init>(r0, r3)
            return r1
        L_0x0220:
            java.lang.String r1 = "line_group_id"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.moovit.network.model.ServerId r1 = com.moovit.network.model.ServerId.m11392b(r1)
            java.lang.String r2 = "line_id"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = p977zz.C20964s0.m49090h(r2)
            if (r4 != 0) goto L_0x023f
            com.moovit.network.model.ServerId r2 = com.moovit.network.model.ServerId.m11392b(r2)
            goto L_0x0240
        L_0x023f:
            r2 = r7
        L_0x0240:
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            boolean r4 = p977zz.C20964s0.m49090h(r0)
            if (r4 != 0) goto L_0x0250
            com.moovit.network.model.ServerId r7 = com.moovit.network.model.ServerId.m11392b(r0)
        L_0x0250:
            com.moovit.gcm.payload.LinePayload r0 = new com.moovit.gcm.payload.LinePayload
            r0.<init>(r1, r2, r7, r3)
            return r0
        L_0x0256:
            com.moovit.gcm.payload.InfoPayload r0 = new com.moovit.gcm.payload.InfoPayload
            r0.<init>(r3)
            return r0
        L_0x025c:
            java.lang.Object r1 = r0.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.get(r10)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            com.moovit.gcm.payload.UrlPayload r4 = new com.moovit.gcm.payload.UrlPayload
            r4.<init>(r3, r1, r2, r0)
            return r4
        L_0x0278:
            java.lang.Object r1 = r0.get(r12)
            java.lang.String r1 = (java.lang.String) r1
            double r1 = java.lang.Double.parseDouble(r1)
            java.lang.Object r5 = r0.get(r11)
            java.lang.String r5 = (java.lang.String) r5
            double r5 = java.lang.Double.parseDouble(r5)
            java.lang.String r7 = "dest_desc"
            java.lang.Object r7 = r0.get(r7)
            r13 = r7
            java.lang.String r13 = (java.lang.String) r13
            com.moovit.commons.geo.LatLonE6 r15 = com.moovit.commons.geo.LatLonE6.m40176g(r1, r5)
            com.moovit.transit.LocationDescriptor r1 = new com.moovit.transit.LocationDescriptor
            com.moovit.transit.LocationDescriptor$LocationType r9 = com.moovit.transit.LocationDescriptor.LocationType.COORDINATE
            com.moovit.transit.LocationDescriptor$SourceType r10 = com.moovit.transit.LocationDescriptor.SourceType.EXTERNAL
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r2 = "time"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x02b9
            r5 = -1
            goto L_0x02bd
        L_0x02b9:
            long r5 = java.lang.Long.parseLong(r2)
        L_0x02bd:
            java.lang.String r2 = "time_type"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            int r7 = r2.hashCode()
            switch(r7) {
                case -1409157417: goto L_0x02e4;
                case -1335343116: goto L_0x02d9;
                case 3314326: goto L_0x02d0;
                default: goto L_0x02cf;
            }
        L_0x02cf:
            goto L_0x02ef
        L_0x02d0:
            java.lang.String r7 = "last"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x02f0
            goto L_0x02ef
        L_0x02d9:
            java.lang.String r4 = "depart"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x02e2
            goto L_0x02ef
        L_0x02e2:
            r4 = 1
            goto L_0x02f0
        L_0x02e4:
            java.lang.String r4 = "arrive"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x02ed
            goto L_0x02ef
        L_0x02ed:
            r4 = 0
            goto L_0x02f0
        L_0x02ef:
            r4 = -1
        L_0x02f0:
            switch(r4) {
                case 0: goto L_0x0305;
                case 1: goto L_0x0302;
                case 2: goto L_0x02ff;
                default: goto L_0x02f3;
            }
        L_0x02f3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown trip plan payload time type: "
            java.lang.String r1 = p379.C25541a.m63881k(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x02ff:
            com.moovit.tripplanner.TripPlannerTime$Type r2 = com.moovit.tripplanner.TripPlannerTime.Type.LAST
            goto L_0x0307
        L_0x0302:
            com.moovit.tripplanner.TripPlannerTime$Type r2 = com.moovit.tripplanner.TripPlannerTime.Type.DEPART
            goto L_0x0307
        L_0x0305:
            com.moovit.tripplanner.TripPlannerTime$Type r2 = com.moovit.tripplanner.TripPlannerTime.Type.ARRIVE
        L_0x0307:
            java.lang.String r4 = "auto_search"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            com.moovit.suggestedroutes.TripPlanParams$d r4 = new com.moovit.suggestedroutes.TripPlanParams$d
            r4.<init>()
            r4.f23791b = r1
            com.moovit.tripplanner.TripPlannerTime r1 = new com.moovit.tripplanner.TripPlannerTime
            r1.<init>(r2, r5)
            r4.f23222c = r1
            com.moovit.suggestedroutes.TripPlanParams r1 = r4.mo23958a()
            com.moovit.gcm.payload.TripPlanPayload r2 = new com.moovit.gcm.payload.TripPlanPayload
            r2.<init>(r3, r1, r0)
            return r2
        L_0x032b:
            java.lang.String r1 = "super_event_id"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.moovit.network.model.ServerId r1 = com.moovit.network.model.ServerId.m11392b(r1)
            java.lang.String r2 = "event_id"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            com.moovit.network.model.ServerId r0 = com.moovit.network.model.ServerId.m11392b(r0)
            com.moovit.gcm.payload.EventInstancePayload r2 = new com.moovit.gcm.payload.EventInstancePayload
            r2.<init>(r3, r1, r0)
            return r2
        L_0x0349:
            com.moovit.gcm.payload.UserReinstallPayload r0 = new com.moovit.gcm.payload.UserReinstallPayload
            r0.<init>(r3)
            return r0
        L_0x034f:
            java.lang.Object r1 = r0.get(r5)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r0.get(r10)
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r0.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            boolean r6 = java.lang.Boolean.parseBoolean(r1)
            java.lang.String r1 = "survey_id"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r7 = java.lang.Integer.parseInt(r0)
            com.moovit.gcm.payload.SurveyPayload r0 = new com.moovit.gcm.payload.SurveyPayload
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x037a:
            java.lang.Object r0 = r0.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            com.moovit.network.model.ServerId r0 = com.moovit.network.model.ServerId.m11392b(r0)
            com.moovit.gcm.payload.CarpoolRidePayload r1 = new com.moovit.gcm.payload.CarpoolRidePayload
            r1.<init>(r0, r3)
            return r1
        L_0x038a:
            java.lang.Object r0 = r0.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            com.moovit.network.model.ServerId r0 = com.moovit.network.model.ServerId.m11392b(r0)
            com.moovit.gcm.payload.CarpoolInvitationToRidePayload r1 = new com.moovit.gcm.payload.CarpoolInvitationToRidePayload
            r1.<init>(r0, r3)
            return r1
        L_0x039a:
            com.moovit.gcm.payload.TransportationMapsPayload r0 = new com.moovit.gcm.payload.TransportationMapsPayload
            r0.<init>(r3)
            return r0
        L_0x03a0:
            com.moovit.gcm.payload.FacebookLikePayload r0 = new com.moovit.gcm.payload.FacebookLikePayload
            r0.<init>(r3)
            return r0
        L_0x03a6:
            java.lang.Object r0 = r0.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            com.moovit.gcm.payload.TodRidePayload r1 = new com.moovit.gcm.payload.TodRidePayload
            r1.<init>(r3, r0)
            return r1
        L_0x03b2:
            java.lang.String r1 = "alert_id"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.moovit.gcm.payload.ServiceAlertPayload r1 = new com.moovit.gcm.payload.ServiceAlertPayload
            r1.<init>(r3, r0)
            return r1
        L_0x03c0:
            com.moovit.gcm.payload.FavoritesPayload r0 = new com.moovit.gcm.payload.FavoritesPayload
            r0.<init>(r3)
            return r0
        L_0x03c6:
            java.lang.String r1 = "message"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.moovit.gcm.payload.UserMessagePayload r1 = new com.moovit.gcm.payload.UserMessagePayload
            r1.<init>(r3, r0)
            return r1
        L_0x03d4:
            com.moovit.gcm.payload.SendFeedbackPayload r0 = new com.moovit.gcm.payload.SendFeedbackPayload
            r0.<init>(r3)
            return r0
        L_0x03da:
            com.moovit.gcm.payload.SpreadTheLovePayload r0 = new com.moovit.gcm.payload.SpreadTheLovePayload
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f10.C16936g.m42766b(java.util.Map):com.moovit.gcm.payload.GcmPayload");
    }

    /* renamed from: c */
    public static MoovitNotificationChannel m42767c(Map<String, String> map) {
        String str = map.get("notification_channel");
        MoovitNotificationChannel forChannelId = MoovitNotificationChannel.forChannelId(str);
        if (forChannelId != null) {
            return forChannelId;
        }
        throw new ApplicationBugException(C25541a.m63881k("Received a GCM notification with unrecognized channel: ", str));
    }

    /* renamed from: d */
    public static GcmNotification m42768d(GcmPayload gcmPayload, Map map) {
        int i;
        String str = (String) map.get("title");
        String str2 = (String) map.get(MessageButton.TEXT);
        String str3 = (String) map.get(WidgetDTO.KEY_CTA_ICON);
        String str4 = (String) map.get(InAppMessageWithImageBase.REMOTE_IMAGE_URL);
        long f = m42770f(map);
        if ("carpool_tab".equals(gcmPayload.mo47977c())) {
            i = C19740r.carpool_notification_id;
        } else if ("carpool_ride".equals(gcmPayload.mo47977c())) {
            i = ((CarpoolRidePayload) gcmPayload).f41535c.f15142b;
        } else if ("ride_sharing_event".equals(gcmPayload.mo47977c())) {
            i = C19740r.event_notification_id;
        } else {
            i = GcmNotification.f41516j;
        }
        return new GcmNotification(str, str2, str3, str4, f, gcmPayload, i, m42767c(map));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011d, code lost:
        if (r1.equals("spread_the_love") == false) goto L_0x011f;
     */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.moovit.gcm.popup.GcmPopup m42769e(com.moovit.gcm.payload.GcmPayload r15, java.util.Map r16) {
        /*
            r2 = r15
            r0 = r16
            java.lang.String r1 = "isPushPopup"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = p977zz.C20964s0.m49090h(r1)
            r4 = 0
            if (r3 != 0) goto L_0x001a
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            if (r1 == 0) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 != 0) goto L_0x001f
            r1 = 0
            goto L_0x004a
        L_0x001f:
            java.lang.String r1 = "title"
            java.lang.Object r1 = r0.get(r1)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = "popupNotificationText"
            java.lang.Object r1 = r0.get(r1)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            com.moovit.MoovitNotificationChannel r14 = m42767c(r16)
            com.moovit.gcm.notification.GcmNotification r1 = new com.moovit.gcm.notification.GcmNotification
            r8 = 0
            r9 = 0
            long r10 = m42770f(r16)
            com.moovit.gcm.payload.PopupLinkPayload r12 = new com.moovit.gcm.payload.PopupLinkPayload
            java.lang.String r3 = r2.f41546b
            r12.<init>(r3)
            int r13 = com.moovit.gcm.notification.GcmNotification.f41516j
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x004a:
            r3 = r1
            java.lang.String r1 = r15.mo47977c()
            r1.getClass()
            int r5 = r1.hashCode()
            switch(r5) {
                case -1944285236: goto L_0x0117;
                case -1814390893: goto L_0x010c;
                case -1740302510: goto L_0x0101;
                case -1067192006: goto L_0x00f6;
                case -1065161334: goto L_0x00eb;
                case -891050150: goto L_0x00e0;
                case -731501420: goto L_0x00d5;
                case -398156029: goto L_0x00ca;
                case 116079: goto L_0x00bd;
                case 3237038: goto L_0x00af;
                case 3321844: goto L_0x00a1;
                case 3540994: goto L_0x0093;
                case 103149417: goto L_0x0085;
                case 813484404: goto L_0x0077;
                case 844731372: goto L_0x0069;
                case 983464541: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x011f
        L_0x005b:
            java.lang.String r4 = "rate_us"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0065
            goto L_0x011f
        L_0x0065:
            r4 = 15
            goto L_0x0120
        L_0x0069:
            java.lang.String r4 = "fb_invite"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0073
            goto L_0x011f
        L_0x0073:
            r4 = 14
            goto L_0x0120
        L_0x0077:
            java.lang.String r4 = "share_driver_referral"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0081
            goto L_0x011f
        L_0x0081:
            r4 = 13
            goto L_0x0120
        L_0x0085:
            java.lang.String r4 = "login"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x008f
            goto L_0x011f
        L_0x008f:
            r4 = 12
            goto L_0x0120
        L_0x0093:
            java.lang.String r4 = "stop"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x009d
            goto L_0x011f
        L_0x009d:
            r4 = 11
            goto L_0x0120
        L_0x00a1:
            java.lang.String r4 = "line"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00ab
            goto L_0x011f
        L_0x00ab:
            r4 = 10
            goto L_0x0120
        L_0x00af:
            java.lang.String r4 = "info"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00b9
            goto L_0x011f
        L_0x00b9:
            r4 = 9
            goto L_0x0120
        L_0x00bd:
            java.lang.String r4 = "url"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00c7
            goto L_0x011f
        L_0x00c7:
            r4 = 8
            goto L_0x0120
        L_0x00ca:
            java.lang.String r4 = "trip_plan"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00d3
            goto L_0x011f
        L_0x00d3:
            r4 = 7
            goto L_0x0120
        L_0x00d5:
            java.lang.String r4 = "user_reinstall"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00de
            goto L_0x011f
        L_0x00de:
            r4 = 6
            goto L_0x0120
        L_0x00e0:
            java.lang.String r4 = "survey"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00e9
            goto L_0x011f
        L_0x00e9:
            r4 = 5
            goto L_0x0120
        L_0x00eb:
            java.lang.String r4 = "transportation_maps"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00f4
            goto L_0x011f
        L_0x00f4:
            r4 = 4
            goto L_0x0120
        L_0x00f6:
            java.lang.String r4 = "fb_like"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00ff
            goto L_0x011f
        L_0x00ff:
            r4 = 3
            goto L_0x0120
        L_0x0101:
            java.lang.String r4 = "service_alert"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x010a
            goto L_0x011f
        L_0x010a:
            r4 = 2
            goto L_0x0120
        L_0x010c:
            java.lang.String r4 = "user_message"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0115
            goto L_0x011f
        L_0x0115:
            r4 = 1
            goto L_0x0120
        L_0x0117:
            java.lang.String r5 = "spread_the_love"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0120
        L_0x011f:
            r4 = -1
        L_0x0120:
            switch(r4) {
                case 0: goto L_0x0147;
                case 1: goto L_0x013d;
                case 2: goto L_0x0147;
                case 3: goto L_0x013d;
                case 4: goto L_0x0147;
                case 5: goto L_0x0147;
                case 6: goto L_0x013d;
                case 7: goto L_0x0147;
                case 8: goto L_0x0147;
                case 9: goto L_0x0147;
                case 10: goto L_0x0147;
                case 11: goto L_0x0147;
                case 12: goto L_0x013d;
                case 13: goto L_0x013d;
                case 14: goto L_0x013d;
                case 15: goto L_0x013d;
                default: goto L_0x0123;
            }
        L_0x0123:
            r15.mo47977c()
            com.moovit.commons.utils.ApplicationBugException r0 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r1 = "Received a GCM popup with unrecognized type: "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.String r2 = r15.mo47977c()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x013d:
            com.moovit.gcm.condition.GcmCompoundCondition r0 = m42765a(r16)
            com.moovit.gcm.popup.LocalPopup r1 = new com.moovit.gcm.popup.LocalPopup
            r1.<init>(r0, r15, r3)
            return r1
        L_0x0147:
            com.moovit.gcm.condition.GcmCompoundCondition r1 = m42765a(r16)
            java.lang.String r4 = "text"
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "button_text"
            java.lang.Object r0 = r0.get(r5)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            com.moovit.gcm.popup.RemotePopup r6 = new com.moovit.gcm.popup.RemotePopup
            r0 = r6
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f10.C16936g.m42769e(com.moovit.gcm.payload.GcmPayload, java.util.Map):com.moovit.gcm.popup.GcmPopup");
    }

    /* renamed from: f */
    public static long m42770f(Map<String, String> map) {
        String str = map.get("start_date");
        if (C20964s0.m49090h(str)) {
            return System.currentTimeMillis();
        }
        return Long.parseLong(str);
    }

    /* renamed from: g */
    public static void m42771g(MVNotificationPayload mVNotificationPayload, HashMap hashMap) {
        hashMap.put("id", String.valueOf(mVNotificationPayload.pushId));
        hashMap.put("type", mVNotificationPayload.type);
        if (mVNotificationPayload.mo35250k()) {
            hashMap.put("title", mVNotificationPayload.title);
        }
        if (mVNotificationPayload.mo35244f()) {
            hashMap.put(MessageButton.TEXT, mVNotificationPayload.androidText);
        }
        if (mVNotificationPayload.mo35246h()) {
            hashMap.put("start_date", String.valueOf(mVNotificationPayload.fromTime));
        }
        if (mVNotificationPayload.mo35251l()) {
            hashMap.put("expiration_date", String.valueOf(mVNotificationPayload.toTime));
        }
        if (mVNotificationPayload.mo35245g()) {
            for (MVPushAttribute next : mVNotificationPayload.attributes) {
                hashMap.put(next.key, next.value);
            }
        }
    }
}

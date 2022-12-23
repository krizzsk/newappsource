package p001a0;

import android.content.Context;
import android.location.LocationManager;
import bi0.C21072j;
import c00.C13717b;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.gcm.popup.GcmPopup;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.ticketing.ticket.C7762g;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitType;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.clientimages.MVClientImage;
import com.tranzmate.moovit.protocol.clienttexts.MVClientText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import p090g1.C4732a;
import p115i0.C5231g;
import p227r.C6227a;
import p275u9.C6756w;
import p404ce.C13791f;
import p404ce.C13806s;
import p543hq.C17473a;
import p977zz.C20934d0;
import p977zz.C20943i;
import p977zz.C20952m0;
import p977zz.C20964s0;
import s90.C13076d;

/* renamed from: a0.g */
public final /* synthetic */ class C0016g implements Continuation, C13791f, C6227a {
    /* renamed from: A */
    public static void m11A(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }

    /* renamed from: B */
    public static String m12B(ServiceStatusCategory serviceStatusCategory) {
        if (serviceStatusCategory == null) {
            return null;
        }
        int i = C17473a.f44987c[serviceStatusCategory.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "good_service" : "additional_service" : "modified_service" : "no_service";
    }

    /* renamed from: C */
    public static String m13C(LocationDescriptor.LocationType locationType) {
        switch (C17473a.f44992h[locationType.ordinal()]) {
            case 1:
                return "city";
            case 2:
                return "street";
            case 3:
                return "poi";
            case 4:
                return "stop";
            case 5:
                return "coordinate";
            case 6:
                return "current";
            case 7:
                return "bicycle_stop";
            case 8:
                return "event";
            default:
                return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
    }

    /* renamed from: D */
    public static String m14D(TransitType.ViewType viewType) {
        if (viewType == null) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        int i = C17473a.f44990f[viewType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? StringUtils.NULL_USER_ID_SUBSTITUTE_STRING : "platforms" : "patterns" : "default";
    }

    /* renamed from: E */
    public static String m15E(TransitType transitType) {
        if (transitType == null) {
            return "All";
        }
        switch (C17473a.f44991g[transitType.f23760e.ordinal()]) {
            case 1:
                return "tram";
            case 2:
                return "subway";
            case 3:
                return "train";
            case 4:
                return "bus";
            case 5:
                return "ferry";
            case 6:
                return "cable";
            case 7:
                return "gondola";
            case 8:
                return "funicular";
            default:
                return "None";
        }
    }

    /* renamed from: F */
    public static String m16F(TripPlannerTime.Type type) {
        int i = C17473a.f44986b[type.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "none" : "trip_plan_time_type_last" : "trip_plan_time_type_arrival" : "trip_plan_time_type_departure";
    }

    /* renamed from: G */
    public static String m17G(int i) {
        return i != -3 ? i != -2 ? i != -1 ? "" : "dialog_positive_btn" : "dialog_negative_btn" : "dialog_natural_btn";
    }

    /* renamed from: a */
    public static String m18a(C5231g gVar, String str) {
        return (String) gVar.mo2423b(C5231g.f17323t, str);
    }

    /* renamed from: b */
    public static long m19b(CurrencyAmount currencyAmount) {
        return currencyAmount.f23845c.movePointRight(2).longValue();
    }

    /* renamed from: c */
    public static String m20c(int i) {
        switch (i) {
            case 1:
                return "walk_step";
            case 2:
            case 9:
                return "ride_step";
            case 3:
            case 10:
                return "wait_step";
            case 5:
                return "ride_taxi_step";
            case 6:
                return "wait_taxi_step";
            case 11:
                return "bike_step";
            case 12:
                return "rental_bike_step";
            default:
                return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
    }

    /* renamed from: d */
    public static String m21d(Context context) {
        boolean z;
        if (!C20934d0.m49032c(context)) {
            return "location_permission_denied";
        }
        if (!C20943i.m49051d(29)) {
            z = C20934d0.m49032c(context);
        } else {
            try {
                if (C4732a.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                    z = true;
                }
            } catch (Exception unused) {
            }
            z = false;
        }
        if (z) {
            return "location_permission_allowed";
        }
        return "location_permission_allowed_while_using";
    }

    /* renamed from: e */
    public static String m22e(Context context) {
        List<T> list;
        List<String> providers = ((LocationManager) context.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY)).getProviders(true);
        if (providers == null) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(providers);
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        return C20964s0.m49100r(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, arrayList);
    }

    /* renamed from: f */
    public static String m23f(GcmPopup gcmPopup) {
        String c = gcmPopup.f41609c.mo47977c();
        c.getClass();
        char c2 = 65535;
        switch (c.hashCode()) {
            case -1814390893:
                if (c.equals("user_message")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1740302510:
                if (c.equals("service_alert")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1067192006:
                if (c.equals("fb_like")) {
                    c2 = 2;
                    break;
                }
                break;
            case -891050150:
                if (c.equals("survey")) {
                    c2 = 3;
                    break;
                }
                break;
            case -731501420:
                if (c.equals("user_reinstall")) {
                    c2 = 4;
                    break;
                }
                break;
            case -398156029:
                if (c.equals("trip_plan")) {
                    c2 = 5;
                    break;
                }
                break;
            case 116079:
                if (c.equals("url")) {
                    c2 = 6;
                    break;
                }
                break;
            case 3237038:
                if (c.equals("info")) {
                    c2 = 7;
                    break;
                }
                break;
            case 844731372:
                if (c.equals("fb_invite")) {
                    c2 = 8;
                    break;
                }
                break;
            case 983464541:
                if (c.equals("rate_us")) {
                    c2 = 9;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return "popup_user_message_type";
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
                return "popup_html_type";
            case 2:
                return "popup_facebook_like_type";
            case 4:
                return "popup_user_reinstall_type";
            case 8:
                return "popup_facebook_invite_type";
            case 9:
                return "popup_rate_us_type";
            default:
                return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
    }

    /* renamed from: g */
    public static double m24g(double d, double d2) {
        return Math.abs(Math.abs(d) - d2);
    }

    /* renamed from: h */
    public static int m25h(String str, int i) {
        return String.valueOf(str).length() + i;
    }

    /* renamed from: i */
    public static Object m26i(zzbl zzbl, int i, List list, int i2) {
        zzh.zzh(zzbl.name(), i, list);
        return list.get(i2);
    }

    /* renamed from: j */
    public static String m27j(GcmPayload.C15923a aVar, StringBuilder sb, String str) {
        sb.append(aVar.getTag());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: k */
    public static String m28k(String str, char c) {
        return str + c;
    }

    /* renamed from: l */
    public static String m29l(String str, long j) {
        return str + j;
    }

    /* renamed from: n */
    public static String m30n(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: o */
    public static String m31o(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: p */
    public static String m32p(Throwable th, StringBuilder sb) {
        sb.append(th.getMessage());
        return sb.toString();
    }

    /* renamed from: q */
    public static StringBuffer m33q(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return stringBuffer;
    }

    /* renamed from: r */
    public static StringBuilder m34r(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb;
    }

    /* renamed from: s */
    public static StringBuilder m35s(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: t */
    public static StringBuilder m36t(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* renamed from: u */
    public static HashMap m37u(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    /* renamed from: v */
    public static /* synthetic */ Iterator m38v() {
        try {
            return Arrays.asList(new C21072j[]{new AndroidDispatcherFactory()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* renamed from: w */
    public static void m39w(MVClientImage mVClientImage, C20952m0 m0Var, int i) {
        m0Var.mo53027a(i, Integer.valueOf(mVClientImage.getValue()));
    }

    /* renamed from: x */
    public static void m40x(MVClientText mVClientText, C20952m0 m0Var, int i) {
        m0Var.mo53027a(i, Integer.valueOf(mVClientText.getValue()));
    }

    /* renamed from: y */
    public static void m41y(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    /* renamed from: z */
    public static void m42z(StringBuilder sb, int i, String str, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r2 = r2.f52712b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r2) {
        /*
            r1 = this;
            zz.r r2 = (p977zz.C20961r) r2
            if (r2 == 0) goto L_0x0014
            boolean r0 = r2.f52711a
            if (r0 == 0) goto L_0x0014
            T r2 = r2.f52712b
            if (r2 == 0) goto L_0x0014
            com.moovit.app.tod.bookingflow.model.TodBookingPickupInformation r2 = (com.moovit.app.tod.bookingflow.model.TodBookingPickupInformation) r2
            boolean r2 = r2.f40097e
            if (r2 == 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a0.C0016g.apply(java.lang.Object):java.lang.Object");
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return C6756w.m15897b((Context) sVar.mo314b(Context.class));
    }

    public Object then(Task task) {
        C13076d dVar;
        List<Ticket> list;
        List<Ticket> list2;
        int i = C7762g.f23551y;
        if (task.isSuccessful()) {
            dVar = (C13076d) task.getResult();
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return Tasks.forResult(new C7762g.C7766d(Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList()));
        }
        if (!C13717b.m34258e(dVar.f32346a)) {
            list2 = dVar.mo39943a(Ticket.Status.ACTIVE);
            list = dVar.mo39944b(Collections.emptySet(), C13076d.f32344g);
        } else {
            list2 = Collections.emptyList();
            list = Collections.emptyList();
        }
        return Tasks.forResult(new C7762g.C7766d(dVar.f32348c, list2, list, dVar.f32349d));
    }
}

package p001a0;

import android.os.Parcel;
import android.util.SparseArray;
import androidx.camera.core.impl.C0587k;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.utils.ExifData;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.StringUtils;
import com.google.android.exoplayer2.mediacodec.C3942d;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.gms.internal.mlkit_common.zzbe;
import com.google.android.gms.internal.mlkit_common.zzbi;
import com.google.firebase.abt.component.AbtRegistrar;
import com.moovit.app.surveys.SurveyType;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerSortType;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.squareup.moshi.C8011k;
import com.tranzmate.moovit.protocol.clientimages.MVClientImage;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus;
import e20.C16783l;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mf0.C24362h;
import nb0.C12947k;
import p054d0.C4289j0;
import p066e0.C4428g;
import p404ce.C13791f;
import p404ce.C13806s;
import p435de.C16596f;
import p924xt.C20589d;
import p924xt.C20604l;
import p968zq.C20883a;
import p977zz.C20952m0;
import sg0.C24872b;
import vi0.C25121g;

/* renamed from: a0.h */
public final /* synthetic */ class C0017h implements C13791f, C3942d {
    /* renamed from: A */
    public static void m44A(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " do not support line payload")));
    }

    /* renamed from: B */
    public static void m45B(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " do not support lines payload")));
    }

    /* renamed from: C */
    public static int m46C(int i, boolean z) {
        if ((i & 2) != 0) {
            z |= true;
        }
        if ((i & 1) != 0) {
            z |= true;
        }
        if ((i & 4) != 0) {
            z |= true;
        }
        if ((i & 8) != 0) {
            z |= true;
        }
        if ((i & 16) != 0) {
            z |= true;
        }
        if ((i & 2048) != 0) {
            z |= true;
        }
        if ((i & 32) != 0) {
            z |= true;
        }
        if ((i & 64) != 0) {
            z |= true;
        }
        if ((i & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
            z |= true;
        }
        if ((i & 256) != 0) {
            z |= true;
        }
        if ((i & 512) != 0) {
            z |= true;
        }
        if ((i & 1024) != 0) {
            z |= true;
        }
        return (i & 4096) != 0 ? z | true ? 1 : 0 : z ? 1 : 0;
    }

    /* renamed from: D */
    public static String m47D(TripPlannerRouteType tripPlannerRouteType) {
        int i = C20883a.f52619d[tripPlannerRouteType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? StringUtils.NULL_USER_ID_SUBSTITUTE_STRING : "least_transfers" : "fastest" : "least_walking";
    }

    /* renamed from: E */
    public static String m48E(TripPlannerSortType tripPlannerSortType) {
        if (tripPlannerSortType == null) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        switch (C20883a.f52618c[tripPlannerSortType.ordinal()]) {
            case 1:
                return "trip_planner_sort_type_no_client_sorting";
            case 2:
                return "trip_planner_sort_type_price";
            case 3:
                return "trip_planner_sort_type_duration";
            case 4:
                return "trip_planner_sort_type_emission";
            case 5:
                return "trip_planner_sort_type_least_walking";
            case 6:
                return "trip_planner_sort_type_least_transfers";
            case 7:
                return "trip_planner_sort_type_earliest_departure";
            case 8:
                return "trip_planner_sort_type_earliest_arrival";
            default:
                return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
    }

    /* renamed from: F */
    public static int m49F(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= m51H(((TripPlannerTransportTypeInfo) it.next()).f23802b);
        }
        return i;
    }

    /* renamed from: G */
    public static int m50G(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= m51H((TripPlannerTransportType) it.next());
        }
        return i;
    }

    /* renamed from: H */
    public static int m51H(TripPlannerTransportType tripPlannerTransportType) {
        switch (C20883a.f52620e[tripPlannerTransportType.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            case 8:
                return RecyclerView.C1119a0.FLAG_IGNORE;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            default:
                return 0;
        }
    }

    /* renamed from: I */
    public static String m52I(Itinerary itinerary) {
        if (itinerary == null) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        SparseArray<C20589d> sparseArray = C20604l.f52118c;
        if (sparseArray.get(10).mo52788n(itinerary)) {
            return "walk_route_shown";
        }
        if (sparseArray.get(14).mo52788n(itinerary)) {
            return "bike_only_personal";
        }
        if (sparseArray.get(15).mo52788n(itinerary)) {
            return "bike_only_hired";
        }
        if (C16783l.m42469a(itinerary, 11)) {
            return "bike_multi_personal";
        }
        if (C16783l.m42469a(itinerary, 12)) {
            return "bike_multi_hired";
        }
        return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
    }

    /* renamed from: J */
    public static long m53J(long j, long j2, long j3) {
        long j4 = (j * j2) + j3;
        return j4 + j4;
    }

    /* renamed from: K */
    public static C0909a m54K(FragmentManager fragmentManager, FragmentManager fragmentManager2) {
        fragmentManager.getClass();
        return new C0909a(fragmentManager2);
    }

    /* renamed from: L */
    public static zzbi m55L(int i) {
        zzbe zzbe = new zzbe();
        zzbe.zza(i);
        return zzbe.zzb();
    }

    /* renamed from: M */
    public static String m56M(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* renamed from: N */
    public static String m57N(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: O */
    public static StringBuilder m58O(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    /* renamed from: P */
    public static void m59P(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    /* renamed from: Q */
    public static void m60Q(MVClientImage mVClientImage, C20952m0 m0Var, int i) {
        m0Var.mo53028b(i, Integer.valueOf(mVClientImage.getValue()));
    }

    /* renamed from: R */
    public static void m61R(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* renamed from: S */
    public static void m62S(C25121g gVar, boolean z) {
        gVar.mo61708u(z);
        gVar.mo61712y();
        gVar.mo61713z();
        gVar.mo61688L();
    }

    /* renamed from: T */
    public static void m63T(boolean z, C8011k kVar, C12947k kVar2, String str) {
        kVar.mo11094e(kVar2, Boolean.valueOf(z));
        kVar2.mo25077w(str);
    }

    /* renamed from: U */
    public static boolean m64U(C24872b.C24873a aVar, int i, String str) {
        Boolean c = aVar.mo61346c(i);
        C24362h.m61210e(c, str);
        return c.booleanValue();
    }

    /* renamed from: V */
    public static String m65V(SurveyType surveyType) {
        int i = C20883a.f52616a[surveyType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? StringUtils.NULL_USER_ID_SUBSTITUTE_STRING : "itinerary" : "suggested_routes" : "stop" : "line_group";
    }

    /* renamed from: W */
    public static String m66W(TodRideStatus todRideStatus) {
        switch (C20883a.f52621f[todRideStatus.ordinal()]) {
            case 1:
                return MVTodRideStatus.FUTURE.name();
            case 2:
                return MVTodRideStatus.ACTIVE.name();
            case 3:
                return MVTodRideStatus.CANCELLED.name();
            case 4:
                return MVTodRideStatus.COMPLETED.name();
            case 5:
                return MVTodRideStatus.NO_SHOW.name();
            case 6:
                return MVTodRideStatus.DECLINED.name();
            default:
                return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
    }

    /* renamed from: b */
    public static int m67b(C0587k kVar) {
        return ((Integer) kVar.mo2423b(C0587k.f2007h, -1)).intValue();
    }

    /* renamed from: c */
    public static int m68c(C0587k kVar) {
        return ((Integer) kVar.mo2422a(C0587k.f2005f)).intValue();
    }

    /* renamed from: d */
    public static int m69d(C0587k kVar) {
        return ((Integer) kVar.mo2423b(C0587k.f2006g, 0)).intValue();
    }

    /* renamed from: e */
    public static void m70e(C4428g gVar, ExifData.C0599b bVar) {
        int i;
        CameraCaptureMetaData$FlashState flashState = gVar.getFlashState();
        if (flashState != CameraCaptureMetaData$FlashState.UNKNOWN) {
            int i2 = ExifData.C0598a.f2043a[flashState.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 32;
            } else if (i2 != 3) {
                flashState.toString();
                C4289j0.m11435b("ExifData");
                return;
            } else {
                i = 1;
            }
            if ((i & 1) == 1) {
                bVar.mo2510c("LightSource", String.valueOf(4), bVar.f2049a);
            }
            bVar.mo2510c("Flash", String.valueOf(i), bVar.f2049a);
        }
    }

    /* renamed from: f */
    public static void m71f(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " does not support carpool center payload")));
    }

    /* renamed from: g */
    public static void m72g(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " does not support carpool invitation to ride payload")));
    }

    /* renamed from: h */
    public static void m73h(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " do not support login payload")));
    }

    /* renamed from: i */
    public static void m74i(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " do not support nearby payload")));
    }

    /* renamed from: j */
    public static void m75j(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " does not support popup payload")));
    }

    /* renamed from: k */
    public static void m76k(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " does not support rate us payload")));
    }

    /* renamed from: l */
    public static void m77l(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " do not support send feedback payload")));
    }

    /* renamed from: n */
    public static void m78n(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " do not support share driver referral payload")));
    }

    /* renamed from: o */
    public static void m79o(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " does not support spread the love payload")));
    }

    /* renamed from: p */
    public static void m80p(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " does not support survey payload")));
    }

    /* renamed from: q */
    public static void m81q(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " does not support carpool ride payload")));
    }

    /* renamed from: r */
    public static void m82r(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " does not support transportation maps payload")));
    }

    /* renamed from: s */
    public static void m83s(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " does not support carpool ride payload")));
    }

    /* renamed from: t */
    public static void m84t(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " do not support event instance payload")));
    }

    /* renamed from: u */
    public static void m85u(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " do not support user reinstall payload")));
    }

    /* renamed from: v */
    public static void m86v(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " do not support event instance payload")));
    }

    /* renamed from: w */
    public static void m87w(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " does not support facebook invite payload")));
    }

    /* renamed from: x */
    public static void m88x(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " does not support facebook like payload")));
    }

    /* renamed from: y */
    public static void m89y(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " do not support favorites payload")));
    }

    /* renamed from: z */
    public static void m90z(GcmPayload.C15923a aVar) {
        aVar.getTag();
        C16596f.m42113a().mo49364c(new UnsupportedOperationException(C0016g.m27j(aVar, new StringBuilder(), " do not support itinerary payload")));
    }

    /* renamed from: a */
    public List mo17a(String str, boolean z, boolean z2) {
        return MediaCodecUtil.m10534d(str, z, z2);
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return AbtRegistrar.lambda$getComponents$0(sVar);
    }
}

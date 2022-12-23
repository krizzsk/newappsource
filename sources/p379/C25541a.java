package p379;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import c00.C13716a;
import com.appboy.support.StringUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdj;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.heartbeatinfo.C14458a;
import com.moovit.micromobility.MicroMobilityIntegrationFlow;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.transit.TransitType;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import o30.C5974a;
import o80.C12956a;
import p404ce.C13791f;
import p404ce.C13806s;
import p743qd.C19107d;
import p838uf.C19906g;
import p909xe.C20468e;
import vi0.C25121g;
import x20.C20447a;

/* renamed from: a */
public final /* synthetic */ class C25541a implements C13716a, C13791f {
    /* renamed from: b */
    public static Bundle m63872b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    /* renamed from: c */
    public static IObjectWrapper m63873c(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    /* renamed from: d */
    public static zzdj m63874d(int i) {
        zzdf zzdf = new zzdf();
        zzdf.zza(i);
        return zzdf.zzb();
    }

    /* renamed from: e */
    public static String m63875e(int i, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: f */
    public static String m63876f(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
        return sb.toString();
    }

    /* renamed from: g */
    public static String m63877g(String str, int i, int i2) {
        return String.valueOf(str.substring(i, i2).toLowerCase());
    }

    /* renamed from: h */
    public static String m63878h(String str, int i, String str2) {
        return str + i + str2;
    }

    /* renamed from: i */
    public static String m63879i(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* renamed from: j */
    public static String m63880j(String str, Class cls) {
        return str + cls;
    }

    /* renamed from: k */
    public static String m63881k(String str, String str2) {
        return str + str2;
    }

    /* renamed from: l */
    public static String m63882l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* renamed from: n */
    public static String m63883n(String str, StringBuilder sb, String str2) {
        sb.append(str.toString());
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: o */
    public static String m63884o(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: p */
    public static String m63885p(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: q */
    public static StringBuilder m63886q(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        return sb;
    }

    /* renamed from: r */
    public static StringBuilder m63887r(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* renamed from: s */
    public static ArrayList m63888s(int i, HashMap hashMap, ArrayList arrayList, int i2, String str) {
        hashMap.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    /* renamed from: t */
    public static void m63889t(StringBuilder sb, long j, String str, String str2) {
        sb.append(j);
        sb.append(str);
        sb.append(str2);
    }

    /* renamed from: u */
    public static void m63890u(StringBuilder sb, String str, char c, String str2) {
        sb.append(str);
        sb.append(c);
        sb.append(str2);
    }

    /* renamed from: v */
    public static void m63891v(C25121g gVar, long j) {
        gVar.mo61679C(j);
        gVar.mo61712y();
        gVar.mo61713z();
        gVar.mo61688L();
    }

    /* renamed from: w */
    public static String m63892w(MicroMobilityIntegrationFlow microMobilityIntegrationFlow) {
        int i = C5974a.f19120b[microMobilityIntegrationFlow.ordinal()];
        if (i == 1) {
            return MVMicroMobilityIntegrationFlow.DEEP_LINK.name();
        }
        if (i == 2) {
            return MVMicroMobilityIntegrationFlow.RESERVE.name();
        }
        if (i != 3) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        return MVMicroMobilityIntegrationFlow.UNLOCK.name();
    }

    /* renamed from: x */
    public static String m63893x(MicroMobilityRide.Status status) {
        switch (C5974a.f19119a[status.ordinal()]) {
            case 1:
                return MVMicroMobilityRideStatus.Active.name();
            case 2:
                return MVMicroMobilityRideStatus.Reserved.name();
            case 3:
                return MVMicroMobilityRideStatus.Completed.name();
            case 4:
                return MVMicroMobilityRideStatus.Cancelled.name();
            case 5:
                return MVMicroMobilityRideStatus.Expired.name();
            case 6:
                return MVMicroMobilityRideStatus.Paused.name();
            case 7:
                return MVMicroMobilityRideStatus.Pending.name();
            default:
                return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
    }

    /* renamed from: y */
    public static String m63894y(Ticket.Status status) {
        switch (C12956a.f32094a[status.ordinal()]) {
            case 1:
                return "issuing_in_progress";
            case 2:
                return "not_yet_active";
            case 3:
                return "valid";
            case 4:
                return "auto_active";
            case 5:
                return AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
            case 6:
                return "expired";
            default:
                return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
    }

    /* renamed from: z */
    public static String m63895z(TransitType transitType) {
        if (transitType == null) {
            return null;
        }
        switch (C20447a.f51788a[transitType.f23760e.ordinal()]) {
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
                return null;
        }
    }

    /* renamed from: a */
    public Collection mo40582a(int i) {
        return new ArrayList(i);
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return new C14458a((Context) sVar.mo314b(Context.class), ((C19107d) sVar.mo314b(C19107d.class)).mo51538f(), sVar.mo317f(C20468e.class), sVar.mo40719h(C19906g.class));
    }
}

package p379;

import android.view.ViewParent;
import androidx.camera.core.impl.C0595r;
import com.amazonaws.regions.Region;
import com.appboy.support.StringUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzad;
import com.google.android.gms.internal.mlkit_vision_common.zzah;
import com.moovit.app.tod.bottomsheet.TodRideBottomSheet;
import com.moovit.app.tod.bottomsheet.stateviews.TodCompletedRideView;
import com.moovit.app.tod.model.TodRideVehicleAction;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus;
import com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus;
import com.tranzmate.moovit.protocol.payments.MVVerificationStatus;
import j50.C25743a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.Set;
import mf0.C24362h;
import p241s0.C6302b;
import p400bx.C13705a;
import p400bx.C13706b;
import p404ce.C13791f;
import p404ce.C13806s;
import p502fx.C17117b;
import p810sz.C19577c;
import p810sz.C19615p;
import p838uf.C19900b;
import p838uf.C19901c;
import p838uf.C19902d;
import p977zz.C20944i0;
import wh0.C25230y;
import xh0.C25271a;

/* renamed from: b */
public final /* synthetic */ class C13555b implements C13791f {
    /* renamed from: a */
    public static int m33962a(C0595r rVar) {
        return ((Integer) rVar.mo2423b(C0595r.f2028q, 0)).intValue();
    }

    /* renamed from: b */
    public static void m33963b(C13706b bVar, C17117b bVar2) {
        C13705a aVar;
        ViewParent parent = bVar.mo40576h().getParent();
        if ((parent instanceof TodRideBottomSheet) && (aVar = ((TodRideBottomSheet) parent).f40112M) != null) {
            aVar.mo40571M0(bVar2);
        }
    }

    /* renamed from: c */
    public static void m33964c(C13706b bVar, TodRideVehicleAction todRideVehicleAction) {
        C13705a aVar;
        ViewParent parent = bVar.mo40576h().getParent();
        if ((parent instanceof TodRideBottomSheet) && (aVar = ((TodRideBottomSheet) parent).f40112M) != null) {
            aVar.mo40572p0(todRideVehicleAction);
        }
    }

    /* renamed from: d */
    public static void m33965d(TodCompletedRideView todCompletedRideView) {
        C13705a aVar;
        ViewParent parent = todCompletedRideView.getParent();
        if ((parent instanceof TodRideBottomSheet) && (aVar = ((TodRideBottomSheet) parent).f40112M) != null) {
            aVar.mo40570J0();
        }
    }

    /* renamed from: e */
    public static Region m33966e(String str, String str2, ArrayList arrayList) {
        Region region = new Region(str, str2);
        arrayList.add(region);
        return region;
    }

    /* renamed from: f */
    public static zzah m33967f(int i) {
        zzad zzad = new zzad();
        zzad.zza(i);
        return zzad.zzb();
    }

    /* renamed from: g */
    public static Enum m33968g(C19577c cVar, C19615p pVar) {
        cVar.getClass();
        return cVar.mo51916a(pVar.mo51926r());
    }

    /* renamed from: h */
    public static String m33969h(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: i */
    public static String m33970i(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: j */
    public static String m33971j(Object[] objArr, int i, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i));
        C24362h.m61210e(format, str2);
        return format;
    }

    /* renamed from: k */
    public static StringBuilder m33972k(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: l */
    public static StringBuilder m33973l(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: n */
    public static ArrayList m33974n(ArrayList arrayList, String str, int i, HashMap hashMap, ArrayList arrayList2, int i2) {
        arrayList.add(str);
        hashMap.put(Integer.valueOf(i), arrayList2);
        return new ArrayList(i2);
    }

    /* renamed from: o */
    public static /* synthetic */ Iterator m33975o() {
        try {
            return Arrays.asList(new C25230y[]{new C25271a()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* renamed from: p */
    public static C20944i0 m33976p(C6302b bVar, C20944i0 i0Var, CreditCardConfig creditCardConfig, String str, String str2) {
        bVar.put(i0Var, creditCardConfig);
        return new C20944i0(str, str2);
    }

    /* renamed from: q */
    public static void m33977q(StringBuilder sb, boolean z, String str, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
    }

    /* renamed from: r */
    public static String m33978r(int i) {
        switch (i) {
            case 1:
                return "credit_card";
            case 2:
                return "ideal";
            case 3:
                return "banconcat";
            case 4:
                return "giropay";
            case 5:
                return "sofort";
            case 6:
                return "paypal";
            case 7:
                return "direct_debit_sepa";
            default:
                return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
    }

    /* renamed from: s */
    public static String m33979s(PaymentAccountContextStatus paymentAccountContextStatus) {
        int i = C25743a.f64179b[paymentAccountContextStatus.ordinal()];
        if (i == 1) {
            return MVPaymentAccountContextStatus.INCOMPLETE.name();
        }
        if (i == 2) {
            return MVPaymentAccountContextStatus.CONNECTED.name();
        }
        if (i == 3) {
            return MVPaymentAccountContextStatus.DISCONNECTED.name();
        }
        if (i != 4) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        return MVPaymentAccountContextStatus.BLACKLIST.name();
    }

    /* renamed from: t */
    public static String m33980t(PaymentCertificateStatus paymentCertificateStatus) {
        if (paymentCertificateStatus == null) {
            return "none";
        }
        int i = C25743a.f64180c[paymentCertificateStatus.ordinal()];
        if (i == 1) {
            return MVVerificationStatus.VALIDATED.name();
        }
        if (i == 2) {
            return MVVerificationStatus.PENDING.name();
        }
        if (i == 3) {
            return MVVerificationStatus.NOTVALID.name();
        }
        if (i == 4) {
            return MVVerificationStatus.EXPIRED.name();
        }
        if (i != 5) {
            return "none";
        }
        return MVVerificationStatus.NOTUPLOADED.name();
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        Set<C19902d> f = sVar.mo317f(C19902d.class);
        C19901c cVar = C19901c.f50538b;
        if (cVar == null) {
            synchronized (C19901c.class) {
                cVar = C19901c.f50538b;
                if (cVar == null) {
                    cVar = new C19901c();
                    C19901c.f50538b = cVar;
                }
            }
        }
        return new C19900b(f, cVar);
    }
}

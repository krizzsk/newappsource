package w40;

import android.content.res.ColorStateList;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import c00.C13723g;
import ce0.C21100e;
import com.moovit.commons.utils.C15780a;
import com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificatePhotoData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateTextData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationPhotoSpec;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationTextSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p810sz.C19617r;
import p924xt.C20603k;
import p977zz.C20941h;
import p977zz.C20944i0;
import t60.C19634d;
import v40.C25748c;
import v40.C25749d;
import v40.C25754i;

/* renamed from: w40.g */
public final class C25765g {

    /* renamed from: a */
    public static final C19617r f64279a;

    /* renamed from: b */
    public static final C19617r f64280b;

    /* renamed from: w40.g$a */
    public static /* synthetic */ class C25766a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64281a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus[] r0 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f64281a = r0
                com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r1 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.PENDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f64281a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r1 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.EXPIRED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f64281a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r1 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.NOT_VALID     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f64281a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r1 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.NOT_UPLOADED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f64281a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r1 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.APPROVED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f64281a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r1 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.NONE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w40.C25765g.C25766a.<clinit>():void");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ProfileCertificationPhotoSpec.C16401b bVar = ProfileCertificationPhotoSpec.f42849g;
        C21100e.m49373x(bVar, "writer");
        hashMap.put(ProfileCertificationPhotoSpec.class, new C20944i0(1, bVar));
        hashMap2.put(1, bVar);
        ProfileCertificationTextSpec.C16403b bVar2 = ProfileCertificationTextSpec.f42855i;
        C21100e.m49373x(bVar2, "writer");
        hashMap.put(ProfileCertificationTextSpec.class, new C20944i0(2, bVar2));
        hashMap2.put(2, bVar2);
        f64279a = new C19617r(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ProfileCertificatePhotoData.C16397b bVar3 = ProfileCertificatePhotoData.f42845d;
        C21100e.m49373x(bVar3, "writer");
        hashMap3.put(ProfileCertificatePhotoData.class, new C20944i0(1, bVar3));
        hashMap4.put(1, bVar3);
        ProfileCertificateTextData.C16399b bVar4 = ProfileCertificateTextData.f42847d;
        C21100e.m49373x(bVar4, "writer");
        hashMap3.put(ProfileCertificateTextData.class, new C20944i0(2, bVar4));
        hashMap4.put(2, bVar4);
        f64280b = new C19617r(hashMap3, hashMap4);
    }

    /* renamed from: a */
    public static boolean m64313a(FragmentManager fragmentManager) {
        ArrayList<T> c = C13723g.m34282c(fragmentManager.mo3930H(), new C20603k(5));
        if (C13717b.m34258e(c)) {
            return false;
        }
        for (T t : c) {
            if (!((C19634d) t).mo51977D0()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static ArrayList m64314b(FragmentManager fragmentManager) {
        ProfileCertificateData P0;
        List<Fragment> H = fragmentManager.mo3930H();
        ArrayList arrayList = new ArrayList(H.size());
        for (Fragment next : H) {
            if ((next instanceof C19634d) && (P0 = ((C19634d) next).mo51978P0()) != null) {
                arrayList.add(P0);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static void m64315c(TextView textView, PaymentCertificateStatus paymentCertificateStatus) {
        int i;
        int i2;
        int i3 = C25766a.f64281a[paymentCertificateStatus.ordinal()];
        int i4 = 0;
        if (i3 == 1) {
            i4 = C25754i.payment_profile_status_pending;
            i = C25749d.ic_pending_24_problem;
            i2 = C25748c.colorSurfaceProblem;
        } else if (i3 == 2) {
            i4 = C25754i.payment_profile_status_expired;
            i = C25749d.ic_alert_24_critical;
            i2 = C25748c.colorSurfaceCritical;
        } else if (i3 == 3) {
            i4 = C25754i.payment_profile_status_rejected;
            i = C25749d.ic_alert_24_critical;
            i2 = C25748c.colorSurfaceCritical;
        } else if (i3 != 4) {
            i = 0;
            i2 = 0;
        } else {
            i4 = C25754i.payment_profile_status_missing_docs;
            i = C25749d.ic_alert_24_critical;
            i2 = C25748c.colorSurfaceCritical;
        }
        textView.setText(i4);
        ColorStateList g = C20941h.m49044g(i2, textView.getContext());
        if (g != null) {
            textView.setBackgroundTintList(g);
        }
        C15780a.m40272e(textView, i);
    }
}

package com.moovit.app.taxi;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.TextView;
import c00.C13717b;
import c00.C13723g;
import com.moovit.app.taxi.providers.TaxiButtonSpec;
import com.moovit.app.taxi.providers.TaxiPolygon;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiVisibility;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import java.util.Set;
import p242s1.C6333d0;
import p712ou.C18829a;

/* renamed from: com.moovit.app.taxi.a */
public final class C15413a {

    /* renamed from: com.moovit.app.taxi.a$a */
    public static /* synthetic */ class C15414a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39916a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f39917b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.moovit.app.taxi.providers.TaxiVisibility[] r0 = com.moovit.app.taxi.providers.TaxiVisibility.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39917b = r0
                r1 = 1
                com.moovit.app.taxi.providers.TaxiVisibility r2 = com.moovit.app.taxi.providers.TaxiVisibility.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f39917b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.taxi.providers.TaxiVisibility r3 = com.moovit.app.taxi.providers.TaxiVisibility.NOT_INSTALLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f39917b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.taxi.providers.TaxiVisibility r3 = com.moovit.app.taxi.providers.TaxiVisibility.PAYMENT_ACCOUNT_CONNECTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect[] r2 = com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f39916a = r2
                com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect r3 = com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect.VISIBLE_INSIDE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f39916a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect r2 = com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect.NONE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.taxi.C15413a.C15414a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m39456a(TextView textView, TaxiButtonSpec taxiButtonSpec) {
        if (taxiButtonSpec != null) {
            textView.setText(taxiButtonSpec.f39928b);
            textView.setTextColor(taxiButtonSpec.f39929c.f41007b);
            C6333d0.m15032t(textView, ColorStateList.valueOf(taxiButtonSpec.f39930d.f41007b));
        }
    }

    /* renamed from: b */
    public static boolean m39457b(Context context, TaxiProvider taxiProvider, TaxiVisibility taxiVisibility, PaymentAccount paymentAccount, LatLonE6 latLonE6) {
        boolean z;
        boolean z2;
        Set<TaxiPolygon> set = taxiProvider.f39975j;
        if (!C13717b.m34258e(set) && C15414a.f39916a[taxiProvider.f39983r.ordinal()] == 1 && (latLonE6 == null || !C13723g.m34280a(set, new C18829a(1, latLonE6)))) {
            z = false;
        } else {
            z = true;
        }
        int i = C15414a.f39917b[taxiVisibility.ordinal()];
        if (i == 1) {
            z2 = true;
        } else if (i == 2) {
            z2 = !taxiProvider.f39976k.mo46103c(context);
        } else if (i != 3) {
            z2 = false;
        } else {
            z2 = PaymentAccount.m64175c(paymentAccount, taxiProvider.f39974i, PaymentAccountContextStatus.CONNECTED);
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}

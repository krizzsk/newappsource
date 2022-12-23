package com.moovit.payment.account.profile;

import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import c70.C13751d;
import com.moovit.C15682c;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.request.RequestOptions;
import g50.C25730d;
import h60.C17330k1;
import h60.C17333l1;
import java.util.Collections;
import java.util.List;
import p001a0.C0017h;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20975x0;
import v40.C25747b;
import v40.C25750e;
import v40.C25751f;

public class PaymentAccountAddProfileActivity extends MoovitPaymentActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f64096X = 0;

    /* renamed from: U */
    public final C25701a f64097U = new C25701a();

    /* renamed from: com.moovit.payment.account.profile.PaymentAccountAddProfileActivity$a */
    public class C25701a extends C20438i<C17330k1, C17333l1> {
        public C25701a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17330k1 k1Var = (C17330k1) cVar;
            PaymentAccountAddProfileActivity.this.mo44506I1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17330k1 k1Var = (C17330k1) cVar;
            C17333l1 l1Var = (C17333l1) gVar;
            PaymentAccountAddProfileActivity paymentAccountAddProfileActivity = PaymentAccountAddProfileActivity.this;
            paymentAccountAddProfileActivity.setResult(-1);
            paymentAccountAddProfileActivity.finish();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            PaymentAccountAddProfileActivity.this.mo44530n2(C13751d.m34341b(((C17330k1) cVar).f51759b, (String) null, exc));
            return true;
        }
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        if (C20975x0.m49118e(str, "getProfilesErrorTag")) {
            finish();
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.payment_account_add_profile_activity);
        if (getSupportFragmentManager().mo3983z(C25750e.fragments_container) == null) {
            mo83550z2(new C25730d(), false);
        }
    }

    /* renamed from: y2 */
    public final void mo83549y2(PaymentProfile paymentProfile, List<ProfileCertificateData> list) {
        mo44543u2((CharSequence) null);
        C17330k1 k1Var = new C17330k1(mo44548x1(), Collections.singletonList(paymentProfile), list);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2("update_profiles_selected", k1Var, requestOptions, this.f64097U);
    }

    /* renamed from: z2 */
    public final void mo83550z2(C15682c<PaymentAccountAddProfileActivity> cVar, boolean z) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
        K.mo4112g(C25747b.slide_fragment_enter, C25747b.slide_fragment_exit, C25747b.slide_fragment_pop_enter, C25747b.slide_fragment_pop_exit);
        K.mo4111f(C25750e.fragments_container, cVar, (String) null);
        if (z) {
            K.mo4110c((String) null);
        }
        K.mo4040d();
    }
}

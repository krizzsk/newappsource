package com.moovit.payment.account.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c70.C13751d;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.C15780a;
import com.moovit.image.entity.upload.EntityImageUploadWorker;
import com.moovit.network.model.ServerId;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.account.model.PaymentAccountProfile;
import com.moovit.payment.account.profile.C25705a;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificatePhotoData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateTextData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationSpec;
import com.moovit.request.RequestOptions;
import g50.C25731e;
import h60.C17305c0;
import h60.C17308d0;
import h60.C17359u;
import h60.C17362v;
import java.util.Collections;
import java.util.List;
import p001a0.C0017h;
import p242s1.C6333d0;
import p372at.C13515b;
import p644lx.C18284b;
import p810sz.C19617r;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p947yt.C20767b;
import p977zz.C20941h;
import p977zz.C20964s0;
import t60.C19632b;
import t60.C19634d;
import v40.C25748c;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import w40.C25761d;
import w40.C25765g;

public class PaymentAccountEditProfileActivity extends MoovitPaymentActivity implements C19634d.C19635a, C25705a.C25706a, ProfileCertificateData.C16395a<Void> {

    /* renamed from: l0 */
    public static final /* synthetic */ int f64099l0 = 0;

    /* renamed from: U */
    public final C25702a f64100U = new C25702a();

    /* renamed from: X */
    public final C25703b f64101X = new C25703b();

    /* renamed from: Y */
    public ServerId f64102Y;

    /* renamed from: Z */
    public PaymentAccountProfile f64103Z;

    /* renamed from: com.moovit.payment.account.profile.PaymentAccountEditProfileActivity$a */
    public class C25702a extends C20438i<C17359u, C17362v> {
        public C25702a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17359u uVar = (C17359u) cVar;
            C17362v vVar = (C17362v) gVar;
            PaymentAccountEditProfileActivity.this.finish();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17359u uVar = (C17359u) cVar;
            PaymentAccountEditProfileActivity paymentAccountEditProfileActivity = PaymentAccountEditProfileActivity.this;
            paymentAccountEditProfileActivity.mo44530n2(C13751d.m34341b(paymentAccountEditProfileActivity, (String) null, exc));
            return true;
        }
    }

    /* renamed from: com.moovit.payment.account.profile.PaymentAccountEditProfileActivity$b */
    public class C25703b extends C20438i<C17305c0, C17308d0> {
        public C25703b() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17308d0 d0Var = (C17308d0) gVar;
            PaymentAccountEditProfileActivity paymentAccountEditProfileActivity = PaymentAccountEditProfileActivity.this;
            ProfileCertificateData profileCertificateData = ((C17305c0) cVar).f44690w;
            int i = PaymentAccountEditProfileActivity.f64099l0;
            paymentAccountEditProfileActivity.getClass();
            profileCertificateData.mo49104b(paymentAccountEditProfileActivity);
            paymentAccountEditProfileActivity.mo83553z2();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17305c0 c0Var = (C17305c0) cVar;
            PaymentAccountEditProfileActivity paymentAccountEditProfileActivity = PaymentAccountEditProfileActivity.this;
            paymentAccountEditProfileActivity.mo44530n2(C13751d.m34341b(paymentAccountEditProfileActivity, (String) null, exc));
            return true;
        }
    }

    /* renamed from: y2 */
    public static Intent m64248y2(Context context, ServerId serverId) {
        Intent intent = new Intent(context, PaymentAccountEditProfileActivity.class);
        C21100e.m49371w(serverId);
        intent.putExtra("profileId", serverId);
        return intent;
    }

    /* renamed from: A2 */
    public final void mo83551A2(boolean z) {
        int i;
        int i2;
        TextView textView = (TextView) findViewById(C25750e.title);
        textView.setText(this.f64103Z.f64033b.f42830d);
        C6333d0.m15030r(textView, true);
        PaymentAccountProfile paymentAccountProfile = this.f64103Z;
        TextView textView2 = (TextView) findViewById(C25750e.status_view);
        C20964s0.m49103u(textView2, paymentAccountProfile.f64036e, new C25731e(this, 0));
        C19617r rVar = C25765g.f64279a;
        int i3 = C25765g.C25766a.f64281a[paymentAccountProfile.f64035d.ordinal()];
        if (i3 == 1) {
            i2 = C25749d.ic_pending_24_problem;
            i = C25748c.colorSurfaceProblem;
        } else if (i3 == 2 || i3 == 3 || i3 == 4) {
            i2 = C25749d.ic_alert_24_critical;
            i = C25748c.colorSurfaceCritical;
        } else if (i3 != 5) {
            i2 = 0;
            i = 0;
        } else {
            i2 = C25749d.ic_alert_24_good;
            i = C25748c.colorSurfaceGood;
        }
        ColorStateList g = C20941h.m49044g(i, textView2.getContext());
        if (g != null) {
            textView2.setBackgroundTintList(g);
        }
        C15780a.m40272e(textView2, i2);
        textView2.setVisibility(0);
        findViewById(C25750e.delete_button).setOnClickListener(new C18284b(this, 9));
        if (z) {
            List<ProfileCertificationSpec> list = this.f64103Z.f64033b.f42833g;
            if (!list.isEmpty()) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
                for (ProfileCertificationSpec next : list) {
                    String str = next.f42853b;
                    Fragment A = supportFragmentManager.mo3923A(str);
                    if (A != null) {
                        K.mo4050p(A);
                    }
                    K.mo4041e(C25750e.documents_buttons_container, (Fragment) next.mo49115b(C19632b.m47070a()), str, 1);
                }
                K.mo4040d();
            }
        }
    }

    /* renamed from: P */
    public final void mo51973P(ProfileCertificateData profileCertificateData) {
        C17305c0 c0Var = new C17305c0(mo44548x1(), profileCertificateData);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2("update_certificate", c0Var, requestOptions, this.f64101X);
    }

    /* renamed from: S */
    public final /* synthetic */ void mo51974S() {
    }

    /* renamed from: S0 */
    public final void mo83552S0() {
        C17359u uVar = new C17359u(mo44548x1(), Collections.singletonList(this.f64102Y));
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2("delete_profiles", uVar, requestOptions, this.f64100U);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.payment_account_update_profile_activity);
        ServerId serverId = (ServerId) getIntent().getParcelableExtra("profileId");
        this.f64102Y = serverId;
        if (serverId != null) {
            if (bundle != null) {
                this.f64103Z = (PaymentAccountProfile) bundle.getParcelable("profileAccount");
            }
            if (this.f64103Z == null) {
                mo83553z2();
            } else {
                mo83551A2(false);
            }
        } else {
            throw new IllegalStateException("Did you use PaymentAccountUpdateProfileActivity.createStartIntent(...)");
        }
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("profileAccount", this.f64103Z);
    }

    /* renamed from: m0 */
    public final Object mo49105m0(ProfileCertificateTextData profileCertificateTextData) {
        Toast.makeText(this, C25754i.settings_account_settings_saved_message, 0).show();
        return null;
    }

    /* renamed from: o */
    public final Object mo49106o(ProfileCertificatePhotoData profileCertificatePhotoData) {
        EntityImageUploadWorker.m40807a(this, EntityImageUploadWorker.EntityImageType.VERIFICATION, profileCertificatePhotoData.f42846c.getPath(), profileCertificatePhotoData.f42844b, (LatLonE6) null);
        Toast.makeText(this, C25754i.payment_mot_uploaded_doc_success, 0).show();
        return null;
    }

    /* renamed from: z2 */
    public final void mo83553z2() {
        C25761d.m64299a().mo83587b(false).addOnFailureListener((Activity) this, (OnFailureListener) new C20767b(this, 4)).addOnSuccessListener((Activity) this, new C13515b(this, 9));
    }
}

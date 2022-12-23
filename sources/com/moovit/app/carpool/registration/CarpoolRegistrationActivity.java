package com.moovit.app.carpool.registration;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c70.C13751d;
import ce0.C21100e;
import ci0.C21211f;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.app.carpool.CarpoolRidesProvider;
import com.moovit.carpool.CarpoolDriver;
import com.moovit.carpool.CarpoolRegistrationSteps;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import com.tranzmate.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p527gy.C17261e;
import p543hq.C17474b;
import p685nr.C18586a;
import p709or.C18824a;
import p733pr.C18963d;
import p733pr.C18964e;
import p733pr.C18971g;
import p803ss.C19522a;
import p906wz.C20431c;
import p906wz.C20436g;
import z90.C13346d;
import z90.C13347e;
import z90.C13348f;
import z90.C13349g;
import z90.C13352j;
import z90.C13353k;

public class CarpoolRegistrationActivity extends MoovitAppActivity {

    /* renamed from: q0 */
    public static final /* synthetic */ int f37816q0 = 0;

    /* renamed from: U */
    public C17474b.C17475a f37817U = null;

    /* renamed from: X */
    public final C14821a f37818X = new C14821a();

    /* renamed from: Y */
    public final C14822b f37819Y = new C14822b();

    /* renamed from: Z */
    public final C14823c f37820Z = new C14823c();

    /* renamed from: l0 */
    public String f37821l0 = "";

    /* renamed from: m0 */
    public CarpoolRegistrationSteps f37822m0;

    /* renamed from: n0 */
    public FutureCarpoolRide f37823n0;

    /* renamed from: o0 */
    public ImageView f37824o0;

    /* renamed from: p0 */
    public ArrayList f37825p0 = new ArrayList(2);

    /* renamed from: com.moovit.app.carpool.registration.CarpoolRegistrationActivity$a */
    public class C14821a extends C21211f {
        public C14821a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C13346d dVar = (C13346d) cVar;
            CarpoolRegistrationActivity.this.mo44506I1();
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C13346d dVar = (C13346d) cVar;
            if (!(serverException instanceof UserRequestError)) {
                return false;
            }
            CarpoolRegistrationActivity carpoolRegistrationActivity = CarpoolRegistrationActivity.this;
            String c = ((UserRequestError) serverException).mo49161c();
            int i = CarpoolRegistrationActivity.f37816q0;
            Fragment z = carpoolRegistrationActivity.getSupportFragmentManager().mo3983z(R.id.fragment_container);
            if (z instanceof C18964e) {
                C18964e eVar = (C18964e) z;
                eVar.f48291i.setVisibility(0);
                eVar.f48291i.setText(c);
                eVar.mo51479M1(R.attr.colorError);
                eVar.f48290h.setEnabled(false);
            }
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13346d dVar = (C13346d) cVar;
            C13347e eVar = (C13347e) gVar;
            CarpoolRegistrationActivity carpoolRegistrationActivity = CarpoolRegistrationActivity.this;
            int i = CarpoolRegistrationActivity.f37816q0;
            carpoolRegistrationActivity.getClass();
            C19522a a = C19522a.m46888a(carpoolRegistrationActivity);
            C19522a.f49619f.mo49545d(a.f49620a, carpoolRegistrationActivity.f37821l0);
            carpoolRegistrationActivity.f37821l0 = "";
            UiUtils.m40252k(carpoolRegistrationActivity.f37824o0);
            ((C17261e) carpoolRegistrationActivity.getSystemService("user_profile_manager_service")).mo49806i();
            carpoolRegistrationActivity.mo44890z2();
        }
    }

    /* renamed from: com.moovit.app.carpool.registration.CarpoolRegistrationActivity$b */
    public class C14822b extends C21211f {
        public C14822b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C13352j jVar = (C13352j) cVar;
            CarpoolRegistrationActivity.this.mo44506I1();
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C13352j jVar = (C13352j) cVar;
            CarpoolRegistrationActivity carpoolRegistrationActivity = CarpoolRegistrationActivity.this;
            carpoolRegistrationActivity.mo44530n2(C13751d.m34341b(carpoolRegistrationActivity, (String) null, serverException));
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C13352j jVar = (C13352j) cVar;
            CarpoolRegistrationActivity carpoolRegistrationActivity = CarpoolRegistrationActivity.this;
            carpoolRegistrationActivity.mo44530n2(C13751d.m34341b(carpoolRegistrationActivity, (String) null, iOException));
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C13352j jVar = (C13352j) cVar;
            CarpoolRegistrationActivity carpoolRegistrationActivity = CarpoolRegistrationActivity.this;
            carpoolRegistrationActivity.mo44530n2(C13751d.m34341b(carpoolRegistrationActivity, (String) null, iOException));
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13352j jVar = (C13352j) cVar;
            C13353k kVar = (C13353k) gVar;
            CarpoolRegistrationActivity carpoolRegistrationActivity = CarpoolRegistrationActivity.this;
            int i = CarpoolRegistrationActivity.f37816q0;
            C18586a aVar = (C18586a) carpoolRegistrationActivity.getSupportFragmentManager().mo3983z(R.id.fragment_container);
            if (aVar instanceof C18963d) {
                carpoolRegistrationActivity.mo44890z2();
            } else if (aVar instanceof C18964e) {
                C18964e eVar = (C18964e) aVar;
                eVar.f48294l.setVisibility(8);
                eVar.f48293k.setVisibility(0);
                Handler handler = eVar.f48296n;
                C18971g gVar2 = new C18971g(eVar);
                eVar.f48297o = gVar2;
                handler.post(gVar2);
            }
        }
    }

    /* renamed from: com.moovit.app.carpool.registration.CarpoolRegistrationActivity$c */
    public class C14823c extends C21211f {
        public C14823c() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C13348f fVar = (C13348f) cVar;
            CarpoolRegistrationActivity.this.mo44506I1();
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C13348f fVar = (C13348f) cVar;
            if (!(serverException instanceof UserRequestError)) {
                return false;
            }
            CarpoolRegistrationActivity carpoolRegistrationActivity = CarpoolRegistrationActivity.this;
            carpoolRegistrationActivity.mo44530n2(C13751d.m34341b(carpoolRegistrationActivity, (String) null, serverException));
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13348f fVar = (C13348f) cVar;
            C13349g gVar2 = (C13349g) gVar;
            UiUtils.m40252k(CarpoolRegistrationActivity.this.f37824o0);
            CarpoolRidesProvider.f37661j.mo44833c(-1);
            CarpoolRegistrationActivity.this.mo44890z2();
        }
    }

    /* renamed from: A2 */
    public final void mo44887A2(C18586a aVar) {
        getSupportActionBar().mo800v(aVar.mo50979H1());
        int indexOf = this.f37825p0.indexOf(aVar.getClass());
        ImageView imageView = this.f37824o0;
        if (indexOf == this.f37825p0.size() - 1) {
            indexOf = 2;
        }
        imageView.setImageLevel(indexOf);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0909a aVar2 = new C0909a(supportFragmentManager);
        aVar2.mo4111f(R.id.fragment_container, aVar, (String) null);
        aVar2.mo4045k();
        if (this.f37311x) {
            mo44888B2(true);
        }
        this.f37817U = new C17474b.C17475a(aVar.mo50981J1());
    }

    /* renamed from: B2 */
    public final void mo44888B2(boolean z) {
        C17474b.C17475a aVar = this.f37817U;
        if (aVar != null) {
            aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
            mo44545v2(this.f37817U.mo49933a());
            this.f37817U = null;
        }
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        C18586a aVar = (C18586a) getSupportFragmentManager().mo3983z(R.id.fragment_container);
        if (!(aVar instanceof C18964e)) {
            return this instanceof AdjustAdsPreferencesActivity;
        }
        C18964e eVar = (C18964e) aVar;
        C18971g gVar = eVar.f48297o;
        if (gVar != null) {
            eVar.f48296n.removeCallbacks(gVar);
            eVar.f48297o = null;
        }
        mo44888B2(false);
        int i = C18963d.f48282k;
        Bundle bundle = new Bundle();
        C18963d dVar = new C18963d();
        dVar.setArguments(bundle);
        mo44887A2(dVar);
        return true;
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        mo44888B2(false);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.carpool_registration_activity);
        Intent intent = getIntent();
        this.f37823n0 = (FutureCarpoolRide) intent.getParcelableExtra("futureRideExtra");
        this.f37822m0 = (CarpoolRegistrationSteps) intent.getParcelableExtra("requiredRegStepsExtra");
        if (bundle != null) {
            this.f37821l0 = bundle.getString("sentPhoneNumber");
        }
        FutureCarpoolRide futureCarpoolRide = this.f37823n0;
        if (futureCarpoolRide == null) {
            findViewById(R.id.ride_summary).setVisibility(8);
        } else {
            CarpoolRide carpoolRide = futureCarpoolRide.f40937b;
            CarpoolDriver carpoolDriver = carpoolRide.f40911c;
            ((FormatTextView) findViewById(R.id.ride_message)).setArguments(carpoolDriver.f40876c + " " + carpoolDriver.f40877d);
            ((TextView) findViewById(R.id.ride_price)).setText(carpoolRide.f40917i.toString());
        }
        this.f37824o0 = (ImageView) findViewById(R.id.progress);
        if (this.f37822m0.f40906b) {
            this.f37825p0.add(C18963d.class);
            this.f37825p0.add(C18964e.class);
        }
        if (this.f37822m0.f40907c) {
            this.f37825p0.add(C18824a.class);
        }
        if (getSupportFragmentManager().mo3983z(R.id.fragment_container) == null) {
            mo44890z2();
        }
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        C18586a aVar = (C18586a) getSupportFragmentManager().mo3983z(R.id.fragment_container);
        if (this.f37311x) {
            mo44888B2(true);
        }
        this.f37817U = new C17474b.C17475a(aVar.mo50981J1());
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putString("sentPhoneNumber", this.f37821l0);
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("CARPOOL_SUPPORT_VALIDATOR");
        hashSet.add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo44889y2(CharSequence charSequence) {
        mo44540t2(R.string.carpool_registration_requesting_verification_code);
        this.f37821l0 = charSequence.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2("set_phone_number", new C13352j(mo44548x1(), (String) null, charSequence.toString()), requestOptions, this.f37819Y);
    }

    /* renamed from: z2 */
    public final void mo44890z2() {
        Class cls;
        C18586a aVar;
        C18586a aVar2 = (C18586a) getSupportFragmentManager().mo3983z(R.id.fragment_container);
        if (aVar2 == null) {
            cls = (Class) this.f37825p0.get(0);
        } else {
            int indexOf = this.f37825p0.indexOf(aVar2.getClass());
            if (indexOf == this.f37825p0.size() - 1) {
                cls = null;
            } else {
                cls = (Class) this.f37825p0.get(indexOf + 1);
            }
        }
        if (cls == null) {
            mo44888B2(true);
            setResult(-1);
            finish();
            return;
        }
        if (cls.equals(C18963d.class)) {
            int i = C18963d.f48282k;
            Bundle bundle = new Bundle();
            aVar = new C18963d();
            aVar.setArguments(bundle);
        } else if (cls.equals(C18964e.class)) {
            String str = this.f37821l0;
            int i2 = C18964e.f48283p;
            C21100e.m49373x(str, "phoneNumber");
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneNumber", str);
            aVar = new C18964e();
            aVar.setArguments(bundle2);
        } else if (cls.equals(C18824a.class)) {
            int i3 = C18824a.f47931b;
            Bundle bundle3 = new Bundle();
            aVar = new C18824a();
            aVar.setArguments(bundle3);
        } else {
            throw new IllegalArgumentException(C25541a.m63880j("Have you forgot to address a new step? step: ", cls));
        }
        mo44887A2(aVar);
    }
}

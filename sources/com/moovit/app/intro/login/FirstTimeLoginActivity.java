package com.moovit.app.intro.login;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.app.intro.FirstTimeUseActivity;
import com.moovit.app.useraccount.manager.UserAccountDataProvider;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.design.view.AlertMessageView;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p001a0.C0017h;
import p804st.C19523a;
import p804st.C19526b;
import p804st.C19530e;
import p804st.C19535f;
import p804st.C19536g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p951yx.C20784a;

public abstract class FirstTimeLoginActivity extends FirstTimeUseActivity {

    /* renamed from: p0 */
    public static final /* synthetic */ int f38456p0 = 0;

    /* renamed from: n0 */
    public final C15021a f38457n0 = new C15021a();

    /* renamed from: o0 */
    public C19536g f38458o0 = null;

    /* renamed from: com.moovit.app.intro.login.FirstTimeLoginActivity$a */
    public class C15021a extends C20438i<C19535f, C19536g> {
        public C15021a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19535f fVar = (C19535f) cVar;
            FirstTimeLoginActivity firstTimeLoginActivity = FirstTimeLoginActivity.this;
            firstTimeLoginActivity.f38458o0 = (C19536g) gVar;
            ((ProgressBar) firstTimeLoginActivity.findViewById(R.id.loading_view)).setVisibility(8);
            C19536g gVar2 = firstTimeLoginActivity.f38458o0;
            if (gVar2 == null || gVar2.f49647m) {
                FragmentManager supportFragmentManager = firstTimeLoginActivity.getSupportFragmentManager();
                C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
                int i = C19526b.f49630n;
                Bundle bundle = new Bundle();
                C19526b bVar = new C19526b();
                bVar.setArguments(bundle);
                K.mo4111f(R.id.fragment_container, bVar, "PHONE_INPUT");
                K.mo4040d();
            } else if (gVar2.f49648n) {
                FragmentManager supportFragmentManager2 = firstTimeLoginActivity.getSupportFragmentManager();
                C0909a K2 = C0017h.m54K(supportFragmentManager2, supportFragmentManager2);
                int i2 = C19523a.f49621t;
                Bundle bundle2 = new Bundle();
                C19523a aVar = new C19523a();
                aVar.setArguments(bundle2);
                K2.mo4111f(R.id.fragment_container, aVar, "PERSONAL_DETAILS");
                K2.mo4040d();
            } else {
                firstTimeLoginActivity.mo45245y2(true);
            }
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C19535f fVar = (C19535f) cVar;
            FirstTimeLoginActivity firstTimeLoginActivity = FirstTimeLoginActivity.this;
            int i = FirstTimeLoginActivity.f38456p0;
            firstTimeLoginActivity.setContentView((int) R.layout.activity_loading_failed);
            ((AlertMessageView) firstTimeLoginActivity.findViewById(R.id.error_view)).setNegativeButtonClickListener(new C4051q(firstTimeLoginActivity, 16));
            return true;
        }
    }

    /* renamed from: A2 */
    public final void mo45243A2() {
        mo45256C2();
        ((ProgressBar) findViewById(R.id.loading_view)).setVisibility(0);
    }

    /* renamed from: B2 */
    public final void mo45255B2(String str) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
        int i = C19530e.f49634v;
        Bundle b = C25541a.m63872b("phoneNumber", str);
        C19530e eVar = new C19530e();
        eVar.setArguments(b);
        K.mo4111f(R.id.fragment_container, eVar, "PHONE_VERIFICATION");
        K.mo4110c("PHONE_VERIFICATION");
        K.mo4040d();
    }

    /* renamed from: C2 */
    public final void mo45256C2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        List<Fragment> H = supportFragmentManager.mo3930H();
        if (!C13717b.m34258e(H)) {
            C0909a aVar = null;
            for (Fragment next : H) {
                if (next instanceof C15682c) {
                    if (aVar == null) {
                        aVar = new C0909a(supportFragmentManager);
                    }
                    aVar.mo4050p(next);
                }
            }
            if (aVar != null) {
                aVar.mo4040d();
            }
        }
    }

    /* renamed from: D2 */
    public final void mo45257D2() {
        mo45256C2();
        ((ProgressBar) findViewById(R.id.loading_view)).setVisibility(0);
        C19535f fVar = new C19535f(mo44548x1());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2("missingSteps", fVar, requestOptions, this.f38457n0);
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        if ("complete_email_verification_dialog_fragment_tag".equals(str)) {
            mo45245y2(true);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.first_time_login_activity);
        mo45257D2();
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("USER_CONTEXT");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo45245y2(boolean z) {
        super.mo45245y2(true);
        UserAccountManager userAccountManager = (UserAccountManager) getApplicationContext().getSystemService("user_account_manager_service");
        if (userAccountManager != null) {
            Tasks.call(MoovitExecutors.f37327IO, new C20784a(userAccountManager, EnumSet.of(UserAccountDataProvider.ProviderType.PROFILE)));
        }
    }
}

package com.moovit.app;

import android.app.TaskStackBuilder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.FragmentManager;
import c10.C13740a;
import c10.C13743d;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.general.settings.privacy.C14894a;
import com.moovit.app.general.settings.privacy.PrivacyUpdateActivity;
import com.moovit.app.intro.FirstTimeUseActivity;
import com.moovit.app.intro.FirstTimeUseActivityImpl;
import com.moovit.app.intro.UserCreationFailureActivity;
import com.moovit.app.intro.onboarding.OnboardingActivity;
import com.moovit.app.intro.onboarding.OnboardingLoginActivity;
import com.moovit.app.intro.onboarding.UserOnboardingActivity;
import com.moovit.app.metro.ChangeMetroFragment;
import com.moovit.app.surveys.SurveyManager;
import com.moovit.app.surveys.data.Survey;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.accesstoken.AccessTokenManager;
import com.moovit.appdata.UserContextLoader;
import com.moovit.dynamiclink.DynamicLinkActivity;
import com.moovit.env.EnvironmentProvider;
import com.moovit.request.MetroIdMismatchException;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import f00.C16919g;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p172m9.C5720b;
import p269u2.C6677a;
import p543hq.C17474b;
import p646lz.C18299a;
import p716oy.C18860a;
import p824tp.C19731i;
import p828tt.C19762c;
import p977zz.C20977y0;
import w40.C25761d;

public abstract class MoovitAppActivity extends MoovitActivity {

    /* renamed from: com.moovit.app.MoovitAppActivity$a */
    public static /* synthetic */ class C14714a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37416a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.app.intro.onboarding.OnboardingType[] r0 = com.moovit.app.intro.onboarding.OnboardingType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37416a = r0
                com.moovit.app.intro.onboarding.OnboardingType r1 = com.moovit.app.intro.onboarding.OnboardingType.PAGES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37416a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.intro.onboarding.OnboardingType r1 = com.moovit.app.intro.onboarding.OnboardingType.OPT_OUT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37416a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.intro.onboarding.OnboardingType r1 = com.moovit.app.intro.onboarding.OnboardingType.OPT_IN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37416a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.intro.onboarding.OnboardingType r1 = com.moovit.app.intro.onboarding.OnboardingType.NONE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.MoovitAppActivity.C14714a.<clinit>():void");
        }
    }

    /* renamed from: B1 */
    public final void mo44503B1(MetroIdMismatchException metroIdMismatchException) {
        if (!isFinishing()) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.mo3923A("change_metro_fragment") == null) {
                ChangeMetroFragment.m38572V1(metroIdMismatchException.mo49151a(), metroIdMismatchException.mo49152b()).show(supportFragmentManager, "change_metro_fragment");
            }
        }
    }

    /* renamed from: M1 */
    public void mo44510M1() {
        boolean z;
        boolean z2;
        boolean z3;
        Intent intent;
        boolean z4;
        boolean z5;
        boolean z6;
        SparseArray<String> sparseArray = EnvironmentProvider.f41473b;
        if (!isFinishing()) {
            C16919g.C16924e eVar = FirstTimeUseActivity.f38440l0;
            SharedPreferences sharedPreferences = getSharedPreferences("intro", 0);
            if (FirstTimeUseActivity.f38440l0.mo19759a(sharedPreferences).intValue() < 2 || (!UserContextLoader.m40004l(this) && !C7925b.m18027o(System.currentTimeMillis(), FirstTimeUseActivity.f38441m0.mo19759a(sharedPreferences).longValue()))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                z6 = false;
            } else {
                Intent intent2 = new Intent(this, FirstTimeUseActivityImpl.class);
                intent2.addFlags(335609856);
                intent2.putExtra("activityToLaunchWhenFinished", mo44546w1());
                startActivity(intent2);
                z6 = true;
            }
            if (z6) {
                finishAffinity();
                overridePendingTransition(0, 0);
            }
        }
        if (C18860a.m45884a().f48031s && !isFinishing()) {
            if (C14894a.m37560b(this).mo45017g()) {
                z4 = false;
            } else {
                Intent intent3 = new Intent(this, PrivacyUpdateActivity.class);
                intent3.putExtra("activityToLaunchWhenFinished", mo44546w1());
                TaskStackBuilder.create(this).addNextIntent(intent3).startActivities();
                z4 = true;
            }
            if (z4) {
                finish();
                overridePendingTransition(0, 0);
            }
        }
        if (!isFinishing() && !getIntent().getBooleanExtra("SUPPRESS_ONBOARDING", false)) {
            if (C19762c.f50246a.mo19759a(getSharedPreferences("on_boarding", 0)).intValue() < 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int i = C14714a.f37416a[C18860a.m45884a().f48026n.ordinal()];
                if (i == 1) {
                    Intent w1 = mo44546w1();
                    intent = new Intent(this, OnboardingActivity.class);
                    intent.putExtra("activity_to_start_on_finish", w1);
                } else if (i == 2 || i == 3) {
                    Intent w12 = mo44546w1();
                    intent = new Intent(this, UserOnboardingActivity.class);
                    intent.putExtra("activity_to_start_on_finish", w12);
                }
                startActivity(intent);
                finish();
                overridePendingTransition(0, 0);
            }
        }
        if (C18860a.m45884a().f48020h && !isFinishing() && !C25761d.m64299a().mo83590e()) {
            if (C19762c.f50247b.mo19759a(getSharedPreferences("on_boarding", 0)).intValue() < 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Intent w13 = mo44546w1();
                Intent intent4 = new Intent(this, OnboardingLoginActivity.class);
                intent4.putExtra("activity_to_start_on_finish", w13);
                startActivity(intent4);
                finish();
                overridePendingTransition(0, 0);
            }
        }
        if (C19731i.m47197a(this).f50171a.f50150a.isInstance(this) && !isFinishing()) {
            C13743d dVar = C13743d.f33820d;
            C13740a aVar = dVar.f33822b.get();
            if (aVar != null) {
                AtomicReference<Boolean> atomicReference = dVar.f33823c;
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = Boolean.FALSE;
                while (true) {
                    if (!atomicReference.compareAndSet(bool, bool2)) {
                        if (atomicReference.get() != bool) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                C6677a aVar2 = C19731i.m47197a(this).f50173c;
                AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.APPS_FLYER;
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.DEEP_LINK_INSTALL_IMPRESSION);
                aVar3.mo49938f(AnalyticsAttributeKey.URI, aVar.f33814b);
                aVar3.mo49941i(AnalyticsAttributeKey.IS_DEFERRED, aVar.f33813a);
                aVar3.mo49941i(AnalyticsAttributeKey.IS_BLOCKED, !z);
                aVar3.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this));
                C17474b[] bVarArr = {aVar3.mo49933a()};
                aVar2.getClass();
                C6677a.m15759j(this, analyticsFlowKey, true, bVarArr);
                if (z) {
                    int i2 = DynamicLinkActivity.f41472y;
                    startActivity(new Intent(this, DynamicLinkActivity.class));
                    finish();
                    overridePendingTransition(0, 0);
                }
            }
        }
    }

    /* renamed from: O1 */
    public void mo19442O1(Object obj, String str) {
        if (isFinishing() || (obj instanceof C18299a.C18302c)) {
            return;
        }
        if ("USER_CONTEXT".equals(str)) {
            Intent w1 = mo44546w1();
            Intent intent = new Intent(this, UserCreationFailureActivity.class);
            intent.putExtra("activity_to_start_on_success", w1);
            startActivity(intent);
            finish();
        } else if ("CARPOOL_SUPPORT_VALIDATOR".equals(str)) {
            if (!C20977y0.m49122a(this)) {
                C20977y0.m49124c(this);
            }
            setContentView((int) R.layout.carpool_support_loader_failure_view);
        } else if ("RIDE_SHARING_SUPPORT_VALIDATOR".equals(str) || "RIDE_SHARING_EVENTS_SUPPORT_VALIDATOR".equals(str)) {
            if (!C20977y0.m49122a(this)) {
                C20977y0.m49124c(this);
            }
            setContentView((int) R.layout.ride_sharing_support_loader_failure_view);
        } else if ("TOD_SUPPORT_VALIDATOR".equals(str)) {
            if (!C20977y0.m49122a(this)) {
                C20977y0.m49124c(this);
            }
            setContentView((int) R.layout.tod_support_loader_failure_view);
        } else if ("MOT_SUPPORT_VALIDATOR".equals(str)) {
            if (!C20977y0.m49122a(this)) {
                C20977y0.m49124c(this);
            }
            setContentView((int) R.layout.mot_support_loader_failure_view);
        } else if ("TRIP_PLAN_SUPPORT_VALIDATOR".equals(str)) {
            if (!C20977y0.m49122a(this)) {
                C20977y0.m49124c(this);
            }
            setContentView((int) R.layout.trip_plan_support_loader_failure_view);
        } else {
            super.mo19442O1(obj, str);
        }
    }

    /* renamed from: R1 */
    public final void mo44511R1(Bundle bundle) {
        super.mo44511R1(bundle);
        if (bundle != null) {
            Intent intent = getIntent();
            if (((Survey) intent.getParcelableExtra("extra_survey")) != null) {
                intent.removeExtra("extra_survey");
            }
        }
    }

    /* renamed from: e2 */
    public void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        Intent intent = getIntent();
        Survey survey = (Survey) intent.getParcelableExtra("extra_survey");
        if (survey != null) {
            intent.removeExtra("extra_survey");
        }
        if (survey != null) {
            SurveyManager d = SurveyManager.m39375d(this);
            d.getClass();
            d.mo45977h();
            d.f39829h.mo50474b();
            survey.mo46007f(this);
        }
    }

    public final Object getSystemService(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1765958018:
                if (str.equals("latest_itinerary_controller_service")) {
                    c = 0;
                    break;
                }
                break;
            case -1572266541:
                if (str.equals("user_campaigns_manager_service")) {
                    c = 1;
                    break;
                }
                break;
            case -1564410169:
                if (str.equals("user_favorites_manager_service")) {
                    c = 2;
                    break;
                }
                break;
            case -1532992099:
                if (str.equals("user_account_manager_service")) {
                    c = 3;
                    break;
                }
                break;
            case -461264955:
                if (str.equals("accessibility_configuration")) {
                    c = 4;
                    break;
                }
                break;
            case 540721455:
                if (str.equals("taxi_providers_manager")) {
                    c = 5;
                    break;
                }
                break;
            case 741994535:
                if (str.equals("history_controller")) {
                    c = 6;
                    break;
                }
                break;
            case 902938968:
                if (str.equals("user_notifications_manager_service")) {
                    c = 7;
                    break;
                }
                break;
            case 925516427:
                if (str.equals("ui_configuration")) {
                    c = 8;
                    break;
                }
                break;
            case 1392349506:
                if (str.equals("access_token_manager_service")) {
                    c = 9;
                    break;
                }
                break;
            case 1791290649:
                if (str.equals("user_profile_manager_service")) {
                    c = 10;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return mo44537r1("LATEST_ITINERARY_CONTROLLER");
            case 1:
                return ((UserAccountManager) mo44537r1("USER_ACCOUNT")).mo46572c();
            case 2:
                return ((UserAccountManager) mo44537r1("USER_ACCOUNT")).mo46573d();
            case 3:
                return mo44537r1("USER_ACCOUNT");
            case 4:
                return mo44537r1("ACCESSIBILITY_CONFIGURATION");
            case 5:
                return mo44537r1("TAXI_PROVIDERS_MANAGER");
            case 6:
                return mo44537r1("HISTORY");
            case 7:
                return ((UserAccountManager) mo44537r1("USER_ACCOUNT")).mo46574e();
            case 8:
                return mo44537r1("UI_CONFIGURATION");
            case 9:
                return AccessTokenManager.m39875b(this);
            case 10:
                return ((UserAccountManager) mo44537r1("USER_ACCOUNT")).mo46575f();
            default:
                return super.getSystemService(str);
        }
    }

    /* renamed from: r2 */
    public void mo19769r2() {
        if (!C19731i.m47197a(this).f50171a.f50150a.isInstance(this)) {
            super.mo19769r2();
        }
    }

    /* renamed from: s1 */
    public Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("UI_CONFIGURATION");
        return s1;
    }
}

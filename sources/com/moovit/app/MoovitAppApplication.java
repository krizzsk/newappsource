package com.moovit.app;

import a00.C13382a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.SparseArray;
import androidx.appcompat.app.C0252j;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1047z;
import com.appboy.Constants;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.metrics.Trace;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.general.settings.privacy.C14894a;
import com.moovit.app.general.settings.privacy.PrivacyUpdateActivity;
import com.moovit.app.intro.FirstTimeUseActivityImpl;
import com.moovit.app.intro.onboarding.OnboardingActivity;
import com.moovit.app.intro.onboarding.OnboardingLoginActivity;
import com.moovit.app.intro.onboarding.UserOnboardingActivity;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.app.mot.purchase.MotQrCodeScanActivity;
import com.moovit.app.mot.welcome.MotAccountCreationWelcomeActivity;
import com.moovit.app.navigation.checkin.Checkin;
import com.moovit.app.navigation.itinerary.ItineraryNavigable;
import com.moovit.app.surveys.SurveyManager;
import com.moovit.app.taxi.providers.C15445a;
import com.moovit.app.tod.TodRidesProvider;
import com.moovit.app.useraccount.manager.C15595a;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.accesstoken.AccessTokenManager;
import com.moovit.appdata.UserContextLoader;
import com.moovit.image.C16019d;
import com.moovit.location.C16202a;
import com.moovit.maintenance.MaintenanceManager;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.NavigationService;
import com.moovit.network.model.ServerId;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.fare.PurchaseTicketConfirmedActivity;
import com.moovit.ticketing.purchase.fare.PurchaseTicketsConfirmedActivity;
import com.moovit.web.WebViewActivity;
import f00.C16918f;
import f00.C16919g;
import f10.C16930a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import l30.C5577i;
import m80.C12887v;
import p054d0.C4268a1;
import p130j2.C5367a;
import p241s0.C6307g;
import p258t4.C6587a;
import p269u2.C6677a;
import p374av.C13537a;
import p389bl.C13641g;
import p394br.C13654a;
import p394br.C13655b;
import p394br.C13656c;
import p394br.C13658d;
import p394br.C13662h;
import p394br.C13663i;
import p394br.C13667k;
import p394br.C13670l;
import p394br.C13673n;
import p424cr.C16475b;
import p472er.C16863e;
import p503fy.C17127b;
import p521gs.C17225a;
import p528gz.C17269d;
import p532hf.C17427b;
import p543hq.C17474b;
import p567iq.C17634a;
import p567iq.C17635b;
import p570iu.C17652a;
import p572iw.C17675k;
import p589jq.C17912d;
import p626lf.C18200a;
import p642lv.C18280a;
import p643lw.C18281a;
import p646lz.C18299a;
import p664mu.C18443f;
import p664mu.C18454l;
import p665mv.C18473g;
import p665mv.C18474h;
import p711ot.C18828a;
import p716oy.C18860a;
import p734ps.C18976d;
import p80.C12993c;
import p810sz.C19617r;
import p824tp.C19722a0;
import p824tp.C19728f;
import p825tq.C19749a;
import p828tt.C19766g;
import p856ux.C20005a;
import p872vp.C20194a;
import p874vr.C20199a;
import p875vs.C20225d;
import p877vu.C20231a;
import p880vx.C20244b;
import p898wr.C20399a;
import p898wr.C20400b;
import p904wx.C20426a;
import p906wz.C20431c;
import p927xw.C20633b;
import p927xw.C20650q;
import p968zq.C20885c;
import p977zz.C20930c;
import p977zz.C20943i;
import q00.C19047a;
import w40.C25761d;
import w70.C13210a;
import w70.C13216f;
import w70.C13217g;
import x20.C20449c;
import y60.C20709e;
import y90.C13272f;

@SuppressLint({"Registered"})
public class MoovitAppApplication extends MoovitApplication<C20399a, C20400b, C17635b> {
    /* renamed from: x */
    public static MoovitAppApplication m37038x() {
        return (MoovitAppApplication) MoovitAppApplication.class.cast(MoovitApplication.f37317k);
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
                return mo44557i("LATEST_ITINERARY_CONTROLLER");
            case 1:
                return ((UserAccountManager) mo44557i("USER_ACCOUNT")).mo46572c();
            case 2:
                UserAccountManager userAccountManager = (UserAccountManager) mo44557i("USER_ACCOUNT");
                if (userAccountManager != null) {
                    return userAccountManager.mo46573d();
                }
                return null;
            case 3:
                return mo44557i("USER_ACCOUNT");
            case 4:
                return mo44557i("ACCESSIBILITY_CONFIGURATION");
            case 5:
                return mo44557i("TAXI_PROVIDERS_MANAGER");
            case 6:
                return mo44557i("HISTORY");
            case 7:
                return ((UserAccountManager) mo44557i("USER_ACCOUNT")).mo46574e();
            case 8:
                return mo44557i("UI_CONFIGURATION");
            case 9:
                return AccessTokenManager.m39875b(this);
            case 10:
                UserAccountManager userAccountManager2 = (UserAccountManager) mo44557i("USER_ACCOUNT");
                if (userAccountManager2 != null) {
                    return userAccountManager2.mo46575f();
                }
                return null;
            default:
                return super.getSystemService(str);
        }
    }

    /* renamed from: h */
    public final C17635b mo44556h() {
        return new C17635b(this);
    }

    /* renamed from: o */
    public final void mo44562o(C19047a aVar) {
        super.mo44562o(aVar);
        MobileAdsManager h = MobileAdsManager.m37073h();
        SharedPreferences i = h.mo44708i();
        boolean z = !Boolean.TRUE.equals(aVar.mo51505b(C20199a.f51261W0));
        C16919g.C16920a aVar2 = MobileAdsManager.f37458w;
        if (z != aVar2.mo19759a(i).booleanValue()) {
            aVar2.mo49545d(i, Boolean.valueOf(z));
            if (C14894a.m37560b(h.f37461c).mo45015e() == null) {
                h.mo44712n("configuration_change", 0, true);
            }
        }
        if (this.f37319c) {
            this.f37321e.mo50697i("STOP_MAP_ITEMS", (C18299a.C18300a) null);
        }
    }

    public final void onApplicationStart() {
        super.onApplicationStart();
        if (!C13382a.m33671g(getApplicationContext())) {
            C17635b.m43779f(this).f50172b.mo42913b(new C20194a(getApplicationContext()), false);
        }
        boolean e = C17127b.m43096b(getApplicationContext()).mo49720e();
        C6677a aVar = C17635b.m43779f(this).f50173c;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.BADGE;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.RED_BADGE_EXIST);
        aVar2.mo49935c(AnalyticsAttributeKey.RED_BADGE_COUNT, e ? 1 : 0);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(this, analyticsFlowKey, false, bVarArr);
    }

    /* renamed from: p */
    public final void mo44568p() {
        C19617r.C19618a<Navigable> aVar;
        C18200a aVar2 = C17427b.f44885g;
        Trace d = Trace.m36075d("onCreateApp");
        d.start();
        super.mo44568p();
        if (!C18860a.m45884a().f48022j && C0252j.f737b != 1) {
            C0252j.f737b = 1;
            synchronized (C0252j.f739d) {
                Iterator<WeakReference<C0252j>> it = C0252j.f738c.iterator();
                while (true) {
                    C6307g.C6308a aVar3 = (C6307g.C6308a) it;
                    if (!aVar3.hasNext()) {
                        break;
                    }
                    C0252j jVar = (C0252j) ((WeakReference) aVar3.next()).get();
                    if (jVar != null) {
                        jVar.mo868d();
                    }
                }
            }
        }
        C20431c.f51756n = new C6587a();
        C20431c.f51757o = new C18280a(this);
        C16019d.f41714i.set(new C18828a(this));
        C16930a.f43941a.set(new C17225a());
        C16202a.get(this).setDefaultIncludeBackgroundPermission(!C20943i.m49051d(30));
        MaintenanceManager.m41335a(new C17652a());
        Class<Checkin> cls = Checkin.class;
        Checkin.C15185b bVar = Checkin.f39129s;
        Checkin.C15186c cVar = Checkin.f39130t;
        C19617r.C19618a<Navigable> aVar4 = NavigationService.f15071s;
        synchronized (NavigationService.class) {
            aVar = NavigationService.f15071s;
            aVar.mo51969a(1, cls, bVar, cVar);
        }
        Class<ItineraryNavigable> cls2 = ItineraryNavigable.class;
        ItineraryNavigable.C15190c cVar2 = ItineraryNavigable.f39145u;
        ItineraryNavigable.C15191d dVar = ItineraryNavigable.f39146v;
        synchronized (NavigationService.class) {
            aVar.mo51969a(2, cls2, cVar2, dVar);
        }
        synchronized (C20885c.class) {
            if (C20885c.f52624c == null) {
                C20885c.f52624c = new C20885c(this);
                C20885c.f52624c.mo52989a();
                C20885c.f52624c.mo52991c(this);
            }
        }
        C16475b.m41968a(this).mo49294c();
        C1047z.f3987j.f3993g.mo4224a(SurveyManager.m39375d(this));
        if (UserContextLoader.m40004l(this)) {
            MoovitExecutors.MAIN_THREAD.execute(new C4268a1(this, 10));
        }
        C16919g.C16928i iVar = C25761d.f64266c;
        synchronized (C25761d.class) {
            if (C25761d.f64270g == null) {
                C25761d.f64270g = new C25761d(this);
            }
        }
        TodRidesProvider todRidesProvider = TodRidesProvider.f40031h;
        synchronized (TodRidesProvider.class) {
            if (TodRidesProvider.f40031h == null) {
                TodRidesProvider.f40031h = new TodRidesProvider(this);
            }
        }
        C12887v.m32671h(this);
        C18443f.m45300f(this);
        C20449c.m48067a(this);
        C5577i.m13788e(this);
        C20709e.m48683c(this, C18860a.m45884a().f48024l);
        MobileAdsManager.m37074k(this);
        C19749a.m47203a(this);
        registerActivityLifecycleCallbacks(new C13537a(this));
        C17269d a = C17269d.m43283a();
        a.mo49812b(FirstTimeUseActivityImpl.class);
        a.mo49812b(OnboardingActivity.class);
        a.mo49812b(UserOnboardingActivity.class);
        a.mo49812b(OnboardingLoginActivity.class);
        a.mo49812b(WebViewActivity.class);
        a.mo49812b(PurchaseTicketActivity.class);
        a.mo49812b(PurchaseTicketsConfirmedActivity.class);
        a.mo49812b(PurchaseTicketConfirmedActivity.class);
        a.mo49812b(PaymentRegistrationActivity.class);
        a.mo49812b(MotAccountCreationWelcomeActivity.class);
        a.mo49812b(MotQrCodeScanActivity.class);
        a.mo49812b(MotQrCodeActivationActivity.class);
        a.mo49812b(MotQrCodeViewerActivity.class);
        a.mo49812b(PrivacyUpdateActivity.class);
        d.stop();
    }

    /* renamed from: q */
    public final void mo44569q() {
        boolean z;
        boolean z2;
        super.mo44569q();
        String d = C20930c.m49022d(this);
        int i = 0;
        if (d == null || !d.endsWith(":profiler")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String d2 = C20930c.m49022d(this);
            if (d2 == null || !d2.endsWith(":profiler")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                new C13210a();
                try {
                    C16918f<String> fVar = C13217g.f32784b;
                    SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("moovit_sdk_versions", 0);
                    C16919g.C16924e eVar = C13210a.f32782a;
                    int intValue = eVar.mo19759a(sharedPreferences).intValue();
                    if (intValue != 429) {
                        if (intValue == -1) {
                            eVar.mo49545d(sharedPreferences, 429);
                        } else {
                            SparseArray<SparseArray<C13216f>> b = C13210a.m33294b();
                            int[] a = C13210a.m33293a(b, intValue);
                            if (a != null) {
                                ProfilerLog.m41879c(this).mo49244b(Constants.APPBOY_PUSH_CONTENT_KEY, "Upgraders path from version " + intValue + " to version " + 429 + ": " + Arrays.toString(a));
                                int length = a.length;
                                while (i < length) {
                                    int i2 = a[i];
                                    C13216f fVar2 = (C13216f) b.get(intValue).get(i2);
                                    if (fVar2 != null) {
                                        ProfilerLog.m41879c(this).mo49244b(Constants.APPBOY_PUSH_CONTENT_KEY, "Executing upgrader: " + fVar2 + " (" + intValue + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + i2 + ")");
                                        try {
                                            fVar2.mo40086a(this);
                                            C13210a.f32782a.mo49545d(sharedPreferences, Integer.valueOf(i2));
                                            i++;
                                            intValue = i2;
                                        } catch (Exception e) {
                                            ProfilerLog.m41879c(this).mo49244b(Constants.APPBOY_PUSH_CONTENT_KEY, "failed to complete the SDK upgrade");
                                            ProfilerLog.m41879c(this).mo49243a(Constants.APPBOY_PUSH_CONTENT_KEY, e);
                                        }
                                    } else {
                                        throw new IllegalStateException("No upgrader from version " + intValue + " to version " + i2);
                                    }
                                }
                                new C13217g(this).mo40088a(true);
                            } else {
                                throw new IllegalStateException("No chain of upgraders from version " + intValue + " to version " + 429);
                            }
                        }
                    }
                } catch (Exception e2) {
                    ProfilerLog.m41879c(this).mo49244b(Constants.APPBOY_PUSH_CONTENT_KEY, "failed to complete the SDK upgrade");
                    ProfilerLog.m41879c(this).mo49243a(Constants.APPBOY_PUSH_CONTENT_KEY, e2);
                }
            }
            Thread.setDefaultUncaughtExceptionHandler(new C17634a());
        }
    }

    /* renamed from: r */
    public final void mo44570r(C19728f fVar) {
        super.mo44570r(fVar);
        if (this.f37319c) {
            C18299a aVar = this.f37321e;
            if (C20930c.m49024f(this)) {
                aVar.mo50697i("USER_ACCOUNT", (C18299a.C18300a) null);
                aVar.mo50697i("HISTORY", (C18299a.C18300a) null);
                aVar.mo50697i("TRANSPORTATION_MAPS", (C18299a.C18300a) null);
                aVar.mo50697i("WEB_PAGES", (C18299a.C18300a) null);
                aVar.mo50697i("SEARCH_HISTORY_CLEANER", (C18299a.C18300a) null);
                aVar.mo50697i("TRIP_PLANNER_CONFIGURATION", (C18299a.C18300a) null);
                aVar.mo50697i("SUPPORTED_METRO_LANGUAGES", (C18299a.C18300a) null);
                aVar.mo50697i("TAXI_PROVIDERS_MANAGER", (C18299a.C18300a) null);
                aVar.mo50697i("ACCESSIBILITY_CONFIGURATION", (C18299a.C18300a) null);
            }
        }
    }

    /* renamed from: s */
    public final void mo44571s(Intent intent, Activity activity, C18299a aVar) {
        super.mo44571s(intent, activity, aVar);
        C16475b a = C16475b.m41968a(this);
        a.mo49294c();
        a.mo49293b();
    }

    /* renamed from: t */
    public final void mo44572t(C19722a0 a0Var) {
        super.mo44572t(a0Var);
        if (this.f37319c) {
            C18299a aVar = this.f37321e;
            if (C20930c.m49024f(this)) {
                aVar.mo50697i("CONFIGURATION", (C18299a.C18300a) null);
            }
            aVar.mo50697i("GTFS_CONFIGURATION", (C18299a.C18300a) null);
            aVar.mo50697i("REMOTE_IMAGES", (C18299a.C18300a) null);
            if (!C25761d.m64299a().mo83590e()) {
                new C20426a(this).mo49820a();
            }
            new C18976d(this).mo49820a();
        }
    }

    /* renamed from: u */
    public final void mo44573u(C18299a aVar) {
        super.mo44573u(aVar);
        aVar.mo50703o("TICKETING_CONFIGURATION", new C12993c());
        aVar.mo50703o("UPGRADER", new C20005a());
        aVar.mo50703o("USER_CONTEXT", new C20244b());
        aVar.mo50703o("NAVIGATION_STATE_STORE", new C20231a());
        aVar.mo50703o("ACKNOWLEDGEMENTS", new C13654a());
        aVar.mo50703o("HISTORY", new C13656c());
        aVar.mo50703o("USER_ACCOUNT", new C15595a());
        aVar.mo50703o("AVATARS", new C13655b());
        aVar.mo50703o("WEB_PAGES", new C20225d());
        aVar.mo50703o("TRANSPORTATION_MAPS", new C13670l());
        aVar.mo50703o("TAXI_PROVIDERS_MANAGER", new C15445a());
        aVar.mo50703o("STOP_MAP_ITEMS", new C13663i());
        aVar.mo50703o("SYNCABLE_TRANSIT_LINE_GROUP_IDS", new C13667k());
        aVar.mo50703o("CARPOOL_SUPPORT_VALIDATOR", new C16863e());
        aVar.mo50703o("SEARCH_HISTORY_CLEANER", new C13662h());
        aVar.mo50703o("SURVEY_CONFIGURATION", new C18281a());
        aVar.mo50703o("UI_CONFIGURATION", new C13673n());
        aVar.mo50703o("RIDE_SHARING_SUPPORT_VALIDATOR", new C18474h());
        aVar.mo50703o("RIDE_SHARING_EVENTS_SUPPORT_VALIDATOR", new C18473g());
        aVar.mo50703o("TOD_SUPPORT_VALIDATOR", new C20650q());
        aVar.mo50703o("TOD_LOTTIE_PRE_FETCHER", new C20633b());
        aVar.mo50703o("MOT_SUPPORT_VALIDATOR", new C18454l());
        aVar.mo50703o("TRIP_PLAN_SUPPORT_VALIDATOR", new C17675k());
        aVar.mo50703o("ACCESSIBILITY_CONFIGURATION", new C17912d());
        aVar.mo50703o("ONBOARDING_CONFIGURATION", new C19766g());
        aVar.mo50703o("LATEST_ITINERARY_CONTROLLER", new C13658d());
    }

    /* renamed from: y */
    public final void mo44686y(ServerId serverId, FragmentActivity fragmentActivity, Intent intent) {
        C5367a.m13473a(this).mo21147c(new Intent("com.moovit.app.action.update_parts"));
        C13272f fVar = ((C19722a0) getSystemService("user_context")).f50160a;
        C13272f fVar2 = new C13272f(fVar.f32925a, fVar.f32926b, serverId, fVar.f32928d, fVar.f32929e);
        ((UserContextLoader) this.f37321e.mo50693f("USER_CONTEXT")).getClass();
        C13641g.m34136y(this, "user.dat", fVar2, C13272f.f32924f);
        FirebaseAnalytics.getInstance(this).mo43248b("metro_id", serverId.mo19751c());
        this.f37321e.f46669h.shutdownNow();
        C18299a aVar = new C18299a((Context) this);
        mo44573u(aVar);
        aVar.mo50704p();
        synchronized (aVar) {
            aVar.f46672k.add(this);
        }
        this.f37321e = aVar;
        this.f37322f.f33873g.evictAll();
        this.f37324h = null;
        if (intent == null) {
            intent = new Intent(this, mo44558j().f50171a.f50150a);
        }
        mo44574v(fragmentActivity, intent);
        C16475b a = C16475b.m41968a(this);
        a.mo49294c();
        a.mo49293b();
        SurveyManager.m39375d(this).mo45977h();
        MobileAdsManager.m37073h().mo44712n("metro_change", 0, true);
    }
}

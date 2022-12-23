package com.moovit.app.ads;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.SystemClock;
import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.C1047z;
import androidx.lifecycle.Lifecycle;
import androidx.work.C1388b;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import ce0.C21100e;
import com.facebook.appevents.C2342l;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.awareness.Awareness;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.awareness.fence.FenceUpdateRequest;
import com.google.android.gms.awareness.fence.TimeFence;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.remoteconfig.internal.C14535a;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.app.general.settings.privacy.C14894a;
import com.moovit.app.useraccount.manager.profile.UserAdsTargetingData;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.SafeRunnable;
import com.moovit.gcm.GcmListenerService;
import com.moovit.util.SafeBroadcastReceiver;
import f00.C16919g;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p001a0.C0016g;
import p009a8.C0114n;
import p054d0.C4291k0;
import p081f3.C4648b;
import p081f3.C4658i;
import p081f3.C4665k;
import p092g3.C4763k;
import p102h0.C5021e;
import p130j2.C5367a;
import p205p3.C6038c;
import p218q3.C6166b;
import p304x.C7103t;
import p394br.C13672m;
import p484ff.C16984m;
import p527gy.C17259d;
import p527gy.C17261e;
import p532hf.C17427b;
import p613kq.C18114a;
import p626lf.C18200a;
import p862vf.C20118b;
import p886wf.C20300e;
import p897wq.C20392a;
import p897wq.C20393b;
import p897wq.C20394c;
import p897wq.C20395d;
import p897wq.C20396e;
import p897wq.C20397f;
import p897wq.C20398g;
import p921xq.C20554a;
import p921xq.C20556b;
import p921xq.C20557c;
import p921xq.C20558d;
import p977zz.C20926a;
import p977zz.C20927a0;
import p977zz.C20930c;
import p977zz.C20944i0;
import p977zz.C20956o0;
import p977zz.C20964s0;
import p977zz.C20975x0;
import w40.C25761d;

public class MobileAdsManager implements C1031o {

    /* renamed from: p */
    public static final EnumSet<AdSource> f37451p;

    /* renamed from: q */
    public static final List<AdSource> f37452q;

    /* renamed from: r */
    public static final Uri f37453r = Uri.parse("moovit://ad_loaded");

    /* renamed from: s */
    public static final long f37454s = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: t */
    public static final C16919g.C16928i f37455t = new C16919g.C16928i("last_session_id_pref", (String) null);

    /* renamed from: u */
    public static final C16919g.C16925f f37456u = new C16919g.C16925f("last_ad_session_time_pref", 0);

    /* renamed from: v */
    public static final C16919g.C16925f f37457v = new C16919g.C16925f("last_seen_ad_time_pref", 0);

    /* renamed from: w */
    public static final C16919g.C16920a f37458w = new C16919g.C16920a("default_personalized_ads_config", false);

    /* renamed from: x */
    public static volatile MobileAdsManager f37459x;

    /* renamed from: b */
    public final C14728e f37460b = new C14728e();

    /* renamed from: c */
    public final MoovitApplication<?, ?, ?> f37461c;

    /* renamed from: d */
    public final boolean f37462d;

    /* renamed from: e */
    public final AtomicBoolean f37463e;

    /* renamed from: f */
    public final ConditionVariable f37464f;

    /* renamed from: g */
    public final HashMap f37465g;

    /* renamed from: h */
    public CancellationTokenSource f37466h;

    /* renamed from: i */
    public final HashMap f37467i;

    /* renamed from: j */
    public final C14735c f37468j;

    /* renamed from: k */
    public final AtomicLong f37469k;

    /* renamed from: l */
    public final AtomicReference<C20554a<?>> f37470l;

    /* renamed from: m */
    public final List<C20395d> f37471m;

    /* renamed from: n */
    public final AtomicReference<UserAdsTargetingData> f37472n;

    /* renamed from: o */
    public final AtomicReference<C20944i0<String, String>> f37473o;

    /* renamed from: com.moovit.app.ads.MobileAdsManager$a */
    public class C14724a extends SafeBroadcastReceiver {
        /* renamed from: a */
        public final void mo24574a(Context context, Intent intent) {
            MobileAdsManager.f37459x.mo44712n("payment_account_changes", 0, true);
        }
    }

    /* renamed from: com.moovit.app.ads.MobileAdsManager$b */
    public class C14725b extends SafeBroadcastReceiver {
        /* renamed from: a */
        public final void mo24574a(Context context, Intent intent) {
            MobileAdsManager.f37459x.mo44712n("push", 0, false);
        }
    }

    /* renamed from: com.moovit.app.ads.MobileAdsManager$c */
    public class C14726c extends SafeBroadcastReceiver {
        /* renamed from: a */
        public final void mo24574a(Context context, Intent intent) {
            C17259d e;
            MobileAdsManager mobileAdsManager = MobileAdsManager.f37459x;
            C17261e eVar = (C17261e) mobileAdsManager.f37461c.getSystemService("user_profile_manager_service");
            if (eVar != null && (e = eVar.mo49805e()) != null) {
                UserAdsTargetingData userAdsTargetingData = e.f44617p;
                if (!C20975x0.m49118e(mobileAdsManager.f37472n.get(), userAdsTargetingData)) {
                    mobileAdsManager.f37472n.set(userAdsTargetingData);
                    MoovitExecutors.SINGLE.execute(new C7103t(9, mobileAdsManager, userAdsTargetingData));
                    mobileAdsManager.mo44712n("targeting_data_changes", 0, true);
                }
            }
        }
    }

    /* renamed from: com.moovit.app.ads.MobileAdsManager$d */
    public class C14727d extends BroadcastReceiver {
        public final void onReceive(Context context, Intent intent) {
            if ((intent.getIntExtra("mask", 0) & 10) != 0) {
                MobileAdsManager.f37459x.mo44720u();
                MobileAdsManager.f37459x.mo44712n("ads_settings_change", 0, true);
            }
        }
    }

    /* renamed from: com.moovit.app.ads.MobileAdsManager$e */
    public class C14728e extends C20926a {
        public C14728e() {
        }

        public final void onActivityStarted(Activity activity) {
            if (activity instanceof MoovitActivity) {
                MobileAdsManager.this.mo44716q((MoovitActivity) activity, AdSource.TRANSITION_INTERSTITIAL);
            }
        }
    }

    /* renamed from: com.moovit.app.ads.MobileAdsManager$f */
    public static class C14729f implements SafeRunnable {

        /* renamed from: b */
        public final String f37475b;

        public C14729f(String str) {
            this.f37475b = str;
        }

        public final /* synthetic */ void onError(Throwable th) {
            C20956o0.m49073a(this, th);
        }

        public final /* synthetic */ void run() {
            C20956o0.m49074b(this);
        }

        public final void safeRun() {
            MobileAdsManager h = MobileAdsManager.m37073h();
            for (AdSource adSource : AdSource.values()) {
                if (adSource.loader != null) {
                    if (this.f37475b.equals(MobileAdsManager.m37072g(adSource))) {
                        C5367a.m13473a(h.f37461c).mo21147c(new Intent("com.moovit.ads.action.ad_loaded", MobileAdsManager.f37453r.buildUpon().appendPath(adSource.name()).build()));
                    }
                }
            }
        }
    }

    /* renamed from: com.moovit.app.ads.MobileAdsManager$g */
    public static class C14730g implements SafeRunnable, C20554a.C20555a<Void, Boolean> {

        /* renamed from: b */
        public final MoovitApplication<?, ?, ?> f37476b;

        /* renamed from: c */
        public final Collection<C20554a<?>> f37477c;

        public C14730g(MoovitApplication<?, ?, ?> moovitApplication, Collection<C20554a<?>> collection) {
            C21100e.m49373x(moovitApplication, "application");
            this.f37476b = moovitApplication;
            C21100e.m49373x(collection, "adRefs");
            this.f37477c = collection;
        }

        /* renamed from: a */
        public final Boolean mo44726a(MoovitApplication moovitApplication, C20556b bVar, Object obj) {
            Void voidR = (Void) obj;
            return Boolean.TRUE;
        }

        /* renamed from: b */
        public final Boolean mo44727b(C20558d dVar, Object obj) {
            Void voidR = (Void) obj;
            ((C14766z) dVar.f51994f).f37583a.destroy();
            return Boolean.TRUE;
        }

        /* renamed from: c */
        public final Boolean mo44728c(MoovitApplication moovitApplication, C20557c cVar, Object obj) {
            Void voidR = (Void) obj;
            return Boolean.TRUE;
        }

        public final /* synthetic */ void onError(Throwable th) {
            C20956o0.m49073a(this, th);
        }

        public final /* synthetic */ void run() {
            C20956o0.m49074b(this);
        }

        public final void safeRun() {
            for (C20554a<?> a : this.f37477c) {
                a.mo52755a(this.f37476b, this, null);
            }
        }
    }

    static {
        AdSource adSource = AdSource.OPEN_APP_INTERSTITIAL;
        AdSource adSource2 = AdSource.APP_OPEN;
        f37451p = EnumSet.of(adSource, adSource2);
        f37452q = Arrays.asList(new AdSource[]{adSource, adSource2});
    }

    public MobileAdsManager(MoovitApplication<?, ?, ?> moovitApplication) {
        AdSource[] values = AdSource.values();
        C21100e.m49373x(moovitApplication, "application");
        this.f37461c = moovitApplication;
        this.f37462d = C20930c.m49021c(moovitApplication).containsKey("com.google.android.gms.ads.APPLICATION_ID");
        this.f37463e = new AtomicBoolean(false);
        this.f37464f = new ConditionVariable(false);
        this.f37465g = new HashMap(values.length);
        this.f37466h = new CancellationTokenSource();
        this.f37467i = new HashMap(values.length);
        this.f37468j = new C14735c();
        this.f37469k = new AtomicLong(-1);
        this.f37470l = new AtomicReference<>((Object) null);
        this.f37471m = Collections.unmodifiableList(Arrays.asList(new C20395d[]{new C20394c(), new C20392a(), new C20397f(), new C20393b(), new C20398g(), new C20396e()}));
        this.f37472n = new AtomicReference<>((Object) null);
        this.f37473o = new AtomicReference<>(C14748l.m37128a());
    }

    /* renamed from: g */
    public static String m37072g(AdSource adSource) {
        if (C20118b.m47697e().mo52357d("is_ads_free_version")) {
            return "";
        }
        String f = C20118b.m47697e().mo52358f(adSource.adUnitIdKey);
        if ("na".equals(f)) {
            return "";
        }
        return f;
    }

    /* renamed from: h */
    public static MobileAdsManager m37073h() {
        MobileAdsManager mobileAdsManager = f37459x;
        if (mobileAdsManager != null) {
            return mobileAdsManager;
        }
        throw new IllegalStateException("you must call initialize first");
    }

    /* renamed from: k */
    public static synchronized void m37074k(MoovitApplication<?, ?, ?> moovitApplication) {
        synchronized (MobileAdsManager.class) {
            C18200a aVar = C17427b.f44885g;
            Trace d = Trace.m36075d("ads_initialize");
            d.start();
            if (f37459x != null) {
                d.stop();
                return;
            }
            f37459x = new MobileAdsManager(moovitApplication);
            C1047z.f3987j.f3993g.mo4224a(f37459x);
            C14724a aVar2 = new C14724a();
            String[] strArr = {"com.moovit.payment.account.action.created", "com.moovit.payment.account.action.deleted"};
            C16919g.C16928i iVar = C25761d.f64266c;
            IntentFilter intentFilter = new IntentFilter();
            for (int i = 0; i < 2; i++) {
                intentFilter.addAction(strArr[i]);
            }
            C5367a.m13473a(moovitApplication).mo21146b(aVar2, intentFilter);
            GcmListenerService.m40504g(new C14725b(), moovitApplication, (String) null);
            C17261e.m43265f(moovitApplication, new C14726c(), Collections.singletonList("com.moovit.useraccount.manager.user_profile_update_success"));
            f37459x.mo44720u();
            C5367a.m13473a(moovitApplication).mo21146b(new C14727d(), new IntentFilter("com.moovit.app.general.settings.privacy.action.updated"));
            d.stop();
        }
    }

    /* renamed from: o */
    public static void m37075o(Context context, BroadcastReceiver broadcastReceiver) {
        C5367a.m13473a(context).mo21146b(broadcastReceiver, new IntentFilter("com.moovit.ads.action.updated"));
    }

    /* renamed from: a */
    public final AdManagerAdRequest mo44705a(C14741h hVar) {
        Map<String, List<String>> map;
        C14894a b = C14894a.m37560b(this.f37461c);
        Boolean e = b.mo45015e();
        if (e == null) {
            e = f37458w.mo19759a(mo44708i());
        }
        boolean booleanValue = e.booleanValue();
        boolean f = b.mo45016f();
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        UserAdsTargetingData userAdsTargetingData = this.f37472n.get();
        if (userAdsTargetingData != null) {
            map = userAdsTargetingData.f40606b;
        } else {
            map = null;
        }
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                builder.addCustomTargeting((String) next.getKey(), (List<String>) (List) next.getValue());
            }
        }
        for (C20395d b2 : this.f37471m) {
            b2.mo52610b(builder, hVar, booleanValue, f);
        }
        return builder.build();
    }

    /* renamed from: c */
    public final Task<String> mo44706c(AdSource adSource) {
        return mo44719t(false).continueWith(MoovitExecutors.COMPUTATION, new C13672m(0, this, adSource));
    }

    /* renamed from: d */
    public final C20944i0<String, String> mo44707d() {
        return this.f37473o.get();
    }

    /* renamed from: i */
    public final SharedPreferences mo44708i() {
        return this.f37461c.getSharedPreferences("mobile_ads_manager", 0);
    }

    /* renamed from: j */
    public final String mo44709j() {
        return f37455t.mo19759a(mo44708i());
    }

    /* renamed from: l */
    public final boolean mo44710l() {
        if (this.f37470l.get() != null) {
            return true;
        }
        long j = this.f37469k.get();
        if (j != -1 && SystemClock.elapsedRealtime() - j <= f37454s) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo44711m() {
        SharedPreferences i = mo44708i();
        C20118b e = C20118b.m47697e();
        if (e.mo52357d("is_background_pre_fetch_ads_supported")) {
            MoovitApplication<?, ?, ?> moovitApplication = this.f37461c;
            TimeUnit timeUnit = TimeUnit.HOURS;
            C4648b.C4649a aVar = new C4648b.C4649a();
            aVar.f15887c = NetworkType.CONNECTED;
            C1388b bVar = new C1388b(C0016g.m37u("adInitiator", "background_sync"));
            C1388b.m3716c(bVar);
            C4763k.m12079g(moovitApplication).mo20276f("mobile_ads_update", ExistingPeriodicWorkPolicy.KEEP, (C4665k) ((C4665k.C4666a) ((C4665k.C4666a) ((C4665k.C4666a) ((C4665k.C4666a) new C4665k.C4666a(MobileAdsWorker.class, 4, timeUnit, 1, timeUnit).mo20189a("mobile_ads")).mo20189a("mobile_ads_update")).mo20192f(new C4648b(aVar))).mo20194h(bVar)).mo20190b());
        } else {
            C4763k g = C4763k.m12079g(this.f37461c);
            g.getClass();
            ((C6166b) g.f16073d).mo22153a(new C6038c(g, "mobile_ads_update", true));
        }
        if (e.mo52357d("is_fence_pre_fetch_ads_supported")) {
            MoovitApplication<?, ?, ?> moovitApplication2 = this.f37461c;
            if (!MobileAdsFenceReceiver.f37450a.mo19759a(i).booleanValue()) {
                TimeZone timeZone = TimeZone.getDefault();
                TimeUnit timeUnit2 = TimeUnit.HOURS;
                Task<Void> updateFences = Awareness.getFenceClient((Context) moovitApplication2).updateFences(new FenceUpdateRequest.Builder().addFence("ads_time_fence", AwarenessFence.m63926or(TimeFence.inDailyInterval(timeZone, timeUnit2.toMillis(4), timeUnit2.toMillis(5)), TimeFence.inDailyInterval(timeZone, timeUnit2.toMillis(15), timeUnit2.toMillis(16))), C20927a0.m49008c(moovitApplication2, MobileAdsFenceReceiver.class, (String) null, (Bundle) null, (Uri) null)).build());
                ExecutorService executorService = MoovitExecutors.COMPUTATION;
                updateFences.addOnSuccessListener((Executor) executorService, (OnSuccessListener<? super Void>) new C14753n(i, 0)).addOnCompleteListener((Executor) executorService, new C14754o());
                return;
            }
            return;
        }
        MoovitApplication<?, ?, ?> moovitApplication3 = this.f37461c;
        C16919g.C16920a aVar2 = MobileAdsFenceReceiver.f37450a;
        Task<Void> updateFences2 = Awareness.getFenceClient((Context) moovitApplication3).updateFences(new FenceUpdateRequest.Builder().removeFence("ads_time_fence").build());
        ExecutorService executorService2 = MoovitExecutors.COMPUTATION;
        updateFences2.addOnSuccessListener((Executor) executorService2, (OnSuccessListener<? super Void>) new C18114a(i, 2)).addOnCompleteListener((Executor) executorService2, new C14755p());
    }

    /* renamed from: n */
    public final void mo44712n(String str, long j, boolean z) {
        MoovitApplication<?, ?, ?> moovitApplication = this.f37461c;
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.CONNECTED;
        HashMap u = C0016g.m37u("adInitiator", str);
        u.put("reloadAds", Boolean.valueOf(z));
        C1388b bVar = new C1388b(u);
        C1388b.m3716c(bVar);
        C4658i.C4659a aVar2 = (C4658i.C4659a) ((C4658i.C4659a) ((C4658i.C4659a) ((C4658i.C4659a) new C4658i.C4659a(MobileAdsWorker.class).mo20189a("mobile_ads")).mo20189a("mobile_ads_one_time_update")).mo20192f(new C4648b(aVar))).mo20194h(bVar);
        if (j > 0) {
            aVar2.mo20193g(j, TimeUnit.SECONDS);
        }
        C4763k.m12079g(moovitApplication).mo20186b("mobile_ads_one_time_update", ExistingWorkPolicy.KEEP, (C4658i) aVar2.mo20190b());
    }

    @C1045x(Lifecycle.Event.ON_START)
    public void onApplicationStart() {
        mo44718s("app_start", false);
        Activity activity = this.f37461c.f37318b.f50163b;
        if (activity instanceof MoovitActivity) {
            MoovitActivity moovitActivity = (MoovitActivity) activity;
            for (AdSource next : f37452q) {
                if (!C20964s0.m49090h(m37072g(next))) {
                    mo44716q(moovitActivity, next);
                    if (mo44710l()) {
                        break;
                    }
                }
            }
        }
        this.f37461c.registerActivityLifecycleCallbacks(this.f37460b);
    }

    @C1045x(Lifecycle.Event.ON_STOP)
    public void onApplicationStop() {
        this.f37461c.unregisterActivityLifecycleCallbacks(this.f37460b);
        mo44712n("app_stop", 30, false);
    }

    /* renamed from: p */
    public final void mo44715p(C20554a<?> aVar) {
        if (aVar != null) {
            f37457v.mo49545d(mo44708i(), Long.valueOf(System.currentTimeMillis()));
        }
        C20554a andSet = this.f37470l.getAndSet(aVar);
        if (andSet != null && andSet.equals(this.f37467i.get(andSet.f51992d))) {
            this.f37467i.remove(andSet.f51992d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44716q(com.moovit.MoovitActivity r18, com.moovit.app.ads.AdSource r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = 1
            ce0.C21100e.m49369v(r2)
            f00.g$b r3 = p969zr.C20886a.f52629h
            T r3 = r3.f43936b
            com.moovit.app.ads.GoogleAdsMode r3 = (com.moovit.app.ads.GoogleAdsMode) r3
            com.moovit.app.ads.GoogleAdsMode r4 = com.moovit.app.ads.GoogleAdsMode.NO_SHOW
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0017
            return
        L_0x0017:
            android.content.SharedPreferences r3 = r17.mo44708i()
            vf.b r4 = p862vf.C20118b.m47697e()
            wf.g r4 = r4.f51045g
            java.lang.String r5 = "min_time_interval_between_ads_in_seconds"
            wf.i r4 = r4.mo52470e(r5)
            long r5 = java.lang.System.currentTimeMillis()
            int r7 = r4.f51490b
            r8 = 2
            if (r7 != r8) goto L_0x003b
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r9 = r4.mo52360b()
            long r9 = r7.toMillis(r9)
            goto L_0x0043
        L_0x003b:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            r9 = 10
            long r9 = r4.toMillis(r9)
        L_0x0043:
            f00.g$f r4 = f37456u
            java.lang.Long r7 = r4.mo19759a(r3)
            long r11 = r7.longValue()
            long r11 = r5 - r11
            r7 = 0
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x0056
            r11 = 1
            goto L_0x0057
        L_0x0056:
            r11 = 0
        L_0x0057:
            java.lang.String r12 = m37072g(r19)
            java.util.HashSet r13 = com.moovit.app.ads.C14748l.f37536a
            java.lang.Class r14 = r18.getClass()
            boolean r13 = r13.contains(r14)
            if (r13 != 0) goto L_0x006f
            boolean r13 = com.moovit.app.ads.AdsFrequencyCappingExperiment.shouldBlockAdOn(r18)
            if (r13 != 0) goto L_0x006f
            r13 = 1
            goto L_0x0070
        L_0x006f:
            r13 = 0
        L_0x0070:
            if (r13 != 0) goto L_0x0075
            java.lang.String r1 = "block_list"
            goto L_0x00af
        L_0x0075:
            com.moovit.app.general.settings.privacy.a r13 = com.moovit.app.general.settings.privacy.C14894a.m37560b(r18)
            boolean r13 = r13.mo45017g()
            if (r13 != 0) goto L_0x0082
            java.lang.String r1 = "privacy_policy"
            goto L_0x00af
        L_0x0082:
            com.moovit.MoovitApplication<?, ?, ?> r13 = r0.f37461c
            long r13 = p977zz.C20930c.m49023e(r13)
            boolean r13 = com.moovit.app.ads.C14748l.m37130c(r1, r13)
            if (r13 != 0) goto L_0x0091
            java.lang.String r1 = "user_age"
            goto L_0x00af
        L_0x0091:
            boolean r13 = p977zz.C20964s0.m49090h(r12)
            if (r13 == 0) goto L_0x009a
            java.lang.String r1 = "no_ad"
            goto L_0x00af
        L_0x009a:
            boolean r13 = r17.mo44710l()
            if (r13 == 0) goto L_0x00a3
            java.lang.String r1 = "showing_ad"
            goto L_0x00af
        L_0x00a3:
            com.moovit.MoovitApplication<?, ?, ?> r13 = r0.f37461c
            boolean r1 = com.moovit.app.ads.C14748l.m37129b(r13, r1)
            if (r1 != 0) goto L_0x00ae
            java.lang.String r1 = "accessibility"
            goto L_0x00af
        L_0x00ae:
            r1 = 0
        L_0x00af:
            if (r1 == 0) goto L_0x0102
            if (r11 == 0) goto L_0x0101
            com.moovit.MoovitApplication<?, ?, ?> r3 = r0.f37461c
            com.moovit.app.ads.MobileAdsManager r4 = m37073h()
            zz.i0 r4 = r4.mo44707d()
            tp.i r5 = r3.mo44558j()
            u2.a r5 = r5.f50173c
            com.moovit.analytics.AnalyticsFlowKey r6 = com.moovit.analytics.AnalyticsFlowKey.ADS
            hq.b[] r2 = new p543hq.C17474b[r2]
            hq.b$a r8 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r9 = com.moovit.analytics.AnalyticsEventKey.AD
            r8.<init>(r9)
            com.moovit.analytics.AnalyticsAttributeKey r9 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r10 = "ad_session_rejection"
            r8.mo49939g(r9, r10)
            com.moovit.analytics.AnalyticsAttributeKey r9 = com.moovit.analytics.AnalyticsAttributeKey.REASON
            r8.mo49939g(r9, r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID
            com.tranzmate.moovit.protocol.kinesis.MVAnalyticsFlowKey r9 = p172m9.C5720b.m14057h(r18)
            r8.mo49944l(r1, r9)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME
            F r9 = r4.f52692a
            java.lang.String r9 = (java.lang.String) r9
            r8.mo49945m(r1, r9)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE
            S r4 = r4.f52693b
            java.lang.String r4 = (java.lang.String) r4
            r8.mo49945m(r1, r4)
            hq.b r1 = r8.mo49933a()
            r2[r7] = r1
            r5.getClass()
            p269u2.C6677a.m15759j(r3, r6, r7, r2)
        L_0x0101:
            return
        L_0x0102:
            if (r11 == 0) goto L_0x0188
            com.moovit.MoovitApplication<?, ?, ?> r1 = r0.f37461c
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            android.content.SharedPreferences$Editor r13 = r3.edit()
            f00.g$i r14 = f37455t
            r14.mo19760c(r13, r11)
            java.lang.Long r14 = java.lang.Long.valueOf(r5)
            r4.mo19760c(r13, r14)
            r13.apply()
            com.moovit.app.ads.MobileAdsManager r4 = m37073h()
            zz.i0 r4 = r4.mo44707d()
            tp.i r13 = r1.mo44558j()
            u2.a r13 = r13.f50173c
            com.moovit.analytics.AnalyticsFlowKey r14 = com.moovit.analytics.AnalyticsFlowKey.ADS
            hq.b[] r15 = new p543hq.C17474b[r2]
            hq.b$a r8 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.AD
            r8.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r7 = "ad_session"
            r8.mo49939g(r2, r7)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.SESSION_ID
            r8.mo49939g(r2, r11)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TIME
            r8.mo49936d(r2, r9)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID
            r16 = r12
            com.tranzmate.moovit.protocol.kinesis.MVAnalyticsFlowKey r12 = p172m9.C5720b.m14057h(r18)
            r8.mo49944l(r2, r12)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME
            F r12 = r4.f52692a
            java.lang.String r12 = (java.lang.String) r12
            r8.mo49945m(r2, r12)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE
            S r4 = r4.f52693b
            java.lang.String r4 = (java.lang.String) r4
            r8.mo49945m(r2, r4)
            hq.b r2 = r8.mo49933a()
            r4 = 0
            r15[r4] = r2
            r13.getClass()
            p269u2.C6677a.m15759j(r1, r14, r4, r15)
            android.os.Bundle r2 = new android.os.Bundle
            r4 = 1
            r2.<init>(r4)
            java.lang.String r4 = "item_id"
            r2.putString(r4, r11)
            com.google.firebase.analytics.FirebaseAnalytics r1 = com.google.firebase.analytics.FirebaseAnalytics.getInstance(r1)
            r1.mo43247a(r2, r7)
            goto L_0x018a
        L_0x0188:
            r16 = r12
        L_0x018a:
            f00.g$f r1 = f37457v
            java.lang.Long r1 = r1.mo19759a(r3)
            long r1 = r1.longValue()
            long r5 = r5 - r1
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x019b
            r4 = 1
            goto L_0x019c
        L_0x019b:
            r4 = 0
        L_0x019c:
            if (r4 == 0) goto L_0x019f
            return
        L_0x019f:
            java.util.HashMap r1 = r0.f37467i
            r2 = r16
            java.lang.Object r1 = r1.get(r2)
            xq.a r1 = (p921xq.C20554a) r1
            if (r1 != 0) goto L_0x01ac
            goto L_0x01de
        L_0x01ac:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r1.f51995g
            long r4 = r4 - r6
            java.lang.String r2 = r1.mo52757c()
            if (r2 != 0) goto L_0x01bc
            long r6 = p921xq.C20554a.f51987h
            goto L_0x01d8
        L_0x01bc:
            vf.b r6 = p862vf.C20118b.m47697e()
            wf.g r6 = r6.f51045g
            wf.i r2 = r6.mo52470e(r2)
            int r6 = r2.f51490b
            r7 = 2
            if (r6 != r7) goto L_0x01d6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r7 = r2.mo52360b()
            long r6 = r6.toMillis(r7)
            goto L_0x01d8
        L_0x01d6:
            long r6 = p921xq.C20554a.f51987h
        L_0x01d8:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x01de
            r4 = 1
            goto L_0x01df
        L_0x01de:
            r4 = 0
        L_0x01df:
            if (r4 == 0) goto L_0x01f5
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            com.moovit.MoovitApplication<?, ?, ?> r4 = r0.f37461c
            com.moovit.app.ads.c r5 = r0.f37468j
            r6 = r18
            java.lang.Object r4 = r1.mo52755a(r4, r5, r6)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x01f7
            r4 = 1
            goto L_0x01f8
        L_0x01f5:
            r6 = r18
        L_0x01f7:
            r4 = 0
        L_0x01f8:
            if (r4 == 0) goto L_0x0285
            java.util.concurrent.atomic.AtomicLong r2 = r0.f37469k
            long r4 = android.os.SystemClock.elapsedRealtime()
            r2.set(r4)
            com.moovit.MoovitApplication<?, ?, ?> r2 = r0.f37461c
            com.moovit.app.ads.MobileAdsManager r4 = m37073h()
            zz.i0 r4 = r4.mo44707d()
            tp.i r5 = r2.mo44558j()
            u2.a r5 = r5.f50173c
            com.moovit.analytics.AnalyticsFlowKey r7 = com.moovit.analytics.AnalyticsFlowKey.ADS
            r8 = 1
            hq.b[] r8 = new p543hq.C17474b[r8]
            hq.b$a r9 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r10 = com.moovit.analytics.AnalyticsEventKey.AD
            r9.<init>(r10)
            com.moovit.analytics.AnalyticsAttributeKey r10 = com.moovit.analytics.AnalyticsAttributeKey.IS_TEST_DEVICE
            boolean r11 = r1.f51989a
            r9.mo49941i(r10, r11)
            com.moovit.analytics.AnalyticsAttributeKey r10 = com.moovit.analytics.AnalyticsAttributeKey.SOURCE
            java.lang.String r11 = r1.f51990b
            r9.mo49939g(r10, r11)
            com.moovit.analytics.AnalyticsAttributeKey r10 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r11 = "ad_show_requested"
            r9.mo49939g(r10, r11)
            com.moovit.analytics.AnalyticsAttributeKey r10 = com.moovit.analytics.AnalyticsAttributeKey.AD_ID
            java.lang.String r11 = r1.f51992d
            r9.mo49939g(r10, r11)
            com.moovit.analytics.AnalyticsAttributeKey r10 = com.moovit.analytics.AnalyticsAttributeKey.AD_ID_KEY
            java.lang.String r11 = r1.f51991c
            r9.mo49939g(r10, r11)
            com.moovit.analytics.AnalyticsAttributeKey r10 = com.moovit.analytics.AnalyticsAttributeKey.ID
            java.lang.String r11 = r1.f51993e
            r9.mo49939g(r10, r11)
            com.moovit.analytics.AnalyticsAttributeKey r10 = com.moovit.analytics.AnalyticsAttributeKey.PROVIDER
            java.lang.String r1 = r1.mo52756b()
            r9.mo49945m(r10, r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID
            com.tranzmate.moovit.protocol.kinesis.MVAnalyticsFlowKey r6 = p172m9.C5720b.m14057h(r18)
            r9.mo49944l(r1, r6)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.SESSION_ID
            f00.g$i r6 = f37455t
            java.lang.String r3 = r6.mo19759a(r3)
            r9.mo49945m(r1, r3)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME
            F r3 = r4.f52692a
            java.lang.String r3 = (java.lang.String) r3
            r9.mo49945m(r1, r3)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE
            S r3 = r4.f52693b
            java.lang.String r3 = (java.lang.String) r3
            r9.mo49945m(r1, r3)
            hq.b r1 = r9.mo49933a()
            r3 = 0
            r8[r3] = r1
            r5.getClass()
            p269u2.C6677a.m15759j(r2, r7, r3, r8)
        L_0x0285:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ads.MobileAdsManager.mo44716q(com.moovit.MoovitActivity, com.moovit.app.ads.AdSource):void");
    }

    /* renamed from: r */
    public final Task mo44717r(String str, Set set, boolean z) {
        if (!this.f37462d) {
            return Tasks.forResult(null);
        }
        if (!UserContextLoader.m40004l(this.f37461c)) {
            return Tasks.forResult(null);
        }
        return mo44719t(z).continueWithTask(MoovitExecutors.COMPUTATION, new C5021e(this, 1)).continueWithTask(MoovitExecutors.MAIN_THREAD, new C14756q(this, str, set));
    }

    /* renamed from: s */
    public final Task<Void> mo44718s(String str, boolean z) {
        EnumSet<AdSource> enumSet;
        this.f37461c.getClass();
        if (MoovitApplication.m36934n()) {
            enumSet = EnumSet.complementOf(f37451p);
        } else {
            enumSet = f37451p;
        }
        return mo44717r(str, enumSet, z);
    }

    /* renamed from: t */
    public final Task<Boolean> mo44719t(boolean z) {
        Task<Boolean> task;
        if (z) {
            C14535a aVar = C20118b.m47697e().f51044f;
            task = aVar.f36691f.mo52465c().continueWithTask(aVar.f36688c, new C20300e(aVar, 0)).onSuccessTask(new C2342l(8)).onSuccessTask(MoovitExecutors.COMPUTATION, new C0114n(11));
        } else {
            task = C20118b.m47697e().mo52355b();
        }
        task.onSuccessTask(MoovitExecutors.COMPUTATION, new C4291k0(this, 6));
        task.addOnSuccessListener((Executor) MoovitExecutors.SINGLE, (OnSuccessListener<? super Boolean>) new C16984m(this, 3));
        return task;
    }

    /* renamed from: u */
    public final void mo44720u() {
        C14894a b = C14894a.m37560b(this.f37461c);
        Boolean e = b.mo45015e();
        if (e == null) {
            e = f37458w.mo19759a(mo44708i());
        }
        boolean booleanValue = e.booleanValue();
        boolean f = b.mo45016f();
        for (C20395d a : this.f37471m) {
            a.mo52609a(this.f37461c, booleanValue, f);
        }
    }
}

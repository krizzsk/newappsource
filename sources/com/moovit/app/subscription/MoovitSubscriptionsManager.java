package com.moovit.app.subscription;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import androidx.lifecycle.C1006f;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1043v;
import androidx.lifecycle.C1047z;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import ce0.C21100e;
import com.android.billingclient.api.C1941b;
import com.android.billingclient.api.C1943c;
import com.android.billingclient.api.C1945d;
import com.android.billingclient.api.C1949f;
import com.android.billingclient.api.C1954j;
import com.android.billingclient.api.Purchase;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.facebook.appevents.C2342l;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.ads.C14753n;
import com.moovit.app.subscription.model.PurchaseDetails;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import f00.C16919g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p028ba.C1512f;
import p028ba.C1513g;
import p054d0.C4303q;
import p102h0.C5021e;
import p130j2.C5367a;
import p145k5.C5488g;
import p244s3.C6444s;
import p269u2.C6677a;
import p304x.C7070l;
import p501fw.C17103b;
import p525gw.C17247b;
import p543hq.C17474b;
import p549hw.C17505c;
import p549hw.C17506d;
import p549hw.C17509g;
import p549hw.C17510h;
import p578jf.C17843u;
import p584jl.C17885a;
import p613kq.C18114a;
import p646lz.C18299a;
import p669mz.C18490f;
import p824tp.C19722a0;
import p977zz.C20944i0;
import p977zz.C20960q0;
import p977zz.C20961r;
import p977zz.C20963s;
import p977zz.C20964s0;

public class MoovitSubscriptionsManager implements C1006f, C1954j {

    /* renamed from: g */
    public static final HashSet f39757g;

    /* renamed from: h */
    public static final C16919g.C16929j f39758h = new C16919g.C16929j("subscribed_skus", Collections.emptySet());

    /* renamed from: i */
    public static volatile MoovitSubscriptionsManager f39759i;

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f39760b;

    /* renamed from: c */
    public volatile C1943c f39761c = null;

    /* renamed from: d */
    public final ConditionVariable f39762d = new ConditionVariable(false);

    /* renamed from: e */
    public final C1043v<C15361d> f39763e = new C1043v<>();

    /* renamed from: f */
    public final C18490f<C20961r<C15359b>> f39764f = new C18490f<>();

    /* renamed from: com.moovit.app.subscription.MoovitSubscriptionsManager$a */
    public class C15358a implements C1945d {
        public C15358a() {
        }
    }

    /* renamed from: com.moovit.app.subscription.MoovitSubscriptionsManager$b */
    public static class C15359b {

        /* renamed from: a */
        public final boolean f39766a;

        /* renamed from: b */
        public final C15361d f39767b;

        public C15359b(boolean z, C15361d dVar) {
            this.f39766a = z;
            this.f39767b = dVar;
        }
    }

    /* renamed from: com.moovit.app.subscription.MoovitSubscriptionsManager$c */
    public static class C15360c implements Callable<C15361d> {

        /* renamed from: b */
        public final MoovitApplication<?, ?, ?> f39768b;

        /* renamed from: c */
        public final List<PurchaseDetails> f39769c;

        public C15360c(MoovitApplication moovitApplication, List list) {
            this.f39768b = moovitApplication;
            this.f39769c = list;
        }

        public final Object call() throws Exception {
            return new C15361d(this.f39769c, ((C17510h) new C17509g(MoovitSubscriptionsManager.m39316d(this.f39768b), this.f39769c).mo52626J()).f45078m);
        }
    }

    /* renamed from: com.moovit.app.subscription.MoovitSubscriptionsManager$d */
    public static class C15361d {

        /* renamed from: a */
        public final int f39770a;

        /* renamed from: b */
        public final List<PurchaseDetails> f39771b;

        /* renamed from: c */
        public final List<C17247b> f39772c;

        public C15361d(List<PurchaseDetails> list, List<C17247b> list2) {
            int i;
            if (!list2.isEmpty()) {
                i = 3;
            } else if (!list.isEmpty()) {
                i = 2;
            } else {
                i = 1;
            }
            this.f39770a = i;
            this.f39771b = Collections.unmodifiableList(list);
            this.f39772c = Collections.unmodifiableList(list2);
        }
    }

    /* renamed from: com.moovit.app.subscription.MoovitSubscriptionsManager$e */
    public static class C15362e implements Callable<C15361d> {

        /* renamed from: b */
        public final MoovitApplication<?, ?, ?> f39773b;

        /* renamed from: c */
        public final C1941b f39774c;

        /* renamed from: d */
        public final Set<String> f39775d;

        public C15362e(MoovitApplication moovitApplication, C1941b bVar, Set set) {
            this.f39773b = moovitApplication;
            this.f39774c = bVar;
            C21100e.m49373x(set, "currentSkus");
            this.f39775d = Collections.unmodifiableSet(set);
        }

        public final Object call() throws Exception {
            if (!this.f39775d.isEmpty()) {
                return new C15361d(Collections.emptyList(), ((C17506d) new C17505c(MoovitSubscriptionsManager.m39316d(this.f39773b)).mo52626J()).f45074m);
            }
            C20960q0 q0Var = new C20960q0();
            this.f39774c.mo9560c(new C5021e(q0Var, 13));
            C20944i0 a = q0Var.mo53033a(TimeUnit.SECONDS.toMillis(5));
            if (!Boolean.TRUE.equals(a.f52692a)) {
                return new C15361d(Collections.emptyList(), Collections.emptyList());
            }
            ArrayList c = C13720d.m34273c((Iterable) a.f52693b, (C13722f) null, new C2342l(7));
            if (C13717b.m34258e(c)) {
                return new C15361d(c, Collections.emptyList());
            }
            return new C15361d(c, ((C17506d) new C17505c(MoovitSubscriptionsManager.m39316d(this.f39773b)).mo52626J()).f45074m);
        }
    }

    static {
        C17885a.m44456q(2, "expectedSize");
        HashSet hashSet = new HashSet(3);
        Collections.addAll(hashSet, new Integer[]{0, 3});
        f39757g = hashSet;
    }

    public MoovitSubscriptionsManager(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49373x(moovitApplication, "application");
        this.f39760b = moovitApplication;
    }

    /* renamed from: a */
    public static void m39314a(MoovitSubscriptionsManager moovitSubscriptionsManager, C15361d dVar) {
        String str;
        moovitSubscriptionsManager.getClass();
        HashSet hashSet = new HashSet(dVar.f39771b.size());
        for (PurchaseDetails purchaseDetails : dVar.f39771b) {
            hashSet.addAll(purchaseDetails.f39784b);
        }
        SharedPreferences sharedPreferences = moovitSubscriptionsManager.f39760b.getSharedPreferences("subscriptions_manager", 0);
        C16919g.C16929j jVar = f39758h;
        Set set = (Set) jVar.mo19759a(sharedPreferences);
        HashSet<O> g = C13720d.m34277g(dVar.f39772c, (C13722f) null, new C4303q(5));
        boolean z = !g.equals(set);
        C6677a aVar = moovitSubscriptionsManager.f39760b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = moovitSubscriptionsManager.f39760b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.APP;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.SUBSCRIPTION_RESULT);
        aVar2.mo49939g(AnalyticsAttributeKey.PUBLISHER, C13717b.m34269p(hashSet));
        aVar2.mo49939g(AnalyticsAttributeKey.STATE, C13717b.m34269p(set));
        aVar2.mo49939g(AnalyticsAttributeKey.SOURCE, C13717b.m34269p(g));
        aVar2.mo49941i(AnalyticsAttributeKey.STATUS, z);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, true, bVarArr);
        if (z) {
            jVar.mo49545d(sharedPreferences, g);
            MoovitApplication<?, ?, ?> moovitApplication2 = moovitSubscriptionsManager.f39760b;
            String r = C20964s0.m49100r(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, g);
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(moovitApplication2);
            instance.mo43248b("subscriptions", r);
            if (C13717b.m34258e(g)) {
                str = "false";
            } else {
                str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
            }
            instance.mo43248b("has_subscription", str);
            C5367a.m13473a(moovitSubscriptionsManager.f39760b).mo21147c(new Intent("com.moovit.subscriptions.action.updated"));
        }
    }

    /* renamed from: c */
    public static MoovitSubscriptionsManager m39315c(MoovitApplication<?, ?, ?> moovitApplication) {
        if (f39759i == null) {
            synchronized (MoovitSubscriptionsManager.class) {
                if (f39759i == null) {
                    f39759i = new MoovitSubscriptionsManager(moovitApplication);
                    C1047z.f3987j.f3993g.mo4224a(f39759i);
                }
            }
        }
        return f39759i;
    }

    /* renamed from: d */
    public static C13752e m39316d(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49355o();
        if (UserContextLoader.m40004l(moovitApplication)) {
            C13752e l = moovitApplication.mo44560l();
            if (l.f33853b != null) {
                return l;
            }
            C18299a aVar = moovitApplication.f37321e;
            C19722a0 a0Var = (C19722a0) aVar.mo50695h("USER_CONTEXT", false);
            if (a0Var != null) {
                return new C13752e(moovitApplication, a0Var, (AnalyticsFlowKey) null);
            }
            StringBuilder k = C13555b.m33972k("Failed to load user context: ");
            k.append(aVar.mo50694g("USER_CONTEXT"));
            throw new ApplicationBugException(k.toString());
        }
        throw new ApplicationBugException("Missing user context!");
    }

    /* renamed from: e */
    public final /* synthetic */ void mo3607e(C1033p pVar) {
    }

    /* renamed from: g */
    public final void mo45937g(C1949f fVar, List<Purchase> list) {
        int i = fVar.f6770a;
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C5488g(list, 3)).onSuccessTask(executorService, new C1512f(2, this, list)).onSuccessTask(executorService, new C1513g(fVar, 8)).addOnCompleteListener(new C20963s(this.f39764f));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: h */
    public final synchronized void mo45938h() {
        /*
            r3 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x003c }
            android.os.ConditionVariable r0 = r3.f39762d     // Catch:{ all -> 0x003e }
            r0.close()     // Catch:{ all -> 0x003e }
            com.android.billingclient.api.c r0 = r3.f39761c     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0014
            boolean r1 = r0.mo9565g()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0014
            r0.mo9563e()     // Catch:{ all -> 0x003e }
        L_0x0014:
            r0 = 0
            r3.f39761c = r0     // Catch:{ all -> 0x003e }
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            com.moovit.MoovitApplication<?, ?, ?> r0 = r3.f39760b     // Catch:{ all -> 0x003c }
            r1 = 1
            if (r0 == 0) goto L_0x0034
            com.android.billingclient.api.c r2 = new com.android.billingclient.api.c     // Catch:{ all -> 0x003c }
            r2.<init>(r1, r0, r3)     // Catch:{ all -> 0x003c }
            r3.f39761c = r2     // Catch:{ all -> 0x003c }
            boolean r0 = r2.mo9565g()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0032
            com.moovit.app.subscription.MoovitSubscriptionsManager$a r0 = new com.moovit.app.subscription.MoovitSubscriptionsManager$a     // Catch:{ all -> 0x003c }
            r0.<init>()     // Catch:{ all -> 0x003c }
            r2.mo9566h(r0)     // Catch:{ all -> 0x003c }
        L_0x0032:
            monitor-exit(r3)
            return
        L_0x0034:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "Please provide a valid Context."
            r0.<init>(r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            goto L_0x0041
        L_0x003e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0041:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.subscription.MoovitSubscriptionsManager.mo45938h():void");
    }

    /* renamed from: i */
    public final Task<C15361d> mo45939i(List<PurchaseDetails> list) {
        Task addOnSuccessListener = Tasks.call(MoovitExecutors.f37327IO, new C15360c(this.f39760b, list)).addOnSuccessListener((Executor) MoovitExecutors.COMPUTATION, new C18114a(this, 7));
        Executor executor = MoovitExecutors.MAIN_THREAD;
        C1043v<C15361d> vVar = this.f39763e;
        Objects.requireNonNull(vVar);
        return addOnSuccessListener.addOnSuccessListener(executor, new C6444s(vVar, 2));
    }

    public final /* synthetic */ void onDestroy(C1033p pVar) {
    }

    public final /* synthetic */ void onPause(C1033p pVar) {
    }

    public final /* synthetic */ void onResume(C1033p pVar) {
    }

    public final void onStart(C1033p pVar) {
        mo45938h();
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Task addOnSuccessListener = Tasks.call(executorService, new C17103b(this, 0)).onSuccessTask(executorService, new C7070l(this, 9)).addOnSuccessListener((Executor) executorService, new C14753n(this, 2));
        Executor executor = MoovitExecutors.MAIN_THREAD;
        C1043v<C15361d> vVar = this.f39763e;
        Objects.requireNonNull(vVar);
        addOnSuccessListener.addOnSuccessListener(executor, new C17843u(vVar, 4));
    }

    public final void onStop(C1033p pVar) {
        synchronized (this) {
            this.f39762d.close();
            C1943c cVar = this.f39761c;
            if (cVar != null && cVar.mo9565g()) {
                cVar.mo9563e();
            }
            this.f39761c = null;
        }
    }
}

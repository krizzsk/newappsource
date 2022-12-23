package com.moovit.app.ads;

import com.google.android.gms.tasks.Continuation;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.moovit.app.ads.q */
public final /* synthetic */ class C14756q implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ MobileAdsManager f37561b;

    /* renamed from: c */
    public final /* synthetic */ String f37562c;

    /* renamed from: d */
    public final /* synthetic */ Collection f37563d;

    public /* synthetic */ C14756q(MobileAdsManager mobileAdsManager, String str, Set set) {
        this.f37561b = mobileAdsManager;
        this.f37562c = str;
        this.f37563d = set;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object then(com.google.android.gms.tasks.Task r27) {
        /*
            r26 = this;
            r0 = r26
            com.moovit.app.ads.MobileAdsManager r1 = r0.f37561b
            java.lang.String r13 = r0.f37562c
            java.util.Collection r2 = r0.f37563d
            java.util.EnumSet<com.moovit.app.ads.AdSource> r3 = com.moovit.app.ads.MobileAdsManager.f37451p
            r1.getClass()
            boolean r3 = r27.isSuccessful()
            if (r3 == 0) goto L_0x001c
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Object r4 = r27.getResult()
            r3.equals(r4)
        L_0x001c:
            com.moovit.MoovitApplication<?, ?, ?> r3 = r1.f37461c
            long r14 = p977zz.C20930c.m49023e(r3)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r3 = r2.size()
            r11.<init>(r3)
            java.util.Iterator r16 = r2.iterator()
            r2 = r1
        L_0x0030:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x01fe
            java.lang.Object r3 = r16.next()
            com.moovit.app.ads.AdSource r3 = (com.moovit.app.ads.AdSource) r3
            uq.c<?, ?> r4 = r3.loader
            if (r4 != 0) goto L_0x0041
            goto L_0x005b
        L_0x0041:
            com.moovit.MoovitApplication<?, ?, ?> r4 = r2.f37461c
            boolean r4 = com.moovit.app.ads.C14748l.m37129b(r4, r3)
            if (r4 != 0) goto L_0x004a
            goto L_0x005b
        L_0x004a:
            boolean r4 = com.moovit.app.ads.C14748l.m37130c(r3, r14)
            if (r4 != 0) goto L_0x0051
            goto L_0x005b
        L_0x0051:
            java.lang.String r12 = com.moovit.app.ads.MobileAdsManager.m37072g(r3)
            boolean r4 = p977zz.C20964s0.m49090h(r12)
            if (r4 == 0) goto L_0x005e
        L_0x005b:
            r27 = r11
            goto L_0x00a7
        L_0x005e:
            java.util.HashMap r4 = r2.f37467i
            java.lang.Object r4 = r4.get(r12)
            xq.a r4 = (p921xq.C20554a) r4
            r9 = 1
            if (r4 != 0) goto L_0x006c
            r27 = r11
            goto L_0x00a2
        L_0x006c:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r7 = r4.f51995g
            long r5 = r5 - r7
            java.lang.String r4 = r4.mo52758d()
            if (r4 != 0) goto L_0x007e
            long r7 = p921xq.C20554a.f51988i
            r27 = r11
            goto L_0x009e
        L_0x007e:
            vf.b r7 = p862vf.C20118b.m47697e()
            wf.g r7 = r7.f51045g
            wf.i r4 = r7.mo52470e(r4)
            int r7 = r4.f51490b
            r8 = 2
            if (r7 != r8) goto L_0x009a
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r27 = r11
            long r10 = r4.mo52360b()
            long r7 = r7.toMillis(r10)
            goto L_0x009e
        L_0x009a:
            r27 = r11
            long r7 = p921xq.C20554a.f51988i
        L_0x009e:
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x00a4
        L_0x00a2:
            r4 = 1
            goto L_0x00a5
        L_0x00a4:
            r4 = 0
        L_0x00a5:
            if (r4 != 0) goto L_0x00aa
        L_0x00a7:
            r11 = r27
            goto L_0x0030
        L_0x00aa:
            java.lang.String r10 = r3.adUnitIdKey
            uq.c<?, ?> r11 = r3.loader
            java.util.HashMap r3 = r2.f37465g
            java.lang.Object r3 = r3.get(r12)
            com.google.android.gms.tasks.Task r3 = (com.google.android.gms.tasks.Task) r3
            if (r3 == 0) goto L_0x00b9
            goto L_0x00e0
        L_0x00b9:
            com.moovit.MoovitApplication<?, ?, ?> r3 = r2.f37461c
            com.moovit.location.a r3 = com.moovit.location.C16202a.get(r3)
            uz.g r3 = r3.getPermissionAwareHighAccuracyFrequentUpdates()
            android.location.Location r3 = r3.mo50014i()
            com.moovit.app.ads.h r4 = new com.moovit.app.ads.h
            r4.<init>()
            r4.mo44745a(r9, r3)
            com.google.android.gms.ads.admanager.AdManagerAdRequest r3 = r2.mo44705a(r4)
            if (r3 != 0) goto L_0x00ea
            com.moovit.commons.utils.ApplicationBugException r3 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r4 = "Did your device configured as test device?"
            r3.<init>((java.lang.String) r4)
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forException(r3)
        L_0x00e0:
            r0 = r2
            r20 = r13
            r17 = r14
            r2 = r1
            r1 = r27
            goto L_0x01f0
        L_0x00ea:
            com.moovit.MoovitApplication<?, ?, ?> r8 = r2.f37461c
            com.google.android.gms.tasks.CancellationTokenSource r2 = r2.f37466h
            com.google.android.gms.tasks.CancellationToken r2 = r2.getToken()
            r11.getClass()
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r7 = r4.toString()
            boolean r6 = r3.isTestDevice(r8)
            com.moovit.app.ads.MobileAdsManager r4 = com.moovit.app.ads.MobileAdsManager.m37073h()
            java.lang.String r5 = r4.mo44709j()
            zz.i0 r4 = r4.mo44707d()
            tp.i r9 = r8.mo44558j()
            u2.a r9 = r9.f50173c
            com.moovit.analytics.AnalyticsFlowKey r0 = com.moovit.analytics.AnalyticsFlowKey.ADS
            r17 = r14
            r14 = 1
            hq.b[] r15 = new p543hq.C17474b[r14]
            hq.b$a r14 = new hq.b$a
            r19 = r1
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.AD
            r14.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.IS_TEST_DEVICE
            r14.mo49941i(r1, r6)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.SOURCE
            r14.mo49939g(r1, r13)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r20 = r13
            java.lang.String r13 = "ad_load_start"
            r14.mo49939g(r1, r13)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.AD_ID_KEY
            r14.mo49939g(r1, r10)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.AD_ID
            r14.mo49939g(r1, r12)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ID
            r14.mo49939g(r1, r7)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.SESSION_ID
            r14.mo49945m(r1, r5)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME
            F r5 = r4.f52692a
            java.lang.String r5 = (java.lang.String) r5
            r14.mo49945m(r1, r5)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE
            S r4 = r4.f52693b
            java.lang.String r4 = (java.lang.String) r4
            r14.mo49945m(r1, r4)
            hq.b r1 = r14.mo49933a()
            r13 = 0
            r15[r13] = r1
            r9.getClass()
            r1 = 1
            p269u2.C6677a.m15759j(r8, r0, r1, r15)
            hf.b r0 = p532hf.C17427b.m43467a()
            r0.getClass()
            java.lang.String r0 = "ad_load"
            com.google.firebase.perf.metrics.Trace r0 = com.google.firebase.perf.metrics.Trace.m36075d(r0)
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r5 = "isTestDevice"
            r0.putAttribute(r5, r4)
            java.lang.String r4 = "adUnitIdKey"
            r0.putAttribute(r4, r10)
            java.lang.String r4 = "addUnitId"
            r0.putAttribute(r4, r12)
            r0.start()
            long r14 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.tasks.Task r9 = r11.mo52270b(r8, r12, r3, r2)
            java.util.concurrent.ExecutorService r5 = com.moovit.MoovitExecutors.COMPUTATION
            uq.a r4 = new uq.a
            r2 = r4
            r3 = r11
            r1 = r4
            r4 = r6
            r13 = r5
            r5 = r20
            r21 = r6
            r6 = r10
            r22 = r7
            r7 = r12
            r23 = r8
            r8 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.tasks.Task r1 = r9.onSuccessTask(r13, r1)
            java.util.concurrent.Executor r13 = com.moovit.MoovitExecutors.MAIN_THREAD
            uq.b r9 = new uq.b
            r2 = r9
            r4 = r0
            r5 = r23
            r6 = r21
            r7 = r20
            r8 = r10
            r0 = r9
            r11 = 1
            r9 = r12
            r10 = r22
            r24 = r27
            r25 = r12
            r11 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.google.android.gms.tasks.Task r0 = r1.addOnCompleteListener((java.util.concurrent.Executor) r13, r0)
            com.moovit.app.ads.n r1 = new com.moovit.app.ads.n
            r2 = r19
            r3 = 1
            r1.<init>(r2, r3)
            com.google.android.gms.tasks.Task r0 = r0.addOnSuccessListener((java.util.concurrent.Executor) r13, r1)
            com.moovit.app.ads.r r1 = new com.moovit.app.ads.r
            r3 = r25
            r4 = 0
            r1.<init>(r4, r2, r3)
            com.google.android.gms.tasks.Task r0 = r0.addOnCompleteListener((java.util.concurrent.Executor) r13, r1)
            java.util.HashMap r1 = r2.f37465g
            r1.put(r3, r0)
            r3 = r0
            r0 = r2
            r1 = r24
        L_0x01f0:
            r1.add(r3)
            r11 = r1
            r1 = r2
            r14 = r17
            r13 = r20
            r2 = r0
            r0 = r26
            goto L_0x0030
        L_0x01fe:
            r1 = r11
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.whenAll((java.util.Collection<? extends com.google.android.gms.tasks.Task<?>>) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ads.C14756q.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}

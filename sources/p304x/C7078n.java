package p304x;

/* renamed from: x.n */
public final /* synthetic */ class C7078n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f21996b;

    /* renamed from: c */
    public final /* synthetic */ Object f21997c;

    /* renamed from: d */
    public final /* synthetic */ Object f21998d;

    public /* synthetic */ C7078n(int i, Object obj, Object obj2) {
        this.f21996b = i;
        this.f21997c = obj;
        this.f21998d = obj2;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f21996b
            switch(r0) {
                case 0: goto L_0x020b;
                case 1: goto L_0x01f0;
                case 2: goto L_0x01d7;
                case 3: goto L_0x01a7;
                case 4: goto L_0x0179;
                case 5: goto L_0x013b;
                case 6: goto L_0x012c;
                case 7: goto L_0x00d7;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00a0;
                case 10: goto L_0x0085;
                case 11: goto L_0x0075;
                case 12: goto L_0x003b;
                case 13: goto L_0x002b;
                case 14: goto L_0x001f;
                case 15: goto L_0x0013;
                case 16: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0229
        L_0x0007:
            java.lang.Object r0 = r8.f21997c
            com.veriff.sdk.camera.core.Preview$SurfaceProvider r0 = (com.veriff.sdk.camera.core.Preview.SurfaceProvider) r0
            java.lang.Object r1 = r8.f21998d
            com.veriff.sdk.camera.core.SurfaceRequest r1 = (com.veriff.sdk.camera.core.SurfaceRequest) r1
            com.veriff.sdk.camera.core.Preview.m32249a(r0, r1)
            return
        L_0x0013:
            java.lang.Object r0 = r8.f21997c
            com.veriff.sdk.camera.core.ImageCapture r0 = (com.veriff.sdk.camera.core.ImageCapture) r0
            java.lang.Object r1 = r8.f21998d
            com.veriff.sdk.camera.core.ImageCapture$OnImageCapturedCallback r1 = (com.veriff.sdk.camera.core.ImageCapture.OnImageCapturedCallback) r1
            r0.lambda$sendImageCaptureRequest$6(r1)
            return
        L_0x001f:
            java.lang.Object r0 = r8.f21997c
            com.veriff.sdk.camera.camera2.interop.Camera2CameraControl r0 = (com.veriff.sdk.camera.camera2.interop.Camera2CameraControl) r0
            java.lang.Object r1 = r8.f21998d
            androidx.concurrent.futures.CallbackToFutureAdapter$a r1 = (androidx.concurrent.futures.CallbackToFutureAdapter.C0673a) r1
            r0.lambda$addCaptureRequestOptions$3(r1)
            return
        L_0x002b:
            java.lang.Object r0 = r8.f21997c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r8.f21998d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = com.moovit.gcm.GcmDismissIntentService.f41488b
            h10.b r2 = h10.C17295b.f44674a
            r2.mo49827b(r0, r1)
            return
        L_0x003b:
            java.lang.Object r0 = r8.f21997c
            com.moovit.app.wondo.tickets.rewards.WondoRewardDetailsActivity r0 = (com.moovit.app.wondo.tickets.rewards.WondoRewardDetailsActivity) r0
            java.lang.Object r1 = r8.f21998d
            com.moovit.app.wondo.tickets.model.WondoRewardDisplayInfo r1 = (com.moovit.app.wondo.tickets.model.WondoRewardDisplayInfo) r1
            int r2 = com.moovit.app.wondo.tickets.rewards.WondoRewardDetailsActivity.f40769Z
            boolean r2 = r0.f37311x
            if (r2 != 0) goto L_0x004a
            goto L_0x0074
        L_0x004a:
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "wondo_reward_terms_clicked"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r0.mo44545v2(r2)
            r2 = 2131889822(0x7f120e9e, float:1.9414318E38)
            java.lang.String r2 = r0.getString(r2)
            android.net.Uri r1 = r1.f40744g
            java.lang.String r1 = r1.toString()
            android.content.Intent r1 = com.moovit.web.WebViewActivity.m18168y2(r0, r1, r2)
            r0.startActivity(r1)
        L_0x0074:
            return
        L_0x0075:
            java.lang.Object r0 = r8.f21997c
            com.moovit.app.navigation.MultiLegNavActivity$a r0 = (com.moovit.app.navigation.MultiLegNavActivity.C15178a) r0
            java.lang.Object r1 = r8.f21998d
            com.moovit.app.navigation.checkin.Checkin r1 = (com.moovit.app.navigation.checkin.Checkin) r1
            com.moovit.app.navigation.MultiLegNavActivity r0 = com.moovit.app.navigation.MultiLegNavActivity.this
            int r2 = com.moovit.app.navigation.MultiLegNavActivity.f39101S0
            r0.mo45636V2(r1)
            return
        L_0x0085:
            java.lang.Object r0 = r8.f21997c
            mr.d r0 = (p661mr.C18427d) r0
            java.lang.Object r1 = r8.f21998d
            java.lang.String r1 = (java.lang.String) r1
            int r2 = p661mr.C18427d.f46976s
            A r2 = r0.f40792c
            r3 = 2131886718(0x7f12027e, float:1.9408023E38)
            java.lang.String r3 = r0.getString(r3)
            android.content.Intent r1 = com.moovit.web.WebViewActivity.m18168y2(r2, r3, r1)
            r0.startActivity(r1)
            return
        L_0x00a0:
            java.lang.Object r0 = r8.f21997c
            qf.a r0 = (p744qf.C19114a) r0
            java.lang.Object r1 = r8.f21998d
            com.google.firebase.perf.util.Timer r1 = (com.google.firebase.perf.util.Timer) r1
            lf.a r2 = p744qf.C19114a.f48588g
            com.google.firebase.perf.v1.d r1 = r0.mo51550b(r1)
            if (r1 == 0) goto L_0x00b5
            java.util.concurrent.ConcurrentLinkedQueue<com.google.firebase.perf.v1.d> r0 = r0.f48590a
            r0.add(r1)
        L_0x00b5:
            return
        L_0x00b6:
            java.lang.Object r0 = r8.f21997c
            ce.p r0 = (p404ce.C13803p) r0
            java.lang.Object r1 = r8.f21998d
            ze.b r1 = (p956ze.C20839b) r1
            monitor-enter(r0)
            java.util.Set<T> r2 = r0.f33977b     // Catch:{ all -> 0x00d4 }
            if (r2 != 0) goto L_0x00c9
            java.util.Set<ze.b<T>> r2 = r0.f33976a     // Catch:{ all -> 0x00d4 }
            r2.add(r1)     // Catch:{ all -> 0x00d4 }
            goto L_0x00d2
        L_0x00c9:
            java.util.Set<T> r2 = r0.f33977b     // Catch:{ all -> 0x00d4 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00d4 }
            r2.add(r1)     // Catch:{ all -> 0x00d4 }
        L_0x00d2:
            monitor-exit(r0)
            return
        L_0x00d4:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d7:
            java.lang.Object r0 = r8.f21997c
            xa.f r0 = (p314xa.C7188f) r0
            java.lang.Object r1 = r8.f21998d
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r2 = r0.f22299a
            monitor-enter(r2)
            boolean r3 = r0.f22310l     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x00e7
            goto L_0x0124
        L_0x00e7:
            long r3 = r0.f22309k     // Catch:{ all -> 0x0129 }
            r5 = 1
            long r3 = r3 - r5
            r0.f22309k = r3     // Catch:{ all -> 0x0129 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f5
            goto L_0x0124
        L_0x00f5:
            if (r7 >= 0) goto L_0x0106
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0129 }
            r1.<init>()     // Catch:{ all -> 0x0129 }
            java.lang.Object r3 = r0.f22299a     // Catch:{ all -> 0x0129 }
            monitor-enter(r3)     // Catch:{ all -> 0x0129 }
            r0.f22311m = r1     // Catch:{ all -> 0x0103 }
            monitor-exit(r3)     // Catch:{ all -> 0x0103 }
            goto L_0x0124
        L_0x0103:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0103 }
            throw r0     // Catch:{ all -> 0x0129 }
        L_0x0106:
            r0.mo23490a()     // Catch:{ all -> 0x0129 }
            r1.run()     // Catch:{ IllegalStateException -> 0x011d, Exception -> 0x010d }
            goto L_0x0124
        L_0x010d:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0129 }
            r3.<init>(r1)     // Catch:{ all -> 0x0129 }
            java.lang.Object r1 = r0.f22299a     // Catch:{ all -> 0x0129 }
            monitor-enter(r1)     // Catch:{ all -> 0x0129 }
            r0.f22311m = r3     // Catch:{ all -> 0x011a }
            monitor-exit(r1)     // Catch:{ all -> 0x011a }
            goto L_0x0124
        L_0x011a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x011a }
            throw r0     // Catch:{ all -> 0x0129 }
        L_0x011d:
            r1 = move-exception
            java.lang.Object r3 = r0.f22299a     // Catch:{ all -> 0x0129 }
            monitor-enter(r3)     // Catch:{ all -> 0x0129 }
            r0.f22311m = r1     // Catch:{ all -> 0x0126 }
            monitor-exit(r3)     // Catch:{ all -> 0x0126 }
        L_0x0124:
            monitor-exit(r2)     // Catch:{ all -> 0x0129 }
            return
        L_0x0126:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0129 }
            throw r0
        L_0x012c:
            java.lang.Object r0 = r8.f21997c
            com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService r0 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService) r0
            java.lang.Object r1 = r8.f21998d
            android.app.job.JobParameters r1 = (android.app.job.JobParameters) r1
            int r2 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.f13391b
            r2 = 0
            r0.jobFinished(r1, r2)
            return
        L_0x013b:
            java.lang.Object r0 = r8.f21997c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.f21998d
            com.facebook.appevents.AppEvent r1 = (com.facebook.appevents.AppEvent) r1
            l8.a r2 = p159l8.C5639a.f18388a
            java.lang.Class<l8.a> r2 = p159l8.C5639a.class
            boolean r3 = p262t8.C6606a.m15601b(r2)
            if (r3 == 0) goto L_0x014e
            goto L_0x0178
        L_0x014e:
            java.lang.String r3 = "$applicationId"
            mf0.C24362h.m61211f(r0, r3)     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = "$event"
            mf0.C24362h.m61211f(r1, r3)     // Catch:{ all -> 0x0174 }
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper r3 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.f8563a     // Catch:{ all -> 0x0174 }
            java.util.List r1 = p583jk.C17875h.m44280D(r1)     // Catch:{ all -> 0x0174 }
            java.lang.Class<com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper> r3 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.class
            boolean r4 = p262t8.C6606a.m15601b(r3)     // Catch:{ all -> 0x0174 }
            if (r4 == 0) goto L_0x0167
            goto L_0x0178
        L_0x0167:
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper r4 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.f8563a     // Catch:{ all -> 0x016f }
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$EventType r5 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS     // Catch:{ all -> 0x016f }
            r4.mo12504b(r5, r0, r1)     // Catch:{ all -> 0x016f }
            goto L_0x0178
        L_0x016f:
            r0 = move-exception
            p262t8.C6606a.m15600a(r3, r0)     // Catch:{ all -> 0x0174 }
            goto L_0x0178
        L_0x0174:
            r0 = move-exception
            p262t8.C6606a.m15600a(r2, r0)
        L_0x0178:
            return
        L_0x0179:
            java.lang.Object r0 = r8.f21997c
            h8.e r0 = (p110h8.C5141e) r0
            java.lang.Object r1 = r8.f21998d
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            h8.e$b r2 = p110h8.C5141e.f17157s
            java.lang.Class<h8.e> r2 = p110h8.C5141e.class
            boolean r3 = p262t8.C6606a.m15601b(r2)
            if (r3 == 0) goto L_0x018c
            goto L_0x01a6
        L_0x018c:
            java.lang.String r3 = "this$0"
            mf0.C24362h.m61211f(r0, r3)     // Catch:{ all -> 0x01a2 }
            java.lang.String r3 = "$queryPurchaseHistoryRunnable"
            mf0.C24362h.m61211f(r1, r3)     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x01a2 }
            java.util.concurrent.CopyOnWriteArraySet r4 = r0.f17180r     // Catch:{ all -> 0x01a2 }
            r3.<init>(r4)     // Catch:{ all -> 0x01a2 }
            r0.mo20860d(r3, r1)     // Catch:{ all -> 0x01a2 }
            goto L_0x01a6
        L_0x01a2:
            r0 = move-exception
            p262t8.C6606a.m15600a(r2, r0)
        L_0x01a6:
            return
        L_0x01a7:
            java.lang.Object r0 = r8.f21997c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.f21998d
            android.os.Bundle r1 = (android.os.Bundle) r1
            e8.a r2 = p074e8.C4596a.f15790a
            java.lang.Class<e8.a> r2 = p074e8.C4596a.class
            boolean r3 = p262t8.C6606a.m15601b(r2)
            if (r3 == 0) goto L_0x01ba
            goto L_0x01d6
        L_0x01ba:
            java.lang.String r3 = "$eventName"
            mf0.C24362h.m61211f(r0, r3)     // Catch:{ all -> 0x01d2 }
            java.lang.String r3 = "$parameters"
            mf0.C24362h.m61211f(r1, r3)     // Catch:{ all -> 0x01d2 }
            android.content.Context r3 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x01d2 }
            r4 = 0
            com.facebook.appevents.j r5 = new com.facebook.appevents.j     // Catch:{ all -> 0x01d2 }
            r5.<init>((android.content.Context) r3, (java.lang.String) r4)     // Catch:{ all -> 0x01d2 }
            r5.mo12484d(r1, r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x01d6
        L_0x01d2:
            r0 = move-exception
            p262t8.C6606a.m15600a(r2, r0)
        L_0x01d6:
            return
        L_0x01d7:
            java.lang.Object r0 = r8.f21997c
            androidx.fragment.app.strictmode.FragmentStrictMode$b r0 = (androidx.fragment.app.strictmode.FragmentStrictMode.C0968b) r0
            java.lang.Object r1 = r8.f21998d
            androidx.fragment.app.strictmode.Violation r1 = (androidx.fragment.app.strictmode.Violation) r1
            androidx.fragment.app.strictmode.FragmentStrictMode$b r2 = androidx.fragment.app.strictmode.FragmentStrictMode.f3849a
            java.lang.String r2 = "$policy"
            mf0.C24362h.m61211f(r0, r2)
            java.lang.String r2 = "$violation"
            mf0.C24362h.m61211f(r1, r2)
            r0.getClass()
            r0 = 0
            throw r0
        L_0x01f0:
            java.lang.Object r0 = r8.f21997c
            androidx.camera.camera2.internal.Camera2CameraImpl r0 = (androidx.camera.camera2.internal.Camera2CameraImpl) r0
            java.lang.Object r1 = r8.f21998d
            java.util.List r1 = (java.util.List) r1
            r0.getClass()
            r0.mo2263x(r1)     // Catch:{ all -> 0x0204 }
            x.q r0 = r0.f1692i
            r0.mo23329f()
            return
        L_0x0204:
            r1 = move-exception
            x.q r0 = r0.f1692i
            r0.mo23329f()
            throw r1
        L_0x020b:
            java.lang.Object r0 = r8.f21997c
            x.q r0 = (p304x.C7090q) r0
            java.lang.Object r1 = r8.f21998d
            androidx.concurrent.futures.CallbackToFutureAdapter$a r1 = (androidx.concurrent.futures.CallbackToFutureAdapter.C0673a) r1
            long r2 = r0.mo23338q()
            x.f r4 = new x.f
            r4.<init>(r0, r2)
            androidx.concurrent.futures.CallbackToFutureAdapter$c r0 = androidx.concurrent.futures.CallbackToFutureAdapter.m1884a(r4)
            g0.a r2 = com.google.android.play.core.appupdate.C14226d.m35352s0()
            r3 = 1
            p102h0.C5023g.m12859g(r3, r0, r1, r2)
            return
        L_0x0229:
            java.lang.Object r0 = r8.f21997c
            com.veriff.sdk.camera.core.SurfaceRequest$TransformationInfoListener r0 = (com.veriff.sdk.camera.core.SurfaceRequest.TransformationInfoListener) r0
            java.lang.Object r1 = r8.f21998d
            com.veriff.sdk.camera.core.SurfaceRequest$TransformationInfo r1 = (com.veriff.sdk.camera.core.SurfaceRequest.TransformationInfo) r1
            ((com.veriff.sdk.camera.view.C12588e) r0).mo39361a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p304x.C7078n.run():void");
    }
}

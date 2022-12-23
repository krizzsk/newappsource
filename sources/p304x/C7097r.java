package p304x;

/* renamed from: x.r */
public final /* synthetic */ class C7097r implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22069b;

    /* renamed from: c */
    public final /* synthetic */ Object f22070c;

    /* renamed from: d */
    public final /* synthetic */ Object f22071d;

    public /* synthetic */ C7097r(int i, Object obj, Object obj2) {
        this.f22069b = i;
        this.f22070c = obj;
        this.f22071d = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x03b7 A[LOOP:5: B:144:0x03a1->B:153:0x03b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03ca A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.f22069b
            r1 = 1
            r2 = 0
            r3 = 0
            switch(r0) {
                case 0: goto L_0x02fa;
                case 1: goto L_0x02ec;
                case 2: goto L_0x02de;
                case 3: goto L_0x02d0;
                case 4: goto L_0x02c1;
                case 5: goto L_0x02af;
                case 6: goto L_0x0284;
                case 7: goto L_0x0278;
                case 8: goto L_0x025b;
                case 9: goto L_0x0211;
                case 10: goto L_0x01d3;
                case 11: goto L_0x00f5;
                case 12: goto L_0x00e0;
                case 13: goto L_0x00d0;
                case 14: goto L_0x00b8;
                case 15: goto L_0x00a3;
                case 16: goto L_0x0073;
                case 17: goto L_0x0061;
                case 18: goto L_0x0051;
                case 19: goto L_0x003d;
                case 20: goto L_0x001c;
                case 21: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0332
        L_0x000a:
            java.lang.Object r0 = r13.f22070c
            k60.a r0 = (k60.C17999a) r0
            java.lang.Object r1 = r13.f22071d
            hq.b r1 = (p543hq.C17474b) r1
            int r2 = k60.C17999a.f46086q
            boolean r2 = r0.f40824e
            if (r2 == 0) goto L_0x001b
            r0.mo46797j2(r1)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r0 = r13.f22070c
            ax.h r0 = (p376ax.C13546h) r0
            java.lang.Object r1 = r13.f22071d
            com.moovit.app.tod.bookingflow.model.TodBookingPickupLocationState r1 = (com.moovit.app.tod.bookingflow.model.TodBookingPickupLocationState) r1
            int r2 = p376ax.C13546h.f33483w
            A r0 = r0.f40822c
            com.moovit.app.tod.bookingflow.TodBookingOrderActivity r0 = (com.moovit.app.tod.bookingflow.TodBookingOrderActivity) r0
            r2 = 2131363406(0x7f0a064e, float:1.834662E38)
            androidx.fragment.app.Fragment r0 = r0.mo44529n1(r2)
            com.moovit.map.MapFragment r0 = (com.moovit.map.MapFragment) r0
            com.moovit.transit.LocationDescriptor r1 = r1.f40099b
            com.moovit.commons.geo.LatLonE6 r1 = r1.mo24310d()
            r0.mo48663x2(r1)
            return
        L_0x003d:
            java.lang.Object r0 = r13.f22070c
            yw.f r0 = (p950yw.C20779f) r0
            java.lang.Object r1 = r13.f22071d
            com.moovit.app.tod.bookingflow.model.TodBookingPickupLocationState r1 = (com.moovit.app.tod.bookingflow.model.TodBookingPickupLocationState) r1
            com.moovit.map.MapFragment r0 = r0.f52430b
            com.moovit.transit.LocationDescriptor r1 = r1.f40099b
            com.moovit.commons.geo.LatLonE6 r1 = r1.mo24310d()
            r0.mo48663x2(r1)
            return
        L_0x0051:
            java.lang.Object r0 = r13.f22070c
            com.moovit.app.search.AbstractSearchActivity r0 = (com.moovit.app.search.AbstractSearchActivity) r0
            java.lang.Object r1 = r13.f22071d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = com.moovit.app.search.AbstractSearchActivity.f39419l0
            androidx.appcompat.widget.SearchView r0 = r0.f39423U
            r0.mo1788r(r1, r2)
            return
        L_0x0061:
            java.lang.Object r0 = r13.f22070c
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.Object r1 = r13.f22071d
            androidx.recyclerview.widget.RecyclerView$w r1 = (androidx.recyclerview.widget.RecyclerView.C1149w) r1
            int r2 = com.moovit.app.linedetail.p416ui.C15101a.f38810T
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
            r0.startSmoothScroll(r1)
            return
        L_0x0073:
            java.lang.Object r0 = r13.f22070c
            sq.i r0 = (p801sq.C19520i) r0
            java.lang.Object r1 = r13.f22071d
            java.util.List r1 = (java.util.List) r1
            int r2 = p801sq.C19520i.f49609w
            r0.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.CONTENT_SHOWN
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "purchase_bottom_dialog"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r0.mo46797j2(r2)
            com.moovit.view.dialogs.BottomSheetMenuDialogFragment r1 = com.moovit.view.dialogs.BottomSheetMenuDialogFragment.m18151S1(r1)
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.lang.String r2 = "purchase_action_dialog"
            r1.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r2)
            return
        L_0x00a3:
            java.lang.Object r0 = r13.f22070c
            rf.d r0 = (p766rf.C19260d) r0
            java.lang.Object r1 = r13.f22071d
            rf.b r1 = (p766rf.C19257b) r1
            lf.a r2 = p766rf.C19260d.f48933s
            r0.getClass()
            com.google.firebase.perf.v1.g$b r2 = r1.f48913a
            com.google.firebase.perf.v1.ApplicationProcessState r1 = r1.f48914b
            r0.mo51681c(r2, r1)
            return
        L_0x00b8:
            java.lang.Object r0 = r13.f22070c
            ff.q r0 = (p484ff.C16988q) r0
            java.lang.Object r1 = r13.f22071d
            com.google.android.gms.tasks.TaskCompletionSource r1 = (com.google.android.gms.tasks.TaskCompletionSource) r1
            r0.getClass()
            android.graphics.Bitmap r0 = r0.mo49623e()     // Catch:{ Exception -> 0x00cb }
            r1.setResult(r0)     // Catch:{ Exception -> 0x00cb }
            goto L_0x00cf
        L_0x00cb:
            r0 = move-exception
            r1.setException(r0)
        L_0x00cf:
            return
        L_0x00d0:
            java.lang.Object r0 = r13.f22070c
            com.google.android.exoplayer2.drm.b$a r0 = (com.google.android.exoplayer2.drm.C3912b.C3913a) r0
            java.lang.Object r1 = r13.f22071d
            com.google.android.exoplayer2.drm.b r1 = (com.google.android.exoplayer2.drm.C3912b) r1
            int r2 = r0.f13725a
            gb.o$a r0 = r0.f13726b
            r1.mo16000z(r2, r0)
            return
        L_0x00e0:
            java.lang.Object r0 = r13.f22070c
            com.google.android.exoplayer2.audio.a$a r0 = (com.google.android.exoplayer2.audio.C3876a.C3877a) r0
            java.lang.Object r1 = r13.f22071d
            ja.d r1 = (p137ja.C5413d) r1
            r0.getClass()
            monitor-enter(r1)
            monitor-exit(r1)
            com.google.android.exoplayer2.audio.a r0 = r0.f13480b
            int r2 = p277ub.C6774a0.f20959a
            r0.mo15878t(r1)
            return
        L_0x00f5:
            java.lang.Object r0 = r13.f22070c
            r3 = r0
            ga.d0 r3 = (p099ga.C4872d0) r3
            java.lang.Object r0 = r13.f22071d
            ga.g0$d r0 = (p099ga.C4887g0.C4891d) r0
            int r4 = r3.f16394u
            int r5 = r0.f16493c
            int r4 = r4 - r5
            r3.f16394u = r4
            boolean r5 = r0.f16494d
            if (r5 == 0) goto L_0x010f
            int r5 = r0.f16495e
            r3.f16395v = r5
            r3.f16396w = r1
        L_0x010f:
            boolean r5 = r0.f16496f
            if (r5 == 0) goto L_0x0117
            int r5 = r0.f16497g
            r3.f16397x = r5
        L_0x0117:
            if (r4 != 0) goto L_0x01d2
            ga.r0 r4 = r0.f16492b
            ga.e1 r4 = r4.f16675a
            ga.r0 r5 = r3.f16372B
            ga.e1 r5 = r5.f16675a
            boolean r5 = r5.mo20464p()
            if (r5 != 0) goto L_0x0134
            boolean r5 = r4.mo20464p()
            if (r5 == 0) goto L_0x0134
            r5 = -1
            r3.f16373C = r5
            r5 = 0
            r3.f16374D = r5
        L_0x0134:
            boolean r5 = r4.mo20464p()
            if (r5 != 0) goto L_0x016f
            r5 = r4
            ga.w0 r5 = (p099ga.C4947w0) r5
            ga.e1[] r5 = r5.f16729j
            java.util.List r5 = java.util.Arrays.asList(r5)
            int r6 = r5.size()
            java.util.ArrayList r7 = r3.f16385l
            int r7 = r7.size()
            if (r6 != r7) goto L_0x0151
            r6 = 1
            goto L_0x0152
        L_0x0151:
            r6 = 0
        L_0x0152:
            p583jk.C17875h.m44304o(r6)
            r6 = 0
        L_0x0156:
            int r7 = r5.size()
            if (r6 >= r7) goto L_0x016f
            java.util.ArrayList r7 = r3.f16385l
            java.lang.Object r7 = r7.get(r6)
            ga.d0$a r7 = (p099ga.C4872d0.C4873a) r7
            java.lang.Object r8 = r5.get(r6)
            ga.e1 r8 = (p099ga.C4879e1) r8
            r7.f16401b = r8
            int r6 = r6 + 1
            goto L_0x0156
        L_0x016f:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r7 = r3.f16396w
            if (r7 == 0) goto L_0x01c2
            ga.r0 r7 = r0.f16492b
            gb.o$a r7 = r7.f16676b
            ga.r0 r8 = r3.f16372B
            gb.o$a r8 = r8.f16676b
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0194
            ga.r0 r7 = r0.f16492b
            long r7 = r7.f16678d
            ga.r0 r9 = r3.f16372B
            long r9 = r9.f16693s
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r1 = 0
        L_0x0194:
            if (r1 == 0) goto L_0x01bf
            boolean r5 = r4.mo20464p()
            if (r5 != 0) goto L_0x01bb
            ga.r0 r5 = r0.f16492b
            gb.o$a r5 = r5.f16676b
            boolean r5 = r5.mo20688a()
            if (r5 == 0) goto L_0x01a7
            goto L_0x01bb
        L_0x01a7:
            ga.r0 r5 = r0.f16492b
            gb.o$a r6 = r5.f16676b
            long r7 = r5.f16678d
            java.lang.Object r5 = r6.f16857a
            ga.e1$b r6 = r3.f16384k
            r4.mo20346g(r5, r6)
            ga.e1$b r4 = r3.f16384k
            long r4 = r4.f16419e
            long r5 = r7 + r4
            goto L_0x01bf
        L_0x01bb:
            ga.r0 r4 = r0.f16492b
            long r5 = r4.f16678d
        L_0x01bf:
            r8 = r1
            r10 = r5
            goto L_0x01c4
        L_0x01c2:
            r10 = r5
            r8 = 0
        L_0x01c4:
            r3.f16396w = r2
            ga.r0 r4 = r0.f16492b
            r5 = 1
            int r6 = r3.f16397x
            r7 = 0
            int r9 = r3.f16395v
            r12 = -1
            r3.mo20444Z(r4, r5, r6, r7, r8, r9, r10, r12)
        L_0x01d2:
            return
        L_0x01d3:
            java.lang.Object r0 = r13.f22070c
            e8.f r0 = (p074e8.C4608f) r0
            java.lang.Object r1 = r13.f22071d
            r5 = r1
            java.util.TimerTask r5 = (java.util.TimerTask) r5
            java.lang.String r1 = p074e8.C4608f.f15828e
            java.lang.Class<e8.f> r1 = p074e8.C4608f.class
            boolean r2 = p262t8.C6606a.m15601b(r1)
            if (r2 == 0) goto L_0x01e7
            goto L_0x0210
        L_0x01e7:
            java.lang.String r2 = "this$0"
            mf0.C24362h.m61211f(r0, r2)     // Catch:{ all -> 0x020c }
            java.lang.String r2 = "$indexingTask"
            mf0.C24362h.m61211f(r5, r2)     // Catch:{ all -> 0x020c }
            java.util.Timer r2 = r0.f15831c     // Catch:{ Exception -> 0x0210 }
            if (r2 != 0) goto L_0x01f7
            goto L_0x01fa
        L_0x01f7:
            r2.cancel()     // Catch:{ Exception -> 0x0210 }
        L_0x01fa:
            r0.f15832d = r3     // Catch:{ Exception -> 0x0210 }
            java.util.Timer r2 = new java.util.Timer     // Catch:{ Exception -> 0x0210 }
            r2.<init>()     // Catch:{ Exception -> 0x0210 }
            r6 = 0
            r8 = 1000(0x3e8, double:4.94E-321)
            r4 = r2
            r4.scheduleAtFixedRate(r5, r6, r8)     // Catch:{ Exception -> 0x0210 }
            r0.f15831c = r2     // Catch:{ Exception -> 0x0210 }
            goto L_0x0210
        L_0x020c:
            r0 = move-exception
            p262t8.C6606a.m15600a(r1, r0)
        L_0x0210:
            return
        L_0x0211:
            java.lang.Object r0 = r13.f22070c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r13.f22071d
            a8.t r1 = (p009a8.C0121t) r1
            java.lang.String r2 = "$callbacks"
            mf0.C24362h.m61211f(r0, r2)
            java.lang.String r2 = "$requests"
            mf0.C24362h.m61211f(r1, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0227:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0244
            java.lang.Object r2 = r0.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r3 = r2.first
            com.facebook.GraphRequest$b r3 = (com.facebook.GraphRequest.C2280b) r3
            java.lang.Object r2 = r2.second
            java.lang.String r4 = "pair.second"
            mf0.C24362h.m61210e(r2, r4)
            a8.u r2 = (p009a8.C0124u) r2
            r3.mo200b(r2)
            goto L_0x0227
        L_0x0244:
            java.util.ArrayList r0 = r1.f362e
            java.util.Iterator r0 = r0.iterator()
        L_0x024a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x025a
            java.lang.Object r2 = r0.next()
            a8.t$a r2 = (p009a8.C0121t.C0122a) r2
            r2.mo203a(r1)
            goto L_0x024a
        L_0x025a:
            return
        L_0x025b:
            java.lang.Object r0 = r13.f22070c
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView r0 = (com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView) r0
            java.lang.Object r1 = r13.f22071d
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView$Companion r2 = com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.f7241i
            java.lang.String r2 = "this$0"
            mf0.C24362h.m61211f(r0, r2)
            java.lang.String r2 = "$lParams"
            mf0.C24362h.m61211f(r1, r2)
            T r1 = r1.element
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r0.setLayoutParams(r1)
            return
        L_0x0278:
            java.lang.Object r0 = r13.f22070c
            com.appboy.Appboy r0 = (com.appboy.Appboy) r0
            java.lang.Object r1 = r13.f22071d
            java.lang.String r1 = (java.lang.String) r1
            r0.m5388a((java.lang.String) r1)
            return
        L_0x0284:
            java.lang.Object r0 = r13.f22070c
            androidx.lifecycle.d r0 = (androidx.lifecycle.C1000d) r0
            java.lang.Object r1 = r13.f22071d
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.String r2 = "this$0"
            mf0.C24362h.m61211f(r0, r2)
            java.lang.String r2 = "$runnable"
            mf0.C24362h.m61211f(r1, r2)
            java.util.ArrayDeque r2 = r0.f3922d
            boolean r1 = r2.offer(r1)
            if (r1 == 0) goto L_0x02a3
            r0.mo4291a()
            return
        L_0x02a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot enqueue any more runnables"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02af:
            java.lang.Object r0 = r13.f22070c
            r1.a r0 = (p229r1.C6231a) r0
            java.lang.Object r1 = r13.f22071d
            android.view.Surface r1 = (android.view.Surface) r1
            androidx.camera.core.d r2 = new androidx.camera.core.d
            r3 = 4
            r2.<init>(r3, r1)
            r0.accept(r2)
            return
        L_0x02c1:
            java.lang.Object r0 = r13.f22070c
            androidx.camera.core.q r0 = (androidx.camera.core.C0629q) r0
            java.lang.Object r1 = r13.f22071d
            e0.z$a r1 = (p066e0.C4462z.C4463a) r1
            r0.getClass()
            r1.mo2538c(r0)
            return
        L_0x02d0:
            java.lang.Object r0 = r13.f22070c
            y.a0$a r0 = (p316y.C7197a0.C7198a) r0
            java.lang.Object r1 = r13.f22071d
            java.lang.String r1 = (java.lang.String) r1
            android.hardware.camera2.CameraManager$AvailabilityCallback r0 = r0.f22326b
            r0.onCameraAvailable(r1)
            return
        L_0x02de:
            java.lang.Object r0 = r13.f22070c
            y.t$b r0 = (p316y.C7226t.C7228b) r0
            java.lang.Object r1 = r13.f22071d
            android.hardware.camera2.CameraDevice r1 = (android.hardware.camera2.CameraDevice) r1
            android.hardware.camera2.CameraDevice$StateCallback r0 = r0.f22377a
            r0.onOpened(r1)
            return
        L_0x02ec:
            java.lang.Object r0 = r13.f22070c
            y.f$c r0 = (p316y.C7208f.C7211c) r0
            java.lang.Object r1 = r13.f22071d
            android.hardware.camera2.CameraCaptureSession r1 = (android.hardware.camera2.CameraCaptureSession) r1
            android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r0.f22336a
            r0.onClosed(r1)
            return
        L_0x02fa:
            java.lang.Object r0 = r13.f22070c
            x.q$b r0 = (p304x.C7090q.C7092b) r0
            java.lang.Object r1 = r13.f22071d
            android.hardware.camera2.TotalCaptureResult r1 = (android.hardware.camera2.TotalCaptureResult) r1
            r0.getClass()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = r0.f22060a
            java.util.Iterator r3 = r3.iterator()
        L_0x0310:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0326
            java.lang.Object r4 = r3.next()
            x.q$c r4 = (p304x.C7090q.C7093c) r4
            boolean r5 = r4.onCaptureResult(r1)
            if (r5 == 0) goto L_0x0310
            r2.add(r4)
            goto L_0x0310
        L_0x0326:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0331
            java.util.HashSet r0 = r0.f22060a
            r0.removeAll(r2)
        L_0x0331:
            return
        L_0x0332:
            java.lang.Object r0 = r13.f22070c
            c70.i$f r0 = (c70.C13756i.C13762f) r0
            java.lang.Object r4 = r13.f22071d
            c70.i r4 = (c70.C13756i) r4
            java.util.concurrent.atomic.AtomicLong r5 = c70.C13756i.C13762f.f33885j
            r0.getClass()
            monitor-enter(r4)
            java.lang.String r5 = r0.f33887c     // Catch:{ all -> 0x03cc }
            s0.b r6 = r4.f33874h     // Catch:{ all -> 0x03cc }
            java.lang.Object r6 = r6.getOrDefault(r5, r3)     // Catch:{ all -> 0x03cc }
            c70.i$f r6 = (c70.C13756i.C13762f) r6     // Catch:{ all -> 0x03cc }
            if (r0 != r6) goto L_0x0367
            s0.b r0 = r4.f33874h     // Catch:{ all -> 0x03cc }
            java.lang.Object r0 = r0.remove(r5)     // Catch:{ all -> 0x03cc }
            ce0.C21100e.m49371w(r0)     // Catch:{ all -> 0x03cc }
            c70.i$h r0 = r4.f33869c     // Catch:{ all -> 0x03cc }
            monitor-enter(r0)     // Catch:{ all -> 0x03cc }
            com.moovit.commons.utils.collections.CollectionHashMap$ArrayListHashMap<java.lang.String, c70.i$l> r6 = r0.f33896a     // Catch:{ all -> 0x0364 }
            r6.remove(r5)     // Catch:{ all -> 0x0364 }
            com.moovit.commons.utils.collections.CollectionHashMap$ArrayListHashMap<java.lang.String, c70.i$l> r6 = r0.f33897b     // Catch:{ all -> 0x0364 }
            r6.remove(r5)     // Catch:{ all -> 0x0364 }
            monitor-exit(r0)     // Catch:{ all -> 0x03cc }
            goto L_0x0367
        L_0x0364:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x03cc }
            throw r1     // Catch:{ all -> 0x03cc }
        L_0x0367:
            s0.b r0 = r4.f33874h     // Catch:{ all -> 0x03cc }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x03cc }
            s0.g$e r0 = (p241s0.C6307g.C6312e) r0     // Catch:{ all -> 0x03cc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x03cc }
        L_0x0373:
            r5 = r0
            s0.g$a r5 = (p241s0.C6307g.C6308a) r5     // Catch:{ all -> 0x03cc }
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x03cc }
            if (r6 == 0) goto L_0x0397
            java.lang.Object r5 = r5.next()     // Catch:{ all -> 0x03cc }
            c70.i$f r5 = (c70.C13756i.C13762f) r5     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x038e
            com.moovit.request.RequestOptions r6 = r5.f33889e     // Catch:{ all -> 0x03cc }
            int r6 = r6.f42905b     // Catch:{ all -> 0x03cc }
            int r7 = r3.intValue()     // Catch:{ all -> 0x03cc }
            if (r6 <= r7) goto L_0x0373
        L_0x038e:
            com.moovit.request.RequestOptions r3 = r5.f33889e     // Catch:{ all -> 0x03cc }
            int r3 = r3.f42905b     // Catch:{ all -> 0x03cc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03cc }
            goto L_0x0373
        L_0x0397:
            r4.f33872f = r3     // Catch:{ all -> 0x03cc }
            java.util.PriorityQueue<c70.i$f> r0 = r4.f33871e     // Catch:{ all -> 0x03cc }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x03cc }
            c70.i$f r0 = (c70.C13756i.C13762f) r0     // Catch:{ all -> 0x03cc }
        L_0x03a1:
            if (r0 == 0) goto L_0x03ca
            java.lang.Integer r3 = r4.f33872f     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x03b4
            com.moovit.request.RequestOptions r5 = r0.f33889e     // Catch:{ all -> 0x03cc }
            int r5 = r5.f42905b     // Catch:{ all -> 0x03cc }
            int r3 = r3.intValue()     // Catch:{ all -> 0x03cc }
            if (r5 < r3) goto L_0x03b2
            goto L_0x03b4
        L_0x03b2:
            r3 = 0
            goto L_0x03b5
        L_0x03b4:
            r3 = 1
        L_0x03b5:
            if (r3 == 0) goto L_0x03ca
            java.util.concurrent.ThreadPoolExecutor r3 = r4.f33870d     // Catch:{ all -> 0x03cc }
            r3.execute(r0)     // Catch:{ all -> 0x03cc }
            java.util.PriorityQueue<c70.i$f> r0 = r4.f33871e     // Catch:{ all -> 0x03cc }
            r0.remove()     // Catch:{ all -> 0x03cc }
            java.util.PriorityQueue<c70.i$f> r0 = r4.f33871e     // Catch:{ all -> 0x03cc }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x03cc }
            c70.i$f r0 = (c70.C13756i.C13762f) r0     // Catch:{ all -> 0x03cc }
            goto L_0x03a1
        L_0x03ca:
            monitor-exit(r4)
            return
        L_0x03cc:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p304x.C7097r.run():void");
    }
}

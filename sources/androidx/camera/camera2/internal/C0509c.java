package androidx.camera.camera2.internal;

/* renamed from: androidx.camera.camera2.internal.c */
public final /* synthetic */ class C0509c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f1771b;

    /* renamed from: c */
    public final /* synthetic */ Object f1772c;

    /* renamed from: d */
    public final /* synthetic */ Object f1773d;

    public /* synthetic */ C0509c(int i, Object obj, Object obj2) {
        this.f1771b = i;
        this.f1772c = obj;
        this.f1773d = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: int} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.f1771b
            r1 = 1
            r2 = 0
            r3 = 5
            r4 = 2
            r5 = 0
            switch(r0) {
                case 0: goto L_0x0288;
                case 1: goto L_0x0264;
                case 2: goto L_0x0256;
                case 3: goto L_0x020d;
                case 4: goto L_0x0201;
                case 5: goto L_0x01f5;
                case 6: goto L_0x01e9;
                case 7: goto L_0x01d9;
                case 8: goto L_0x018a;
                case 9: goto L_0x0165;
                case 10: goto L_0x0156;
                case 11: goto L_0x013f;
                case 12: goto L_0x0106;
                case 13: goto L_0x00f4;
                case 14: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x039b
        L_0x000c:
            java.lang.Object r0 = r14.f1772c
            com.moovit.barcode.scan.engines.MLKitBarcodeScannerFragment r0 = (com.moovit.barcode.scan.engines.MLKitBarcodeScannerFragment) r0
            java.lang.Object r6 = r14.f1773d
            od.c r6 = (p695od.C18728c) r6
            int r7 = com.moovit.barcode.scan.engines.MLKitBarcodeScannerFragment.f40812q
            java.lang.String r7 = "this$0"
            mf0.C24362h.m61211f(r0, r7)
            java.lang.String r7 = "$cameraProviderFuture"
            mf0.C24362h.m61211f(r6, r7)
            java.lang.Object r6 = r6.get()
            java.lang.String r7 = "cameraProviderFuture.get()"
            mf0.C24362h.m61210e(r6, r7)
            androidx.camera.lifecycle.e r6 = (androidx.camera.lifecycle.C0650e) r6
            android.view.View r7 = r0.requireView()
            int r8 = p432cz.C16527b.previewView
            android.view.View r7 = r7.findViewById(r8)
            java.lang.String r8 = "requireView().findViewById(R.id.previewView)"
            mf0.C24362h.m61210e(r7, r8)
            androidx.camera.view.PreviewView r7 = (androidx.camera.view.PreviewView) r7
            androidx.camera.core.r$b r8 = new androidx.camera.core.r$b
            r8.<init>()
            android.util.Size r9 = new android.util.Size
            r10 = 1080(0x438, float:1.513E-42)
            r11 = 1920(0x780, float:2.69E-42)
            r9.<init>(r10, r11)
            androidx.camera.core.impl.m r12 = r8.f2173a
            androidx.camera.core.impl.a r13 = androidx.camera.core.impl.C0587k.f2008i
            r12.mo2503w(r13, r9)
            androidx.camera.core.r r8 = r8.mo2575a()
            androidx.camera.core.r$d r7 = r7.getSurfaceProvider()
            r8.mo2572B(r7)
            androidx.camera.core.i$c r7 = new androidx.camera.core.i$c
            r7.<init>()
            android.util.Size r9 = new android.util.Size
            r9.<init>(r10, r11)
            androidx.camera.core.impl.m r10 = r7.f1916a
            r10.mo2503w(r13, r9)
            androidx.camera.core.impl.m r9 = r7.f1916a
            androidx.camera.core.impl.a r10 = androidx.camera.core.impl.C0584h.f1989y
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r9.mo2503w(r10, r11)
            androidx.camera.core.impl.m r9 = r7.f1916a
            androidx.camera.core.impl.a r10 = androidx.camera.core.impl.C0587k.f2005f
            r9.getClass()
            java.lang.Object r9 = r9.mo2422a(r10)     // Catch:{ IllegalArgumentException -> 0x0083 }
            goto L_0x0085
        L_0x0083:
            r9 = r5
        L_0x0085:
            if (r9 == 0) goto L_0x009f
            androidx.camera.core.impl.m r9 = r7.f1916a
            androidx.camera.core.impl.a r10 = androidx.camera.core.impl.C0587k.f2008i
            r9.getClass()
            java.lang.Object r5 = r9.mo2422a(r10)     // Catch:{ IllegalArgumentException -> 0x0093 }
            goto L_0x0094
        L_0x0093:
        L_0x0094:
            if (r5 != 0) goto L_0x0097
            goto L_0x009f
        L_0x0097:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot use both setTargetResolution and setTargetAspectRatio on the same config."
            r0.<init>(r1)
            throw r0
        L_0x009f:
            androidx.camera.core.i r5 = new androidx.camera.core.i
            androidx.camera.core.impl.h r9 = new androidx.camera.core.impl.h
            androidx.camera.core.impl.m r7 = r7.f1916a
            androidx.camera.core.impl.n r7 = androidx.camera.core.impl.C0590n.m1678s(r7)
            r9.<init>(r7)
            r5.<init>(r9)
            java.util.concurrent.ThreadPoolExecutor r7 = r0.f40813n
            d0.c0 r9 = new d0.c0
            r9.<init>(r3, r0, r5)
            java.lang.Object r3 = r5.f1913m
            monitor-enter(r3)
            androidx.camera.core.j r10 = r5.f1912l     // Catch:{ all -> 0x00f1 }
            d0.v r11 = new d0.v     // Catch:{ all -> 0x00f1 }
            r11.<init>(r9, r2)     // Catch:{ all -> 0x00f1 }
            java.lang.Object r12 = r10.f2100s     // Catch:{ all -> 0x00f1 }
            monitor-enter(r12)     // Catch:{ all -> 0x00f1 }
            r10.f2083b = r11     // Catch:{ all -> 0x00ee }
            r10.f2089h = r7     // Catch:{ all -> 0x00ee }
            monitor-exit(r12)     // Catch:{ all -> 0x00ee }
            androidx.camera.core.i$a r7 = r5.f1914n     // Catch:{ all -> 0x00f1 }
            if (r7 != 0) goto L_0x00cf
            r5.mo2376k()     // Catch:{ all -> 0x00f1 }
        L_0x00cf:
            r5.f1914n = r9     // Catch:{ all -> 0x00f1 }
            monitor-exit(r3)     // Catch:{ all -> 0x00f1 }
            r6.mo2610b()     // Catch:{ Exception -> 0x00e8 }
            androidx.lifecycle.p r3 = r0.getViewLifecycleOwner()     // Catch:{ Exception -> 0x00e8 }
            d0.l r7 = p054d0.C4292l.f15214c     // Catch:{ Exception -> 0x00e8 }
            androidx.camera.core.UseCase[] r4 = new androidx.camera.core.UseCase[r4]     // Catch:{ Exception -> 0x00e8 }
            r4[r2] = r8     // Catch:{ Exception -> 0x00e8 }
            r4[r1] = r5     // Catch:{ Exception -> 0x00e8 }
            d0.f r1 = r6.mo2609a(r3, r7, r4)     // Catch:{ Exception -> 0x00e8 }
            r0.f40814o = r1     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00ed
        L_0x00e8:
            gk0.a$a r0 = gk0.C23438a.f59213a
            r0.getClass()
        L_0x00ed:
            return
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00ee }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            java.lang.Object r0 = r14.f1772c
            yw.f r0 = (p950yw.C20779f) r0
            java.lang.Object r1 = r14.f1773d
            com.moovit.transit.LocationDescriptor r1 = (com.moovit.transit.LocationDescriptor) r1
            com.moovit.map.MapFragment r0 = r0.f52430b
            com.moovit.commons.geo.LatLonE6 r1 = r1.mo24310d()
            r0.mo48663x2(r1)
            return
        L_0x0106:
            java.lang.Object r0 = r14.f1772c
            com.moovit.analytics.AnalyticsEventLifecycleSender r0 = (com.moovit.analytics.AnalyticsEventLifecycleSender) r0
            java.lang.Object r1 = r14.f1773d
            androidx.lifecycle.p r1 = (androidx.lifecycle.C1033p) r1
            java.util.IdentityHashMap r2 = com.moovit.analytics.AnalyticsEventLifecycleSender.f37408f
            r0.getClass()
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()
            androidx.lifecycle.Lifecycle$State r2 = r1.mo4225b()
            androidx.lifecycle.Lifecycle$State r3 = r0.f37410c
            boolean r2 = r2.isAtLeast(r3)
            if (r2 == 0) goto L_0x013e
            com.moovit.analytics.AnalyticsEventLifecycleSender$b r2 = r0.f37409b
            hq.b r3 = r0.f37411d
            com.moovit.b<?> r4 = r2.f37415b
            if (r4 == 0) goto L_0x012f
            r4.mo22564R1(r3)
            goto L_0x0137
        L_0x012f:
            com.moovit.c<?> r2 = r2.f37414a
            r2.getClass()
            r2.mo46797j2(r3)
        L_0x0137:
            boolean r2 = r0.f37412e
            if (r2 == 0) goto L_0x013e
            r1.mo4226c(r0)
        L_0x013e:
            return
        L_0x013f:
            java.lang.Object r0 = r14.f1772c
            jf.t r0 = (p578jf.C17842t) r0
            java.lang.Object r1 = r14.f1773d
            android.content.Context r1 = (android.content.Context) r1
            android.content.SharedPreferences r3 = r0.f45813a
            if (r3 != 0) goto L_0x0155
            if (r1 == 0) goto L_0x0155
            java.lang.String r3 = "FirebasePerfSharedPrefs"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)
            r0.f45813a = r1
        L_0x0155:
            return
        L_0x0156:
            java.lang.Object r0 = r14.f1772c
            ff.l r0 = (p484ff.C16983l) r0
            java.lang.Object r1 = r14.f1773d
            android.content.Intent r1 = (android.content.Intent) r1
            r0.getClass()
            p484ff.C16983l.m42822a(r1)
            return
        L_0x0165:
            java.lang.Object r0 = r14.f1772c
            ce.r r0 = (p404ce.C13805r) r0
            java.lang.Object r1 = r14.f1773d
            ze.b r1 = (p956ze.C20839b) r1
            ze.b<T> r2 = r0.f33982b
            ce.q r3 = p404ce.C13805r.f33980d
            if (r2 != r3) goto L_0x0182
            monitor-enter(r0)
            ze.a$a<T> r2 = r0.f33981a     // Catch:{ all -> 0x017f }
            r0.f33981a = r5     // Catch:{ all -> 0x017f }
            r0.f33982b = r1     // Catch:{ all -> 0x017f }
            monitor-exit(r0)     // Catch:{ all -> 0x017f }
            r2.mo5856d(r1)
            return
        L_0x017f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x017f }
            throw r1
        L_0x0182:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "provide() can be called only once."
            r0.<init>(r1)
            throw r0
        L_0x018a:
            java.lang.Object r0 = r14.f1772c
            gb.x r0 = (p100gb.C5001x) r0
            java.lang.Object r3 = r14.f1773d
            ma.t r3 = (p173ma.C5750t) r3
            com.google.android.exoplayer2.metadata.icy.IcyHeaders r4 = r0.f16923s
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x019d
            r4 = r3
            goto L_0x01a2
        L_0x019d:
            ma.t$b r4 = new ma.t$b
            r4.<init>(r5)
        L_0x01a2:
            r0.f16930z = r4
            long r7 = r3.mo21571i()
            r0.f16893A = r7
            long r7 = r0.f16899G
            r9 = -1
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x01bb
            long r7 = r3.mo21571i()
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x01bb
            r2 = 1
        L_0x01bb:
            r0.f16894B = r2
            if (r2 == 0) goto L_0x01c0
            r1 = 7
        L_0x01c0:
            r0.f16895C = r1
            gb.x$b r1 = r0.f16912h
            long r4 = r0.f16893A
            boolean r2 = r3.mo21570e()
            boolean r3 = r0.f16894B
            gb.y r1 = (p100gb.C5007y) r1
            r1.mo20722t(r4, r2, r3)
            boolean r1 = r0.f16927w
            if (r1 != 0) goto L_0x01d8
            r0.mo20714x()
        L_0x01d8:
            return
        L_0x01d9:
            java.lang.Object r0 = r14.f1772c
            com.google.android.exoplayer2.drm.b$a r0 = (com.google.android.exoplayer2.drm.C3912b.C3913a) r0
            java.lang.Object r1 = r14.f1773d
            com.google.android.exoplayer2.drm.b r1 = (com.google.android.exoplayer2.drm.C3912b) r1
            int r2 = r0.f13725a
            gb.o$a r0 = r0.f13726b
            r1.mo15994E(r2, r0)
            return
        L_0x01e9:
            java.lang.Object r0 = r14.f1772c
            com.appboy.Appboy r0 = (com.appboy.Appboy) r0
            java.lang.Object r1 = r14.f1773d
            android.app.Activity r1 = (android.app.Activity) r1
            r0.m5398b((android.app.Activity) r1)
            return
        L_0x01f5:
            java.lang.Object r0 = r14.f1772c
            androidx.room.b r0 = (androidx.room.C1257b) r0
            r0.getClass()
            java.util.Collections.emptyList()
            r0 = 0
            throw r0
        L_0x0201:
            java.lang.Object r0 = r14.f1772c
            i1.f$e r0 = (p116i1.C5247f.C5252e) r0
            java.lang.Object r1 = r14.f1773d
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r0.mo2200d(r1)
            return
        L_0x020d:
            java.lang.Object r0 = r14.f1772c
            androidx.camera.view.d r0 = (androidx.camera.view.C0660d) r0
            java.lang.Object r1 = r14.f1773d
            androidx.camera.core.SurfaceRequest r1 = (androidx.camera.core.SurfaceRequest) r1
            androidx.camera.view.d$b r0 = r0.f2270f
            androidx.camera.core.SurfaceRequest r3 = r0.f2273c
            if (r3 == 0) goto L_0x022f
            java.util.Objects.toString(r3)
            java.lang.String r3 = "SurfaceViewImpl"
            p054d0.C4289j0.m11435b(r3)
            androidx.camera.core.SurfaceRequest r3 = r0.f2273c
            androidx.concurrent.futures.CallbackToFutureAdapter$a<android.view.Surface> r3 = r3.f1845f
            androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException r4 = new androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException
            r4.<init>()
            r3.mo2698c(r4)
        L_0x022f:
            r0.f2273c = r1
            android.util.Size r1 = r1.f1841b
            r0.f2272b = r1
            r0.f2275e = r2
            boolean r2 = r0.mo2649a()
            if (r2 != 0) goto L_0x0255
            java.lang.String r2 = "SurfaceViewImpl"
            p054d0.C4289j0.m11435b(r2)
            androidx.camera.view.d r0 = androidx.camera.view.C0660d.this
            android.view.SurfaceView r0 = r0.f2269e
            android.view.SurfaceHolder r0 = r0.getHolder()
            int r2 = r1.getWidth()
            int r1 = r1.getHeight()
            r0.setFixedSize(r2, r1)
        L_0x0255:
            return
        L_0x0256:
            java.lang.Object r0 = r14.f1772c
            e0.d0 r0 = (p066e0.C4421d0) r0
            java.lang.Object r1 = r14.f1773d
            e0.d0$a r1 = (p066e0.C4421d0.C4422a) r1
            androidx.lifecycle.v<e0.d0$b<T>> r0 = r0.f15490a
            r0.removeObserver(r1)
            return
        L_0x0264:
            java.lang.Object r0 = r14.f1772c
            androidx.camera.camera2.internal.m r0 = (androidx.camera.camera2.internal.C0522m) r0
            java.lang.Object r1 = r14.f1773d
            androidx.camera.camera2.internal.l r1 = (androidx.camera.camera2.internal.C0520l) r1
            androidx.camera.camera2.internal.i r2 = r0.f1801b
            java.lang.Object r6 = r2.f1788b
            monitor-enter(r6)
            java.util.LinkedHashSet r3 = r2.f1789c     // Catch:{ all -> 0x0285 }
            r3.remove(r0)     // Catch:{ all -> 0x0285 }
            java.util.LinkedHashSet r2 = r2.f1790d     // Catch:{ all -> 0x0285 }
            r2.remove(r0)     // Catch:{ all -> 0x0285 }
            monitor-exit(r6)     // Catch:{ all -> 0x0285 }
            r0.mo2301k(r1)
            androidx.camera.camera2.internal.l$a r0 = r0.f1805f
            r0.mo2338g(r1)
            return
        L_0x0285:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0285 }
            throw r0
        L_0x0288:
            java.lang.Object r0 = r14.f1772c
            androidx.camera.camera2.internal.Camera2CameraImpl r0 = (androidx.camera.camera2.internal.Camera2CameraImpl) r0
            java.lang.Object r6 = r14.f1773d
            java.util.List r6 = (java.util.List) r6
            r0.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
        L_0x029d:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x02e1
            java.lang.Object r9 = r6.next()
            androidx.camera.camera2.internal.Camera2CameraImpl$f r9 = (androidx.camera.camera2.internal.Camera2CameraImpl.C0500f) r9
            androidx.camera.core.impl.q r10 = r0.f1685b
            java.lang.String r11 = r9.mo2282c()
            java.util.LinkedHashMap r12 = r10.f2020a
            boolean r12 = r12.containsKey(r11)
            if (r12 != 0) goto L_0x02b9
            r10 = 0
            goto L_0x02c3
        L_0x02b9:
            java.util.LinkedHashMap r10 = r10.f2020a
            java.lang.Object r10 = r10.get(r11)
            androidx.camera.core.impl.q$a r10 = (androidx.camera.core.impl.C0593q.C0594a) r10
            boolean r10 = r10.f2022b
        L_0x02c3:
            if (r10 == 0) goto L_0x029d
            androidx.camera.core.impl.q r10 = r0.f1685b
            java.lang.String r11 = r9.mo2282c()
            java.util.LinkedHashMap r10 = r10.f2020a
            r10.remove(r11)
            java.lang.String r10 = r9.mo2282c()
            r7.add(r10)
            java.lang.Class r9 = r9.mo2283d()
            java.lang.Class<androidx.camera.core.r> r10 = androidx.camera.core.C0631r.class
            if (r9 != r10) goto L_0x029d
            r8 = 1
            goto L_0x029d
        L_0x02e1:
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x02e9
            goto L_0x039a
        L_0x02e9:
            java.lang.String r6 = "Use cases ["
            java.lang.StringBuilder r6 = p379.C13555b.m33972k(r6)
            java.lang.String r9 = ", "
            java.lang.String r7 = android.text.TextUtils.join(r9, r7)
            r6.append(r7)
            java.lang.String r7 = "] now DETACHED for camera"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.mo2251j(r6)
            if (r8 == 0) goto L_0x030d
            x.q r6 = r0.f1692i
            x.j1 r6 = r6.f22041h
            r6.getClass()
        L_0x030d:
            r0.mo2242f()
            androidx.camera.core.impl.q r6 = r0.f1685b
            java.util.Collection r6 = r6.mo2505b()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x038b
            x.q r6 = r0.f1692i
            r6.mo23329f()
            r0.mo2259t(r2)
            x.q r6 = r0.f1692i
            r6.mo23336o(r2)
            x.a1 r6 = r0.mo2254o()
            r0.f1697n = r6
            java.lang.String r6 = "Closing camera."
            r0.mo2251j(r6)
            int[] r6 = androidx.camera.camera2.internal.Camera2CameraImpl.C0494b.f1711a
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r7 = r0.f1689f
            int r7 = r7.ordinal()
            r6 = r6[r7]
            if (r6 == r4) goto L_0x037c
            r1 = 4
            if (r6 == r1) goto L_0x0373
            if (r6 == r3) goto L_0x035b
            r1 = 6
            if (r6 == r1) goto L_0x035b
            java.lang.String r1 = "close() ignored due to being in state: "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = r0.f1689f
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo2251j(r1)
            goto L_0x039a
        L_0x035b:
            androidx.camera.camera2.internal.Camera2CameraImpl$e r1 = r0.f1693j
            boolean r1 = r1.mo2271a()
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING
            r0.mo2261u(r2)
            if (r1 == 0) goto L_0x039a
            boolean r1 = r0.mo2253n()
            mf0.C24361g.m61193w(r5, r1)
            r0.mo2252k()
            goto L_0x039a
        L_0x0373:
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING
            r0.mo2261u(r1)
            r0.mo2249h(r2)
            goto L_0x039a
        L_0x037c:
            android.hardware.camera2.CameraDevice r2 = r0.f1695l
            if (r2 != 0) goto L_0x0381
            goto L_0x0382
        L_0x0381:
            r1 = 0
        L_0x0382:
            mf0.C24361g.m61193w(r5, r1)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED
            r0.mo2261u(r1)
            goto L_0x039a
        L_0x038b:
            r0.mo2234A()
            r0.mo2259t(r2)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = r0.f1689f
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED
            if (r1 != r2) goto L_0x039a
            r0.mo2256q()
        L_0x039a:
            return
        L_0x039b:
            java.lang.Object r0 = r14.f1772c
            v20.c$e r0 = (v20.C20092c.C20097e) r0
            java.lang.Object r2 = r14.f1773d
            na0.k r2 = (na0.C12934k) r2
            if (r2 == 0) goto L_0x03c6
            v20.c r3 = v20.C20092c.this
            com.nutiteq.MapView r3 = r3.f50970g
            na0.e r3 = r3.getConstraints()
            r3.getClass()
            float r4 = r2.f32057a
            r5 = 0
            r6 = 1103101952(0x41c00000, float:24.0)
            float r4 = ya0.C13288j.m33427b(r4, r5, r6)
            float r2 = r2.f32058b
            float r2 = ya0.C13288j.m33427b(r2, r5, r6)
            na0.k r5 = new na0.k
            r5.<init>(r4, r2)
            r3.f32016a = r5
        L_0x03c6:
            v20.c r2 = v20.C20092c.this
            com.nutiteq.MapView r2 = r2.f50970g
            na0.j r2 = r2.getOptions()
            r2.f32049p = r1
            v20.c r2 = v20.C20092c.this
            com.moovit.map.MapFragment r3 = r2.f50967d
            if (r3 == 0) goto L_0x03d8
            r3.f42371o0 = r1
        L_0x03d8:
            za0.b r1 = r2.f50977n
            oa0.f r0 = r0.f51004i
            r1.getClass()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.mo40239g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0509c.run():void");
    }
}

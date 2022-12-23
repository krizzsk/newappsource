package androidx.camera.camera2.internal;

/* renamed from: androidx.camera.camera2.internal.d */
public final /* synthetic */ class C0510d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f1775b;

    /* renamed from: c */
    public final /* synthetic */ Object f1776c;

    /* renamed from: d */
    public final /* synthetic */ Object f1777d;

    /* renamed from: e */
    public final /* synthetic */ Object f1778e;

    public /* synthetic */ C0510d(int i, Object obj, Object obj2, Object obj3) {
        this.f1775b = i;
        this.f1777d = obj;
        this.f1776c = obj2;
        this.f1778e = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.facebook.internal.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: yb0.d$a} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r0v52, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* JADX WARNING: type inference failed for: r3v40 */
    /* JADX WARNING: type inference failed for: r3v41 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f1775b
            r1 = 1
            r2 = 0
            r3 = 0
            switch(r0) {
                case 0: goto L_0x02f6;
                case 1: goto L_0x016b;
                case 2: goto L_0x015b;
                case 3: goto L_0x0138;
                case 4: goto L_0x0127;
                case 5: goto L_0x0087;
                case 6: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0333
        L_0x000a:
            java.lang.Object r0 = r10.f1777d
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView r0 = (com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView) r0
            java.lang.Object r4 = r10.f1776c
            mc0.d r4 = (mc0.C12912d) r4
            java.lang.Object r5 = r10.f1778e
            yb0.d r5 = (yb0.C13295d) r5
            java.lang.String r6 = "$bannerView"
            mf0.C24362h.m61211f(r0, r6)
            java.lang.String r6 = "$bannerInfo"
            mf0.C24362h.m61211f(r4, r6)
            java.lang.String r6 = "this$0"
            mf0.C24362h.m61211f(r5, r6)
            com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.m5802h(r0, r2)
            boolean r6 = r0.mo11049d()
            if (r6 != 0) goto L_0x0086
            r0.mo11051f()
            android.content.Context r0 = wb0.C13233c.f32842a
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r0 = r4.f31966b
            if (r0 != 0) goto L_0x003a
            r0 = r3
            goto L_0x003e
        L_0x003a:
            com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType r0 = r0.mo11114i()
        L_0x003e:
            boolean r0 = wb0.C13233c.m33339h(r0)
            if (r0 != 0) goto L_0x005b
            android.view.ViewGroup r0 = r4.f31973i
            if (r0 != 0) goto L_0x0049
            goto L_0x0086
        L_0x0049:
            r1 = 8
            r0.setVisibility(r1)
            r0.setVisibility(r2)
            boolean r1 = r0 instanceof kc0.C12844i
            if (r1 == 0) goto L_0x0086
            kc0.i r0 = (kc0.C12844i) r0
            r0.mo39696q()
            goto L_0x0086
        L_0x005b:
            java.util.Map<java.lang.String, yb0.d$a> r0 = r5.f32994k
            if (r0 != 0) goto L_0x0060
            goto L_0x0069
        L_0x0060:
            java.lang.String r2 = r4.f31965a
            java.lang.Object r0 = r0.get(r2)
            r3 = r0
            yb0.d$a r3 = (yb0.C13295d.C13296a) r3
        L_0x0069:
            if (r3 != 0) goto L_0x006c
            goto L_0x0086
        L_0x006c:
            gc0.b r0 = r3.f33001c
            if (r0 != 0) goto L_0x0071
            goto L_0x0086
        L_0x0071:
            android.widget.FrameLayout r2 = r0.f31431h
            if (r2 != 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            r2.requestLayout()
        L_0x0079:
            android.widget.FrameLayout r2 = r0.f31432i
            if (r2 != 0) goto L_0x007e
            goto L_0x0086
        L_0x007e:
            gc0.a r3 = new gc0.a
            r3.<init>(r0, r2, r1)
            r2.post(r3)
        L_0x0086:
            return
        L_0x0087:
            java.lang.Object r0 = r10.f1777d
            c70.i$f r0 = (c70.C13756i.C13762f) r0
            java.lang.Object r2 = r10.f1776c
            c70.i r2 = (c70.C13756i) r2
            java.lang.Object r3 = r10.f1778e
            c70.i$j r3 = (c70.C13756i.C13766j) r3
            java.util.concurrent.atomic.AtomicLong r4 = c70.C13756i.C13762f.f33885j
            boolean r4 = r0.mo40699f()
            if (r4 != 0) goto L_0x0126
            java.lang.String r4 = r0.f33887c
            com.moovit.request.RequestOptions r0 = r0.f33889e
            r2.getClass()
            wz.c<?, ?> r5 = r3.f33899a
            boolean r6 = r3.mo40688d()
            if (r6 != 0) goto L_0x00d4
            boolean r0 = r0.f42909f
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r5.mo21057B()
            if (r0 != 0) goto L_0x00ba
            s0.f<java.lang.String, c70.i$j> r0 = r2.f33873g
            r0.put(r4, r3)
            goto L_0x00d4
        L_0x00ba:
            s0.f<java.lang.String, c70.i$j> r0 = r2.f33873g
            java.lang.Object r0 = r0.get(r4)
            c70.i$c r0 = (c70.C13756i.C13759c) r0
            if (r0 != 0) goto L_0x00cf
            s0.f<java.lang.String, c70.i$j> r0 = r2.f33873g
            c70.i$c r6 = new c70.i$c
            r6.<init>(r5, r3)
            r0.put(r4, r6)
            goto L_0x00d4
        L_0x00cf:
            java.util.ArrayList r0 = r0.f33883b
            r0.add(r3)
        L_0x00d4:
            boolean r0 = r3.mo40688d()
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r5.mo21057B()
            if (r0 == 0) goto L_0x00e5
            s0.f<java.lang.String, c70.i$j> r0 = r2.f33873g
            r0.remove(r4)
        L_0x00e5:
            c70.i$h r0 = r2.f33869c
            monitor-enter(r0)
            com.moovit.commons.utils.collections.CollectionHashMap$ArrayListHashMap<java.lang.String, c70.i$l> r5 = r0.f33896a     // Catch:{ all -> 0x0123 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x0123 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0123 }
            com.moovit.commons.utils.collections.CollectionHashMap$ArrayListHashMap<java.lang.String, c70.i$l> r6 = r0.f33897b     // Catch:{ all -> 0x0123 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ all -> 0x0123 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0123 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0123 }
            r7.<init>()     // Catch:{ all -> 0x0123 }
            if (r5 == 0) goto L_0x0102
            r7.addAll(r5)     // Catch:{ all -> 0x0123 }
        L_0x0102:
            if (r6 == 0) goto L_0x0107
            r7.addAll(r6)     // Catch:{ all -> 0x0123 }
        L_0x0107:
            monitor-exit(r0)
            r2.mo40686i(r3, r7, r1)
            boolean r0 = r3.mo40689e()
            if (r0 == 0) goto L_0x0126
            c70.i$h r0 = r2.f33869c
            monitor-enter(r0)
            com.moovit.commons.utils.collections.CollectionHashMap$ArrayListHashMap<java.lang.String, c70.i$l> r1 = r0.f33896a     // Catch:{ all -> 0x0120 }
            r1.remove(r4)     // Catch:{ all -> 0x0120 }
            com.moovit.commons.utils.collections.CollectionHashMap$ArrayListHashMap<java.lang.String, c70.i$l> r1 = r0.f33897b     // Catch:{ all -> 0x0120 }
            r1.remove(r4)     // Catch:{ all -> 0x0120 }
            monitor-exit(r0)
            goto L_0x0126
        L_0x0120:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0123:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0126:
            return
        L_0x0127:
            java.lang.Object r0 = r10.f1777d
            jl.a r0 = (p584jl.C17885a) r0
            r0.getClass()     // Catch:{ IOException -> 0x012f }
            goto L_0x0137
        L_0x012f:
            r0 = move-exception
            de.f r1 = p435de.C16596f.m42113a()
            r1.mo49364c(r0)
        L_0x0137:
            return
        L_0x0138:
            java.lang.Object r0 = r10.f1777d
            rf.d r0 = (p766rf.C19260d) r0
            java.lang.Object r1 = r10.f1776c
            com.google.firebase.perf.v1.f r1 = (com.google.firebase.perf.p414v1.C14520f) r1
            java.lang.Object r2 = r10.f1778e
            com.google.firebase.perf.v1.ApplicationProcessState r2 = (com.google.firebase.perf.p414v1.ApplicationProcessState) r2
            lf.a r3 = p766rf.C19260d.f48933s
            r0.getClass()
            com.google.firebase.perf.v1.g$b r3 = com.google.firebase.perf.p414v1.C14523g.m36191z()
            r3.mo43956p()
            MessageType r4 = r3.f36809c
            com.google.firebase.perf.v1.g r4 = (com.google.firebase.perf.p414v1.C14523g) r4
            com.google.firebase.perf.p414v1.C14523g.m36188u(r4, r1)
            r0.mo51681c(r3, r2)
            return
        L_0x015b:
            java.lang.Object r0 = r10.f1777d
            com.google.firebase.perf.session.gauges.GaugeManager r0 = (com.google.firebase.perf.session.gauges.GaugeManager) r0
            java.lang.Object r1 = r10.f1776c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r10.f1778e
            com.google.firebase.perf.v1.ApplicationProcessState r2 = (com.google.firebase.perf.p414v1.ApplicationProcessState) r2
            r0.lambda$startCollectingGauges$3(r1, r2)
            return
        L_0x016b:
            java.lang.Object r0 = r10.f1777d
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r4 = r10.f1776c
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.f1778e
            java.lang.String r5 = (java.lang.String) r5
            com.facebook.internal.FetchedAppSettingsManager r6 = com.facebook.internal.FetchedAppSettingsManager.f8592a
            java.lang.String r6 = "$context"
            mf0.C24362h.m61211f(r0, r6)
            java.lang.String r6 = "$settingsKey"
            mf0.C24362h.m61211f(r4, r6)
            java.lang.String r6 = "$applicationId"
            mf0.C24362h.m61211f(r5, r6)
            java.lang.String r6 = "com.facebook.internal.preferences.APP_SETTINGS"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r6, r2)
            java.lang.String r6 = r0.getString(r4, r3)
            boolean r7 = com.facebook.internal.C2397f0.m6292A(r6)
            java.lang.String r8 = "Required value was null."
            if (r7 != 0) goto L_0x01bd
            if (r6 == 0) goto L_0x01b3
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01a2 }
            r7.<init>(r6)     // Catch:{ JSONException -> 0x01a2 }
            goto L_0x01a7
        L_0x01a2:
            com.facebook.internal.f0 r6 = com.facebook.internal.C2397f0.f8630a
            a8.o r6 = p009a8.C0115o.f331a
            r7 = r3
        L_0x01a7:
            if (r7 == 0) goto L_0x01bd
            com.facebook.internal.FetchedAppSettingsManager r3 = com.facebook.internal.FetchedAppSettingsManager.f8592a
            r3.getClass()
            com.facebook.internal.s r3 = com.facebook.internal.FetchedAppSettingsManager.m6263d(r5, r7)
            goto L_0x01bd
        L_0x01b3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x01bd:
            com.facebook.internal.FetchedAppSettingsManager r6 = com.facebook.internal.FetchedAppSettingsManager.f8592a
            r6.getClass()
            org.json.JSONObject r6 = com.facebook.internal.FetchedAppSettingsManager.m6260a()
            com.facebook.internal.FetchedAppSettingsManager.m6263d(r5, r6)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r6 = r6.toString()
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r6)
            r0.apply()
            if (r3 == 0) goto L_0x01ea
            java.lang.String r0 = r3.f8717j
            boolean r3 = com.facebook.internal.FetchedAppSettingsManager.f8597f
            if (r3 != 0) goto L_0x01ea
            if (r0 == 0) goto L_0x01ea
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x01ea
            com.facebook.internal.FetchedAppSettingsManager.f8597f = r1
        L_0x01ea:
            com.facebook.internal.r r0 = com.facebook.internal.C2427r.f8702a
            r0.getClass()
            org.json.JSONObject r0 = com.facebook.internal.C2427r.m6379a()
            android.content.Context r3 = p009a8.C0115o.m210a()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r5
            java.lang.String r6 = "com.facebook.internal.APP_GATEKEEPERS.%s"
            java.lang.String r7 = "java.lang.String.format(format, *args)"
            java.lang.String r1 = p379.C13555b.m33971j(r4, r1, r6, r7)
            java.lang.String r4 = "com.facebook.internal.preferences.APP_GATEKEEPERS"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r2)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r4 = r0.toString()
            android.content.SharedPreferences$Editor r1 = r3.putString(r1, r4)
            r1.apply()
            com.facebook.internal.C2427r.m6382d(r5, r0)
            j8.e r0 = p135j8.C5399e.f17732a
            android.content.Context r0 = p009a8.C0115o.m210a()
            java.lang.String r1 = p009a8.C0115o.m211b()
            boolean r3 = p009a8.C0098d0.m169b()
            if (r3 == 0) goto L_0x02de
            boolean r3 = r0 instanceof android.app.Application
            if (r3 == 0) goto L_0x02de
            android.app.Application r0 = (android.app.Application) r0
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = com.facebook.appevents.C2338j.f8537c
            boolean r3 = p009a8.C0115o.m217h()
            if (r3 == 0) goto L_0x02d6
            com.facebook.appevents.b r3 = com.facebook.appevents.C2317b.f8487a
            boolean r3 = com.facebook.appevents.C2317b.f8490d
            if (r3 == 0) goto L_0x0240
            goto L_0x0257
        L_0x0240:
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = com.facebook.appevents.C2338j.m6206b()
            if (r3 != 0) goto L_0x0249
            com.facebook.appevents.C2338j.C2339a.m6215d()
        L_0x0249:
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = com.facebook.appevents.C2338j.m6206b()
            if (r3 == 0) goto L_0x02cc
            com.facebook.appevents.a r4 = new com.facebook.appevents.a
            r4.<init>(r2)
            r3.execute(r4)
        L_0x0257:
            com.facebook.appevents.s r2 = com.facebook.appevents.C2355s.f8576a
            java.lang.Class<com.facebook.appevents.s> r2 = com.facebook.appevents.C2355s.class
            boolean r3 = p262t8.C6606a.m15601b(r2)
            if (r3 == 0) goto L_0x0262
            goto L_0x0275
        L_0x0262:
            java.util.concurrent.atomic.AtomicBoolean r3 = com.facebook.appevents.C2355s.f8578c     // Catch:{ all -> 0x0271 }
            boolean r3 = r3.get()     // Catch:{ all -> 0x0271 }
            if (r3 == 0) goto L_0x026b
            goto L_0x0275
        L_0x026b:
            com.facebook.appevents.s r3 = com.facebook.appevents.C2355s.f8576a     // Catch:{ all -> 0x0271 }
            r3.mo12517b()     // Catch:{ all -> 0x0271 }
            goto L_0x0275
        L_0x0271:
            r3 = move-exception
            p262t8.C6606a.m15600a(r2, r3)
        L_0x0275:
            a8.o r2 = p009a8.C0115o.f331a
            java.lang.Class<a8.o> r2 = p009a8.C0115o.class
            boolean r3 = p262t8.C6606a.m15601b(r2)
            if (r3 == 0) goto L_0x0280
            goto L_0x02c8
        L_0x0280:
            android.content.Context r3 = r0.getApplicationContext()     // Catch:{ all -> 0x02c4 }
            java.util.concurrent.Executor r4 = p009a8.C0115o.m212c()     // Catch:{ all -> 0x02c4 }
            y.u r6 = new y.u     // Catch:{ all -> 0x02c4 }
            r7 = 9
            r6.<init>(r7, r3, r1)     // Catch:{ all -> 0x02c4 }
            r4.execute(r6)     // Catch:{ all -> 0x02c4 }
            com.facebook.internal.FeatureManager r3 = com.facebook.internal.FeatureManager.f8588a     // Catch:{ all -> 0x02c4 }
            com.facebook.internal.FeatureManager$Feature r3 = com.facebook.internal.FeatureManager.Feature.OnDeviceEventProcessing     // Catch:{ all -> 0x02c4 }
            boolean r3 = com.facebook.internal.FeatureManager.m6257c(r3)     // Catch:{ all -> 0x02c4 }
            if (r3 == 0) goto L_0x02c8
            boolean r3 = p159l8.C5639a.m13920a()     // Catch:{ all -> 0x02c4 }
            if (r3 == 0) goto L_0x02c8
            java.lang.String r3 = "com.facebook.sdk.attributionTracking"
            java.lang.Class<l8.a> r4 = p159l8.C5639a.class
            boolean r6 = p262t8.C6606a.m15601b(r4)     // Catch:{ all -> 0x02c4 }
            if (r6 == 0) goto L_0x02ad
            goto L_0x02c8
        L_0x02ad:
            android.content.Context r6 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x02bf }
            java.util.concurrent.Executor r7 = p009a8.C0115o.m212c()     // Catch:{ all -> 0x02bf }
            androidx.emoji2.text.g r8 = new androidx.emoji2.text.g     // Catch:{ all -> 0x02bf }
            r9 = 3
            r8.<init>(r9, r6, r3, r1)     // Catch:{ all -> 0x02bf }
            r7.execute(r8)     // Catch:{ all -> 0x02bf }
            goto L_0x02c8
        L_0x02bf:
            r3 = move-exception
            p262t8.C6606a.m15600a(r4, r3)     // Catch:{ all -> 0x02c4 }
            goto L_0x02c8
        L_0x02c4:
            r3 = move-exception
            p262t8.C6606a.m15600a(r2, r3)
        L_0x02c8:
            p135j8.C5396c.m13499b(r0, r1)
            goto L_0x02de
        L_0x02cc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x02d6:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r1 = "The Facebook sdk must be initialized before calling activateApp"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02de:
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r0 = com.facebook.internal.FetchedAppSettingsManager.f8595d
            j$.util.concurrent.ConcurrentHashMap r1 = com.facebook.internal.FetchedAppSettingsManager.f8594c
            boolean r1 = r1.containsKey(r5)
            if (r1 == 0) goto L_0x02eb
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.SUCCESS
            goto L_0x02ed
        L_0x02eb:
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR
        L_0x02ed:
            r0.set(r1)
            com.facebook.internal.FetchedAppSettingsManager r0 = com.facebook.internal.FetchedAppSettingsManager.f8592a
            r0.mo12533e()
            return
        L_0x02f6:
            java.lang.Object r0 = r10.f1777d
            androidx.camera.camera2.internal.Camera2CameraImpl r0 = (androidx.camera.camera2.internal.Camera2CameraImpl) r0
            java.lang.Object r1 = r10.f1776c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r10.f1778e
            androidx.camera.core.impl.SessionConfig r3 = (androidx.camera.core.impl.SessionConfig) r3
            r0.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Use case "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = " RESET"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.mo2251j(r4)
            androidx.camera.core.impl.q r4 = r0.f1685b
            r4.mo2507d(r1, r3)
            r0.mo2259t(r2)
            r0.mo2234A()
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = r0.f1689f
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED
            if (r1 != r2) goto L_0x0332
            r0.mo2256q()
        L_0x0332:
            return
        L_0x0333:
            java.lang.Object r0 = r10.f1777d
            com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl r0 = (com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl) r0
            java.lang.Object r1 = r10.f1776c
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            java.lang.Object r2 = r10.f1778e
            com.veriff.sdk.camera.core.impl.CameraCaptureCallback r2 = (com.veriff.sdk.camera.core.impl.CameraCaptureCallback) r2
            r0.lambda$addSessionCameraCaptureCallback$9(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0510d.run():void");
    }
}

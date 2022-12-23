package p304x;

import androidx.camera.core.impl.CameraCaptureFailure;
import p066e0.C4424e;

/* renamed from: x.e */
public final /* synthetic */ class C7041e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f21901b;

    /* renamed from: c */
    public final /* synthetic */ Object f21902c;

    /* renamed from: d */
    public final /* synthetic */ Object f21903d;

    public /* synthetic */ C7041e(int i, Object obj, Object obj2) {
        this.f21901b = i;
        this.f21903d = obj;
        this.f21902c = obj2;
    }

    public /* synthetic */ C7041e(C4424e eVar, CameraCaptureFailure cameraCaptureFailure) {
        this.f21901b = 1;
        this.f21902c = eVar;
        this.f21903d = cameraCaptureFailure;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fe, code lost:
        p262t8.C6606a.m15600a(r2, r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f21901b
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L_0x032a;
                case 1: goto L_0x031e;
                case 2: goto L_0x030f;
                case 3: goto L_0x0301;
                case 4: goto L_0x023c;
                case 5: goto L_0x0008;
                case 6: goto L_0x0230;
                case 7: goto L_0x0226;
                case 8: goto L_0x0202;
                case 9: goto L_0x01a2;
                case 10: goto L_0x0192;
                case 11: goto L_0x0008;
                case 12: goto L_0x0182;
                case 13: goto L_0x016c;
                case 14: goto L_0x015e;
                case 15: goto L_0x0129;
                case 16: goto L_0x007e;
                case 17: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x033f
        L_0x000a:
            java.lang.Object r0 = r7.f21903d
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.lang.Object r1 = r7.f21902c
            kc0.i r1 = (kc0.C12844i) r1
            int r3 = kc0.C12844i.f31735I
            java.lang.String r3 = "$it"
            mf0.C24362h.m61211f(r0, r3)
            java.lang.String r3 = "this$0"
            mf0.C24362h.m61211f(r1, r3)
            int r3 = r0.getHeight()
            java.lang.String r4 = "getSystem().displayMetrics"
            if (r3 <= 0) goto L_0x002c
            int r3 = r0.getHeight()
            goto L_0x0049
        L_0x002c:
            kotlin.Pair<java.lang.Integer, java.lang.Integer> r3 = wb0.C13232b.f32841b
            java.lang.Object r3 = r3.mo59069d()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            mf0.C24362h.m61210e(r5, r4)
            float r3 = android.util.TypedValue.applyDimension(r2, r3, r5)
            int r3 = (int) r3
        L_0x0049:
            int r5 = r0.getWidth()
            if (r5 <= 0) goto L_0x0054
            int r0 = r0.getWidth()
            goto L_0x0071
        L_0x0054:
            kotlin.Pair<java.lang.Integer, java.lang.Integer> r0 = wb0.C13232b.f32841b
            java.lang.Object r0 = r0.mo59068c()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            mf0.C24362h.m61210e(r5, r4)
            float r0 = android.util.TypedValue.applyDimension(r2, r0, r5)
            int r0 = (int) r0
        L_0x0071:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r2.width = r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r3
            return
        L_0x007e:
            java.lang.Object r0 = r7.f21903d
            bl.f r0 = (p389bl.C13640f) r0
            java.lang.Object r2 = r7.f21902c
            mc0.a r2 = (mc0.C12909a) r2
            java.lang.String r4 = "this$0"
            mf0.C24362h.m61211f(r0, r4)
            java.lang.String r4 = "$akAdInfo"
            mf0.C24362h.m61211f(r2, r4)
            java.lang.Object r4 = r0.f33656c
            vb0.a r4 = (vb0.C13197a) r4
            java.lang.Object r5 = r0.f33655b
            java.lang.String r5 = (java.lang.String) r5
            r4.mo39560d(r5)
            hc0.c r4 = new hc0.c
            java.lang.Object r5 = r0.f33655b
            java.lang.String r5 = (java.lang.String) r5
            r4.<init>(r5, r1)
            java.lang.Object r5 = r0.f33656c
            vb0.a r5 = (vb0.C13197a) r5
            r4.f31516c = r5
            java.lang.Object r0 = r0.f33660g
            vb0.e r0 = (vb0.C13201e) r0
            r4.f31517d = r0
            android.content.Context r0 = wb0.C13233c.f32842a
            java.lang.String r0 = r4.f31514a
            mc0.d r0 = wb0.C13233c.m33348q(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x0128
        L_0x00bd:
            java.lang.String r5 = r4.f31514a
            android.view.ViewGroup r5 = wb0.C13233c.m33334c(r5)
            if (r5 != 0) goto L_0x00c6
            goto L_0x0128
        L_0x00c6:
            com.umo.ads.u.zzr r5 = new com.umo.ads.u.zzr
            r5.<init>(r3)
            java.lang.String r3 = r4.f31514a
            java.lang.String r6 = "<set-?>"
            mf0.C24362h.m61211f(r3, r6)
            r5.f30879b = r3
            java.lang.String r3 = r2.f31950e
            r5.f30880c = r3
            java.lang.String r3 = r2.f31951f
            r5.f30881d = r3
            java.lang.String r2 = r2.f31952g
            r5.f30882e = r2
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r0 = r0.f31966b
            if (r0 != 0) goto L_0x00e6
            r0 = r1
            goto L_0x00ea
        L_0x00e6:
            com.cubic.umo.ad.ext.types.UMOAdKitInlineVideoPlayMode r0 = r0.mo11125t()
        L_0x00ea:
            if (r0 != 0) goto L_0x00ee
            com.cubic.umo.ad.ext.types.UMOAdKitInlineVideoPlayMode r0 = wb0.C13231a.f32838b
        L_0x00ee:
            mf0.C24362h.m61211f(r0, r6)
            r5.f30883f = r0
            com.umo.ads.u.zzc r0 = com.umo.ads.p350u.zzc.INLINE
            mf0.C24362h.m61211f(r0, r6)
            r5.f30884g = r0
            gc0.b r0 = new gc0.b
            r0.<init>(r5, r4)
            r4.f31518e = r0
            vb0.e r2 = r4.f31517d
            if (r2 != 0) goto L_0x0106
            goto L_0x010b
        L_0x0106:
            java.lang.String r3 = r4.f31514a
            r2.mo39573q(r3, r0)
        L_0x010b:
            gc0.b r0 = r4.f31518e
            if (r0 != 0) goto L_0x0110
            goto L_0x0114
        L_0x0110:
            com.cubic.umo.ad.ext.types.UMOAdKitError r1 = r0.mo39530k()
        L_0x0114:
            com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.NONE
            if (r1 == r0) goto L_0x0128
            vb0.e r0 = r4.f31517d
            if (r0 != 0) goto L_0x011d
            goto L_0x0128
        L_0x011d:
            java.lang.String r2 = r4.f31514a
            if (r1 != 0) goto L_0x0123
            com.cubic.umo.ad.ext.types.UMOAdKitError r1 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
        L_0x0123:
            com.umo.ads.c.zzd r3 = com.umo.ads.p342c.zzd.NONE
            r0.mo39559c(r2, r1, r3)
        L_0x0128:
            return
        L_0x0129:
            java.lang.Object r0 = r7.f21903d
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r7.f21902c
            com.moovit.gcm.popup.GcmPopup r1 = (com.moovit.gcm.popup.GcmPopup) r1
            java.lang.String r2 = com.moovit.gcm.GcmDismissIntentService.f41488b
            k10.a r2 = k10.C17993a.f46075a
            monitor-enter(r2)
            ce0.C21100e.m49355o()     // Catch:{ all -> 0x015b }
            java.util.List r3 = k10.C17993a.m44616d(r0)     // Catch:{ all -> 0x015b }
            if (r1 == 0) goto L_0x0159
            boolean r4 = r3.remove(r1)     // Catch:{ all -> 0x015b }
            if (r4 == 0) goto L_0x0159
            com.moovit.gcm.payload.GcmPayload r4 = r1.f41609c     // Catch:{ all -> 0x015b }
            r4.mo47977c()     // Catch:{ all -> 0x015b }
            k10.C17993a.m44623m(r0, r3)     // Catch:{ all -> 0x015b }
            k10.C17993a.m44618f(r0, r1)     // Catch:{ all -> 0x015b }
            k10.C17993a.m44622l(r3)     // Catch:{ all -> 0x015b }
            k10.C17993a.m44619g(r0, r3)     // Catch:{ all -> 0x015b }
            k10.C17993a.m44621i(r0, r1)     // Catch:{ all -> 0x015b }
        L_0x0159:
            monitor-exit(r2)
            return
        L_0x015b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x015e:
            java.lang.Object r0 = r7.f21903d
            rv.j r0 = (p782rv.C19351j) r0
            java.lang.Object r1 = r7.f21902c
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = p782rv.C19351j.f49235u
            r0.startActivity(r1)
            return
        L_0x016c:
            java.lang.Object r0 = r7.f21903d
            qf.a r0 = (p744qf.C19114a) r0
            java.lang.Object r1 = r7.f21902c
            com.google.firebase.perf.util.Timer r1 = (com.google.firebase.perf.util.Timer) r1
            lf.a r2 = p744qf.C19114a.f48588g
            com.google.firebase.perf.v1.d r1 = r0.mo51550b(r1)
            if (r1 == 0) goto L_0x0181
            java.util.concurrent.ConcurrentLinkedQueue<com.google.firebase.perf.v1.d> r0 = r0.f48590a
            r0.add(r1)
        L_0x0181:
            return
        L_0x0182:
            java.lang.Object r0 = r7.f21903d
            vb.n$a r0 = (p290vb.C6953n.C6954a) r0
            java.lang.Object r1 = r7.f21902c
            java.lang.Exception r1 = (java.lang.Exception) r1
            vb.n r0 = r0.f21703b
            int r2 = p277ub.C6774a0.f20959a
            r0.mo20409F(r1)
            return
        L_0x0192:
            java.lang.Object r0 = r7.f21903d
            com.google.android.exoplayer2.audio.a$a r0 = (com.google.android.exoplayer2.audio.C3876a.C3877a) r0
            java.lang.Object r1 = r7.f21902c
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.exoplayer2.audio.a r0 = r0.f13480b
            int r2 = p277ub.C6774a0.f20959a
            r0.mo15879v(r1)
            return
        L_0x01a2:
            java.lang.Object r0 = r7.f21903d
            com.facebook.appevents.AccessTokenAppIdPair r0 = (com.facebook.appevents.AccessTokenAppIdPair) r0
            java.lang.Object r1 = r7.f21902c
            com.facebook.appevents.AppEvent r1 = (com.facebook.appevents.AppEvent) r1
            java.lang.String r2 = com.facebook.appevents.C2335g.f8528a
            java.lang.Class<com.facebook.appevents.g> r2 = com.facebook.appevents.C2335g.class
            boolean r3 = p262t8.C6606a.m15601b(r2)
            if (r3 == 0) goto L_0x01b5
            goto L_0x0201
        L_0x01b5:
            java.lang.String r3 = "$accessTokenAppId"
            mf0.C24362h.m61211f(r0, r3)     // Catch:{ all -> 0x01fd }
            java.lang.String r3 = "$appEvent"
            mf0.C24362h.m61211f(r1, r3)     // Catch:{ all -> 0x01fd }
            androidx.lifecycle.u r3 = com.facebook.appevents.C2335g.f8530c     // Catch:{ all -> 0x01fd }
            monitor-enter(r3)     // Catch:{ all -> 0x01fd }
            com.facebook.appevents.q r0 = r3.mo4332g(r0)     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x01c9
            goto L_0x01cc
        L_0x01c9:
            r0.mo12510a(r1)     // Catch:{ all -> 0x01fa }
        L_0x01cc:
            monitor-exit(r3)     // Catch:{ all -> 0x01fd }
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.facebook.appevents.C2338j.f8537c     // Catch:{ all -> 0x01fd }
            com.facebook.appevents.AppEventsLogger$FlushBehavior r0 = com.facebook.appevents.C2338j.C2339a.m6213b()     // Catch:{ all -> 0x01fd }
            com.facebook.appevents.AppEventsLogger$FlushBehavior r1 = com.facebook.appevents.AppEventsLogger.FlushBehavior.EXPLICIT_ONLY     // Catch:{ all -> 0x01fd }
            if (r0 == r1) goto L_0x01e7
            androidx.lifecycle.u r0 = com.facebook.appevents.C2335g.f8530c     // Catch:{ all -> 0x01fd }
            int r0 = r0.mo4330e()     // Catch:{ all -> 0x01fd }
            int r1 = com.facebook.appevents.C2335g.f8529b     // Catch:{ all -> 0x01fd }
            if (r0 <= r1) goto L_0x01e7
            com.facebook.appevents.FlushReason r0 = com.facebook.appevents.FlushReason.EVENT_THRESHOLD     // Catch:{ all -> 0x01fd }
            com.facebook.appevents.C2335g.m6199d(r0)     // Catch:{ all -> 0x01fd }
            goto L_0x0201
        L_0x01e7:
            java.util.concurrent.ScheduledFuture<?> r0 = com.facebook.appevents.C2335g.f8532e     // Catch:{ all -> 0x01fd }
            if (r0 != 0) goto L_0x0201
            java.util.concurrent.ScheduledExecutorService r0 = com.facebook.appevents.C2335g.f8531d     // Catch:{ all -> 0x01fd }
            com.facebook.appevents.d r1 = com.facebook.appevents.C2335g.f8533f     // Catch:{ all -> 0x01fd }
            r3 = 15
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x01fd }
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r3, r5)     // Catch:{ all -> 0x01fd }
            com.facebook.appevents.C2335g.f8532e = r0     // Catch:{ all -> 0x01fd }
            goto L_0x0201
        L_0x01fa:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01fd }
            throw r0     // Catch:{ all -> 0x01fd }
        L_0x01fd:
            r0 = move-exception
            p262t8.C6606a.m15600a(r2, r0)
        L_0x0201:
            return
        L_0x0202:
            java.lang.Object r0 = r7.f21903d
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView r0 = (com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView) r0
            java.lang.Object r1 = r7.f21902c
            mc0.d r1 = (mc0.C12912d) r1
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView$Companion r2 = com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.f7241i
            java.lang.String r2 = "this$0"
            mf0.C24362h.m61211f(r0, r2)
            java.lang.String r2 = "$it"
            mf0.C24362h.m61211f(r1, r2)
            c7.a r0 = r0.f7243c
            if (r0 != 0) goto L_0x021c
            goto L_0x0225
        L_0x021c:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent r1 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.BANNER_PLACEHOLDER_CLICKED
            com.cubic.umo.ad.ext.types.UMOAdKitError r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.NONE
            com.moovit.umo.ads.UmoAds$b r0 = (com.moovit.umo.ads.UmoAds.C7867b) r0
            r0.mo24509a(r1, r2)
        L_0x0225:
            return
        L_0x0226:
            java.lang.Object r0 = r7.f21903d
            com.appboy.events.IEventSubscriber r0 = (com.appboy.events.IEventSubscriber) r0
            java.lang.Object r1 = r7.f21902c
            r0.trigger(r1)
            return
        L_0x0230:
            java.lang.Object r0 = r7.f21902c
            androidx.fragment.app.strictmode.Violation r0 = (androidx.fragment.app.strictmode.Violation) r0
            androidx.fragment.app.strictmode.FragmentStrictMode$b r1 = androidx.fragment.app.strictmode.FragmentStrictMode.f3849a
            java.lang.String r1 = "$violation"
            mf0.C24362h.m61211f(r0, r1)
            throw r0
        L_0x023c:
            java.lang.Object r0 = r7.f21903d
            e0.d0$a r0 = (p066e0.C4421d0.C4422a) r0
            java.lang.Object r4 = r7.f21902c
            e0.d0$b r4 = (p066e0.C4421d0.C4423b) r4
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.f15492a
            boolean r5 = r5.get()
            if (r5 != 0) goto L_0x024e
            goto L_0x0300
        L_0x024e:
            java.lang.Throwable r5 = r4.f15496b
            if (r5 != 0) goto L_0x0254
            r6 = 1
            goto L_0x0255
        L_0x0254:
            r6 = 0
        L_0x0255:
            if (r6 == 0) goto L_0x02eb
            e0.g0<? super T> r0 = r0.f15493b
            if (r5 != 0) goto L_0x025d
            r5 = 1
            goto L_0x025e
        L_0x025d:
            r5 = 0
        L_0x025e:
            if (r5 == 0) goto L_0x02e3
            T r4 = r4.f15495a
            androidx.camera.view.a r0 = (androidx.camera.view.C0655a) r0
            r0.getClass()
            androidx.camera.core.impl.CameraInternal$State r4 = (androidx.camera.core.impl.CameraInternal.State) r4
            androidx.camera.core.impl.CameraInternal$State r5 = androidx.camera.core.impl.CameraInternal.State.CLOSING
            if (r4 == r5) goto L_0x02ce
            androidx.camera.core.impl.CameraInternal$State r5 = androidx.camera.core.impl.CameraInternal.State.CLOSED
            if (r4 == r5) goto L_0x02ce
            androidx.camera.core.impl.CameraInternal$State r5 = androidx.camera.core.impl.CameraInternal.State.RELEASING
            if (r4 == r5) goto L_0x02ce
            androidx.camera.core.impl.CameraInternal$State r5 = androidx.camera.core.impl.CameraInternal.State.RELEASED
            if (r4 != r5) goto L_0x027a
            goto L_0x02ce
        L_0x027a:
            androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.OPENING
            if (r4 == r1) goto L_0x0286
            androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.OPEN
            if (r4 == r1) goto L_0x0286
            androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN
            if (r4 != r1) goto L_0x0300
        L_0x0286:
            boolean r1 = r0.f2256f
            if (r1 != 0) goto L_0x0300
            e0.m r1 = r0.f2251a
            androidx.camera.view.PreviewView$StreamState r3 = androidx.camera.view.PreviewView.StreamState.IDLE
            r0.mo2635a(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            ca.k r4 = new ca.k
            r4.<init>(r0, r1, r3)
            androidx.concurrent.futures.CallbackToFutureAdapter$c r4 = androidx.concurrent.futures.CallbackToFutureAdapter.m1884a(r4)
            h0.d r4 = p102h0.C5019d.m12842a(r4)
            n0.b r5 = new n0.b
            r5.<init>(r0)
            g0.a r6 = com.google.android.play.core.appupdate.C14226d.m35352s0()
            h0.d r4 = r4.mo20734c(r5, r6)
            n0.c r5 = new n0.c
            r5.<init>(r0)
            g0.a r6 = com.google.android.play.core.appupdate.C14226d.m35352s0()
            h0.b r4 = p102h0.C5023g.m12860h(r4, r5, r6)
            r0.f2255e = r4
            n0.d r5 = new n0.d
            r5.<init>(r0, r3, r1)
            g0.a r1 = com.google.android.play.core.appupdate.C14226d.m35352s0()
            p102h0.C5023g.m12853a(r4, r5, r1)
            r0.f2256f = r2
            goto L_0x0300
        L_0x02ce:
            androidx.camera.view.PreviewView$StreamState r2 = androidx.camera.view.PreviewView.StreamState.IDLE
            r0.mo2635a(r2)
            boolean r2 = r0.f2256f
            if (r2 == 0) goto L_0x0300
            r0.f2256f = r3
            h0.d r2 = r0.f2255e
            if (r2 == 0) goto L_0x0300
            r2.cancel(r3)
            r0.f2255e = r1
            goto L_0x0300
        L_0x02e3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Result contains an error. Does not contain a value."
            r0.<init>(r1)
            throw r0
        L_0x02eb:
            r5.getClass()
            e0.g0<? super T> r0 = r0.f15493b
            androidx.camera.view.a r0 = (androidx.camera.view.C0655a) r0
            h0.d r2 = r0.f2255e
            if (r2 == 0) goto L_0x02fb
            r2.cancel(r3)
            r0.f2255e = r1
        L_0x02fb:
            androidx.camera.view.PreviewView$StreamState r1 = androidx.camera.view.PreviewView.StreamState.IDLE
            r0.mo2635a(r1)
        L_0x0300:
            return
        L_0x0301:
            java.lang.Object r0 = r7.f21903d
            androidx.camera.camera2.internal.m r0 = (androidx.camera.camera2.internal.C0522m) r0
            java.lang.Object r1 = r7.f21902c
            androidx.camera.camera2.internal.l r1 = (androidx.camera.camera2.internal.C0520l) r1
            androidx.camera.camera2.internal.l$a r0 = r0.f1805f
            r0.mo2301k(r1)
            return
        L_0x030f:
            java.lang.Object r0 = r7.f21903d
            android.view.Surface r0 = (android.view.Surface) r0
            java.lang.Object r1 = r7.f21902c
            android.graphics.SurfaceTexture r1 = (android.graphics.SurfaceTexture) r1
            r0.release()
            r1.release()
            return
        L_0x031e:
            java.lang.Object r0 = r7.f21902c
            e0.e r0 = (p066e0.C4424e) r0
            java.lang.Object r1 = r7.f21903d
            androidx.camera.core.impl.CameraCaptureFailure r1 = (androidx.camera.core.impl.CameraCaptureFailure) r1
            r0.mo19946c(r1)
            return
        L_0x032a:
            java.lang.Object r0 = r7.f21903d
            x.q r0 = (p304x.C7090q) r0
            java.lang.Object r1 = r7.f21902c
            e0.e r1 = (p066e0.C4424e) r1
            x.q$a r0 = r0.f22057x
            java.util.HashSet r2 = r0.f22058a
            r2.remove(r1)
            android.util.ArrayMap r0 = r0.f22059b
            r0.remove(r1)
            return
        L_0x033f:
            java.lang.Object r0 = r7.f21903d
            com.veriff.sdk.camera.camera2.interop.Camera2CameraControl r0 = (com.veriff.sdk.camera.camera2.interop.Camera2CameraControl) r0
            java.lang.Object r1 = r7.f21902c
            androidx.concurrent.futures.CallbackToFutureAdapter$a r1 = (androidx.concurrent.futures.CallbackToFutureAdapter.C0673a) r1
            r0.lambda$clearCaptureRequestOptions$5(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p304x.C7041e.run():void");
    }
}

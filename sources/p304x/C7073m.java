package p304x;

/* renamed from: x.m */
public final /* synthetic */ class C7073m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f21988b;

    /* renamed from: c */
    public final /* synthetic */ Object f21989c;

    public /* synthetic */ C7073m(Object obj, int i) {
        this.f21988b = i;
        this.f21989c = obj;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x0245 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.f21988b
            r1 = 0
            r2 = 0
            switch(r0) {
                case 0: goto L_0x01c0;
                case 1: goto L_0x01b8;
                case 2: goto L_0x01a4;
                case 3: goto L_0x019c;
                case 4: goto L_0x0194;
                case 5: goto L_0x0181;
                case 6: goto L_0x0152;
                case 7: goto L_0x0143;
                case 8: goto L_0x009f;
                case 9: goto L_0x0050;
                case 10: goto L_0x0044;
                case 11: goto L_0x003c;
                case 12: goto L_0x0032;
                case 13: goto L_0x0027;
                case 14: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x01c8
        L_0x0009:
            java.lang.Object r0 = r15.f21989c
            gc0.b r0 = (gc0.C12724b) r0
            java.lang.String r2 = "this$0"
            mf0.C24362h.m61211f(r0, r2)
            lc0.c r2 = r0.f31441r
            if (r2 != 0) goto L_0x0018
            goto L_0x0024
        L_0x0018:
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x001f
            goto L_0x0024
        L_0x001f:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.removeView(r2)
        L_0x0024:
            r0.f31441r = r1
            return
        L_0x0027:
            java.lang.Object r0 = r15.f21989c
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView r0 = (com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView) r0
            if (r0 != 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            nc0.C12952c.m32797g(r0)
        L_0x0031:
            return
        L_0x0032:
            java.lang.Object r0 = r15.f21989c
            com.moovit.location.mappicker.MapLocationPickerActivity$c r0 = (com.moovit.location.mappicker.MapLocationPickerActivity.C16208c) r0
            android.view.View r0 = r0.f42287b
            r0.setVisibility(r2)
            return
        L_0x003c:
            java.lang.Object r0 = r15.f21989c
            com.moovit.app.navigation.MultiLegNavActivity r0 = (com.moovit.app.navigation.MultiLegNavActivity) r0
            r0.supportInvalidateOptionsMenu()
            return
        L_0x0044:
            java.lang.Object r0 = r15.f21989c
            nt.e r0 = (p687nt.C18595e) r0
            android.view.View r0 = r0.f47356g
            r1 = 8
            r0.setVisibility(r1)
            return
        L_0x0050:
            java.lang.Object r0 = r15.f21989c
            qs.g r0 = (p755qs.C19170g) r0
            int r2 = p755qs.C19170g.f48751j
            android.content.Context r2 = r0.requireContext()
            boolean r3 = r0.isResumed()
            if (r3 == 0) goto L_0x009e
            com.google.firebase.analytics.FirebaseAnalytics r3 = com.google.firebase.analytics.FirebaseAnalytics.getInstance(r2)
            java.lang.String r4 = "privacy_update_dialog_learn_more_click"
            r3.mo43247a(r1, r4)
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "learn_more_clicked"
            r1.mo49939g(r3, r4)
            hq.b r1 = r1.mo49933a()
            r0.mo22564R1(r1)
            boolean r1 = r0.mo51600T1()
            if (r1 == 0) goto L_0x0089
            java.lang.String r1 = "PRIVACY_AGREED_BY_LEARN_MORE"
            r0.mo51599S1(r2, r1)
        L_0x0089:
            r1 = 2131888501(0x7f120975, float:1.941164E38)
            java.lang.String r1 = r0.getString(r1)
            r3 = 2131888496(0x7f120970, float:1.9411629E38)
            java.lang.String r3 = r0.getString(r3)
            android.content.Intent r1 = com.moovit.web.WebViewActivity.m18168y2(r2, r1, r3)
            r0.startActivity(r1)
        L_0x009e:
            return
        L_0x009f:
            java.lang.Object r0 = r15.f21989c
            com.moovit.app.datacollection.ForegroundWifiScanner r0 = (com.moovit.app.datacollection.ForegroundWifiScanner) r0
            int r3 = com.moovit.app.datacollection.ForegroundWifiScanner.f37916f
            android.content.Context r3 = r0.getApplicationContext()
            java.lang.String r4 = "wifi"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.net.wifi.WifiManager r3 = (android.net.wifi.WifiManager) r3
            if (r3 == 0) goto L_0x0142
            uz.g r4 = r0.f37919d
            if (r4 != 0) goto L_0x00ba
            goto L_0x0142
        L_0x00ba:
            android.location.Location r4 = r4.mo50014i()
            if (r4 == 0) goto L_0x0142
            boolean r5 = p977zz.C20943i.m49052e(r4)
            if (r5 == 0) goto L_0x00c8
            goto L_0x0142
        L_0x00c8:
            java.util.List r3 = r3.getScanResults()
            e0.r0 r5 = new e0.r0
            r6 = 1
            r5.<init>(r6)
            java.util.ArrayList r1 = c00.C13720d.m34273c(r3, r1, r5)
            com.tranzmate.moovit.protocol.crowd.MVWifiScan r5 = new com.tranzmate.moovit.protocol.crowd.MVWifiScan
            long r6 = java.lang.System.currentTimeMillis()
            r5.<init>()
            r5.wifis = r1
            r5.timestamp = r6
            r5.mo26975i()
            com.tranzmate.moovit.protocol.crowd.MVDeviceLocation r1 = new com.tranzmate.moovit.protocol.crowd.MVDeviceLocation
            long r6 = r4.getTime()
            com.tranzmate.moovit.protocol.common.MVGpsLocation r8 = c70.C13749c.m34334t(r4)
            r1.<init>()
            r1.timestamp = r6
            r1.mo26815t()
            r1.location = r8
            java.lang.String r6 = r4.getProvider()
            r1.provider = r6
            boolean r6 = r4.hasSpeed()
            if (r6 == 0) goto L_0x0110
            float r6 = r4.getSpeed()
            double r6 = (double) r6
            r1.speed = r6
            r1.mo26814s()
        L_0x0110:
            boolean r6 = r4.hasBearing()
            if (r6 == 0) goto L_0x0120
            float r6 = r4.getBearing()
            double r6 = (double) r6
            r1.bearing = r6
            r1.mo26812q()
        L_0x0120:
            boolean r6 = r4.hasAltitude()
            if (r6 == 0) goto L_0x012f
            double r6 = r4.getAltitude()
            r1.altitude = r6
            r1.mo26811p()
        L_0x012f:
            r5.location = r1
            com.moovit.app.datacollection.ForegroundWifiScanner$a r1 = new com.moovit.app.datacollection.ForegroundWifiScanner$a
            r1.<init>(r0, r5)
            iq.b r0 = p567iq.C17635b.m43779f(r0)
            com.google.android.play.core.assetpacks.z0 r0 = r0.f50172b
            r0.mo42913b(r1, r2)
            r3.size()
        L_0x0142:
            return
        L_0x0143:
            java.lang.Object r0 = r15.f21989c
            com.google.firebase.messaging.c$a r0 = (com.google.firebase.messaging.C14475c.C14476a) r0
            android.content.Intent r2 = r0.f36600a
            r2.getAction()
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r0.f36601b
            r0.trySetResult(r1)
            return
        L_0x0152:
            java.lang.Object r0 = r15.f21989c
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r0 = (com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView) r0
            android.view.Surface r2 = r0.f14650i
            if (r2 == 0) goto L_0x0170
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$b> r3 = r0.f14643b
            java.util.Iterator r3 = r3.iterator()
        L_0x0160:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0170
            java.lang.Object r4 = r3.next()
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$b r4 = (com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.C4081b) r4
            r4.mo16742n()
            goto L_0x0160
        L_0x0170:
            android.graphics.SurfaceTexture r3 = r0.f14649h
            if (r3 == 0) goto L_0x0177
            r3.release()
        L_0x0177:
            if (r2 == 0) goto L_0x017c
            r2.release()
        L_0x017c:
            r0.f14649h = r1
            r0.f14650i = r1
            return
        L_0x0181:
            java.lang.Object r0 = r15.f21989c
            com.google.android.exoplayer2.ui.z r0 = (com.google.android.exoplayer2.p052ui.C4060z) r0
            android.animation.AnimatorSet r1 = r0.f14531l
            r1.start()
            d0.a1 r1 = r0.f14540u
            r2 = 2000(0x7d0, double:9.88E-321)
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r0.f14520a
            r0.postDelayed(r1, r2)
            return
        L_0x0194:
            java.lang.Object r0 = r15.f21989c
            com.appboy.push.NotificationTrampolineActivity r0 = (com.appboy.push.NotificationTrampolineActivity) r0
            r0.lambda$onResume$0()
            return
        L_0x019c:
            java.lang.Object r0 = r15.f21989c
            com.appboy.Appboy r0 = (com.appboy.Appboy) r0
            r0.m5425k()
            return
        L_0x01a4:
            java.lang.Object r0 = r15.f21989c
            androidx.core.widget.ContentLoadingProgressBar r0 = (androidx.core.widget.ContentLoadingProgressBar) r0
            r0.f3356d = r2
            boolean r1 = r0.f3357e
            if (r1 != 0) goto L_0x01b7
            long r3 = java.lang.System.currentTimeMillis()
            r0.f3354b = r3
            r0.setVisibility(r2)
        L_0x01b7:
            return
        L_0x01b8:
            java.lang.Object r0 = r15.f21989c
            androidx.concurrent.futures.CallbackToFutureAdapter$a r0 = (androidx.concurrent.futures.CallbackToFutureAdapter.C0673a) r0
            r0.mo2697b(r1)
            return
        L_0x01c0:
            java.lang.Object r0 = r15.f21989c
            x.q r0 = (p304x.C7090q) r0
            r0.mo23338q()
            return
        L_0x01c8:
            java.lang.Object r0 = r15.f21989c
            ki0.f r0 = (ki0.C23800f) r0
            java.util.concurrent.ThreadPoolExecutor r3 = ki0.C23800f.f60132g
            r0.getClass()
        L_0x01d1:
            long r3 = java.lang.System.nanoTime()
            monitor-enter(r0)
            java.util.ArrayDeque r5 = r0.f60136d     // Catch:{ all -> 0x0249 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0249 }
            r6 = -9223372036854775808
            r9 = r1
            r8 = 0
            r10 = 0
        L_0x01e1:
            boolean r11 = r5.hasNext()     // Catch:{ all -> 0x0249 }
            if (r11 == 0) goto L_0x0203
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0249 }
            ki0.e r11 = (ki0.C23799e) r11     // Catch:{ all -> 0x0249 }
            int r12 = r0.mo59047b(r11, r3)     // Catch:{ all -> 0x0249 }
            if (r12 <= 0) goto L_0x01f6
            int r10 = r10 + 1
            goto L_0x01e1
        L_0x01f6:
            int r8 = r8 + 1
            long r12 = r11.f60131q     // Catch:{ all -> 0x0249 }
            long r12 = r3 - r12
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 <= 0) goto L_0x01e1
            r9 = r11
            r6 = r12
            goto L_0x01e1
        L_0x0203:
            long r3 = r0.f60134b     // Catch:{ all -> 0x0249 }
            r11 = -1
            r13 = 0
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0220
            int r5 = r0.f60133a     // Catch:{ all -> 0x0249 }
            if (r8 <= r5) goto L_0x0212
            goto L_0x0220
        L_0x0212:
            if (r8 <= 0) goto L_0x0217
            long r3 = r3 - r6
            monitor-exit(r0)     // Catch:{ all -> 0x0249 }
            goto L_0x022c
        L_0x0217:
            if (r10 <= 0) goto L_0x021b
            monitor-exit(r0)     // Catch:{ all -> 0x0249 }
            goto L_0x022c
        L_0x021b:
            r0.f60138f = r2     // Catch:{ all -> 0x0249 }
            monitor-exit(r0)     // Catch:{ all -> 0x0249 }
            r3 = r11
            goto L_0x022c
        L_0x0220:
            java.util.ArrayDeque r3 = r0.f60136d     // Catch:{ all -> 0x0249 }
            r3.remove(r9)     // Catch:{ all -> 0x0249 }
            monitor-exit(r0)     // Catch:{ all -> 0x0249 }
            java.net.Socket r3 = r9.f60119e
            ii0.C23610d.m57797e(r3)
            r3 = r13
        L_0x022c:
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0231
            return
        L_0x0231:
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d1
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r3 / r5
            long r5 = r5 * r7
            long r3 = r3 - r5
            monitor-enter(r0)
            int r4 = (int) r3
            r0.wait(r7, r4)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x0245
        L_0x0243:
            r1 = move-exception
            goto L_0x0247
        L_0x0245:
            monitor-exit(r0)     // Catch:{ all -> 0x0243 }
            goto L_0x01d1
        L_0x0247:
            monitor-exit(r0)     // Catch:{ all -> 0x0243 }
            throw r1
        L_0x0249:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0249 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p304x.C7073m.run():void");
    }
}

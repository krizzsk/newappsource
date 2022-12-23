package p316y;

/* renamed from: y.u */
public final /* synthetic */ class C7229u implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22379b;

    /* renamed from: c */
    public final /* synthetic */ Object f22380c;

    /* renamed from: d */
    public final /* synthetic */ Object f22381d;

    public /* synthetic */ C7229u(int i, Object obj, Object obj2) {
        this.f22379b = i;
        this.f22380c = obj;
        this.f22381d = obj2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.f22379b
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L_0x01bb;
                case 1: goto L_0x019c;
                case 2: goto L_0x018e;
                case 3: goto L_0x0141;
                case 4: goto L_0x010c;
                case 5: goto L_0x00fe;
                case 6: goto L_0x00f2;
                case 7: goto L_0x00e6;
                case 8: goto L_0x00da;
                case 9: goto L_0x0045;
                case 10: goto L_0x001a;
                case 11: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x01c9
        L_0x000a:
            java.lang.Object r0 = r14.f22380c
            com.google.android.exoplayer2.drm.b$a r0 = (com.google.android.exoplayer2.drm.C3912b.C3913a) r0
            java.lang.Object r1 = r14.f22381d
            com.google.android.exoplayer2.drm.b r1 = (com.google.android.exoplayer2.drm.C3912b) r1
            int r2 = r0.f13725a
            gb.o$a r0 = r0.f13726b
            r1.mo15996e0(r2, r0)
            return
        L_0x001a:
            java.lang.Object r0 = r14.f22380c
            com.facebook.login.j r0 = (com.facebook.login.C2479j) r0
            java.lang.Object r1 = r14.f22381d
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.util.concurrent.ScheduledExecutorService r2 = com.facebook.login.C2479j.f8869d
            java.lang.Class<com.facebook.login.j> r2 = com.facebook.login.C2479j.class
            boolean r3 = p262t8.C6606a.m15601b(r2)
            if (r3 == 0) goto L_0x002d
            goto L_0x0044
        L_0x002d:
            java.lang.String r3 = "this$0"
            mf0.C24362h.m61211f(r0, r3)     // Catch:{ all -> 0x0040 }
            java.lang.String r3 = "$bundle"
            mf0.C24362h.m61211f(r1, r3)     // Catch:{ all -> 0x0040 }
            com.facebook.appevents.p r0 = r0.f8871b     // Catch:{ all -> 0x0040 }
            java.lang.String r3 = "fb_mobile_login_heartbeat"
            r0.mo12509a(r1, r3)     // Catch:{ all -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r0 = move-exception
            p262t8.C6606a.m15600a(r2, r0)
        L_0x0044:
            return
        L_0x0045:
            java.lang.Object r0 = r14.f22380c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r4 = r14.f22381d
            java.lang.String r4 = (java.lang.String) r4
            a8.o r5 = p009a8.C0115o.f331a
            java.lang.String r5 = "$applicationId"
            mf0.C24362h.m61211f(r4, r5)
            a8.o r5 = p009a8.C0115o.f331a
            java.lang.String r6 = "applicationContext"
            mf0.C24362h.m61210e(r0, r6)
            r5.getClass()
            boolean r6 = p262t8.C6606a.m15601b(r5)
            if (r6 == 0) goto L_0x0065
            goto L_0x00d9
        L_0x0065:
            com.facebook.internal.b r6 = com.facebook.internal.C2376b.f8604f     // Catch:{ Exception -> 0x00d3 }
            com.facebook.internal.b r6 = com.facebook.internal.C2376b.C2377a.m6272a(r0)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r7 = "com.facebook.sdk.attributionTracking"
            android.content.SharedPreferences r7 = r0.getSharedPreferences(r7, r1)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r8 = "ping"
            java.lang.String r8 = mf0.C24362h.m61216k(r8, r4)     // Catch:{ Exception -> 0x00d3 }
            r9 = 0
            long r9 = r7.getLong(r8, r9)     // Catch:{ Exception -> 0x00d3 }
            java.util.HashMap r11 = com.facebook.appevents.internal.AppEventsLoggerUtility.f8536a     // Catch:{ JSONException -> 0x00c8 }
            com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType r11 = com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT     // Catch:{ JSONException -> 0x00c8 }
            java.lang.String r12 = com.facebook.appevents.AppEventsLogger.C2315a.m6184a(r0)     // Catch:{ JSONException -> 0x00c8 }
            boolean r13 = p009a8.C0115o.m215f(r0)     // Catch:{ JSONException -> 0x00c8 }
            org.json.JSONObject r0 = com.facebook.appevents.internal.AppEventsLoggerUtility.m6204a(r11, r6, r12, r13, r0)     // Catch:{ JSONException -> 0x00c8 }
            java.lang.String r6 = "%s/activities"
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00d3 }
            r11[r1] = r4     // Catch:{ Exception -> 0x00d3 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r11, r2)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r1 = java.lang.String.format(r6, r1)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            mf0.C24362h.m61210e(r1, r2)     // Catch:{ Exception -> 0x00d3 }
            a8.n r2 = p009a8.C0115o.f349s     // Catch:{ Exception -> 0x00d3 }
            r2.getClass()     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r2 = com.facebook.GraphRequest.f8425j     // Catch:{ Exception -> 0x00d3 }
            com.facebook.GraphRequest r0 = com.facebook.GraphRequest.C2281c.m6138h(r3, r1, r0, r3)     // Catch:{ Exception -> 0x00d3 }
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x00d9
            a8.u r0 = r0.mo11903c()     // Catch:{ Exception -> 0x00d3 }
            com.facebook.FacebookRequestError r0 = r0.f366c     // Catch:{ Exception -> 0x00d3 }
            if (r0 != 0) goto L_0x00d9
            android.content.SharedPreferences$Editor r0 = r7.edit()     // Catch:{ Exception -> 0x00d3 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d3 }
            r0.putLong(r8, r1)     // Catch:{ Exception -> 0x00d3 }
            r0.apply()     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00d9
        L_0x00c8:
            r0 = move-exception
            com.facebook.FacebookException r1 = new com.facebook.FacebookException     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r2 = "An error occurred while publishing install."
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x00d3 }
            throw r1     // Catch:{ Exception -> 0x00d3 }
        L_0x00d1:
            r0 = move-exception
            goto L_0x00d6
        L_0x00d3:
            com.facebook.internal.f0 r0 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x00d1 }
            goto L_0x00d9
        L_0x00d6:
            p262t8.C6606a.m15600a(r5, r0)
        L_0x00d9:
            return
        L_0x00da:
            java.lang.Object r0 = r14.f22380c
            com.appboy.ui.inappmessage.views.AppboyInAppMessageImmersiveBaseView r0 = (com.appboy.p044ui.inappmessage.views.AppboyInAppMessageImmersiveBaseView) r0
            java.lang.Object r1 = r14.f22381d
            android.view.View r1 = (android.view.View) r1
            r0.lambda$setLargerCloseButtonClickArea$1(r1)
            return
        L_0x00e6:
            java.lang.Object r0 = r14.f22380c
            com.appboy.Appboy r0 = (com.appboy.Appboy) r0
            java.lang.Object r1 = r14.f22381d
            android.content.Context r1 = (android.content.Context) r1
            r0.m5383a((android.content.Context) r1)
            return
        L_0x00f2:
            java.lang.Object r0 = r14.f22380c
            bo.app.t3 r0 = (p030bo.app.C1695t3) r0
            java.lang.Object r1 = r14.f22381d
            bo.app.h2 r1 = (p030bo.app.C1594h2) r1
            r0.m4761b((p030bo.app.C1594h2) r1)
            return
        L_0x00fe:
            java.lang.Object r0 = r14.f22380c
            androidx.room.b r0 = (androidx.room.C1257b) r0
            r0.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r0 = 0
            throw r0
        L_0x010c:
            java.lang.Object r0 = r14.f22380c
            androidx.constraintlayout.motion.widget.c r0 = (androidx.constraintlayout.motion.widget.C0722c) r0
            java.lang.Object r2 = r14.f22381d
            android.view.View[] r2 = (android.view.View[]) r2
            int r4 = r0.f2845p
            r5 = -1
            if (r4 == r5) goto L_0x012f
            int r4 = r2.length
            r6 = 0
        L_0x011b:
            if (r6 >= r4) goto L_0x012f
            r7 = r2[r6]
            int r8 = r0.f2845p
            long r9 = java.lang.System.nanoTime()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r7.setTag(r8, r9)
            int r6 = r6 + 1
            goto L_0x011b
        L_0x012f:
            int r4 = r0.f2846q
            if (r4 == r5) goto L_0x0140
            int r4 = r2.length
        L_0x0134:
            if (r1 >= r4) goto L_0x0140
            r5 = r2[r1]
            int r6 = r0.f2846q
            r5.setTag(r6, r3)
            int r1 = r1 + 1
            goto L_0x0134
        L_0x0140:
            return
        L_0x0141:
            java.lang.Object r0 = r14.f22380c
            androidx.camera.core.impl.DeferrableSurface r0 = (androidx.camera.core.impl.DeferrableSurface) r0
            android.util.Size r3 = androidx.camera.core.impl.DeferrableSurface.f1920i
            r0.getClass()
            androidx.concurrent.futures.CallbackToFutureAdapter$c r3 = r0.f1928e     // Catch:{ Exception -> 0x015d }
            r3.get()     // Catch:{ Exception -> 0x015d }
            java.util.concurrent.atomic.AtomicInteger r3 = androidx.camera.core.impl.DeferrableSurface.f1923l     // Catch:{ Exception -> 0x015d }
            r3.decrementAndGet()     // Catch:{ Exception -> 0x015d }
            java.util.concurrent.atomic.AtomicInteger r3 = androidx.camera.core.impl.DeferrableSurface.f1922k     // Catch:{ Exception -> 0x015d }
            r3.get()     // Catch:{ Exception -> 0x015d }
            r0.mo2455f()     // Catch:{ Exception -> 0x015d }
            return
        L_0x015d:
            r3 = move-exception
            java.lang.String r4 = "DeferrableSurface"
            r0.toString()
            p054d0.C4289j0.m11435b(r4)
            java.lang.Object r4 = r0.f1924a
            monitor-enter(r4)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x018b }
            java.lang.String r6 = "DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception."
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x018b }
            r7[r1] = r0     // Catch:{ all -> 0x018b }
            boolean r1 = r0.f1926c     // Catch:{ all -> 0x018b }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x018b }
            r7[r2] = r1     // Catch:{ all -> 0x018b }
            r1 = 2
            int r0 = r0.f1925b     // Catch:{ all -> 0x018b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x018b }
            r7[r1] = r0     // Catch:{ all -> 0x018b }
            java.lang.String r0 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x018b }
            r5.<init>(r0, r3)     // Catch:{ all -> 0x018b }
            throw r5     // Catch:{ all -> 0x018b }
        L_0x018b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x018b }
            throw r0
        L_0x018e:
            java.lang.Object r0 = r14.f22380c
            androidx.camera.core.SurfaceRequest$g r0 = (androidx.camera.core.SurfaceRequest.C0537g) r0
            java.lang.Object r1 = r14.f22381d
            androidx.camera.core.SurfaceRequest$f r1 = (androidx.camera.core.SurfaceRequest.C0536f) r1
            n0.g r0 = (p176n0.C5788g) r0
            r0.mo21662a(r1)
            return
        L_0x019c:
            java.lang.Object r0 = r14.f22380c
            androidx.camera.core.s$e r0 = (androidx.camera.core.C0636s.C0641e) r0
            java.lang.Object r1 = r14.f22381d
            java.lang.Exception r1 = (java.lang.Exception) r1
            r1.getMessage()
            r1.getCause()
            x.d0 r0 = (p304x.C7038d0) r0
            java.lang.Object r0 = r0.f21894c
            androidx.camera.core.l$g r0 = (androidx.camera.core.C0612l.C0619g) r0
            androidx.camera.core.l$f r1 = androidx.camera.core.C0612l.f2108F
            java.lang.String r1 = "ImageCapture"
            p054d0.C4289j0.m11435b(r1)
            r0.getClass()
            throw r3
        L_0x01bb:
            java.lang.Object r0 = r14.f22380c
            y.t$b r0 = (p316y.C7226t.C7228b) r0
            java.lang.Object r1 = r14.f22381d
            android.hardware.camera2.CameraDevice r1 = (android.hardware.camera2.CameraDevice) r1
            android.hardware.camera2.CameraDevice$StateCallback r0 = r0.f22377a
            r0.onClosed(r1)
            return
        L_0x01c9:
            java.lang.Object r0 = r14.f22380c
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r14.f22381d
            we.a r1 = (p885we.C20291a) r1
            java.lang.Object r0 = r0.getKey()
            we.b r0 = (p885we.C20292b) r0
            r0.mo49618a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p316y.C7229u.run():void");
    }
}

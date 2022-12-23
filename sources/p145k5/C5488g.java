package p145k5;

import java.util.concurrent.Callable;

/* renamed from: k5.g */
public final /* synthetic */ class C5488g implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f18020b;

    /* renamed from: c */
    public final /* synthetic */ Object f18021c;

    public /* synthetic */ C5488g(Object obj, int i) {
        this.f18020b = i;
        this.f18021c = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a A[LOOP:0: B:15:0x007a->B:18:0x0085, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r8 = this;
            int r0 = r8.f18020b
            r1 = 0
            switch(r0) {
                case 0: goto L_0x012e;
                case 1: goto L_0x0091;
                case 2: goto L_0x005d;
                case 3: goto L_0x004c;
                case 4: goto L_0x002f;
                case 5: goto L_0x0020;
                case 6: goto L_0x0013;
                case 7: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0137
        L_0x0008:
            java.lang.Object r0 = r8.f18021c
            l30.i r0 = (l30.C5577i) r0
            com.moovit.MoovitApplication<?, ?, ?> r0 = r0.f18277a
            c70.e r0 = l30.C5577i.m13787c(r0)
            return r0
        L_0x0013:
            java.lang.Object r0 = r8.f18021c
            com.moovit.app.tod.bookingflow.TodBookingOrderViewModel r0 = (com.moovit.app.tod.bookingflow.TodBookingOrderViewModel) r0
            android.app.Application r0 = r0.f3907b
            com.moovit.MoovitApplication r0 = (com.moovit.MoovitApplication) r0
            c70.e r0 = com.moovit.app.tod.bookingflow.TodBookingOrderViewModel.m39599a(r0)
            return r0
        L_0x0020:
            java.lang.Object r0 = r8.f18021c
            android.content.Context r0 = (android.content.Context) r0
            r2 = 2131886550(0x7f1201d6, float:1.9407682E38)
            java.lang.String r2 = r0.getString(r2)
            com.usebutton.sdk.Button.configure(r0, r2)
            return r1
        L_0x002f:
            java.lang.Object r0 = r8.f18021c
            com.moovit.app.subscription.MoovitSubscriptionsManager r0 = (com.moovit.app.subscription.MoovitSubscriptionsManager) r0
            java.util.HashSet r1 = com.moovit.app.subscription.MoovitSubscriptionsManager.f39757g
            r0.getClass()
            hw.a r1 = new hw.a
            com.moovit.MoovitApplication<?, ?, ?> r0 = r0.f39760b
            c70.e r0 = com.moovit.app.subscription.MoovitSubscriptionsManager.m39316d(r0)
            r1.<init>(r0)
            wz.g r0 = r1.mo52626J()
            hw.b r0 = (p549hw.C17504b) r0
            java.util.ArrayList r0 = r0.f45073m
            return r0
        L_0x004c:
            java.lang.Object r0 = r8.f18021c
            java.util.List r0 = (java.util.List) r0
            java.util.HashSet r2 = com.moovit.app.subscription.MoovitSubscriptionsManager.f39757g
            vs.e r2 = new vs.e
            r3 = 5
            r2.<init>(r3)
            java.util.ArrayList r0 = c00.C13720d.m34273c(r0, r1, r2)
            return r0
        L_0x005d:
            java.lang.Object r0 = r8.f18021c
            com.moovit.app.ads.MobileAdsManager r0 = (com.moovit.app.ads.MobileAdsManager) r0
            java.util.concurrent.atomic.AtomicReference<com.moovit.app.useraccount.manager.profile.UserAdsTargetingData> r2 = r0.f37472n
            java.lang.Object r2 = r2.get()
            com.moovit.app.useraccount.manager.profile.UserAdsTargetingData r2 = (com.moovit.app.useraccount.manager.profile.UserAdsTargetingData) r2
            if (r2 != 0) goto L_0x0090
            java.util.concurrent.atomic.AtomicReference<com.moovit.app.useraccount.manager.profile.UserAdsTargetingData> r3 = r0.f37472n
            com.moovit.MoovitApplication<?, ?, ?> r2 = r0.f37461c
            com.moovit.app.useraccount.manager.profile.UserAdsTargetingData$b r4 = com.moovit.app.useraccount.manager.profile.UserAdsTargetingData.f40605c
            java.lang.String r5 = "mobile_ads_manager_user_targeting_data.dat"
            java.lang.Object r2 = p389bl.C13641g.m34133v(r2, r5, r4)
            r4 = r2
            com.moovit.app.useraccount.manager.profile.UserAdsTargetingData r4 = (com.moovit.app.useraccount.manager.profile.UserAdsTargetingData) r4
        L_0x007a:
            boolean r2 = r3.compareAndSet(r1, r4)
            if (r2 == 0) goto L_0x0081
            goto L_0x0087
        L_0x0081:
            java.lang.Object r2 = r3.get()
            if (r2 == 0) goto L_0x007a
        L_0x0087:
            java.util.concurrent.atomic.AtomicReference<com.moovit.app.useraccount.manager.profile.UserAdsTargetingData> r0 = r0.f37472n
            java.lang.Object r0 = r0.get()
            r2 = r0
            com.moovit.app.useraccount.manager.profile.UserAdsTargetingData r2 = (com.moovit.app.useraccount.manager.profile.UserAdsTargetingData) r2
        L_0x0090:
            return r2
        L_0x0091:
            java.lang.Object r0 = r8.f18021c
            com.google.firebase.heartbeatinfo.a r0 = (com.google.firebase.heartbeatinfo.C14458a) r0
            monitor-enter(r0)
            ze.b<xe.g> r1 = r0.f36525a     // Catch:{ all -> 0x012b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x012b }
            xe.g r1 = (p909xe.C20470g) r1     // Catch:{ all -> 0x012b }
            java.util.ArrayList r2 = r1.mo52662c()     // Catch:{ all -> 0x012b }
            r1.mo52661b()     // Catch:{ all -> 0x012b }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x012b }
            r1.<init>()     // Catch:{ all -> 0x012b }
            r3 = 0
        L_0x00ab:
            int r4 = r2.size()     // Catch:{ all -> 0x012b }
            if (r3 >= r4) goto L_0x00d9
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x012b }
            xe.h r4 = (p909xe.C20471h) r4     // Catch:{ all -> 0x012b }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x012b }
            r5.<init>()     // Catch:{ all -> 0x012b }
            java.lang.String r6 = "agent"
            java.lang.String r7 = r4.mo52654b()     // Catch:{ all -> 0x012b }
            r5.put(r6, r7)     // Catch:{ all -> 0x012b }
            java.lang.String r6 = "dates"
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ all -> 0x012b }
            java.util.List r4 = r4.mo52653a()     // Catch:{ all -> 0x012b }
            r7.<init>(r4)     // Catch:{ all -> 0x012b }
            r5.put(r6, r7)     // Catch:{ all -> 0x012b }
            r1.put(r5)     // Catch:{ all -> 0x012b }
            int r3 = r3 + 1
            goto L_0x00ab
        L_0x00d9:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x012b }
            r2.<init>()     // Catch:{ all -> 0x012b }
            java.lang.String r3 = "heartbeats"
            r2.put(r3, r1)     // Catch:{ all -> 0x012b }
            java.lang.String r1 = "version"
            java.lang.String r3 = "2"
            r2.put(r1, r3)     // Catch:{ all -> 0x012b }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x012b }
            r1.<init>()     // Catch:{ all -> 0x012b }
            android.util.Base64OutputStream r3 = new android.util.Base64OutputStream     // Catch:{ all -> 0x012b }
            r4 = 11
            r3.<init>(r1, r4)     // Catch:{ all -> 0x012b }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0121 }
            r4.<init>(r3)     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = "UTF-8"
            byte[] r2 = r2.getBytes(r5)     // Catch:{ all -> 0x0117 }
            r4.write(r2)     // Catch:{ all -> 0x0117 }
            r4.close()     // Catch:{ all -> 0x0121 }
            r3.close()     // Catch:{ all -> 0x012b }
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = r1.toString(r2)     // Catch:{ all -> 0x012b }
            monitor-exit(r0)     // Catch:{ all -> 0x012b }
            return r1
        L_0x0117:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x011c }
            goto L_0x0120
        L_0x011c:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch:{ all -> 0x0121 }
        L_0x0120:
            throw r1     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0126 }
            goto L_0x012a
        L_0x0126:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch:{ all -> 0x012b }
        L_0x012a:
            throw r1     // Catch:{ all -> 0x012b }
        L_0x012b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x012b }
            throw r1
        L_0x012e:
            java.lang.Object r0 = r8.f18021c
            com.appboy.Appboy r0 = (com.appboy.Appboy) r0
            com.appboy.events.ContentCardsUpdatedEvent r0 = r0.m5379a()
            return r0
        L_0x0137:
            java.lang.Object r0 = r8.f18021c
            w50.g r0 = (w50.C20283g) r0
            java.math.BigDecimal r1 = w50.C20283g.f51427r
            android.app.Application r0 = r0.f3907b
            com.moovit.MoovitApplication r0 = (com.moovit.MoovitApplication) r0
            c70.e r0 = w50.C20283g.m47846f(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p145k5.C5488g.call():java.lang.Object");
    }
}

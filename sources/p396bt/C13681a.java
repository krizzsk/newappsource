package p396bt;

import java.util.concurrent.Callable;

/* renamed from: bt.a */
public final /* synthetic */ class C13681a implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f33714b;

    /* renamed from: c */
    public final /* synthetic */ Object f33715c;

    /* renamed from: d */
    public final /* synthetic */ Object f33716d;

    public /* synthetic */ C13681a(int i, Object obj, Object obj2) {
        this.f33714b = i;
        this.f33715c = obj;
        this.f33716d = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r13 = this;
            int r0 = r13.f33714b
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0040
        L_0x0006:
            java.lang.Object r0 = r13.f33715c
            bt.b r0 = (p396bt.C13682b) r0
            java.lang.Object r1 = r13.f33716d
            com.moovit.app.history.itinerary.ItineraryHistoryItem r1 = (com.moovit.app.history.itinerary.ItineraryHistoryItem) r1
            java.lang.String r2 = "this$0"
            mf0.C24362h.m61211f(r0, r2)
            java.lang.String r2 = "$latestItinerary"
            mf0.C24362h.m61211f(r1, r2)
            xr.c r2 = r0.f33719c
            android.content.Context r3 = r0.f33717a
            com.moovit.network.model.ServerId r0 = r0.f33718b
            monitor-enter(r2)
            aa0.i r0 = r2.mo52777d(r3, r0)     // Catch:{ all -> 0x003d }
            r0.mo51499b()     // Catch:{ all -> 0x003d }
            mz.c<T> r3 = r0.f48432b     // Catch:{ all -> 0x003d }
            r3.clear()     // Catch:{ all -> 0x003d }
            r0.mo51499b()     // Catch:{ all -> 0x003d }
            mz.c<T> r3 = r0.f48432b     // Catch:{ all -> 0x003d }
            r3.add(r1)     // Catch:{ all -> 0x003d }
            boolean r0 = r0.mo51500c()     // Catch:{ all -> 0x003d }
            monitor-exit(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0040:
            java.lang.Object r0 = r13.f33715c
            u2.a r0 = (p269u2.C6677a) r0
            java.lang.Object r1 = r13.f33716d
            r6 = r1
            fx.g r6 = (p502fx.C17122g) r6
            java.lang.Object r1 = r0.f20759c
            gx.g r1 = (p526gx.C17254g) r1
            java.lang.Integer r1 = r1.f44596b
            if (r1 == 0) goto L_0x0057
            int r1 = r1.intValue()
            r4 = r1
            goto L_0x0059
        L_0x0057:
            r1 = -1
            r4 = -1
        L_0x0059:
            android.location.Location r1 = r6.f44316d
            java.lang.Object r2 = r0.f20758b
            gx.e r2 = (p526gx.C17252e) r2
            java.util.List<gx.a> r2 = r2.f44589d
            java.lang.Object r3 = r0.f20759c
            gx.g r3 = (p526gx.C17254g) r3
            java.lang.Integer r3 = r3.f44597c
            r5 = 0
            if (r3 == 0) goto L_0x006f
            int r3 = r3.intValue()
            goto L_0x0070
        L_0x006f:
            r3 = 0
        L_0x0070:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r3.intValue()
        L_0x0078:
            int r7 = r2.size()
            if (r3 >= r7) goto L_0x0090
            java.lang.Object r7 = r2.get(r3)
            gx.a r7 = (p526gx.C17248a) r7
            com.moovit.commons.geo.Geofence r7 = r7.f44575a
            boolean r7 = p269u2.C6677a.m15758d(r7, r1)
            if (r7 == 0) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            int r3 = r3 + 1
            goto L_0x0078
        L_0x0090:
            r7 = r3
        L_0x0091:
            int r8 = r2.size()
            if (r7 >= r8) goto L_0x00a9
            java.lang.Object r8 = r2.get(r7)
            gx.a r8 = (p526gx.C17248a) r8
            com.moovit.commons.geo.Geofence r8 = r8.f44575a
            boolean r8 = p269u2.C6677a.m15758d(r8, r1)
            if (r8 != 0) goto L_0x00a6
            goto L_0x00a9
        L_0x00a6:
            int r7 = r7 + 1
            goto L_0x0091
        L_0x00a9:
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = 0
            r10 = r3
            r11 = r9
        L_0x00af:
            if (r10 >= r7) goto L_0x00cc
            java.lang.Object r12 = r2.get(r10)
            gx.a r12 = (p526gx.C17248a) r12
            com.moovit.commons.geo.Geofence r12 = r12.f44575a
            com.moovit.commons.geo.LatLonE6 r12 = r12.f40974b
            float r12 = r12.mo46918d(r1)
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x00c4
            goto L_0x00cc
        L_0x00c4:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            int r10 = r10 + 1
            r8 = r12
            goto L_0x00af
        L_0x00cc:
            if (r3 < r7) goto L_0x00cf
            goto L_0x00d3
        L_0x00cf:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
        L_0x00d3:
            java.lang.Object r2 = r0.f20759c
            gx.g r2 = (p526gx.C17254g) r2
            r2.f44597c = r9
            if (r11 != 0) goto L_0x00de
            r2.f44595a = r5
            goto L_0x0112
        L_0x00de:
            java.lang.Integer r2 = r2.f44596b
            if (r2 == 0) goto L_0x0109
            int r3 = r11.intValue()
            int r7 = r2.intValue()
            if (r3 >= r7) goto L_0x0109
            java.lang.Object r3 = r0.f20758b
            gx.e r3 = (p526gx.C17252e) r3
            java.util.List<gx.a> r3 = r3.f44589d
            int r2 = r2.intValue()
            java.lang.Object r2 = r3.get(r2)
            gx.a r2 = (p526gx.C17248a) r2
            java.lang.Object r3 = r0.f20759c
            gx.g r3 = (p526gx.C17254g) r3
            com.moovit.commons.geo.Geofence r2 = r2.f44575a
            boolean r2 = p269u2.C6677a.m15758d(r2, r1)
            r3.f44595a = r2
            goto L_0x0112
        L_0x0109:
            java.lang.Object r2 = r0.f20759c
            gx.g r2 = (p526gx.C17254g) r2
            r3 = 1
            r2.f44595a = r3
            r2.f44596b = r11
        L_0x0112:
            java.lang.Object r2 = r0.f20759c
            gx.g r2 = (p526gx.C17254g) r2
            java.lang.Integer r2 = r2.f44596b
            r1.getLatitude()
            r1.getLongitude()
            r1.getAccuracy()
            r1.getBearing()
            java.lang.Object r1 = r0.f20759c
            gx.g r1 = (p526gx.C17254g) r1
            java.lang.Integer r1 = r1.f44596b
            if (r1 == 0) goto L_0x0131
            int r1 = r1.intValue()
            goto L_0x0132
        L_0x0131:
            r1 = 0
        L_0x0132:
            java.lang.Object r2 = r0.f20758b
            gx.e r2 = (p526gx.C17252e) r2
            java.util.List<gx.a> r2 = r2.f44589d
            java.lang.Object r2 = r2.get(r1)
            gx.a r2 = (p526gx.C17248a) r2
            java.lang.Object r3 = r0.f20758b
            gx.e r3 = (p526gx.C17252e) r3
            java.util.List<gx.d> r3 = r3.f44587b
            int r2 = r2.f44576b
            int r7 = r3.size()
            java.util.List r2 = r3.subList(r2, r7)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0163
            java.lang.Object r2 = r0.f20758b
            gx.e r2 = (p526gx.C17252e) r2
            java.util.List<gx.d> r2 = r2.f44587b
            java.lang.Object r2 = r2.get(r5)
            gx.d r2 = (p526gx.C17251d) r2
            com.moovit.commons.geo.Polyline r2 = r2.f44585d
            goto L_0x016b
        L_0x0163:
            java.lang.Object r2 = r2.get(r5)
            gx.d r2 = (p526gx.C17251d) r2
            com.moovit.commons.geo.Polyline r2 = r2.f44585d
        L_0x016b:
            com.moovit.commons.geo.BoxE6 r2 = r2.getBounds()
            android.location.Location r3 = r6.f44316d
            com.moovit.commons.geo.LatLonE6 r3 = com.moovit.commons.geo.LatLonE6.m40177j(r3)
            r2.getClass()
            int r5 = r3.f40980b
            int r3 = r3.f40981c
            int r7 = r2.f40964b
            int r7 = java.lang.Math.min(r7, r5)
            int r8 = r2.f40965c
            int r5 = java.lang.Math.max(r8, r5)
            int r8 = r2.f40966d
            int r8 = java.lang.Math.min(r8, r3)
            int r2 = r2.f40967e
            int r2 = java.lang.Math.max(r2, r3)
            com.moovit.commons.geo.BoxE6 r9 = new com.moovit.commons.geo.BoxE6
            r9.<init>(r7, r5, r8, r2)
            gx.f r8 = new gx.f
            java.lang.Object r0 = r0.f20758b
            r3 = r0
            gx.e r3 = (p526gx.C17252e) r3
            r2 = r8
            r5 = r1
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p396bt.C13681a.call():java.lang.Object");
    }
}

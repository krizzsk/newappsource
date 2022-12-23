package p829tu;

import c70.C13752e;
import ce0.C21100e;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import java.util.concurrent.Callable;
import p781ru.C19329b;
import p781ru.C19331d;
import p824tp.C19728f;
import p977zz.C20944i0;
import q00.C19047a;

/* renamed from: tu.k */
public final class C19780k implements Callable<C20944i0<C19331d, C19329b>> {

    /* renamed from: b */
    public final MotQrCodeScanResult f50284b;

    /* renamed from: c */
    public final C13752e f50285c;

    /* renamed from: d */
    public final C19728f f50286d;

    /* renamed from: e */
    public final C19047a f50287e;

    /* renamed from: f */
    public final MotQrCodeTrip f50288f;

    public C19780k(MotQrCodeScanResult motQrCodeScanResult, C13752e eVar, C19728f fVar, C19047a aVar, MotQrCodeTrip motQrCodeTrip) {
        C21100e.m49373x(motQrCodeScanResult, "scanResult");
        this.f50284b = motQrCodeScanResult;
        C21100e.m49373x(eVar, "requestContext");
        this.f50285c = eVar;
        C21100e.m49373x(fVar, "metroContext");
        this.f50286d = fVar;
        C21100e.m49373x(aVar, "configuration");
        this.f50287e = aVar;
        C21100e.m49373x(motQrCodeTrip, "trip");
        this.f50288f = motQrCodeTrip;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0189 A[EDGE_INSN: B:71:0x0189->B:44:0x0189 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r15 = this;
            r0 = 0
            h20.a r8 = new h20.a     // Catch:{ all -> 0x0023 }
            c70.e r2 = r15.f50285c     // Catch:{ all -> 0x0023 }
            tp.f r3 = r15.f50286d     // Catch:{ all -> 0x0023 }
            q00.a r4 = r15.f50287e     // Catch:{ all -> 0x0023 }
            com.moovit.app.mot.purchase.model.MotQrCodeTrip r1 = r15.f50288f     // Catch:{ all -> 0x0023 }
            com.moovit.transit.TransitLine r1 = r1.f39073c     // Catch:{ all -> 0x0023 }
            com.moovit.transit.TransitLineGroup r1 = r1.mo24369b()     // Catch:{ all -> 0x0023 }
            com.moovit.network.model.ServerId r5 = r1.f23694b     // Catch:{ all -> 0x0023 }
            com.moovit.app.mot.purchase.model.MotQrCodeTrip r1 = r15.f50288f     // Catch:{ all -> 0x0023 }
            com.moovit.util.time.Time r6 = r1.f39074d     // Catch:{ all -> 0x0023 }
            r7 = 1
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0023 }
            wz.g r1 = r8.mo52626J()     // Catch:{ all -> 0x0023 }
            h20.b r1 = (h20.C17297b) r1     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r1 = r0
        L_0x0024:
            com.moovit.app.mot.purchase.model.MotQrCodeTrip r2 = r15.f50288f
            com.moovit.util.time.Time r2 = r2.f39074d
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitPattern> r2 = r2.f23905f
            j40.a r2 = r2.get()
            com.moovit.transit.TransitPattern r2 = (com.moovit.transit.TransitPattern) r2
            java.util.List<com.moovit.database.DbEntityRef<com.moovit.transit.TransitStop>> r2 = r2.f23709c
            java.util.ArrayList r2 = com.moovit.network.model.ServerId.m11393d(r2)
            c70.e r3 = r15.f50285c
            tp.f r4 = r15.f50286d
            g30.h r4 = r4.f50165a
            i30.e r5 = new i30.e
            r5.<init>()
            java.lang.String r6 = "requestContext"
            ce0.C21100e.m49373x(r3, r6)
            java.lang.String r6 = "metroInfo"
            ce0.C21100e.m49373x(r4, r6)
            com.moovit.metroentities.MetroEntityType r6 = com.moovit.metroentities.MetroEntityType.TRANSIT_STOP
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap<com.moovit.metroentities.MetroEntityType, com.moovit.network.model.ServerId> r7 = r5.f17412b
            r7.mo47002b(r6, r2)
            i30.c r6 = new i30.c
            java.lang.String r7 = "MotQrCodeTripSequenceTask"
            r6.<init>(r3, r7, r4, r5)
            i30.d r3 = r6.mo21062P()
            d0.k0 r4 = new d0.k0
            r5 = 1
            r4.<init>(r3, r5)
            java.util.ArrayList r9 = c00.C13720d.m34273c(r2, r0, r4)
            com.moovit.app.mot.purchase.model.MotQrCodeTrip r2 = r15.f50288f
            com.moovit.transit.TransitStop r2 = r2.f39072b
            int r2 = r9.indexOf(r2)
            int r2 = r2 + r5
            int r3 = r9.size()
            if (r2 >= r3) goto L_0x007f
            int r3 = r9.size()
            java.util.List r2 = r9.subList(r2, r3)
            goto L_0x0083
        L_0x007f:
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x0083:
            r10 = r2
            com.moovit.app.mot.purchase.model.MotQrCodeScanResult r2 = r15.f50284b
            com.moovit.commons.geo.LatLonE6 r2 = r2.f39065e
            s0.b r11 = new s0.b
            int r3 = r10.size()
            r11.<init>((int) r3)
            java.util.Iterator r3 = r10.iterator()
        L_0x0095:
            boolean r4 = r3.hasNext()
            r13 = 0
            if (r4 == 0) goto L_0x00d2
            java.lang.Object r4 = r3.next()
            com.moovit.transit.TransitStop r4 = (com.moovit.transit.TransitStop) r4
            com.moovit.commons.geo.LatLonE6 r6 = r4.f23732d
            r2.getClass()
            float r7 = com.moovit.commons.geo.LatLonE6.m40174c(r2, r6)
            com.moovit.app.mot.purchase.model.MotQrCodeScanResult r8 = r15.f50284b
            com.moovit.app.mot.model.MotActivationRegionalFare r8 = r8.mo45610b(r7)
            java.util.List<com.moovit.app.mot.model.MotActivationRegionFare> r12 = r8.f39019e
            ou.a r14 = new ou.a
            r14.<init>(r13, r6)
            java.lang.Object r6 = c00.C13723g.m34286g(r12, r14)
            com.moovit.app.mot.model.MotActivationRegionFare r6 = (com.moovit.app.mot.model.MotActivationRegionFare) r6
            com.moovit.app.mot.purchase.model.MotQrCodeActivationFare r12 = new com.moovit.app.mot.purchase.model.MotQrCodeActivationFare
            r12.<init>(r8, r6)
            com.moovit.network.model.ServerId r6 = r4.f23730b
            com.moovit.app.mot.purchase.model.MotQrCodeStationFare r8 = new com.moovit.app.mot.purchase.model.MotQrCodeStationFare
            com.moovit.app.mot.purchase.model.MotQrCodeTrip r13 = r15.f50288f
            com.moovit.transit.TransitLine r13 = r13.f39073c
            r8.<init>(r13, r4, r7, r12)
            r11.put(r6, r8)
            goto L_0x0095
        L_0x00d2:
            if (r1 != 0) goto L_0x00d6
            goto L_0x0144
        L_0x00d6:
            com.moovit.app.mot.purchase.model.MotQrCodeTrip r2 = r15.f50288f     // Catch:{ all -> 0x011c }
            com.moovit.util.time.Time r3 = r2.f39074d     // Catch:{ all -> 0x011c }
            com.moovit.network.model.LongServerId r3 = r3.f23904e     // Catch:{ all -> 0x011c }
            if (r3 != 0) goto L_0x00df
            goto L_0x0144
        L_0x00df:
            java.util.Map<com.moovit.network.model.ServerId, java.util.List<com.moovit.transit.TransitPatternTrips>> r4 = r1.f44686n     // Catch:{ all -> 0x011c }
            com.moovit.transit.TransitLine r2 = r2.f39073c     // Catch:{ all -> 0x011c }
            com.moovit.network.model.ServerId r2 = r2.f23687c     // Catch:{ all -> 0x011c }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ all -> 0x011c }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x011c }
            dt.b r4 = new dt.b     // Catch:{ all -> 0x011c }
            r4.<init>(r15, r5)     // Catch:{ all -> 0x011c }
            java.lang.Object r2 = c00.C13723g.m34286g(r2, r4)     // Catch:{ all -> 0x011c }
            com.moovit.transit.TransitPatternTrips r2 = (com.moovit.transit.TransitPatternTrips) r2     // Catch:{ all -> 0x011c }
            if (r2 != 0) goto L_0x00f9
            goto L_0x0144
        L_0x00f9:
            java.util.List<com.moovit.transit.TripId> r4 = r2.f23718c     // Catch:{ all -> 0x011c }
            pq.j r6 = new pq.j     // Catch:{ all -> 0x011c }
            r7 = 3
            r6.<init>(r3, r7)     // Catch:{ all -> 0x011c }
            java.lang.Object r3 = c00.C13723g.m34286g(r4, r6)     // Catch:{ all -> 0x011c }
            com.moovit.transit.TripId r3 = (com.moovit.transit.TripId) r3     // Catch:{ all -> 0x011c }
            if (r3 != 0) goto L_0x011e
            java.util.Set<com.moovit.transit.TransitPatternShape> r2 = r2.f23723h     // Catch:{ all -> 0x011c }
            java.lang.Object r2 = c00.C13717b.m34256c(r2)     // Catch:{ all -> 0x011c }
            com.moovit.transit.TransitPatternShape r2 = (com.moovit.transit.TransitPatternShape) r2     // Catch:{ all -> 0x011c }
            java.util.List<com.moovit.database.DbEntityRef<com.moovit.transit.ShapeSegment>> r3 = r2.f23713b     // Catch:{ all -> 0x011c }
            int r3 = r3.size()     // Catch:{ all -> 0x011c }
            com.moovit.commons.geo.Polyline r2 = r2.mo24396c(r13, r3)     // Catch:{ all -> 0x011c }
            goto L_0x0145
        L_0x011c:
            goto L_0x0144
        L_0x011e:
            java.util.Map<com.moovit.transit.TripId, java.lang.Integer> r4 = r2.f23724i     // Catch:{ all -> 0x011c }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x011c }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x011c }
            int r3 = r3.intValue()     // Catch:{ all -> 0x011c }
            r4 = -1
            if (r3 != r4) goto L_0x012f
            r2 = r0
            goto L_0x0137
        L_0x012f:
            java.util.List<com.moovit.transit.TransitPatternShape> r2 = r2.f23722g     // Catch:{ all -> 0x011c }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x011c }
            com.moovit.transit.TransitPatternShape r2 = (com.moovit.transit.TransitPatternShape) r2     // Catch:{ all -> 0x011c }
        L_0x0137:
            if (r2 == 0) goto L_0x0144
            java.util.List<com.moovit.database.DbEntityRef<com.moovit.transit.ShapeSegment>> r3 = r2.f23713b     // Catch:{ all -> 0x011c }
            int r3 = r3.size()     // Catch:{ all -> 0x011c }
            com.moovit.commons.geo.Polyline r2 = r2.mo24396c(r13, r3)     // Catch:{ all -> 0x011c }
            goto L_0x0145
        L_0x0144:
            r2 = r0
        L_0x0145:
            if (r2 == 0) goto L_0x0148
            goto L_0x0157
        L_0x0148:
            com.moovit.commons.geo.Polylon r2 = new com.moovit.commons.geo.Polylon
            a8.l r3 = new a8.l
            r4 = 4
            r3.<init>(r4)
            java.util.ArrayList r3 = c00.C13720d.m34273c(r9, r0, r3)
            r2.<init>(r3, r13)
        L_0x0157:
            r12 = r2
            ru.d r2 = new ru.d
            com.moovit.app.mot.purchase.model.MotQrCodeTrip r3 = r15.f50288f
            com.moovit.transit.TransitLine r7 = r3.f39073c
            com.moovit.transit.TransitStop r8 = r3.f39072b
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.util.Map<com.moovit.network.model.ServerId, com.moovit.app.mot.purchase.model.MotQrCodeStationFare> r3 = r2.f49192e
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
            r4 = r0
        L_0x016f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0189
            java.lang.Object r6 = r3.next()
            com.moovit.app.mot.purchase.model.MotQrCodeStationFare r6 = (com.moovit.app.mot.purchase.model.MotQrCodeStationFare) r6
            if (r4 != 0) goto L_0x0180
            com.moovit.app.mot.purchase.model.MotQrCodeActivationFare r4 = r6.f39071e
            goto L_0x016f
        L_0x0180:
            com.moovit.app.mot.purchase.model.MotQrCodeActivationFare r6 = r6.f39071e
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L_0x016f
            r5 = 0
        L_0x0189:
            if (r5 == 0) goto L_0x0220
            if (r1 != 0) goto L_0x018f
            goto L_0x0220
        L_0x018f:
            com.moovit.app.mot.purchase.model.MotQrCodeTrip r3 = r15.f50288f
            com.moovit.transit.TransitLine r3 = r3.f39073c
            java.util.Map<com.moovit.network.model.ServerId, java.util.List<com.moovit.transit.TransitPatternTrips>> r1 = r1.f44686n
            com.moovit.network.model.ServerId r4 = r3.f23687c
            java.lang.Object r1 = r1.get(r4)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x01a1
            goto L_0x0220
        L_0x01a1:
            com.moovit.app.mot.purchase.model.MotQrCodeScanResult r4 = r15.f50284b
            com.moovit.commons.geo.LatLonE6 r4 = r4.f39065e
            java.util.Iterator r1 = r1.iterator()
            r5 = r0
            r6 = r5
        L_0x01ab:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0214
            java.lang.Object r7 = r1.next()
            com.moovit.transit.TransitPatternTrips r7 = (com.moovit.transit.TransitPatternTrips) r7
            com.moovit.transit.TransitPattern r7 = r7.f23717b
            java.util.List<com.moovit.database.DbEntityRef<com.moovit.transit.TransitStop>> r7 = r7.f23709c
            java.util.Iterator r7 = r7.iterator()
        L_0x01bf:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01ab
            java.lang.Object r8 = r7.next()
            com.moovit.database.DbEntityRef r8 = (com.moovit.database.DbEntityRef) r8
            j40.a r8 = r8.get()
            com.moovit.transit.TransitStop r8 = (com.moovit.transit.TransitStop) r8
            if (r8 != 0) goto L_0x01d4
            goto L_0x0220
        L_0x01d4:
            com.moovit.commons.geo.LatLonE6 r9 = r8.f23732d
            r4.getClass()
            float r8 = com.moovit.commons.geo.LatLonE6.m40174c(r4, r8)
            com.moovit.app.mot.purchase.model.MotQrCodeScanResult r10 = r15.f50284b
            com.moovit.app.mot.model.MotActivationRegionalFare r8 = r10.mo45610b(r8)
            java.util.List<com.moovit.app.mot.model.MotActivationRegionFare> r10 = r8.f39019e
            ou.a r11 = new ou.a
            r11.<init>(r13, r9)
            java.lang.Object r9 = c00.C13723g.m34286g(r10, r11)
            com.moovit.app.mot.model.MotActivationRegionFare r9 = (com.moovit.app.mot.model.MotActivationRegionFare) r9
            if (r9 != 0) goto L_0x01f3
            goto L_0x0220
        L_0x01f3:
            if (r5 != 0) goto L_0x01f8
            r5 = r8
            r6 = r9
            goto L_0x01bf
        L_0x01f8:
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L_0x01ff
            goto L_0x0220
        L_0x01ff:
            boolean r8 = r6.equals(r9)
            if (r8 != 0) goto L_0x01bf
            com.moovit.app.mot.model.MotActivationRegion r1 = r6.f39013b
            com.moovit.network.model.ServerId r1 = r1.f39009b
            java.util.Objects.toString(r1)
            com.moovit.app.mot.model.MotActivationRegion r1 = r9.f39013b
            com.moovit.network.model.ServerId r1 = r1.f39009b
            java.util.Objects.toString(r1)
            goto L_0x0220
        L_0x0214:
            if (r5 == 0) goto L_0x0220
            ru.b r0 = new ru.b
            com.moovit.app.mot.purchase.model.MotQrCodeActivationFare r1 = new com.moovit.app.mot.purchase.model.MotQrCodeActivationFare
            r1.<init>(r5, r6)
            r0.<init>(r3, r1)
        L_0x0220:
            zz.i0 r1 = new zz.i0
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p829tu.C19780k.call():java.lang.Object");
    }
}

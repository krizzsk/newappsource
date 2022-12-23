package com.moovit.app.stoparrivals;

import bf0.C21050d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p429cw.C16515e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "invoke", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class StopArrivalsMapHelper$updateMapSelectedArrival$1 extends Lambda implements C24225a<C21050d> {
    public final /* synthetic */ StopArrival $prevArrival;
    public final /* synthetic */ StopArrival $selectedArrival;
    public final /* synthetic */ C16515e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsMapHelper$updateMapSelectedArrival$1(StopArrival stopArrival, StopArrival stopArrival2, C16515e eVar) {
        super(0);
        this.$selectedArrival = stopArrival;
        this.$prevArrival = stopArrival2;
        this.this$0 = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r0 != false) goto L_0x01b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r9 = this;
            com.moovit.app.stoparrivals.StopArrival r0 = r9.$selectedArrival
            com.moovit.util.time.Time r0 = r0.f39600c
            com.moovit.network.model.LongServerId r0 = r0.f23904e
            com.moovit.app.stoparrivals.StopArrival r1 = r9.$prevArrival
            r2 = 0
            if (r1 == 0) goto L_0x0012
            com.moovit.util.time.Time r1 = r1.f39600c
            if (r1 == 0) goto L_0x0012
            com.moovit.network.model.LongServerId r1 = r1.f23904e
            goto L_0x0013
        L_0x0012:
            r1 = r2
        L_0x0013:
            boolean r0 = mf0.C24362h.m61206a(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x002d
            com.moovit.app.stoparrivals.StopArrival r0 = r9.$prevArrival
            if (r0 == 0) goto L_0x0028
            com.moovit.app.stoparrivals.StopArrival r3 = r9.$selectedArrival
            int r3 = r3.f39601d
            int r0 = r0.f39601d
            if (r3 != r0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x002d
            goto L_0x01b4
        L_0x002d:
            com.moovit.app.stoparrivals.StopArrival r0 = r9.$selectedArrival
            com.moovit.util.time.Time r0 = r0.f39600c
            com.moovit.util.time.TimeVehicleLocation r0 = r0.f23912m
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = r0.f23924b
            goto L_0x0039
        L_0x0038:
            r0 = r2
        L_0x0039:
            com.moovit.app.stoparrivals.StopArrival r3 = r9.$prevArrival
            if (r3 == 0) goto L_0x0048
            com.moovit.util.time.Time r3 = r3.f39600c
            if (r3 == 0) goto L_0x0048
            com.moovit.util.time.TimeVehicleLocation r3 = r3.f23912m
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = r3.f23924b
            goto L_0x0049
        L_0x0048:
            r3 = r2
        L_0x0049:
            boolean r0 = mf0.C24362h.m61206a(r0, r3)
            if (r0 != 0) goto L_0x007f
            com.moovit.app.stoparrivals.StopArrival r0 = r9.$prevArrival
            java.lang.String r3 = "vehicle.vehicleId"
            if (r0 == 0) goto L_0x006a
            com.moovit.util.time.Time r4 = r0.f39600c
            if (r4 == 0) goto L_0x006a
            com.moovit.util.time.TimeVehicleLocation r4 = r4.f23912m
            if (r4 == 0) goto L_0x006a
            cw.e r5 = r9.this$0
            java.lang.String r6 = r4.f23924b
            mf0.C24362h.m61210e(r6, r3)
            r5.mo49304d(r6)
            r5.mo49303c(r0, r4)
        L_0x006a:
            com.moovit.app.stoparrivals.StopArrival r0 = r9.$selectedArrival
            com.moovit.util.time.Time r4 = r0.f39600c
            com.moovit.util.time.TimeVehicleLocation r4 = r4.f23912m
            if (r4 == 0) goto L_0x007f
            cw.e r5 = r9.this$0
            java.lang.String r6 = r4.f23924b
            mf0.C24362h.m61210e(r6, r3)
            r5.mo49304d(r6)
            r5.mo49303c(r0, r4)
        L_0x007f:
            com.moovit.app.stoparrivals.StopArrival r0 = r9.$selectedArrival
            com.moovit.util.time.Time r0 = r0.f39600c
            com.moovit.network.model.ServerId r0 = r0.f23907h
            com.moovit.app.stoparrivals.StopArrival r3 = r9.$prevArrival
            if (r3 == 0) goto L_0x0090
            com.moovit.util.time.Time r3 = r3.f39600c
            if (r3 == 0) goto L_0x0090
            com.moovit.network.model.ServerId r3 = r3.f23907h
            goto L_0x0091
        L_0x0090:
            r3 = r2
        L_0x0091:
            boolean r0 = mf0.C24362h.m61206a(r0, r3)
            if (r0 != 0) goto L_0x01ad
            com.moovit.app.stoparrivals.StopArrival r0 = r9.$prevArrival
            if (r0 == 0) goto L_0x00b9
            com.moovit.util.time.Time r3 = r0.f39600c
            if (r3 == 0) goto L_0x00b9
            com.moovit.network.model.ServerId r3 = r3.f23907h
            if (r3 == 0) goto L_0x00b9
            cw.e r4 = r9.this$0
            kotlin.Pair<com.moovit.network.model.ServerId, ? extends java.lang.Object> r5 = r4.f43121g
            if (r5 == 0) goto L_0x00b6
            java.lang.Object r5 = r5.mo59067b()
            com.moovit.map.MapFragment r6 = r4.f43116b
            r6.mo48634e3(r5)
            r4.f43121g = r2
            bf0.d r5 = bf0.C21050d.f52856a
        L_0x00b6:
            p429cw.C16515e.m41998a(r4, r0, r3)
        L_0x00b9:
            com.moovit.app.stoparrivals.StopArrival r0 = r9.$selectedArrival
            com.moovit.util.time.Time r3 = r0.f39600c
            com.moovit.network.model.ServerId r3 = r3.f23907h
            java.lang.String r4 = "getColor(context, stopArrival.line.group)"
            if (r3 == 0) goto L_0x011c
            cw.e r5 = r9.this$0
            java.util.LinkedHashMap r6 = r5.f43122h
            java.lang.Object r6 = r6.remove(r3)
            if (r6 == 0) goto L_0x00d2
            com.moovit.map.MapFragment r7 = r5.f43116b
            r7.mo48639j3(r6)
        L_0x00d2:
            com.moovit.app.stoparrivals.a r6 = r5.f43117c
            androidx.lifecycle.v r6 = r6.f39636h
            java.lang.Object r6 = r6.getValue()
            com.moovit.app.stoparrivals.TripsUpdateResult r6 = (com.moovit.app.stoparrivals.TripsUpdateResult) r6
            if (r6 == 0) goto L_0x011c
            java.util.Map<com.moovit.network.model.ServerId, com.moovit.transit.TransitPatternShape> r6 = r6.f39629d
            if (r6 == 0) goto L_0x011c
            java.lang.Object r6 = r6.get(r3)
            com.moovit.transit.TransitPatternShape r6 = (com.moovit.transit.TransitPatternShape) r6
            if (r6 == 0) goto L_0x011c
            com.moovit.util.time.Time r7 = r0.f39600c
            int r7 = r7.f23906g
            com.moovit.commons.geo.Polyline r6 = r6.mo24396c(r1, r7)
            if (r6 == 0) goto L_0x011c
            android.content.Context r7 = r5.f43115a
            com.moovit.transit.TransitLine r0 = r0.f39599b
            com.moovit.transit.TransitLineGroup r0 = r0.mo24369b()
            com.moovit.commons.utils.Color r0 = com.moovit.transit.C7843b.m17874a(r7, r0)
            mf0.C24362h.m61210e(r0, r4)
            android.content.Context r7 = r5.f43115a
            com.moovit.map.LineStyle r7 = com.moovit.map.C16281i.m41519o(r7, r0)
            android.content.Context r8 = r5.f43115a
            com.moovit.commons.utils.Color r0 = com.moovit.transit.C7843b.m17875b(r8, r0)
            com.moovit.map.MapFragment r8 = r5.f43116b
            r20.b r0 = r8.mo48642m2(r6, r7, r0)
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r3, r0)
            r5.f43121g = r6
        L_0x011c:
            cw.e r0 = r9.this$0
            com.moovit.map.MapFragment r3 = r0.f43116b
            java.util.ArrayList r5 = r0.f43123i
            com.moovit.map.j r6 = r3.f42368n
            o20.q r6 = r6.mo48783F()
            java.util.Iterator r5 = r5.iterator()
        L_0x012c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x013a
            java.lang.Object r7 = r5.next()
            r3.mo48637h3(r7, r6)
            goto L_0x012c
        L_0x013a:
            java.util.ArrayList r0 = r0.f43123i
            r0.clear()
            cw.e r0 = r9.this$0
            com.moovit.app.stoparrivals.StopArrival r3 = r9.$selectedArrival
            android.content.Context r5 = r0.f43115a
            com.moovit.transit.TransitLine r6 = r3.f39599b
            com.moovit.transit.TransitLineGroup r6 = r6.mo24369b()
            com.moovit.commons.utils.Color r5 = com.moovit.transit.C7843b.m17874a(r5, r6)
            mf0.C24362h.m61210e(r5, r4)
            android.content.Context r4 = r0.f43115a
            com.moovit.commons.utils.Color r4 = com.moovit.transit.C7843b.m17875b(r4, r5)
            r6 = 1082130432(0x40800000, float:4.0)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            com.moovit.map.MarkerZoomStyle r4 = com.moovit.map.C16281i.m41516l(r5, r4, r6)
            com.moovit.util.time.Time r5 = r3.f39600c
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitPattern> r5 = r5.f23905f
            if (r5 == 0) goto L_0x017c
            j40.a r5 = r5.get()
            com.moovit.transit.TransitPattern r5 = (com.moovit.transit.TransitPattern) r5
            if (r5 == 0) goto L_0x017c
            java.util.List<com.moovit.database.DbEntityRef<com.moovit.transit.TransitStop>> r5 = r5.f23709c
            if (r5 == 0) goto L_0x017c
            com.moovit.util.time.Time r2 = r3.f39600c
            int r2 = r2.f23906g
            java.util.List r2 = r5.subList(r1, r2)
        L_0x017c:
            if (r2 == 0) goto L_0x01ad
            java.util.Iterator r1 = r2.iterator()
        L_0x0182:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01ad
            java.lang.Object r2 = r1.next()
            com.moovit.database.DbEntityRef r2 = (com.moovit.database.DbEntityRef) r2
            boolean r3 = r2.isResolved()
            if (r3 == 0) goto L_0x0182
            java.util.ArrayList r3 = r0.f43123i
            com.moovit.map.MapFragment r5 = r0.f43116b
            j40.a r2 = r2.get()
            com.moovit.transit.TransitStop r2 = (com.moovit.transit.TransitStop) r2
            com.moovit.commons.geo.LatLonE6 r2 = r2.f23732d
            java.lang.Object r2 = r5.mo48646o2(r2, r2, r4)
            java.lang.String r5 = "mapFragment.addMarker(tr…location, dotMarkerStyle)"
            mf0.C24362h.m61210e(r2, r5)
            r3.add(r2)
            goto L_0x0182
        L_0x01ad:
            cw.e r0 = r9.this$0
            com.moovit.app.stoparrivals.StopArrival r1 = r9.$selectedArrival
            r0.mo49302b(r1)
        L_0x01b4:
            bf0.d r0 = bf0.C21050d.f52856a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.stoparrivals.StopArrivalsMapHelper$updateMapSelectedArrival$1.invoke():java.lang.Object");
    }
}

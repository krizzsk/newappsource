package i30;

import c70.C13780t;
import com.moovit.metroentities.MetroEntityType;
import com.tranzmate.moovit.protocol.sync.MVSyncEntityResponse;
import i30.C5265a;
import i30.C5266b;
import j40.C5384a;

/* renamed from: i30.b */
public abstract class C5266b<RQ extends C5265a<RQ, RS>, RS extends C5266b<RQ, RS>> extends C13780t<RQ, RS, MVSyncEntityResponse> {

    /* renamed from: m */
    public MetroEntityType f17401m;

    /* renamed from: n */
    public C5384a f17402n;

    public C5266b() {
        super(MVSyncEntityResponse.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: com.moovit.transit.BicycleStop} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: com.moovit.transit.TransitStop} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: com.moovit.transit.TransitLineGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v41, resolved type: com.moovit.transit.BicycleStop} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v42, resolved type: com.moovit.transit.BicycleStop} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v70, resolved type: com.moovit.transit.TransitFrequency} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v75, resolved type: com.moovit.transit.BicycleStop} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.moovit.transit.BicycleStop} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v76, resolved type: com.moovit.transit.BicycleStop} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v77, resolved type: com.moovit.transit.BicycleStop} */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.moovit.transit.TransitPattern] */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v31, types: [com.moovit.transit.Shape] */
    /* JADX WARNING: type inference failed for: r0v39, types: [com.moovit.transit.ShapeSegment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5816m(c70.C13746a r11, org.apache.thrift.TBase r12) throws java.io.IOException, com.moovit.commons.request.BadResponseException, com.moovit.commons.request.ServerException {
        /*
            r10 = this;
            i30.a r11 = (i30.C5265a) r11
            com.tranzmate.moovit.protocol.sync.MVSyncEntityResponse r12 = (com.tranzmate.moovit.protocol.sync.MVSyncEntityResponse) r12
            com.tranzmate.moovit.protocol.sync.MVSyncEntityType r0 = r12.entityType
            zz.m0<java.lang.Integer> r1 = c70.C13749c.f33838a
            int[] r1 = c70.C13749c.C13750a.f33840b
            int r2 = r0.ordinal()
            r1 = r1[r2]
            java.lang.String r2 = "Unknown sync item type: "
            switch(r1) {
                case 1: goto L_0x003f;
                case 2: goto L_0x003c;
                case 3: goto L_0x0039;
                case 4: goto L_0x0036;
                case 5: goto L_0x0033;
                case 6: goto L_0x0030;
                case 7: goto L_0x002d;
                case 8: goto L_0x002a;
                default: goto L_0x0015;
            }
        L_0x0015:
            com.moovit.commons.utils.ApplicationBugException r11 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r2)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>((java.lang.String) r12)
            throw r11
        L_0x002a:
            com.moovit.metroentities.MetroEntityType r0 = com.moovit.metroentities.MetroEntityType.TRANSIT_FREQUENCIES
            goto L_0x0041
        L_0x002d:
            com.moovit.metroentities.MetroEntityType r0 = com.moovit.metroentities.MetroEntityType.SHAPE_SEGMENT
            goto L_0x0041
        L_0x0030:
            com.moovit.metroentities.MetroEntityType r0 = com.moovit.metroentities.MetroEntityType.SHAPE
            goto L_0x0041
        L_0x0033:
            com.moovit.metroentities.MetroEntityType r0 = com.moovit.metroentities.MetroEntityType.TRANSIT_PATTERN
            goto L_0x0041
        L_0x0036:
            com.moovit.metroentities.MetroEntityType r0 = com.moovit.metroentities.MetroEntityType.TRANSIT_LINE_GROUP
            goto L_0x0041
        L_0x0039:
            com.moovit.metroentities.MetroEntityType r0 = com.moovit.metroentities.MetroEntityType.TRANSIT_LINE
            goto L_0x0041
        L_0x003c:
            com.moovit.metroentities.MetroEntityType r0 = com.moovit.metroentities.MetroEntityType.BICYCLE_STOP
            goto L_0x0041
        L_0x003f:
            com.moovit.metroentities.MetroEntityType r0 = com.moovit.metroentities.MetroEntityType.TRANSIT_STOP
        L_0x0041:
            r10.f17401m = r0
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity r12 = r12.entity
            int[] r1 = c70.C13749c.C13750a.f33839a
            int r3 = r0.ordinal()
            r1 = r1[r3]
            r3 = 0
            switch(r1) {
                case 1: goto L_0x025a;
                case 2: goto L_0x0207;
                case 3: goto L_0x01da;
                case 4: goto L_0x01da;
                case 5: goto L_0x018c;
                case 6: goto L_0x014e;
                case 7: goto L_0x0104;
                case 8: goto L_0x0066;
                default: goto L_0x0051;
            }
        L_0x0051:
            com.moovit.commons.utils.ApplicationBugException r11 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r2)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>((java.lang.String) r12)
            throw r11
        L_0x0066:
            F r0 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.TRIP_FREQUENCY
            if (r0 != r1) goto L_0x00e7
            java.lang.Object r12 = r12.value_
            com.tranzmate.moovit.protocol.gtfs.MVTripFrequency r12 = (com.tranzmate.moovit.protocol.gtfs.MVTripFrequency) r12
            c00.c r0 = com.moovit.transit.C7841a.f23766a
            int r0 = r12.frequencyId
            com.moovit.network.model.ServerId r1 = new com.moovit.network.model.ServerId
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.tranzmate.moovit.protocol.gtfs.MVTripFrequencyDetail> r2 = r12.details
            r3 = 0
            if (r2 != 0) goto L_0x0082
            r2 = 0
            goto L_0x0086
        L_0x0082:
            int r2 = r2.size()
        L_0x0086:
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List<com.tranzmate.moovit.protocol.gtfs.MVTripFrequencyDetail> r4 = r12.details
            if (r4 != 0) goto L_0x0090
            goto L_0x0094
        L_0x0090:
            int r3 = r4.size()
        L_0x0094:
            r2.<init>(r3)
            java.util.List<com.tranzmate.moovit.protocol.gtfs.MVTripFrequencyDetail> r12 = r12.details
            java.util.Iterator r12 = r12.iterator()
        L_0x009d:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x00e0
            java.lang.Object r3 = r12.next()
            com.tranzmate.moovit.protocol.gtfs.MVTripFrequencyDetail r3 = (com.tranzmate.moovit.protocol.gtfs.MVTripFrequencyDetail) r3
            zz.l0 r4 = new zz.l0
            int r5 = r3.fromTimeRelativeSeconds
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r3.toTimeRelativeSeconds
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            r0.add(r4)
            zz.l0 r4 = new zz.l0
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MINUTES
            int r6 = r3.rangeMinMinutes
            long r6 = (long) r6
            long r6 = r5.toSeconds(r6)
            int r7 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            int r3 = r3.rangeMaxMinutes
            long r7 = (long) r3
            long r7 = r5.toSeconds(r7)
            int r3 = (int) r7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.<init>(r6, r3)
            r2.add(r4)
            goto L_0x009d
        L_0x00e0:
            com.moovit.transit.TransitFrequency r12 = new com.moovit.transit.TransitFrequency
            r12.<init>(r1, r0, r2)
            goto L_0x0268
        L_0x00e7:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'tripFrequency' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r12 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r12 = (com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields) r12
            vi0.c r12 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity.m27202k(r12)
            java.lang.String r12 = r12.f63355a
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L_0x0104:
            F r0 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.LINE_SHAPE_SEGMENT
            if (r0 != r1) goto L_0x0131
            java.lang.Object r12 = r12.value_
            com.tranzmate.moovit.protocol.gtfs.MVLineShapeSegment r12 = (com.tranzmate.moovit.protocol.gtfs.MVLineShapeSegment) r12
            c00.c r0 = com.moovit.transit.C7841a.f23766a
            int r0 = r12.shapeSegmentId
            com.moovit.network.model.ServerId r1 = new com.moovit.network.model.ServerId
            r1.<init>(r0)
            int r0 = r12.fromStopId
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r0)
            int r0 = r12.toStopId
            com.moovit.network.model.ServerId r3 = new com.moovit.network.model.ServerId
            r3.<init>(r0)
            java.lang.String r12 = r12.encodedShape
            com.moovit.commons.geo.Polylon r12 = com.moovit.commons.geo.Polylon.m40195m(r12)
            com.moovit.transit.ShapeSegment r0 = new com.moovit.transit.ShapeSegment
            r0.<init>(r1, r2, r3, r12)
            goto L_0x016c
        L_0x0131:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'lineShapeSegment' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r12 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r12 = (com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields) r12
            vi0.c r12 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity.m27202k(r12)
            java.lang.String r12 = r12.f63355a
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L_0x014e:
            F r0 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.MV_TRIP_SHAPE
            if (r0 != r1) goto L_0x016f
            java.lang.Object r12 = r12.value_
            com.tranzmate.moovit.protocol.gtfs.MVTripShape r12 = (com.tranzmate.moovit.protocol.gtfs.MVTripShape) r12
            c00.c r0 = com.moovit.transit.C7841a.f23766a
            int r0 = r12.shapeId
            com.moovit.network.model.ServerId r1 = new com.moovit.network.model.ServerId
            r1.<init>(r0)
            java.lang.String r12 = r12.encodedShape
            com.moovit.commons.geo.Polylon r12 = com.moovit.commons.geo.Polylon.m40195m(r12)
            com.moovit.transit.Shape r0 = new com.moovit.transit.Shape
            r0.<init>(r1, r12)
        L_0x016c:
            r12 = r0
            goto L_0x0268
        L_0x016f:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'mvTripShape' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r12 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r12 = (com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields) r12
            vi0.c r12 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity.m27202k(r12)
            java.lang.String r12 = r12.f63355a
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L_0x018c:
            F r0 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.TRIP_PATTERN
            if (r0 != r1) goto L_0x01bd
            java.lang.Object r12 = r12.value_
            com.tranzmate.moovit.protocol.gtfs.MVTripPattern r12 = (com.tranzmate.moovit.protocol.gtfs.MVTripPattern) r12
            c00.c r0 = com.moovit.transit.C7841a.f23766a
            int r0 = r12.tripPatternId
            com.moovit.network.model.ServerId r1 = new com.moovit.network.model.ServerId
            r1.<init>(r0)
            java.util.List<java.lang.Integer> r0 = r12.stopIds
            e0.r0 r2 = new e0.r0
            r4 = 26
            r2.<init>(r4)
            c00.n<com.moovit.network.model.ServerId, com.moovit.database.DbEntityRef<com.moovit.transit.TransitStop>> r4 = com.moovit.database.DbEntityRef.STOP_ID_TO_STOP_REF_CONVERTER
            c00.c r5 = new c00.c
            r5.<init>(r4, r2)
            java.util.ArrayList r0 = c00.C13720d.m34273c(r0, r3, r5)
            java.util.List<java.lang.String> r12 = r12.stopNames
            com.moovit.transit.TransitPattern r2 = new com.moovit.transit.TransitPattern
            r2.<init>(r1, r0, r12)
            r12 = r2
            goto L_0x0268
        L_0x01bd:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'tripPattern' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r12 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r12 = (com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields) r12
            vi0.c r12 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity.m27202k(r12)
            java.lang.String r12 = r12.f63355a
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L_0x01da:
            F r0 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.LINE_GROUP_SUMMARY
            if (r0 != r1) goto L_0x01ea
            java.lang.Object r12 = r12.value_
            com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummary r12 = (com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummary) r12
            com.moovit.transit.TransitLineGroup r12 = com.moovit.transit.C7841a.m17864b(r12)
            goto L_0x0268
        L_0x01ea:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'lineGroupSummary' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r12 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r12 = (com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields) r12
            vi0.c r12 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity.m27202k(r12)
            java.lang.String r12 = r12.f63355a
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L_0x0207:
            F r0 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.BICYCLE_STOP
            if (r0 != r1) goto L_0x023d
            java.lang.Object r12 = r12.value_
            com.tranzmate.moovit.protocol.gtfs.MVBicycleStop r12 = (com.tranzmate.moovit.protocol.gtfs.MVBicycleStop) r12
            c00.c r0 = com.moovit.transit.C7841a.f23766a
            int r0 = r12.providerId
            com.moovit.network.model.ServerId r1 = new com.moovit.network.model.ServerId
            r1.<init>(r0)
            com.moovit.database.DbEntityRef r5 = com.moovit.database.DbEntityRef.newBicycleProviderRef(r1)
            int r0 = r12.stopId
            com.moovit.network.model.ServerId r6 = new com.moovit.network.model.ServerId
            r6.<init>(r0)
            java.lang.String r7 = r12.name
            boolean r0 = r12.mo27328f()
            if (r0 == 0) goto L_0x022f
            java.lang.String r3 = r12.address
        L_0x022f:
            r8 = r3
            com.tranzmate.moovit.protocol.common.MVLatLon r12 = r12.location
            com.moovit.commons.geo.LatLonE6 r9 = c70.C13749c.m34322h(r12)
            com.moovit.transit.BicycleStop r12 = new com.moovit.transit.BicycleStop
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0268
        L_0x023d:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'bicycleStop' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r12 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r12 = (com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields) r12
            vi0.c r12 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity.m27202k(r12)
            java.lang.String r12 = r12.f63355a
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L_0x025a:
            F r0 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.STOP_METADATA
            if (r0 != r1) goto L_0x028c
            java.lang.Object r12 = r12.value_
            com.tranzmate.moovit.protocol.gtfs.MVStopMetaData r12 = (com.tranzmate.moovit.protocol.gtfs.MVStopMetaData) r12
            com.moovit.transit.TransitStop r12 = com.moovit.transit.C7841a.m17867e(r12)
        L_0x0268:
            r10.f17402n = r12
            com.moovit.metroentities.MetroEntityType r12 = r10.f17401m
            k30.a r12 = r12.getResolver()
            j40.a r0 = r10.f17402n
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Set r12 = r12.mo21356a(r0, r1)
            i30.e r0 = r11.f17398x
            com.moovit.metroentities.MetroEntityType r1 = r10.f17401m
            r0.mo21070i(r1, r12)
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap<com.moovit.metroentities.MetroEntityType, j40.a> r11 = r11.f17395A
            com.moovit.metroentities.MetroEntityType r12 = r10.f17401m
            j40.a r0 = r10.f17402n
            r11.mo47001a(r12, r0)
            return
        L_0x028c:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'stopMetadata' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r12 = r12.setField_
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r12 = (com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields) r12
            vi0.c r12 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity.m27202k(r12)
            java.lang.String r12 = r12.f63355a
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i30.C5266b.mo5816m(c70.a, org.apache.thrift.TBase):void");
    }
}

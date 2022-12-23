package e20;

import c00.C13733n;
import i30.C5268d;
import p824tp.C19728f;
import q00.C19047a;

/* renamed from: e20.b */
public final /* synthetic */ class C16766b implements C13733n {

    /* renamed from: b */
    public final /* synthetic */ C19728f f43646b;

    /* renamed from: c */
    public final /* synthetic */ C19047a f43647c;

    /* renamed from: d */
    public final /* synthetic */ C5268d f43648d;

    public /* synthetic */ C16766b(C19728f fVar, C19047a aVar, C5268d dVar) {
        this.f43646b = fVar;
        this.f43647c = aVar;
        this.f43648d = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v11, resolved type: com.moovit.micromobility.MicroMobilityIntegrationItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: com.moovit.network.model.ServerId} */
    /* JADX WARNING: type inference failed for: r22v17, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r10v20, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r18v8, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r10v22, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r10v24, types: [com.moovit.micromobility.MicroMobilityIntegrationItem] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0700  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x07f3  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x082f  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x08f4  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0930  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x09ef  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0a20  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0ae0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object convert(java.lang.Object r30) {
        /*
            r29 = this;
            r0 = r29
            tp.f r1 = r0.f43646b
            q00.a r2 = r0.f43647c
            i30.d r3 = r0.f43648d
            r4 = r30
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg r4 = (com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg) r4
            F r5 = r4.setField_
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r6 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.WALK_LEG
            r7 = 1
            r8 = 0
            if (r5 != r6) goto L_0x0016
            r6 = 1
            goto L_0x0017
        L_0x0016:
            r6 = 0
        L_0x0017:
            r9 = 12
            r10 = 0
            if (r6 == 0) goto L_0x0059
            com.tranzmate.moovit.protocol.tripplanner.MVWalkLeg r1 = r4.mo34667v()
            com.tranzmate.moovit.protocol.tripplanner.MVTime r2 = r1.time
            zz.i0 r2 = com.moovit.itinerary.C16080a.m40952h(r2)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.origin
            com.moovit.transit.LocationDescriptor r14 = com.moovit.itinerary.C16080a.m40949e(r4, r10, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.dest
            com.moovit.transit.LocationDescriptor r15 = com.moovit.itinerary.C16080a.m40949e(r4, r10, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape r3 = r1.shape
            com.moovit.commons.geo.Polylon r16 = com.moovit.itinerary.C16080a.m40950f(r3)
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction> r1 = r1.walkingInstructoins
            com.facebook.appevents.l r3 = new com.facebook.appevents.l
            r3.<init>(r9)
            java.util.ArrayList r17 = c00.C13720d.m34273c(r1, r10, r3)
            com.moovit.itinerary.model.leg.WalkLeg r1 = new com.moovit.itinerary.model.leg.WalkLeg
            F r3 = r2.f52692a
            r12 = r3
            com.moovit.util.time.Time r12 = (com.moovit.util.time.Time) r12
            S r2 = r2.f52693b
            r13 = r2
            com.moovit.util.time.Time r13 = (com.moovit.util.time.Time) r13
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x0b2b
        L_0x0059:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r6 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.BICYCLE_LEG
            if (r5 != r6) goto L_0x005f
            r6 = 1
            goto L_0x0060
        L_0x005f:
            r6 = 0
        L_0x0060:
            r11 = 9
            if (r6 == 0) goto L_0x00a1
            com.tranzmate.moovit.protocol.tripplanner.MVBicycleLeg r1 = r4.mo34657k()
            com.tranzmate.moovit.protocol.tripplanner.MVTime r2 = r1.time
            zz.i0 r2 = com.moovit.itinerary.C16080a.m40952h(r2)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.origin
            com.moovit.transit.LocationDescriptor r15 = com.moovit.itinerary.C16080a.m40949e(r4, r10, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.dest
            com.moovit.transit.LocationDescriptor r16 = com.moovit.itinerary.C16080a.m40949e(r4, r10, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape r3 = r1.shape
            com.moovit.commons.geo.Polylon r17 = com.moovit.itinerary.C16080a.m40950f(r3)
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction> r1 = r1.cyclingInstructions
            tt.a r3 = new tt.a
            r3.<init>(r11)
            java.util.ArrayList r18 = c00.C13720d.m34273c(r1, r10, r3)
            com.moovit.itinerary.model.leg.BicycleLeg r1 = new com.moovit.itinerary.model.leg.BicycleLeg
            F r3 = r2.f52692a
            r13 = r3
            com.moovit.util.time.Time r13 = (com.moovit.util.time.Time) r13
            S r2 = r2.f52693b
            r14 = r2
            com.moovit.util.time.Time r14 = (com.moovit.util.time.Time) r14
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            goto L_0x0b2b
        L_0x00a1:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r6 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.BICYCLE_RENTAL_LEG
            if (r5 != r6) goto L_0x00a7
            r6 = 1
            goto L_0x00a8
        L_0x00a7:
            r6 = 0
        L_0x00a8:
            r12 = 10
            if (r6 == 0) goto L_0x0195
            com.tranzmate.moovit.protocol.tripplanner.MVBicycleRentalLeg r1 = r4.mo34658l()
            com.tranzmate.moovit.protocol.tripplanner.MVTime r2 = r1.time
            zz.i0 r2 = com.moovit.itinerary.C16080a.m40952h(r2)
            com.tranzmate.moovit.protocol.common.MVLocationType r4 = com.tranzmate.moovit.protocol.common.MVLocationType.BicycleStop
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r5 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r5 = r5.origin
            com.tranzmate.moovit.protocol.common.MVLocationType r5 = r5.type
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00dc
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r5 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r5 = r5.origin
            int r5 = r5.f25101id
            com.moovit.network.model.ServerId r6 = new com.moovit.network.model.ServerId
            r6.<init>(r5)
            com.moovit.util.ServerIdMap<com.moovit.transit.BicycleStop> r5 = r3.f17408e
            java.lang.Object r5 = r5.get(r6)
            com.moovit.transit.BicycleStop r5 = (com.moovit.transit.BicycleStop) r5
            com.moovit.database.DbEntityRef r5 = com.moovit.database.DbEntityRef.newBicycleStopRef((com.moovit.transit.BicycleStop) r5)
            goto L_0x00dd
        L_0x00dc:
            r5 = r10
        L_0x00dd:
            if (r5 != 0) goto L_0x00e8
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r6 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r6 = r6.origin
            com.moovit.transit.LocationDescriptor r6 = com.moovit.itinerary.C16080a.m40949e(r6, r10, r3)
            goto L_0x00e9
        L_0x00e8:
            r6 = r10
        L_0x00e9:
            boolean r7 = r1.mo34167k()
            if (r7 == 0) goto L_0x0102
            java.util.List<java.lang.Integer> r7 = r1.originNearbyBicycleStopIds
            a8.l r8 = new a8.l
            r8.<init>(r12)
            c00.n<com.moovit.network.model.ServerId, com.moovit.database.DbEntityRef<com.moovit.transit.BicycleStop>> r12 = com.moovit.database.DbEntityRef.BICYCLE_STOP_ID_TO_BICYCLE_STOP_REF_CONVERTER
            c00.c r13 = new c00.c
            r13.<init>(r12, r8)
            java.util.ArrayList r7 = c00.C13720d.m34273c(r7, r10, r13)
            goto L_0x0106
        L_0x0102:
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x0106:
            r16 = r7
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r7 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r7 = r7.dest
            com.tranzmate.moovit.protocol.common.MVLocationType r7 = r7.type
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x012c
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.dest
            int r4 = r4.f25101id
            com.moovit.network.model.ServerId r7 = new com.moovit.network.model.ServerId
            r7.<init>(r4)
            com.moovit.util.ServerIdMap<com.moovit.transit.BicycleStop> r4 = r3.f17408e
            java.lang.Object r4 = r4.get(r7)
            com.moovit.transit.BicycleStop r4 = (com.moovit.transit.BicycleStop) r4
            com.moovit.database.DbEntityRef r4 = com.moovit.database.DbEntityRef.newBicycleStopRef((com.moovit.transit.BicycleStop) r4)
            goto L_0x012d
        L_0x012c:
            r4 = r10
        L_0x012d:
            if (r4 != 0) goto L_0x0138
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r7 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r7 = r7.dest
            com.moovit.transit.LocationDescriptor r3 = com.moovit.itinerary.C16080a.m40949e(r7, r10, r3)
            goto L_0x0139
        L_0x0138:
            r3 = r10
        L_0x0139:
            boolean r7 = r1.mo34162g()
            if (r7 == 0) goto L_0x0152
            java.util.List<java.lang.Integer> r7 = r1.destNearbyBicycleStopIds
            d0.q r8 = new d0.q
            r8.<init>(r9)
            c00.n<com.moovit.network.model.ServerId, com.moovit.database.DbEntityRef<com.moovit.transit.BicycleStop>> r9 = com.moovit.database.DbEntityRef.BICYCLE_STOP_ID_TO_BICYCLE_STOP_REF_CONVERTER
            c00.c r12 = new c00.c
            r12.<init>(r9, r8)
            java.util.ArrayList r7 = c00.C13720d.m34273c(r7, r10, r12)
            goto L_0x0156
        L_0x0152:
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x0156:
            r18 = r7
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape r7 = r1.shape
            com.moovit.commons.geo.Polylon r19 = com.moovit.itinerary.C16080a.m40950f(r7)
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction> r7 = r1.cyclingInstructions
            wt.e r8 = new wt.e
            r8.<init>(r11)
            java.util.ArrayList r20 = c00.C13720d.m34273c(r7, r10, r8)
            boolean r7 = r1.mo34165i()
            if (r7 == 0) goto L_0x0175
            com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem r1 = r1.integrationItem
            com.moovit.micromobility.MicroMobilityIntegrationItem r10 = t30.C6565g.m15498b(r1)
        L_0x0175:
            r21 = r10
            com.moovit.itinerary.model.leg.BicycleRentalLeg r1 = new com.moovit.itinerary.model.leg.BicycleRentalLeg
            F r7 = r2.f52692a
            r13 = r7
            com.moovit.util.time.Time r13 = (com.moovit.util.time.Time) r13
            S r2 = r2.f52693b
            r14 = r2
            com.moovit.util.time.Time r14 = (com.moovit.util.time.Time) r14
            zz.i0 r15 = new zz.i0
            r15.<init>(r5, r6)
            zz.i0 r2 = new zz.i0
            r2.<init>(r4, r3)
            r12 = r1
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0b2b
        L_0x0195:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r6 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.WAIT_TO_LINE_LEG
            if (r5 != r6) goto L_0x019b
            r6 = 1
            goto L_0x019c
        L_0x019b:
            r6 = 0
        L_0x019c:
            if (r6 == 0) goto L_0x01a8
            com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineLeg r4 = r4.mo34664s()
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r1 = com.moovit.itinerary.C16080a.m40958n(r1, r2, r3, r4)
            goto L_0x0b2b
        L_0x01a8:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r6 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.LINE_LEG
            if (r5 != r6) goto L_0x01ae
            r6 = 1
            goto L_0x01af
        L_0x01ae:
            r6 = 0
        L_0x01af:
            if (r6 == 0) goto L_0x01bb
            com.tranzmate.moovit.protocol.tripplanner.MVLineLeg r1 = r4.mo34660o()
            com.moovit.itinerary.model.leg.TransitLineLeg r1 = com.moovit.itinerary.C16080a.m40954j(r3, r1)
            goto L_0x0b2b
        L_0x01bb:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r6 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.WAIT_TO_MULTI_LINE_LEG
            if (r5 != r6) goto L_0x01c1
            r6 = 1
            goto L_0x01c2
        L_0x01c1:
            r6 = 0
        L_0x01c2:
            if (r6 == 0) goto L_0x01ce
            com.tranzmate.moovit.protocol.tripplanner.MVWaitToMultiLineLeg r4 = r4.mo34665t()
            com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg r1 = com.moovit.itinerary.C16080a.m40957m(r1, r2, r4, r3)
            goto L_0x0b2b
        L_0x01ce:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.LINE_WITH_ALTERNARIVES_LEG
            if (r5 != r1) goto L_0x01d4
            r1 = 1
            goto L_0x01d5
        L_0x01d4:
            r1 = 0
        L_0x01d5:
            if (r1 == 0) goto L_0x01f0
            com.tranzmate.moovit.protocol.tripplanner.MVLineWithAlternativesLeg r1 = r4.mo34661p()
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVLineLeg> r2 = r1.alternativeLines
            iw.l r4 = new iw.l
            r4.<init>(r3, r7)
            java.util.ArrayList r2 = c00.C13720d.m34273c(r2, r10, r4)
            byte r1 = r1.primaryAlternativeIndex
            com.moovit.itinerary.model.leg.MultiTransitLinesLeg r3 = new com.moovit.itinerary.model.leg.MultiTransitLinesLeg
            r3.<init>(r2, r1)
            r1 = r3
            goto L_0x0b2b
        L_0x01f0:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.WAIT_TO_TAXI_LEG
            if (r5 != r1) goto L_0x01f6
            r1 = 1
            goto L_0x01f7
        L_0x01f6:
            r1 = 0
        L_0x01f7:
            r2 = 11
            if (r1 == 0) goto L_0x0251
            com.tranzmate.moovit.protocol.tripplanner.MVWaitToTaxiLeg r1 = r4.mo34666u()
            int r4 = r1.taxiId
            com.moovit.network.model.ServerId r12 = new com.moovit.network.model.ServerId
            r12.<init>(r4)
            com.tranzmate.moovit.protocol.tripplanner.MVTime r4 = r1.time
            zz.i0 r4 = com.moovit.itinerary.C16080a.m40952h(r4)
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r5 = r1.waitAtLocation
            com.moovit.transit.LocationDescriptor r15 = com.moovit.itinerary.C16080a.m40949e(r5, r10, r3)
            boolean r3 = r1.mo34890i()
            if (r3 == 0) goto L_0x0221
            com.tranzmate.moovit.protocol.taxi.MVTaxiPrice r3 = r1.taxiPrice
            com.moovit.taxi.TaxiPrice r3 = com.moovit.taxi.C7630a.m17423a(r3)
            r16 = r3
            goto L_0x0223
        L_0x0221:
            r16 = r10
        L_0x0223:
            int r3 = r1.approxWaitingSecFromOrdering
            boolean r5 = r1.mo34887g()
            if (r5 == 0) goto L_0x023b
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter> r1 = r1.customParameters
            lr.n r5 = new lr.n
            r5.<init>(r9)
            e0.r0 r6 = new e0.r0
            r6.<init>(r2)
            java.util.HashMap r10 = c00.C13720d.m34274d(r1, r5, r6)
        L_0x023b:
            r18 = r10
            com.moovit.itinerary.model.leg.WaitToTaxiLeg r1 = new com.moovit.itinerary.model.leg.WaitToTaxiLeg
            F r2 = r4.f52692a
            r13 = r2
            com.moovit.util.time.Time r13 = (com.moovit.util.time.Time) r13
            S r2 = r4.f52693b
            r14 = r2
            com.moovit.util.time.Time r14 = (com.moovit.util.time.Time) r14
            r11 = r1
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0b2b
        L_0x0251:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.TAXI_LEG
            if (r5 != r1) goto L_0x0257
            r1 = 1
            goto L_0x0258
        L_0x0257:
            r1 = 0
        L_0x0258:
            if (r1 == 0) goto L_0x02c1
            com.tranzmate.moovit.protocol.tripplanner.MVTaxiLeg r1 = r4.mo34663r()
            int r4 = r1.taxiId
            com.moovit.network.model.ServerId r14 = new com.moovit.network.model.ServerId
            r14.<init>(r4)
            com.tranzmate.moovit.protocol.tripplanner.MVTime r4 = r1.time
            zz.i0 r4 = com.moovit.itinerary.C16080a.m40952h(r4)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r5 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r5 = r5.origin
            com.moovit.transit.LocationDescriptor r17 = com.moovit.itinerary.C16080a.m40949e(r5, r10, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r5 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r5 = r5.dest
            com.moovit.transit.LocationDescriptor r18 = com.moovit.itinerary.C16080a.m40949e(r5, r10, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape r3 = r1.shape
            com.moovit.commons.geo.Polylon r19 = com.moovit.itinerary.C16080a.m40950f(r3)
            boolean r3 = r1.mo34558m()
            if (r3 == 0) goto L_0x0290
            com.tranzmate.moovit.protocol.taxi.MVTaxiPrice r3 = r1.taxiPrice
            com.moovit.taxi.TaxiPrice r3 = com.moovit.taxi.C7630a.m17423a(r3)
            r20 = r3
            goto L_0x0292
        L_0x0290:
            r20 = r10
        L_0x0292:
            int r3 = r1.approxWaitingSecFromOrdering
            boolean r5 = r1.mo34551g()
            if (r5 == 0) goto L_0x02aa
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter> r1 = r1.customParameters
            hq.e r5 = new hq.e
            r5.<init>(r2)
            tt.a r2 = new tt.a
            r2.<init>(r12)
            java.util.HashMap r10 = c00.C13720d.m34274d(r1, r5, r2)
        L_0x02aa:
            r22 = r10
            com.moovit.itinerary.model.leg.TaxiLeg r1 = new com.moovit.itinerary.model.leg.TaxiLeg
            F r2 = r4.f52692a
            r15 = r2
            com.moovit.util.time.Time r15 = (com.moovit.util.time.Time) r15
            S r2 = r4.f52693b
            r16 = r2
            com.moovit.util.time.Time r16 = (com.moovit.util.time.Time) r16
            r13 = r1
            r21 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0b2b
        L_0x02c1:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.PATHWAY_WALK_LEG
            if (r5 != r1) goto L_0x02c7
            r1 = 1
            goto L_0x02c8
        L_0x02c7:
            r1 = 0
        L_0x02c8:
            if (r1 == 0) goto L_0x0313
            com.tranzmate.moovit.protocol.tripplanner.MVPathwayWalkLeg r1 = r4.mo34662q()
            com.tranzmate.moovit.protocol.tripplanner.MVTime r2 = r1.time
            zz.i0 r2 = com.moovit.itinerary.C16080a.m40952h(r2)
            int r4 = r1.stopId
            com.moovit.network.model.ServerId r5 = new com.moovit.network.model.ServerId
            r5.<init>(r4)
            com.moovit.transit.TransitStop r3 = r3.mo21064c(r5)
            com.moovit.database.DbEntityRef r7 = com.moovit.database.DbEntityRef.newTransitStopRef((com.moovit.transit.TransitStop) r3)
            boolean r3 = r1.mo34480i()
            if (r3 == 0) goto L_0x02f2
            int r3 = r1.originPathwayId
            com.moovit.network.model.ServerId r4 = new com.moovit.network.model.ServerId
            r4.<init>(r3)
            r8 = r4
            goto L_0x02f3
        L_0x02f2:
            r8 = r10
        L_0x02f3:
            boolean r3 = r1.mo34477g()
            if (r3 == 0) goto L_0x0300
            int r1 = r1.destinationPathwayId
            com.moovit.network.model.ServerId r10 = new com.moovit.network.model.ServerId
            r10.<init>(r1)
        L_0x0300:
            r9 = r10
            com.moovit.itinerary.model.leg.PathwayWalkLeg r1 = new com.moovit.itinerary.model.leg.PathwayWalkLeg
            F r3 = r2.f52692a
            r5 = r3
            com.moovit.util.time.Time r5 = (com.moovit.util.time.Time) r5
            S r2 = r2.f52693b
            r6 = r2
            com.moovit.util.time.Time r6 = (com.moovit.util.time.Time) r6
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0b2b
        L_0x0313:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.CARPOOL_RIDE_LEG
            if (r5 != r1) goto L_0x0319
            r2 = 1
            goto L_0x031a
        L_0x0319:
            r2 = 0
        L_0x031a:
            if (r2 == 0) goto L_0x06a5
            if (r5 != r1) goto L_0x0688
            java.lang.Object r1 = r4.value_
            com.tranzmate.moovit.protocol.tripplanner.MVCarpoolRideLeg r1 = (com.tranzmate.moovit.protocol.tripplanner.MVCarpoolRideLeg) r1
            com.tranzmate.moovit.protocol.carpool.MVRide r2 = r1.ride
            com.tranzmate.moovit.protocol.carpool.MVCarpoolDriver r3 = r1.driver
            com.tranzmate.moovit.protocol.tripplanner.MVTime r4 = r1.time
            zz.i0 r4 = com.moovit.itinerary.C16080a.m40952h(r4)
            boolean r5 = r1.mo34206m()
            if (r5 == 0) goto L_0x0339
            boolean r5 = r1.isEstimatedTimes
            if (r5 == 0) goto L_0x0339
            r5 = 1
            r12 = 1
            goto L_0x033b
        L_0x0339:
            r5 = 0
            r12 = 0
        L_0x033b:
            com.tranzmate.moovit.protocol.carpool.MVRide r5 = r1.ride
            com.tranzmate.moovit.protocol.carpool.MVJourneyInfo r5 = r5.journey
            com.tranzmate.moovit.protocol.carpool.MVRideLocationDescriptor r5 = r5.pickup
            com.moovit.transit.LocationDescriptor r6 = new com.moovit.transit.LocationDescriptor
            com.moovit.transit.LocationDescriptor$LocationType r9 = com.moovit.transit.LocationDescriptor.LocationType.COORDINATE
            com.moovit.transit.LocationDescriptor$SourceType r10 = com.moovit.transit.LocationDescriptor.SourceType.EXTERNAL
            r11 = 0
            r24 = 0
            java.lang.String r15 = r5.address
            java.util.List r19 = java.util.Collections.emptyList()
            com.tranzmate.moovit.protocol.common.MVLatLon r5 = r5.latlon
            com.moovit.commons.geo.LatLonE6 r20 = c70.C13749c.m34322h(r5)
            com.moovit.image.model.ResourceImage r5 = new com.moovit.image.model.ResourceImage
            int r14 = p824tp.C19739q.ic_poi_location_24_on_surface_emphasis_high
            java.lang.String[] r13 = new java.lang.String[r8]
            r5.<init>(r14, r13)
            r16 = 0
            r17 = 0
            r25 = 0
            r26 = 0
            r13 = r6
            r7 = r14
            r14 = r9
            r18 = r15
            r15 = r10
            r21 = r25
            r22 = r5
            r23 = r26
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.tranzmate.moovit.protocol.carpool.MVRide r5 = r1.ride
            com.tranzmate.moovit.protocol.carpool.MVJourneyInfo r5 = r5.journey
            com.tranzmate.moovit.protocol.carpool.MVRideLocationDescriptor r5 = r5.dropoff
            com.moovit.transit.LocationDescriptor r28 = new com.moovit.transit.LocationDescriptor
            java.lang.String r15 = r5.address
            java.util.List r19 = java.util.Collections.emptyList()
            com.tranzmate.moovit.protocol.common.MVLatLon r5 = r5.latlon
            com.moovit.commons.geo.LatLonE6 r20 = c70.C13749c.m34322h(r5)
            com.moovit.image.model.ResourceImage r5 = new com.moovit.image.model.ResourceImage
            java.lang.String[] r13 = new java.lang.String[r8]
            r5.<init>(r7, r13)
            r13 = r28
            r7 = r15
            r15 = r10
            r16 = r11
            r17 = r24
            r18 = r7
            r22 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.tranzmate.moovit.protocol.tripplanner.MVCarPoolSource r5 = r1.carpoolSource
            int[] r7 = com.moovit.itinerary.C16080a.C16081a.f41873c
            int r9 = r5.ordinal()
            r9 = r7[r9]
            java.lang.String r10 = "Unknown carpool source: "
            switch(r9) {
                case 1: goto L_0x03d3;
                case 2: goto L_0x03d0;
                case 3: goto L_0x03cd;
                case 4: goto L_0x03ca;
                case 5: goto L_0x03c7;
                case 6: goto L_0x03c4;
                default: goto L_0x03af;
            }
        L_0x03af:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x03c4:
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r5 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.BLABLA
            goto L_0x03d5
        L_0x03c7:
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r5 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.BLABLALINES
            goto L_0x03d5
        L_0x03ca:
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r5 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.KAROS
            goto L_0x03d5
        L_0x03cd:
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r5 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.KLAXIT
            goto L_0x03d5
        L_0x03d0:
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r5 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.WAZE
            goto L_0x03d5
        L_0x03d3:
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r5 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.MOOVIT
        L_0x03d5:
            r15 = r5
            com.tranzmate.moovit.protocol.tripplanner.MVCarpoolType r5 = r1.carpoolType
            int[] r9 = com.moovit.itinerary.C16080a.C16081a.f41871a
            int r11 = r5.ordinal()
            r9 = r9[r11]
            r11 = 3
            r13 = 2
            r14 = 1
            if (r9 == r14) goto L_0x0406
            if (r9 == r13) goto L_0x0403
            if (r9 != r11) goto L_0x03ec
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r5 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.NEARBY_DRIVERS
            goto L_0x0408
        L_0x03ec:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown carpool type: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0403:
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r5 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.SINGLE_DRIVER
            goto L_0x0408
        L_0x0406:
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r5 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.ANONYMOUS
        L_0x0408:
            com.tranzmate.moovit.protocol.carpool.MVRide r9 = r1.ride
            boolean r9 = r9.mo25858p()
            if (r9 == 0) goto L_0x0419
            com.tranzmate.moovit.protocol.carpool.MVRide r9 = r1.ride
            com.tranzmate.moovit.protocol.carpool.MVCarPoolPrice r9 = r9.price
            com.moovit.util.CurrencyAmount r9 = c70.C13749c.m34317c(r9)
            goto L_0x041a
        L_0x0419:
            r9 = 0
        L_0x041a:
            r18 = r9
            com.tranzmate.moovit.protocol.carpool.MVCarPoolPrice r9 = r2.fullPrice
            if (r9 != 0) goto L_0x0423
            r19 = r18
            goto L_0x0429
        L_0x0423:
            com.moovit.util.CurrencyAmount r9 = c70.C13749c.m34317c(r9)
            r19 = r9
        L_0x0429:
            if (r3 != 0) goto L_0x0440
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolDriverInfo r8 = new com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolDriverInfo
            r21 = 0
            r22 = 0
            r23 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = -1
            r25 = 0
            r26 = 0
            r20 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26)
            goto L_0x04d1
        L_0x0440:
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r9 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.SINGLE_DRIVER
            if (r5 != r9) goto L_0x0447
            java.lang.String r9 = r3.firstName
            goto L_0x0448
        L_0x0447:
            r9 = 0
        L_0x0448:
            r21 = r9
            boolean r9 = r3.mo25542u()
            if (r9 == 0) goto L_0x0460
            java.lang.String r9 = r3.profilePhotoUrl
            android.net.Uri r9 = android.net.Uri.parse(r9)
            java.lang.String[] r8 = new java.lang.String[r8]
            com.moovit.image.model.UriImage r11 = new com.moovit.image.model.UriImage
            r11.<init>(r9, r8)
            r22 = r11
            goto L_0x0463
        L_0x0460:
            r8 = 0
            r22 = r8
        L_0x0463:
            boolean r8 = r3.mo25543v()
            if (r8 == 0) goto L_0x046f
            double r8 = r3.rating
            float r8 = (float) r8
            r23 = r8
            goto L_0x0473
        L_0x046f:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r23 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0473:
            boolean r8 = r3.mo25538r()
            if (r8 == 0) goto L_0x047e
            short r8 = r3.numFinishedRides
            r24 = r8
            goto L_0x0481
        L_0x047e:
            r8 = -1
            r24 = -1
        L_0x0481:
            boolean r8 = r3.mo25530i()
            if (r8 == 0) goto L_0x04a0
            com.tranzmate.moovit.protocol.carpool.MVCar r8 = r3.car
            if (r8 == 0) goto L_0x0497
            com.moovit.carpool.CarpoolCar r9 = new com.moovit.carpool.CarpoolCar
            java.lang.String r11 = r8.number
            java.lang.String r13 = r8.model
            java.lang.String r8 = r8.color
            r9.<init>(r11, r13, r8)
            goto L_0x049d
        L_0x0497:
            com.moovit.carpool.CarpoolCar r9 = new com.moovit.carpool.CarpoolCar
            r8 = 0
            r9.<init>(r8, r8, r8)
        L_0x049d:
            r25 = r9
            goto L_0x04a3
        L_0x04a0:
            r8 = 0
            r25 = r8
        L_0x04a3:
            boolean r8 = r3.mo25533l()
            if (r8 == 0) goto L_0x04c7
            com.tranzmate.moovit.protocol.common.MVCarPoolWorkDetails r8 = r3.driversWorkData
            boolean r9 = r8.mo26097i()
            if (r9 == 0) goto L_0x04b4
            java.lang.String r9 = r8.workName
            goto L_0x04b5
        L_0x04b4:
            r9 = 0
        L_0x04b5:
            boolean r11 = r8.mo26095h()
            if (r11 == 0) goto L_0x04be
            java.lang.String r8 = r8.workEmail
            goto L_0x04bf
        L_0x04be:
            r8 = 0
        L_0x04bf:
            com.moovit.carpool.CarpoolCompany r11 = new com.moovit.carpool.CarpoolCompany
            r11.<init>(r9, r8)
            r26 = r11
            goto L_0x04ca
        L_0x04c7:
            r8 = 0
            r26 = r8
        L_0x04ca:
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolDriverInfo r8 = new com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolDriverInfo
            r20 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26)
        L_0x04d1:
            com.moovit.MoovitApplication<?, ?, ?> r8 = com.moovit.MoovitApplication.f37317k
            com.tranzmate.moovit.protocol.tripplanner.MVCarPoolSource r9 = r1.carpoolSource
            int r11 = r9.ordinal()
            r11 = r7[r11]
            java.lang.String r13 = "292a30"
            r14 = 4
            switch(r11) {
                case 1: goto L_0x0582;
                case 2: goto L_0x055f;
                case 3: goto L_0x053c;
                case 4: goto L_0x0518;
                case 5: goto L_0x04e9;
                case 6: goto L_0x04e9;
                default: goto L_0x04e1;
            }
        L_0x04e1:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = p379.C13555b.m33972k(r10)
            goto L_0x067b
        L_0x04e9:
            com.tranzmate.moovit.protocol.tripplanner.MVCarPoolSource r10 = com.tranzmate.moovit.protocol.tripplanner.MVCarPoolSource.BlaBla
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x04f4
            int r9 = p824tp.C19746x.blablacardaily_name
            goto L_0x04f6
        L_0x04f4:
            int r9 = p824tp.C19746x.blablalines_name
        L_0x04f6:
            java.lang.String r8 = r8.getString(r9)
            com.moovit.image.model.ResourceImage r9 = new com.moovit.image.model.ResourceImage
            int r10 = p824tp.C19745w.mvf_carpool_suggested_routes
            java.lang.String[] r11 = new java.lang.String[r14]
            java.lang.String r16 = "07d8a7"
            r17 = 0
            r11[r17] = r16
            java.lang.String r16 = "-1000023"
            r17 = 1
            r11[r17] = r16
            r16 = 2
            r11[r16] = r8
            r8 = 3
            r11[r8] = r13
            r9.<init>(r10, r11)
            goto L_0x05a4
        L_0x0518:
            int r9 = p824tp.C19746x.idfm_karos_carpool_name
            java.lang.String r8 = r8.getString(r9)
            com.moovit.image.model.ResourceImage r9 = new com.moovit.image.model.ResourceImage
            int r10 = p824tp.C19745w.mvf_carpool_suggested_routes
            java.lang.String[] r11 = new java.lang.String[r14]
            java.lang.String r13 = "e40101"
            r16 = 0
            r11[r16] = r13
            java.lang.String r13 = "-1000022"
            r16 = 1
            r11[r16] = r13
            r13 = 2
            r11[r13] = r8
            java.lang.String r8 = "ffffff"
            r13 = 3
            r11[r13] = r8
            r9.<init>(r10, r11)
            goto L_0x05a4
        L_0x053c:
            int r9 = p824tp.C19746x.idfm_klaxit_carpool_name
            java.lang.String r8 = r8.getString(r9)
            com.moovit.image.model.ResourceImage r9 = new com.moovit.image.model.ResourceImage
            int r10 = p824tp.C19745w.mvf_carpool_suggested_routes
            java.lang.String[] r11 = new java.lang.String[r14]
            java.lang.String r16 = "ff9d00"
            r17 = 0
            r11[r17] = r16
            java.lang.String r16 = "-1000021"
            r17 = 1
            r11[r17] = r16
            r16 = 2
            r11[r16] = r8
            r8 = 3
            r11[r8] = r13
            r9.<init>(r10, r11)
            goto L_0x05a4
        L_0x055f:
            int r9 = p824tp.C19746x.waze_carpool_name
            java.lang.String r8 = r8.getString(r9)
            com.moovit.image.model.ResourceImage r9 = new com.moovit.image.model.ResourceImage
            int r10 = p824tp.C19745w.mvf_carpool_suggested_routes
            java.lang.String[] r11 = new java.lang.String[r14]
            java.lang.String r16 = "1ee592"
            r17 = 0
            r11[r17] = r16
            java.lang.String r16 = "-1000020"
            r17 = 1
            r11[r17] = r16
            r16 = 2
            r11[r16] = r8
            r8 = 3
            r11[r8] = r13
            r9.<init>(r10, r11)
            goto L_0x05a4
        L_0x0582:
            int r9 = p824tp.C19746x.moovit_carpool_name
            java.lang.String r8 = r8.getString(r9)
            com.moovit.image.model.ResourceImage r9 = new com.moovit.image.model.ResourceImage
            int r10 = p824tp.C19745w.mvf_carpool_suggested_routes
            java.lang.String[] r11 = new java.lang.String[r14]
            java.lang.String r16 = "ff6400"
            r17 = 0
            r11[r17] = r16
            java.lang.String r16 = "-1000005"
            r17 = 1
            r11[r17] = r16
            r16 = 2
            r11[r16] = r8
            r8 = 3
            r11[r8] = r13
            r9.<init>(r10, r11)
        L_0x05a4:
            r17 = r9
            boolean r8 = r1.mo34199g()
            if (r8 == 0) goto L_0x05bf
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVCarpoolRideAttributes> r8 = r1.attributes
            com.moovit.app.itinerary.i r9 = new com.moovit.app.itinerary.i
            r9.<init>(r14)
            lr.n r10 = new lr.n
            r11 = 13
            r10.<init>(r11)
            java.util.ArrayList r8 = c00.C13720d.m34273c(r8, r9, r10)
            goto L_0x05c0
        L_0x05bf:
            r8 = 0
        L_0x05c0:
            r21 = r8
            com.tranzmate.moovit.protocol.tripplanner.MVCarPoolSource r8 = r1.carpoolSource
            int r8 = r8.ordinal()
            r7 = r7[r8]
            r8 = 2
            if (r7 == r8) goto L_0x05e3
            r8 = 3
            if (r7 == r8) goto L_0x05e0
            if (r7 == r14) goto L_0x05dd
            r8 = 5
            if (r7 == r8) goto L_0x05da
            r8 = 6
            if (r7 == r8) goto L_0x05da
            r7 = 0
            goto L_0x05e5
        L_0x05da:
            java.lang.String r7 = "com.blablalines"
            goto L_0x05e5
        L_0x05dd:
            java.lang.String r7 = "fr.karos.karos.app"
            goto L_0x05e5
        L_0x05e0:
            java.lang.String r7 = "com.wayzup.wayzupapp"
            goto L_0x05e5
        L_0x05e3:
            java.lang.String r7 = "com.ridewith"
        L_0x05e5:
            if (r7 == 0) goto L_0x05fb
            com.moovit.commons.utils.AppDeepLink r8 = new com.moovit.commons.utils.AppDeepLink
            boolean r9 = r1.mo34203j()
            if (r9 == 0) goto L_0x05f6
            java.lang.String r9 = r1.deepLink
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L_0x05f7
        L_0x05f6:
            r9 = 0
        L_0x05f7:
            r8.<init>(r7, r9)
            goto L_0x05fc
        L_0x05fb:
            r8 = 0
        L_0x05fc:
            r22 = r8
            if (r7 == 0) goto L_0x0614
            boolean r8 = r1.mo34198f()
            if (r8 == 0) goto L_0x0614
            com.moovit.commons.utils.AppDeepLink r8 = new com.moovit.commons.utils.AppDeepLink
            java.lang.String r9 = r1.appInstallDeepLink
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r8.<init>(r7, r9)
            r23 = r8
            goto L_0x0617
        L_0x0614:
            r7 = 0
            r23 = r7
        L_0x0617:
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r7 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.MOOVIT
            boolean r7 = r7.equals(r15)
            if (r7 == 0) goto L_0x0628
            com.moovit.carpool.CarpoolDriver r3 = com.moovit.carpool.C15725a.m40154a(r3)
            com.moovit.carpool.CarpoolRide r2 = com.moovit.carpool.C15725a.m40159f(r2, r3)
            goto L_0x0629
        L_0x0628:
            r2 = 0
        L_0x0629:
            r24 = r2
            com.tranzmate.moovit.protocol.carpool.MVPassengerStops r2 = r1.stops
            if (r2 == 0) goto L_0x0634
            com.moovit.carpool.PassengerRideStops r2 = com.moovit.carpool.C15725a.m40158e(r2)
            goto L_0x0635
        L_0x0634:
            r2 = 0
        L_0x0635:
            r25 = r2
            com.tranzmate.moovit.protocol.tripplanner.MVCarPoolDetourTPDetails r1 = r1.detourDetails
            if (r1 == 0) goto L_0x0648
            boolean r2 = r1.detourRelevant
            if (r2 == 0) goto L_0x0648
            boolean r2 = r1.mo34188f()
            if (r2 == 0) goto L_0x0648
            com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetourDetails r1 = r1.details
            goto L_0x0649
        L_0x0648:
            r1 = 0
        L_0x0649:
            if (r1 == 0) goto L_0x065f
            com.tranzmate.moovit.protocol.carpool.MVCarPoolPrice r2 = r1.additionalPrice
            com.moovit.util.CurrencyAmount r2 = c70.C13749c.m34317c(r2)
            com.tranzmate.moovit.protocol.carpool.MVCarPoolPrice r1 = r1.additionalFullPrice
            com.moovit.util.CurrencyAmount r1 = c70.C13749c.m34317c(r1)
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolLegDetourInfo r3 = new com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolLegDetourInfo
            r3.<init>(r2, r1)
            r26 = r3
            goto L_0x0662
        L_0x065f:
            r1 = 0
            r26 = r1
        L_0x0662:
            com.moovit.itinerary.model.leg.CarpoolLeg r1 = new com.moovit.itinerary.model.leg.CarpoolLeg
            r9 = r1
            F r2 = r4.f52692a
            r10 = r2
            com.moovit.util.time.Time r10 = (com.moovit.util.time.Time) r10
            S r2 = r4.f52693b
            r11 = r2
            com.moovit.util.time.Time r11 = (com.moovit.util.time.Time) r11
            r27 = 0
            r13 = r6
            r14 = r28
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0b2b
        L_0x067b:
            com.tranzmate.moovit.protocol.tripplanner.MVCarPoolSource r1 = r1.carpoolSource
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0688:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'carpoolRideLeg' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r3 = r4.setField_
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r3 = (com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields) r3
            vi0.c r3 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg.m30584n(r3)
            java.lang.String r3 = r3.f63355a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x06a5:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.EVENT_LEG
            if (r5 != r1) goto L_0x06ab
            r2 = 1
            goto L_0x06ac
        L_0x06ab:
            r2 = 0
        L_0x06ac:
            if (r2 == 0) goto L_0x06df
            if (r5 != r1) goto L_0x06c2
            java.lang.Object r1 = r4.value_
            com.tranzmate.moovit.protocol.tripplanner.MVEventLeg r1 = (com.tranzmate.moovit.protocol.tripplanner.MVEventLeg) r1
            com.tranzmate.moovit.protocol.ridesharing.MVRSSuperEvent r1 = r1.superEvent
            com.moovit.ridesharing.model.Event r1 = d70.C16536a.m42029a(r1)
            com.moovit.itinerary.model.leg.EventLeg r2 = new com.moovit.itinerary.model.leg.EventLeg
            r2.<init>(r1)
            r1 = r2
            goto L_0x0b2b
        L_0x06c2:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'eventLeg' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r3 = r4.setField_
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r3 = (com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields) r3
            vi0.c r3 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg.m30584n(r3)
            java.lang.String r3 = r3.f63355a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x06df:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.DOCKLESS_LEG
            if (r5 != r1) goto L_0x06e5
            r2 = 1
            goto L_0x06e6
        L_0x06e5:
            r2 = 0
        L_0x06e6:
            if (r2 == 0) goto L_0x06fb
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg r2 = r4.mo34659m()
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r2 = r2.info
            F r2 = r2.setField_
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo$_Fields r5 = com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo._Fields.CAR_DETAILS
            if (r2 != r5) goto L_0x06f6
            r2 = 1
            goto L_0x06f7
        L_0x06f6:
            r2 = 0
        L_0x06f7:
            if (r2 == 0) goto L_0x06fb
            r2 = 1
            goto L_0x06fc
        L_0x06fb:
            r2 = 0
        L_0x06fc:
            r5 = 100
            if (r2 == 0) goto L_0x07f3
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg r1 = r4.mo34659m()
            com.tranzmate.moovit.protocol.tripplanner.MVTime r2 = r1.time
            zz.i0 r2 = com.moovit.itinerary.C16080a.m40952h(r2)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.origin
            r6 = 0
            com.moovit.transit.LocationDescriptor r10 = com.moovit.itinerary.C16080a.m40949e(r4, r6, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.dest
            com.moovit.transit.LocationDescriptor r11 = com.moovit.itinerary.C16080a.m40949e(r4, r6, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape r3 = r1.shape
            com.moovit.commons.geo.Polylon r12 = com.moovit.itinerary.C16080a.m40950f(r3)
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction> r3 = r1.instructions
            wt.e r4 = new wt.e
            r7 = 8
            r4.<init>(r7)
            java.util.ArrayList r13 = c00.C13720d.m34273c(r3, r6, r4)
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r3 = r1.info
            F r4 = r3.setField_
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo$_Fields r6 = com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo._Fields.CAR_DETAILS
            if (r4 != r6) goto L_0x07d6
            java.lang.Object r3 = r3.value_
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessCarDetails r3 = (com.tranzmate.moovit.protocol.tripplanner.MVDocklessCarDetails) r3
            java.lang.String r15 = r3.f29890id
            java.lang.String r4 = r3.operatorName
            java.lang.String r6 = r3.name
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r7 = r3.smallImage
            com.moovit.image.model.Image r18 = com.moovit.image.C16028g.m40829g(r7)
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r7 = r3.largeImage
            com.moovit.image.model.Image r19 = com.moovit.image.C16028g.m40829g(r7)
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r7 = r3.mapImage
            com.moovit.image.model.Image r20 = com.moovit.image.C16028g.m40829g(r7)
            boolean r7 = r3.mo34237f()
            if (r7 == 0) goto L_0x0762
            int r7 = r3.batteryLevel
            r8 = 0
            int r7 = p977zz.C20936e0.m49036b(r8, r5, r7)
            r21 = r7
            goto L_0x0766
        L_0x0762:
            r8 = 0
            r7 = -1
            r21 = -1
        L_0x0766:
            boolean r7 = r3.mo34239h()
            if (r7 == 0) goto L_0x0775
            int r7 = r3.fuelLevel
            int r5 = p977zz.C20936e0.m49036b(r8, r5, r7)
            r22 = r5
            goto L_0x0778
        L_0x0775:
            r5 = -1
            r22 = -1
        L_0x0778:
            boolean r5 = r3.mo34245m()
            if (r5 == 0) goto L_0x0783
            int r5 = r3.numOfSeats
            r23 = r5
            goto L_0x0786
        L_0x0783:
            r5 = -1
            r23 = -1
        L_0x0786:
            boolean r5 = r3.mo34238g()
            if (r5 == 0) goto L_0x078f
            java.lang.String r3 = r3.drivingRate
            goto L_0x0790
        L_0x078f:
            r3 = 0
        L_0x0790:
            r24 = r3
            com.moovit.itinerary.model.leg.DocklessCarLeg$DocklessCarLegInfo r3 = new com.moovit.itinerary.model.leg.DocklessCarLeg$DocklessCarLegInfo
            r14 = r3
            r16 = r4
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r4 = r1.mo34285f()
            if (r4 == 0) goto L_0x07a9
            com.tranzmate.moovit.protocol.common.MVExternalAppData r4 = r1.deepLink
            com.moovit.commons.utils.AppDeepLink r4 = c70.C13749c.m34315a(r4)
            goto L_0x07aa
        L_0x07a9:
            r4 = 0
        L_0x07aa:
            r15 = r4
            boolean r4 = r1.mo34289i()
            if (r4 == 0) goto L_0x07b8
            com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem r1 = r1.integrationItem
            com.moovit.micromobility.MicroMobilityIntegrationItem r1 = t30.C6565g.m15498b(r1)
            goto L_0x07b9
        L_0x07b8:
            r1 = 0
        L_0x07b9:
            r16 = r1
            com.moovit.image.model.Image r1 = r10.f23655j
            if (r1 != 0) goto L_0x07c3
            com.moovit.image.model.Image r1 = r3.f42032f
            r10.f23655j = r1
        L_0x07c3:
            com.moovit.itinerary.model.leg.DocklessCarLeg r1 = new com.moovit.itinerary.model.leg.DocklessCarLeg
            F r4 = r2.f52692a
            r8 = r4
            com.moovit.util.time.Time r8 = (com.moovit.util.time.Time) r8
            S r2 = r2.f52693b
            r9 = r2
            com.moovit.util.time.Time r9 = (com.moovit.util.time.Time) r9
            r7 = r1
            r14 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0b2b
        L_0x07d6:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'carDetails' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r3 = r3.setField_
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo$_Fields r3 = (com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo._Fields) r3
            vi0.c r3 = com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo.m30114l(r3)
            java.lang.String r3 = r3.f63355a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x07f3:
            F r2 = r4.setField_
            if (r2 != r1) goto L_0x07f9
            r2 = 1
            goto L_0x07fa
        L_0x07f9:
            r2 = 0
        L_0x07fa:
            if (r2 == 0) goto L_0x082c
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg r2 = r4.mo34659m()
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r2 = r2.info
            F r2 = r2.setField_
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo$_Fields r6 = com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo._Fields.DOCKLESS_DETAILS
            if (r2 != r6) goto L_0x080a
            r2 = 1
            goto L_0x080b
        L_0x080a:
            r2 = 0
        L_0x080b:
            if (r2 != 0) goto L_0x080e
            goto L_0x082c
        L_0x080e:
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg r2 = r4.mo34659m()
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r2 = r2.info
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessDetails r2 = r2.mo34281k()
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r2 = r2.type
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r6 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.BIKE
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x082a
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r6 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.ELECTRIC_BIKE
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x082c
        L_0x082a:
            r2 = 1
            goto L_0x082d
        L_0x082c:
            r2 = 0
        L_0x082d:
            if (r2 == 0) goto L_0x08f4
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg r1 = r4.mo34659m()
            com.tranzmate.moovit.protocol.tripplanner.MVTime r2 = r1.time
            zz.i0 r2 = com.moovit.itinerary.C16080a.m40952h(r2)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.origin
            r6 = 0
            com.moovit.transit.LocationDescriptor r10 = com.moovit.itinerary.C16080a.m40949e(r4, r6, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.dest
            com.moovit.transit.LocationDescriptor r11 = com.moovit.itinerary.C16080a.m40949e(r4, r6, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape r3 = r1.shape
            com.moovit.commons.geo.Polylon r12 = com.moovit.itinerary.C16080a.m40950f(r3)
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction> r3 = r1.instructions
            com.facebook.appevents.l r4 = new com.facebook.appevents.l
            r7 = 13
            r4.<init>(r7)
            java.util.ArrayList r13 = c00.C13720d.m34273c(r3, r6, r4)
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r3 = r1.info
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessDetails r3 = r3.mo34281k()
            java.lang.String r15 = r3.f29906id
            java.lang.String r4 = r3.operatorName
            java.lang.String r6 = r3.vehicleName
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r7 = r3.smallImage
            com.moovit.image.model.Image r18 = com.moovit.image.C16028g.m40829g(r7)
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r7 = r3.largeImage
            com.moovit.image.model.Image r19 = com.moovit.image.C16028g.m40829g(r7)
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r7 = r3.mapImage
            com.moovit.image.model.Image r20 = com.moovit.image.C16028g.m40829g(r7)
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r7 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.ELECTRIC_BIKE
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r8 = r3.type
            boolean r21 = r7.equals(r8)
            boolean r7 = r3.mo34259f()
            if (r7 == 0) goto L_0x0893
            int r7 = r3.batteryLevel
            r8 = 0
            int r5 = p977zz.C20936e0.m49036b(r8, r5, r7)
            r22 = r5
            goto L_0x0896
        L_0x0893:
            r5 = -1
            r22 = -1
        L_0x0896:
            boolean r5 = r3.mo34265k()
            if (r5 == 0) goto L_0x08a1
            int r5 = r3.numOfHelmets
            r23 = r5
            goto L_0x08a4
        L_0x08a1:
            r5 = -1
            r23 = -1
        L_0x08a4:
            boolean r5 = r3.mo34260g()
            if (r5 == 0) goto L_0x08ad
            java.lang.String r3 = r3.drivingRate
            goto L_0x08ae
        L_0x08ad:
            r3 = 0
        L_0x08ae:
            r24 = r3
            com.moovit.itinerary.model.leg.DocklessBicycleLeg$DocklessBicycleLegInfo r3 = new com.moovit.itinerary.model.leg.DocklessBicycleLeg$DocklessBicycleLegInfo
            r14 = r3
            r16 = r4
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r4 = r1.mo34285f()
            if (r4 == 0) goto L_0x08c7
            com.tranzmate.moovit.protocol.common.MVExternalAppData r4 = r1.deepLink
            com.moovit.commons.utils.AppDeepLink r4 = c70.C13749c.m34315a(r4)
            goto L_0x08c8
        L_0x08c7:
            r4 = 0
        L_0x08c8:
            r15 = r4
            boolean r4 = r1.mo34289i()
            if (r4 == 0) goto L_0x08d6
            com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem r1 = r1.integrationItem
            com.moovit.micromobility.MicroMobilityIntegrationItem r1 = t30.C6565g.m15498b(r1)
            goto L_0x08d7
        L_0x08d6:
            r1 = 0
        L_0x08d7:
            r16 = r1
            com.moovit.image.model.Image r1 = r10.f23655j
            if (r1 != 0) goto L_0x08e1
            com.moovit.image.model.Image r1 = r3.f42010f
            r10.f23655j = r1
        L_0x08e1:
            com.moovit.itinerary.model.leg.DocklessBicycleLeg r1 = new com.moovit.itinerary.model.leg.DocklessBicycleLeg
            F r4 = r2.f52692a
            r8 = r4
            com.moovit.util.time.Time r8 = (com.moovit.util.time.Time) r8
            S r2 = r2.f52693b
            r9 = r2
            com.moovit.util.time.Time r9 = (com.moovit.util.time.Time) r9
            r7 = r1
            r14 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0b2b
        L_0x08f4:
            F r2 = r4.setField_
            if (r2 != r1) goto L_0x08fa
            r2 = 1
            goto L_0x08fb
        L_0x08fa:
            r2 = 0
        L_0x08fb:
            if (r2 == 0) goto L_0x092d
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg r2 = r4.mo34659m()
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r2 = r2.info
            F r2 = r2.setField_
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo$_Fields r6 = com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo._Fields.DOCKLESS_DETAILS
            if (r2 != r6) goto L_0x090b
            r2 = 1
            goto L_0x090c
        L_0x090b:
            r2 = 0
        L_0x090c:
            if (r2 != 0) goto L_0x090f
            goto L_0x092d
        L_0x090f:
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg r2 = r4.mo34659m()
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r2 = r2.info
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessDetails r2 = r2.mo34281k()
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r2 = r2.type
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r6 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.KICK_SCOOTER
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x092b
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r6 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.ELECTRIC_SCOOTER
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x092d
        L_0x092b:
            r2 = 1
            goto L_0x092e
        L_0x092d:
            r2 = 0
        L_0x092e:
            if (r2 == 0) goto L_0x09ef
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg r1 = r4.mo34659m()
            com.tranzmate.moovit.protocol.tripplanner.MVTime r2 = r1.time
            zz.i0 r2 = com.moovit.itinerary.C16080a.m40952h(r2)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.origin
            r6 = 0
            com.moovit.transit.LocationDescriptor r4 = com.moovit.itinerary.C16080a.m40949e(r4, r6, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r7 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r7 = r7.dest
            com.moovit.transit.LocationDescriptor r17 = com.moovit.itinerary.C16080a.m40949e(r7, r6, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape r3 = r1.shape
            com.moovit.commons.geo.Polylon r18 = com.moovit.itinerary.C16080a.m40950f(r3)
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction> r3 = r1.instructions
            hq.e r7 = new hq.e
            r7.<init>(r12)
            java.util.ArrayList r19 = c00.C13720d.m34273c(r3, r6, r7)
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r3 = r1.info
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessDetails r3 = r3.mo34281k()
            java.lang.String r7 = r3.f29906id
            java.lang.String r8 = r3.operatorName
            java.lang.String r9 = r3.vehicleName
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r6 = r3.smallImage
            com.moovit.image.model.Image r10 = com.moovit.image.C16028g.m40829g(r6)
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r6 = r3.largeImage
            com.moovit.image.model.Image r11 = com.moovit.image.C16028g.m40829g(r6)
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r6 = r3.mapImage
            com.moovit.image.model.Image r12 = com.moovit.image.C16028g.m40829g(r6)
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r6 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.ELECTRIC_SCOOTER
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r13 = r3.type
            boolean r13 = r6.equals(r13)
            boolean r6 = r3.mo34259f()
            if (r6 == 0) goto L_0x0991
            int r6 = r3.batteryLevel
            r14 = 0
            int r5 = p977zz.C20936e0.m49036b(r14, r5, r6)
            r14 = r5
            goto L_0x0993
        L_0x0991:
            r5 = -1
            r14 = -1
        L_0x0993:
            boolean r5 = r3.mo34265k()
            if (r5 == 0) goto L_0x099d
            int r5 = r3.numOfHelmets
            r15 = r5
            goto L_0x099f
        L_0x099d:
            r5 = -1
            r15 = -1
        L_0x099f:
            boolean r5 = r3.mo34260g()
            if (r5 == 0) goto L_0x09a8
            java.lang.String r3 = r3.drivingRate
            goto L_0x09a9
        L_0x09a8:
            r3 = 0
        L_0x09a9:
            r16 = r3
            com.moovit.itinerary.model.leg.DocklessScooterLeg$DocklessScooterLegInfo r3 = new com.moovit.itinerary.model.leg.DocklessScooterLeg$DocklessScooterLegInfo
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r5 = r1.mo34285f()
            if (r5 == 0) goto L_0x09be
            com.tranzmate.moovit.protocol.common.MVExternalAppData r5 = r1.deepLink
            com.moovit.commons.utils.AppDeepLink r5 = c70.C13749c.m34315a(r5)
            goto L_0x09bf
        L_0x09be:
            r5 = 0
        L_0x09bf:
            r21 = r5
            boolean r5 = r1.mo34289i()
            if (r5 == 0) goto L_0x09ce
            com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem r1 = r1.integrationItem
            com.moovit.micromobility.MicroMobilityIntegrationItem r1 = t30.C6565g.m15498b(r1)
            goto L_0x09cf
        L_0x09ce:
            r1 = 0
        L_0x09cf:
            r22 = r1
            com.moovit.image.model.Image r1 = r4.f23655j
            if (r1 != 0) goto L_0x09d9
            com.moovit.image.model.Image r1 = r3.f42076f
            r4.f23655j = r1
        L_0x09d9:
            com.moovit.itinerary.model.leg.DocklessScooterLeg r1 = new com.moovit.itinerary.model.leg.DocklessScooterLeg
            F r5 = r2.f52692a
            r14 = r5
            com.moovit.util.time.Time r14 = (com.moovit.util.time.Time) r14
            S r2 = r2.f52693b
            r15 = r2
            com.moovit.util.time.Time r15 = (com.moovit.util.time.Time) r15
            r13 = r1
            r16 = r4
            r20 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0b2b
        L_0x09ef:
            F r2 = r4.setField_
            if (r2 != r1) goto L_0x09f5
            r1 = 1
            goto L_0x09f6
        L_0x09f5:
            r1 = 0
        L_0x09f6:
            if (r1 == 0) goto L_0x0a1d
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg r1 = r4.mo34659m()
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r1 = r1.info
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo$_Fields r2 = com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo._Fields.DOCKLESS_DETAILS
            if (r1 != r2) goto L_0x0a06
            r1 = 1
            goto L_0x0a07
        L_0x0a06:
            r1 = 0
        L_0x0a07:
            if (r1 != 0) goto L_0x0a0a
            goto L_0x0a1d
        L_0x0a0a:
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg r1 = r4.mo34659m()
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r1 = r1.info
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessDetails r1 = r1.mo34281k()
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r1 = r1.type
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r2 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.MOPED
            boolean r1 = r2.equals(r1)
            goto L_0x0a1e
        L_0x0a1d:
            r1 = 0
        L_0x0a1e:
            if (r1 == 0) goto L_0x0ae0
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg r1 = r4.mo34659m()
            com.tranzmate.moovit.protocol.tripplanner.MVTime r2 = r1.time
            zz.i0 r2 = com.moovit.itinerary.C16080a.m40952h(r2)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.origin
            r6 = 0
            com.moovit.transit.LocationDescriptor r10 = com.moovit.itinerary.C16080a.m40949e(r4, r6, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.dest
            com.moovit.transit.LocationDescriptor r11 = com.moovit.itinerary.C16080a.m40949e(r4, r6, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape r3 = r1.shape
            com.moovit.commons.geo.Polylon r12 = com.moovit.itinerary.C16080a.m40950f(r3)
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction> r3 = r1.instructions
            vs.e r4 = new vs.e
            r7 = 13
            r4.<init>(r7)
            java.util.ArrayList r13 = c00.C13720d.m34273c(r3, r6, r4)
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r3 = r1.info
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessDetails r3 = r3.mo34281k()
            java.lang.String r15 = r3.f29906id
            java.lang.String r4 = r3.operatorName
            java.lang.String r6 = r3.vehicleName
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r7 = r3.smallImage
            com.moovit.image.model.Image r18 = com.moovit.image.C16028g.m40829g(r7)
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r7 = r3.largeImage
            com.moovit.image.model.Image r19 = com.moovit.image.C16028g.m40829g(r7)
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r7 = r3.mapImage
            com.moovit.image.model.Image r20 = com.moovit.image.C16028g.m40829g(r7)
            boolean r21 = r3.mo34259f()
            boolean r7 = r3.mo34259f()
            if (r7 == 0) goto L_0x0a80
            int r7 = r3.batteryLevel
            r8 = 0
            int r5 = p977zz.C20936e0.m49036b(r8, r5, r7)
            r22 = r5
            goto L_0x0a83
        L_0x0a80:
            r5 = -1
            r22 = -1
        L_0x0a83:
            boolean r5 = r3.mo34265k()
            if (r5 == 0) goto L_0x0a8e
            int r5 = r3.numOfHelmets
            r23 = r5
            goto L_0x0a91
        L_0x0a8e:
            r5 = -1
            r23 = -1
        L_0x0a91:
            boolean r5 = r3.mo34260g()
            if (r5 == 0) goto L_0x0a9a
            java.lang.String r3 = r3.drivingRate
            goto L_0x0a9b
        L_0x0a9a:
            r3 = 0
        L_0x0a9b:
            r24 = r3
            com.moovit.itinerary.model.leg.DocklessMopedLeg$DocklessMopedLegInfo r3 = new com.moovit.itinerary.model.leg.DocklessMopedLeg$DocklessMopedLegInfo
            r14 = r3
            r16 = r4
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r4 = r1.mo34285f()
            if (r4 == 0) goto L_0x0ab4
            com.tranzmate.moovit.protocol.common.MVExternalAppData r4 = r1.deepLink
            com.moovit.commons.utils.AppDeepLink r4 = c70.C13749c.m34315a(r4)
            goto L_0x0ab5
        L_0x0ab4:
            r4 = 0
        L_0x0ab5:
            r15 = r4
            boolean r4 = r1.mo34289i()
            if (r4 == 0) goto L_0x0ac3
            com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem r1 = r1.integrationItem
            com.moovit.micromobility.MicroMobilityIntegrationItem r1 = t30.C6565g.m15498b(r1)
            goto L_0x0ac4
        L_0x0ac3:
            r1 = 0
        L_0x0ac4:
            r16 = r1
            com.moovit.image.model.Image r1 = r10.f23655j
            if (r1 != 0) goto L_0x0ace
            com.moovit.image.model.Image r1 = r3.f42054f
            r10.f23655j = r1
        L_0x0ace:
            com.moovit.itinerary.model.leg.DocklessMopedLeg r1 = new com.moovit.itinerary.model.leg.DocklessMopedLeg
            F r4 = r2.f52692a
            r8 = r4
            com.moovit.util.time.Time r8 = (com.moovit.util.time.Time) r8
            S r2 = r2.f52693b
            r9 = r2
            com.moovit.util.time.Time r9 = (com.moovit.util.time.Time) r9
            r7 = r1
            r14 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0b2b
        L_0x0ae0:
            F r1 = r4.setField_
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r2 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.CAR_LEG
            if (r1 != r2) goto L_0x0ae8
            r5 = 1
            goto L_0x0ae9
        L_0x0ae8:
            r5 = 0
        L_0x0ae9:
            if (r5 == 0) goto L_0x0b49
            if (r1 != r2) goto L_0x0b2c
            java.lang.Object r1 = r4.value_
            com.tranzmate.moovit.protocol.tripplanner.MVCarLeg r1 = (com.tranzmate.moovit.protocol.tripplanner.MVCarLeg) r1
            com.tranzmate.moovit.protocol.tripplanner.MVTime r2 = r1.time
            zz.i0 r2 = com.moovit.itinerary.C16080a.m40952h(r2)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.origin
            r5 = 0
            com.moovit.transit.LocationDescriptor r9 = com.moovit.itinerary.C16080a.m40949e(r4, r5, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r4 = r1.journey
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = r4.dest
            com.moovit.transit.LocationDescriptor r10 = com.moovit.itinerary.C16080a.m40949e(r4, r5, r3)
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape r3 = r1.shape
            com.moovit.commons.geo.Polylon r11 = com.moovit.itinerary.C16080a.m40950f(r3)
            boolean r3 = r1.mo34177g()
            if (r3 == 0) goto L_0x0b1a
            com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem r1 = r1.integrationItem
            com.moovit.micromobility.MicroMobilityIntegrationItem r5 = t30.C6565g.m15498b(r1)
        L_0x0b1a:
            r12 = r5
            com.moovit.itinerary.model.leg.CarLeg r1 = new com.moovit.itinerary.model.leg.CarLeg
            F r3 = r2.f52692a
            r7 = r3
            com.moovit.util.time.Time r7 = (com.moovit.util.time.Time) r7
            S r2 = r2.f52693b
            r8 = r2
            com.moovit.util.time.Time r8 = (com.moovit.util.time.Time) r8
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0b2b:
            return r1
        L_0x0b2c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'carLeg' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r3 = r4.setField_
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r3 = (com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields) r3
            vi0.c r3 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg.m30584n(r3)
            java.lang.String r3 = r3.f63355a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0b49:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown leg: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e20.C16766b.convert(java.lang.Object):java.lang.Object");
    }
}

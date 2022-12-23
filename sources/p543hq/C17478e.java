package p543hq;

import c00.C13721e;

/* renamed from: hq.e */
public final /* synthetic */ class C17478e implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f45004b;

    public /* synthetic */ C17478e(int i) {
        this.f45004b = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.moovit.util.CurrencyAmount} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object convert(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f45004b
            r2 = 2
            r3 = 1
            r4 = 0
            switch(r1) {
                case 0: goto L_0x02c7;
                case 1: goto L_0x02be;
                case 2: goto L_0x02b5;
                case 3: goto L_0x0296;
                case 4: goto L_0x0259;
                case 5: goto L_0x0172;
                case 6: goto L_0x010c;
                case 7: goto L_0x00fd;
                case 8: goto L_0x00f6;
                case 9: goto L_0x00de;
                case 10: goto L_0x00d5;
                case 11: goto L_0x00ce;
                case 12: goto L_0x00c5;
                case 13: goto L_0x00bc;
                case 14: goto L_0x00b3;
                case 15: goto L_0x00a5;
                case 16: goto L_0x009a;
                case 17: goto L_0x0091;
                case 18: goto L_0x008a;
                case 19: goto L_0x0048;
                case 20: goto L_0x0041;
                case 21: goto L_0x003a;
                case 22: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0311
        L_0x000c:
            r1 = r18
            com.tranzmate.moovit.protocol.gtfs.MVAgency r1 = (com.tranzmate.moovit.protocol.gtfs.MVAgency) r1
            c00.c r2 = com.moovit.transit.C7841a.f23766a
            int r2 = r1.agencyId
            com.moovit.network.model.ServerId r3 = new com.moovit.network.model.ServerId
            r3.<init>(r2)
            java.lang.String r2 = r1.agencyName
            com.tranzmate.moovit.protocol.common.MVRouteType r4 = r1.routeType
            int r4 = r4.getValue()
            com.moovit.network.model.ServerId r5 = new com.moovit.network.model.ServerId
            r5.<init>(r4)
            com.moovit.database.DbEntityRef r4 = com.moovit.database.DbEntityRef.newTransitTypeRef(r5)
            int r1 = r1.image
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.moovit.image.model.Image r1 = com.moovit.image.C16028g.m40823a(r1)
            com.moovit.transit.TransitAgency r5 = new com.moovit.transit.TransitAgency
            r5.<init>(r3, r2, r4, r1)
            return r5
        L_0x003a:
            r1 = r18
            com.moovit.ticketing.ticket.Ticket r1 = (com.moovit.ticketing.ticket.Ticket) r1
            com.moovit.ticketing.ticket.TicketId r1 = r1.f23473b
            return r1
        L_0x0041:
            r1 = r18
            com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessages r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessages) r1
            java.lang.String r1 = r1.agencyKey
            return r1
        L_0x0048:
            r1 = r18
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartItem r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartItem) r1
            sz.r r2 = q80.C13036y.f32248a
            java.lang.String r6 = r1.f28786id
            java.lang.String r7 = r1.name
            int r8 = r1.quantity
            boolean r2 = r1.mo32504j()
            if (r2 == 0) goto L_0x005e
            java.lang.String r2 = r1.message
            r9 = r2
            goto L_0x005f
        L_0x005e:
            r9 = r4
        L_0x005f:
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r2 = r1.price
            com.moovit.util.CurrencyAmount r10 = c70.C13749c.m34318d(r2)
            boolean r2 = r1.mo32499f()
            if (r2 == 0) goto L_0x0073
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r2 = r1.fullPrice
            com.moovit.util.CurrencyAmount r2 = c70.C13749c.m34318d(r2)
            r11 = r2
            goto L_0x0074
        L_0x0073:
            r11 = r4
        L_0x0074:
            boolean r12 = r1.isRemovable
            boolean r2 = r1.mo32501h()
            if (r2 == 0) goto L_0x0082
            com.tranzmate.moovit.protocol.common.MVInfoBoxData r1 = r1.infoBoxData
            com.moovit.util.InfoBoxData r4 = c70.C13749c.m34320f(r1)
        L_0x0082:
            r13 = r4
            com.moovit.ticketing.purchase.cart.CartItem r1 = new com.moovit.ticketing.purchase.cart.CartItem
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
        L_0x008a:
            r1 = r18
            z70.e r1 = (z70.C13327e) r1
            java.lang.String r1 = r1.f33086d
            return r1
        L_0x0091:
            r1 = r18
            com.tranzmate.moovit.protocol.users.MVMetroArea r1 = (com.tranzmate.moovit.protocol.users.MVMetroArea) r1
            com.moovit.metro.selection.MetroArea r1 = c70.C13749c.m34325k(r1)
            return r1
        L_0x009a:
            r1 = r18
            com.moovit.network.model.ServerId r1 = (com.moovit.network.model.ServerId) r1
            int r1 = r1.f15142b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L_0x00a5:
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        L_0x00b3:
            r1 = r18
            com.tranzmate.moovit.protocol.common.MVAccessory r1 = (com.tranzmate.moovit.protocol.common.MVAccessory) r1
            com.moovit.util.StyledText r1 = c70.C13749c.m34328n(r1)
            return r1
        L_0x00bc:
            r1 = r18
            com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummary r1 = (com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummary) r1
            com.moovit.transit.TransitLineGroup r1 = com.moovit.transit.C7841a.m17864b(r1)
            return r1
        L_0x00c5:
            r1 = r18
            com.moovit.tripplanner.TripPlannerTransportType r1 = (com.moovit.tripplanner.TripPlannerTransportType) r1
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanTransportOptionPref r1 = com.moovit.itinerary.C16080a.m40970z(r1)
            return r1
        L_0x00ce:
            r1 = r18
            com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter r1 = (com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter) r1
            java.lang.String r1 = r1.key
            return r1
        L_0x00d5:
            r1 = r18
            com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction r1 = (com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction) r1
            com.moovit.itinerary.model.TurnInstruction r1 = com.moovit.itinerary.C16080a.m40946b(r1)
            return r1
        L_0x00de:
            r1 = r18
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            sz.r r2 = com.moovit.itinerary.C16080a.f41870a
            com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter r2 = new com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.<init>(r3, r1)
            return r2
        L_0x00f6:
            r1 = r18
            v10.a r1 = (v10.C20065a) r1
            android.graphics.Bitmap r1 = r1.f50909a
            return r1
        L_0x00fd:
            r1 = r18
            com.moovit.app.wondo.tickets.model.WondoOffer r1 = (com.moovit.app.wondo.tickets.model.WondoOffer) r1
            com.moovit.app.wondo.tickets.offers.a$b r3 = new com.moovit.app.wondo.tickets.offers.a$b
            java.lang.String r5 = "wondoOffer"
            ce0.C21100e.m49373x(r1, r5)
            r3.<init>(r2, r1, r4)
            return r3
        L_0x010c:
            r1 = r18
            com.tranzmate.moovit.protocol.transitcardalert.MVCardStatusResponse r1 = (com.tranzmate.moovit.protocol.transitcardalert.MVCardStatusResponse) r1
            com.tranzmate.moovit.protocol.transitcardalert.MVCardPresentationType r5 = r1.presentationType
            int[] r6 = com.moovit.app.topup.C15574a.C15575a.f40504a
            int r7 = r5.ordinal()
            r6 = r6[r7]
            if (r6 == r3) goto L_0x0138
            if (r6 != r2) goto L_0x0121
            com.moovit.app.topup.TopUpCard$Type r2 = com.moovit.app.topup.TopUpCard.Type.BALANCE
            goto L_0x013a
        L_0x0121:
            com.moovit.commons.request.BadResponseException r1 = new com.moovit.commons.request.BadResponseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown top up card type: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0138:
            com.moovit.app.topup.TopUpCard$Type r2 = com.moovit.app.topup.TopUpCard.Type.REGULAR
        L_0x013a:
            r6 = r2
            java.lang.String r8 = r1.cardTypeDescription
            java.lang.String r9 = r1.cardPublisher
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r1.cardImage
            com.moovit.image.model.Image r7 = com.moovit.image.C16028g.m40829g(r2)
            java.lang.String r10 = r1.urlToTopup
            boolean r2 = r1.mo34115f()
            if (r2 == 0) goto L_0x016a
            com.tranzmate.moovit.protocol.transitcardalert.MVBalanceStat r1 = r1.balanceStat
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r2 = r1.balance
            com.moovit.util.CurrencyAmount r2 = c70.C13749c.m34318d(r2)
            boolean r3 = r1.mo34107h()
            if (r3 == 0) goto L_0x0161
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r3 = r1.pendingBalance
            com.moovit.util.CurrencyAmount r4 = c70.C13749c.m34318d(r3)
        L_0x0161:
            boolean r1 = r1.isInLowBalance
            qx.b r3 = new qx.b
            r3.<init>(r2, r4, r1)
            r11 = r3
            goto L_0x016b
        L_0x016a:
            r11 = r4
        L_0x016b:
            com.moovit.app.topup.TopUpCard r1 = new com.moovit.app.topup.TopUpCard
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r1
        L_0x0172:
            r1 = r18
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodZone r1 = (com.tranzmate.moovit.protocol.tod.shuttles.MVTodZone) r1
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodZoneMetaData r5 = r1.metadata
            java.lang.String r6 = "metaData"
            ce0.C21100e.m49373x(r5, r6)
            java.util.List<com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleStop> r6 = r5.stops
            android.util.SparseArray r7 = new android.util.SparseArray
            int r8 = r6.size()
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x018c:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x01b0
            java.lang.Object r8 = r6.next()
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleStop r8 = (com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleStop) r8
            int r9 = r8.stopId
            com.moovit.network.model.ServerId r10 = new com.moovit.network.model.ServerId
            r10.<init>(r9)
            com.tranzmate.moovit.protocol.common.MVLatLon r11 = r8.location
            com.moovit.commons.geo.LatLonE6 r11 = c70.C13749c.m34322h(r11)
            java.lang.String r8 = r8.name
            com.moovit.app.tod.shuttle.model.TodShuttleStop r12 = new com.moovit.app.tod.shuttle.model.TodShuttleStop
            r12.<init>(r10, r11, r8)
            r7.put(r9, r12)
            goto L_0x018c
        L_0x01b0:
            java.util.List<com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePattern> r5 = r5.patterns
            java.util.HashMap r6 = new java.util.HashMap
            int r8 = r5.size()
            r6.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x01bf:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0239
            java.lang.Object r8 = r5.next()
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePattern r8 = (com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePattern) r8
            java.lang.String r9 = r8.patternId
            java.lang.String r10 = r8.name
            java.util.List<java.lang.Integer> r11 = r8.stopIds
            ox.g r12 = new ox.g
            r12.<init>(r7, r8)
            java.util.ArrayList r11 = c00.C13720d.m34273c(r11, r4, r12)
            boolean r12 = r8.mo33994h()
            if (r12 == 0) goto L_0x01e3
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePatternRestrictions r8 = r8.restrictions
            goto L_0x01e4
        L_0x01e3:
            r8 = r4
        L_0x01e4:
            if (r8 == 0) goto L_0x01e9
            java.util.List<com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePatternStopRestriction> r8 = r8.stopRestrictions
            goto L_0x01ea
        L_0x01e9:
            r8 = r4
        L_0x01ea:
            boolean r12 = c00.C13717b.m34258e(r8)
            if (r12 == 0) goto L_0x01f2
            r8 = r4
            goto L_0x022e
        L_0x01f2:
            int r12 = r11.size()
            com.moovit.app.tod.shuttle.model.TodShuttlePatternStopRestriction[] r13 = new com.moovit.app.tod.shuttle.model.TodShuttlePatternStopRestriction[r12]
            java.util.Iterator r8 = r8.iterator()
        L_0x01fc:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x022a
            java.lang.Object r14 = r8.next()
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePatternStopRestriction r14 = (com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePatternStopRestriction) r14
            int r15 = r14.stopIndex
            if (r15 >= r12) goto L_0x01fc
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePatternRestrictionType r14 = r14.restrictionType
            int[] r16 = p715ox.C18858h.f48010a
            int r14 = r14.ordinal()
            r14 = r16[r14]
            if (r14 == r3) goto L_0x0225
            if (r14 != r2) goto L_0x021d
            com.moovit.app.tod.shuttle.model.TodShuttlePatternStopRestriction r14 = com.moovit.app.tod.shuttle.model.TodShuttlePatternStopRestriction.DROP_OFF_ONLY
            goto L_0x0227
        L_0x021d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "no such restriction type exist"
            r1.<init>(r2)
            throw r1
        L_0x0225:
            com.moovit.app.tod.shuttle.model.TodShuttlePatternStopRestriction r14 = com.moovit.app.tod.shuttle.model.TodShuttlePatternStopRestriction.PICKUP_ONLY
        L_0x0227:
            r13[r15] = r14
            goto L_0x01fc
        L_0x022a:
            java.util.List r8 = java.util.Arrays.asList(r13)
        L_0x022e:
            com.moovit.app.tod.shuttle.model.TodShuttlePattern r12 = new com.moovit.app.tod.shuttle.model.TodShuttlePattern
            r12.<init>(r9, r10, r11, r8)
            java.lang.String r8 = r12.f40418b
            r6.put(r8, r12)
            goto L_0x01bf
        L_0x0239:
            ox.i r2 = new ox.i
            r2.<init>(r6)
            int r3 = r1.zoneId
            com.moovit.network.model.ServerId r5 = new com.moovit.network.model.ServerId
            r5.<init>(r3)
            java.lang.String r3 = r1.name
            java.util.List<com.tranzmate.moovit.protocol.tod.shuttles.MVTodZoneDaySchedule> r1 = r1.daySchedules
            b0.m r6 = new b0.m
            r7 = 3
            r6.<init>(r2, r7)
            java.util.ArrayList r1 = c00.C13720d.m34273c(r1, r4, r6)
            com.moovit.app.tod.shuttle.model.TodZone r2 = new com.moovit.app.tod.shuttle.model.TodZone
            r2.<init>(r5, r3, r1)
            return r2
        L_0x0259:
            r1 = r18
            com.tranzmate.moovit.protocol.common.MVDayOfWeek r1 = (com.tranzmate.moovit.protocol.common.MVDayOfWeek) r1
            zz.m0<java.lang.Integer> r2 = c70.C13749c.f33838a
            int[] r2 = c70.C13749c.C13750a.f33849k
            int r3 = r1.ordinal()
            r2 = r2[r3]
            switch(r2) {
                case 1: goto L_0x0293;
                case 2: goto L_0x0290;
                case 3: goto L_0x028d;
                case 4: goto L_0x028a;
                case 5: goto L_0x0287;
                case 6: goto L_0x0284;
                case 7: goto L_0x0281;
                default: goto L_0x026a;
            }
        L_0x026a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown day of week type: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0281:
            j$.time.DayOfWeek r1 = p988j$.time.DayOfWeek.SATURDAY
            goto L_0x0295
        L_0x0284:
            j$.time.DayOfWeek r1 = p988j$.time.DayOfWeek.FRIDAY
            goto L_0x0295
        L_0x0287:
            j$.time.DayOfWeek r1 = p988j$.time.DayOfWeek.THURSDAY
            goto L_0x0295
        L_0x028a:
            j$.time.DayOfWeek r1 = p988j$.time.DayOfWeek.WEDNESDAY
            goto L_0x0295
        L_0x028d:
            j$.time.DayOfWeek r1 = p988j$.time.DayOfWeek.TUESDAY
            goto L_0x0295
        L_0x0290:
            j$.time.DayOfWeek r1 = p988j$.time.DayOfWeek.MONDAY
            goto L_0x0295
        L_0x0293:
            j$.time.DayOfWeek r1 = p988j$.time.DayOfWeek.SUNDAY
        L_0x0295:
            return r1
        L_0x0296:
            r1 = r18
            com.tranzmate.moovit.protocol.taxi.MVTaxiPolygon r1 = (com.tranzmate.moovit.protocol.taxi.MVTaxiPolygon) r1
            java.lang.String r2 = r1.polygon
            com.moovit.commons.geo.Polylon r2 = com.moovit.commons.geo.Polylon.m40195m(r2)
            com.tranzmate.moovit.protocol.taxi.MVTaxiPolygonSettings r1 = r1.settings
            boolean r3 = r1.mo32228f()
            if (r3 == 0) goto L_0x02aa
            java.lang.String r4 = r1.dashboardDeepLink
        L_0x02aa:
            com.moovit.app.taxi.providers.TaxiPolygonSettings r1 = new com.moovit.app.taxi.providers.TaxiPolygonSettings
            r1.<init>(r4)
            com.moovit.app.taxi.providers.TaxiPolygon r3 = new com.moovit.app.taxi.providers.TaxiPolygon
            r3.<init>(r2, r1)
            return r3
        L_0x02b5:
            r1 = r18
            com.moovit.util.time.Time r1 = (com.moovit.util.time.Time) r1
            com.moovit.util.time.Time r1 = com.moovit.util.time.Time.m17981l(r1)
            return r1
        L_0x02be:
            r1 = r18
            com.tranzmate.moovit.protocol.common.MVGeofence r1 = (com.tranzmate.moovit.protocol.common.MVGeofence) r1
            com.moovit.commons.geo.Geofence r1 = com.moovit.navigation.C4229c.m11339c(r1)
            return r1
        L_0x02c7:
            r1 = r18
            hq.b r1 = (p543hq.C17474b) r1
            java.util.HashMap r2 = p543hq.C17477d.f45000a
            com.moovit.analytics.AnalyticsEventKey r2 = r1.f44993a
            java.util.EnumMap r3 = p543hq.C17477d.f45002c
            java.lang.Object r3 = r3.get(r2)
            com.tranzmate.moovit.protocol.kinesis.MVAnalyticsEventKey r3 = (com.tranzmate.moovit.protocol.kinesis.MVAnalyticsEventKey) r3
            if (r3 == 0) goto L_0x02fa
            long r5 = r1.f44994b
            java.util.Map<com.moovit.analytics.AnalyticsAttributeKey, java.lang.String> r1 = r1.f44995c
            java.util.Set r1 = r1.entrySet()
            e0.r0 r2 = new e0.r0
            r7 = 0
            r2.<init>(r7)
            java.util.ArrayList r1 = c00.C13720d.m34273c(r1, r4, r2)
            com.tranzmate.moovit.protocol.kinesis.MVAnalyticsEvent r2 = new com.tranzmate.moovit.protocol.kinesis.MVAnalyticsEvent
            r2.<init>()
            r2.eventKey = r3
            r2.timestamp = r5
            r2.mo27647i()
            r2.attributes = r1
            return r2
        L_0x02fa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unknown event key "
            java.lang.StringBuilder r3 = p379.C13555b.m33972k(r3)
            java.lang.String r2 = r2.name()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0311:
            r1 = r18
            com.moovit.util.time.StopRealTimeCongestion r1 = (com.moovit.util.time.StopRealTimeCongestion) r1
            java.lang.String r1 = r1.f23896e
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p543hq.C17478e.convert(java.lang.Object):java.lang.Object");
    }
}

package p875vs;

import c00.C13721e;

/* renamed from: vs.e */
public final /* synthetic */ class C20228e implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f51331b;

    public /* synthetic */ C20228e(int i) {
        this.f51331b = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: c40.a} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object convert(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f51331b
            r2 = 6
            r3 = 3
            r4 = 4
            r5 = 5
            r6 = 2
            r7 = 1
            r8 = 0
            switch(r1) {
                case 0: goto L_0x035e;
                case 1: goto L_0x0357;
                case 2: goto L_0x0350;
                case 3: goto L_0x0347;
                case 4: goto L_0x033e;
                case 5: goto L_0x0335;
                case 6: goto L_0x0328;
                case 7: goto L_0x0311;
                case 8: goto L_0x02e0;
                case 9: goto L_0x02a0;
                case 10: goto L_0x022d;
                case 11: goto L_0x0222;
                case 12: goto L_0x0215;
                case 13: goto L_0x020c;
                case 14: goto L_0x0203;
                case 15: goto L_0x01fa;
                case 16: goto L_0x01ec;
                case 17: goto L_0x016e;
                case 18: goto L_0x0101;
                case 19: goto L_0x0083;
                case 20: goto L_0x007a;
                case 21: goto L_0x0071;
                case 22: goto L_0x0068;
                case 23: goto L_0x005f;
                case 24: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x03b4
        L_0x0010:
            r1 = r21
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionLegFare r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionLegFare) r1
            sz.r r2 = q80.C13036y.f32248a
            java.lang.String r10 = r1.legId
            java.lang.String r11 = r1.name
            boolean r2 = r1.mo32640l()
            if (r2 == 0) goto L_0x0028
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r2 = r1.price
            com.moovit.util.CurrencyAmount r2 = c70.C13749c.m34318d(r2)
            r12 = r2
            goto L_0x0029
        L_0x0028:
            r12 = r8
        L_0x0029:
            boolean r2 = r1.mo32635h()
            if (r2 == 0) goto L_0x0037
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r2 = r1.fullPrice
            com.moovit.util.CurrencyAmount r2 = c70.C13749c.m34318d(r2)
            r13 = r2
            goto L_0x0038
        L_0x0037:
            r13 = r12
        L_0x0038:
            boolean r2 = r1.mo32639k()
            if (r2 == 0) goto L_0x0042
            java.lang.String r2 = r1.origin
            r14 = r2
            goto L_0x0043
        L_0x0042:
            r14 = r8
        L_0x0043:
            boolean r2 = r1.mo32633f()
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = r1.destination
            r15 = r2
            goto L_0x004e
        L_0x004d:
            r15 = r8
        L_0x004e:
            boolean r2 = r1.mo32634g()
            if (r2 == 0) goto L_0x0056
            java.lang.String r8 = r1.fareId
        L_0x0056:
            r16 = r8
            com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionLegFare r1 = new com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionLegFare
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x005f:
            r1 = r21
            com.moovit.ticketing.ticket.Ticket r1 = (com.moovit.ticketing.ticket.Ticket) r1
            com.moovit.ticketing.ticket.TicketId r1 = r1.f23473b
            java.lang.String r1 = r1.f23513d
            return r1
        L_0x0068:
            r1 = r21
            com.tranzmate.moovit.protocol.common.MVTextOrImage r1 = (com.tranzmate.moovit.protocol.common.MVTextOrImage) r1
            x00.a r1 = c70.C13749c.m34319e(r1)
            return r1
        L_0x0071:
            r1 = r21
            com.tranzmate.moovit.protocol.payments.MVInputField r1 = (com.tranzmate.moovit.protocol.payments.MVInputField) r1
            com.moovit.inputfields.InputField r1 = c70.C13749c.m34321g(r1)
            return r1
        L_0x007a:
            r1 = r21
            com.moovit.inputfields.InputFieldValue r1 = (com.moovit.inputfields.InputFieldValue) r1
            com.tranzmate.moovit.protocol.payments.MVInputFieldValue r1 = c70.C13749c.m34331q(r1)
            return r1
        L_0x0083:
            r1 = r21
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1941875981: goto L_0x00d8;
                case -1843625689: goto L_0x00cd;
                case -1435650767: goto L_0x00c2;
                case 2541507: goto L_0x00b7;
                case 69511221: goto L_0x00ac;
                case 756341129: goto L_0x00a1;
                case 1878720662: goto L_0x0096;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x00e2
        L_0x0096:
            java.lang.String r4 = "CREDIT_CARD"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x009f
            goto L_0x00e2
        L_0x009f:
            r3 = 6
            goto L_0x00e2
        L_0x00a1:
            java.lang.String r4 = "GIROPAY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00aa
            goto L_0x00e2
        L_0x00aa:
            r3 = 5
            goto L_0x00e2
        L_0x00ac:
            java.lang.String r4 = "IDEAL"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b5
            goto L_0x00e2
        L_0x00b5:
            r3 = 4
            goto L_0x00e2
        L_0x00b7:
            java.lang.String r4 = "SEPA"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c0
            goto L_0x00e2
        L_0x00c0:
            r3 = 3
            goto L_0x00e2
        L_0x00c2:
            java.lang.String r4 = "BANCONTACT"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00cb
            goto L_0x00e2
        L_0x00cb:
            r3 = 2
            goto L_0x00e2
        L_0x00cd:
            java.lang.String r4 = "SOFORT"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d6
            goto L_0x00e2
        L_0x00d6:
            r3 = 1
            goto L_0x00e2
        L_0x00d8:
            java.lang.String r4 = "PAYPAL"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r3 = 0
        L_0x00e2:
            switch(r3) {
                case 0: goto L_0x00fc;
                case 1: goto L_0x00fb;
                case 2: goto L_0x00f9;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00f5;
                case 5: goto L_0x00f3;
                case 6: goto L_0x00f1;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unsupported Buckaroo server payment method type="
            java.lang.String r1 = p379.C25541a.m63881k(r3, r1)
            r2.<init>(r1)
            throw r2
        L_0x00f1:
            r2 = 1
            goto L_0x00fc
        L_0x00f3:
            r2 = 4
            goto L_0x00fc
        L_0x00f5:
            r2 = 2
            goto L_0x00fc
        L_0x00f7:
            r2 = 7
            goto L_0x00fc
        L_0x00f9:
            r2 = 3
            goto L_0x00fc
        L_0x00fb:
            r2 = 5
        L_0x00fc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            return r1
        L_0x0101:
            r1 = r21
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityZone r1 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityZone) r1
            boolean r2 = r1.mo29046g()
            if (r2 == 0) goto L_0x014e
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPolygon r2 = r1.polygon
            java.lang.String r3 = r2.polygon
            com.moovit.commons.geo.Polylon r10 = com.moovit.commons.geo.Polylon.m40195m(r3)
            boolean r3 = r2.mo28750f()
            if (r3 == 0) goto L_0x0128
            java.util.List<java.lang.String> r3 = r2.holes
            tr.b r4 = new tr.b
            r5 = 11
            r4.<init>(r5)
            java.util.ArrayList r3 = c00.C13720d.m34273c(r3, r8, r4)
            r11 = r3
            goto L_0x0129
        L_0x0128:
            r11 = r8
        L_0x0129:
            int r3 = r2.strokeColorRGB
            com.moovit.commons.utils.Color r12 = c70.C13749c.m34327m(r3)
            boolean r3 = r2.mo28752h()
            if (r3 == 0) goto L_0x0139
            int r3 = r2.minZoom
            r13 = r3
            goto L_0x013b
        L_0x0139:
            r3 = -1
            r13 = -1
        L_0x013b:
            boolean r3 = r2.mo28751g()
            if (r3 == 0) goto L_0x0145
            int r2 = r2.maxZoom
            r14 = r2
            goto L_0x0147
        L_0x0145:
            r2 = -1
            r14 = -1
        L_0x0147:
            c40.b r2 = new c40.b
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x014f
        L_0x014e:
            r2 = r8
        L_0x014f:
            boolean r3 = r1.mo29045f()
            if (r3 == 0) goto L_0x0168
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityMarker r1 = r1.marker
            com.tranzmate.moovit.protocol.common.MVLatLon r3 = r1.location
            com.moovit.commons.geo.LatLonE6 r3 = c70.C13749c.m34322h(r3)
            com.tranzmate.moovit.protocol.common.MVImageReferenceSetWithParams r1 = r1.imageRefSet
            com.moovit.image.model.ImageSet r1 = com.moovit.image.C16028g.m40828f(r1)
            c40.a r8 = new c40.a
            r8.<init>(r3, r1)
        L_0x0168:
            c40.c r1 = new c40.c
            r1.<init>(r2, r8)
            return r1
        L_0x016e:
            r1 = r21
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityProperty r1 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityProperty) r1
            F r2 = r1.setField_
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityProperty$_Fields r3 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityProperty._Fields.GENERIC_PROPERTY
            if (r2 != r3) goto L_0x0179
            goto L_0x017a
        L_0x0179:
            r7 = 0
        L_0x017a:
            if (r7 == 0) goto L_0x01e4
            if (r2 != r3) goto L_0x01d5
            java.lang.Object r1 = r1.value_
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityGenericProperty r1 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityGenericProperty) r1
            boolean r2 = r1.mo28696g()
            if (r2 == 0) goto L_0x0190
            com.tranzmate.moovit.protocol.common.MVClientColorScheme r2 = r1.color
            com.moovit.util.ColorScheme r2 = c70.C13749c.m34316b(r2)
            r10 = r2
            goto L_0x0191
        L_0x0190:
            r10 = r8
        L_0x0191:
            boolean r2 = r1.mo28697h()
            if (r2 == 0) goto L_0x019f
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r1.icon
            com.moovit.image.model.Image r2 = com.moovit.image.C16028g.m40829g(r2)
            r11 = r2
            goto L_0x01a0
        L_0x019f:
            r11 = r8
        L_0x01a0:
            boolean r2 = r1.mo28700j()
            if (r2 == 0) goto L_0x01aa
            java.lang.String r2 = r1.title
            r12 = r2
            goto L_0x01ab
        L_0x01aa:
            r12 = r8
        L_0x01ab:
            boolean r2 = r1.mo28699i()
            if (r2 == 0) goto L_0x01b5
            java.lang.String r2 = r1.subtitle
            r13 = r2
            goto L_0x01b6
        L_0x01b5:
            r13 = r8
        L_0x01b6:
            boolean r2 = r1.mo28695f()
            if (r2 == 0) goto L_0x01c4
            com.tranzmate.moovit.protocol.common.MVAccessory r1 = r1.accessory
            com.moovit.util.StyledText r1 = c70.C13749c.m34328n(r1)
            r14 = r1
            goto L_0x01c5
        L_0x01c4:
            r14 = r8
        L_0x01c5:
            if (r11 != 0) goto L_0x01ce
            if (r12 != 0) goto L_0x01ce
            if (r13 != 0) goto L_0x01ce
            if (r14 != 0) goto L_0x01ce
            goto L_0x01d4
        L_0x01ce:
            com.moovit.micromobility.nearby.MicroMobilityProperty r8 = new com.moovit.micromobility.nearby.MicroMobilityProperty
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x01d4:
            return r8
        L_0x01d5:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityProperty$_Fields r1 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityProperty._Fields) r1
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityProperty.m22796k(r1)
            java.lang.String r1 = "Cannot get field 'genericProperty' because union is currently set to genericProperty"
            r2.<init>(r1)
            throw r2
        L_0x01e4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unsupported MicroMobilityProperty type."
            r1.<init>(r2)
            throw r1
        L_0x01ec:
            r1 = r21
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        L_0x01fa:
            r1 = r21
            android.location.Address r1 = (android.location.Address) r1
            com.moovit.transit.LocationDescriptor r1 = aa0.C7530f.m17274g(r1)
            return r1
        L_0x0203:
            r1 = r21
            com.moovit.tripplanner.TripPlannerTransportType r1 = (com.moovit.tripplanner.TripPlannerTransportType) r1
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanTransportOptionPref r1 = com.moovit.itinerary.C16080a.m40970z(r1)
            return r1
        L_0x020c:
            r1 = r21
            com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction r1 = (com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction) r1
            com.moovit.itinerary.model.TurnInstruction r1 = com.moovit.itinerary.C16080a.m40946b(r1)
            return r1
        L_0x0215:
            r1 = r21
            com.moovit.database.DbEntityRef r1 = (com.moovit.database.DbEntityRef) r1
            int r1 = k40.C5479c.m13666c(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L_0x0222:
            r1 = r21
            com.moovit.network.model.ServerId r1 = (com.moovit.network.model.ServerId) r1
            int r1 = r1.f15142b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L_0x022d:
            r1 = r21
            com.tranzmate.moovit.protocol.favorites.MVSetFavoriteLineGroupsAndStops r1 = (com.tranzmate.moovit.protocol.favorites.MVSetFavoriteLineGroupsAndStops) r1
            int r4 = r1.metroId
            com.moovit.network.model.ServerId r10 = new com.moovit.network.model.ServerId
            r10.<init>(r4)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            boolean r4 = r1.mo27276g()
            if (r4 == 0) goto L_0x027f
            java.util.List<com.tranzmate.moovit.protocol.favorites.MVFavoriteLocation> r4 = r1.favoriteLocations
            java.util.Iterator r4 = r4.iterator()
            r5 = r8
            r9 = r5
        L_0x024b:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x027c
            java.lang.Object r11 = r4.next()
            com.tranzmate.moovit.protocol.favorites.MVFavoriteLocation r11 = (com.tranzmate.moovit.protocol.favorites.MVFavoriteLocation) r11
            int[] r12 = p479ey.C16896h.C16897a.f43915a
            com.tranzmate.moovit.protocol.favorites.MVFavoriteLocationType r14 = r11.type
            int r14 = r14.ordinal()
            r12 = r12[r14]
            if (r12 == r7) goto L_0x0277
            if (r12 == r6) goto L_0x0272
            if (r12 == r3) goto L_0x0268
            goto L_0x024b
        L_0x0268:
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r11 = p479ey.C16896h.m42699f(r11)
            if (r11 == 0) goto L_0x024b
            r13.add(r11)
            goto L_0x024b
        L_0x0272:
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r9 = p479ey.C16896h.m42699f(r11)
            goto L_0x024b
        L_0x0277:
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r5 = p479ey.C16896h.m42699f(r11)
            goto L_0x024b
        L_0x027c:
            r14 = r5
            r15 = r9
            goto L_0x0281
        L_0x027f:
            r14 = r8
            r15 = r14
        L_0x0281:
            java.util.List<java.lang.Integer> r3 = r1.favoriteLineGroupIds
            a8.l r4 = new a8.l
            r4.<init>(r2)
            java.util.ArrayList r11 = c00.C13720d.m34273c(r3, r8, r4)
            java.util.List<java.lang.Integer> r1 = r1.favoriteStopIds
            d0.q r2 = new d0.q
            r3 = 9
            r2.<init>(r3)
            java.util.ArrayList r12 = c00.C13720d.m34273c(r1, r8, r2)
            dy.b r1 = new dy.b
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r1
        L_0x02a0:
            r1 = r21
            java.lang.String r1 = (java.lang.String) r1
            com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction r1 = com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction.valueOf(r1)
            int[] r2 = p596jx.C17964m.C17965a.f46044d
            int r8 = r1.ordinal()
            r2 = r2[r8]
            if (r2 == r7) goto L_0x02dd
            if (r2 == r6) goto L_0x02da
            if (r2 == r3) goto L_0x02d7
            if (r2 == r4) goto L_0x02d4
            if (r2 != r5) goto L_0x02bd
            com.moovit.app.tod.model.TodRideVehicleAction r1 = com.moovit.app.tod.model.TodRideVehicleAction.FLASH
            goto L_0x02df
        L_0x02bd:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown action type: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x02d4:
            com.moovit.app.tod.model.TodRideVehicleAction r1 = com.moovit.app.tod.model.TodRideVehicleAction.BEEP
            goto L_0x02df
        L_0x02d7:
            com.moovit.app.tod.model.TodRideVehicleAction r1 = com.moovit.app.tod.model.TodRideVehicleAction.AUDIO
            goto L_0x02df
        L_0x02da:
            com.moovit.app.tod.model.TodRideVehicleAction r1 = com.moovit.app.tod.model.TodRideVehicleAction.AC
            goto L_0x02df
        L_0x02dd:
            com.moovit.app.tod.model.TodRideVehicleAction r1 = com.moovit.app.tod.model.TodRideVehicleAction.COLOR_BAR
        L_0x02df:
            return r1
        L_0x02e0:
            r1 = r21
            com.tranzmate.moovit.protocol.taxi.MVTaxiOrderProfile r1 = (com.tranzmate.moovit.protocol.taxi.MVTaxiOrderProfile) r1
            int r2 = r1.f28613id
            com.moovit.network.model.ServerId r3 = new com.moovit.network.model.ServerId
            r3.<init>(r2)
            boolean r2 = r1.mo32210f()
            if (r2 == 0) goto L_0x02f8
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r1.icon
            com.moovit.image.model.Image r2 = com.moovit.image.C16028g.m40829g(r2)
            goto L_0x02f9
        L_0x02f8:
            r2 = r8
        L_0x02f9:
            boolean r4 = r1.mo32214i()
            if (r4 == 0) goto L_0x0302
            java.lang.String r4 = r1.title
            goto L_0x0303
        L_0x0302:
            r4 = r8
        L_0x0303:
            boolean r5 = r1.mo32212h()
            if (r5 == 0) goto L_0x030b
            java.lang.String r8 = r1.subtitle
        L_0x030b:
            com.moovit.app.taxi.providers.TaxiOrderProfile r1 = new com.moovit.app.taxi.providers.TaxiOrderProfile
            r1.<init>(r2, r3, r4, r8)
            return r1
        L_0x0311:
            r1 = r21
            com.tranzmate.moovit.protocol.subscriptions.MVUserSubscription r1 = (com.tranzmate.moovit.protocol.subscriptions.MVUserSubscription) r1
            com.tranzmate.moovit.protocol.subscriptions.MVStoreProduct r1 = r1.activeStoreProduct
            com.tranzmate.moovit.protocol.subscriptions.MVGoogleProduct r1 = r1.mo31823m()
            java.lang.String r1 = r1.sku
            gw.a r2 = new gw.a
            r2.<init>(r1)
            gw.b r1 = new gw.b
            r1.<init>(r2)
            return r1
        L_0x0328:
            r1 = r21
            com.android.billingclient.api.SkuDetails r1 = (com.android.billingclient.api.SkuDetails) r1
            org.json.JSONObject r1 = r1.f6735b
            java.lang.String r2 = "productId"
            java.lang.String r1 = r1.optString(r2)
            return r1
        L_0x0335:
            r1 = r21
            com.android.billingclient.api.Purchase r1 = (com.android.billingclient.api.Purchase) r1
            com.moovit.app.subscription.model.PurchaseDetails r1 = p549hw.C17508f.m43616a(r1)
            return r1
        L_0x033e:
            r1 = r21
            com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDetails r1 = (com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDetails) r1
            com.moovit.servicealerts.ServiceAlert r1 = j80.C12776e.m32578b(r1)
            return r1
        L_0x0347:
            r1 = r21
            com.tranzmate.moovit.protocol.common.MVGeofence r1 = (com.tranzmate.moovit.protocol.common.MVGeofence) r1
            com.moovit.commons.geo.Geofence r1 = com.moovit.navigation.C4229c.m11339c(r1)
            return r1
        L_0x0350:
            r1 = r21
            com.moovit.app.mot.model.MotActivation r1 = (com.moovit.app.mot.model.MotActivation) r1
            java.lang.String r1 = r1.f38992i
            return r1
        L_0x0357:
            r1 = r21
            yy.c r1 = (p952yy.C20787c) r1
            com.moovit.network.model.ServerId r1 = r1.f52456a
            return r1
        L_0x035e:
            r1 = r21
            com.tranzmate.moovit.protocol.users.MVExternalWebPage r1 = (com.tranzmate.moovit.protocol.users.MVExternalWebPage) r1
            java.lang.String r9 = r1.pageId
            com.tranzmate.moovit.protocol.users.MVExternalWebPageType r2 = r1.type
            int[] r3 = p875vs.C20225d.C20226a.f51330a
            int r4 = r2.ordinal()
            r3 = r3[r4]
            if (r3 == r7) goto L_0x038c
            if (r3 != r6) goto L_0x0375
            r2 = 2
            r10 = 2
            goto L_0x038e
        L_0x0375:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown web page type: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x038c:
            r2 = 1
            r10 = 1
        L_0x038e:
            int r2 = r1.image
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.moovit.image.model.Image r13 = com.moovit.image.C16028g.m40823a(r2)
            int r2 = r1.backgroundColor
            zz.m0<java.lang.Integer> r3 = c70.C13749c.f33838a
            com.moovit.commons.utils.Color r14 = new com.moovit.commons.utils.Color
            r14.<init>(r2)
            java.lang.String r11 = r1.caption
            java.lang.String r12 = r1.link
            boolean r15 = r1.embedded
            long r1 = r1.lastUpdated
            vs.a r3 = new vs.a
            r18 = -1
            r8 = r3
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r18)
            return r3
        L_0x03b4:
            r1 = r21
            com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r1 = (com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType) r1
            com.moovit.metro.ReportCategoryType r1 = com.moovit.transit.C7841a.m17865c(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p875vs.C20228e.convert(java.lang.Object):java.lang.Object");
    }
}

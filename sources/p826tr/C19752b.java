package p826tr;

import c00.C13721e;

/* renamed from: tr.b */
public final /* synthetic */ class C19752b implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f50229b;

    public /* synthetic */ C19752b(int i) {
        this.f50229b = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.moovit.commons.utils.AppDeepLink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.moovit.commons.utils.AppDeepLink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.moovit.commons.utils.AppDeepLink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.moovit.commons.utils.AppDeepLink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.moovit.commons.utils.AppDeepLink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.moovit.commons.utils.AppDeepLink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.moovit.commons.utils.AppDeepLink} */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object convert(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f50229b
            r1 = 2
            r2 = 0
            switch(r0) {
                case 0: goto L_0x0228;
                case 1: goto L_0x0221;
                case 2: goto L_0x0212;
                case 3: goto L_0x0204;
                case 4: goto L_0x01df;
                case 5: goto L_0x01a0;
                case 6: goto L_0x0190;
                case 7: goto L_0x018b;
                case 8: goto L_0x0184;
                case 9: goto L_0x017d;
                case 10: goto L_0x0171;
                case 11: goto L_0x016a;
                case 12: goto L_0x0161;
                case 13: goto L_0x015a;
                case 14: goto L_0x00bc;
                case 15: goto L_0x00af;
                case 16: goto L_0x0065;
                case 17: goto L_0x003c;
                case 18: goto L_0x0031;
                case 19: goto L_0x002a;
                case 20: goto L_0x0023;
                case 21: goto L_0x000e;
                case 22: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x022f
        L_0x0009:
            on.l r15 = (p705on.C18805l) r15
            java.lang.String r15 = r15.f47899b
            return r15
        L_0x000e:
            com.tranzmate.moovit.protocol.ticketingV2.MVTicket r15 = (com.tranzmate.moovit.protocol.ticketingV2.MVTicket) r15
            sz.r r0 = q80.C13036y.f32248a
            com.moovit.ticketing.ticket.TicketId r0 = new com.moovit.ticketing.ticket.TicketId
            int r1 = r15.providerId
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            java.lang.String r1 = r15.agencyKey
            java.lang.String r15 = r15.f29165id
            r0.<init>(r2, r1, r15)
            return r0
        L_0x0023:
            com.moovit.ticketing.ticket.TicketId r15 = (com.moovit.ticketing.ticket.TicketId) r15
            int r0 = q80.C13031t.f32241x
            java.lang.String r15 = r15.f23513d
            return r15
        L_0x002a:
            com.moovit.ticketing.providers.TicketingEngine r15 = (com.moovit.ticketing.providers.TicketingEngine) r15
            com.moovit.network.model.ServerId r15 = r15.getProviderId()
            return r15
        L_0x0031:
            com.moovit.payment.registration.steps.profile.PaymentProfile r15 = (com.moovit.payment.registration.steps.profile.PaymentProfile) r15
            java.lang.String r0 = s60.C19438d.f49441x
            com.moovit.network.model.ServerId r15 = r15.f42828b
            java.lang.String r15 = r15.mo19751c()
            return r15
        L_0x003c:
            com.tranzmate.moovit.protocol.payments.MVPaymentSummarySecondaryAction r15 = (com.tranzmate.moovit.protocol.payments.MVPaymentSummarySecondaryAction) r15
            sz.r r0 = h60.C17353s0.f44739a
            int[] r0 = h60.C17353s0.C17354a.f44755p
            int r1 = r15.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 != r1) goto L_0x004e
            com.moovit.payment.confirmation.summary.PaymentSummarySecondaryAction r15 = com.moovit.payment.confirmation.summary.PaymentSummarySecondaryAction.ADD_VOUCHER
            return r15
        L_0x004e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown secondary action type: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x0065:
            com.tranzmate.moovit.protocol.payments.MVPaymentAccountCertificate r15 = (com.tranzmate.moovit.protocol.payments.MVPaymentAccountCertificate) r15
            sz.r r0 = h60.C17353s0.f44739a
            boolean r0 = r15.mo30107i()
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = r15.paymentContext
            r4 = r0
            goto L_0x0074
        L_0x0073:
            r4 = r2
        L_0x0074:
            boolean r0 = r15.mo30105h()
            if (r0 == 0) goto L_0x0082
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r0 = r15.image
            com.moovit.image.model.Image r0 = com.moovit.image.C16028g.m40829g(r0)
            r5 = r0
            goto L_0x0083
        L_0x0082:
            r5 = r2
        L_0x0083:
            boolean r0 = r15.mo30110l()
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r15.title
            r6 = r0
            goto L_0x008e
        L_0x008d:
            r6 = r2
        L_0x008e:
            boolean r0 = r15.mo30109k()
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = r15.subtitle
            r7 = r0
            goto L_0x0099
        L_0x0098:
            r7 = r2
        L_0x0099:
            boolean r0 = r15.mo30104g()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r2 = r15.cta
        L_0x00a1:
            r8 = r2
            com.tranzmate.moovit.protocol.payments.MVVerificationStatus r15 = r15.status
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r9 = h60.C17353s0.m43393g(r15)
            com.moovit.payment.account.model.PaymentAccountCertificatePreview r15 = new com.moovit.payment.account.model.PaymentAccountCertificatePreview
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r15
        L_0x00af:
            com.moovit.payment.invoices.model.Invoice r15 = (com.moovit.payment.invoices.model.Invoice) r15
            com.moovit.payment.invoices.a$c r0 = new com.moovit.payment.invoices.a$c
            java.lang.String r2 = "invoice"
            ce0.C21100e.m49373x(r15, r2)
            r0.<init>(r1, r15)
            return r0
        L_0x00bc:
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOption r15 = (com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOption) r15
            java.lang.String r0 = "it"
            mf0.C24362h.m61210e(r15, r0)
            boolean r0 = r15.mo29334h()
            if (r0 == 0) goto L_0x00d1
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r0 = r15.icon
            com.moovit.image.model.Image r0 = com.moovit.image.C16028g.m40829g(r0)
            r5 = r0
            goto L_0x00d2
        L_0x00d1:
            r5 = r2
        L_0x00d2:
            boolean r0 = r15.mo29339l()
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = r15.title
            r6 = r0
            goto L_0x00dd
        L_0x00dc:
            r6 = r2
        L_0x00dd:
            boolean r0 = r15.mo29338k()
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r15.subtitle
            r7 = r0
            goto L_0x00e8
        L_0x00e7:
            r7 = r2
        L_0x00e8:
            boolean r0 = r15.mo29332f()
            if (r0 == 0) goto L_0x0133
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowConfirmation r0 = r15.confirmation
            java.lang.String r1 = "getConfirmation()"
            mf0.C24362h.m61210e(r0, r1)
            boolean r1 = r0.mo29260f()
            if (r1 == 0) goto L_0x0103
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r1 = r0.image
            com.moovit.image.model.Image r1 = com.moovit.image.C16028g.m40829g(r1)
            r9 = r1
            goto L_0x0104
        L_0x0103:
            r9 = r2
        L_0x0104:
            boolean r1 = r0.mo29265j()
            if (r1 == 0) goto L_0x010e
            java.lang.String r1 = r0.title
            r10 = r1
            goto L_0x010f
        L_0x010e:
            r10 = r2
        L_0x010f:
            boolean r1 = r0.mo29264i()
            if (r1 == 0) goto L_0x0119
            java.lang.String r1 = r0.text
            r11 = r1
            goto L_0x011a
        L_0x0119:
            r11 = r2
        L_0x011a:
            boolean r1 = r0.mo29261g()
            if (r1 == 0) goto L_0x0124
            java.lang.String r1 = r0.negetiveText
            r13 = r1
            goto L_0x0125
        L_0x0124:
            r13 = r2
        L_0x0125:
            com.moovit.payment.account.actions.model.OptionConfirmation r1 = new com.moovit.payment.account.actions.model.OptionConfirmation
            java.lang.String r12 = r0.positiveText
            java.lang.String r0 = "getPositiveText()"
            mf0.C24362h.m61210e(r12, r0)
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0134
        L_0x0133:
            r8 = r2
        L_0x0134:
            boolean r0 = r15.mo29337j()
            if (r0 == 0) goto L_0x0142
            com.tranzmate.moovit.protocol.common.MVPriceInfo r0 = r15.priceInfo
            com.moovit.util.PriceInfo r0 = c70.C13749c.m34326l(r0)
            r9 = r0
            goto L_0x0143
        L_0x0142:
            r9 = r2
        L_0x0143:
            boolean r0 = r15.mo29333g()
            if (r0 == 0) goto L_0x014b
            java.lang.String r2 = r15.descriptionHtml
        L_0x014b:
            r10 = r2
            com.moovit.payment.account.actions.model.SelectionOption r0 = new com.moovit.payment.account.actions.model.SelectionOption
            java.lang.String r4 = r15.optionId
            java.lang.String r15 = "getOptionId()"
            mf0.C24362h.m61210e(r4, r15)
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x015a:
            com.moovit.database.DbEntityRef r15 = (com.moovit.database.DbEntityRef) r15
            com.moovit.network.model.ServerId r15 = r15.getServerId()
            return r15
        L_0x0161:
            com.moovit.micromobility.ride.MicroMobilityRide r15 = (com.moovit.micromobility.ride.MicroMobilityRide) r15
            java.util.Set<com.moovit.micromobility.ride.MicroMobilityRide$Status> r0 = b40.C1476d.f5360c
            com.moovit.micromobility.ride.a r15 = r15.f14991i
            com.moovit.micromobility.ride.MicroMobilityRide$Status r15 = r15.f15007b
            return r15
        L_0x016a:
            java.lang.String r15 = (java.lang.String) r15
            com.moovit.commons.geo.Polylon r15 = com.moovit.commons.geo.Polylon.m40195m(r15)
            return r15
        L_0x0171:
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            com.moovit.network.model.ServerId r0 = new com.moovit.network.model.ServerId
            r0.<init>(r15)
            return r0
        L_0x017d:
            com.moovit.itinerary.model.TurnInstruction r15 = (com.moovit.itinerary.model.TurnInstruction) r15
            com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction r15 = com.moovit.itinerary.C16080a.m40945a(r15)
            return r15
        L_0x0184:
            com.moovit.itinerary.model.leg.TransitLineLeg r15 = (com.moovit.itinerary.model.leg.TransitLineLeg) r15
            com.tranzmate.moovit.protocol.tripplanner.MVLineLeg r15 = com.moovit.itinerary.C16080a.m40968x(r15)
            return r15
        L_0x018b:
            com.tranzmate.moovit.protocol.users.MVUserTag r15 = (com.tranzmate.moovit.protocol.users.MVUserTag) r15
            java.util.List<java.lang.String> r15 = r15.values
            return r15
        L_0x0190:
            com.tranzmate.moovit.protocol.tod.passenger.MVTodZoneShape r15 = (com.tranzmate.moovit.protocol.tod.passenger.MVTodZoneShape) r15
            java.lang.String r0 = r15.shapeId
            java.lang.String r15 = r15.polyline
            com.moovit.commons.geo.Polylon r15 = com.moovit.commons.geo.Polylon.m40195m(r15)
            com.moovit.app.tod.bookingflow.model.TodZoneShape r1 = new com.moovit.app.tod.bookingflow.model.TodZoneShape
            r1.<init>(r0, r15)
            return r1
        L_0x01a0:
            com.tranzmate.moovit.protocol.ridesharing.MVRSEventBucket r15 = (com.tranzmate.moovit.protocol.ridesharing.MVRSEventBucket) r15
            int r0 = r15.bucketId
            com.moovit.network.model.ServerId r4 = new com.moovit.network.model.ServerId
            r4.<init>(r0)
            boolean r0 = r15.mo31277i()
            if (r0 == 0) goto L_0x01b7
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r0 = r15.image
            com.moovit.image.model.Image r0 = com.moovit.image.C16028g.m40829g(r0)
            r5 = r0
            goto L_0x01b8
        L_0x01b7:
            r5 = r2
        L_0x01b8:
            boolean r0 = r15.mo31278j()
            if (r0 == 0) goto L_0x01c2
            java.lang.String r0 = r15.name
            r6 = r0
            goto L_0x01c3
        L_0x01c2:
            r6 = r2
        L_0x01c3:
            long r7 = r15.fromTime
            long r9 = r15.toTime
            java.util.List<com.tranzmate.moovit.protocol.common.MVDirection> r15 = r15.directions
            d0.q r0 = new d0.q
            r3 = 20
            r0.<init>(r3)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>(r1)
            c00.C13720d.m34276f(r15, r2, r0, r11)
            com.moovit.ridesharing.model.EventBookingBucket r15 = new com.moovit.ridesharing.model.EventBookingBucket
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r9, r11)
            return r15
        L_0x01df:
            com.tranzmate.moovit.protocol.common.MVPromotion r15 = (com.tranzmate.moovit.protocol.common.MVPromotion) r15
            java.lang.String r0 = r15.iconUrl
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            com.moovit.image.model.UriImage r4 = com.moovit.image.model.UriImage.m40912c(r0, r1)
            java.lang.String r5 = r15.title
            java.lang.String r6 = r15.subtitle
            java.lang.String r7 = r15.actionText
            boolean r0 = r15.mo26359f()
            if (r0 == 0) goto L_0x01fc
            com.tranzmate.moovit.protocol.common.MVExternalAppData r15 = r15.actionDeepLink
            com.moovit.commons.utils.AppDeepLink r2 = c70.C13749c.m34315a(r15)
        L_0x01fc:
            r8 = r2
            com.moovit.app.promotion.model.Promotion r15 = new com.moovit.app.promotion.model.Promotion
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            return r15
        L_0x0204:
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r15 = (com.moovit.itinerary.model.leg.WaitToTransitLineLeg) r15
            int r0 = com.moovit.app.itinerary.view.leg.C15087l.f38717E
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg$DeparturesInfo r0 = r15.f42138i
            com.moovit.transit.Schedule r0 = r0.f42142b
            zz.i0 r1 = new zz.i0
            r1.<init>(r15, r0)
            return r1
        L_0x0212:
            r3 = r15
            com.moovit.itinerary.model.Itinerary r3 = (com.moovit.itinerary.model.Itinerary) r3
            xt.f r15 = new xt.f
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r15
        L_0x0221:
            com.tranzmate.moovit.protocol.common.MVRouteType r15 = (com.tranzmate.moovit.protocol.common.MVRouteType) r15
            com.moovit.tripplanner.TripPlannerTransportType r15 = com.moovit.itinerary.C16080a.m40955k(r15)
            return r15
        L_0x0228:
            com.moovit.commons.geo.LatLonE6 r15 = (com.moovit.commons.geo.LatLonE6) r15
            com.tranzmate.moovit.protocol.common.MVLatLon r15 = c70.C13749c.m34332r(r15)
            return r15
        L_0x022f:
            com.moovit.ticketing.validation.provider.agency.AgencySummaryInfo r15 = (com.moovit.ticketing.validation.provider.agency.AgencySummaryInfo) r15
            com.moovit.ticketing.ticket.TicketAgency r15 = r15.f23573b
            java.lang.String r15 = r15.f23495b
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p826tr.C19752b.convert(java.lang.Object):java.lang.Object");
    }
}

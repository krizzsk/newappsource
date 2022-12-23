package p450dt;

import c00.C13722f;

/* renamed from: dt.b */
public final /* synthetic */ class C16701b implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f43493b;

    /* renamed from: c */
    public final /* synthetic */ Object f43494c;

    public /* synthetic */ C16701b(Object obj, int i) {
        this.f43493b = i;
        this.f43494c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        if (((com.moovit.map.MarkerZoomStyle) r6.f47602a).f42450d != null) goto L_0x0077;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19661o(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f43493b
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x009f;
                case 1: goto L_0x0085;
                case 2: goto L_0x0046;
                case 3: goto L_0x0037;
                case 4: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x00ad
        L_0x0009:
            java.lang.Object r0 = r5.f43494c
            p80.b r0 = (p80.C12991b) r0
            h90.a r6 = (h90.C12739a) r6
            int r3 = h90.C12740b.f31473s
            com.moovit.network.model.ServerId r3 = r6.f31467a
            com.moovit.ticketing.ticket.TicketAgency r4 = r6.f31468b
            java.lang.String r4 = r4.f23495b
            p80.a r0 = r0.mo39880a(r3, r4)
            if (r0 == 0) goto L_0x0028
            java.util.Set<com.moovit.ticketing.configuration.TicketingAgencyCapability> r0 = r0.f32153e
            com.moovit.ticketing.configuration.TicketingAgencyCapability r3 = com.moovit.ticketing.configuration.TicketingAgencyCapability.STORED_VALUE
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0028
            goto L_0x0036
        L_0x0028:
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            com.moovit.util.CurrencyAmount r6 = r6.f31469c
            java.math.BigDecimal r6 = r6.f23845c
            int r6 = r0.compareTo(r6)
            if (r6 < 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            r2 = r2 ^ r1
        L_0x0036:
            return r2
        L_0x0037:
            java.lang.Object r0 = r5.f43494c
            com.moovit.ticketing.ticket.TicketId r0 = (com.moovit.ticketing.ticket.TicketId) r0
            com.moovit.ticketing.ticket.Ticket r6 = (com.moovit.ticketing.ticket.Ticket) r6
            java.util.concurrent.ThreadPoolExecutor r1 = m80.C12887v.f31893d
            com.moovit.ticketing.ticket.TicketId r6 = r6.f23473b
            boolean r6 = r0.equals(r6)
            return r6
        L_0x0046:
            java.lang.Object r0 = r5.f43494c
            com.moovit.map.MapFragment$i$a r0 = (com.moovit.map.MapFragment.C16227i.C16228a) r0
            o20.s r6 = (o20.C18713s) r6
            com.moovit.map.MapFragment$i r0 = com.moovit.map.MapFragment.C16227i.this
            r0.getClass()
            o20.e<MEZS> r6 = r6.f47614c
            android.util.SparseArray<MEZS> r3 = r6.f47605d
            if (r3 == 0) goto L_0x0079
            boolean r0 = r0.f42415d
            if (r0 == 0) goto L_0x0079
            r6 = 0
        L_0x005c:
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x0077
            java.lang.Object r0 = r3.valueAt(r6)
            com.moovit.map.MarkerZoomStyle r0 = (com.moovit.map.MarkerZoomStyle) r0
            if (r0 == 0) goto L_0x0074
            v10.a r0 = r0.f42450d
            if (r0 == 0) goto L_0x0070
            r0 = 1
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            if (r0 != 0) goto L_0x0074
            goto L_0x0082
        L_0x0074:
            int r6 = r6 + 1
            goto L_0x005c
        L_0x0077:
            r1 = 1
            goto L_0x0082
        L_0x0079:
            MEZS r6 = r6.f47602a
            com.moovit.map.MarkerZoomStyle r6 = (com.moovit.map.MarkerZoomStyle) r6
            v10.a r6 = r6.f42450d
            if (r6 == 0) goto L_0x0082
            goto L_0x0077
        L_0x0082:
            r6 = r1 ^ 1
            return r6
        L_0x0085:
            java.lang.Object r0 = r5.f43494c
            tu.k r0 = (p829tu.C19780k) r0
            com.moovit.transit.TransitPatternTrips r6 = (com.moovit.transit.TransitPatternTrips) r6
            r0.getClass()
            com.moovit.transit.TransitPattern r6 = r6.f23717b
            com.moovit.network.model.ServerId r6 = r6.f23708b
            com.moovit.app.mot.purchase.model.MotQrCodeTrip r0 = r0.f50288f
            com.moovit.util.time.Time r0 = r0.f39074d
            com.moovit.network.model.ServerId r0 = r0.mo24630f()
            boolean r6 = r6.equals(r0)
            return r6
        L_0x009f:
            java.lang.Object r0 = r5.f43494c
            com.moovit.app.home.tab.HomeTab r0 = (com.moovit.app.home.tab.HomeTab) r0
            com.moovit.app.home.tab.HomeTabSpec r6 = (com.moovit.app.home.tab.HomeTabSpec) r6
            int r3 = com.moovit.app.home.HomeActivity.f38149o0
            com.moovit.app.home.tab.HomeTab r6 = r6.f38422b
            if (r6 != r0) goto L_0x00ac
            r1 = 1
        L_0x00ac:
            return r1
        L_0x00ad:
            java.lang.Object r0 = r5.f43494c
            c00.f r0 = (c00.C13722f) r0
            com.moovit.ticketing.ticket.Ticket r6 = (com.moovit.ticketing.ticket.Ticket) r6
            com.moovit.ticketing.ticket.Ticket$Alert r3 = r6.f23488q
            if (r3 == 0) goto L_0x00be
            boolean r6 = r0.mo19661o(r6)
            if (r6 == 0) goto L_0x00be
            r1 = 1
        L_0x00be:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p450dt.C16701b.mo19661o(java.lang.Object):boolean");
    }
}

package p523gu;

import c00.C13721e;

/* renamed from: gu.b */
public final /* synthetic */ class C17230b implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f44535b;

    /* renamed from: c */
    public final /* synthetic */ Object f44536c;

    public /* synthetic */ C17230b(Object obj, int i) {
        this.f44535b = i;
        this.f44536c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.moovit.util.CurrencyAmount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.moovit.util.CurrencyAmount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.moovit.util.CurrencyAmount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.moovit.util.CurrencyAmount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.moovit.util.CurrencyAmount} */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object convert(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.f44535b
            r2 = 0
            switch(r1) {
                case 0: goto L_0x00e0;
                case 1: goto L_0x0080;
                case 2: goto L_0x000c;
                default: goto L_0x0008;
            }
        L_0x0008:
            r0 = r21
            goto L_0x012b
        L_0x000c:
            java.lang.Object r1 = r0.f44536c
            s90.d r1 = (s90.C13076d) r1
            r3 = r22
            p80.a r3 = (p80.C12989a) r3
            com.moovit.ticketing.ticket.TicketAgency r5 = r3.f32150b
            java.util.List<h90.a> r3 = r1.f32349d
            pq.h r4 = new pq.h
            r6 = 6
            r4.<init>(r5, r6)
            java.lang.Object r3 = c00.C13723g.m34286g(r3, r4)
            h90.a r3 = (h90.C12739a) r3
            if (r3 == 0) goto L_0x0030
            com.moovit.util.CurrencyAmount r4 = r3.f31469c
            com.moovit.ticketing.storedvalue.StoredValueStatus r3 = r3.f31470d
            zz.i0 r6 = new zz.i0
            r6.<init>(r4, r3)
            goto L_0x0031
        L_0x0030:
            r6 = r2
        L_0x0031:
            pq.i r3 = new pq.i
            r4 = 3
            r3.<init>(r5, r4)
            java.util.List<com.moovit.ticketing.ticket.Ticket> r4 = r1.f32346a
            java.util.Set r7 = java.util.Collections.emptySet()
            java.util.Set<com.moovit.ticketing.ticket.Ticket$Status> r8 = s90.C13076d.f32345h
            java.util.List r7 = r1.mo39944b(r7, r8)
            java.lang.Object r8 = c00.C13723g.m34286g(r7, r3)
            com.moovit.ticketing.ticket.Ticket r8 = (com.moovit.ticketing.ticket.Ticket) r8
            int r9 = c00.C13723g.m34281b(r4, r3)
            int r10 = c00.C13723g.m34281b(r7, r3)
            if (r8 == 0) goto L_0x0055
            java.lang.String r2 = r8.f23476e
        L_0x0055:
            dt.b r7 = new dt.b
            r8 = 5
            r7.<init>(r3, r8)
            int r3 = c00.C13723g.m34281b(r4, r7)
            java.lang.String r4 = r5.f23495b
            java.util.Map<java.lang.String, java.util.List<com.moovit.ticketing.message.TicketAgencyMessage>> r1 = r1.f32350e
            java.lang.Object r1 = r1.get(r4)
            java.util.List r1 = (java.util.List) r1
            tt.f r4 = new tt.f
            r4.<init>(r8)
            java.lang.Object r1 = c00.C13723g.m34286g(r1, r4)
            r11 = r1
            com.moovit.ticketing.message.TicketAgencyMessage r11 = (com.moovit.ticketing.message.TicketAgencyMessage) r11
            com.moovit.ticketing.validation.provider.agency.AgencySummaryInfo r1 = new com.moovit.ticketing.validation.provider.agency.AgencySummaryInfo
            r4 = r1
            r7 = r9
            r8 = r10
            r9 = r2
            r10 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r1
        L_0x0080:
            java.lang.Object r1 = r0.f44536c
            p80.b r1 = (p80.C12991b) r1
            r3 = r22
            com.tranzmate.moovit.protocol.ticketingV2.MVStoredValue r3 = (com.tranzmate.moovit.protocol.ticketingV2.MVStoredValue) r3
            sz.r r4 = q80.C13036y.f32248a
            int r4 = r3.providerId
            com.moovit.network.model.ServerId r6 = new com.moovit.network.model.ServerId
            r6.<init>(r4)
            java.lang.String r4 = r3.agencyKey
            com.moovit.ticketing.ticket.TicketAgency r7 = q80.C13036y.m32958j(r1, r6, r4)
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r1 = r3.balance
            com.moovit.util.CurrencyAmount r8 = c70.C13749c.m34318d(r1)
            com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueStatus r1 = r3.status
            int[] r4 = q80.C13036y.C13037a.f32255g
            int r5 = r1.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L_0x00c7
            r5 = 2
            if (r4 != r5) goto L_0x00b0
            com.moovit.ticketing.storedvalue.StoredValueStatus r1 = com.moovit.ticketing.storedvalue.StoredValueStatus.LOW_BALANCE
            goto L_0x00c9
        L_0x00b0:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown status: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00c7:
            com.moovit.ticketing.storedvalue.StoredValueStatus r1 = com.moovit.ticketing.storedvalue.StoredValueStatus.f23469OK
        L_0x00c9:
            r9 = r1
            boolean r10 = r3.isAutoloadEnabled
            boolean r1 = r3.mo32930g()
            if (r1 == 0) goto L_0x00d8
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r1 = r3.autoloadAmount
            com.moovit.util.CurrencyAmount r2 = c70.C13749c.m34318d(r1)
        L_0x00d8:
            r11 = r2
            h90.a r1 = new h90.a
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r1
        L_0x00e0:
            java.lang.Object r1 = r0.f44536c
            gu.c r1 = (p523gu.C17231c) r1
            r3 = r22
            com.moovit.util.time.Time r3 = (com.moovit.util.time.Time) r3
            r1.getClass()
            com.moovit.util.time.TimeVehicleLocation r4 = r3.f23912m
            if (r4 != 0) goto L_0x00f0
            goto L_0x012a
        L_0x00f0:
            s0.b r1 = r1.f44542l
            java.lang.String r5 = r4.f23924b
            java.lang.Object r1 = r1.getOrDefault(r5, r2)
            com.moovit.util.time.TimeVehicleLocation r1 = (com.moovit.util.time.TimeVehicleLocation) r1
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L_0x0101
            goto L_0x012a
        L_0x0101:
            com.moovit.util.time.Time r2 = new com.moovit.util.time.Time
            long r6 = r3.f23901b
            long r8 = r3.f23902c
            int r10 = r3.f23903d
            com.moovit.network.model.LongServerId r11 = r3.f23904e
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitPattern> r12 = r3.f23905f
            int r13 = r3.f23906g
            com.moovit.network.model.ServerId r14 = r3.f23907h
            com.moovit.util.time.TimeFrequency r15 = r3.f23908i
            java.lang.String r4 = r3.f23909j
            com.moovit.util.time.Time$Status r5 = r3.f23910k
            boolean r0 = r3.f23911l
            com.moovit.util.time.TimeVehicleAttributes r3 = r3.f23913n
            r17 = r5
            r5 = r2
            r16 = r4
            r18 = r0
            r19 = r1
            r20 = r3
            r5.<init>(r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = r2
        L_0x012a:
            return r3
        L_0x012b:
            java.lang.Object r1 = r0.f44536c
            android.content.Context r1 = (android.content.Context) r1
            r2 = r22
            com.moovit.util.time.Time r2 = (com.moovit.util.time.Time) r2
            int r3 = com.moovit.view.ScheduleView.f23969p
            long r2 = r2.f23901b
            java.lang.String r1 = com.moovit.util.time.C7925b.m18024l(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p523gu.C17230b.convert(java.lang.Object):java.lang.Object");
    }
}

package q80;

import c00.C13721e;

/* renamed from: q80.x */
public final /* synthetic */ class C13035x implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f32245b;

    /* renamed from: c */
    public final /* synthetic */ Object f32246c;

    /* renamed from: d */
    public final /* synthetic */ Object f32247d;

    public /* synthetic */ C13035x(int i, Object obj, Cloneable cloneable) {
        this.f32245b = i;
        this.f32246c = obj;
        this.f32247d = cloneable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object convert(java.lang.Object r34) {
        /*
            r33 = this;
            r0 = r33
            int r1 = r0.f32245b
            switch(r1) {
                case 0: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0109
        L_0x0009:
            java.lang.Object r1 = r0.f32246c
            p80.b r1 = (p80.C12991b) r1
            java.lang.Object r2 = r0.f32247d
            java.util.Map r2 = (java.util.Map) r2
            r3 = r34
            com.tranzmate.moovit.protocol.ticketingV2.MVTicket r3 = (com.tranzmate.moovit.protocol.ticketingV2.MVTicket) r3
            com.moovit.ticketing.ticket.TicketId r5 = new com.moovit.ticketing.ticket.TicketId
            int r4 = r3.providerId
            com.moovit.network.model.ServerId r6 = new com.moovit.network.model.ServerId
            r6.<init>(r4)
            java.lang.String r4 = r3.agencyKey
            java.lang.String r7 = r3.f29165id
            r5.<init>(r6, r4, r7)
            java.lang.String r6 = r3.f29165id
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus r4 = r3.status
            com.moovit.ticketing.ticket.Ticket$Status r7 = q80.C13036y.m32955g(r4)
            java.lang.String r8 = r3.name
            boolean r4 = r3.mo33019G()
            if (r4 == 0) goto L_0x0039
            java.lang.String r4 = r3.ticketDescription
            r10 = r4
            goto L_0x003a
        L_0x0039:
            r10 = 0
        L_0x003a:
            com.moovit.network.model.ServerId r4 = r5.f23511b
            java.lang.String r11 = r3.agencyKey
            com.moovit.ticketing.ticket.TicketAgency r1 = q80.C13036y.m32958j(r1, r4, r11)
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r4 = r3.price
            com.moovit.util.CurrencyAmount r11 = c70.C13749c.m34318d(r4)
            long r12 = r3.purchaseDate
            boolean r4 = r3.mo33020H()
            if (r4 == 0) goto L_0x0053
            long r14 = r3.validFromDate
            goto L_0x0055
        L_0x0053:
            r14 = -1
        L_0x0055:
            boolean r4 = r3.mo33040p()
            if (r4 == 0) goto L_0x0062
            r18 = r10
            long r9 = r3.expirationDate
            r19 = r9
            goto L_0x0066
        L_0x0062:
            r18 = r10
            r19 = -1
        L_0x0066:
            boolean r4 = r3.mo33030f()
            if (r4 == 0) goto L_0x0071
            long r9 = r3.activationDate
            r21 = r9
            goto L_0x0073
        L_0x0071:
            r21 = -1
        L_0x0073:
            boolean r4 = r3.mo33031g()
            if (r4 == 0) goto L_0x007e
            long r9 = r3.activeUntil
            r23 = r9
            goto L_0x0080
        L_0x007e:
            r23 = -1
        L_0x0080:
            java.lang.String r10 = r3.email
            java.lang.String r9 = r3.phone
            boolean r4 = r3.mo33044t()
            if (r4 == 0) goto L_0x0091
            java.lang.Object r2 = r2.get(r3)
            com.moovit.ticketing.ticket.c r2 = (com.moovit.ticketing.ticket.C7755c) r2
            goto L_0x0092
        L_0x0091:
            r2 = 0
        L_0x0092:
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketAlert r4 = r3.alert
            if (r4 != 0) goto L_0x0099
            r16 = r9
            goto L_0x00ac
        L_0x0099:
            int[] r16 = q80.C13036y.C13037a.f32254f
            int r4 = r4.ordinal()
            r4 = r16[r4]
            r16 = r9
            r9 = 1
            if (r4 == r9) goto L_0x00b5
            r9 = 2
            if (r4 == r9) goto L_0x00b2
            r9 = 3
            if (r4 == r9) goto L_0x00af
        L_0x00ac:
            r25 = 0
            goto L_0x00b9
        L_0x00af:
            com.moovit.ticketing.ticket.Ticket$Alert r4 = com.moovit.ticketing.ticket.Ticket.Alert.PURCHASE_FAILURE
            goto L_0x00b7
        L_0x00b2:
            com.moovit.ticketing.ticket.Ticket$Alert r4 = com.moovit.ticketing.ticket.Ticket.Alert.PASSBOOK_LOW_TRIP
            goto L_0x00b7
        L_0x00b5:
            com.moovit.ticketing.ticket.Ticket$Alert r4 = com.moovit.ticketing.ticket.Ticket.Alert.EXPIRING
        L_0x00b7:
            r25 = r4
        L_0x00b9:
            boolean r4 = r3.mo33043s()
            if (r4 == 0) goto L_0x00c4
            java.lang.String r4 = r3.originName
            r27 = r4
            goto L_0x00c6
        L_0x00c4:
            r27 = 0
        L_0x00c6:
            boolean r4 = r3.mo33038m()
            if (r4 == 0) goto L_0x00d1
            java.lang.String r4 = r3.destinationName
            r28 = r4
            goto L_0x00d3
        L_0x00d1:
            r28 = 0
        L_0x00d3:
            boolean r4 = r3.mo33049y()
            if (r4 == 0) goto L_0x00de
            java.lang.String r4 = r3.productType
            r29 = r4
            goto L_0x00e0
        L_0x00de:
            r29 = 0
        L_0x00e0:
            boolean r4 = r3.mo33048w()
            if (r4 == 0) goto L_0x00eb
            java.lang.String r3 = r3.productSubTitle
            r30 = r3
            goto L_0x00ed
        L_0x00eb:
            r30 = 0
        L_0x00ed:
            com.moovit.ticketing.ticket.Ticket r3 = new com.moovit.ticketing.ticket.Ticket
            r4 = r3
            r26 = 0
            r31 = r16
            r9 = r18
            r32 = r10
            r10 = r1
            r16 = r19
            r18 = r21
            r20 = r23
            r22 = r32
            r23 = r31
            r24 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r18, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r3
        L_0x0109:
            java.lang.Object r1 = r0.f32246c
            com.moovit.ticketing.ticket.TicketAgency r1 = (com.moovit.ticketing.ticket.TicketAgency) r1
            java.lang.Object r2 = r0.f32247d
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            r3 = r34
            on.l r3 = (p705on.C18805l) r3
            com.moovit.ticketing.purchase.fare.TicketFare r1 = s80.C13070g.m33012d(r1, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q80.C13035x.convert(java.lang.Object):java.lang.Object");
    }
}

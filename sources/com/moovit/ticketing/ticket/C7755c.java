package com.moovit.ticketing.ticket;

import c00.C13717b;
import c00.C13720d;
import ce0.C21100e;
import com.moovit.ticketing.ticket.Ticket;
import e00.C16760a;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p241s0.C6302b;
import p250s9.C6489b;
import p638lr.C18267n;
import p810sz.C19575a;
import p810sz.C19576b;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: com.moovit.ticketing.ticket.c */
public final class C7755c {

    /* renamed from: e */
    public static final C7756a f23532e = new C7756a();

    /* renamed from: a */
    public final String f23533a;

    /* renamed from: b */
    public final String f23534b;

    /* renamed from: c */
    public final Map<Ticket.Status, List<TicketId>> f23535c;

    /* renamed from: d */
    public final int f23536d;

    /* renamed from: com.moovit.ticketing.ticket.c$a */
    public class C7756a extends C19619s<C7755c> {
        public C7756a() {
            super(0, C7755c.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new C7755c(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51961o(Ticket.Status.CODER, C19575a.m46957a(TicketId.f23510f, true), new HashMap(Ticket.Status.values().length)));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C7755c cVar = (C7755c) obj;
            qVar.mo51954p(cVar.f23533a);
            qVar.mo51954p(cVar.f23534b);
            qVar.mo51966o(cVar.f23535c, Ticket.Status.CODER, new C19576b(TicketId.f23510f, true));
        }
    }

    public C7755c(String str, String str2, Map<Ticket.Status, ? extends List<TicketId>> map) {
        C21100e.m49373x(str, "id");
        this.f23533a = str;
        C21100e.m49373x(str2, "name");
        this.f23534b = str2;
        C21100e.m49373x(map, "ticketsByStatus");
        C16760a aVar = new C16760a(new C6302b(map.size()), Collections.emptyList());
        C13720d.m34275e(map, aVar, C13720d.f33796a, new C18267n(26));
        this.f23535c = Collections.unmodifiableMap(aVar);
        this.f23536d = C13717b.m34263j(map.values(), new C6489b(6));
    }
}

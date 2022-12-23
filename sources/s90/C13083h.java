package s90;

import com.moovit.network.model.ServerId;
import com.moovit.ticketing.storedvalue.StoredValueStatus;
import com.moovit.ticketing.ticket.C7755c;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.util.CurrencyAmount;
import h90.C12739a;
import java.io.IOException;
import java.util.HashMap;
import l90.C12850a;
import p066e0.C4436j0;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19619s;
import p977zz.C20944i0;

/* renamed from: s90.h */
public final class C13083h {

    /* renamed from: a */
    public static final C19617r f32369a;

    /* renamed from: b */
    public static final C13085b f32370b = new C13085b(Ticket.class);

    /* renamed from: c */
    public static final C13086c f32371c = new C13086c();

    /* renamed from: s90.h$a */
    public class C13084a extends C19619s<C12850a> {
        public C13084a() {
            super(0, C12850a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new C12850a(new ServerId(pVar.mo51924l()), pVar.mo51947p(), pVar.mo51925m(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C12850a aVar = (C12850a) obj;
            ServerId serverId = aVar.f31612a;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(aVar.f31772b);
            qVar.mo51940m(aVar.f31773c);
            qVar.mo51954p(aVar.f31774d);
        }
    }

    /* renamed from: s90.h$b */
    public class C13085b extends C19619s<Ticket> {
        public C13085b(Class cls) {
            super(2, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 2;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Ticket.Alert alert;
            String str;
            String str2;
            String str3;
            String str4;
            C19615p pVar2 = pVar;
            int i2 = i;
            TicketId.C7749b bVar = TicketId.f23510f;
            pVar.getClass();
            TicketId ticketId = (TicketId) bVar.read(pVar2);
            String p = pVar.mo51947p();
            Ticket.Status status = (Ticket.Status) C13555b.m33968g(Ticket.Status.CODER, pVar2);
            String p2 = pVar.mo51947p();
            String t = pVar.mo51948t();
            TicketAgency ticketAgency = (TicketAgency) TicketAgency.f23494g.read(pVar2);
            CurrencyAmount currencyAmount = (CurrencyAmount) CurrencyAmount.f23843f.read(pVar2);
            long m = pVar.mo51925m();
            long m2 = pVar.mo51925m();
            long m3 = pVar.mo51925m();
            long m4 = pVar.mo51925m();
            long m5 = pVar.mo51925m();
            String t2 = pVar.mo51948t();
            String t3 = pVar.mo51948t();
            C7755c cVar = (C7755c) pVar2.mo51962q(C7755c.f23532e);
            if (i2 >= 1) {
                alert = (Ticket.Alert) pVar2.mo51962q(Ticket.Alert.CODER);
            } else {
                alert = null;
            }
            if (i2 >= 2) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            if (i2 >= 2) {
                str2 = pVar.mo51948t();
            } else {
                str2 = null;
            }
            if (i2 >= 2) {
                str3 = pVar.mo51948t();
            } else {
                str3 = null;
            }
            if (i2 >= 2) {
                str4 = pVar.mo51948t();
            } else {
                str4 = null;
            }
            return new Ticket(ticketId, p, status, p2, t, ticketAgency, currencyAmount, m, m2, m3, m4, m5, t2, t3, cVar, alert, (C4436j0) null, str, str2, str3, str4);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            Ticket ticket = (Ticket) obj;
            TicketId ticketId = ticket.f23473b;
            TicketId.C7749b bVar = TicketId.f23510f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(ticketId, qVar);
            qVar.mo51954p(ticket.f23474c);
            Ticket.Status.CODER.write(ticket.f23475d, qVar);
            qVar.mo51954p(ticket.f23476e);
            qVar.mo51955t(ticket.f23477f);
            TicketAgency ticketAgency = ticket.f23478g;
            TicketAgency.C7744b bVar2 = TicketAgency.f23494g;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(ticketAgency, qVar);
            CurrencyAmount currencyAmount = ticket.f23479h;
            CurrencyAmount.C7881b bVar3 = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar3.f49802v);
            bVar3.mo179c(currencyAmount, qVar);
            qVar.mo51940m(ticket.f23480i);
            qVar.mo51940m(ticket.f23481j);
            qVar.mo51940m(ticket.f23482k);
            qVar.mo51940m(ticket.f23483l);
            qVar.mo51940m(ticket.f23484m);
            qVar.mo51955t(ticket.f23485n);
            qVar.mo51955t(ticket.f23486o);
            qVar.mo51967q(ticket.f23487p, C7755c.f23532e);
            qVar.mo51967q(ticket.f23488q, Ticket.Alert.CODER);
            qVar.mo51955t(ticket.f23489r);
            qVar.mo51955t(ticket.f23490s);
            qVar.mo51955t(ticket.f23491t);
            qVar.mo51955t(ticket.f23492u);
        }
    }

    /* renamed from: s90.h$c */
    public class C13086c extends C19619s<C12739a> {
        public C13086c() {
            super(1, C12739a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.moovit.util.CurrencyAmount} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo178b(p810sz.C19615p r12, int r13) throws java.io.IOException {
            /*
                r11 = this;
                boolean r0 = r12.mo51919b()
                r1 = 1
                r0 = r0 ^ r1
                r2 = 0
                if (r0 == 0) goto L_0x000b
                r5 = r2
                goto L_0x0015
            L_0x000b:
                int r0 = r12.mo51924l()
                com.moovit.network.model.ServerId r3 = new com.moovit.network.model.ServerId
                r3.<init>(r0)
                r5 = r3
            L_0x0015:
                com.moovit.ticketing.ticket.TicketAgency$b r0 = com.moovit.ticketing.ticket.TicketAgency.f23494g
                java.lang.Object r0 = r0.read(r12)
                r6 = r0
                com.moovit.ticketing.ticket.TicketAgency r6 = (com.moovit.ticketing.ticket.TicketAgency) r6
                com.moovit.util.CurrencyAmount$b r0 = com.moovit.util.CurrencyAmount.f23843f
                java.lang.Object r3 = r12.mo51962q(r0)
                r7 = r3
                com.moovit.util.CurrencyAmount r7 = (com.moovit.util.CurrencyAmount) r7
                sz.c<com.moovit.ticketing.storedvalue.StoredValueStatus> r3 = com.moovit.ticketing.storedvalue.StoredValueStatus.CODER
                java.lang.Object r3 = r12.mo51962q(r3)
                r8 = r3
                com.moovit.ticketing.storedvalue.StoredValueStatus r8 = (com.moovit.ticketing.storedvalue.StoredValueStatus) r8
                if (r13 < r1) goto L_0x003a
                boolean r3 = r12.mo51919b()
                if (r3 == 0) goto L_0x003a
                r9 = 1
                goto L_0x003c
            L_0x003a:
                r3 = 0
                r9 = 0
            L_0x003c:
                if (r13 < r1) goto L_0x0045
                java.lang.Object r12 = r12.mo51962q(r0)
                r2 = r12
                com.moovit.util.CurrencyAmount r2 = (com.moovit.util.CurrencyAmount) r2
            L_0x0045:
                r10 = r2
                h90.a r12 = new h90.a
                r4 = r12
                r4.<init>(r5, r6, r7, r8, r9, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: s90.C13083h.C13086c.mo178b(sz.p, int):java.lang.Object");
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C12739a aVar = (C12739a) obj;
            ServerId serverId = aVar.f31467a;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            TicketAgency ticketAgency = aVar.f31468b;
            TicketAgency.C7744b bVar = TicketAgency.f23494g;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(ticketAgency, qVar);
            CurrencyAmount currencyAmount = aVar.f31469c;
            CurrencyAmount.C7881b bVar2 = CurrencyAmount.f23843f;
            qVar.mo51967q(currencyAmount, bVar2);
            qVar.mo51967q(aVar.f31470d, StoredValueStatus.CODER);
            qVar.mo51934b(aVar.f31471e);
            qVar.mo51967q(aVar.f31472f, bVar2);
        }
    }

    static {
        C13084a aVar = new C13084a();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(C12850a.class, new C20944i0(1, aVar));
        hashMap2.put(1, aVar);
        f32369a = new C19617r(hashMap, hashMap2);
    }
}

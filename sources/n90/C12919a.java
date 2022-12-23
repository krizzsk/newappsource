package n90;

import ce0.C21100e;
import com.moovit.ticketing.ticket.TicketId;
import java.io.IOException;
import m90.C12890b;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: n90.a */
public final class C12919a extends C12890b {

    /* renamed from: e */
    public static final C12920a f31982e = new C12920a();

    /* renamed from: d */
    public final String f31983d;

    /* renamed from: n90.a$a */
    public class C12920a extends C19619s<C12919a> {
        public C12920a() {
            super(0, C12919a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            TicketId.C7749b bVar = TicketId.f23510f;
            pVar.getClass();
            return new C12919a((TicketId) bVar.read(pVar), pVar.mo51925m(), pVar.mo51948t(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C12919a aVar = (C12919a) obj;
            TicketId ticketId = aVar.f31901a;
            TicketId.C7749b bVar = TicketId.f23510f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(ticketId, qVar);
            qVar.mo51940m(aVar.f31902b);
            qVar.mo51955t(aVar.f31903c);
            qVar.mo51954p(aVar.f31983d);
        }
    }

    public C12919a(TicketId ticketId, long j, String str, String str2) {
        super(ticketId, j, str);
        C21100e.m49373x(str2, "html");
        this.f31983d = str2;
    }

    /* renamed from: a */
    public final <R, E extends Exception> R mo24270a(C12890b.C12891a<R, E> aVar) throws Exception {
        return aVar.mo39743e(this);
    }
}

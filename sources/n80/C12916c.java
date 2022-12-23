package n80;

import ce0.C21100e;
import com.moovit.ticketing.ticket.Ticket;

/* renamed from: n80.c */
public abstract class C12916c {

    /* renamed from: a */
    public final Ticket f31981a;

    /* renamed from: n80.c$a */
    public interface C12917a<R, E extends Exception> {
        /* renamed from: i */
        R mo39784i(C12918d dVar) throws Exception;

        /* renamed from: l */
        R mo39785l(C12915b bVar) throws Exception;
    }

    public C12916c(Ticket ticket) {
        C21100e.m49373x(ticket, "ticket");
        this.f31981a = ticket;
    }

    /* renamed from: a */
    public abstract <R, E extends Exception> R mo39783a(C12917a<R, E> aVar) throws Exception;
}

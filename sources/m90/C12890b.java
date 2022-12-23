package m90;

import ce0.C21100e;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.validation.receipt.media.C7772a;
import n90.C12919a;
import o90.C12957a;
import q90.C13040a;
import r90.C13049a;

/* renamed from: m90.b */
public abstract class C12890b {

    /* renamed from: a */
    public final TicketId f31901a;

    /* renamed from: b */
    public final long f31902b;

    /* renamed from: c */
    public final String f31903c;

    /* renamed from: m90.b$a */
    public interface C12891a<R, E extends Exception> {
        /* renamed from: a */
        R mo39739a(C7772a aVar) throws Exception;

        /* renamed from: b */
        R mo39740b(C13040a aVar) throws Exception;

        /* renamed from: c */
        R mo39741c(C12957a aVar) throws Exception;

        /* renamed from: d */
        R mo39742d(C13049a aVar) throws Exception;

        /* renamed from: e */
        R mo39743e(C12919a aVar) throws Exception;
    }

    public C12890b(TicketId ticketId, long j, String str) {
        C21100e.m49373x(ticketId, "ticketId");
        this.f31901a = ticketId;
        this.f31902b = j;
        this.f31903c = str;
    }

    /* renamed from: a */
    public abstract <R, E extends Exception> R mo24270a(C12891a<R, E> aVar) throws Exception;
}

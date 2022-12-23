package p732pq;

import c00.C13722f;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.network.model.ServerId;
import com.moovit.payment.confirmation.summary.PaymentSummarySecondaryAction;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import m90.C12892c;

/* renamed from: pq.i */
public final /* synthetic */ class C18948i implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f48245b;

    /* renamed from: c */
    public final /* synthetic */ Object f48246c;

    public /* synthetic */ C18948i(Object obj, int i) {
        this.f48245b = i;
        this.f48246c = obj;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        boolean containsKey;
        boolean z;
        switch (this.f48245b) {
            case 0:
                C18951l lVar = (C18951l) this.f48246c;
                lVar.getClass();
                TransitAgency c = C7843b.m17876c((TransitLine) obj);
                if (c == null || !lVar.f48253t.contains(c.f23672b)) {
                    z = false;
                } else {
                    z = true;
                }
                return !z;
            case 1:
                return ((MicroMobilityRide) obj).f14986d.equals((ServerId) this.f48246c);
            case 2:
                return ((PaymentSummarySecondaryAction) obj).equals((PaymentSummarySecondaryAction) this.f48246c);
            case 3:
                return ((TicketAgency) this.f48246c).equals(((Ticket) obj).f23478g);
            default:
                C12892c cVar = (C12892c) this.f48246c;
                TicketId ticketId = (TicketId) obj;
                synchronized (cVar) {
                    cVar.mo51038c();
                    containsKey = cVar.f47526g.containsKey(cVar.mo39749j(ticketId));
                }
                return !containsKey;
        }
    }
}

package p572iw;

import c00.C13722f;
import com.moovit.micromobility.purchase.error.MicroMobilityError;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import java.util.Set;
import p705on.C18805l;

/* renamed from: iw.d */
public final /* synthetic */ class C17661d implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f45388b;

    /* renamed from: c */
    public final /* synthetic */ Object f45389c;

    public /* synthetic */ C17661d(Object obj, int i) {
        this.f45388b = i;
        this.f45389c = obj;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f45388b) {
            case 0:
                int i = C17663f.f45392x;
                return ((Set) this.f45389c).contains(((TripPlannerTransportTypeInfo) obj).f23802b);
            case 1:
                return ((MicroMobilityError) obj).name().equals((String) this.f45389c);
            case 2:
                return ((Integer) this.f45389c).equals(((C18805l) obj).f47901d);
            default:
                return ((ServerId) this.f45389c).equals(((Ticket) obj).f23473b.f23511b);
        }
    }
}

package p732pq;

import b40.C1476d;
import c00.C13722f;
import c00.C13723g;
import com.moovit.app.carpool.CarpoolTripPlanActivity;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.network.model.LongServerId;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TripId;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import com.moovit.util.time.TimeFrequency;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import p547hu.C17496e;
import p589jq.C17910b;
import p977zz.C20975x0;
import s90.C13076d;

/* renamed from: pq.j */
public final /* synthetic */ class C18949j implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f48247b;

    /* renamed from: c */
    public final /* synthetic */ Object f48248c;

    public /* synthetic */ C18949j(Object obj, int i) {
        this.f48247b = i;
        this.f48248c = obj;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f48247b) {
            case 0:
                if (((TransitStop) this.f48248c).mo24410b(((TransitLine) obj).f23687c) != null) {
                    return true;
                }
                return false;
            case 1:
                C17910b bVar = CarpoolTripPlanActivity.f37678q0;
                return C20975x0.m49118e((List) this.f48248c, C13723g.m34282c(((Itinerary) obj).mo48295u0(), CarpoolTripPlanActivity.f37678q0));
            case 2:
                Time time = (Time) this.f48248c;
                TimeFrequency timeFrequency = (TimeFrequency) obj;
                int i = C17496e.f45040j;
                if (C7925b.m18027o(((Long) timeFrequency.f23915b.f52695a).longValue(), time.mo24631g()) || C7925b.m18027o(((Long) timeFrequency.f23915b.f52696b).longValue(), time.mo24631g())) {
                    return true;
                }
                return false;
            case 3:
                return ((LongServerId) this.f48248c).equals(((TripId) obj).f23764b);
            case 4:
                Set<MicroMobilityRide.Status> set = C1476d.f5360c;
                return ((MicroMobilityRide) obj).f14986d.equals((ServerId) this.f48248c);
            case 5:
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                return ((Ticket) this.f48248c).f23474c.equals(((TicketId) obj).f23513d);
            default:
                Set<Ticket.Status> set2 = C13076d.f32344g;
                return ((Ticket) obj).f23473b.equals((TicketId) this.f48248c);
        }
    }
}

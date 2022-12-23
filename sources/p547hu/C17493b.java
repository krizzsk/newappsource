package p547hu;

import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TripId;
import com.moovit.util.time.Time;
import p583jk.C17884p;
import p977zz.C20975x0;

/* renamed from: hu.b */
public final class C17493b implements Comparable<C17493b> {

    /* renamed from: b */
    public final TransitLine f45030b;

    /* renamed from: c */
    public final TripId f45031c;

    /* renamed from: d */
    public final ServerId f45032d;

    /* renamed from: e */
    public final Time f45033e;

    /* renamed from: f */
    public final Time f45034f;

    public C17493b(TransitLine transitLine, TripId tripId, ServerId serverId, Time time, Time time2) {
        this.f45030b = transitLine;
        C21100e.m49373x(tripId, "tripId");
        this.f45031c = tripId;
        C21100e.m49373x(serverId, "patternId");
        this.f45032d = serverId;
        C21100e.m49373x(time, "departureTime");
        this.f45033e = time;
        this.f45034f = time2;
    }

    public final int compareTo(Object obj) {
        return this.f45033e.compareTo(((C17493b) obj).f45033e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17493b)) {
            return false;
        }
        C17493b bVar = (C17493b) obj;
        if (!this.f45030b.equals(bVar.f45030b) || !this.f45031c.equals(bVar.f45031c) || !this.f45032d.equals(bVar.f45032d) || !this.f45033e.equals(bVar.f45033e) || !C20975x0.m49118e(this.f45034f, bVar.f45034f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f45030b), C17884p.m44335F(this.f45031c), C17884p.m44335F(this.f45032d), C17884p.m44335F(this.f45033e), C17884p.m44335F(this.f45034f));
    }
}

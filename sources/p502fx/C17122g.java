package p502fx;

import android.location.Location;
import ce0.C21100e;
import com.moovit.app.tod.model.TodJourneyStatus;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.util.time.C7925b;
import p330z2.C7442r;
import p821tm.C19694a;

/* renamed from: fx.g */
public final class C17122g {

    /* renamed from: a */
    public final String f44313a;

    /* renamed from: b */
    public final TodRideStatus f44314b;

    /* renamed from: c */
    public final TodJourneyStatus f44315c;

    /* renamed from: d */
    public final Location f44316d;

    /* renamed from: e */
    public final long f44317e;

    /* renamed from: f */
    public final long f44318f;

    /* renamed from: g */
    public final C17123h f44319g;

    /* renamed from: h */
    public final C17117b f44320h;

    /* renamed from: i */
    public final C7442r f44321i;

    /* renamed from: j */
    public final boolean f44322j;

    /* renamed from: k */
    public final C19694a f44323k;

    /* renamed from: l */
    public final TodRide f44324l;

    public C17122g(String str, TodRideStatus todRideStatus, TodJourneyStatus todJourneyStatus, Location location, long j, long j2, C17123h hVar, C17117b bVar, C7442r rVar, boolean z, C19694a aVar, TodRide todRide) {
        C21100e.m49373x(str, "rideId");
        this.f44313a = str;
        C21100e.m49373x(todRideStatus, "rideStatus");
        this.f44314b = todRideStatus;
        C21100e.m49373x(todJourneyStatus, "journeyStatus");
        this.f44315c = todJourneyStatus;
        this.f44316d = location;
        this.f44317e = j;
        this.f44318f = j2;
        this.f44319g = hVar;
        this.f44320h = bVar;
        this.f44321i = rVar;
        this.f44322j = z;
        this.f44323k = aVar;
        this.f44324l = todRide;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodRideRealTimeInfo{rideId=");
        k.append(this.f44313a);
        k.append(", pickupTime=");
        k.append(C7925b.m18013a(this.f44317e));
        k.append(", dropOffTime=");
        k.append(C7925b.m18013a(this.f44318f));
        k.append(", rideStatus=");
        k.append(this.f44314b);
        k.append(", journeyStatus=");
        k.append(this.f44315c);
        k.append(", location=");
        k.append(this.f44316d);
        k.append(", route=");
        k.append(this.f44319g);
        k.append(", requiredPassengerAction=");
        k.append(this.f44320h);
        k.append(", vehicleRealTimeInfo=");
        k.append(this.f44321i);
        k.append(", destinationChangeAllowed=");
        k.append(this.f44322j);
        k.append(", requiredPassengerScreen=");
        k.append(this.f44323k);
        k.append(", requiredPassengerScreen=");
        k.append(this.f44324l);
        k.append('}');
        return k.toString();
    }
}

package u90;

import c00.C13721e;
import com.moovit.database.DbEntityRef;
import com.moovit.transit.TripId;
import com.moovit.util.time.Time;
import com.moovit.util.time.TimeFrequency;
import com.moovit.util.time.TimeVehicleAttributes;
import com.moovit.util.time.TimeVehicleLocation;
import p977zz.C20944i0;

/* renamed from: u90.d */
public final /* synthetic */ class C13141d implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f32636b;

    /* renamed from: c */
    public final /* synthetic */ TripId f32637c;

    /* renamed from: d */
    public final /* synthetic */ DbEntityRef f32638d;

    /* renamed from: e */
    public final /* synthetic */ DbEntityRef f32639e;

    /* renamed from: f */
    public final /* synthetic */ TimeFrequency f32640f;

    /* renamed from: g */
    public final /* synthetic */ boolean f32641g;

    public /* synthetic */ C13141d(int i, TripId tripId, DbEntityRef dbEntityRef, DbEntityRef dbEntityRef2, TimeFrequency timeFrequency, boolean z) {
        this.f32636b = i;
        this.f32637c = tripId;
        this.f32638d = dbEntityRef;
        this.f32639e = dbEntityRef2;
        this.f32640f = timeFrequency;
        this.f32641g = z;
    }

    public final Object convert(Object obj) {
        int i;
        int i2 = this.f32636b;
        TripId tripId = this.f32637c;
        DbEntityRef dbEntityRef = this.f32638d;
        DbEntityRef dbEntityRef2 = this.f32639e;
        TimeFrequency timeFrequency = this.f32640f;
        boolean z = this.f32641g;
        C20944i0 i0Var = (C20944i0) obj;
        long longValue = ((Long) i0Var.f52692a).longValue();
        int intValue = ((Integer) i0Var.f52693b).intValue();
        if (intValue < i2 - 1) {
            i = 5;
        } else {
            i = 4;
        }
        if (intValue > 0) {
            i |= 2;
        }
        return new Time(longValue, -1, i, tripId.f23764b, dbEntityRef, ((Integer) i0Var.f52693b).intValue(), dbEntityRef2.getServerId(), timeFrequency, (String) null, Time.Status.UNKNOWN, z, (TimeVehicleLocation) null, (TimeVehicleAttributes) null);
    }
}

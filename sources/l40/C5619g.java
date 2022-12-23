package l40;

import b00.C13557b;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerTime;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l40.C5599a;

/* renamed from: l40.g */
public final class C5619g extends C13557b<C5599a.C5600a, Void, List<Object>> {

    /* renamed from: b */
    public final C5618f f18354b;

    /* renamed from: c */
    public final TripPlannerLocations f18355c;

    /* renamed from: d */
    public final TripPlannerTime f18356d;

    public C5619g(C5618f fVar, TripPlannerLocations tripPlannerLocations, TripPlannerTime tripPlannerTime) {
        C21100e.m49373x(fVar, "tripPlanner");
        this.f18354b = fVar;
        C21100e.m49373x(tripPlannerLocations, "locations");
        this.f18355c = tripPlannerLocations;
        C21100e.m49373x(tripPlannerTime, "time");
        this.f18356d = tripPlannerTime;
        C21100e.m49365t(3, "maxResults");
    }

    /* renamed from: a */
    public static ServerId m13873a(LocationDescriptor locationDescriptor) {
        if (locationDescriptor == null) {
            throw new IllegalStateException("Descriptor may not be null");
        } else if (LocationDescriptor.LocationType.STOP.equals(locationDescriptor.f23647b)) {
            ServerId serverId = locationDescriptor.f23649d;
            if (serverId != null) {
                return serverId;
            }
            throw new IllegalStateException("Descriptor stop id may not be null");
        } else {
            throw new IllegalStateException("Only 'Stop' location descriptor type supported");
        }
    }

    public final Object doInBackground(Object[] objArr) {
        C5599a.C5600a[] aVarArr = (C5599a.C5600a[]) objArr;
        if (aVarArr.length > 0) {
            C5599a.C5600a aVar = aVarArr[0];
        }
        C5618f fVar = this.f18354b;
        m13873a(this.f18355c.f23786b);
        m13873a(this.f18355c.f23787c);
        if (TripPlannerTime.Type.DEPART.equals(this.f18356d.f23799b)) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(this.f18356d.mo24487b());
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            TimeUnit.MILLISECONDS.toSeconds(this.f18356d.mo24487b() - instance.getTimeInMillis());
            fVar.getClass();
            throw new UnsupportedOperationException("Unsupported operation, did you compile 'tripplanner' flavor?");
        }
        throw new IllegalStateException("Offline trip planner support only departure time");
    }
}

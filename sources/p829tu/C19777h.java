package p829tu;

import android.location.Location;
import android.util.SparseBooleanArray;
import c00.C13722f;
import com.moovit.app.stopdetail.C15338a;
import com.moovit.commons.geo.Geofence;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.items.MapItem;
import com.moovit.transit.TransitLine;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import java.util.Set;
import p572iw.C17666h;
import p705on.C18805l;

/* renamed from: tu.h */
public final /* synthetic */ class C19777h implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f50274b;

    /* renamed from: c */
    public final /* synthetic */ Object f50275c;

    public /* synthetic */ C19777h(Object obj, int i) {
        this.f50274b = i;
        this.f50275c = obj;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f50274b) {
            case 0:
                Geofence geofence = (Geofence) this.f50275c;
                LatLonE6 latLonE6 = ((MapItem) obj).f42551d;
                geofence.getClass();
                if (latLonE6.mo46929u((Location) null).distanceTo(geofence.f40974b.mo46929u((Location) null)) <= geofence.f40975c) {
                    return true;
                }
                return false;
            case 1:
                return ((C15338a) this.f50275c).f39642l.f39731g.mo49441p(((TransitLine) obj).mo24369b().f23694b);
            case 2:
                int i = C17666h.f45402O;
                return ((Set) this.f50275c).contains(((TripPlannerTransportTypeInfo) obj).f23802b);
            case 3:
                return ((String) this.f50275c).equals(((C18805l) obj).f47899b);
            default:
                return ((SparseBooleanArray) this.f50275c).get(((Integer) obj).intValue());
        }
    }
}

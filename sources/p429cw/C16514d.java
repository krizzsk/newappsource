package p429cw;

import bf0.C21050d;
import com.moovit.app.stoparrivals.C15322a;
import com.moovit.app.stoparrivals.TripsUpdateResult;
import com.moovit.map.MapFragment;
import com.moovit.util.time.TimeVehicleLocation;
import java.util.Map;
import mf0.C24362h;

/* renamed from: cw.d */
public final /* synthetic */ class C16514d implements MapFragment.C16238s {

    /* renamed from: b */
    public final /* synthetic */ C16515e f43114b;

    public /* synthetic */ C16514d(C16515e eVar) {
        this.f43114b = eVar;
    }

    /* renamed from: L0 */
    public final void mo23897L0(MapFragment mapFragment, Object obj) {
        Map<String, Integer> map;
        Integer num;
        C16515e eVar = this.f43114b;
        C24362h.m61211f(eVar, "this$0");
        C24362h.m61211f(mapFragment, "<anonymous parameter 0>");
        if (obj instanceof TimeVehicleLocation) {
            C15322a aVar = eVar.f43117c;
            C24362h.m61210e(obj, "source");
            TimeVehicleLocation timeVehicleLocation = (TimeVehicleLocation) obj;
            aVar.getClass();
            TripsUpdateResult tripsUpdateResult = (TripsUpdateResult) aVar.f39636h.getValue();
            if (tripsUpdateResult != null && (map = tripsUpdateResult.f39630e) != null && (num = map.get(timeVehicleLocation.f23924b)) != null) {
                aVar.mo45886d(num.intValue(), "vehicle_selection");
                C21050d dVar = C21050d.f52856a;
            }
        }
    }
}

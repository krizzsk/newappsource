package p429cw;

import android.content.Context;
import android.graphics.Rect;
import com.moovit.app.stoparrivals.C15322a;
import com.moovit.app.stoparrivals.StopArrival;
import com.moovit.app.stoparrivals.StopArrivalsActivity;
import com.moovit.app.stoparrivals.TripsSelectionUpdate;
import com.moovit.app.stoparrivals.TripsUpdateResult;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.utils.Color;
import com.moovit.map.C16281i;
import com.moovit.map.LineStyle;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitPatternShape;
import com.moovit.util.time.Time;
import com.moovit.util.time.TimeVehicleLocation;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Triple;
import mf0.C24362h;
import o20.C18699e;
import o20.C18711q;
import p090g1.C4732a;
import p762qz.C19207c;

/* renamed from: cw.e */
public final class C16515e {

    /* renamed from: a */
    public final Context f43115a;

    /* renamed from: b */
    public final MapFragment f43116b;

    /* renamed from: c */
    public final C15322a f43117c;

    /* renamed from: d */
    public final Rect f43118d;

    /* renamed from: e */
    public Object f43119e;

    /* renamed from: f */
    public final C18711q f43120f;

    /* renamed from: g */
    public Pair<ServerId, ? extends Object> f43121g;

    /* renamed from: h */
    public final LinkedHashMap f43122h = new LinkedHashMap();

    /* renamed from: i */
    public final ArrayList f43123i = new ArrayList();

    /* renamed from: j */
    public final LinkedHashMap f43124j = new LinkedHashMap();

    /* renamed from: k */
    public final C18711q f43125k;

    /* renamed from: l */
    public final C18711q f43126l;

    /* renamed from: m */
    public final C19207c.C19208a f43127m;

    public C16515e(StopArrivalsActivity stopArrivalsActivity, MapFragment mapFragment, C15322a aVar, Rect rect) {
        C24362h.m61211f(stopArrivalsActivity, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(aVar, "viewModel");
        C24362h.m61211f(rect, "extraPadding");
        this.f43115a = stopArrivalsActivity;
        this.f43116b = mapFragment;
        this.f43117c = aVar;
        this.f43118d = rect;
        C18711q K2 = mapFragment.mo48614K2(102);
        C24362h.m61210e(K2, "mapFragment.createItemLayer(102)");
        this.f43120f = K2;
        C18711q K22 = mapFragment.mo48614K2(100);
        C24362h.m61210e(K22, "mapFragment.createItemLayer(100)");
        this.f43125k = K22;
        C18711q K23 = mapFragment.mo48614K2(101);
        C24362h.m61210e(K23, "mapFragment.createItemLayer(101)");
        this.f43126l = K23;
        this.f43127m = new C19207c.C19208a();
        mapFragment.mo48658u2(new C16514d(this));
    }

    /* renamed from: a */
    public static final void m41998a(C16515e eVar, StopArrival stopArrival, ServerId serverId) {
        TripsUpdateResult tripsUpdateResult;
        Map<ServerId, TransitPatternShape> map;
        TransitPatternShape transitPatternShape;
        Polyline c;
        if (!eVar.f43122h.containsKey(serverId) && (tripsUpdateResult = (TripsUpdateResult) eVar.f43117c.f39636h.getValue()) != null && (map = tripsUpdateResult.f39629d) != null && (transitPatternShape = map.get(serverId)) != null && (c = transitPatternShape.mo24396c(0, stopArrival.f39600c.f23906g)) != null) {
            Context context = eVar.f43115a;
            LineStyle o = C16281i.m41519o(context, new Color(C4732a.getColor(context, R.color.stop_arrivals_surface_route)));
            LinkedHashMap linkedHashMap = eVar.f43122h;
            Object w2 = eVar.f43116b.mo48662w2(c, o);
            C24362h.m61210e(w2, "mapFragment.addPolyline(polyline, lineStyle)");
            linkedHashMap.put(serverId, w2);
        }
    }

    /* renamed from: b */
    public final void mo49302b(StopArrival stopArrival) {
        Polyline polyline;
        C24362h.m61211f(stopArrival, "stopArrival");
        TripsUpdateResult tripsUpdateResult = (TripsUpdateResult) this.f43117c.f39636h.getValue();
        if (tripsUpdateResult != null) {
            Time time = stopArrival.f39600c;
            TimeVehicleLocation timeVehicleLocation = time.f23912m;
            if (timeVehicleLocation == null) {
                TransitPatternShape transitPatternShape = tripsUpdateResult.f39629d.get(time.f23907h);
                if (transitPatternShape != null) {
                    polyline = transitPatternShape.mo24396c(0, stopArrival.f39600c.f23906g);
                } else {
                    polyline = null;
                }
                if (polyline != null) {
                    this.f43116b.mo48606B2(this.f43118d, polyline.getBounds(), false);
                    return;
                }
                return;
            }
            this.f43116b.mo48606B2(this.f43118d, BoxE6.m40164c(timeVehicleLocation.f23926d, tripsUpdateResult.f39627b.f23732d), false);
        }
    }

    /* renamed from: c */
    public final void mo49303c(StopArrival stopArrival, TimeVehicleLocation timeVehicleLocation) {
        String str;
        C18711q qVar;
        C18699e eVar;
        MarkerZoomStyle markerZoomStyle;
        MarkerZoomStyle markerZoomStyle2;
        StopArrival stopArrival2;
        Time time;
        TimeVehicleLocation timeVehicleLocation2;
        TripsSelectionUpdate tripsSelectionUpdate = (TripsSelectionUpdate) this.f43117c.f39638j.getValue();
        if (tripsSelectionUpdate == null || (stopArrival2 = tripsSelectionUpdate.f39625d) == null || (time = stopArrival2.f39600c) == null || (timeVehicleLocation2 = time.f23912m) == null) {
            str = null;
        } else {
            str = timeVehicleLocation2.f23924b;
        }
        if (C24362h.m61206a(timeVehicleLocation.f23924b, str)) {
            qVar = this.f43126l;
        } else {
            qVar = this.f43125k;
        }
        if (C24362h.m61206a(timeVehicleLocation.f23924b, str)) {
            long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - timeVehicleLocation.f23925c);
            if (minutes < 2) {
                markerZoomStyle2 = C16281i.m41517m(0, this.f43115a, stopArrival.f39599b.mo24369b());
            } else if (minutes < 5) {
                markerZoomStyle2 = C16281i.m41517m(R.attr.colorProblem, this.f43115a, stopArrival.f39599b.mo24369b());
            } else {
                markerZoomStyle2 = C16281i.m41517m(R.attr.colorCritical, this.f43115a, stopArrival.f39599b.mo24369b());
            }
            eVar = new C18699e(markerZoomStyle2);
        } else {
            long minutes2 = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - timeVehicleLocation.f23925c);
            if (minutes2 < 2) {
                markerZoomStyle = C16281i.m41520p(0, this.f43115a, stopArrival.f39599b.mo24369b());
            } else if (minutes2 < 5) {
                markerZoomStyle = C16281i.m41520p(R.attr.colorProblem, this.f43115a, stopArrival.f39599b.mo24369b());
            } else {
                markerZoomStyle = C16281i.m41520p(R.attr.colorCritical, this.f43115a, stopArrival.f39599b.mo24369b());
            }
            eVar = new C18699e(markerZoomStyle);
        }
        Object q2 = this.f43116b.mo48650q2(timeVehicleLocation.f23926d, timeVehicleLocation, eVar, qVar);
        LinkedHashMap linkedHashMap = this.f43124j;
        String str2 = timeVehicleLocation.f23924b;
        C24362h.m61210e(str2, "vehicle.vehicleId");
        linkedHashMap.put(str2, new Triple(timeVehicleLocation, qVar, q2));
    }

    /* renamed from: d */
    public final Triple<TimeVehicleLocation, C18711q, Object> mo49304d(String str) {
        Triple<TimeVehicleLocation, C18711q, Object> triple = (Triple) this.f43124j.remove(str);
        if (triple == null) {
            return null;
        }
        Object c = triple.mo59084c();
        this.f43116b.mo48637h3(c, triple.mo59083b());
        return triple;
    }
}

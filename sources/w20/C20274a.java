package w20;

import android.graphics.Rect;
import com.moovit.commons.geo.Polyline;
import com.moovit.map.MapFragment;
import com.moovit.map.walking.MapWalkingDirectionsActivity;

/* renamed from: w20.a */
public final /* synthetic */ class C20274a implements MapFragment.C16238s {

    /* renamed from: b */
    public final /* synthetic */ MapWalkingDirectionsActivity f51408b;

    public /* synthetic */ C20274a(MapWalkingDirectionsActivity mapWalkingDirectionsActivity) {
        this.f51408b = mapWalkingDirectionsActivity;
    }

    /* renamed from: L0 */
    public final void mo23897L0(MapFragment mapFragment, Object obj) {
        MapWalkingDirectionsActivity mapWalkingDirectionsActivity = this.f51408b;
        int i = MapWalkingDirectionsActivity.f42571p0;
        Polyline polyline = mapWalkingDirectionsActivity.f42578n0;
        if (polyline != null) {
            mapFragment.mo48606B2((Rect) null, polyline.getBounds(), true);
        } else {
            mapFragment.mo48664z2(mapWalkingDirectionsActivity.f42575Z.mo24310d(), 17.5f);
        }
    }
}

package p453dw;

import android.graphics.Rect;
import com.moovit.app.stopdetail.StopDetailMapActivity;
import com.moovit.commons.geo.Polyline;
import com.moovit.map.C16281i;
import com.moovit.map.MapFragment;

/* renamed from: dw.k */
public final /* synthetic */ class C16735k implements MapFragment.C16238s {

    /* renamed from: b */
    public final /* synthetic */ StopDetailMapActivity f43583b;

    /* renamed from: c */
    public final /* synthetic */ C16281i.C16282a f43584c;

    public /* synthetic */ C16735k(StopDetailMapActivity stopDetailMapActivity, C16281i.C16282a aVar) {
        this.f43583b = stopDetailMapActivity;
        this.f43584c = aVar;
    }

    /* renamed from: L0 */
    public final void mo23897L0(MapFragment mapFragment, Object obj) {
        StopDetailMapActivity stopDetailMapActivity = this.f43583b;
        C16281i.C16282a aVar = this.f43584c;
        int i = StopDetailMapActivity.f39676s0;
        stopDetailMapActivity.getClass();
        aVar.getClass();
        if (C16281i.C16282a.m41524g(obj) == null) {
            Polyline polyline = stopDetailMapActivity.f39679Y;
            if (polyline != null) {
                mapFragment.mo48606B2((Rect) null, polyline.getBounds(), true);
            } else {
                mapFragment.mo48664z2(stopDetailMapActivity.f39677U.f23732d, 17.5f);
            }
        }
    }
}

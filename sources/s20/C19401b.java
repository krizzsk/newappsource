package s20;

import android.graphics.PointF;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.moovit.map.C16254b;
import com.moovit.map.C16273d;
import o20.C18694a;
import s20.C19402c;
import v10.C20065a;

/* renamed from: s20.b */
public final class C19401b extends C19400a<C19401b, GroundOverlay, C16254b, C18694a, C19402c, C19402c.C19403a> {
    /* renamed from: a */
    public final Object mo51808a(GoogleMap googleMap, C19417l lVar, C16273d dVar, int i) {
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        C18694a.C18695a aVar = (C18694a.C18695a) ((C18694a) ((C19402c.C19403a) lVar).f49422a).f47613b;
        groundOverlayOptions.position(C19408h.m46736I(aVar.f47596a), aVar.f47597b, aVar.f47598c);
        groundOverlayOptions.bearing(aVar.f47599d);
        C20065a aVar2 = ((C16254b) dVar).f42466b;
        groundOverlayOptions.image(BitmapDescriptorFactory.fromBitmap(aVar2.f50909a));
        PointF pointF = aVar2.f50910b;
        groundOverlayOptions.anchor(pointF.x, pointF.y);
        return googleMap.addGroundOverlay(groundOverlayOptions);
    }

    /* renamed from: b */
    public final C19406f mo51809b(int i) {
        return new C19402c(this, i);
    }

    /* renamed from: e */
    public final void mo51810e(Object obj) {
        ((GroundOverlay) obj).remove();
    }

    /* renamed from: g */
    public final void mo51811g(Object obj, C19417l lVar) {
        ((GroundOverlay) obj).setTag((C19402c.C19403a) lVar);
    }
}

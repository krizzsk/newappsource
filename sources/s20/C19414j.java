package s20;

import android.graphics.PointF;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.moovit.image.model.Image;
import com.moovit.map.C16273d;
import com.moovit.map.MarkerZoomStyle;
import o20.C18713s;
import p435de.C16596f;
import s20.C19415k;
import v10.C20065a;

/* renamed from: s20.j */
public final class C19414j extends C19400a<C19414j, Marker, MarkerZoomStyle, C18713s, C19415k, C19415k.C19416a> {

    /* renamed from: e */
    public static final PointF f49420e = new PointF(0.5f, 1.0f);

    /* renamed from: a */
    public final Object mo51808a(GoogleMap googleMap, C19417l lVar, C16273d dVar, int i) {
        C19415k.C19416a aVar = (C19415k.C19416a) lVar;
        MarkerZoomStyle markerZoomStyle = (MarkerZoomStyle) dVar;
        Image image = markerZoomStyle.f42448b;
        C20065a aVar2 = markerZoomStyle.f42450d;
        PointF pointF = aVar2.f50910b;
        if (pointF == null) {
            StringBuilder k = C13555b.m33972k("The anchor for marker style icons must be non-null (image ");
            k.append(markerZoomStyle.f42448b);
            k.append(")");
            C16596f.m42113a().mo49364c(new IllegalArgumentException(k.toString()));
            pointF = f49420e;
        }
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(C19408h.m46736I(aVar.f49421d));
        markerOptions.rotation(((C18713s) aVar.f49422a).f47625d);
        BitmapDescriptor bitmapDescriptor = this.f49356d.get(image);
        if (bitmapDescriptor == null) {
            bitmapDescriptor = BitmapDescriptorFactory.fromBitmap(aVar2.f50909a);
            this.f49356d.put(image, bitmapDescriptor);
        }
        markerOptions.icon(bitmapDescriptor);
        markerOptions.anchor(pointF.x, pointF.y);
        markerOptions.alpha(((float) markerZoomStyle.f42451e) / 255.0f);
        int i2 = markerZoomStyle.f42453g;
        boolean z = true;
        if (i2 == 1) {
            z = false;
        } else if (i2 != 2) {
            throw new IllegalStateException(C16759e.m42349e("Unknown orientation=", i2));
        }
        markerOptions.flat(z);
        markerOptions.draggable(false);
        markerOptions.zIndex((float) i);
        return googleMap.addMarker(markerOptions);
    }

    /* renamed from: b */
    public final C19406f mo51809b(int i) {
        return new C19415k(this, i);
    }

    /* renamed from: e */
    public final void mo51810e(Object obj) {
        ((Marker) obj).remove();
    }

    /* renamed from: g */
    public final void mo51811g(Object obj, C19417l lVar) {
        ((Marker) obj).setTag((C19415k.C19416a) lVar);
    }
}

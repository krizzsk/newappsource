package s20;

import c00.C13720d;
import c00.C13722f;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.moovit.map.C16273d;
import com.moovit.map.LineStyle;
import o20.C18715u;
import s20.C19423q;

/* renamed from: s20.p */
public final class C19422p extends C19400a<C19422p, Polyline, LineStyle, C18715u, C19423q, C19423q.C19424a> {
    /* renamed from: a */
    public final Object mo51808a(GoogleMap googleMap, C19417l lVar, C16273d dVar, int i) {
        LineStyle lineStyle = (LineStyle) dVar;
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.addAll(C13720d.m34273c((com.moovit.commons.geo.Polyline) ((C18715u) ((C19423q.C19424a) lVar).f49422a).f47613b, (C13722f) null, C19408h.f49368N));
        polylineOptions.clickable(false);
        polylineOptions.zIndex((float) i);
        polylineOptions.width(lineStyle.f42327c);
        polylineOptions.color(lineStyle.f42326b.f41007b);
        polylineOptions.geodesic(false);
        return googleMap.addPolyline(polylineOptions);
    }

    /* renamed from: b */
    public final C19406f mo51809b(int i) {
        return new C19423q(this, i);
    }

    /* renamed from: e */
    public final void mo51810e(Object obj) {
        ((Polyline) obj).remove();
    }

    /* renamed from: g */
    public final void mo51811g(Object obj, C19417l lVar) {
        ((Polyline) obj).setTag((C19423q.C19424a) lVar);
    }
}

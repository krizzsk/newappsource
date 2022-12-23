package s20;

import c00.C13720d;
import c00.C13722f;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.moovit.map.C16273d;
import com.moovit.map.C16286k;
import com.moovit.map.LineStyle;
import java.util.List;
import o20.C18714t;
import s20.C19420o;

/* renamed from: s20.n */
public final class C19419n extends C19418m<C19419n, Polygon, C16286k, C18714t, C19420o, C19420o.C19421a> {
    /* renamed from: a */
    public final Object mo51808a(GoogleMap googleMap, C19417l lVar, C16273d dVar, int i) {
        C19420o.C19421a aVar = (C19420o.C19421a) lVar;
        C16286k kVar = (C16286k) dVar;
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.addAll(C13720d.m34273c((com.moovit.commons.geo.Polygon) ((C18714t) aVar.f49422a).f47613b, (C13722f) null, C19408h.f49368N));
        polygonOptions.fillColor(kVar.f42558b.f41007b);
        LineStyle lineStyle = kVar.f42559c;
        polygonOptions.strokeWidth(lineStyle.f42327c);
        polygonOptions.strokeColor(lineStyle.f42326b.f41007b);
        polygonOptions.clickable(false);
        polygonOptions.zIndex((float) i);
        polygonOptions.geodesic(false);
        List<com.moovit.commons.geo.Polygon> list = ((C18714t) aVar.f49422a).f47626d;
        if (list != null) {
            for (com.moovit.commons.geo.Polygon c : list) {
                polygonOptions.addHole(C13720d.m34273c(c, (C13722f) null, C19408h.f49368N));
            }
        }
        return googleMap.addPolygon(polygonOptions);
    }

    /* renamed from: b */
    public final C19406f mo51809b(int i) {
        return new C19420o(this, i);
    }

    /* renamed from: e */
    public final void mo51810e(Object obj) {
        ((Polygon) obj).remove();
    }

    /* renamed from: g */
    public final void mo51811g(Object obj, C19417l lVar) {
        ((Polygon) obj).setTag((C19420o.C19421a) lVar);
    }
}

package s20;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.VisibleRegion;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.MarkerZoomStyle;
import o20.C18706l;
import o20.C18711q;
import o20.C18713s;
import p584jl.C17885a;

/* renamed from: s20.k */
public final class C19415k extends C19406f<C19414j, Marker, MarkerZoomStyle, C18713s, C19416a> implements C18711q {

    /* renamed from: s20.k$a */
    public static class C19416a extends C19417l<C18713s, Marker, MarkerZoomStyle> {

        /* renamed from: d */
        public LatLonE6 f49421d;

        public C19416a(C18713s sVar) {
            super(sVar);
            this.f49421d = (LatLonE6) sVar.f47613b;
        }
    }

    public C19415k(C19414j jVar, int i) {
        super(jVar, C19416a.class, i);
    }

    /* renamed from: e */
    public final LatLonE6 mo51076e(Object obj) {
        return ((C19416a) mo51817l(obj)).f49421d;
    }

    /* renamed from: g */
    public final void mo51077g(Object obj, LatLonE6 latLonE6) {
        LatLng latLng;
        C19416a aVar = (C19416a) mo51817l(obj);
        aVar.f49421d = latLonE6;
        O o = aVar.f49423b;
        if (o != null) {
            Marker marker = (Marker) o;
            if (latLonE6 == null) {
                latLng = null;
            } else {
                latLng = new LatLng(latLonE6.mo46922k(), latLonE6.mo46926o());
            }
            marker.setPosition(latLng);
        }
    }

    /* renamed from: i */
    public final C19417l mo51812i(C18706l lVar) {
        return new C19416a((C18713s) lVar);
    }

    /* renamed from: j */
    public final boolean mo51813j(VisibleRegion visibleRegion, C19417l lVar) {
        return C17885a.m44442i0(visibleRegion, ((C19416a) lVar).f49421d);
    }
}

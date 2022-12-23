package s20;

import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.VisibleRegion;
import com.moovit.map.C16254b;
import o20.C18694a;
import o20.C18706l;
import p584jl.C17885a;

/* renamed from: s20.c */
public final class C19402c extends C19406f<C19401b, GroundOverlay, C16254b, C18694a, C19403a> {

    /* renamed from: s20.c$a */
    public static class C19403a extends C19417l<C18694a, GroundOverlay, C16254b> {
        public C19403a(C18694a aVar) {
            super(aVar);
        }
    }

    public C19402c(C19401b bVar, int i) {
        super(bVar, C19403a.class, i);
    }

    /* renamed from: i */
    public final C19417l mo51812i(C18706l lVar) {
        return new C19403a((C18694a) lVar);
    }

    /* renamed from: j */
    public final boolean mo51813j(VisibleRegion visibleRegion, C19417l lVar) {
        return C17885a.m44442i0(visibleRegion, ((C18694a.C18695a) ((C18694a) ((C19403a) lVar).f49422a).f47613b).f47596a);
    }
}

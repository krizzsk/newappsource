package s20;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

/* renamed from: s20.e */
public final /* synthetic */ class C19405e implements OnMapReadyCallback {

    /* renamed from: a */
    public final /* synthetic */ C19406f f49358a;

    /* renamed from: b */
    public final /* synthetic */ C19417l f49359b;

    public /* synthetic */ C19405e(C19406f fVar, C19417l lVar) {
        this.f49358a = fVar;
        this.f49359b = lVar;
    }

    public final void onMapReady(GoogleMap googleMap) {
        MEZS b;
        C19406f fVar = this.f49358a;
        C19417l lVar = this.f49359b;
        if (fVar.f49365f == null) {
            fVar.f49365f = googleMap.getProjection().getVisibleRegion();
        }
        if (fVar.mo51813j(fVar.f49365f, lVar) && (b = lVar.f49422a.f47614c.mo51072b(fVar.f49366g)) != null) {
            lVar.f49424c = b;
            GO go = fVar.f49360a;
            O a = go.mo51808a(googleMap, lVar, b, fVar.f49363d);
            go.mo51811g(a, lVar);
            lVar.f49423b = a;
        }
    }
}

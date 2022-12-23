package s20;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

/* renamed from: s20.d */
public final /* synthetic */ class C19404d implements OnMapReadyCallback {

    /* renamed from: a */
    public final /* synthetic */ C19406f f49357a;

    public /* synthetic */ C19404d(C19406f fVar) {
        this.f49357a = fVar;
    }

    public final void onMapReady(GoogleMap googleMap) {
        boolean z;
        MEZS b;
        C19406f fVar = this.f49357a;
        fVar.getClass();
        fVar.f49365f = googleMap.getProjection().getVisibleRegion();
        float f = googleMap.getCameraPosition().zoom + 1.0f;
        if (f != fVar.f49366g) {
            z = true;
        } else {
            z = false;
        }
        fVar.f49366g = f;
        if (fVar.f49364e) {
            for (GT gt : fVar.f49362c) {
                if (!fVar.mo51813j(fVar.f49365f, gt)) {
                    fVar.mo51816k(gt);
                } else if (z && gt.f49424c != (b = gt.f49422a.f47614c.mo51072b(fVar.f49366g))) {
                    fVar.mo51816k(gt);
                    if (b != null) {
                        gt.f49424c = b;
                        GO go = fVar.f49360a;
                        O a = go.mo51808a(googleMap, gt, b, fVar.f49363d);
                        go.mo51811g(a, gt);
                        gt.f49423b = a;
                    }
                }
            }
            for (GT gt2 : fVar.f49362c) {
                if (gt2.f49423b == null) {
                    fVar.mo51815h(gt2);
                }
            }
        }
    }
}

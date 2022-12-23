package c80;

import android.text.style.StyleSpan;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polygon;
import java.util.concurrent.Callable;
import p824tp.C19728f;
import z70.C13329g;

/* renamed from: c80.b */
public final /* synthetic */ class C7575b implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C7577d f23068b;

    /* renamed from: c */
    public final /* synthetic */ LatLonE6 f23069c;

    public /* synthetic */ C7575b(C7577d dVar, LatLonE6 latLonE6) {
        this.f23068b = dVar;
        this.f23069c = latLonE6;
    }

    public final Object call() {
        C7577d dVar = this.f23068b;
        LatLonE6 latLonE6 = this.f23069c;
        C19728f fVar = dVar.f23075e;
        StyleSpan styleSpan = C13329g.f33089a;
        Polygon polygon = fVar.f50165a.f16132g;
        if (latLonE6 == null || !polygon.mo46935h(latLonE6)) {
            return fVar.f50165a.f16139n;
        }
        return latLonE6;
    }
}

package p712ou;

import android.os.Parcelable;
import c00.C13722f;
import c00.C13723g;
import com.moovit.app.mot.model.MotActivationRegionFare;
import com.moovit.app.mot.model.MotActivationRegionalFare;
import com.moovit.app.taxi.providers.TaxiPolygon;
import com.moovit.commons.geo.LatLonE6;
import p732pq.C18950k;

/* renamed from: ou.a */
public final /* synthetic */ class C18829a implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f47940b;

    /* renamed from: c */
    public final /* synthetic */ LatLonE6 f47941c;

    public /* synthetic */ C18829a(int i, LatLonE6 latLonE6) {
        this.f47940b = i;
        this.f47941c = latLonE6;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f47940b) {
            case 0:
                LatLonE6 latLonE6 = this.f47941c;
                Parcelable.Creator<MotActivationRegionalFare> creator = MotActivationRegionalFare.CREATOR;
                return C13723g.m34280a(((MotActivationRegionFare) obj).f39013b.f39010c, new C18950k(latLonE6, 2));
            default:
                return ((TaxiPolygon) obj).f39956b.mo46935h(this.f47941c);
        }
    }
}

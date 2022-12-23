package p879vw;

import c00.C13722f;
import com.moovit.app.taxi.providers.TaxiPolygon;
import com.moovit.app.tod.bookingflow.model.TodZoneShape;
import com.moovit.commons.geo.LatLonE6;

/* renamed from: vw.a */
public final /* synthetic */ class C20239a implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f51346b;

    /* renamed from: c */
    public final /* synthetic */ LatLonE6 f51347c;

    public /* synthetic */ C20239a(int i, LatLonE6 latLonE6) {
        this.f51346b = i;
        this.f51347c = latLonE6;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f51346b) {
            case 0:
                TaxiPolygon taxiPolygon = (TaxiPolygon) obj;
                if (!taxiPolygon.f39956b.mo46935h(this.f51347c) || taxiPolygon.f39957c.f39959b == null) {
                    return false;
                }
                return true;
            default:
                return ((TodZoneShape) obj).f40103c.mo46935h(this.f51347c);
        }
    }
}

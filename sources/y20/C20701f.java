package y20;

import c00.C13733n;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.transit.LocationDescriptor;
import h80.C12736b;
import java.util.Map;

/* renamed from: y20.f */
public final /* synthetic */ class C20701f implements C13733n {

    /* renamed from: b */
    public final /* synthetic */ int f52275b;

    /* renamed from: c */
    public final /* synthetic */ Object f52276c;

    public /* synthetic */ C20701f(Object obj, int i) {
        this.f52275b = i;
        this.f52276c = obj;
    }

    public final Object convert(Object obj) {
        switch (this.f52275b) {
            case 0:
                String str = (String) obj;
                String str2 = (String) ((Map) this.f52276c).get(str);
                if (str2 != null) {
                    return str2;
                }
                return str;
            default:
                LatLonE6 latLonE6 = ((C12736b) this.f52276c).f31463y;
                latLonE6.getClass();
                return Integer.valueOf(Math.round(LatLonE6.m40174c(latLonE6, (LocationDescriptor) obj)));
        }
    }
}

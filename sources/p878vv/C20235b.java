package p878vv;

import android.location.Address;
import android.location.Geocoder;
import b00.C13557b;
import c00.C13720d;
import c00.C13722f;
import com.moovit.app.search.locations.C15284a;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polygon;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p824tp.C19728f;

/* renamed from: vv.b */
public final class C20235b extends C13557b<String, Void, List<Address>> {

    /* renamed from: b */
    public final /* synthetic */ C19728f f51339b;

    /* renamed from: c */
    public final /* synthetic */ C15284a f51340c;

    public C20235b(C15284a aVar, C19728f fVar) {
        this.f51340c = aVar;
        this.f51339b = fVar;
    }

    public final Object doInBackground(Object[] objArr) {
        Geocoder geocoder = new Geocoder(this.f51340c.getActivity());
        String str = ((String[]) objArr)[0];
        Polygon polygon = this.f51339b.f50165a.f16132g;
        BoxE6 bounds = polygon.getBounds();
        bounds.getClass();
        LatLonE6 latLonE6 = new LatLonE6(bounds.f40964b, bounds.f40966d);
        LatLonE6 latLonE62 = new LatLonE6(bounds.f40965c, bounds.f40967e);
        try {
            List<Address> fromLocationName = geocoder.getFromLocationName(str, 50, latLonE6.mo46922k(), latLonE6.mo46926o(), latLonE62.mo46922k(), latLonE62.mo46926o());
            PrintStream printStream = System.out;
            printStream.println("Returned " + fromLocationName.size() + " addresses");
            ArrayList arrayList = new ArrayList();
            for (Address next : fromLocationName) {
                if (polygon.mo46935h(LatLonE6.m40176g(next.getLatitude(), next.getLongitude()))) {
                    arrayList.add(next);
                } else {
                    PrintStream printStream2 = System.out;
                    printStream2.println(next + " is out of metro polygon");
                }
            }
            return arrayList;
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public final void onPostExecute(Object obj) {
        C15284a.m39110r2(this.f51340c, C13720d.m34273c((List) obj, (C13722f) null, C15284a.f39476m0), (C20238e) null);
    }
}

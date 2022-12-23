package p596jx;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.geo.Geofence;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRouteResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.apache.thrift.TBase;
import p502fx.C17124i;
import p526gx.C17248a;
import p526gx.C17251d;
import p526gx.C17252e;
import p584jl.C17885a;
import p638lr.C18262i;

/* renamed from: jx.j */
public final class C17961j extends C13780t<C17960i, C17961j, MVTodRideRouteResponse> {

    /* renamed from: m */
    public C17252e f46033m;

    public C17961j() {
        super(MVTodRideRouteResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        ArrayList<O> arrayList;
        int i;
        int i2;
        C17960i iVar = (C17960i) aVar;
        ArrayList<O> c = C13720d.m34273c(((MVTodRideRouteResponse) tBase).pathToPoints, (C13722f) null, new C18262i(10));
        if (C13717b.m34258e(c)) {
            return;
        }
        String uuid = UUID.randomUUID().toString();
        List<C17124i> list = iVar.f46031y;
        ArrayList arrayList2 = new ArrayList(list.size());
        arrayList2.add((Object) null);
        int size = c.size();
        for (int i3 = 1; i3 < size; i3++) {
            LatLonE6 y = ((Polyline) c.get(i3)).mo24347y(0);
            C17124i iVar2 = list.get(i3 - 1);
            if (y != null) {
                iVar2 = new C17124i(iVar2.f44327b, iVar2.f44328c, y, iVar2.f44330e, iVar2.f44331f, iVar2.f44332g, iVar2.f44333h);
            }
            arrayList2.add(iVar2);
        }
        arrayList2.add((Object) null);
        int size2 = c.size();
        ArrayList arrayList3 = new ArrayList(size2);
        int i4 = 0;
        while (i4 < size2) {
            C17124i iVar3 = (C17124i) arrayList2.get(i4);
            int i5 = i4 + 1;
            C17124i iVar4 = (C17124i) arrayList2.get(i5);
            Polyline polyline = (Polyline) c.get(i4);
            List<LatLonE6> points = polyline.getPoints();
            if (points.size() < 2) {
                i2 = size2;
                arrayList = c;
                i = i5;
            } else {
                ArrayList arrayList4 = new ArrayList();
                int size3 = points.size() - 1;
                int i6 = 0;
                while (i6 < size3) {
                    LatLonE6 latLonE6 = points.get(i6);
                    i6++;
                    LatLonE6 latLonE62 = points.get(i6);
                    arrayList4.add(latLonE6);
                    int i7 = size2;
                    ArrayList<O> arrayList5 = c;
                    double y2 = C17885a.m44472y(latLonE6, latLonE62);
                    int i8 = i5;
                    for (double w = C17885a.m44468w(latLonE6, latLonE62); w > 20.0d; w -= 20.0d) {
                        latLonE6 = C17885a.m44390B(latLonE6, 20.0d, y2);
                        arrayList4.add(latLonE6);
                    }
                    c = arrayList5;
                    size2 = i7;
                    i5 = i8;
                }
                i2 = size2;
                arrayList = c;
                i = i5;
                arrayList4.add(points.get(size3));
                points = arrayList4;
            }
            polyline.getPoints().size();
            points.size();
            arrayList3.add(new C17251d(i4, iVar3, iVar4, new Polylon(points, false)));
            c = arrayList;
            size2 = i2;
            i4 = i;
        }
        C13717b.m34261h(arrayList2);
        Iterator it = arrayList3.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 += ((C17251d) it.next()).f44585d.mo24338U0();
        }
        ArrayList arrayList6 = new ArrayList(i9);
        int size4 = arrayList3.size();
        for (int i11 = 0; i11 < size4; i11++) {
            C17251d dVar = (C17251d) arrayList3.get(i11);
            int U0 = dVar.f44585d.mo24338U0();
            for (int i12 = 0; i12 < U0; i12++) {
                arrayList6.add(new C17248a(new Geofence(dVar.f44585d.mo24347y(i12), 24.0f), i11, i12));
            }
        }
        this.f46033m = new C17252e(uuid, arrayList3, arrayList2, arrayList6);
    }
}

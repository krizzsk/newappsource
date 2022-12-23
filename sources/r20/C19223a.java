package r20;

import android.util.SparseArray;
import ce0.C21100e;
import com.appboy.support.ValidationUtils;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.utils.Color;
import com.moovit.image.model.ResourceImage;
import com.moovit.map.MarkerZoomStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import o20.C18699e;
import o20.C18713s;
import p584jl.C17885a;
import p824tp.C19745w;
import p977zz.C20936e0;
import p977zz.C20944i0;

/* renamed from: r20.a */
public final class C19223a implements Callable<List<C18713s>> {

    /* renamed from: b */
    public final Polyline f48819b;

    /* renamed from: c */
    public final Color f48820c;

    /* renamed from: d */
    public final Color f48821d;

    public C19223a(Polyline polyline, Color color, Color color2) {
        C21100e.m49373x(polyline, "polyline");
        this.f48819b = polyline;
        C21100e.m49373x(color, "markerColor");
        this.f48820c = color;
        C21100e.m49373x(color2, "arrowColor");
        this.f48821d = color2;
    }

    public final Object call() throws Exception {
        ArrayList arrayList;
        C18699e eVar;
        Polyline polyline = this.f48819b;
        int round = Math.round(polyline.mo24339Z0());
        if (round < 200) {
            arrayList = null;
        } else {
            int a = C20936e0.m49035a(round, 400) / 400;
            double d = ((double) round) / (((double) a) + 1.0d);
            arrayList = new ArrayList(a);
            int U0 = polyline.mo24338U0();
            int i = U0 - 1;
            LatLonE6 y = polyline.mo24347y(0);
            int i2 = 1;
            loop0:
            while (true) {
                double d2 = 0.0d;
                while (i2 < U0 && arrayList.size() < a) {
                    LatLonE6 y2 = polyline.mo24347y(i2);
                    double w = C17885a.m44468w(y, y2) + d2;
                    int i3 = (w > d ? 1 : (w == d ? 0 : -1));
                    if (i3 > 0) {
                        double y3 = C17885a.m44472y(y, y2);
                        y = C17885a.m44390B(y, d - d2, y3);
                        arrayList.add(new C20944i0(y, Float.valueOf((float) ((y3 + 360.0d) % 360.0d))));
                    } else if (i2 == i) {
                        break loop0;
                    } else if (i3 == 0) {
                        i2++;
                        arrayList.add(new C20944i0(y2, Float.valueOf((float) ((C17885a.m44472y(y2, polyline.mo24347y(i2)) + 360.0d) % 360.0d))));
                        y = y2;
                    } else {
                        i2++;
                        y = y2;
                        d2 = w;
                    }
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        MarkerZoomStyle markerZoomStyle = new MarkerZoomStyle(new ResourceImage(C19745w.mvf_small_map_direction_marker, this.f48820c.mo46956l(), this.f48821d.mo46956l()), ValidationUtils.APPBOY_STRING_MAX_LENGTH, 1.5f, 2);
        MarkerZoomStyle markerZoomStyle2 = new MarkerZoomStyle(new ResourceImage(C19745w.mvf_map_direction_marker, this.f48820c.mo46956l(), this.f48821d.mo46956l()), ValidationUtils.APPBOY_STRING_MAX_LENGTH, 1.5f, 2);
        SparseArray sparseArray = new SparseArray(2);
        sparseArray.append(1400, markerZoomStyle);
        sparseArray.append(1650, markerZoomStyle2);
        C18699e eVar2 = new C18699e(markerZoomStyle2, 1400, 25600, sparseArray);
        C18699e eVar3 = new C18699e(markerZoomStyle2, 1650, 25600, (SparseArray) null);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            C20944i0 i0Var = (C20944i0) arrayList.get(i4);
            if (i4 % 2 == 0) {
                eVar = eVar3;
            } else {
                eVar = eVar2;
            }
            arrayList2.add(new C18713s((Object) null, (LatLonE6) i0Var.f52692a, eVar, ((Float) i0Var.f52693b).floatValue()));
        }
        return arrayList2;
    }
}

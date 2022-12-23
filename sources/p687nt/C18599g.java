package p687nt;

import com.appboy.support.ValidationUtils;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.TransitStop;
import java.util.Collection;
import java.util.List;
import o20.C18699e;
import o20.C18711q;

/* renamed from: nt.g */
public final /* synthetic */ class C18599g implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ C18604l f47363a;

    /* renamed from: b */
    public final /* synthetic */ MapFragment f47364b;

    /* renamed from: c */
    public final /* synthetic */ List f47365c;

    public /* synthetic */ C18599g(C18604l lVar, MapFragment mapFragment, List list) {
        this.f47363a = lVar;
        this.f47364b = mapFragment;
        this.f47365c = list;
    }

    /* renamed from: a */
    public final void mo21406a() {
        C18604l lVar = this.f47363a;
        MapFragment mapFragment = this.f47364b;
        List<TransitStop> list = this.f47365c;
        int i = C18604l.f47374T;
        lVar.getClass();
        mapFragment.mo48633d3();
        if (!lVar.f47385K.isEmpty()) {
            Collection<Object> values = lVar.f47385K.values();
            C18711q F = mapFragment.f42368n.mo48783F();
            for (Object h3 : values) {
                mapFragment.mo48637h3(h3, F);
            }
        }
        lVar.f47385K.clear();
        for (TransitStop transitStop : list) {
            lVar.f47385K.put(transitStop, mapFragment.mo48648p2(transitStop, transitStop, C18699e.m45697a(MarkerZoomStyle.m41441d(transitStop.f23738j, lVar.f47386L, ValidationUtils.APPBOY_STRING_MAX_LENGTH))));
        }
    }
}

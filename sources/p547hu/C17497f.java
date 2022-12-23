package p547hu;

import ce0.C21100e;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.TimeFrequency;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hu.f */
public final class C17497f {

    /* renamed from: a */
    public final TransitLineGroup f45049a;

    /* renamed from: b */
    public final List<TransitLine> f45050b;

    /* renamed from: c */
    public final TransitStop f45051c;

    /* renamed from: d */
    public final TransitStop f45052d;

    /* renamed from: e */
    public final List<C17493b> f45053e;

    /* renamed from: f */
    public final List<TransitStop> f45054f;

    /* renamed from: g */
    public final List<TimeFrequency> f45055g;

    public C17497f(TransitLineGroup transitLineGroup, ArrayList arrayList, TransitStop transitStop, TransitStop transitStop2, ArrayList arrayList2, List list, List list2) {
        C21100e.m49373x(transitLineGroup, "lineGroup");
        this.f45049a = transitLineGroup;
        this.f45050b = arrayList;
        C21100e.m49373x(transitStop, "departureStop");
        this.f45051c = transitStop;
        this.f45052d = transitStop2;
        this.f45053e = arrayList2;
        C21100e.m49373x(list, "mergedStops");
        this.f45054f = list;
        C21100e.m49373x(list2, "frequencies");
        this.f45055g = list2;
    }
}

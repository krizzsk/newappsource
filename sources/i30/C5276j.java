package i30;

import ce0.C21100e;
import com.moovit.transit.Shape;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitStop;
import java.util.Set;

/* renamed from: i30.j */
public final class C5276j {

    /* renamed from: a */
    public Set<TransitStop> f17424a;

    /* renamed from: b */
    public Set<TransitLineGroup> f17425b;

    /* renamed from: c */
    public Set<Shape> f17426c;

    public C5276j(Set<TransitStop> set, Set<TransitLineGroup> set2, Set<Shape> set3) {
        C21100e.m49373x(set, "stops");
        this.f17424a = set;
        C21100e.m49373x(set2, "lineGroups");
        this.f17425b = set2;
        C21100e.m49373x(set3, "shapes");
        this.f17426c = set3;
    }
}

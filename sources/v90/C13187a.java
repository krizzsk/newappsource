package v90;

import ce0.C21100e;
import com.moovit.tripplanner.TripPlannerPersonalPrefs;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerSortType;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.moovit.tripplanner.TripPlannerWalkingPrefType;
import f00.C16918f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: v90.a */
public final class C13187a {

    /* renamed from: a */
    public final List<TripPlannerRouteType> f32740a;

    /* renamed from: b */
    public final C16918f<TripPlannerRouteType> f32741b;

    /* renamed from: c */
    public final List<TripPlannerTransportTypeInfo> f32742c;

    /* renamed from: d */
    public final C16918f<Set<TripPlannerTransportType>> f32743d;

    /* renamed from: e */
    public final List<TripPlannerSortType> f32744e;

    /* renamed from: f */
    public final C16918f<TripPlannerSortType> f32745f;

    /* renamed from: g */
    public final List<TripPlannerWalkingPrefType> f32746g;

    /* renamed from: h */
    public final C16918f<TripPlannerPersonalPrefs> f32747h;

    public C13187a(List list, C16918f fVar, ArrayList arrayList, C16918f fVar2, List list2, C16918f fVar3, List list3, C16918f fVar4) {
        this.f32740a = Collections.unmodifiableList(list);
        this.f32741b = fVar;
        this.f32742c = Collections.unmodifiableList(arrayList);
        this.f32743d = fVar2;
        this.f32744e = Collections.unmodifiableList(list2);
        this.f32745f = fVar3;
        C21100e.m49373x(list3, "availableWalkingPrefTypes");
        this.f32746g = Collections.unmodifiableList(list3);
        this.f32747h = fVar4;
    }

    /* renamed from: a */
    public final TripPlannerPersonalPrefs mo40060a() {
        return this.f32747h.mo49542a();
    }

    /* renamed from: b */
    public final TripPlannerRouteType mo40061b() {
        return this.f32741b.mo49542a();
    }

    /* renamed from: c */
    public final TripPlannerSortType mo40062c() {
        return this.f32745f.mo49542a();
    }

    /* renamed from: d */
    public final Set<TripPlannerTransportType> mo40063d() {
        return Collections.unmodifiableSet(this.f32743d.mo49542a());
    }
}

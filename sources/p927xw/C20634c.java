package p927xw;

import a00.C13382a;
import com.moovit.app.tripplanner.TripPlannerActivity;
import com.moovit.map.MapFragment;

/* renamed from: xw.c */
public final /* synthetic */ class C20634c implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ int f52164a;

    /* renamed from: b */
    public final /* synthetic */ Object f52165b;

    public /* synthetic */ C20634c(Object obj, int i) {
        this.f52164a = i;
        this.f52165b = obj;
    }

    /* renamed from: a */
    public final void mo21406a() {
        switch (this.f52164a) {
            case 0:
                C20637f fVar = (C20637f) this.f52165b;
                if (!fVar.f52179c.mo48624U2()) {
                    fVar.f52179c.mo48656t2(new C20634c(fVar, 0));
                    return;
                } else {
                    fVar.mo52818c();
                    return;
                }
            default:
                TripPlannerActivity tripPlannerActivity = (TripPlannerActivity) this.f52165b;
                int i = TripPlannerActivity.f40505q0;
                MapFragment mapFragment = (MapFragment) tripPlannerActivity.getSupportFragmentManager().mo3923A("trip_plan_map_fragment_tag");
                if (mapFragment != null) {
                    mapFragment.mo48609E2();
                    tripPlannerActivity.mo46522L2(tripPlannerActivity.mo46519D2().mo46532s2());
                    C13382a.m33673i(mapFragment.getView());
                    return;
                }
                return;
        }
    }
}

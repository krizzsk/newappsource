package p808sx;

import androidx.fragment.app.FragmentManager;
import com.moovit.app.tripplanner.TripPlannerActivity;

/* renamed from: sx.a */
public final /* synthetic */ class C19565a implements FragmentManager.C0897m {

    /* renamed from: a */
    public final /* synthetic */ TripPlannerActivity f49736a;

    public /* synthetic */ C19565a(TripPlannerActivity tripPlannerActivity) {
        this.f49736a = tripPlannerActivity;
    }

    public final void onBackStackChanged() {
        TripPlannerActivity tripPlannerActivity = this.f49736a;
        int i = TripPlannerActivity.f40505q0;
        FragmentManager supportFragmentManager = tripPlannerActivity.getSupportFragmentManager();
        int D = supportFragmentManager.mo3926D();
        if (D == 0) {
            tripPlannerActivity.mo46521I2(0);
        } else if ("trip_plan_results_fragment_tag".equals(supportFragmentManager.mo3925C(D - 1).getName())) {
            tripPlannerActivity.mo46521I2(1);
        }
    }
}

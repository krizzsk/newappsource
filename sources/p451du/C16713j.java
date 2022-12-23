package p451du;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.moovit.app.linedetail.p416ui.LineDetailMapFragment;
import com.moovit.map.MapFragment;
import com.moovit.transit.TransitStop;
import p977zz.C20944i0;

/* renamed from: du.j */
public final /* synthetic */ class C16713j implements MapFragment.C16238s {

    /* renamed from: b */
    public final /* synthetic */ LineDetailMapFragment f43521b;

    public /* synthetic */ C16713j(LineDetailMapFragment lineDetailMapFragment) {
        this.f43521b = lineDetailMapFragment;
    }

    /* renamed from: L0 */
    public final void mo23897L0(MapFragment mapFragment, Object obj) {
        LineDetailMapFragment lineDetailMapFragment = this.f43521b;
        int i = LineDetailMapFragment.f38746Y0;
        lineDetailMapFragment.getClass();
        if (obj instanceof C20944i0) {
            C20944i0 i0Var = (C20944i0) obj;
            TransitStop transitStop = (TransitStop) i0Var.f52692a;
            int intValue = ((Integer) i0Var.f52693b).intValue();
            Fragment targetFragment = lineDetailMapFragment.getTargetFragment();
            if (targetFragment instanceof LineDetailMapFragment.C15094a) {
                ((LineDetailMapFragment.C15094a) targetFragment).mo45424u0(intValue, transitStop);
            }
            Fragment parentFragment = lineDetailMapFragment.getParentFragment();
            if (parentFragment instanceof LineDetailMapFragment.C15094a) {
                ((LineDetailMapFragment.C15094a) parentFragment).mo45424u0(intValue, transitStop);
            }
            FragmentActivity activity = lineDetailMapFragment.getActivity();
            if (activity instanceof LineDetailMapFragment.C15094a) {
                ((LineDetailMapFragment.C15094a) activity).mo45424u0(intValue, transitStop);
            }
        }
    }
}

package p451du;

import androidx.fragment.app.Fragment;
import com.moovit.app.linedetail.p416ui.LineDetailMapFragment;
import com.moovit.app.map.DocklessVehicleBottomSheetDialog;
import com.moovit.map.MapFragment;
import com.moovit.transit.TransitStop;

/* renamed from: du.l */
public final /* synthetic */ class C16715l implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ int f43524a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f43525b;

    /* renamed from: c */
    public final /* synthetic */ Object f43526c;

    public /* synthetic */ C16715l(Fragment fragment, Object obj, int i) {
        this.f43524a = i;
        this.f43525b = fragment;
        this.f43526c = obj;
    }

    /* renamed from: a */
    public final void mo21406a() {
        switch (this.f43524a) {
            case 0:
                int i = LineDetailMapFragment.f38746Y0;
                ((LineDetailMapFragment) this.f43525b).mo45432x3((TransitStop) this.f43526c);
                return;
            default:
                ((MapFragment) this.f43526c).mo48636g3(((DocklessVehicleBottomSheetDialog) this.f43525b).f38879v);
                return;
        }
    }
}

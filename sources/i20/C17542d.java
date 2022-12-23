package i20;

import android.location.Location;
import android.view.View;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.ChooseLocationActivity;
import com.moovit.map.MapFragment;

/* renamed from: i20.d */
public final class C17542d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ChooseLocationActivity f45133b;

    public C17542d(ChooseLocationActivity chooseLocationActivity) {
        this.f45133b = chooseLocationActivity;
    }

    public final void onClick(View view) {
        ChooseLocationActivity chooseLocationActivity = this.f45133b;
        chooseLocationActivity.f42226q0.f42229b = true;
        MapFragment mapFragment = chooseLocationActivity.f42221l0;
        Location i = mapFragment.mo46781P1().mo50014i();
        if (i != null) {
            mapFragment.mo48663x2(LatLonE6.m40177j(i));
        }
    }
}

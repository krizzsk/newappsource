package p592jt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import ce0.C21100e;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.map.layers.MapLayersManager;
import com.moovit.map.MapFragment;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Set;
import p450dt.C16703d;
import p663mt.C18432a;
import q00.C19047a;

/* renamed from: jt.a */
public class C17924a extends C16703d {

    /* renamed from: o */
    public MapFragment f45985o;

    /* renamed from: p */
    public C18432a f45986p;

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        MoovitAppActivity moovitAppActivity = (MoovitAppActivity) this.f40822c;
        MapLayersManager mapLayersManager = new MapLayersManager(moovitAppActivity, (C19047a) mo46776J1("CONFIGURATION"), mo50467X());
        if (mapLayersManager.f38923j != -1) {
            mapLayersManager.f38923j = -1;
            mapLayersManager.mo45503d();
            mapLayersManager.mo45502c();
        }
        moovitAppActivity.getLifecycle().mo4224a(mapLayersManager);
    }

    /* renamed from: X */
    public final MapFragment mo50467X() {
        if (this.f45985o == null) {
            this.f45985o = (MapFragment) getChildFragmentManager().mo3983z(R.id.map_fragment);
        }
        MapFragment mapFragment = this.f45985o;
        C21100e.m49373x(mapFragment, "mapFragment");
        return mapFragment;
    }

    /* renamed from: n2 */
    public final Toolbar mo45130n2() {
        return (Toolbar) getView().findViewById(R.id.tool_bar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.explore_home_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        MapFragment X = mo50467X();
        C18432a aVar = new C18432a(this, X);
        this.f45986p = aVar;
        X.f42342E.add(aVar);
        X.f42344F.add(this.f45986p);
    }

    public final void onStop() {
        super.onStop();
        MapFragment X = mo50467X();
        X.f42342E.remove(this.f45986p);
        X.f42344F.remove(this.f45986p);
    }
}

package d40;

import android.location.Location;
import com.moovit.navigation.C4226a;
import p858uz.C20059f;

/* renamed from: d40.e */
public final /* synthetic */ class C4349e implements C20059f {

    /* renamed from: b */
    public final /* synthetic */ C4226a f15320b;

    public /* synthetic */ C4349e(C4226a aVar) {
        this.f15320b = aVar;
    }

    public final void onLocationChanged(Location location) {
        C4226a aVar = this.f15320b;
        if (location != null) {
            aVar.mo19712k(location);
        } else {
            aVar.getClass();
        }
    }
}

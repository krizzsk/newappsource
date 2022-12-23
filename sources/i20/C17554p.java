package i20;

import android.location.Location;
import com.moovit.location.LocationSettingsFixer;
import p858uz.C20059f;
import p977zz.C20961r;

/* renamed from: i20.p */
public final /* synthetic */ class C17554p implements C20059f {

    /* renamed from: b */
    public final /* synthetic */ LocationSettingsFixer f45154b;

    public /* synthetic */ C17554p(LocationSettingsFixer locationSettingsFixer) {
        this.f45154b = locationSettingsFixer;
    }

    public final void onLocationChanged(Location location) {
        this.f45154b.f42247a.postValue(new C20961r(location));
    }
}

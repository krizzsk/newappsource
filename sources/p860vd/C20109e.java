package p860vd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p435de.C16592b;
import p836ud.C19885a;

/* renamed from: vd.e */
public final class C20109e {

    /* renamed from: a */
    public final C19885a.C19886a f51026a;

    public C20109e(AppMeasurementSdk appMeasurementSdk, C16592b bVar) {
        this.f51026a = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new C20108d(this));
    }
}

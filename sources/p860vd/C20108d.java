package p860vd;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p435de.C16592b;

/* renamed from: vd.d */
public final class C20108d implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a */
    public final /* synthetic */ C20109e f51025a;

    public C20108d(C20109e eVar) {
        this.f51025a = eVar;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals(AppMeasurement.CRASH_ORIGIN) && (!C20105a.f51016a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            ((C16592b) this.f51025a.f51026a).mo49361a(3, bundle2);
        }
    }
}

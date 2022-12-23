package p860vd;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgv;
import java.util.HashSet;
import p435de.C16592b;

/* renamed from: vd.b */
public final class C20106b implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a */
    public final /* synthetic */ C20107c f51022a;

    public C20106b(C20107c cVar) {
        this.f51022a = cVar;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (this.f51022a.f51023a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            HashSet hashSet = C20105a.f51016a;
            String zza = zzgv.zza(str2);
            if (zza != null) {
                str2 = zza;
            }
            bundle2.putString("events", str2);
            ((C16592b) this.f51022a.f51024b).mo49361a(2, bundle2);
        }
    }
}

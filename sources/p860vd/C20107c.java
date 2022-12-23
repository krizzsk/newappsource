package p860vd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import p435de.C16592b;
import p836ud.C19885a;

/* renamed from: vd.c */
public final class C20107c {

    /* renamed from: a */
    public final HashSet f51023a = new HashSet();

    /* renamed from: b */
    public final C19885a.C19886a f51024b;

    public C20107c(AppMeasurementSdk appMeasurementSdk, C16592b bVar) {
        this.f51024b = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new C20106b(this));
    }
}

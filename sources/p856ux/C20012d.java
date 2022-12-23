package p856ux;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import c70.C13752e;
import com.google.android.gms.location.LocationServices;
import java.io.File;
import p786rz.C19387a;
import p977zz.C20927a0;
import p977zz.C20943i;
import x90.C13242b;

/* renamed from: ux.d */
public final class C20012d implements C13242b {

    /* renamed from: a */
    public final /* synthetic */ int f50858a;

    public /* synthetic */ C20012d(int i) {
        this.f50858a = i;
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) {
        switch (this.f50858a) {
            case 0:
                C20943i.m49049b(eVar.f33852a, "ResourceRequest");
                return;
            case 1:
                Context context = eVar.f33852a;
                LocationServices.getGeofencingClient(context).removeGeofences(PendingIntent.getService(context, 0, new Intent().setClassName(context, "com.moovit.app.locationtriggers.LocationTriggersManager").setAction("com.moovit.app.locationtriggers.LocationTriggersManager.action.geofencing_event"), C20927a0.m49010e(134217728)));
                return;
            case 2:
                Context context2 = eVar.f33852a;
                context2.deleteDatabase("androidx.work.workdb");
                C20943i.m49049b(context2, "androidx.work.util.id");
                return;
            case 3:
                C20943i.m49049b(eVar.f33852a, "on_boarding");
                return;
            case 4:
                Context context3 = eVar.f33852a;
                context3.deleteFile("ticketing_user_wallet_store");
                C19387a.m46676h(new File(new File(context3.getFilesDir(), "stores"), "ticketing_config"));
                return;
            default:
                C20943i.m49049b(eVar.f33852a, "tod_order");
                return;
        }
    }

    public final String toString() {
        switch (this.f50858a) {
            case 0:
                return "Upgrader121To122";
            case 1:
                return "Upgrader291To292";
            case 2:
                return "Upgrader372To373";
            case 3:
                return "Upgrader415To416";
            case 4:
                return "Upgrader456To457";
            default:
                return "Upgrader542To543";
        }
    }
}

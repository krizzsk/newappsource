package d40;

import android.location.Location;
import android.os.PowerManager;
import com.moovit.navigation.C4226a;
import com.moovit.navigation.NavigationGeofence;
import com.moovit.network.model.ServerId;
import p858uz.C20059f;

/* renamed from: d40.f */
public final /* synthetic */ class C4350f implements C20059f {

    /* renamed from: b */
    public final /* synthetic */ C4351g f15321b;

    /* renamed from: c */
    public final /* synthetic */ PowerManager.WakeLock f15322c;

    public /* synthetic */ C4350f(C4351g gVar, PowerManager.WakeLock wakeLock) {
        this.f15321b = gVar;
        this.f15322c = wakeLock;
    }

    public final void onLocationChanged(Location location) {
        ServerId serverId;
        C4351g gVar = this.f15321b;
        PowerManager.WakeLock wakeLock = this.f15322c;
        if (!gVar.f15327d) {
            wakeLock.release();
        } else if (location != null) {
            C4226a aVar = gVar.f15328e;
            int d = aVar.mo19707d();
            ServerId[] serverIdArr = new ServerId[d];
            for (int i = 0; i < d; i++) {
                C4347c e = aVar.mo19708e(i);
                NavigationGeofence navigationGeofence = e.f15317b;
                if (navigationGeofence != null) {
                    serverId = navigationGeofence.f15047c;
                } else {
                    serverId = aVar.mo19706c(e.f15316a).f15035b.get(0).f15047c;
                }
                serverIdArr[i] = serverId;
            }
            gVar.f15331h = new C4358h(gVar, location, serverIdArr, wakeLock).execute(new Void[0]);
        }
    }
}

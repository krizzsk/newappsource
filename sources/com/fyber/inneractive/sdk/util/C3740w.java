package com.fyber.inneractive.sdk.util;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.fyber.inneractive.sdk.util.w */
public class C3740w implements LocationListener {

    /* renamed from: a */
    public final /* synthetic */ C3747z f12938a;

    public C3740w(C3747z zVar) {
        this.f12938a = zVar;
    }

    public void onLocationChanged(Location location) {
        Runnable runnable;
        if (location != null) {
            long abs = Math.abs(System.currentTimeMillis() - location.getTime());
            this.f12938a.getClass();
            IAlog.m9902a("%snetwork location changed: %s tss = %d tssM = %d", "Location Manager: ", location, Long.valueOf(abs), Long.valueOf(abs / 60000));
            this.f12938a.getClass();
            IAlog.m9902a("%snetwork location sampling took: %d msec", "Location Manager: ", Long.valueOf(System.currentTimeMillis() - this.f12938a.f12954g));
            C3747z zVar = this.f12938a;
            zVar.mo15401a(zVar.f12952e);
            C3747z zVar2 = this.f12938a;
            zVar2.f12952e = null;
            if (zVar2.f12953f == null && (runnable = zVar2.f12951d) != null) {
                C3714n.f12902b.removeCallbacks(runnable);
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        this.f12938a.getClass();
        IAlog.m9902a("%snetwork location listener - onStatusChanged: %dextras = %s", "Location Manager: ", Integer.valueOf(i), bundle);
    }
}

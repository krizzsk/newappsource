package com.fyber.inneractive.sdk.util;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.fyber.inneractive.sdk.util.x */
public class C3744x implements LocationListener {

    /* renamed from: a */
    public final /* synthetic */ C3747z f12946a;

    public C3744x(C3747z zVar) {
        this.f12946a = zVar;
    }

    public void onLocationChanged(Location location) {
        Runnable runnable;
        if (location != null) {
            long abs = Math.abs(System.currentTimeMillis() - location.getTime());
            this.f12946a.getClass();
            IAlog.m9902a("%sgps location changed: %s tss = %d tssM = %d", "Location Manager: ", location, Long.valueOf(abs), Long.valueOf(abs / 60000));
            this.f12946a.getClass();
            IAlog.m9902a("%sgps location sampling took: %d msec", "Location Manager: ", Long.valueOf(System.currentTimeMillis() - this.f12946a.f12954g));
            C3747z zVar = this.f12946a;
            zVar.mo15401a(zVar.f12953f);
            C3747z zVar2 = this.f12946a;
            zVar2.f12953f = null;
            if (zVar2.f12952e == null && (runnable = zVar2.f12951d) != null) {
                C3714n.f12902b.removeCallbacks(runnable);
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        this.f12946a.getClass();
        IAlog.m9902a("%sgps location listener - onStatusChanged: %dextras = %s", "Location Manager: ", Integer.valueOf(i), bundle);
    }
}

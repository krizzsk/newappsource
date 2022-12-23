package com.masabi.justride.sdk.platform.geolocation;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.appboy.models.outgoing.FacebookUser;
import mf0.C24362h;

/* renamed from: com.masabi.justride.sdk.platform.geolocation.b */
public final class C14662b implements LocationListener {
    public final void onLocationChanged(Location location) {
        C24362h.m61211f(location, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
    }

    public final void onProviderDisabled(String str) {
        C24362h.m61211f(str, "provider");
    }

    public final void onProviderEnabled(String str) {
        C24362h.m61211f(str, "provider");
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}

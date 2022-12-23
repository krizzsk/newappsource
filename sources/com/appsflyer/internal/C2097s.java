package com.appsflyer.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.AndroidUtils;
import com.appsflyer.ServerParameters;

/* renamed from: com.appsflyer.internal.s */
public final class C2097s {

    /* renamed from: com.appsflyer.internal.s$c */
    public static final class C2098c {
        public static final C2097s values = new C2097s();
    }

    private static boolean AFDateFormat(Context context, String[] strArr) {
        for (String isPermissionAvailable : strArr) {
            if (AndroidUtils.isPermissionAvailable(context, isPermissionAvailable)) {
                return true;
            }
        }
        return false;
    }

    public final Location AFDateFormat(Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            Location lastKnownLocation = AFDateFormat(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) ? locationManager.getLastKnownLocation(ServerParameters.NETWORK) : null;
            Location lastKnownLocation2 = AFDateFormat(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"}) ? locationManager.getLastKnownLocation("gps") : null;
            if (lastKnownLocation2 == null && lastKnownLocation == null) {
                lastKnownLocation = null;
            } else if (lastKnownLocation2 != null || lastKnownLocation == null) {
                if ((lastKnownLocation == null && lastKnownLocation2 != null) || 60000 >= lastKnownLocation.getTime() - lastKnownLocation2.getTime()) {
                    lastKnownLocation = lastKnownLocation2;
                }
            }
            if (lastKnownLocation != null) {
                return lastKnownLocation;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}

package com.appboy.services;

import android.content.Context;
import androidx.annotation.Keep;
import com.appboy.Appboy;
import com.appboy.support.AppboyLogger;

@Deprecated
@Keep
public class AppboyLocationService {
    public static final String TAG = AppboyLogger.getBrazeLogTag(AppboyLocationService.class);

    @Deprecated
    public static void requestInitialization(Context context) {
        AppboyLogger.m5448d(TAG, "Location permissions were granted. Requesting geofence and location initialization.");
        Appboy.getInstance(context).requestLocationInitialization();
    }
}

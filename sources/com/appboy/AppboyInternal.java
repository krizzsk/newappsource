package com.appboy;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import p030bo.app.C1546c0;
import p030bo.app.C1602i2;

@Keep
public class AppboyInternal {
    public static void addSerializedContentCardToStorage(Context context, String str, String str2) {
        getInstance(context).addSerializedCardJsonToStorage(str, str2);
    }

    public static Appboy getInstance(Context context) {
        return Appboy.getInstance(context);
    }

    public static void handleInAppMessageTestPush(Context context, Intent intent) {
        getInstance(context).handleInAppMessageTestPush(intent);
    }

    public static void logLocationRecordedEvent(Context context, C1602i2 i2Var) {
        getInstance(context).logLocationRecordedEventFromLocationUpdate(i2Var);
    }

    public static void recordGeofenceTransition(Context context, String str, C1546c0 c0Var) {
        getInstance(context).recordGeofenceTransition(str, c0Var);
    }

    public static void requestGeofenceRefresh(Context context, boolean z) {
        getInstance(context).requestGeofenceRefresh(z);
    }

    public static void requestGeofenceRefresh(Context context, C1602i2 i2Var) {
        getInstance(context).requestGeofenceRefresh(i2Var);
    }
}

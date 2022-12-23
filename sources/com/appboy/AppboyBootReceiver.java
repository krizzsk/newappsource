package com.appboy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import com.appboy.support.AppboyLogger;
import com.braze.Braze;
import p030bo.app.C1637m4;

@Keep
public class AppboyBootReceiver extends BroadcastReceiver {
    public static final String BOOT_COMPLETE_ACTION = "android.intent.action.BOOT_COMPLETED";
    public static final String TAG = AppboyLogger.getBrazeLogTag(AppboyBootReceiver.class);

    public boolean handleIncomingIntent(Context context, Intent intent) {
        if (intent == null) {
            AppboyLogger.m5459w(TAG, "Null intent received. Doing nothing.");
            return false;
        } else if (context == null) {
            String str = TAG;
            StringBuilder k = C13555b.m33972k("Null context received for intent ");
            k.append(intent.toString());
            k.append(". Doing nothing.");
            AppboyLogger.m5459w(str, k.toString());
            return false;
        } else {
            String str2 = TAG;
            StringBuilder k2 = C13555b.m33972k("Received broadcast message. Message: ");
            k2.append(intent.toString());
            AppboyLogger.m5453i(str2, k2.toString());
            if (BOOT_COMPLETE_ACTION.equals(intent.getAction())) {
                AppboyLogger.m5453i(str2, "Boot complete intent received. Initializing.");
                C1637m4.m4480a(context);
                Braze.getInstance(context);
                return true;
            }
            StringBuilder k3 = C13555b.m33972k("Unknown intent ");
            k3.append(intent.toString());
            k3.append(" received. Doing nothing.");
            AppboyLogger.m5459w(str2, k3.toString());
            return false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        handleIncomingIntent(context, intent);
    }
}

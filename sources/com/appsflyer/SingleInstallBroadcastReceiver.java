package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            try {
                str = intent.getStringExtra("referrer");
            } catch (Throwable th) {
                AFLogger.afErrorLog("error in BroadcastReceiver ", th);
                str = null;
            }
            if (str == null || AppsFlyerLibCore.getSharedPreferences(context).getString("referrer", (String) null) == null) {
                String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
                long currentTimeMillis = System.currentTimeMillis();
                if (string == null || currentTimeMillis - Long.valueOf(string).longValue() >= 2000) {
                    AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
                    AppsFlyerLibCore.getInstance().$$b(context, intent);
                    AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            AppsFlyerLibCore.getInstance().values(context, str);
        }
    }
}

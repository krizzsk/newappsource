package com.appsflyer.internal;

import android.app.Application;
import com.appsflyer.AppsFlyerLibCore;

public class Exlytics {
    private static Application $$b = null;
    public static final String EXCEPTION_COUNT_KEY = "exception_number";

    public static long get() {
        Application application = $$b;
        if (application == null) {
            return -1;
        }
        return AppsFlyerLibCore.getSharedPreferences(application).getLong(EXCEPTION_COUNT_KEY, 0);
    }

    public static void increment() {
        Application application = $$b;
        if (application != null) {
            AppsFlyerLibCore.getSharedPreferences(application).edit().putLong(EXCEPTION_COUNT_KEY, get() + 1).apply();
        }
    }

    public static void setContext(Application application) {
        $$b = application;
    }
}

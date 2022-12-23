package com.appboy.support;

import android.util.Log;
import androidx.annotation.Keep;
import p030bo.app.C1556d2;
import p030bo.app.C1696t4;

@Keep
public class AppboyLogger {
    public static final int DEFAULT_LOG_LEVEL = 4;
    public static final int DESIRED_MAX_APPBOY_TAG_LENGTH = 80;
    public static final String LOG_LEVEL_PROPERTY_NAME = "log.tag.APPBOY";
    public static final int MAX_REMAINING_LENGTH_FOR_CLASS_TAG = 65;
    public static final int SUPPRESS = Integer.MAX_VALUE;
    public static final String TAG = getBrazeLogTag(AppboyLogger.class);
    public static boolean sHasLogLevelBeenSetForAppRun = false;
    public static boolean sIsSystemPropLogLevelSet;
    public static int sLogLevel = 4;
    public static C1556d2 sTestUserDeviceLoggingManager;

    public static void appendToDeviceLogData(String str, String str2, Throwable th) {
        C1556d2 d2Var = sTestUserDeviceLoggingManager;
        if (d2Var != null && d2Var.mo5970d() && str != null) {
            sTestUserDeviceLoggingManager.mo5966a(str, str2, th);
        }
    }

    public static synchronized void checkForSystemLogLevelProperty() {
        synchronized (AppboyLogger.class) {
            String a = C1696t4.m4768a(LOG_LEVEL_PROPERTY_NAME, "");
            if (!StringUtils.isNullOrBlank(a) && a.trim().equalsIgnoreCase("verbose")) {
                sIsSystemPropLogLevelSet = true;
                sLogLevel = 2;
                String str = TAG;
                m5453i(str, "AppboyLogger log level set to " + a + " via device system property. Note that subsequent calls to AppboyLogger.setLogLevel() will have no effect.");
            }
        }
    }

    /* renamed from: d */
    public static int m5448d(String str, String str2) {
        return m5451d(str, str2, true);
    }

    /* renamed from: e */
    public static int m5452e(String str, String str2, Throwable th) {
        appendToDeviceLogData(str, str2, (Throwable) null);
        if (sLogLevel <= 6) {
            return Log.e(str, str2, th);
        }
        return 0;
    }

    @Deprecated
    public static String getAppboyLogTag(Class<?> cls) {
        return getBrazeLogTag(cls);
    }

    public static String getBrazeLogTag(Class<?> cls) {
        String name = cls.getName();
        int length = name.length();
        int i = MAX_REMAINING_LENGTH_FOR_CLASS_TAG;
        if (length > i) {
            name = name.substring(length - i);
        }
        return C25541a.m63881k("Braze v14.0.1 .", name);
    }

    public static int getLogLevel() {
        return sLogLevel;
    }

    /* renamed from: i */
    public static int m5453i(String str, String str2) {
        return m5456i(str, str2, true);
    }

    public static void resetForTesting() {
        sIsSystemPropLogLevelSet = false;
        sHasLogLevelBeenSetForAppRun = false;
    }

    public static synchronized void setInitialLogLevelFromConfiguration(int i) {
        synchronized (AppboyLogger.class) {
            if (!sHasLogLevelBeenSetForAppRun) {
                sLogLevel = i;
            }
        }
    }

    public static synchronized void setLogLevel(int i) {
        synchronized (AppboyLogger.class) {
            if (!sIsSystemPropLogLevelSet) {
                sLogLevel = i;
                sHasLogLevelBeenSetForAppRun = true;
            } else {
                String str = TAG;
                m5459w(str, "Log level already set via system property. AppboyLogger.setLogLevel() ignored for level: " + i);
            }
        }
    }

    public static void setTestUserDeviceLoggingManager(C1556d2 d2Var) {
        sTestUserDeviceLoggingManager = d2Var;
    }

    /* renamed from: v */
    public static int m5457v(String str, String str2) {
        if (sLogLevel <= 2) {
            return Log.v(str, str2);
        }
        return 0;
    }

    /* renamed from: w */
    public static int m5459w(String str, String str2) {
        appendToDeviceLogData(str, str2, (Throwable) null);
        if (sLogLevel <= 5) {
            return Log.w(str, str2);
        }
        return 0;
    }

    /* renamed from: d */
    public static int m5449d(String str, String str2, Throwable th) {
        return m5450d(str, str2, th, true);
    }

    /* renamed from: i */
    public static int m5454i(String str, String str2, Throwable th) {
        return m5455i(str, str2, th, true);
    }

    /* renamed from: d */
    public static int m5451d(String str, String str2, boolean z) {
        return m5450d(str, str2, (Throwable) null, z);
    }

    /* renamed from: i */
    public static int m5456i(String str, String str2, boolean z) {
        return m5455i(str, str2, (Throwable) null, z);
    }

    /* renamed from: v */
    public static int m5458v(String str, String str2, Throwable th) {
        if (sLogLevel <= 2) {
            return Log.v(str, str2, th);
        }
        return 0;
    }

    /* renamed from: d */
    public static int m5450d(String str, String str2, Throwable th, boolean z) {
        if (z) {
            appendToDeviceLogData(str, str2, (Throwable) null);
        }
        if (sLogLevel > 3) {
            return 0;
        }
        if (th != null) {
            return Log.d(str, str2, th);
        }
        return Log.d(str, str2);
    }

    /* renamed from: i */
    public static int m5455i(String str, String str2, Throwable th, boolean z) {
        if (z) {
            appendToDeviceLogData(str, str2, (Throwable) null);
        }
        if (sLogLevel > 4) {
            return 0;
        }
        if (th != null) {
            return Log.i(str, str2, th);
        }
        return Log.i(str, str2);
    }

    /* renamed from: w */
    public static int m5460w(String str, String str2, Throwable th) {
        appendToDeviceLogData(str, str2, th);
        if (sLogLevel <= 5) {
            return Log.w(str, str2, th);
        }
        return 0;
    }

    /* renamed from: w */
    public static int m5461w(String str, Throwable th) {
        appendToDeviceLogData(str, (String) null, th);
        if (sLogLevel <= 5) {
            return Log.w(str, th);
        }
        return 0;
    }
}

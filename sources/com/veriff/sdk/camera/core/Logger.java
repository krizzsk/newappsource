package com.veriff.sdk.camera.core;

import android.os.Build;
import android.util.Log;

public final class Logger {
    private static int sMinLogLevel = 3;

    /* renamed from: d */
    public static void m32239d(String str, String str2) {
        m32240d(str, str2, (Throwable) null);
    }

    /* renamed from: e */
    public static void m32241e(String str, String str2) {
        m32242e(str, str2, (Throwable) null);
    }

    /* renamed from: i */
    public static void m32243i(String str, String str2) {
        m32244i(str, str2, (Throwable) null);
    }

    public static boolean isDebugEnabled(String str) {
        return sMinLogLevel <= 3 || Log.isLoggable(truncateTag(str), 3);
    }

    public static boolean isErrorEnabled(String str) {
        return sMinLogLevel <= 6 || Log.isLoggable(truncateTag(str), 6);
    }

    public static boolean isInfoEnabled(String str) {
        return sMinLogLevel <= 4 || Log.isLoggable(truncateTag(str), 4);
    }

    public static boolean isWarnEnabled(String str) {
        return sMinLogLevel <= 5 || Log.isLoggable(truncateTag(str), 5);
    }

    public static void setMinLogLevel(int i) {
        sMinLogLevel = i;
    }

    private static String truncateTag(String str) {
        if (23 >= str.length() || Build.VERSION.SDK_INT >= 24) {
            return str;
        }
        return str.substring(0, 23);
    }

    /* renamed from: w */
    public static void m32245w(String str, String str2) {
        m32246w(str, str2, (Throwable) null);
    }

    /* renamed from: d */
    public static void m32240d(String str, String str2, Throwable th) {
        if (isDebugEnabled(str)) {
            truncateTag(str);
        }
    }

    /* renamed from: e */
    public static void m32242e(String str, String str2, Throwable th) {
        if (isErrorEnabled(str)) {
            truncateTag(str);
        }
    }

    /* renamed from: i */
    public static void m32244i(String str, String str2, Throwable th) {
        if (isInfoEnabled(str)) {
            truncateTag(str);
        }
    }

    /* renamed from: w */
    public static void m32246w(String str, String str2, Throwable th) {
        if (isWarnEnabled(str)) {
            truncateTag(str);
        }
    }
}

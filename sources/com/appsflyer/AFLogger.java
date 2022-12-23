package com.appsflyer;

import com.appboy.support.StringUtils;
import com.appsflyer.internal.C2069ad;
import com.appsflyer.internal.Exlytics;

public class AFLogger {
    private static final long values = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        private int values;

        private LogLevel(int i) {
            this.values = i;
        }

        public final int getLevel() {
            return this.values;
        }
    }

    private static void $$a(String str, Throwable th, boolean z, boolean z2) {
        String str2;
        StackTraceElement[] stackTraceElementArr;
        if (valueOf(LogLevel.ERROR)) {
            if (str == null) {
                str = th.getClass().getSimpleName();
            }
            $$b(str, false);
        }
        C2069ad $$a = C2069ad.$$a();
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            str2 = th.getMessage();
        } else {
            str2 = cause.getMessage();
        }
        if (cause == null) {
            stackTraceElementArr = th.getStackTrace();
        } else {
            stackTraceElementArr = cause.getStackTrace();
        }
        $$a.AFDateFormat("exception", simpleName, C2069ad.AFDateFormat(str2, stackTraceElementArr));
        Exlytics.increment();
    }

    private static String $$b(String str, boolean z) {
        if (str == null) {
            str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - values);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public static void afDebugLog(String str) {
        if (valueOf(LogLevel.DEBUG)) {
            $$b(str, false);
        }
        C2069ad.$$a().AFDateFormat((String) null, "D", $$b(str, true));
    }

    public static void afErrorLog(String str, Throwable th) {
        $$a(str, th, true, false);
    }

    public static void afInfoLog(String str, boolean z) {
        if (valueOf(LogLevel.INFO)) {
            $$b(str, false);
        }
        if (z) {
            C2069ad.$$a().AFDateFormat((String) null, "I", $$b(str, true));
        }
    }

    public static void afRDLog(String str) {
        if (valueOf(LogLevel.VERBOSE)) {
            $$b(str, false);
        }
        C2069ad.$$a().AFDateFormat((String) null, "V", $$b(str, true));
    }

    public static void afWarnLog(String str) {
        $$b(str);
    }

    private static boolean valueOf(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        $$a(str, th, true, z);
    }

    public static void afErrorLog(Throwable th) {
        $$a((String) null, th, false, false);
    }

    public static void valueOf(String str) {
        if (!valueOf()) {
            $$b(str, false);
        }
        C2069ad.$$a().AFDateFormat((String) null, "F", str);
    }

    public static void $$b(String str) {
        if (valueOf(LogLevel.WARNING)) {
            $$b(str, false);
        }
        C2069ad.$$a().AFDateFormat((String) null, "W", $$b(str, true));
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    private static boolean valueOf() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }
}

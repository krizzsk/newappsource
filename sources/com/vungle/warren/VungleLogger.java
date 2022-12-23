package com.vungle.warren;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.AppMeasurement;
import nd0.C24486e;

public final class VungleLogger {

    /* renamed from: c */
    public static final VungleLogger f58591c = new VungleLogger();

    /* renamed from: a */
    public LoggerLevel f58592a = LoggerLevel.DEBUG;

    /* renamed from: b */
    public C24486e f58593b;

    @Keep
    public enum LoggerLevel {
        VERBOSE(0, "verbose"),
        DEBUG(1, "debug"),
        INFO(2, "info"),
        WARNING(3, "warn"),
        ERROR(4, "error"),
        CRASH(5, AppMeasurement.CRASH_ORIGIN);
        
        /* access modifiers changed from: private */
        public int level;
        private String levelString;

        private LoggerLevel(int i, String str) {
            this.level = i;
            this.levelString = str;
        }

        public String toString() {
            return this.levelString;
        }
    }

    /* renamed from: a */
    public static void m57028a(String str, String str2) {
        m57030c(LoggerLevel.DEBUG, str, str2);
    }

    /* renamed from: b */
    public static void m57029b(String str, String str2) {
        m57030c(LoggerLevel.ERROR, str, str2);
    }

    /* renamed from: c */
    public static void m57030c(LoggerLevel loggerLevel, String str, String str2) {
        boolean z;
        VungleLogger vungleLogger = f58591c;
        C24486e eVar = vungleLogger.f58593b;
        if (eVar != null && eVar.f61979f.get()) {
            if (loggerLevel.level >= vungleLogger.f58592a.level) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vungleLogger.f58593b.mo60738b(loggerLevel, str, str2, (String) null, (String) null);
            }
        }
    }

    /* renamed from: d */
    public static void m57031d(String str, String str2) {
        m57030c(LoggerLevel.VERBOSE, str, str2);
    }

    /* renamed from: e */
    public static void m57032e(String str, String str2) {
        m57030c(LoggerLevel.WARNING, str, str2);
    }
}

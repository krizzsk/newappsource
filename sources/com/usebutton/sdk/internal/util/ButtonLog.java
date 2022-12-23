package com.usebutton.sdk.internal.util;

import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

public class ButtonLog {
    private static final Logger ANDROID_LOGGER;
    public static final String SDK_TAG = "ButtonSDK";
    private static ButtonLog sLog;
    private boolean mIsPartnerLoggingEnabled;
    private final Logger mLogger;
    private final int mMinimumLogLevel;

    public interface Logger {
        /* renamed from: d */
        void mo37741d(String str, String str2);

        /* renamed from: e */
        void mo37742e(String str, String str2);

        /* renamed from: e */
        void mo37743e(String str, String str2, Throwable th);

        /* renamed from: i */
        void mo37744i(String str, String str2);
    }

    static {
        C123521 r0 = new Logger() {
            /* renamed from: d */
            public void mo37741d(String str, String str2) {
            }

            /* renamed from: e */
            public void mo37742e(String str, String str2) {
            }

            /* renamed from: e */
            public void mo37743e(String str, String str2, Throwable th) {
            }

            /* renamed from: i */
            public void mo37744i(String str, String str2) {
            }
        };
        ANDROID_LOGGER = r0;
        sLog = new ButtonLog(r0, 3);
    }

    public ButtonLog(Logger logger, int i) {
        this.mLogger = logger;
        this.mMinimumLogLevel = i;
    }

    private void doLogInfo(String str, String str2) {
        if (isLoggingEnabled()) {
            this.mLogger.mo37744i(str, str2);
        }
    }

    private void doWarn(String str, String str2) {
        if (isLoggingEnabled()) {
            this.mLogger.mo37742e(str, str2);
        }
    }

    public static final void info(String str, String str2) {
        sLog.doLogInfo(str, str2);
    }

    public static final void infoFormat(String str, String str2, Object... objArr) {
        sLog.doLogInfo(str, str2, objArr);
    }

    private boolean isLoggingEnabled() {
        return Log.isLoggable(SDK_TAG, this.mMinimumLogLevel);
    }

    public static boolean isPartnerLoggingEnabled() {
        return sLog.mIsPartnerLoggingEnabled;
    }

    private String safelyFormat(String str, Object... objArr) {
        try {
            return String.format(Locale.US, str, objArr);
        } catch (IllegalFormatException unused) {
            return str;
        }
    }

    public static void setPartnerLoggingEnabled(boolean z) {
        sLog.doSetPartnerLoggingEnabled(z);
    }

    public static final void verbose(String str, String str2) {
        sLog.doVerbose(str, str2);
    }

    public static final void verboseFormat(String str, String str2, Object... objArr) {
        sLog.doVerbose(str, str2, objArr);
    }

    public static void visible(String str) {
        sLog.doVisible(str);
    }

    public static void visibleFormat(String str, Object... objArr) {
        sLog.doVisible(str, objArr);
    }

    public static final void warn(String str, String str2) {
        sLog.doWarn(str, str2);
    }

    public static final void warnFormat(String str, String str2, Object... objArr) {
        sLog.doWarn(str, str2, objArr);
    }

    public synchronized void doSetPartnerLoggingEnabled(boolean z) {
        this.mIsPartnerLoggingEnabled = z;
    }

    public void doVerbose(String str, String str2) {
        if (isLoggingEnabled()) {
            this.mLogger.mo37741d(str, str2);
        }
    }

    public synchronized void doVisible(String str) {
        if (this.mIsPartnerLoggingEnabled) {
            this.mLogger.mo37744i(SDK_TAG, str);
        } else {
            doVerbose(SDK_TAG, str);
        }
    }

    public static final void warn(String str, String str2, Throwable th) {
        sLog.doWarn(str, str2, th);
    }

    private void doLogInfo(String str, String str2, Object... objArr) {
        if (isLoggingEnabled()) {
            this.mLogger.mo37744i(str, safelyFormat(str2, objArr));
        }
    }

    private void doWarn(String str, String str2, Object... objArr) {
        if (isLoggingEnabled()) {
            this.mLogger.mo37742e(str, safelyFormat(str2, objArr));
        }
    }

    public void doVerbose(String str, String str2, Object... objArr) {
        if (isLoggingEnabled()) {
            this.mLogger.mo37741d(str, safelyFormat(str2, objArr));
        }
    }

    public synchronized void doVisible(String str, Object... objArr) {
        if (this.mIsPartnerLoggingEnabled) {
            this.mLogger.mo37744i(SDK_TAG, safelyFormat(str, objArr));
        }
    }

    public void doWarn(String str, String str2, Throwable th) {
        if (isLoggingEnabled()) {
            this.mLogger.mo37743e(str, str2, th);
        }
    }
}

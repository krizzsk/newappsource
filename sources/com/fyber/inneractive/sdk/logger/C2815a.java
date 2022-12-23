package com.fyber.inneractive.sdk.logger;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.logger.a */
public class C2815a extends FMPLogger {
    public void debug(String str, Object... objArr) {
        if (IAlog.f12814a <= 3) {
            String.format(str, objArr);
        }
    }

    public void error(String str, Throwable th, Object... objArr) {
        if (IAlog.f12814a > 6) {
            return;
        }
        if (th == null) {
            String.format(str, objArr);
        } else {
            String.format(str, objArr);
        }
    }

    public void info(String str, Object... objArr) {
        if (IAlog.f12814a <= 4) {
            String.format(str, objArr);
        }
    }

    public void initialize(Context context) {
    }

    public void log(int i, Exception exc, String str, Object... objArr) {
        if (IAlog.f12814a > i) {
            return;
        }
        if (exc == null) {
            String.format(str, objArr);
        } else {
            String.format(str, objArr);
        }
    }

    public void verbose(String str, Object... objArr) {
        if (IAlog.f12814a <= 2) {
            String.format(str, objArr);
        }
    }

    public void warning(String str, Object... objArr) {
        if (IAlog.f12814a <= 4) {
            String.format(str, objArr);
        }
    }

    public void verbose(String str, Throwable th, Object... objArr) {
        if (IAlog.f12814a <= 2) {
            String.format(str, objArr);
        }
    }
}

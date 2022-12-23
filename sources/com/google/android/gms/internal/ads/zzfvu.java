package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final class zzfvu extends TimeoutException {
    public /* synthetic */ zzfvu(String str, zzfvs zzfvs) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

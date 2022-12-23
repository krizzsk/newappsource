package com.usebutton.sdk.internal.core;

import com.usebutton.sdk.internal.util.ButtonLog;

public class LoggingHandler implements ExceptionHandler {
    private static final String TAG = "LoggingHandler";

    public boolean handle(Throwable th) {
        ButtonLog.warn(TAG, "Exception reached LoggingHandler", th);
        return true;
    }
}

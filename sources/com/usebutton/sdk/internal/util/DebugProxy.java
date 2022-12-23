package com.usebutton.sdk.internal.util;

import com.usebutton.sdk.debug.DebugInterface;

public class DebugProxy implements DebugInterface {
    private static volatile DebugProxy instance;

    public static synchronized DebugInterface getInstance() {
        DebugProxy debugProxy;
        synchronized (DebugProxy.class) {
            if (instance == null) {
                instance = new DebugProxy();
            }
            debugProxy = instance;
        }
        return debugProxy;
    }

    public boolean isLoggingEnabled() {
        return ButtonLog.isPartnerLoggingEnabled();
    }

    public void setLoggingEnabled(boolean z) {
        ButtonLog.setPartnerLoggingEnabled(z);
    }
}

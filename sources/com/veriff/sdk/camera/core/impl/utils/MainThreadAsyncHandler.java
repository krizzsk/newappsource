package com.veriff.sdk.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import p177n1.C5807g;

public final class MainThreadAsyncHandler {
    private static volatile Handler sHandler;

    private MainThreadAsyncHandler() {
    }

    public static Handler getInstance() {
        if (sHandler != null) {
            return sHandler;
        }
        synchronized (MainThreadAsyncHandler.class) {
            if (sHandler == null) {
                sHandler = C5807g.m14238a(Looper.getMainLooper());
            }
        }
        return sHandler;
    }
}

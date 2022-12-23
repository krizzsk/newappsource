package com.veriff.sdk.camera.core.impl.utils;

import android.os.Looper;
import mf0.C24361g;

public final class Threads {
    public static void checkMainThread() {
        C24361g.m61193w("Not in application's main thread", isMainThread());
    }

    public static boolean isBackgroundThread() {
        return !isMainThread();
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}

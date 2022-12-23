package com.usebutton.sdk.internal.functional;

import android.os.Looper;

public class Validate {
    public static void isMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            StringBuilder k = C13555b.m33972k("Required to be on main thread, but was running on: ");
            k.append(Thread.currentThread().getName());
            throw new IllegalStateException(k.toString());
        }
    }

    public static void isNotMainThread() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            StringBuilder k = C13555b.m33972k("Required not to be on main thread, but was running on: ");
            k.append(Thread.currentThread().getName());
            throw new IllegalStateException(k.toString());
        }
    }

    public static void isNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(C25541a.m63881k("Expected object not to be null, message: ", str));
        }
    }
}

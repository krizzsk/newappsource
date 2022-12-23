package com.veriff.sdk.internal;

import android.os.Looper;

/* renamed from: com.veriff.sdk.internal.fr */
public class C21641fr {
    /* renamed from: a */
    public static void m52540a() {
        if (!m52541b()) {
            throw new IllegalStateException("This should be on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m52541b() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null || mainLooper.getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}

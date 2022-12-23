package com.usebutton.sdk.internal.util;

/* renamed from: com.usebutton.sdk.internal.util.Do */
public class C12356Do {
    public static void ifNotNull(Object obj, Runnable runnable) {
        if (obj != null) {
            runnable.run();
        }
    }
}

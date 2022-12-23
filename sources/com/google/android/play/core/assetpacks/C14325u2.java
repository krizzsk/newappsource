package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.u2 */
public final /* synthetic */ class C14325u2 implements ThreadFactory {

    /* renamed from: b */
    public static final /* synthetic */ C14325u2 f36074b = new C14325u2();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}

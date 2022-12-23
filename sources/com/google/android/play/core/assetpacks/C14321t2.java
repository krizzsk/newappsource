package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.t2 */
public final /* synthetic */ class C14321t2 implements ThreadFactory {

    /* renamed from: b */
    public static final /* synthetic */ C14321t2 f36057b = new C14321t2();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}

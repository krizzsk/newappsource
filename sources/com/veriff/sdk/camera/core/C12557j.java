package com.veriff.sdk.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* renamed from: com.veriff.sdk.camera.core.j */
public final /* synthetic */ class C12557j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CameraX f31068b;

    /* renamed from: c */
    public final /* synthetic */ Executor f31069c;

    /* renamed from: d */
    public final /* synthetic */ long f31070d;

    /* renamed from: e */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f31071e;

    public /* synthetic */ C12557j(CameraX cameraX, Executor executor, long j, CallbackToFutureAdapter.C0673a aVar) {
        this.f31068b = cameraX;
        this.f31069c = executor;
        this.f31070d = j;
        this.f31071e = aVar;
    }

    public final void run() {
        this.f31068b.lambda$initAndRetryRecursively$8(this.f31069c, this.f31070d, this.f31071e);
    }
}

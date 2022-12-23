package com.veriff.sdk.camera.core;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* renamed from: com.veriff.sdk.camera.core.i */
public final /* synthetic */ class C12524i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CameraX f31051b;

    /* renamed from: c */
    public final /* synthetic */ Context f31052c;

    /* renamed from: d */
    public final /* synthetic */ Executor f31053d;

    /* renamed from: e */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f31054e;

    /* renamed from: f */
    public final /* synthetic */ long f31055f;

    public /* synthetic */ C12524i(CameraX cameraX, Context context, Executor executor, CallbackToFutureAdapter.C0673a aVar, long j) {
        this.f31051b = cameraX;
        this.f31052c = context;
        this.f31053d = executor;
        this.f31054e = aVar;
        this.f31055f = j;
    }

    public final void run() {
        this.f31051b.lambda$initAndRetryRecursively$9(this.f31052c, this.f31053d, this.f31054e, this.f31055f);
    }
}

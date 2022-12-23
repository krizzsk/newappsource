package com.veriff.sdk.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: com.veriff.sdk.camera.camera2.internal.n */
public final /* synthetic */ class C12469n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f30991b;

    /* renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f30992c;

    public /* synthetic */ C12469n(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.C0673a aVar) {
        this.f30991b = camera2CameraImpl;
        this.f30992c = aVar;
    }

    public final void run() {
        this.f30991b.lambda$release$2(this.f30992c);
    }
}

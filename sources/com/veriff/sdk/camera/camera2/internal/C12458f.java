package com.veriff.sdk.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: com.veriff.sdk.camera.camera2.internal.f */
public final /* synthetic */ class C12458f implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f30963b;

    public /* synthetic */ C12458f(Camera2CameraImpl camera2CameraImpl) {
        this.f30963b = camera2CameraImpl;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f30963b.lambda$release$3(aVar);
    }
}

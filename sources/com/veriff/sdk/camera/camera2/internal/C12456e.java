package com.veriff.sdk.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: com.veriff.sdk.camera.camera2.internal.e */
public final /* synthetic */ class C12456e implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f30958b;

    public /* synthetic */ C12456e(Camera2CameraImpl camera2CameraImpl) {
        this.f30958b = camera2CameraImpl;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f30958b.lambda$getOrCreateUserReleaseFuture$4(aVar);
    }
}

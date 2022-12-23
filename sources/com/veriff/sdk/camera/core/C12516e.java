package com.veriff.sdk.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: com.veriff.sdk.camera.core.e */
public final /* synthetic */ class C12516e implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ CameraX f31035b;

    public /* synthetic */ C12516e(CameraX cameraX) {
        this.f31035b = cameraX;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return CameraX.lambda$shutdownLocked$5(this.f31035b, aVar);
    }
}

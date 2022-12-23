package com.veriff.sdk.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: com.veriff.sdk.camera.camera2.internal.r */
public final /* synthetic */ class C12473r implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ CaptureSession f30996b;

    public /* synthetic */ C12473r(CaptureSession captureSession) {
        this.f30996b = captureSession;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f30996b.lambda$release$1(aVar);
    }
}

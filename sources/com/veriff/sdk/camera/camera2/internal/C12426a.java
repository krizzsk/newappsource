package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;

/* renamed from: com.veriff.sdk.camera.camera2.internal.a */
public final /* synthetic */ class C12426a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CameraCaptureCallback f30941b;

    public /* synthetic */ C12426a(CameraCaptureCallback cameraCaptureCallback) {
        this.f30941b = cameraCaptureCallback;
    }

    public final void run() {
        this.f30941b.onCaptureCancelled();
    }
}

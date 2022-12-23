package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;
import com.veriff.sdk.camera.core.impl.CameraCaptureFailure;

/* renamed from: com.veriff.sdk.camera.camera2.internal.b */
public final /* synthetic */ class C12428b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f30942b = 1;

    /* renamed from: c */
    public final /* synthetic */ CameraCaptureCallback f30943c;

    /* renamed from: d */
    public final /* synthetic */ Object f30944d;

    public /* synthetic */ C12428b(Camera2CameraControlImpl camera2CameraControlImpl, CameraCaptureCallback cameraCaptureCallback) {
        this.f30944d = camera2CameraControlImpl;
        this.f30943c = cameraCaptureCallback;
    }

    public /* synthetic */ C12428b(CameraCaptureCallback cameraCaptureCallback, CameraCaptureFailure cameraCaptureFailure) {
        this.f30943c = cameraCaptureCallback;
        this.f30944d = cameraCaptureFailure;
    }

    public final void run() {
        switch (this.f30942b) {
            case 0:
                this.f30943c.onCaptureFailed((CameraCaptureFailure) this.f30944d);
                return;
            default:
                ((Camera2CameraControlImpl) this.f30944d).lambda$removeSessionCameraCaptureCallback$10(this.f30943c);
                return;
        }
    }
}

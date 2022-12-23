package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import com.veriff.sdk.camera.camera2.internal.CameraBurstCaptureCallback;

/* renamed from: com.veriff.sdk.camera.camera2.internal.q */
public final /* synthetic */ class C12472q implements CameraBurstCaptureCallback.CaptureSequenceCallback {

    /* renamed from: a */
    public final /* synthetic */ CaptureSession f30995a;

    public /* synthetic */ C12472q(CaptureSession captureSession) {
        this.f30995a = captureSession;
    }

    /* renamed from: a */
    public final void mo38675a(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        this.f30995a.lambda$issueBurstCaptureRequest$2(cameraCaptureSession, i, z);
    }
}

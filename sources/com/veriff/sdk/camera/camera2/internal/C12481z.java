package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;

/* renamed from: com.veriff.sdk.camera.camera2.internal.z */
public final /* synthetic */ class C12481z implements Camera2CameraControlImpl.CaptureResultListener {

    /* renamed from: a */
    public final /* synthetic */ FocusMeteringControl f31014a;

    /* renamed from: b */
    public final /* synthetic */ int f31015b;

    /* renamed from: c */
    public final /* synthetic */ long f31016c;

    public /* synthetic */ C12481z(FocusMeteringControl focusMeteringControl, int i, long j) {
        this.f31014a = focusMeteringControl;
        this.f31015b = i;
        this.f31016c = j;
    }

    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        return this.f31014a.lambda$cancelFocusAndMeteringInternal$7(this.f31015b, this.f31016c, totalCaptureResult);
    }
}

package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;

/* renamed from: com.veriff.sdk.camera.camera2.internal.v */
public final /* synthetic */ class C12477v implements Camera2CameraControlImpl.CaptureResultListener {

    /* renamed from: a */
    public final /* synthetic */ FocusMeteringControl f31005a;

    /* renamed from: b */
    public final /* synthetic */ boolean f31006b;

    /* renamed from: c */
    public final /* synthetic */ long f31007c;

    public /* synthetic */ C12477v(FocusMeteringControl focusMeteringControl, boolean z, long j) {
        this.f31005a = focusMeteringControl;
        this.f31006b = z;
        this.f31007c = j;
    }

    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        return this.f31005a.lambda$executeMeteringAction$2(this.f31006b, this.f31007c, totalCaptureResult);
    }
}

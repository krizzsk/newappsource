package com.veriff.sdk.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.ImageCapture;

/* renamed from: com.veriff.sdk.camera.core.b0 */
public final /* synthetic */ class C12511b0 implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ ImageCapture.CaptureCallbackChecker f31025b;

    /* renamed from: c */
    public final /* synthetic */ ImageCapture.CaptureCallbackChecker.CaptureResultChecker f31026c;

    /* renamed from: d */
    public final /* synthetic */ long f31027d;

    /* renamed from: e */
    public final /* synthetic */ long f31028e;

    /* renamed from: f */
    public final /* synthetic */ Object f31029f;

    public /* synthetic */ C12511b0(ImageCapture.CaptureCallbackChecker captureCallbackChecker, ImageCapture.CaptureCallbackChecker.CaptureResultChecker captureResultChecker, long j, long j2, Object obj) {
        this.f31025b = captureCallbackChecker;
        this.f31026c = captureResultChecker;
        this.f31027d = j;
        this.f31028e = j2;
        this.f31029f = obj;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f31025b.lambda$checkCaptureResult$0(this.f31026c, this.f31027d, this.f31028e, this.f31029f, aVar);
    }
}

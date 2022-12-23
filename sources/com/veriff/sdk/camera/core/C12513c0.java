package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.ImageCapture;

/* renamed from: com.veriff.sdk.camera.core.c0 */
public final /* synthetic */ class C12513c0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ImageCapture.ImageCaptureRequest f31030b;

    /* renamed from: c */
    public final /* synthetic */ int f31031c;

    /* renamed from: d */
    public final /* synthetic */ String f31032d;

    /* renamed from: e */
    public final /* synthetic */ Throwable f31033e;

    public /* synthetic */ C12513c0(ImageCapture.ImageCaptureRequest imageCaptureRequest, int i, String str, Throwable th) {
        this.f31030b = imageCaptureRequest;
        this.f31031c = i;
        this.f31032d = str;
        this.f31033e = th;
    }

    public final void run() {
        this.f31030b.lambda$notifyCallbackError$1(this.f31031c, this.f31032d, this.f31033e);
    }
}

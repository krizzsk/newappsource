package com.veriff.sdk.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.ImageCapture;

/* renamed from: com.veriff.sdk.camera.core.w */
public final /* synthetic */ class C12573w implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ int f31106b;

    /* renamed from: c */
    public final /* synthetic */ ImageCapture f31107c;

    /* renamed from: d */
    public final /* synthetic */ Object f31108d;

    public /* synthetic */ C12573w(ImageCapture imageCapture, Object obj, int i) {
        this.f31106b = i;
        this.f31107c = imageCapture;
        this.f31108d = obj;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        switch (this.f31106b) {
            case 0:
                return this.f31107c.lambda$takePictureInternal$10((ImageCapture.ImageCaptureRequest) this.f31108d, aVar);
            default:
                return this.f31107c.lambda$openTorch$15((ImageCapture.TakePictureState) this.f31108d, aVar);
        }
    }
}

package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.ImageCapture;
import com.veriff.sdk.camera.core.impl.utils.futures.AsyncFunction;
import p695od.C18728c;

/* renamed from: com.veriff.sdk.camera.core.y */
public final /* synthetic */ class C12575y implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f31110a;

    /* renamed from: b */
    public final /* synthetic */ ImageCapture.ImageCaptureRequest f31111b;

    public /* synthetic */ C12575y(ImageCapture imageCapture, ImageCapture.ImageCaptureRequest imageCaptureRequest) {
        this.f31110a = imageCapture;
        this.f31111b = imageCaptureRequest;
    }

    public final C18728c apply(Object obj) {
        return this.f31110a.lambda$takePictureInternal$8(this.f31111b, (Void) obj);
    }
}

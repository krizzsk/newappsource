package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.ImageCapture;
import com.veriff.sdk.camera.core.impl.CameraCaptureResult;
import com.veriff.sdk.camera.core.impl.utils.futures.AsyncFunction;
import p695od.C18728c;

/* renamed from: com.veriff.sdk.camera.core.z */
public final /* synthetic */ class C12576z implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f31112a;

    /* renamed from: b */
    public final /* synthetic */ ImageCapture.TakePictureState f31113b;

    public /* synthetic */ C12576z(ImageCapture imageCapture, ImageCapture.TakePictureState takePictureState) {
        this.f31112a = imageCapture;
        this.f31113b = takePictureState;
    }

    public final C18728c apply(Object obj) {
        return this.f31112a.lambda$preTakePicture$11(this.f31113b, (CameraCaptureResult) obj);
    }
}

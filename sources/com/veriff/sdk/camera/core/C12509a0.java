package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.ImageCapture;
import com.veriff.sdk.camera.core.impl.utils.futures.AsyncFunction;
import p695od.C18728c;

/* renamed from: com.veriff.sdk.camera.core.a0 */
public final /* synthetic */ class C12509a0 implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f31020a;

    /* renamed from: b */
    public final /* synthetic */ ImageCapture.TakePictureState f31021b;

    public /* synthetic */ C12509a0(ImageCapture imageCapture, ImageCapture.TakePictureState takePictureState) {
        this.f31020a = imageCapture;
        this.f31021b = takePictureState;
    }

    public final C18728c apply(Object obj) {
        return this.f31020a.lambda$preTakePicture$12(this.f31021b, (Void) obj);
    }
}

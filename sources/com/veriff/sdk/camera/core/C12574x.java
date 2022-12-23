package com.veriff.sdk.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.impl.ImageReaderProxy;

/* renamed from: com.veriff.sdk.camera.core.x */
public final /* synthetic */ class C12574x implements ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f31109b;

    public /* synthetic */ C12574x(CallbackToFutureAdapter.C0673a aVar) {
        this.f31109b = aVar;
    }

    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        ImageCapture.lambda$takePictureInternal$7(this.f31109b, imageReaderProxy);
    }
}

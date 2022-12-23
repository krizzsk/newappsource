package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.impl.ImageReaderProxy;

/* renamed from: com.veriff.sdk.camera.core.i0 */
public final /* synthetic */ class C12525i0 implements ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: b */
    public final /* synthetic */ SafeCloseImageReaderProxy f31056b;

    /* renamed from: c */
    public final /* synthetic */ ImageReaderProxy.OnImageAvailableListener f31057c;

    public /* synthetic */ C12525i0(SafeCloseImageReaderProxy safeCloseImageReaderProxy, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        this.f31056b = safeCloseImageReaderProxy;
        this.f31057c = onImageAvailableListener;
    }

    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        this.f31056b.lambda$setOnImageAvailableListener$1(this.f31057c, imageReaderProxy);
    }
}

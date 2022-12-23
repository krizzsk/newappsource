package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.impl.ImageReaderProxy;

/* renamed from: com.veriff.sdk.camera.core.h0 */
public final /* synthetic */ class C12523h0 implements ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: b */
    public final /* synthetic */ ProcessingSurface f31050b;

    public /* synthetic */ C12523h0(ProcessingSurface processingSurface) {
        this.f31050b = processingSurface;
    }

    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        this.f31050b.lambda$new$0(imageReaderProxy);
    }
}

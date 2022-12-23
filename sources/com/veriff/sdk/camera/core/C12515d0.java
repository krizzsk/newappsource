package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.impl.ImageReaderProxy;

/* renamed from: com.veriff.sdk.camera.core.d0 */
public final /* synthetic */ class C12515d0 implements ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: b */
    public final /* synthetic */ MetadataImageReader f31034b;

    public /* synthetic */ C12515d0(MetadataImageReader metadataImageReader) {
        this.f31034b = metadataImageReader;
    }

    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        this.f31034b.lambda$new$0(imageReaderProxy);
    }
}

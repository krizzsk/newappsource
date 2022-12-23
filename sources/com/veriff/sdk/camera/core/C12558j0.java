package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.ForwardingImageProxy;

/* renamed from: com.veriff.sdk.camera.core.j0 */
public final /* synthetic */ class C12558j0 implements ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a */
    public final /* synthetic */ SafeCloseImageReaderProxy f31072a;

    public /* synthetic */ C12558j0(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        this.f31072a = safeCloseImageReaderProxy;
    }

    public final void onImageClose(ImageProxy imageProxy) {
        this.f31072a.lambda$new$0(imageProxy);
    }
}

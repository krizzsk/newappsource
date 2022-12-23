package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.impl.ImageReaderProxy;

/* renamed from: com.veriff.sdk.camera.core.b */
public final /* synthetic */ class C12510b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31022b;

    /* renamed from: c */
    public final /* synthetic */ ImageReaderProxy.OnImageAvailableListener f31023c;

    /* renamed from: d */
    public final /* synthetic */ ImageReaderProxy f31024d;

    public /* synthetic */ C12510b(ImageReaderProxy imageReaderProxy, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, int i) {
        this.f31022b = i;
        this.f31024d = imageReaderProxy;
        this.f31023c = onImageAvailableListener;
    }

    public final void run() {
        switch (this.f31022b) {
            case 0:
                ((AndroidImageReaderProxy) this.f31024d).lambda$setOnImageAvailableListener$0(this.f31023c);
                return;
            default:
                ((MetadataImageReader) this.f31024d).lambda$enqueueImageProxy$1(this.f31023c);
                return;
        }
    }
}

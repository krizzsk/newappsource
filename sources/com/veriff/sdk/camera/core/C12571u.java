package com.veriff.sdk.camera.core;

/* renamed from: com.veriff.sdk.camera.core.u */
public final /* synthetic */ class C12571u implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SafeCloseImageReaderProxy f31101b;

    public /* synthetic */ C12571u(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        this.f31101b = safeCloseImageReaderProxy;
    }

    public final void run() {
        this.f31101b.safeClose();
    }
}

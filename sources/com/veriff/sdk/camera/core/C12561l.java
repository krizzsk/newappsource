package com.veriff.sdk.camera.core;

/* renamed from: com.veriff.sdk.camera.core.l */
public final /* synthetic */ class C12561l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31077b;

    /* renamed from: c */
    public final /* synthetic */ Object f31078c;

    public /* synthetic */ C12561l(Object obj, int i) {
        this.f31077b = i;
        this.f31078c = obj;
    }

    public final void run() {
        switch (this.f31077b) {
            case 0:
                ((SafeCloseImageReaderProxy) this.f31078c).safeClose();
                return;
            default:
                ((SurfaceRequest) this.f31078c).lambda$new$3();
                return;
        }
    }
}

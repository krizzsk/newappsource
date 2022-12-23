package com.veriff.sdk.camera.view;

/* renamed from: com.veriff.sdk.camera.view.h */
public final /* synthetic */ class C12591h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SurfaceViewImplementation f31128b;

    public /* synthetic */ C12591h(SurfaceViewImplementation surfaceViewImplementation) {
        this.f31128b = surfaceViewImplementation;
    }

    public final void run() {
        this.f31128b.notifySurfaceNotInUse();
    }
}

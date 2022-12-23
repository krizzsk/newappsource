package com.veriff.sdk.camera.view;

import com.veriff.sdk.camera.core.SurfaceRequest;

/* renamed from: com.veriff.sdk.camera.view.i */
public final /* synthetic */ class C12592i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SurfaceViewImplementation f31129b;

    /* renamed from: c */
    public final /* synthetic */ SurfaceRequest f31130c;

    public /* synthetic */ C12592i(SurfaceViewImplementation surfaceViewImplementation, SurfaceRequest surfaceRequest) {
        this.f31129b = surfaceViewImplementation;
        this.f31130c = surfaceRequest;
    }

    public final void run() {
        this.f31129b.lambda$onSurfaceRequested$0(this.f31130c);
    }
}

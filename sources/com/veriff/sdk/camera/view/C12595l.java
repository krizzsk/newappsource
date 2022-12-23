package com.veriff.sdk.camera.view;

import com.veriff.sdk.camera.core.SurfaceRequest;

/* renamed from: com.veriff.sdk.camera.view.l */
public final /* synthetic */ class C12595l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ TextureViewImplementation f31133b;

    /* renamed from: c */
    public final /* synthetic */ SurfaceRequest f31134c;

    public /* synthetic */ C12595l(TextureViewImplementation textureViewImplementation, SurfaceRequest surfaceRequest) {
        this.f31133b = textureViewImplementation;
        this.f31134c = surfaceRequest;
    }

    public final void run() {
        this.f31133b.lambda$onSurfaceRequested$0(this.f31134c);
    }
}

package com.veriff.sdk.camera.view;

import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.SurfaceRequest;
import p695od.C18728c;

/* renamed from: com.veriff.sdk.camera.view.n */
public final /* synthetic */ class C12597n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ TextureViewImplementation f31137b;

    /* renamed from: c */
    public final /* synthetic */ Surface f31138c;

    /* renamed from: d */
    public final /* synthetic */ C18728c f31139d;

    /* renamed from: e */
    public final /* synthetic */ SurfaceRequest f31140e;

    public /* synthetic */ C12597n(TextureViewImplementation textureViewImplementation, Surface surface, CallbackToFutureAdapter.C0675c cVar, SurfaceRequest surfaceRequest) {
        this.f31137b = textureViewImplementation;
        this.f31138c = surface;
        this.f31139d = cVar;
        this.f31140e = surfaceRequest;
    }

    public final void run() {
        this.f31137b.lambda$tryToProvidePreviewSurface$2(this.f31138c, this.f31139d, this.f31140e);
    }
}

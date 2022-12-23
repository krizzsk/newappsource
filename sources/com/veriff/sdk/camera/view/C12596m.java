package com.veriff.sdk.camera.view;

import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: com.veriff.sdk.camera.view.m */
public final /* synthetic */ class C12596m implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ TextureViewImplementation f31135b;

    /* renamed from: c */
    public final /* synthetic */ Surface f31136c;

    public /* synthetic */ C12596m(TextureViewImplementation textureViewImplementation, Surface surface) {
        this.f31135b = textureViewImplementation;
        this.f31136c = surface;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f31135b.lambda$tryToProvidePreviewSurface$1(this.f31136c, aVar);
    }
}

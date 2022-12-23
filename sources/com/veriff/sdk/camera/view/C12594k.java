package com.veriff.sdk.camera.view;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: com.veriff.sdk.camera.view.k */
public final /* synthetic */ class C12594k implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ TextureViewImplementation f31132b;

    public /* synthetic */ C12594k(TextureViewImplementation textureViewImplementation) {
        this.f31132b = textureViewImplementation;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f31132b.lambda$waitForNextFrame$3(aVar);
    }
}

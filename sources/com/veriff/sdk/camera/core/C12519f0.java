package com.veriff.sdk.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: com.veriff.sdk.camera.core.f0 */
public final /* synthetic */ class C12519f0 implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ ProcessingImageReader f31041b;

    public /* synthetic */ C12519f0(ProcessingImageReader processingImageReader) {
        this.f31041b = processingImageReader;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f31041b.lambda$getCloseFuture$0(aVar);
    }
}

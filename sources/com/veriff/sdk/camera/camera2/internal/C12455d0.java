package com.veriff.sdk.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: com.veriff.sdk.camera.camera2.internal.d0 */
public final /* synthetic */ class C12455d0 implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ SynchronizedCaptureSessionImpl f30957b;

    public /* synthetic */ C12455d0(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl) {
        this.f30957b = synchronizedCaptureSessionImpl;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f30957b.lambda$new$0(aVar);
    }
}

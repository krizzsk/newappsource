package com.veriff.sdk.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: com.veriff.sdk.camera.camera2.internal.h0 */
public final /* synthetic */ class C12463h0 implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ TorchControl f30974b;

    /* renamed from: c */
    public final /* synthetic */ boolean f30975c;

    public /* synthetic */ C12463h0(TorchControl torchControl, boolean z) {
        this.f30974b = torchControl;
        this.f30975c = z;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f30974b.lambda$enableTorch$1(this.f30975c, aVar);
    }
}

package com.veriff.sdk.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: com.veriff.sdk.camera.camera2.internal.g0 */
public final /* synthetic */ class C12461g0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ TorchControl f30968b;

    /* renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f30969c;

    /* renamed from: d */
    public final /* synthetic */ boolean f30970d;

    public /* synthetic */ C12461g0(CallbackToFutureAdapter.C0673a aVar, TorchControl torchControl, boolean z) {
        this.f30968b = torchControl;
        this.f30969c = aVar;
        this.f30970d = z;
    }

    public final void run() {
        this.f30968b.lambda$enableTorch$0(this.f30969c, this.f30970d);
    }
}

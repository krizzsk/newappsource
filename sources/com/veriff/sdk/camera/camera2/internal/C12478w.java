package com.veriff.sdk.camera.camera2.internal;

/* renamed from: com.veriff.sdk.camera.camera2.internal.w */
public final /* synthetic */ class C12478w implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FocusMeteringControl f31008b;

    /* renamed from: c */
    public final /* synthetic */ long f31009c;

    public /* synthetic */ C12478w(FocusMeteringControl focusMeteringControl, long j) {
        this.f31008b = focusMeteringControl;
        this.f31009c = j;
    }

    public final void run() {
        this.f31008b.lambda$executeMeteringAction$4(this.f31009c);
    }
}

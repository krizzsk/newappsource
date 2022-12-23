package com.veriff.sdk.camera.camera2.internal;

/* renamed from: com.veriff.sdk.camera.camera2.internal.x */
public final /* synthetic */ class C12479x implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FocusMeteringControl f31010b;

    /* renamed from: c */
    public final /* synthetic */ long f31011c;

    public /* synthetic */ C12479x(FocusMeteringControl focusMeteringControl, long j) {
        this.f31010b = focusMeteringControl;
        this.f31011c = j;
    }

    public final void run() {
        this.f31010b.lambda$executeMeteringAction$3(this.f31011c);
    }
}

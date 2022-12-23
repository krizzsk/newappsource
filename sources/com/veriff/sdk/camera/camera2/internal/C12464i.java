package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.core.UseCase;

/* renamed from: com.veriff.sdk.camera.camera2.internal.i */
public final /* synthetic */ class C12464i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f30976b;

    /* renamed from: c */
    public final /* synthetic */ UseCase f30977c;

    public /* synthetic */ C12464i(Camera2CameraImpl camera2CameraImpl, UseCase useCase) {
        this.f30976b = camera2CameraImpl;
        this.f30977c = useCase;
    }

    public final void run() {
        this.f30976b.lambda$onUseCaseUpdated$7(this.f30977c);
    }
}

package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.core.UseCase;

/* renamed from: com.veriff.sdk.camera.camera2.internal.j */
public final /* synthetic */ class C12465j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f30978b;

    /* renamed from: c */
    public final /* synthetic */ Object f30979c;

    /* renamed from: d */
    public final /* synthetic */ Object f30980d;

    public /* synthetic */ C12465j(int i, Object obj, Object obj2) {
        this.f30978b = i;
        this.f30979c = obj;
        this.f30980d = obj2;
    }

    public final void run() {
        switch (this.f30978b) {
            case 0:
                ((Camera2CameraImpl) this.f30979c).lambda$onUseCaseActive$5((UseCase) this.f30980d);
                return;
            default:
                ((SynchronizedCaptureSessionBaseImpl) this.f30979c).lambda$onClosed$3((SynchronizedCaptureSession) this.f30980d);
                return;
        }
    }
}

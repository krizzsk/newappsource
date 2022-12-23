package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.core.UseCase;

/* renamed from: com.veriff.sdk.camera.camera2.internal.h */
public final /* synthetic */ class C12462h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f30971b;

    /* renamed from: c */
    public final /* synthetic */ Object f30972c;

    /* renamed from: d */
    public final /* synthetic */ Object f30973d;

    public /* synthetic */ C12462h(int i, Object obj, Object obj2) {
        this.f30971b = i;
        this.f30972c = obj;
        this.f30973d = obj2;
    }

    public final void run() {
        switch (this.f30971b) {
            case 0:
                ((Camera2CameraImpl) this.f30972c).lambda$onUseCaseInactive$6((UseCase) this.f30973d);
                return;
            default:
                ((SynchronizedCaptureSessionBaseImpl) this.f30972c).lambda$onSessionFinished$4((SynchronizedCaptureSession) this.f30973d);
                return;
        }
    }
}

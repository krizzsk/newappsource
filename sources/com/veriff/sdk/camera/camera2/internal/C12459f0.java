package com.veriff.sdk.camera.camera2.internal;

/* renamed from: com.veriff.sdk.camera.camera2.internal.f0 */
public final /* synthetic */ class C12459f0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f30964b;

    /* renamed from: c */
    public final /* synthetic */ Object f30965c;

    public /* synthetic */ C12459f0(Object obj, int i) {
        this.f30964b = i;
        this.f30965c = obj;
    }

    public final void run() {
        switch (this.f30964b) {
            case 0:
                ((SynchronizedCaptureSessionImpl) this.f30965c).lambda$close$2();
                return;
            default:
                ((Camera2CameraControlImpl) this.f30965c).updateSessionConfigSynchronous();
                return;
        }
    }
}

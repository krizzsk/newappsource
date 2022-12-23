package com.veriff.sdk.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: com.veriff.sdk.camera.camera2.internal.l */
public final /* synthetic */ class C12467l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f30984b;

    /* renamed from: c */
    public final /* synthetic */ Object f30985c;

    /* renamed from: d */
    public final /* synthetic */ Object f30986d;

    public /* synthetic */ C12467l(int i, Object obj, Object obj2) {
        this.f30984b = i;
        this.f30985c = obj;
        this.f30986d = obj2;
    }

    public final void run() {
        switch (this.f30984b) {
            case 0:
                Camera2CameraImpl.lambda$configAndClose$0((Surface) this.f30985c, (SurfaceTexture) this.f30986d);
                return;
            default:
                ((Camera2CameraControlImpl) this.f30985c).lambda$triggerAePrecapture$5((CallbackToFutureAdapter.C0673a) this.f30986d);
                return;
        }
    }
}

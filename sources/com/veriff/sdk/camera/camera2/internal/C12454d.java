package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;
import java.util.Collection;

/* renamed from: com.veriff.sdk.camera.camera2.internal.d */
public final /* synthetic */ class C12454d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f30954b;

    /* renamed from: c */
    public final /* synthetic */ Object f30955c;

    /* renamed from: d */
    public final /* synthetic */ Object f30956d;

    public /* synthetic */ C12454d(int i, Object obj, Object obj2) {
        this.f30954b = i;
        this.f30955c = obj;
        this.f30956d = obj2;
    }

    public final void run() {
        switch (this.f30954b) {
            case 0:
                ((Camera2CameraControlImpl.CameraControlSessionCallback) this.f30955c).lambda$onCaptureCompleted$0((TotalCaptureResult) this.f30956d);
                return;
            default:
                ((Camera2CameraImpl) this.f30955c).lambda$attachUseCases$11((Collection) this.f30956d);
                return;
        }
    }
}

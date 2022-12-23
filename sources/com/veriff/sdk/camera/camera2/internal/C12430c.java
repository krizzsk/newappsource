package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;
import com.veriff.sdk.camera.core.impl.CameraCaptureResult;
import com.veriff.sdk.camera.core.impl.SessionConfig;

/* renamed from: com.veriff.sdk.camera.camera2.internal.c */
public final /* synthetic */ class C12430c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f30947b;

    /* renamed from: c */
    public final /* synthetic */ Object f30948c;

    /* renamed from: d */
    public final /* synthetic */ Object f30949d;

    public /* synthetic */ C12430c(int i, Object obj, Object obj2) {
        this.f30947b = i;
        this.f30948c = obj;
        this.f30949d = obj2;
    }

    public final void run() {
        switch (this.f30947b) {
            case 0:
                ((CameraCaptureCallback) this.f30948c).onCaptureCompleted((CameraCaptureResult) this.f30949d);
                return;
            default:
                ((SessionConfig.ErrorListener) this.f30948c).onError((SessionConfig) this.f30949d, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
                return;
        }
    }
}

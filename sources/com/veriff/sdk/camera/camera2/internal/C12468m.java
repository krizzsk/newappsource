package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import com.veriff.sdk.camera.core.impl.ImmediateSurface;

/* renamed from: com.veriff.sdk.camera.camera2.internal.m */
public final /* synthetic */ class C12468m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f30987b;

    /* renamed from: c */
    public final /* synthetic */ CaptureSession f30988c;

    /* renamed from: d */
    public final /* synthetic */ DeferrableSurface f30989d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f30990e;

    public /* synthetic */ C12468m(Camera2CameraImpl camera2CameraImpl, CaptureSession captureSession, ImmediateSurface immediateSurface, C12467l lVar) {
        this.f30987b = camera2CameraImpl;
        this.f30988c = captureSession;
        this.f30989d = immediateSurface;
        this.f30990e = lVar;
    }

    public final void run() {
        this.f30987b.lambda$configAndClose$1(this.f30988c, this.f30989d, this.f30990e);
    }
}

package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;
import p695od.C18728c;

/* renamed from: com.veriff.sdk.camera.camera2.internal.s */
public final /* synthetic */ class C12474s implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ CaptureSession f30997a;

    /* renamed from: b */
    public final /* synthetic */ SessionConfig f30998b;

    /* renamed from: c */
    public final /* synthetic */ CameraDevice f30999c;

    public /* synthetic */ C12474s(CaptureSession captureSession, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        this.f30997a = captureSession;
        this.f30998b = sessionConfig;
        this.f30999c = cameraDevice;
    }

    public final C18728c apply(Object obj) {
        return this.f30997a.lambda$open$0(this.f30998b, this.f30999c, (List) obj);
    }
}

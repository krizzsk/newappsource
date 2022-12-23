package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import com.veriff.sdk.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import com.veriff.sdk.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;
import p695od.C18728c;

/* renamed from: com.veriff.sdk.camera.camera2.internal.e0 */
public final /* synthetic */ class C12457e0 implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ SynchronizedCaptureSessionImpl f30959a;

    /* renamed from: b */
    public final /* synthetic */ CameraDevice f30960b;

    /* renamed from: c */
    public final /* synthetic */ SessionConfigurationCompat f30961c;

    /* renamed from: d */
    public final /* synthetic */ List f30962d;

    public /* synthetic */ C12457e0(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl, CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        this.f30959a = synchronizedCaptureSessionImpl;
        this.f30960b = cameraDevice;
        this.f30961c = sessionConfigurationCompat;
        this.f30962d = list;
    }

    public final C18728c apply(Object obj) {
        return this.f30959a.lambda$openCaptureSession$1(this.f30960b, this.f30961c, this.f30962d, (List) obj);
    }
}

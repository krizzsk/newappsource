package com.veriff.sdk.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.camera2.internal.compat.CameraDeviceCompat;
import com.veriff.sdk.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import java.util.List;

/* renamed from: com.veriff.sdk.camera.camera2.internal.c0 */
public final /* synthetic */ class C12431c0 implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl f30950b;

    /* renamed from: c */
    public final /* synthetic */ List f30951c;

    /* renamed from: d */
    public final /* synthetic */ CameraDeviceCompat f30952d;

    /* renamed from: e */
    public final /* synthetic */ SessionConfigurationCompat f30953e;

    public /* synthetic */ C12431c0(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, List list, CameraDeviceCompat cameraDeviceCompat, SessionConfigurationCompat sessionConfigurationCompat) {
        this.f30950b = synchronizedCaptureSessionBaseImpl;
        this.f30951c = list;
        this.f30952d = cameraDeviceCompat;
        this.f30953e = sessionConfigurationCompat;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f30950b.lambda$openCaptureSession$0(this.f30951c, this.f30952d, this.f30953e, aVar);
    }
}

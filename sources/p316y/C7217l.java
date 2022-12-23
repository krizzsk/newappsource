package p316y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import p316y.C7208f;

/* renamed from: y.l */
public final /* synthetic */ class C7217l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C7208f.C7210b f22359b;

    /* renamed from: c */
    public final /* synthetic */ CameraCaptureSession f22360c;

    /* renamed from: d */
    public final /* synthetic */ CaptureRequest f22361d;

    /* renamed from: e */
    public final /* synthetic */ long f22362e;

    /* renamed from: f */
    public final /* synthetic */ long f22363f;

    public /* synthetic */ C7217l(C7208f.C7210b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        this.f22359b = bVar;
        this.f22360c = cameraCaptureSession;
        this.f22361d = captureRequest;
        this.f22362e = j;
        this.f22363f = j2;
    }

    public final void run() {
        C7208f.C7210b bVar = this.f22359b;
        bVar.f22334a.onCaptureStarted(this.f22360c, this.f22361d, this.f22362e, this.f22363f);
    }
}

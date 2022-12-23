package p316y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import p316y.C7208f;

/* renamed from: y.j */
public final /* synthetic */ class C7215j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C7208f.C7210b f22350b;

    /* renamed from: c */
    public final /* synthetic */ CameraCaptureSession f22351c;

    /* renamed from: d */
    public final /* synthetic */ CaptureRequest f22352d;

    /* renamed from: e */
    public final /* synthetic */ CaptureResult f22353e;

    public /* synthetic */ C7215j(C7208f.C7210b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.f22350b = bVar;
        this.f22351c = cameraCaptureSession;
        this.f22352d = captureRequest;
        this.f22353e = captureResult;
    }

    public final void run() {
        C7208f.C7210b bVar = this.f22350b;
        bVar.f22334a.onCaptureProgressed(this.f22351c, this.f22352d, this.f22353e);
    }
}

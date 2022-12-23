package p316y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import p316y.C7208f;

/* renamed from: y.h */
public final /* synthetic */ class C7213h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C7208f.C7210b f22341b;

    /* renamed from: c */
    public final /* synthetic */ CameraCaptureSession f22342c;

    /* renamed from: d */
    public final /* synthetic */ CaptureRequest f22343d;

    /* renamed from: e */
    public final /* synthetic */ Surface f22344e;

    /* renamed from: f */
    public final /* synthetic */ long f22345f;

    public /* synthetic */ C7213h(C7208f.C7210b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        this.f22341b = bVar;
        this.f22342c = cameraCaptureSession;
        this.f22343d = captureRequest;
        this.f22344e = surface;
        this.f22345f = j;
    }

    public final void run() {
        C7208f.C7210b bVar = this.f22341b;
        C7202c.m16810a(bVar.f22334a, this.f22342c, this.f22343d, this.f22344e, this.f22345f);
    }
}

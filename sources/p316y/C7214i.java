package p316y;

import android.hardware.camera2.CameraCaptureSession;
import p316y.C7208f;

/* renamed from: y.i */
public final /* synthetic */ class C7214i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C7208f.C7210b f22346b;

    /* renamed from: c */
    public final /* synthetic */ CameraCaptureSession f22347c;

    /* renamed from: d */
    public final /* synthetic */ int f22348d;

    /* renamed from: e */
    public final /* synthetic */ long f22349e;

    public /* synthetic */ C7214i(C7208f.C7210b bVar, CameraCaptureSession cameraCaptureSession, int i, long j) {
        this.f22346b = bVar;
        this.f22347c = cameraCaptureSession;
        this.f22348d = i;
        this.f22349e = j;
    }

    public final void run() {
        C7208f.C7210b bVar = this.f22346b;
        bVar.f22334a.onCaptureSequenceCompleted(this.f22347c, this.f22348d, this.f22349e);
    }
}

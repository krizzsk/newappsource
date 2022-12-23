package p316y;

import android.hardware.camera2.CameraCaptureSession;
import p316y.C7208f;

/* renamed from: y.g */
public final /* synthetic */ class C7212g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C7208f.C7210b f22338b;

    /* renamed from: c */
    public final /* synthetic */ CameraCaptureSession f22339c;

    /* renamed from: d */
    public final /* synthetic */ int f22340d;

    public /* synthetic */ C7212g(C7208f.C7210b bVar, CameraCaptureSession cameraCaptureSession, int i) {
        this.f22338b = bVar;
        this.f22339c = cameraCaptureSession;
        this.f22340d = i;
    }

    public final void run() {
        C7208f.C7210b bVar = this.f22338b;
        bVar.f22334a.onCaptureSequenceAborted(this.f22339c, this.f22340d);
    }
}

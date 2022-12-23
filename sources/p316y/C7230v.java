package p316y;

import android.hardware.camera2.CameraDevice;
import p316y.C7226t;

/* renamed from: y.v */
public final /* synthetic */ class C7230v implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C7226t.C7228b f22382b;

    /* renamed from: c */
    public final /* synthetic */ CameraDevice f22383c;

    /* renamed from: d */
    public final /* synthetic */ int f22384d;

    public /* synthetic */ C7230v(C7226t.C7228b bVar, CameraDevice cameraDevice, int i) {
        this.f22382b = bVar;
        this.f22383c = cameraDevice;
        this.f22384d = i;
    }

    public final void run() {
        C7226t.C7228b bVar = this.f22382b;
        bVar.f22377a.onError(this.f22383c, this.f22384d);
    }
}

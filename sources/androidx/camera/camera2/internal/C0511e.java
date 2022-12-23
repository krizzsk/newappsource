package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import p102h0.C5018c;
import p304x.C7025a1;
import p316y.C7196a;

/* renamed from: androidx.camera.camera2.internal.e */
public final class C0511e implements C5018c<Void> {

    /* renamed from: a */
    public final /* synthetic */ C7025a1 f1779a;

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f1780b;

    public C0511e(Camera2CameraImpl camera2CameraImpl, C7025a1 a1Var) {
        this.f1780b = camera2CameraImpl;
        this.f1779a = a1Var;
    }

    public final void onFailure(Throwable th) {
    }

    public final void onSuccess(Object obj) {
        CameraDevice cameraDevice;
        Void voidR = (Void) obj;
        this.f1780b.f1698o.remove(this.f1779a);
        int i = Camera2CameraImpl.C0494b.f1711a[this.f1780b.f1689f.ordinal()];
        if (i != 3) {
            if (i != 6) {
                if (i != 7) {
                    return;
                }
            } else if (this.f1780b.f1696m == 0) {
                return;
            }
        }
        if (this.f1780b.mo2253n() && (cameraDevice = this.f1780b.f1695l) != null) {
            C7196a.m16799a(cameraDevice);
            this.f1780b.f1695l = null;
        }
    }
}

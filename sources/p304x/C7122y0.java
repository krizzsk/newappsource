package p304x;

import android.hardware.camera2.CameraCaptureSession;
import p066e0.C4424e;

/* renamed from: x.y0 */
public final class C7122y0 extends C4424e {

    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback f22133a;

    public C7122y0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f22133a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}

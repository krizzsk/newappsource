package p316y;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: y.b */
public final class C7200b {
    /* renamed from: a */
    public static void m16805a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}

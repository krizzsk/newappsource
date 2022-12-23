package p316y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* renamed from: y.d */
public final class C7204d {
    /* renamed from: a */
    public static <T> OutputConfiguration m16812a(Size size, Class<T> cls) {
        return new OutputConfiguration(size, cls);
    }

    /* renamed from: b */
    public static void m16813b(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}

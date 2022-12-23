package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;
import p316y.C7208f;
import p695od.C18728c;

/* renamed from: androidx.camera.camera2.internal.l */
public interface C0520l {

    /* renamed from: androidx.camera.camera2.internal.l$a */
    public static abstract class C0521a {
        /* renamed from: e */
        public void mo2336e(C0522m mVar) {
        }

        /* renamed from: f */
        public void mo2337f(C0522m mVar) {
        }

        /* renamed from: g */
        public void mo2338g(C0520l lVar) {
        }

        /* renamed from: h */
        public void mo2298h(C0520l lVar) {
        }

        /* renamed from: i */
        public void mo2299i(C0522m mVar) {
        }

        /* renamed from: j */
        public void mo2300j(C0522m mVar) {
        }

        /* renamed from: k */
        public void mo2301k(C0520l lVar) {
        }

        /* renamed from: l */
        public void mo2339l(C0522m mVar, Surface surface) {
        }
    }

    /* renamed from: c */
    int mo2327c(ArrayList arrayList, C0513g gVar) throws CameraAccessException;

    void close();

    /* renamed from: d */
    C18728c<Void> mo2329d();

    void finishClose();

    CameraDevice getDevice();

    C0522m getStateCallback();

    int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    void stopRepeating() throws CameraAccessException;

    C7208f toCameraCaptureSessionCompat();
}

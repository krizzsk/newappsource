package p304x;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p316y.C7200b;
import p316y.C7204d;

/* renamed from: x.r0 */
public final class C7098r0 extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    public final ArrayList f22072a = new ArrayList();

    public C7098r0(List<CameraCaptureSession.StateCallback> list) {
        for (CameraCaptureSession.StateCallback next : list) {
            if (!(next instanceof C7101s0)) {
                this.f22072a.add(next);
            }
        }
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f22072a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
        }
    }

    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f22072a.iterator();
        while (it.hasNext()) {
            C7204d.m16813b((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession);
        }
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f22072a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
        }
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f22072a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f22072a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f22072a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
        }
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        Iterator it = this.f22072a.iterator();
        while (it.hasNext()) {
            C7200b.m16805a((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession, surface);
        }
    }
}

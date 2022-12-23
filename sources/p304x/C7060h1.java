package p304x;

import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import p066e0.C4424e;
import p066e0.C4428g;

/* renamed from: x.h1 */
public final class C7060h1 extends C4424e {

    /* renamed from: a */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f21956a = null;

    /* renamed from: a */
    public final void mo19945a() {
        CallbackToFutureAdapter.C0673a aVar = this.f21956a;
        if (aVar != null) {
            aVar.mo2698c(new CameraControl.OperationCanceledException("Camera is closed"));
        }
    }

    /* renamed from: b */
    public final void mo2570b(C4428g gVar) {
        CallbackToFutureAdapter.C0673a aVar = this.f21956a;
        if (aVar != null) {
            aVar.mo2697b(gVar);
        }
    }

    /* renamed from: c */
    public final void mo19946c(CameraCaptureFailure cameraCaptureFailure) {
        CallbackToFutureAdapter.C0673a aVar = this.f21956a;
        if (aVar != null) {
            aVar.mo2698c(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
        }
    }
}

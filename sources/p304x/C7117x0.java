package p304x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.CameraCaptureFailure;
import mf0.C24361g;
import p066e0.C4424e;
import p066e0.C4450p0;

/* renamed from: x.x0 */
public final class C7117x0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final C4424e f22122a;

    public C7117x0(C4424e eVar) {
        if (eVar != null) {
            this.f22122a = eVar;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C4450p0 p0Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            C24361g.m61177o(tag instanceof C4450p0, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            p0Var = (C4450p0) tag;
        } else {
            p0Var = C4450p0.f15508b;
        }
        this.f22122a.mo2570b(new C7037d(p0Var, totalCaptureResult));
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f22122a.mo19946c(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
    }
}

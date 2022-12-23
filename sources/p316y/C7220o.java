package p316y;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.C0513g;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p316y.C7221p;

/* renamed from: y.o */
public final class C7220o extends C7221p {
    public C7220o(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, (C7221p.C7222a) null);
    }

    /* renamed from: a */
    public final int mo23508a(ArrayList arrayList, Executor executor, C0513g gVar) throws CameraAccessException {
        return this.f22370a.captureBurstRequests(arrayList, executor, gVar);
    }

    public final int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f22370a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}

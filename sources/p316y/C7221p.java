package p316y;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.C0513g;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p316y.C7208f;

/* renamed from: y.p */
public class C7221p implements C7208f.C7209a {

    /* renamed from: a */
    public final CameraCaptureSession f22370a;

    /* renamed from: b */
    public final Object f22371b;

    /* renamed from: y.p$a */
    public static class C7222a {

        /* renamed from: a */
        public final Handler f22372a;

        public C7222a(Handler handler) {
            this.f22372a = handler;
        }
    }

    public C7221p(CameraCaptureSession cameraCaptureSession, C7222a aVar) {
        cameraCaptureSession.getClass();
        this.f22370a = cameraCaptureSession;
        this.f22371b = aVar;
    }

    /* renamed from: a */
    public int mo23508a(ArrayList arrayList, Executor executor, C0513g gVar) throws CameraAccessException {
        return this.f22370a.captureBurst(arrayList, new C7208f.C7210b(executor, gVar), ((C7222a) this.f22371b).f22372a);
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f22370a.setRepeatingRequest(captureRequest, new C7208f.C7210b(executor, captureCallback), ((C7222a) this.f22371b).f22372a);
    }
}

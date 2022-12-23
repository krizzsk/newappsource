package p316y;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import p316y.C7234z;
import p327z.C7372g;

/* renamed from: y.y */
public final class C7233y extends C7232x {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7233y(CameraDevice cameraDevice) {
        super(cameraDevice, (C7234z.C7235a) null);
        cameraDevice.getClass();
    }

    /* renamed from: a */
    public final void mo23533a(C7372g gVar) throws CameraAccessExceptionCompat {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) gVar.f22600a.getSessionConfiguration();
        sessionConfiguration.getClass();
        try {
            this.f22385a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m1432b(e);
        }
    }
}

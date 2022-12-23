package p316y;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.List;
import p316y.C7208f;
import p316y.C7234z;
import p327z.C7359a;
import p327z.C7363b;
import p327z.C7372g;

/* renamed from: y.x */
public class C7232x extends C7231w {
    public C7232x(CameraDevice cameraDevice, C7234z.C7235a aVar) {
        super(cameraDevice, aVar);
    }

    /* renamed from: a */
    public void mo23533a(C7372g gVar) throws CameraAccessExceptionCompat {
        C7234z.m16827b(this.f22385a, gVar);
        C7208f.C7211c cVar = new C7208f.C7211c(gVar.f22600a.getExecutor(), gVar.f22600a.getStateCallback());
        List<C7363b> outputConfigurations = gVar.f22600a.getOutputConfigurations();
        C7234z.C7235a aVar = (C7234z.C7235a) this.f22386b;
        aVar.getClass();
        Handler handler = aVar.f22387a;
        C7359a inputConfiguration = gVar.f22600a.getInputConfiguration();
        if (inputConfiguration != null) {
            try {
                InputConfiguration inputConfiguration2 = (InputConfiguration) inputConfiguration.f22587a.getInputConfiguration();
                inputConfiguration2.getClass();
                this.f22385a.createReprocessableCaptureSessionByConfigurations(inputConfiguration2, C7372g.m16985a(outputConfigurations), cVar, handler);
            } catch (CameraAccessException e) {
                throw new CameraAccessExceptionCompat(e);
            }
        } else if (gVar.f22600a.getSessionType() == 1) {
            this.f22385a.createConstrainedHighSpeedCaptureSession(C7234z.m16828c(outputConfigurations), cVar, handler);
        } else {
            this.f22385a.createCaptureSessionByOutputConfigurations(C7372g.m16985a(outputConfigurations), cVar, handler);
        }
    }
}

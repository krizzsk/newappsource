package p316y;

import android.hardware.camera2.CameraDevice;
import p316y.C7234z;

/* renamed from: y.w */
public class C7231w extends C7234z {
    public C7231w(CameraDevice cameraDevice, C7234z.C7235a aVar) {
        super(cameraDevice, aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        throw new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        throw new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0042, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x0031, B:10:0x0055] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23533a(p327z.C7372g r5) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        /*
            r4 = this;
            android.hardware.camera2.CameraDevice r0 = r4.f22385a
            p316y.C7234z.m16827b(r0, r5)
            y.f$c r0 = new y.f$c
            z.g$c r1 = r5.f22600a
            java.util.concurrent.Executor r1 = r1.getExecutor()
            z.g$c r2 = r5.f22600a
            android.hardware.camera2.CameraCaptureSession$StateCallback r2 = r2.getStateCallback()
            r0.<init>(r1, r2)
            z.g$c r1 = r5.f22600a
            java.util.List r1 = r1.getOutputConfigurations()
            java.util.ArrayList r1 = p316y.C7234z.m16828c(r1)
            java.lang.Object r2 = r4.f22386b
            y.z$a r2 = (p316y.C7234z.C7235a) r2
            r2.getClass()
            android.os.Handler r2 = r2.f22387a
            z.g$c r3 = r5.f22600a
            z.a r3 = r3.getInputConfiguration()
            if (r3 == 0) goto L_0x0044
            z.a$c r5 = r3.f22587a     // Catch:{ CameraAccessException -> 0x0042 }
            java.lang.Object r5 = r5.getInputConfiguration()     // Catch:{ CameraAccessException -> 0x0042 }
            android.hardware.camera2.params.InputConfiguration r5 = (android.hardware.camera2.params.InputConfiguration) r5     // Catch:{ CameraAccessException -> 0x0042 }
            r5.getClass()     // Catch:{ CameraAccessException -> 0x0042 }
            android.hardware.camera2.CameraDevice r3 = r4.f22385a     // Catch:{ CameraAccessException -> 0x0042 }
            r3.createReprocessableCaptureSession(r5, r1, r0, r2)     // Catch:{ CameraAccessException -> 0x0042 }
            goto L_0x0058
        L_0x0042:
            r5 = move-exception
            goto L_0x0060
        L_0x0044:
            z.g$c r5 = r5.f22600a     // Catch:{ CameraAccessException -> 0x0042 }
            int r5 = r5.getSessionType()     // Catch:{ CameraAccessException -> 0x0042 }
            r3 = 1
            if (r5 != r3) goto L_0x0053
            android.hardware.camera2.CameraDevice r5 = r4.f22385a     // Catch:{ CameraAccessException -> 0x0042 }
            r5.createConstrainedHighSpeedCaptureSession(r1, r0, r2)     // Catch:{ CameraAccessException -> 0x0042 }
            goto L_0x0058
        L_0x0053:
            android.hardware.camera2.CameraDevice r5 = r4.f22385a     // Catch:{ CameraAccessException -> 0x0042 }
            r5.createCaptureSession(r1, r0, r2)     // Catch:{ CameraAccessException -> 0x0059 }
        L_0x0058:
            return
        L_0x0059:
            r5 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r0 = new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat     // Catch:{ CameraAccessException -> 0x0042 }
            r0.<init>((android.hardware.camera2.CameraAccessException) r5)     // Catch:{ CameraAccessException -> 0x0042 }
            throw r0     // Catch:{ CameraAccessException -> 0x0042 }
        L_0x0060:
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r0 = new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat
            r0.<init>((android.hardware.camera2.CameraAccessException) r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p316y.C7231w.mo23533a(z.g):void");
    }
}

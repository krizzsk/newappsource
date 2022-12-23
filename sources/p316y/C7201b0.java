package p316y;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import p316y.C7205d0;

/* renamed from: y.b0 */
public class C7201b0 extends C7205d0 {
    public C7201b0(Context context) {
        super(context, (C7205d0.C7206a) null);
    }

    /* renamed from: d */
    public static boolean m16806d(RuntimeException runtimeException) {
        boolean z;
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        if (!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) {
            z = false;
        } else {
            z = "_enableShutterSound".equals(stackTrace[0].getMethodName());
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo23503a(SequentialExecutor sequentialExecutor, Camera2CameraImpl.C0495c cVar) {
        this.f22329a.registerAvailabilityCallback(sequentialExecutor, cVar);
    }

    /* renamed from: b */
    public final void mo23504b(Camera2CameraImpl.C0495c cVar) {
        this.f22329a.unregisterAvailabilityCallback(cVar);
    }

    /* renamed from: c */
    public void mo23505c(String str, SequentialExecutor sequentialExecutor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f22329a.openCamera(str, sequentialExecutor, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        } catch (IllegalArgumentException | SecurityException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (m16806d(e3)) {
                throw new CameraAccessExceptionCompat(e3);
            }
            throw e3;
        }
    }

    public CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat {
        try {
            return super.getCameraCharacteristics(str);
        } catch (RuntimeException e) {
            if (m16806d(e)) {
                throw new CameraAccessExceptionCompat(e);
            }
            throw e;
        }
    }
}

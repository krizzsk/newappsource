package p316y;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;

/* renamed from: y.c0 */
public final class C7203c0 extends C7201b0 {
    public C7203c0(Context context) {
        super(context);
    }

    /* renamed from: c */
    public final void mo23505c(String str, SequentialExecutor sequentialExecutor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f22329a.openCamera(str, sequentialExecutor, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    public final CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f22329a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m1432b(e);
        }
    }
}

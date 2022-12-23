package p316y;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import java.util.HashMap;
import p316y.C7197a0;
import p316y.C7226t;

/* renamed from: y.d0 */
public class C7205d0 implements C7197a0.C7199b {

    /* renamed from: a */
    public final CameraManager f22329a;

    /* renamed from: b */
    public final Object f22330b;

    /* renamed from: y.d0$a */
    public static final class C7206a {

        /* renamed from: a */
        public final HashMap f22331a = new HashMap();

        /* renamed from: b */
        public final Handler f22332b;

        public C7206a(Handler handler) {
            this.f22332b = handler;
        }
    }

    public C7205d0(Context context, C7206a aVar) {
        this.f22329a = (CameraManager) context.getSystemService("camera");
        this.f22330b = aVar;
    }

    /* renamed from: a */
    public void mo23503a(SequentialExecutor sequentialExecutor, Camera2CameraImpl.C0495c cVar) {
        C7197a0.C7198a aVar;
        C7206a aVar2 = (C7206a) this.f22330b;
        synchronized (aVar2.f22331a) {
            aVar = (C7197a0.C7198a) aVar2.f22331a.get(cVar);
            if (aVar == null) {
                aVar = new C7197a0.C7198a(sequentialExecutor, cVar);
                aVar2.f22331a.put(cVar, aVar);
            }
        }
        this.f22329a.registerAvailabilityCallback(aVar, aVar2.f22332b);
    }

    /* renamed from: b */
    public void mo23504b(Camera2CameraImpl.C0495c cVar) {
        C7197a0.C7198a aVar;
        if (cVar != null) {
            C7206a aVar2 = (C7206a) this.f22330b;
            synchronized (aVar2.f22331a) {
                aVar = (C7197a0.C7198a) aVar2.f22331a.remove(cVar);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            synchronized (aVar.f22327c) {
                aVar.f22328d = true;
            }
        }
        this.f22329a.unregisterAvailabilityCallback(aVar);
    }

    /* renamed from: c */
    public void mo23505c(String str, SequentialExecutor sequentialExecutor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        sequentialExecutor.getClass();
        stateCallback.getClass();
        try {
            this.f22329a.openCamera(str, new C7226t.C7228b(sequentialExecutor, stateCallback), ((C7206a) this.f22330b).f22332b);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    public CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f22329a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m1432b(e);
        }
    }
}

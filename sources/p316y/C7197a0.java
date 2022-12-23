package p316y;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import java.util.concurrent.Executor;
import p304x.C7082o;
import p304x.C7087p;
import p304x.C7097r;
import p316y.C7205d0;

/* renamed from: y.a0 */
public final class C7197a0 {

    /* renamed from: a */
    public final C7199b f22323a;

    /* renamed from: b */
    public final ArrayMap f22324b = new ArrayMap(4);

    /* renamed from: y.a0$a */
    public static final class C7198a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        public final Executor f22325a;

        /* renamed from: b */
        public final CameraManager.AvailabilityCallback f22326b;

        /* renamed from: c */
        public final Object f22327c = new Object();

        /* renamed from: d */
        public boolean f22328d = false;

        public C7198a(SequentialExecutor sequentialExecutor, Camera2CameraImpl.C0495c cVar) {
            this.f22325a = sequentialExecutor;
            this.f22326b = cVar;
        }

        public final void onCameraAccessPrioritiesChanged() {
            synchronized (this.f22327c) {
                if (!this.f22328d) {
                    this.f22325a.execute(new C7082o(this, 1));
                }
            }
        }

        public final void onCameraAvailable(String str) {
            synchronized (this.f22327c) {
                if (!this.f22328d) {
                    this.f22325a.execute(new C7097r(3, this, str));
                }
            }
        }

        public final void onCameraUnavailable(String str) {
            synchronized (this.f22327c) {
                if (!this.f22328d) {
                    this.f22325a.execute(new C7087p(3, this, str));
                }
            }
        }
    }

    /* renamed from: y.a0$b */
    public interface C7199b {
        /* renamed from: a */
        void mo23503a(SequentialExecutor sequentialExecutor, Camera2CameraImpl.C0495c cVar);

        /* renamed from: b */
        void mo23504b(Camera2CameraImpl.C0495c cVar);

        /* renamed from: c */
        void mo23505c(String str, SequentialExecutor sequentialExecutor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat;

        CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat;
    }

    public C7197a0(C7205d0 d0Var) {
        this.f22323a = d0Var;
    }

    /* renamed from: a */
    public static C7197a0 m16800a(Context context, Handler handler) {
        C7205d0 d0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            d0Var = new C7203c0(context);
        } else if (i >= 28) {
            d0Var = new C7201b0(context);
        } else {
            d0Var = new C7205d0(context, new C7205d0.C7206a(handler));
        }
        return new C7197a0(d0Var);
    }

    /* renamed from: b */
    public final C7225s mo23499b(String str) throws CameraAccessExceptionCompat {
        C7225s sVar;
        synchronized (this.f22324b) {
            sVar = (C7225s) this.f22324b.get(str);
            if (sVar == null) {
                try {
                    C7225s sVar2 = new C7225s(this.f22323a.getCameraCharacteristics(str));
                    this.f22324b.put(str, sVar2);
                    sVar = sVar2;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(e.getMessage(), e);
                }
            }
        }
        return sVar;
    }
}

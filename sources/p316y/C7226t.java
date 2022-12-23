package p316y;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import java.util.concurrent.Executor;
import p304x.C7087p;
import p304x.C7097r;
import p316y.C7234z;
import p327z.C7372g;

/* renamed from: y.t */
public final class C7226t {

    /* renamed from: a */
    public final C7234z f22376a;

    /* renamed from: y.t$a */
    public interface C7227a {
        /* renamed from: a */
        void mo23533a(C7372g gVar) throws CameraAccessExceptionCompat;
    }

    /* renamed from: y.t$b */
    public static final class C7228b extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final CameraDevice.StateCallback f22377a;

        /* renamed from: b */
        public final Executor f22378b;

        public C7228b(SequentialExecutor sequentialExecutor, CameraDevice.StateCallback stateCallback) {
            this.f22378b = sequentialExecutor;
            this.f22377a = stateCallback;
        }

        public final void onClosed(CameraDevice cameraDevice) {
            this.f22378b.execute(new C7229u(0, this, cameraDevice));
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            this.f22378b.execute(new C7087p(2, this, cameraDevice));
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            this.f22378b.execute(new C7230v(this, cameraDevice, i));
        }

        public final void onOpened(CameraDevice cameraDevice) {
            this.f22378b.execute(new C7097r(2, this, cameraDevice));
        }
    }

    public C7226t(CameraDevice cameraDevice, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f22376a = new C7233y(cameraDevice);
        } else if (i >= 24) {
            this.f22376a = new C7232x(cameraDevice, new C7234z.C7235a(handler));
        } else if (i >= 23) {
            this.f22376a = new C7231w(cameraDevice, new C7234z.C7235a(handler));
        } else {
            this.f22376a = new C7234z(cameraDevice, new C7234z.C7235a(handler));
        }
    }
}

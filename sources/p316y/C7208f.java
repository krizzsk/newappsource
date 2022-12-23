package p316y;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.C0513g;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p304x.C7087p;
import p304x.C7097r;
import p304x.C7103t;
import p304x.C7109v;
import p304x.C7112w;
import p304x.C7116x;
import p316y.C7221p;

/* renamed from: y.f */
public final class C7208f {

    /* renamed from: a */
    public final C7221p f22333a;

    /* renamed from: y.f$a */
    public interface C7209a {
        /* renamed from: a */
        int mo23508a(ArrayList arrayList, Executor executor, C0513g gVar) throws CameraAccessException;

        int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    /* renamed from: y.f$b */
    public static final class C7210b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final CameraCaptureSession.CaptureCallback f22334a;

        /* renamed from: b */
        public final Executor f22335b;

        public C7210b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f22335b = executor;
            this.f22334a = captureCallback;
        }

        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            this.f22335b.execute(new C7213h(this, cameraCaptureSession, captureRequest, surface, j));
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f22335b.execute(new C7216k(this, cameraCaptureSession, captureRequest, totalCaptureResult, 0));
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f22335b.execute(new C7116x(this, cameraCaptureSession, captureRequest, captureFailure, 1));
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f22335b.execute(new C7215j(this, cameraCaptureSession, captureRequest, captureResult));
        }

        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            this.f22335b.execute(new C7212g(this, cameraCaptureSession, i));
        }

        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.f22335b.execute(new C7214i(this, cameraCaptureSession, i, j));
        }

        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.f22335b.execute(new C7217l(this, cameraCaptureSession, captureRequest, j, j2));
        }
    }

    /* renamed from: y.f$c */
    public static final class C7211c extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f22336a;

        /* renamed from: b */
        public final Executor f22337b;

        public C7211c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f22337b = executor;
            this.f22336a = stateCallback;
        }

        public final void onActive(CameraCaptureSession cameraCaptureSession) {
            this.f22337b.execute(new C7218m(0, this, cameraCaptureSession));
        }

        public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.f22337b.execute(new C7103t(1, this, cameraCaptureSession));
        }

        public final void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.f22337b.execute(new C7097r(1, this, cameraCaptureSession));
        }

        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.f22337b.execute(new C7219n(0, this, cameraCaptureSession));
        }

        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.f22337b.execute(new C7087p(1, this, cameraCaptureSession));
        }

        public final void onReady(CameraCaptureSession cameraCaptureSession) {
            this.f22337b.execute(new C7109v(1, this, cameraCaptureSession));
        }

        public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.f22337b.execute(new C7112w(1, this, cameraCaptureSession, surface));
        }
    }

    public C7208f(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f22333a = new C7220o(cameraCaptureSession);
        } else {
            this.f22333a = new C7221p(cameraCaptureSession, new C7221p.C7222a(handler));
        }
    }

    /* renamed from: a */
    public final CameraCaptureSession mo23507a() {
        return this.f22333a.f22370a;
    }
}

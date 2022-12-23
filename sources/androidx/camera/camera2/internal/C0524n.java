package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import mf0.C24361g;

/* renamed from: androidx.camera.camera2.internal.n */
public final class C0524n extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    public final /* synthetic */ C0522m f1815a;

    public C0524n(C0522m mVar) {
        this.f1815a = mVar;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f1815a.mo2342m(cameraCaptureSession);
        C0522m mVar = this.f1815a;
        mVar.mo2336e(mVar);
    }

    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.f1815a.mo2342m(cameraCaptureSession);
        C0522m mVar = this.f1815a;
        mVar.mo2337f(mVar);
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f1815a.mo2342m(cameraCaptureSession);
        C0522m mVar = this.f1815a;
        mVar.mo2338g(mVar);
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        CallbackToFutureAdapter.C0673a<Void> aVar;
        try {
            this.f1815a.mo2342m(cameraCaptureSession);
            C0522m mVar = this.f1815a;
            mVar.mo2298h(mVar);
            synchronized (this.f1815a.f1800a) {
                C24361g.m61185s(this.f1815a.f1808i, "OpenCaptureSession completer should not null");
                C0522m mVar2 = this.f1815a;
                aVar = mVar2.f1808i;
                mVar2.f1808i = null;
            }
            aVar.mo2698c(new IllegalStateException("onConfigureFailed"));
        } catch (Throwable th) {
            synchronized (this.f1815a.f1800a) {
                C24361g.m61185s(this.f1815a.f1808i, "OpenCaptureSession completer should not null");
                C0522m mVar3 = this.f1815a;
                CallbackToFutureAdapter.C0673a<Void> aVar2 = mVar3.f1808i;
                mVar3.f1808i = null;
                aVar2.mo2698c(new IllegalStateException("onConfigureFailed"));
                throw th;
            }
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CallbackToFutureAdapter.C0673a<Void> aVar;
        try {
            this.f1815a.mo2342m(cameraCaptureSession);
            C0522m mVar = this.f1815a;
            mVar.mo2299i(mVar);
            synchronized (this.f1815a.f1800a) {
                C24361g.m61185s(this.f1815a.f1808i, "OpenCaptureSession completer should not null");
                C0522m mVar2 = this.f1815a;
                aVar = mVar2.f1808i;
                mVar2.f1808i = null;
            }
            aVar.mo2697b(null);
        } catch (Throwable th) {
            synchronized (this.f1815a.f1800a) {
                C24361g.m61185s(this.f1815a.f1808i, "OpenCaptureSession completer should not null");
                C0522m mVar3 = this.f1815a;
                CallbackToFutureAdapter.C0673a<Void> aVar2 = mVar3.f1808i;
                mVar3.f1808i = null;
                aVar2.mo2697b(null);
                throw th;
            }
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f1815a.mo2342m(cameraCaptureSession);
        C0522m mVar = this.f1815a;
        mVar.mo2300j(mVar);
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f1815a.mo2342m(cameraCaptureSession);
        C0522m mVar = this.f1815a;
        mVar.mo2339l(mVar, surface);
    }
}

package p304x;

import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import p066e0.C4424e;
import p066e0.C4428g;

/* renamed from: x.k0 */
public final class C7068k0 extends C4424e {

    /* renamed from: a */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f21980a;

    public C7068k0(CallbackToFutureAdapter.C0673a aVar) {
        this.f21980a = aVar;
    }

    /* renamed from: a */
    public final void mo19945a() {
        this.f21980a.mo2698c(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", (Throwable) null));
    }

    /* renamed from: b */
    public final void mo2570b(C4428g gVar) {
        this.f21980a.mo2697b(null);
    }

    /* renamed from: c */
    public final void mo19946c(CameraCaptureFailure cameraCaptureFailure) {
        StringBuilder k = C13555b.m33972k("Capture request failed with reason ");
        k.append(cameraCaptureFailure.f1918a);
        this.f21980a.mo2698c(new ImageCaptureException(2, k.toString(), (Throwable) null));
    }
}

package p304x;

import androidx.camera.camera2.internal.ProcessingCaptureSession;
import p054d0.C4289j0;
import p102h0.C5018c;

/* renamed from: x.n1 */
public final class C7081n1 implements C5018c<Void> {

    /* renamed from: a */
    public final /* synthetic */ ProcessingCaptureSession f21999a;

    public C7081n1(ProcessingCaptureSession processingCaptureSession) {
        this.f21999a = processingCaptureSession;
    }

    public final void onFailure(Throwable th) {
        C4289j0.m11435b("ProcessingCaptureSession");
        this.f21999a.close();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Void voidR = (Void) obj;
    }
}

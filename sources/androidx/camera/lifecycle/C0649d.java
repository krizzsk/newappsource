package androidx.camera.lifecycle;

import androidx.camera.core.CameraX;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import p102h0.C5018c;

/* renamed from: androidx.camera.lifecycle.d */
public final class C0649d implements C5018c<Void> {

    /* renamed from: a */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f2226a;

    /* renamed from: b */
    public final /* synthetic */ CameraX f2227b;

    public C0649d(CameraX cameraX, CallbackToFutureAdapter.C0673a aVar) {
        this.f2226a = aVar;
        this.f2227b = cameraX;
    }

    public final void onFailure(Throwable th) {
        this.f2226a.mo2698c(th);
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        this.f2226a.mo2697b(this.f2227b);
    }
}

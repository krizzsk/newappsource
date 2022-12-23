package androidx.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import p102h0.C5018c;

/* renamed from: androidx.camera.core.m */
public final class C0624m implements C5018c<Void> {

    /* renamed from: a */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f2144a;

    /* renamed from: b */
    public final /* synthetic */ C0612l f2145b;

    public C0624m(C0612l lVar, CallbackToFutureAdapter.C0673a aVar) {
        this.f2145b = lVar;
        this.f2144a = aVar;
    }

    public final void onFailure(Throwable th) {
        this.f2145b.mo2549H();
        this.f2144a.mo2698c(th);
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        this.f2145b.mo2549H();
    }
}

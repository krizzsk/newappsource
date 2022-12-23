package p102h0;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import p102h0.C5023g;
import p227r.C6227a;

/* renamed from: h0.h */
public final class C5026h implements C5018c<Object> {

    /* renamed from: a */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f16996a;

    /* renamed from: b */
    public final /* synthetic */ C6227a f16997b;

    public C5026h(CallbackToFutureAdapter.C0673a aVar) {
        C5023g.C5024a aVar2 = C5023g.f16993a;
        this.f16996a = aVar;
        this.f16997b = aVar2;
    }

    public final void onFailure(Throwable th) {
        this.f16996a.mo2698c(th);
    }

    public final void onSuccess(Object obj) {
        try {
            this.f16996a.mo2697b(this.f16997b.apply(obj));
        } catch (Throwable th) {
            this.f16996a.mo2698c(th);
        }
    }
}

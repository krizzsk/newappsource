package p102h0;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;
import mf0.C24361g;

/* renamed from: h0.k */
public final class C5032k implements CallbackToFutureAdapter.C0674b<List<Object>> {

    /* renamed from: b */
    public final /* synthetic */ C5035n f17002b;

    public C5032k(C5035n nVar) {
        this.f17002b = nVar;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a<List<Object>> aVar) {
        boolean z;
        if (this.f17002b.f17012g == null) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w("The result can only set once!", z);
        this.f17002b.f17012g = aVar;
        return "ListFuture[" + this + "]";
    }
}

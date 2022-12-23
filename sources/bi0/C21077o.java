package bi0;

import ce0.C21100e;
import ff0.C23349c;
import gf0.C23412b;
import kotlin.coroutines.CoroutineContext;
import lf0.C24236l;
import p258t4.C6587a;
import p583jk.C17875h;
import wh0.C25153a;

/* renamed from: bi0.o */
public class C21077o<T> extends C25153a<T> implements C23412b {

    /* renamed from: d */
    public final C23349c<T> f52892d;

    public C21077o(C23349c cVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f52892d = cVar;
    }

    /* renamed from: G */
    public void mo53227G(Object obj) {
        C6587a.m15521z(C21100e.m49351l0(this.f52892d), C17875h.m44287L(obj), (C24236l) null);
    }

    public final C23412b getCallerFrame() {
        C23349c<T> cVar = this.f52892d;
        if (cVar instanceof C23412b) {
            return (C23412b) cVar;
        }
        return null;
    }

    /* renamed from: h0 */
    public final boolean mo53228h0() {
        return true;
    }

    /* renamed from: t0 */
    public void mo53229t0(Object obj) {
        this.f52892d.resumeWith(C17875h.m44287L(obj));
    }
}

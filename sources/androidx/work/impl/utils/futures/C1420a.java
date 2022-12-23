package androidx.work.impl.utils.futures;

import androidx.work.impl.utils.futures.AbstractFuture;
import p695od.C18728c;

/* renamed from: androidx.work.impl.utils.futures.a */
public final class C1420a<V> extends AbstractFuture<V> {
    /* renamed from: h */
    public final boolean mo5756h(V v) {
        if (v == null) {
            v = AbstractFuture.f5239h;
        }
        if (!AbstractFuture.f5238g.mo5749b(this, (Object) null, v)) {
            return false;
        }
        AbstractFuture.m3781b(this);
        return true;
    }

    /* renamed from: i */
    public final boolean mo5757i(Throwable th) {
        th.getClass();
        if (!AbstractFuture.f5238g.mo5749b(this, (Object) null, new AbstractFuture.Failure(th))) {
            return false;
        }
        AbstractFuture.m3781b(this);
        return true;
    }

    /* renamed from: j */
    public final boolean mo5758j(C18728c<? extends V> cVar) {
        AbstractFuture.C1417e eVar;
        AbstractFuture.Failure failure;
        cVar.getClass();
        Object obj = this.f5240b;
        if (obj == null) {
            if (cVar.isDone()) {
                if (!AbstractFuture.f5238g.mo5749b(this, (Object) null, AbstractFuture.m3783e(cVar))) {
                    return false;
                }
                AbstractFuture.m3781b(this);
            } else {
                eVar = new AbstractFuture.C1417e(this, cVar);
                if (AbstractFuture.f5238g.mo5749b(this, (Object) null, eVar)) {
                    try {
                        cVar.addListener(eVar, DirectExecutor.INSTANCE);
                    } catch (Throwable unused) {
                        failure = AbstractFuture.Failure.f5243b;
                    }
                } else {
                    obj = this.f5240b;
                }
            }
            return true;
        }
        if (!(obj instanceof AbstractFuture.C1414b)) {
            return false;
        }
        cVar.cancel(((AbstractFuture.C1414b) obj).f5247a);
        return false;
        AbstractFuture.f5238g.mo5749b(this, eVar, failure);
        return true;
    }
}

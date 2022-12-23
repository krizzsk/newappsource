package ff0;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.C23827a;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: ff0.b */
public abstract class C23348b<B extends CoroutineContext.C23827a, E extends B> implements CoroutineContext.C23829b<E> {

    /* renamed from: b */
    public final C24236l<CoroutineContext.C23827a, E> f59123b;

    /* renamed from: c */
    public final CoroutineContext.C23829b<?> f59124c;

    public C23348b(CoroutineContext.C23829b<B> bVar, C24236l<? super CoroutineContext.C23827a, ? extends E> lVar) {
        C24362h.m61211f(bVar, "baseKey");
        C24362h.m61211f(lVar, "safeCast");
        this.f59123b = lVar;
        this.f59124c = bVar instanceof C23348b ? ((C23348b) bVar).f59124c : bVar;
    }
}

package th0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: th0.a */
public final class C24992a<T> implements C25003h<T> {

    /* renamed from: a */
    public final AtomicReference<C25003h<T>> f63135a;

    public C24992a(C25003h<? extends T> hVar) {
        this.f63135a = new AtomicReference<>(hVar);
    }

    public final Iterator<T> iterator() {
        C25003h andSet = this.f63135a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

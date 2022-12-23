package cf0;

import java.util.Iterator;
import lf0.C24225a;
import nf0.C24497a;

/* renamed from: cf0.s */
public final class C21145s<T> implements Iterable<C21144r<? extends T>>, C24497a {

    /* renamed from: b */
    public final C24225a<Iterator<T>> f53003b;

    public C21145s(C24225a<? extends Iterator<? extends T>> aVar) {
        this.f53003b = aVar;
    }

    public final Iterator<C21144r<T>> iterator() {
        return new C21146t(this.f53003b.invoke());
    }
}

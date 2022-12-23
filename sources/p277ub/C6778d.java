package p277ub;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: ub.d */
public final class C6778d<E> implements Iterable<E> {

    /* renamed from: b */
    public final Object f20974b = new Object();

    /* renamed from: c */
    public final HashMap f20975c = new HashMap();

    /* renamed from: d */
    public Set<E> f20976d = Collections.emptySet();

    /* renamed from: e */
    public List<E> f20977e = Collections.emptyList();

    /* renamed from: a */
    public final int mo22946a(E e) {
        int i;
        synchronized (this.f20974b) {
            if (this.f20975c.containsKey(e)) {
                i = ((Integer) this.f20975c.get(e)).intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }

    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f20974b) {
            it = this.f20977e.iterator();
        }
        return it;
    }
}

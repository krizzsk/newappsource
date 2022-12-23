package zg0;

import lh0.C24307v;
import mf0.C24362h;
import zf0.C25485t;

/* renamed from: zg0.g */
public abstract class C25498g<T> {

    /* renamed from: a */
    public final T f63774a;

    public C25498g(T t) {
        this.f63774a = t;
    }

    /* renamed from: a */
    public abstract C24307v mo62745a(C25485t tVar);

    /* renamed from: b */
    public T mo62750b() {
        return this.f63774a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            Object b = mo62750b();
            Object obj2 = null;
            C25498g gVar = obj instanceof C25498g ? (C25498g) obj : null;
            if (gVar != null) {
                obj2 = gVar.mo62750b();
            }
            return C24362h.m61206a(b, obj2);
        }
    }

    public final int hashCode() {
        Object b = mo62750b();
        if (b == null) {
            return 0;
        }
        return b.hashCode();
    }

    public String toString() {
        return String.valueOf(mo62750b());
    }
}

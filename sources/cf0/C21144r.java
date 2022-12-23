package cf0;

import mf0.C24362h;

/* renamed from: cf0.r */
public final class C21144r<T> {

    /* renamed from: a */
    public final int f53001a;

    /* renamed from: b */
    public final T f53002b;

    public C21144r(int i, T t) {
        this.f53001a = i;
        this.f53002b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21144r)) {
            return false;
        }
        C21144r rVar = (C21144r) obj;
        return this.f53001a == rVar.f53001a && C24362h.m61206a(this.f53002b, rVar.f53002b);
    }

    public final int hashCode() {
        int i = this.f53001a * 31;
        T t = this.f53002b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("IndexedValue(index=");
        k.append(this.f53001a);
        k.append(", value=");
        k.append(this.f53002b);
        k.append(')');
        return k.toString();
    }
}

package cf0;

import java.util.ArrayList;
import java.util.List;
import rf0.C24806h;

/* renamed from: cf0.x */
public final class C21150x<T> extends C21128b<T> {

    /* renamed from: b */
    public final List<T> f53006b;

    public C21150x(ArrayList arrayList) {
        this.f53006b = arrayList;
    }

    public final void add(int i, T t) {
        List<T> list = this.f53006b;
        if (new C24806h(0, size()).mo61258s(i)) {
            list.add(size() - i, t);
            return;
        }
        StringBuilder r = C25541a.m63887r("Position index ", i, " must be in range [");
        r.append(new C24806h(0, size()));
        r.append("].");
        throw new IndexOutOfBoundsException(r.toString());
    }

    public final void clear() {
        this.f53006b.clear();
    }

    /* renamed from: e */
    public final int mo53352e() {
        return this.f53006b.size();
    }

    public final T get(int i) {
        return this.f53006b.get(C21140n.m49438Z(i, this));
    }

    /* renamed from: i */
    public final T mo53353i(int i) {
        return this.f53006b.remove(C21140n.m49438Z(i, this));
    }

    public final T set(int i, T t) {
        return this.f53006b.set(C21140n.m49438Z(i, this), t);
    }
}

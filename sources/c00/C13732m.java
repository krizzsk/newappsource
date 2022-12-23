package c00;

import ce0.C21100e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: c00.m */
public class C13732m<T> {

    /* renamed from: b */
    public final List<T> f33804b;

    /* renamed from: c */
    public final int f33805c;

    public C13732m(List<T> list, int i) {
        C21100e.m49373x(list, "list");
        this.f33804b = list;
        C21100e.m49365t(i, "maxItemCount");
        this.f33805c = i;
    }

    /* renamed from: c */
    public void mo40645c(T t) {
        int indexOf = this.f33804b.indexOf(t);
        if (indexOf >= 0) {
            this.f33804b.remove(indexOf);
        }
        this.f33804b.add(0, t);
        while (this.f33804b.size() > this.f33805c) {
            List<T> list = this.f33804b;
            list.remove(list.size() - 1);
        }
    }

    /* renamed from: d */
    public void mo40646d(List list) {
        for (Object c : list) {
            mo40645c(c);
        }
    }

    /* renamed from: e */
    public final List<T> mo40647e() {
        return Collections.unmodifiableList(this.f33804b);
    }

    /* renamed from: f */
    public boolean mo40648f(Collection<? extends T> collection) {
        return this.f33804b.removeAll(collection);
    }
}

package fg0;

import java.lang.reflect.Type;
import java.util.Iterator;
import mf0.C24362h;
import og0.C24585a;
import og0.C24608w;
import ug0.C25065b;
import ug0.C25066c;

/* renamed from: fg0.w */
public abstract class C23379w implements C24608w {
    /* renamed from: T */
    public abstract Type mo58488T();

    /* renamed from: c */
    public C24585a mo58494c(C25066c cVar) {
        T t;
        C24362h.m61211f(cVar, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C25065b d = ((C24585a) next).mo58476d();
            if (d != null) {
                t = d.mo61569b();
            }
            if (C24362h.m61206a(t, cVar)) {
                t = next;
                break;
            }
        }
        return (C24585a) t;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C23379w) && C24362h.m61206a(mo58488T(), ((C23379w) obj).mo58488T());
    }

    public final int hashCode() {
        return mo58488T().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo58488T();
    }
}

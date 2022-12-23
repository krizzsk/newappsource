package ie0;

import he0.C23454a;
import ye0.C25292a;

/* renamed from: ie0.b */
public final class C23587b<T> implements C25292a<T>, C23454a<T> {

    /* renamed from: c */
    public static final Object f59659c = new Object();

    /* renamed from: a */
    public volatile C25292a<T> f59660a;

    /* renamed from: b */
    public volatile Object f59661b = f59659c;

    public C23587b(C25292a<T> aVar) {
        this.f59660a = aVar;
    }

    /* renamed from: a */
    public static <P extends C25292a<T>, T> C23454a<T> m57772a(P p) {
        if (p instanceof C23454a) {
            return (C23454a) p;
        }
        p.getClass();
        return new C23587b(p);
    }

    /* renamed from: b */
    public static C25292a m57773b(C23588c cVar) {
        cVar.getClass();
        if (cVar instanceof C23587b) {
            return cVar;
        }
        return new C23587b(cVar);
    }

    /* renamed from: c */
    public static void m57774c(Object obj, Object obj2) {
        boolean z;
        if (obj != f59659c) {
            z = true;
        } else {
            z = false;
        }
        if (z && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
    }

    public final T get() {
        T t = this.f59661b;
        T t2 = f59659c;
        if (t == t2) {
            synchronized (this) {
                t = this.f59661b;
                if (t == t2) {
                    t = this.f59660a.get();
                    m57774c(this.f59661b, t);
                    this.f59661b = t;
                    this.f59660a = null;
                }
            }
        }
        return t;
    }
}

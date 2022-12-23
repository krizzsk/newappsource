package p313x9;

import p301w9.C7003a;
import ye0.C25292a;

/* renamed from: x9.a */
public final class C7179a<T> implements C25292a<T>, C7003a<T> {

    /* renamed from: c */
    public static final Object f22275c = new Object();

    /* renamed from: a */
    public volatile C25292a<T> f22276a;

    /* renamed from: b */
    public volatile Object f22277b = f22275c;

    public C7179a(C25292a<T> aVar) {
        this.f22276a = aVar;
    }

    /* renamed from: a */
    public static C25292a m16790a(C7180b bVar) {
        if (bVar instanceof C7179a) {
            return bVar;
        }
        return new C7179a(bVar);
    }

    /* renamed from: b */
    public static void m16791b(Object obj, Object obj2) {
        boolean z;
        if (obj != f22275c) {
            z = true;
        } else {
            z = false;
        }
        if (z && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
    }

    public final T get() {
        T t = this.f22277b;
        T t2 = f22275c;
        if (t == t2) {
            synchronized (this) {
                t = this.f22277b;
                if (t == t2) {
                    t = this.f22276a.get();
                    m16791b(this.f22277b, t);
                    this.f22277b = t;
                    this.f22276a = null;
                }
            }
        }
        return t;
    }
}

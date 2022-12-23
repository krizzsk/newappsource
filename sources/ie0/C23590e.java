package ie0;

import ye0.C25292a;

/* renamed from: ie0.e */
public final class C23590e<T> implements C25292a<T> {

    /* renamed from: c */
    public static final Object f59663c = new Object();

    /* renamed from: a */
    public volatile C25292a<T> f59664a;

    /* renamed from: b */
    public volatile Object f59665b = f59663c;

    public C23590e(C23588c cVar) {
        this.f59664a = cVar;
    }

    /* renamed from: a */
    public static C25292a m57776a(C23588c cVar) {
        if ((cVar instanceof C23590e) || (cVar instanceof C23587b)) {
            return cVar;
        }
        cVar.getClass();
        return new C23590e(cVar);
    }

    public final T get() {
        T t = this.f59665b;
        if (t != f59663c) {
            return t;
        }
        C25292a<T> aVar = this.f59664a;
        if (aVar == null) {
            return this.f59665b;
        }
        T t2 = aVar.get();
        this.f59665b = t2;
        this.f59664a = null;
        return t2;
    }
}

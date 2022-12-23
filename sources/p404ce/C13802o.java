package p404ce;

import p956ze.C20839b;

/* renamed from: ce.o */
public final class C13802o<T> implements C20839b<T> {

    /* renamed from: c */
    public static final Object f33973c = new Object();

    /* renamed from: a */
    public volatile Object f33974a = f33973c;

    /* renamed from: b */
    public volatile C20839b<T> f33975b;

    public C13802o(C20839b<T> bVar) {
        this.f33975b = bVar;
    }

    public final T get() {
        T t = this.f33974a;
        T t2 = f33973c;
        if (t == t2) {
            synchronized (this) {
                t = this.f33974a;
                if (t == t2) {
                    t = this.f33975b.get();
                    this.f33974a = t;
                    this.f33975b = null;
                }
            }
        }
        return t;
    }
}

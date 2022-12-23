package p229r1;

/* renamed from: r1.f */
public final class C6236f<T> extends C6235e {

    /* renamed from: c */
    public final Object f19683c = new Object();

    public C6236f(int i) {
        super(i);
    }

    /* renamed from: a */
    public final boolean mo22236a(T t) {
        boolean a;
        synchronized (this.f19683c) {
            a = super.mo22236a(t);
        }
        return a;
    }

    /* renamed from: b */
    public final T mo22237b() {
        T b;
        synchronized (this.f19683c) {
            b = super.mo22237b();
        }
        return b;
    }
}

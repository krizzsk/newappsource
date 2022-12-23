package p790sf;

import java.util.NoSuchElementException;

/* renamed from: sf.b */
public final class C19454b<T> {

    /* renamed from: a */
    public final T f49472a;

    public C19454b() {
        this.f49472a = null;
    }

    /* renamed from: a */
    public final T mo51861a() {
        T t = this.f49472a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: b */
    public final boolean mo51862b() {
        return this.f49472a != null;
    }

    public C19454b(T t) {
        if (t != null) {
            this.f49472a = t;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}

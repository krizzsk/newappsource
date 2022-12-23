package p988j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.Optional */
public final class Optional<T> {

    /* renamed from: b */
    private static final Optional f64489b = new Optional();

    /* renamed from: a */
    private final Object f64490a;

    private Optional() {
        this.f64490a = null;
    }

    private Optional(Object obj) {
        obj.getClass();
        this.f64490a = obj;
    }

    /* renamed from: a */
    public static Optional m64693a() {
        return f64489b;
    }

    /* renamed from: d */
    public static Optional m64694d(Object obj) {
        return new Optional(obj);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? f64489b : new Optional<>(t);
    }

    /* renamed from: b */
    public final Object mo83877b() {
        Object obj = this.f64490a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean mo83878c() {
        return this.f64490a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        return C26016n.m64895k(this.f64490a, ((Optional) obj).f64490a);
    }

    public final int hashCode() {
        Object obj = this.f64490a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f64490a;
        if (obj == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{obj});
    }
}

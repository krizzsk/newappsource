package mf0;

/* renamed from: mf0.i */
public final class C24364i implements C24357c {

    /* renamed from: b */
    public final Class<?> f61687b;

    public C24364i(Class<?> cls, String str) {
        C24362h.m61211f(cls, "jClass");
        this.f61687b = cls;
    }

    /* renamed from: a */
    public final Class<?> mo59301a() {
        return this.f61687b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24364i) || !C24362h.m61206a(this.f61687b, ((C24364i) obj).f61687b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f61687b.hashCode();
    }

    public final String toString() {
        return this.f61687b.toString() + " (Kotlin reflection is not available)";
    }
}

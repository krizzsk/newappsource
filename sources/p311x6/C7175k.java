package p311x6;

/* renamed from: x6.k */
public final class C7175k {

    /* renamed from: a */
    public Class<?> f22262a;

    /* renamed from: b */
    public Class<?> f22263b;

    /* renamed from: c */
    public Class<?> f22264c;

    public C7175k() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7175k.class != obj.getClass()) {
            return false;
        }
        C7175k kVar = (C7175k) obj;
        if (this.f22262a.equals(kVar.f22262a) && this.f22263b.equals(kVar.f22263b) && C7176l.m16782b(this.f22264c, kVar.f22264c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f22263b.hashCode() + (this.f22262a.hashCode() * 31)) * 31;
        Class<?> cls = this.f22264c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MultiClassKey{first=");
        k.append(this.f22262a);
        k.append(", second=");
        k.append(this.f22263b);
        k.append('}');
        return k.toString();
    }

    public C7175k(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f22262a = cls;
        this.f22263b = cls2;
        this.f22264c = cls3;
    }
}

package p030bo.app;

/* renamed from: bo.app.m6 */
public final class C1639m6 {

    /* renamed from: a */
    public final C1704u5 f5836a;

    /* renamed from: b */
    public final String f5837b;

    public C1639m6(C1704u5 u5Var, String str) {
        this.f5836a = u5Var;
        this.f5837b = str;
    }

    /* renamed from: a */
    public C1704u5 mo6224a() {
        return this.f5836a;
    }

    /* renamed from: b */
    public String mo6225b() {
        return this.f5837b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1639m6.class != obj.getClass()) {
            return false;
        }
        C1639m6 m6Var = (C1639m6) obj;
        if (this.f5836a != m6Var.f5836a) {
            return false;
        }
        return this.f5837b.equals(m6Var.f5837b);
    }

    public int hashCode() {
        return this.f5837b.hashCode() + (this.f5836a.hashCode() * 31);
    }
}

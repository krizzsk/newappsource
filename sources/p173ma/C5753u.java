package p173ma;

/* renamed from: ma.u */
public final class C5753u {

    /* renamed from: c */
    public static final C5753u f18629c = new C5753u(0, 0);

    /* renamed from: a */
    public final long f18630a;

    /* renamed from: b */
    public final long f18631b;

    public C5753u(long j, long j2) {
        this.f18630a = j;
        this.f18631b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5753u.class != obj.getClass()) {
            return false;
        }
        C5753u uVar = (C5753u) obj;
        if (this.f18630a == uVar.f18630a && this.f18631b == uVar.f18631b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f18630a) * 31) + ((int) this.f18631b);
    }

    public final String toString() {
        long j = this.f18630a;
        long j2 = this.f18631b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        return C25541a.m63884o(sb, j2, "]");
    }
}

package p192o3;

/* renamed from: o3.d */
public final class C5937d {

    /* renamed from: a */
    public String f19062a;

    /* renamed from: b */
    public Long f19063b;

    public C5937d(String str, long j) {
        this.f19062a = str;
        this.f19063b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5937d)) {
            return false;
        }
        C5937d dVar = (C5937d) obj;
        if (!this.f19062a.equals(dVar.f19062a)) {
            return false;
        }
        Long l = this.f19063b;
        Long l2 = dVar.f19063b;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f19062a.hashCode() * 31;
        Long l = this.f19063b;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}

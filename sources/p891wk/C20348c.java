package p891wk;

/* renamed from: wk.c */
public final class C20348c {

    /* renamed from: a */
    public final Integer f51522a;

    /* renamed from: b */
    public final Long f51523b;

    /* renamed from: c */
    public final Long f51524c;

    public C20348c(Integer num, Long l, Long l2) {
        this.f51523b = l;
        this.f51522a = num;
        this.f51524c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20348c.class != obj.getClass()) {
            return false;
        }
        C20348c cVar = (C20348c) obj;
        Integer num = this.f51522a;
        if (num == null ? cVar.f51522a != null : !num.equals(cVar.f51522a)) {
            return false;
        }
        Long l = this.f51523b;
        if (l == null ? cVar.f51523b != null : !l.equals(cVar.f51523b)) {
            return false;
        }
        Long l2 = this.f51524c;
        Long l3 = cVar.f51524c;
        if (l2 != null) {
            return l2.equals(l3);
        }
        if (l3 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        Integer num = this.f51522a;
        int i3 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Long l = this.f51523b;
        if (l != null) {
            i2 = l.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Long l2 = this.f51524c;
        if (l2 != null) {
            i3 = l2.hashCode();
        }
        return i5 + i3;
    }
}

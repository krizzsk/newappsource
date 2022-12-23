package p774rn;

/* renamed from: rn.b */
public final class C19292b {

    /* renamed from: a */
    public final String f49047a;

    /* renamed from: b */
    public final Long f49048b;

    /* renamed from: c */
    public final Integer f49049c;

    public C19292b(String str, Long l, Integer num) {
        this.f49047a = str;
        this.f49048b = l;
        this.f49049c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19292b.class != obj.getClass()) {
            return false;
        }
        C19292b bVar = (C19292b) obj;
        String str = this.f49047a;
        if (str == null ? bVar.f49047a != null : !str.equals(bVar.f49047a)) {
            return false;
        }
        Long l = this.f49048b;
        if (l == null ? bVar.f49048b != null : !l.equals(bVar.f49048b)) {
            return false;
        }
        Integer num = this.f49049c;
        Integer num2 = bVar.f49049c;
        if (num != null) {
            return num.equals(num2);
        }
        if (num2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f49047a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Long l = this.f49048b;
        if (l != null) {
            i2 = l.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Integer num = this.f49049c;
        if (num != null) {
            i3 = num.hashCode();
        }
        return i5 + i3;
    }
}

package od0;

/* renamed from: od0.s */
public final class C24575s {

    /* renamed from: a */
    public long f62304a;

    /* renamed from: b */
    public String f62305b;

    /* renamed from: c */
    public String f62306c;

    /* renamed from: d */
    public String f62307d;

    public C24575s(long j, String str, String str2, String str3) {
        this.f62304a = j;
        this.f62305b = str;
        this.f62306c = str2;
        this.f62307d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24575s.class != obj.getClass()) {
            return false;
        }
        C24575s sVar = (C24575s) obj;
        if (this.f62304a != sVar.f62304a) {
            return false;
        }
        String str = this.f62305b;
        if (str == null ? sVar.f62305b != null : !str.equals(sVar.f62305b)) {
            return false;
        }
        String str2 = this.f62306c;
        if (str2 == null ? sVar.f62306c != null : !str2.equals(sVar.f62306c)) {
            return false;
        }
        String str3 = this.f62307d;
        String str4 = sVar.f62307d;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        long j = this.f62304a;
        int i3 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f62305b;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.f62306c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f62307d;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i6 + i4;
    }
}

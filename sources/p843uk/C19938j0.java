package p843uk;

/* renamed from: uk.j0 */
public final class C19938j0 {

    /* renamed from: a */
    public final String f50640a;

    /* renamed from: b */
    public final String f50641b;

    /* renamed from: c */
    public final String f50642c;

    public C19938j0(String str, String str2, String str3) {
        this.f50640a = str;
        this.f50641b = str2;
        this.f50642c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19938j0.class != obj.getClass()) {
            return false;
        }
        C19938j0 j0Var = (C19938j0) obj;
        String str = this.f50640a;
        if (str == null ? j0Var.f50640a != null : !str.equals(j0Var.f50640a)) {
            return false;
        }
        String str2 = this.f50641b;
        if (str2 == null ? j0Var.f50641b != null : !str2.equals(j0Var.f50641b)) {
            return false;
        }
        String str3 = this.f50642c;
        String str4 = j0Var.f50642c;
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
        String str = this.f50640a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.f50641b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f50642c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }
}

package p843uk;

/* renamed from: uk.n */
public final class C19944n {

    /* renamed from: a */
    public final String f50662a;

    /* renamed from: b */
    public final String f50663b;

    /* renamed from: c */
    public final String f50664c;

    /* renamed from: d */
    public final String f50665d;

    public C19944n(String str, String str2, String str3, String str4) {
        this.f50662a = str;
        this.f50663b = str2;
        this.f50664c = str3;
        this.f50665d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19944n.class != obj.getClass()) {
            return false;
        }
        C19944n nVar = (C19944n) obj;
        String str = this.f50662a;
        if (str == null ? nVar.f50662a != null : !str.equals(nVar.f50662a)) {
            return false;
        }
        String str2 = this.f50663b;
        if (str2 == null ? nVar.f50663b != null : !str2.equals(nVar.f50663b)) {
            return false;
        }
        String str3 = this.f50664c;
        if (str3 == null ? nVar.f50664c != null : !str3.equals(nVar.f50664c)) {
            return false;
        }
        String str4 = this.f50665d;
        String str5 = nVar.f50665d;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f50662a;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.f50663b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f50664c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str4 = this.f50665d;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i7 + i4;
    }
}

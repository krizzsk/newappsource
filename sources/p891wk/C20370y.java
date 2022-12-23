package p891wk;

/* renamed from: wk.y */
public final class C20370y {

    /* renamed from: a */
    public String f51647a;

    /* renamed from: b */
    public String f51648b;

    /* renamed from: c */
    public String f51649c;

    /* renamed from: d */
    public String f51650d;

    /* renamed from: e */
    public Boolean f51651e;

    /* renamed from: f */
    public Boolean f51652f;

    /* renamed from: g */
    public String f51653g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20370y.class != obj.getClass()) {
            return false;
        }
        C20370y yVar = (C20370y) obj;
        Boolean bool = this.f51651e;
        if (bool == null ? yVar.f51651e != null : !bool.equals(yVar.f51651e)) {
            return false;
        }
        Boolean bool2 = this.f51652f;
        if (bool2 == null ? yVar.f51652f != null : !bool2.equals(yVar.f51652f)) {
            return false;
        }
        String str = this.f51647a;
        if (str == null ? yVar.f51647a != null : !str.equals(yVar.f51647a)) {
            return false;
        }
        String str2 = this.f51648b;
        if (str2 == null ? yVar.f51648b != null : !str2.equals(yVar.f51648b)) {
            return false;
        }
        String str3 = this.f51649c;
        if (str3 == null ? yVar.f51649c != null : !str3.equals(yVar.f51649c)) {
            return false;
        }
        String str4 = this.f51650d;
        if (str4 == null ? yVar.f51650d != null : !str4.equals(yVar.f51650d)) {
            return false;
        }
        String str5 = this.f51653g;
        String str6 = yVar.f51653g;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = this.f51647a;
        int i7 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        String str2 = this.f51648b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        String str3 = this.f51649c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i9 + i3) * 31;
        String str4 = this.f51650d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        Boolean bool = this.f51651e;
        if (bool != null) {
            i5 = bool.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        Boolean bool2 = this.f51652f;
        if (bool2 != null) {
            i6 = bool2.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        String str5 = this.f51653g;
        if (str5 != null) {
            i7 = str5.hashCode();
        }
        return i14 + i7;
    }
}

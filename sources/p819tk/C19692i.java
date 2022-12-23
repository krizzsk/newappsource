package p819tk;

/* renamed from: tk.i */
public final class C19692i {

    /* renamed from: a */
    public String f49997a;

    /* renamed from: b */
    public String f49998b;

    /* renamed from: c */
    public Long f49999c;

    /* renamed from: d */
    public String f50000d;

    /* renamed from: e */
    public Long f50001e;

    /* renamed from: f */
    public Boolean f50002f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19692i.class != obj.getClass()) {
            return false;
        }
        C19692i iVar = (C19692i) obj;
        String str = this.f49997a;
        if (str == null ? iVar.f49997a != null : !str.equals(iVar.f49997a)) {
            return false;
        }
        String str2 = this.f49998b;
        if (str2 == null ? iVar.f49998b != null : !str2.equals(iVar.f49998b)) {
            return false;
        }
        Long l = this.f49999c;
        if (l == null ? iVar.f49999c != null : !l.equals(iVar.f49999c)) {
            return false;
        }
        String str3 = this.f50000d;
        if (str3 == null ? iVar.f50000d != null : !str3.equals(iVar.f50000d)) {
            return false;
        }
        Long l2 = this.f50001e;
        if (l2 == null ? iVar.f50001e != null : !l2.equals(iVar.f50001e)) {
            return false;
        }
        Boolean bool = this.f50002f;
        Boolean bool2 = iVar.f50002f;
        if (bool != null) {
            return bool.equals(bool2);
        }
        if (bool2 == null) {
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
        String str = this.f49997a;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str2 = this.f49998b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        Long l = this.f49999c;
        if (l != null) {
            i3 = l.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str3 = this.f50000d;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i9 + i4) * 31;
        Long l2 = this.f50001e;
        if (l2 != null) {
            i5 = l2.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        Boolean bool = this.f50002f;
        if (bool != null) {
            i6 = bool.hashCode();
        }
        return i12 + i6;
    }
}

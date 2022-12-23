package p678nk;

import p819tk.C19686c;

/* renamed from: nk.a */
public final class C18571a extends C19686c {

    /* renamed from: b */
    public String f47270b;

    /* renamed from: c */
    public String f47271c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18571a.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C18571a aVar = (C18571a) obj;
        String str = this.f47270b;
        if (str == null ? aVar.f47270b != null : !str.equals(aVar.f47270b)) {
            return false;
        }
        String str2 = this.f47271c;
        String str3 = aVar.f47271c;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.f47270b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f47271c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }
}

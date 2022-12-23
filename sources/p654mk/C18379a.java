package p654mk;

import p819tk.C19686c;

/* renamed from: mk.a */
public final class C18379a extends C19686c {

    /* renamed from: b */
    public String f46847b;

    /* renamed from: c */
    public String f46848c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18379a.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C18379a aVar = (C18379a) obj;
        String str = this.f46847b;
        if (str == null ? aVar.f46847b != null : !str.equals(aVar.f46847b)) {
            return false;
        }
        String str2 = this.f46848c;
        String str3 = aVar.f46848c;
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
        String str = this.f46847b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f46848c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }
}

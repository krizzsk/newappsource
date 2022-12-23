package p654mk;

import p819tk.C19686c;

/* renamed from: mk.j */
public final class C18388j extends C19686c {

    /* renamed from: b */
    public String f46868b;

    /* renamed from: c */
    public String f46869c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18388j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C18388j jVar = (C18388j) obj;
        String str = this.f46868b;
        if (str == null ? jVar.f46868b != null : !str.equals(jVar.f46868b)) {
            return false;
        }
        String str2 = this.f46869c;
        String str3 = jVar.f46869c;
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
        String str = this.f46868b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f46869c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }
}

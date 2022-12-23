package p891wk;

import p819tk.C19686c;

/* renamed from: wk.m */
public final class C20358m extends C19686c {

    /* renamed from: b */
    public String f51566b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20358m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.f51566b;
        String str2 = ((C20358m) obj).f51566b;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.f51566b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}

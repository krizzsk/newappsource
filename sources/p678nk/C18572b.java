package p678nk;

import p819tk.C19687d;

/* renamed from: nk.b */
public final class C18572b extends C19687d {

    /* renamed from: d */
    public final String f47272d;

    public C18572b(String str) {
        this.f47272d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18572b.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.f47272d;
        String str2 = ((C18572b) obj).f47272d;
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
        String str = this.f47272d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}

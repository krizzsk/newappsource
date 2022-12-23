package p654mk;

import p819tk.C19686c;

/* renamed from: mk.e */
public final class C18383e extends C19686c {

    /* renamed from: b */
    public String f46857b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18383e.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.f46857b;
        String str2 = ((C18383e) obj).f46857b;
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
        String str = this.f46857b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}

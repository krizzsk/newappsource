package p891wk;

import p819tk.C19686c;

/* renamed from: wk.u */
public final class C20366u extends C19686c {

    /* renamed from: b */
    public C20367v f51641b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20366u.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C20367v vVar = this.f51641b;
        C20367v vVar2 = ((C20366u) obj).f51641b;
        if (vVar != null) {
            return vVar.equals(vVar2);
        }
        if (vVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        C20367v vVar = this.f51641b;
        if (vVar != null) {
            i = vVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}

package p891wk;

import p819tk.C19687d;

/* renamed from: wk.w */
public final class C20368w extends C19687d {

    /* renamed from: d */
    public C20369x f51643d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20368w.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C20369x xVar = this.f51643d;
        C20369x xVar2 = ((C20368w) obj).f51643d;
        if (xVar != null) {
            return xVar.equals(xVar2);
        }
        if (xVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        C20369x xVar = this.f51643d;
        if (xVar != null) {
            i = xVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}

package p843uk;

import p819tk.C19686c;

/* renamed from: uk.b0 */
public final class C19920b0 extends C19686c {

    /* renamed from: b */
    public final C19933h f50590b;

    /* renamed from: uk.b0$a */
    public static class C19921a {
    }

    public C19920b0(C19933h hVar) {
        this.f50590b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19920b0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C19933h hVar = this.f50590b;
        C19933h hVar2 = ((C19920b0) obj).f50590b;
        if (hVar != null) {
            return hVar.equals(hVar2);
        }
        if (hVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        C19933h hVar = this.f50590b;
        if (hVar != null) {
            i = hVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}

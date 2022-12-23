package p843uk;

/* renamed from: uk.w */
public final class C19953w {

    /* renamed from: a */
    public final String f50717a;

    /* renamed from: b */
    public final String f50718b;

    public C19953w(String str, String str2) {
        this.f50717a = str;
        this.f50718b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19953w.class != obj.getClass()) {
            return false;
        }
        C19953w wVar = (C19953w) obj;
        if (!this.f50717a.equals(wVar.f50717a)) {
            return false;
        }
        return this.f50718b.equals(wVar.f50718b);
    }

    public final int hashCode() {
        return this.f50718b.hashCode() + (this.f50717a.hashCode() * 31);
    }
}

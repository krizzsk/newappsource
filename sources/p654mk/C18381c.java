package p654mk;

/* renamed from: mk.c */
public final class C18381c {

    /* renamed from: a */
    public C18384f f46853a;

    /* renamed from: b */
    public String f46854b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18381c.class != obj.getClass()) {
            return false;
        }
        C18381c cVar = (C18381c) obj;
        C18384f fVar = this.f46853a;
        if (fVar == null ? cVar.f46853a != null : !fVar.equals(cVar.f46853a)) {
            return false;
        }
        String str = this.f46854b;
        String str2 = cVar.f46854b;
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
        C18384f fVar = this.f46853a;
        int i2 = 0;
        if (fVar != null) {
            i = fVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.f46854b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }
}

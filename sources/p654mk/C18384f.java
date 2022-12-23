package p654mk;

/* renamed from: mk.f */
public final class C18384f {

    /* renamed from: a */
    public String f46858a;

    /* renamed from: b */
    public Integer f46859b;

    /* renamed from: c */
    public String f46860c;

    /* renamed from: d */
    public Integer f46861d;

    /* renamed from: e */
    public C18392n f46862e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18384f.class != obj.getClass()) {
            return false;
        }
        C18384f fVar = (C18384f) obj;
        String str = this.f46858a;
        if (str == null ? fVar.f46858a != null : !str.equals(fVar.f46858a)) {
            return false;
        }
        Integer num = this.f46859b;
        if (num == null ? fVar.f46859b != null : !num.equals(fVar.f46859b)) {
            return false;
        }
        String str2 = this.f46860c;
        if (str2 == null ? fVar.f46860c != null : !str2.equals(fVar.f46860c)) {
            return false;
        }
        Integer num2 = this.f46861d;
        if (num2 == null ? fVar.f46861d != null : !num2.equals(fVar.f46861d)) {
            return false;
        }
        C18392n nVar = this.f46862e;
        C18392n nVar2 = fVar.f46862e;
        if (nVar != null) {
            return nVar.equals(nVar2);
        }
        if (nVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f46858a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        Integer num = this.f46859b;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.f46860c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        Integer num2 = this.f46861d;
        if (num2 != null) {
            i4 = num2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        C18392n nVar = this.f46862e;
        if (nVar != null) {
            i5 = nVar.hashCode();
        }
        return i9 + i5;
    }
}

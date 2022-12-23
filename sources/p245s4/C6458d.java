package p245s4;

/* renamed from: s4.d */
public class C6458d {

    /* renamed from: a */
    public final int f20171a;

    /* renamed from: b */
    public final Object f20172b;

    /* renamed from: c */
    public C6458d f20173c;

    public C6458d(int i, Object obj) {
        this.f20171a = i;
        this.f20172b = obj;
    }

    /* renamed from: a */
    public final String mo22576a() {
        if (this.f20173c == null) {
            return "";
        }
        StringBuilder k = C13555b.m33972k(" -> ");
        k.append(this.f20173c);
        return k.toString();
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6458d)) {
            return false;
        }
        C6458d dVar = (C6458d) obj;
        if (this.f20171a == dVar.f20171a && ((obj2 = this.f20172b) == null ? dVar.f20172b == null : obj2.equals(dVar.f20172b))) {
            C6458d dVar2 = this.f20173c;
            C6458d dVar3 = dVar.f20173c;
            if (dVar2 != null) {
                if (dVar2.equals(dVar3)) {
                    return true;
                }
            } else if (dVar3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f20171a * 31;
        Object obj = this.f20172b;
        return i + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f20171a != 0) {
            str = super.toString();
        } else {
            str = C16530d.m42015h(C13555b.m33972k("LITERAL("), this.f20172b, ")");
        }
        stringBuffer.append(str);
        stringBuffer.append(mo22576a());
        return stringBuffer.toString();
    }
}

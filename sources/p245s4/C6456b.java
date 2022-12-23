package p245s4;

/* renamed from: s4.b */
public final class C6456b extends C6460f {

    /* renamed from: f */
    public C6458d f20169f;

    public C6456b(String str) {
        super((Object) str);
    }

    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof C6456b)) {
            return false;
        }
        C6458d dVar = this.f20169f;
        C6458d dVar2 = ((C6456b) obj).f20169f;
        return dVar != null ? dVar.equals(dVar2) : dVar2 == null;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f20169f != null) {
            StringBuilder k = C13555b.m33972k("CompositeNode(");
            k.append(this.f20169f);
            k.append(")");
            str = k.toString();
        } else {
            str = "CompositeNode(no child)";
        }
        sb.append(str);
        sb.append(mo22576a());
        return sb.toString();
    }
}

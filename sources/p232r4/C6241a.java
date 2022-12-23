package p232r4;

/* renamed from: r4.a */
public abstract class C6241a<E> extends C6243c<E> {

    /* renamed from: h */
    public C6242b f19692h;

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CompositeConverter<");
        C6244d dVar = this.f19695d;
        if (dVar != null) {
            k.append(dVar);
        }
        if (this.f19692h != null) {
            k.append(", children: ");
            k.append(this.f19692h);
        }
        k.append(">");
        return k.toString();
    }
}

package fh0;

import cg0.C21154b;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import zf0.C25432c;

/* renamed from: fh0.b */
public final class C23384b implements C23385c, C23387e {

    /* renamed from: a */
    public final C25432c f59166a;

    /* renamed from: b */
    public final C25432c f59167b;

    public C23384b(C21154b bVar) {
        C24362h.m61211f(bVar, "classDescriptor");
        this.f59166a = bVar;
        this.f59167b = bVar;
    }

    public final boolean equals(Object obj) {
        C25432c cVar = this.f59166a;
        C25432c cVar2 = null;
        C23384b bVar = obj instanceof C23384b ? (C23384b) obj : null;
        if (bVar != null) {
            cVar2 = bVar.f59166a;
        }
        return C24362h.m61206a(cVar, cVar2);
    }

    public final C24307v getType() {
        C24312z q = this.f59166a.mo53412q();
        C24362h.m61210e(q, "classDescriptor.defaultType");
        return q;
    }

    public final int hashCode() {
        return this.f59166a.hashCode();
    }

    /* renamed from: t */
    public final C25432c mo58546t() {
        return this.f59166a;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Class{");
        C24312z q = this.f59166a.mo53412q();
        C24362h.m61210e(q, "classDescriptor.defaultType");
        k.append(q);
        k.append('}');
        return k.toString();
    }
}

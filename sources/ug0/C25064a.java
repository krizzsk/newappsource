package ug0;

import mf0.C24362h;
import uh0.C25081h;

/* renamed from: ug0.a */
public final class C25064a {

    /* renamed from: a */
    public final C25066c f63246a;

    /* renamed from: b */
    public final C25066c f63247b = null;

    /* renamed from: c */
    public final C25069e f63248c;

    /* renamed from: d */
    public final C25066c f63249d;

    static {
        C25066c.m62800j(C25071g.f63271f);
    }

    public C25064a(C25066c cVar, C25069e eVar) {
        C24362h.m61211f(cVar, "packageName");
        this.f63246a = cVar;
        this.f63248c = eVar;
        this.f63249d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25064a)) {
            return false;
        }
        C25064a aVar = (C25064a) obj;
        return C24362h.m61206a(this.f63246a, aVar.f63246a) && C24362h.m61206a(this.f63247b, aVar.f63247b) && C24362h.m61206a(this.f63248c, aVar.f63248c) && C24362h.m61206a(this.f63249d, aVar.f63249d);
    }

    public final int hashCode() {
        int hashCode = this.f63246a.hashCode() * 31;
        C25066c cVar = this.f63247b;
        int i = 0;
        int hashCode2 = (this.f63248c.hashCode() + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        C25066c cVar2 = this.f63249d;
        if (cVar2 != null) {
            i = cVar2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String b = this.f63246a.mo61580b();
        C24362h.m61210e(b, "packageName.asString()");
        sb.append(C25081h.m62834E(b, '.', '/'));
        sb.append("/");
        C25066c cVar = this.f63247b;
        if (cVar != null) {
            sb.append(cVar);
            sb.append(".");
        }
        sb.append(this.f63248c);
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

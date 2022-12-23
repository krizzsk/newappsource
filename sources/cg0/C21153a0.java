package cg0;

import ag0.C20989e;
import mf0.C24362h;
import ug0.C25066c;
import zf0.C25435d0;
import zf0.C25447i;
import zf0.C25485t;
import zf0.C25486u;

/* renamed from: cg0.a0 */
public abstract class C21153a0 extends C21186o implements C25486u {

    /* renamed from: f */
    public final C25066c f53008f;

    /* renamed from: g */
    public final String f53009g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21153a0(C25485t tVar, C25066c cVar) {
        super(tVar, C20989e.C20990a.f52739a, cVar.mo61586g(), C25435d0.f63736a);
        C24362h.m61211f(tVar, "module");
        C24362h.m61211f(cVar, "fqName");
        this.f53008f = cVar;
        this.f53009g = "package " + cVar + " of " + tVar;
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60151b(this, d);
    }

    /* renamed from: e */
    public C25435d0 mo53400e() {
        return C25435d0.f63736a;
    }

    /* renamed from: f */
    public final C25066c mo53401f() {
        return this.f53008f;
    }

    public String toString() {
        return this.f53009g;
    }

    /* renamed from: b */
    public final C25485t m49448b() {
        return (C25485t) super.mo53399b();
    }
}

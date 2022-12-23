package kg0;

import bf0.C21049c;
import hg0.C23478n;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C23943a;
import mf0.C24362h;

/* renamed from: kg0.d */
public final class C23780d {

    /* renamed from: a */
    public final C23777b f60080a;

    /* renamed from: b */
    public final C23783g f60081b;

    /* renamed from: c */
    public final C21049c<C23478n> f60082c;

    /* renamed from: d */
    public final C21049c f60083d;

    /* renamed from: e */
    public final C23943a f60084e;

    public C23780d(C23777b bVar, C23783g gVar, C21049c<C23478n> cVar) {
        C24362h.m61211f(bVar, "components");
        C24362h.m61211f(gVar, "typeParameterResolver");
        C24362h.m61211f(cVar, "delegateForDefaultTypeQualifiers");
        this.f60080a = bVar;
        this.f60081b = gVar;
        this.f60082c = cVar;
        this.f60083d = cVar;
        this.f60084e = new C23943a(this, gVar);
    }

    /* renamed from: a */
    public final C23478n mo59011a() {
        return (C23478n) this.f60083d.getValue();
    }
}

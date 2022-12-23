package dg0;

import kotlin.collections.builders.MapBuilder;
import mf0.C24362h;
import zf0.C25468m0;
import zf0.C25479n0;

/* renamed from: dg0.b */
public final class C23270b extends C25479n0 {

    /* renamed from: c */
    public static final C23270b f59025c = new C23270b();

    public C23270b() {
        super("protected_and_package", true);
    }

    /* renamed from: a */
    public final Integer mo58406a(C25479n0 n0Var) {
        C24362h.m61211f(n0Var, "visibility");
        boolean z = false;
        if (C24362h.m61206a(this, n0Var)) {
            return 0;
        }
        if (n0Var == C25468m0.C25470b.f63758c) {
            return null;
        }
        MapBuilder mapBuilder = C25468m0.f63756a;
        int i = 1;
        if (n0Var == C25468m0.C25473e.f63761c || n0Var == C25468m0.C25474f.f63762c) {
            z = true;
        }
        if (!z) {
            i = -1;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: b */
    public final String mo58407b() {
        return "protected/*protected and package*/";
    }

    /* renamed from: c */
    public final C25479n0 mo58408c() {
        return C25468m0.C25475g.f63763c;
    }
}

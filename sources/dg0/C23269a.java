package dg0;

import kotlin.collections.builders.MapBuilder;
import mf0.C24362h;
import zf0.C25468m0;
import zf0.C25479n0;

/* renamed from: dg0.a */
public final class C23269a extends C25479n0 {

    /* renamed from: c */
    public static final C23269a f59024c = new C23269a();

    public C23269a() {
        super("package", false);
    }

    /* renamed from: a */
    public final Integer mo58406a(C25479n0 n0Var) {
        C24362h.m61211f(n0Var, "visibility");
        boolean z = false;
        if (this == n0Var) {
            return 0;
        }
        MapBuilder mapBuilder = C25468m0.f63756a;
        if (n0Var == C25468m0.C25473e.f63761c || n0Var == C25468m0.C25474f.f63762c) {
            z = true;
        }
        if (z) {
            return 1;
        }
        return -1;
    }

    /* renamed from: b */
    public final String mo58407b() {
        return "public/*package*/";
    }

    /* renamed from: c */
    public final C25479n0 mo58408c() {
        return C25468m0.C25475g.f63763c;
    }
}

package p727pl;

import ce0.C21100e;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import p364al.C13487h;
import p413co.C13868n;
import p413co.C13872r;
import p561ik.C17618a;
import p610kn.C18107a;
import p725pj.C18926a;
import p794sj.C19464a;
import p913xi.C20531d;

/* renamed from: pl.b */
public final class C18932b {

    /* renamed from: a */
    public final C13868n f48214a;

    /* renamed from: b */
    public final C20531d f48215b;

    public /* synthetic */ C18932b(C13868n nVar, C20531d dVar) {
        this.f48214a = nVar;
        this.f48215b = dVar;
    }

    /* renamed from: a */
    public final C13487h mo51446a(C18107a aVar) {
        if (aVar.f46301b.longValue() <= 0) {
            return new C13487h(null, new C19464a((C18926a) null, C19464a.f49493h, "Invalid token expiry provided"));
        }
        try {
            C13872r<Void> c = this.f48214a.mo40786c(C21100e.m49331Z(), "AuthenticationToken.txt", this.f48215b.mo52733b(aVar).getBytes(StandardCharsets.UTF_8));
            if (!c.mo40817a()) {
                return new C13487h(null, (C18926a) null);
            }
            return new C13487h(null, new C19464a(c.f34120b, C19464a.f49491f, "Write failed"));
        } catch (JSONException e) {
            return new C13487h(null, new C19464a(new C17618a(e.getMessage()), C19464a.f49491f, "Write failed"));
        }
    }
}

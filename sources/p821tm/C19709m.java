package p821tm;

import ce0.C21100e;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import p364al.C13487h;
import p413co.C13868n;
import p413co.C13872r;
import p465ek.C16835c;
import p561ik.C17618a;
import p561ik.C17619b;
import p725pj.C18926a;
import p891wk.C20351f;
import p913xi.C20531d;

/* renamed from: tm.m */
public final class C19709m {

    /* renamed from: a */
    public final /* synthetic */ int f50052a;

    /* renamed from: b */
    public final C13868n f50053b;

    /* renamed from: c */
    public final C20531d f50054c;

    public /* synthetic */ C19709m(C13868n nVar, C20531d dVar, int i) {
        this.f50052a = i;
        this.f50053b = nVar;
        this.f50054c = dVar;
    }

    /* renamed from: a */
    public final C13487h mo52058a(C20351f fVar) {
        try {
            C13872r<Void> c = this.f50053b.mo40786c(C21100e.m49347j0(), "LocalTicketsMetadata.json", this.f50054c.mo52733b(fVar).getBytes(StandardCharsets.UTF_8));
            if (c.mo40817a()) {
                return mo52059b(c.f34120b);
            }
            return new C13487h(null, (C18926a) null);
        } catch (JSONException e) {
            StringBuilder k = C13555b.m33972k("Failed saving tickets metadata: ");
            k.append(e.getMessage());
            return mo52059b(new C17618a(k.toString()));
        }
    }

    /* renamed from: b */
    public final C13487h mo52059b(C18926a aVar) {
        switch (this.f50052a) {
            case 0:
                return new C13487h(null, new C16835c(aVar, C16835c.f43815h, "Read failed"));
            default:
                return new C13487h(null, new C17619b(aVar));
        }
    }
}

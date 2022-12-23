package p490fl;

import ce0.C21100e;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import p364al.C13487h;
import p413co.C13868n;
import p413co.C13872r;
import p561ik.C17618a;
import p586jn.C17900f;
import p725pj.C18926a;
import p770rj.C19281c;
import p913xi.C20531d;

/* renamed from: fl.e */
public final class C17037e {

    /* renamed from: a */
    public final C13868n f44170a;

    /* renamed from: b */
    public final C20531d f44171b;

    public C17037e(C13868n nVar, C20531d dVar) {
        this.f44170a = nVar;
        this.f44171b = dVar;
    }

    /* renamed from: a */
    public final C13487h<C17900f> mo49646a() {
        C13872r<byte[]> d = this.f44170a.mo40787d(C21100e.m49327V(), "account.txt");
        if (d.mo40817a()) {
            return new C13487h<>(null, new C19281c(d.f34120b, C19281c.f49007e, "Read failed"));
        }
        S s = d.f34119a;
        if (s == null) {
            return new C13487h<>(null, (C18926a) null);
        }
        try {
            return new C13487h<>((C17900f) this.f44171b.mo52732a(C17900f.class, new String((byte[]) s, StandardCharsets.UTF_8)), (C18926a) null);
        } catch (JSONException e) {
            return new C13487h<>(null, new C19281c(new C17618a(e.getMessage()), C19281c.f49007e, "Read failed"));
        }
    }
}

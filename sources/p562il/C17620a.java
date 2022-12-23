package p562il;

import ce0.C21100e;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import p364al.C13483d;
import p364al.C13487h;
import p413co.C13868n;
import p413co.C13872r;
import p561ik.C17618a;
import p586jn.C17900f;
import p725pj.C18926a;
import p770rj.C19281c;
import p913xi.C20531d;

/* renamed from: il.a */
public final class C17620a implements C13483d<Void> {

    /* renamed from: a */
    public final C13868n f45293a;

    /* renamed from: b */
    public final C20531d f45294b;

    /* renamed from: c */
    public final C17900f f45295c;

    /* renamed from: il.a$a */
    public static class C17621a {

        /* renamed from: a */
        public final C13868n f45296a;

        /* renamed from: b */
        public final C20531d f45297b;

        public C17621a(C13868n nVar, C20531d dVar) {
            this.f45296a = nVar;
            this.f45297b = dVar;
        }
    }

    public C17620a(C13868n nVar, C20531d dVar, C17900f fVar) {
        this.f45293a = nVar;
        this.f45294b = dVar;
        this.f45295c = fVar;
    }

    /* renamed from: C */
    public final C13487h<Void> mo40394C() {
        try {
            C13872r<Void> c = this.f45293a.mo40786c(C21100e.m49327V(), "account.txt", this.f45294b.mo52733b(this.f45295c).getBytes(StandardCharsets.UTF_8));
            if (c.mo40817a()) {
                return new C13487h<>(null, new C19281c(c.f34120b, C19281c.f49008f, "Write failed"));
            }
            return new C13487h<>(null, (C18926a) null);
        } catch (JSONException e) {
            return new C13487h<>(null, new C19281c(new C17618a(e.getMessage()), C19281c.f49008f, "Write failed"));
        }
    }
}

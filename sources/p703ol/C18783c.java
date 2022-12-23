package p703ol;

import ce0.C21100e;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import p364al.C13487h;
import p413co.C13868n;
import p413co.C13872r;
import p561ik.C17618a;
import p610kn.C18107a;
import p702ok.C18779e;
import p725pj.C18926a;
import p794sj.C19464a;
import p913xi.C20531d;

/* renamed from: ol.c */
public final class C18783c {

    /* renamed from: a */
    public final C13868n f47809a;

    /* renamed from: b */
    public final C20531d f47810b;

    public /* synthetic */ C18783c(C13868n nVar, C20531d dVar) {
        this.f47809a = nVar;
        this.f47810b = dVar;
    }

    /* renamed from: a */
    public final C13487h mo51265a() {
        C13872r<byte[]> d = this.f47809a.mo40787d(C21100e.m49331Z(), "AuthenticationToken.txt");
        if (d.mo40817a()) {
            return new C13487h(null, new C19464a(d.f34120b, C19464a.f49490e, "Read failed"));
        }
        byte[] bArr = (byte[]) d.f34119a;
        if (bArr == null) {
            return new C13487h(null, (C18926a) null);
        }
        try {
            return new C13487h((C18107a) this.f47810b.mo52732a(C18107a.class, new String(bArr, StandardCharsets.UTF_8)), (C18926a) null);
        } catch (JSONException e) {
            return new C13487h(null, new C19464a(new C17618a(e.getMessage()), C19464a.f49490e, "Read failed"));
        }
    }

    /* renamed from: b */
    public final C13487h mo51266b(C18779e eVar) {
        try {
            this.f47809a.mo40786c(C21100e.m49332a0(), C21100e.m49304E(new byte[]{116, 105, 99, 107, 101, 116, 102, 97, 99, 101, 115, 46, 106, 115, 111, 110}), this.f47810b.mo52733b(eVar).getBytes());
            return new C13487h(null, (C18926a) null);
        } catch (JSONException unused) {
            return new C13487h(null, new C17618a("Error converting to ticket face metadata json."));
        }
    }
}

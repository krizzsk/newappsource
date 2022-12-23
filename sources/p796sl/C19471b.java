package p796sl;

import ce0.C21100e;
import java.nio.charset.StandardCharsets;
import p090g1.C4745d;
import p364al.C13487h;
import p413co.C13868n;
import p413co.C13872r;
import p702ok.C18775a;
import p725pj.C18926a;
import p818tj.C19683a;

/* renamed from: sl.b */
public final class C19471b {

    /* renamed from: a */
    public final C13868n f49516a;

    /* renamed from: b */
    public final C4745d f49517b;

    public C19471b(C13868n nVar, C4745d dVar) {
        this.f49516a = nVar;
        this.f49517b = dVar;
    }

    /* renamed from: a */
    public final C13487h<C18775a> mo51868a(String str) {
        C13872r<byte[]> d = this.f49516a.mo40787d(C21100e.m49332a0(), str);
        if (d.mo40817a()) {
            return new C13487h<>(null, d.f34120b);
        }
        S s = d.f34119a;
        if (s == null) {
            return new C13487h<>(null, new C19683a((C18926a) null, C19683a.f49966l, (String) null));
        }
        return this.f49517b.mo20254a(new String((byte[]) s, StandardCharsets.UTF_8), str);
    }
}

package p697of;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import hi0.C23529c0;
import hi0.C23534e;
import hi0.C23538f;
import hi0.C23558r;
import hi0.C23569w;
import hi0.C23571x;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import p649mf.C18367b;
import p766rf.C19260d;

/* renamed from: of.g */
public final class C18745g implements C23538f {

    /* renamed from: b */
    public final C23538f f47681b;

    /* renamed from: c */
    public final C18367b f47682c;

    /* renamed from: d */
    public final Timer f47683d;

    /* renamed from: e */
    public final long f47684e;

    public C18745g(C23538f fVar, C19260d dVar, Timer timer, long j) {
        this.f47681b = fVar;
        this.f47682c = new C18367b(dVar);
        this.f47684e = j;
        this.f47683d = timer;
    }

    /* renamed from: c */
    public final void mo5762c(C23534e eVar, IOException iOException) {
        C23571x xVar = ((C23569w) eVar).f59630d;
        if (xVar != null) {
            C23558r rVar = xVar.f59636a;
            if (rVar != null) {
                try {
                    this.f47682c.mo50839o(new URL(rVar.f59542i).toString());
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
            String str = xVar.f59637b;
            if (str != null) {
                this.f47682c.mo50832f(str);
            }
        }
        this.f47682c.mo50835k(this.f47684e);
        this.f47682c.mo50838n(this.f47683d.mo43519b());
        C18746h.m45753c(this.f47682c);
        this.f47681b.mo5762c(eVar, iOException);
    }

    /* renamed from: d */
    public final void mo5763d(C23534e eVar, C23529c0 c0Var) throws IOException {
        C23529c0 c0Var2 = c0Var;
        FirebasePerfOkHttpClient.m36079a(c0Var2, this.f47682c, this.f47684e, this.f47683d.mo43519b());
        this.f47681b.mo5763d(eVar, c0Var);
    }
}

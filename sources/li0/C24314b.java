package li0;

import com.amazonaws.http.HttpHeader;
import hi0.C23529c0;
import hi0.C23560s;
import hi0.C23571x;
import ii0.C23610d;
import java.io.IOException;
import java.net.ProtocolException;
import ki0.C23795c;
import mf0.C24361g;
import si0.C24911r;
import si0.C24917w;

/* renamed from: li0.b */
public final class C24314b implements C23560s {

    /* renamed from: a */
    public final boolean f61609a;

    public C24314b(boolean z) {
        this.f61609a = z;
    }

    public final C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        boolean z;
        C23529c0 c0Var;
        C23529c0.C23530a aVar2;
        C24319f fVar = (C24319f) aVar;
        C23795c cVar = fVar.f61616c;
        if (cVar != null) {
            C23571x xVar = fVar.f61618e;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                cVar.f60093b.getClass();
                cVar.f60095d.mo60458d(xVar);
                cVar.f60093b.getClass();
                C23529c0.C23530a aVar3 = null;
                boolean z2 = true;
                if (!C24361g.m61163g0(xVar.f59637b) || xVar.f59639d == null) {
                    cVar.f60092a.mo59051c(cVar, true, false, (IOException) null);
                    z = false;
                } else {
                    if ("100-continue".equalsIgnoreCase(xVar.mo58725a(HttpHeader.EXPECT))) {
                        try {
                            cVar.f60095d.mo60461g();
                            cVar.f60093b.getClass();
                            aVar2 = cVar.mo59027c(true);
                            z = true;
                        } catch (IOException e) {
                            cVar.f60093b.getClass();
                            cVar.mo59028d(e);
                            throw e;
                        }
                    } else {
                        z = false;
                        aVar2 = null;
                    }
                    if (aVar2 == null) {
                        xVar.f59639d.getClass();
                        cVar.f60096e = false;
                        long a = xVar.f59639d.mo53612a();
                        cVar.f60093b.getClass();
                        C24917w wVar = new C24917w(new C23795c.C23796a(cVar.f60095d.mo60456c(xVar, a), a));
                        xVar.f59639d.mo53614e(wVar);
                        wVar.close();
                    } else {
                        cVar.f60092a.mo59051c(cVar, true, false, (IOException) null);
                        if (cVar.mo59026b().f60122h == null) {
                            z2 = false;
                        }
                        if (!z2) {
                            cVar.f60095d.mo60460f().mo59042h();
                        }
                    }
                    aVar3 = aVar2;
                }
                try {
                    cVar.f60095d.mo60454a();
                    if (!z) {
                        cVar.f60093b.getClass();
                    }
                    if (aVar3 == null) {
                        aVar3 = cVar.mo59027c(false);
                    }
                    aVar3.f59424a = xVar;
                    aVar3.f59428e = cVar.mo59026b().f60120f;
                    aVar3.f59434k = currentTimeMillis;
                    aVar3.f59435l = System.currentTimeMillis();
                    C23529c0 a2 = aVar3.mo58645a();
                    int i = a2.f59412d;
                    if (i == 100) {
                        C23529c0.C23530a c = cVar.mo59027c(false);
                        c.f59424a = xVar;
                        c.f59428e = cVar.mo59026b().f60120f;
                        c.f59434k = currentTimeMillis;
                        c.f59435l = System.currentTimeMillis();
                        a2 = c.mo58645a();
                        i = a2.f59412d;
                    }
                    cVar.f60093b.getClass();
                    if (!this.f61609a || i != 101) {
                        C23529c0.C23530a aVar4 = new C23529c0.C23530a(a2);
                        try {
                            cVar.f60093b.getClass();
                            String r = a2.mo58641r(HttpHeader.CONTENT_TYPE);
                            long b = cVar.f60095d.mo60455b(a2);
                            aVar4.f59430g = new C24320g(r, b, C24911r.m62547c(new C23795c.C23797b(cVar.f60095d.mo60462h(a2), b)));
                            c0Var = aVar4.mo58645a();
                        } catch (IOException e2) {
                            cVar.f60093b.getClass();
                            cVar.mo59028d(e2);
                            throw e2;
                        }
                    } else {
                        C23529c0.C23530a aVar5 = new C23529c0.C23530a(a2);
                        aVar5.f59430g = C23610d.f59687d;
                        c0Var = aVar5.mo58645a();
                    }
                    if ("close".equalsIgnoreCase(c0Var.f59410b.mo58725a("Connection")) || "close".equalsIgnoreCase(c0Var.mo58641r("Connection"))) {
                        cVar.f60095d.mo60460f().mo59042h();
                    }
                    if ((i != 204 && i != 205) || c0Var.f59416h.mo53598i() <= 0) {
                        return c0Var;
                    }
                    StringBuilder r2 = C25541a.m63887r("HTTP ", i, " had non-zero Content-Length: ");
                    r2.append(c0Var.f59416h.mo53598i());
                    throw new ProtocolException(r2.toString());
                } catch (IOException e3) {
                    cVar.f60093b.getClass();
                    cVar.mo59028d(e3);
                    throw e3;
                }
            } catch (IOException e4) {
                cVar.f60093b.getClass();
                cVar.mo59028d(e4);
                throw e4;
            }
        } else {
            throw new IllegalStateException();
        }
    }
}

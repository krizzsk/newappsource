package li0;

import com.amazonaws.http.HttpHeader;
import hi0.C23521b0;
import hi0.C23529c0;
import hi0.C23545j;
import hi0.C23546k;
import hi0.C23556q;
import hi0.C23560s;
import hi0.C23562t;
import hi0.C23571x;
import ii0.C23610d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import si0.C24908o;
import si0.C24911r;

/* renamed from: li0.a */
public final class C24313a implements C23560s {

    /* renamed from: a */
    public final C23546k f61608a;

    public C24313a(C23546k kVar) {
        this.f61608a = kVar;
    }

    public final C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        boolean z;
        C24319f fVar = (C24319f) aVar;
        C23571x xVar = fVar.f61618e;
        xVar.getClass();
        C23571x.C23572a aVar2 = new C23571x.C23572a(xVar);
        C23521b0 b0Var = xVar.f59639d;
        if (b0Var != null) {
            C23562t b = b0Var.mo53613b();
            if (b != null) {
                aVar2.f59644c.mo58695f(HttpHeader.CONTENT_TYPE, b.f59553a);
            }
            long a = b0Var.mo53612a();
            if (a != -1) {
                aVar2.f59644c.mo58695f(HttpHeader.CONTENT_LENGTH, Long.toString(a));
                aVar2.mo58729c("Transfer-Encoding");
            } else {
                aVar2.f59644c.mo58695f("Transfer-Encoding", "chunked");
                aVar2.mo58729c(HttpHeader.CONTENT_LENGTH);
            }
        }
        if (xVar.mo58725a(HttpHeader.HOST) == null) {
            aVar2.f59644c.mo58695f(HttpHeader.HOST, C23610d.m57803k(xVar.f59636a, false));
        }
        if (xVar.mo58725a("Connection") == null) {
            aVar2.f59644c.mo58695f("Connection", "Keep-Alive");
        }
        if (xVar.mo58725a("Accept-Encoding") == null && xVar.mo58725a("Range") == null) {
            aVar2.f59644c.mo58695f("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        ((C23546k.C23547a) this.f61608a).getClass();
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = emptyList.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C23545j jVar = (C23545j) emptyList.get(i);
                sb.append(jVar.f59504a);
                sb.append('=');
                sb.append(jVar.f59505b);
            }
            aVar2.f59644c.mo58695f("Cookie", sb.toString());
        }
        if (xVar.mo58725a(HttpHeader.USER_AGENT) == null) {
            aVar2.f59644c.mo58695f(HttpHeader.USER_AGENT, "okhttp/3.14.9");
        }
        C23529c0 a2 = fVar.mo60464a(aVar2.mo58727a());
        C24318e.m61059d(this.f61608a, xVar.f59636a, a2.f59415g);
        C23529c0.C23530a aVar3 = new C23529c0.C23530a(a2);
        aVar3.f59424a = xVar;
        if (z && "gzip".equalsIgnoreCase(a2.mo58641r("Content-Encoding")) && C24318e.m61057b(a2)) {
            C24908o oVar = new C24908o(a2.f59416h.mo53600t());
            C23556q.C23557a e = a2.f59415g.mo58684e();
            e.mo58694e("Content-Encoding");
            e.mo58694e(HttpHeader.CONTENT_LENGTH);
            ArrayList arrayList = e.f59532a;
            C23556q.C23557a aVar4 = new C23556q.C23557a();
            Collections.addAll(aVar4.f59532a, (String[]) arrayList.toArray(new String[arrayList.size()]));
            aVar3.f59429f = aVar4;
            aVar3.f59430g = new C24320g(a2.mo58641r(HttpHeader.CONTENT_TYPE), -1, C24911r.m62547c(oVar));
        }
        return aVar3.mo58645a();
    }
}

package zendesk.core;

import ge0.C23410c;
import hi0.C23529c0;
import hi0.C23560s;
import hi0.C23571x;
import java.io.IOException;
import li0.C24319f;

class ZendeskOauthIdHeaderInterceptor implements C23560s {
    private final String oauthId;

    public ZendeskOauthIdHeaderInterceptor(String str) {
        this.oauthId = str;
    }

    public C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        C24319f fVar = (C24319f) aVar;
        C23571x xVar = fVar.f61618e;
        xVar.getClass();
        C23571x.C23572a aVar2 = new C23571x.C23572a(xVar);
        if (C23410c.m57533a(this.oauthId)) {
            aVar2.f59644c.mo58690a("Client-Identifier", this.oauthId);
        }
        return fVar.mo60464a(aVar2.mo58727a());
    }
}

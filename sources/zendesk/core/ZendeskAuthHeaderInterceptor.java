package zendesk.core;

import com.amazonaws.http.HttpHeader;
import hi0.C23529c0;
import hi0.C23560s;
import hi0.C23571x;
import java.io.IOException;
import li0.C24319f;

class ZendeskAuthHeaderInterceptor implements C23560s {
    private IdentityManager identityManager;

    public ZendeskAuthHeaderInterceptor(IdentityManager identityManager2) {
        this.identityManager = identityManager2;
    }

    public C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        C24319f fVar = (C24319f) aVar;
        C23571x xVar = fVar.f61618e;
        xVar.getClass();
        C23571x.C23572a aVar2 = new C23571x.C23572a(xVar);
        String storedAccessTokenAsBearerToken = this.identityManager.getStoredAccessTokenAsBearerToken();
        if (storedAccessTokenAsBearerToken != null) {
            aVar2.f59644c.mo58690a(HttpHeader.AUTHORIZATION, storedAccessTokenAsBearerToken);
        }
        return fVar.mo60464a(aVar2.mo58727a());
    }
}

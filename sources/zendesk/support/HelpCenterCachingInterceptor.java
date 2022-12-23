package zendesk.support;

import ge0.C23410c;
import hi0.C23529c0;
import hi0.C23560s;
import java.io.IOException;
import li0.C24319f;

class HelpCenterCachingInterceptor implements C23560s {
    public C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        C24319f fVar = (C24319f) aVar;
        C23529c0 a = fVar.mo60464a(fVar.f61618e);
        if (!C23410c.m57533a(a.f59415g.mo58682c(Constants.CUSTOM_HC_CACHING_HEADER))) {
            return a;
        }
        C23529c0.C23530a aVar2 = new C23529c0.C23530a(a);
        aVar2.f59429f.mo58695f(Constants.STANDARD_CACHING_HEADER, a.mo58641r(Constants.CUSTOM_HC_CACHING_HEADER));
        return aVar2.mo58645a();
    }
}

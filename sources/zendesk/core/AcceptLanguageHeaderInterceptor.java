package zendesk.core;

import android.content.Context;
import ge0.C23409b;
import ge0.C23410c;
import hi0.C23529c0;
import hi0.C23560s;
import hi0.C23571x;
import java.io.IOException;
import java.util.Locale;
import li0.C24319f;

class AcceptLanguageHeaderInterceptor implements C23560s {
    private Context context;

    public AcceptLanguageHeaderInterceptor(Context context2) {
        this.context = context2;
    }

    public C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        C24319f fVar = (C24319f) aVar;
        C23571x xVar = fVar.f61618e;
        Locale currentLocale = DeviceInfo.getCurrentLocale(this.context);
        if (!C23410c.m57534b(xVar.mo58725a("Accept-Language")) || currentLocale == null) {
            return fVar.mo60464a(xVar);
        }
        C23571x.C23572a aVar2 = new C23571x.C23572a(xVar);
        aVar2.f59644c.mo58690a("Accept-Language", C23409b.m57532b(currentLocale));
        return fVar.mo60464a(aVar2.mo58727a());
    }
}

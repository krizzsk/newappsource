package zendesk.core;

import android.os.Build;
import com.amazonaws.http.HttpHeader;
import hi0.C23529c0;
import hi0.C23560s;
import hi0.C23571x;
import java.io.IOException;
import java.util.Locale;
import li0.C24319f;

class UserAgentAndClientHeadersInterceptor implements C23560s {
    private final String userAgent;
    private final String version;
    private final String zendeskClient;

    public UserAgentAndClientHeadersInterceptor(String str, String str2) {
        Locale locale = Locale.US;
        this.userAgent = String.format(locale, "Zendesk-SDK/%s Android/%d Variant/%s", new Object[]{str, Integer.valueOf(Build.VERSION.SDK_INT), str2});
        this.zendeskClient = String.format(locale, "mobile/android/sdk/%s", new Object[]{str2.toLowerCase()});
        this.version = str;
    }

    public C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        C24319f fVar = (C24319f) aVar;
        C23571x xVar = fVar.f61618e;
        xVar.getClass();
        C23571x.C23572a aVar2 = new C23571x.C23572a(xVar);
        aVar2.mo58729c(HttpHeader.USER_AGENT);
        aVar2.f59644c.mo58690a(HttpHeader.USER_AGENT, this.userAgent);
        aVar2.mo58729c("X-Zendesk-Client");
        aVar2.f59644c.mo58690a("X-Zendesk-Client", this.zendeskClient);
        aVar2.mo58729c("X-Zendesk-Client-Version");
        aVar2.f59644c.mo58690a("X-Zendesk-Client-Version", this.version);
        return fVar.mo60464a(aVar2.mo58727a());
    }
}

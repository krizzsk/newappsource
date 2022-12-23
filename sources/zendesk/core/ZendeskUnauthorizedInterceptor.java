package zendesk.core;

import hi0.C23529c0;
import hi0.C23560s;
import java.io.IOException;
import li0.C24319f;

class ZendeskUnauthorizedInterceptor implements C23560s {
    private final SessionStorage sessionStorage;

    public ZendeskUnauthorizedInterceptor(SessionStorage sessionStorage2) {
        this.sessionStorage = sessionStorage2;
    }

    public C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        C23529c0 a = ((C24319f) aVar).mo60464a(((C24319f) aVar).f61618e);
        if (!a.mo58644v() && 401 == a.f59412d) {
            onHttpUnauthorized();
        }
        return a;
    }

    public void onHttpUnauthorized() {
        this.sessionStorage.clear();
    }
}

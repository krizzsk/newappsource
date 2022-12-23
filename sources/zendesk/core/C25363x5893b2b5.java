package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

/* renamed from: zendesk.core.ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory */
public final class C25363x5893b2b5 implements C23588c<ZendeskUnauthorizedInterceptor> {
    private final C25292a<SessionStorage> sessionStorageProvider;

    public C25363x5893b2b5(C25292a<SessionStorage> aVar) {
        this.sessionStorageProvider = aVar;
    }

    public static C25363x5893b2b5 create(C25292a<SessionStorage> aVar) {
        return new C25363x5893b2b5(aVar);
    }

    public static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage) {
        ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor = ZendeskNetworkModule.provideZendeskUnauthorizedInterceptor(sessionStorage);
        C13641g.m34117e(provideZendeskUnauthorizedInterceptor);
        return provideZendeskUnauthorizedInterceptor;
    }

    public ZendeskUnauthorizedInterceptor get() {
        return provideZendeskUnauthorizedInterceptor(this.sessionStorageProvider.get());
    }
}

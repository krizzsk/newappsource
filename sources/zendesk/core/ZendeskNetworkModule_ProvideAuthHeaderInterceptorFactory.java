package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory implements C23588c<ZendeskAuthHeaderInterceptor> {
    private final C25292a<IdentityManager> identityManagerProvider;

    public ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(C25292a<IdentityManager> aVar) {
        this.identityManagerProvider = aVar;
    }

    public static ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory create(C25292a<IdentityManager> aVar) {
        return new ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(aVar);
    }

    public static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(Object obj) {
        ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor = ZendeskNetworkModule.provideAuthHeaderInterceptor((IdentityManager) obj);
        C13641g.m34117e(provideAuthHeaderInterceptor);
        return provideAuthHeaderInterceptor;
    }

    public ZendeskAuthHeaderInterceptor get() {
        return provideAuthHeaderInterceptor(this.identityManagerProvider.get());
    }
}

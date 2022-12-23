package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskNetworkModule_ProvideCachingInterceptorFactory implements C23588c<CachingInterceptor> {
    private final C25292a<BaseStorage> mediaCacheProvider;

    public ZendeskNetworkModule_ProvideCachingInterceptorFactory(C25292a<BaseStorage> aVar) {
        this.mediaCacheProvider = aVar;
    }

    public static ZendeskNetworkModule_ProvideCachingInterceptorFactory create(C25292a<BaseStorage> aVar) {
        return new ZendeskNetworkModule_ProvideCachingInterceptorFactory(aVar);
    }

    public static CachingInterceptor provideCachingInterceptor(BaseStorage baseStorage) {
        CachingInterceptor provideCachingInterceptor = ZendeskNetworkModule.provideCachingInterceptor(baseStorage);
        C13641g.m34117e(provideCachingInterceptor);
        return provideCachingInterceptor;
    }

    public CachingInterceptor get() {
        return provideCachingInterceptor(this.mediaCacheProvider.get());
    }
}

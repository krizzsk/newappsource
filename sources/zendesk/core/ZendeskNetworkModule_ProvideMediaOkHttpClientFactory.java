package zendesk.core;

import hi0.C23566v;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskNetworkModule_ProvideMediaOkHttpClientFactory implements C23588c<C23566v> {
    private final C25292a<ZendeskAccessInterceptor> accessInterceptorProvider;
    private final C25292a<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final C25292a<CachingInterceptor> cachingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final C25292a<C23566v> okHttpClientProvider;
    private final C25292a<ZendeskSettingsInterceptor> settingsInterceptorProvider;
    private final C25292a<ZendeskUnauthorizedInterceptor> unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, C25292a<C23566v> aVar, C25292a<ZendeskAccessInterceptor> aVar2, C25292a<ZendeskAuthHeaderInterceptor> aVar3, C25292a<ZendeskSettingsInterceptor> aVar4, C25292a<CachingInterceptor> aVar5, C25292a<ZendeskUnauthorizedInterceptor> aVar6) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = aVar;
        this.accessInterceptorProvider = aVar2;
        this.authHeaderInterceptorProvider = aVar3;
        this.settingsInterceptorProvider = aVar4;
        this.cachingInterceptorProvider = aVar5;
        this.unauthorizedInterceptorProvider = aVar6;
    }

    public static ZendeskNetworkModule_ProvideMediaOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, C25292a<C23566v> aVar, C25292a<ZendeskAccessInterceptor> aVar2, C25292a<ZendeskAuthHeaderInterceptor> aVar3, C25292a<ZendeskSettingsInterceptor> aVar4, C25292a<CachingInterceptor> aVar5, C25292a<ZendeskUnauthorizedInterceptor> aVar6) {
        return new ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(zendeskNetworkModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static C23566v provideMediaOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, C23566v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C23566v provideMediaOkHttpClient = zendeskNetworkModule.provideMediaOkHttpClient(vVar, (ZendeskAccessInterceptor) obj, (ZendeskAuthHeaderInterceptor) obj2, (ZendeskSettingsInterceptor) obj3, (CachingInterceptor) obj4, (ZendeskUnauthorizedInterceptor) obj5);
        C13641g.m34117e(provideMediaOkHttpClient);
        return provideMediaOkHttpClient;
    }

    public C23566v get() {
        return provideMediaOkHttpClient(this.module, this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.cachingInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get());
    }
}

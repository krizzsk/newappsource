package zendesk.core;

import hi0.C23522c;
import hi0.C23566v;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskNetworkModule_ProvideOkHttpClientFactory implements C23588c<C23566v> {
    private final C25292a<AcceptHeaderInterceptor> acceptHeaderInterceptorProvider;
    private final C25292a<ZendeskAccessInterceptor> accessInterceptorProvider;
    private final C25292a<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final C25292a<C23522c> cacheProvider;
    private final ZendeskNetworkModule module;
    private final C25292a<C23566v> okHttpClientProvider;
    private final C25292a<ZendeskPushInterceptor> pushInterceptorProvider;
    private final C25292a<ZendeskSettingsInterceptor> settingsInterceptorProvider;
    private final C25292a<ZendeskUnauthorizedInterceptor> unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, C25292a<C23566v> aVar, C25292a<ZendeskAccessInterceptor> aVar2, C25292a<ZendeskUnauthorizedInterceptor> aVar3, C25292a<ZendeskAuthHeaderInterceptor> aVar4, C25292a<ZendeskSettingsInterceptor> aVar5, C25292a<AcceptHeaderInterceptor> aVar6, C25292a<ZendeskPushInterceptor> aVar7, C25292a<C23522c> aVar8) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = aVar;
        this.accessInterceptorProvider = aVar2;
        this.unauthorizedInterceptorProvider = aVar3;
        this.authHeaderInterceptorProvider = aVar4;
        this.settingsInterceptorProvider = aVar5;
        this.acceptHeaderInterceptorProvider = aVar6;
        this.pushInterceptorProvider = aVar7;
        this.cacheProvider = aVar8;
    }

    public static ZendeskNetworkModule_ProvideOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, C25292a<C23566v> aVar, C25292a<ZendeskAccessInterceptor> aVar2, C25292a<ZendeskUnauthorizedInterceptor> aVar3, C25292a<ZendeskAuthHeaderInterceptor> aVar4, C25292a<ZendeskSettingsInterceptor> aVar5, C25292a<AcceptHeaderInterceptor> aVar6, C25292a<ZendeskPushInterceptor> aVar7, C25292a<C23522c> aVar8) {
        return new ZendeskNetworkModule_ProvideOkHttpClientFactory(zendeskNetworkModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static C23566v provideOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, C23566v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, C23522c cVar) {
        C23566v provideOkHttpClient = zendeskNetworkModule.provideOkHttpClient(vVar, (ZendeskAccessInterceptor) obj, (ZendeskUnauthorizedInterceptor) obj2, (ZendeskAuthHeaderInterceptor) obj3, (ZendeskSettingsInterceptor) obj4, (AcceptHeaderInterceptor) obj5, (ZendeskPushInterceptor) obj6, cVar);
        C13641g.m34117e(provideOkHttpClient);
        return provideOkHttpClient;
    }

    public C23566v get() {
        return provideOkHttpClient(this.module, this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get(), this.pushInterceptorProvider.get(), this.cacheProvider.get());
    }
}

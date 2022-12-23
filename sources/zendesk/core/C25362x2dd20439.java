package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

/* renamed from: zendesk.core.ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory */
public final class C25362x2dd20439 implements C23588c<ZendeskOauthIdHeaderInterceptor> {
    private final C25292a<ApplicationConfiguration> configurationProvider;
    private final ZendeskNetworkModule module;

    public C25362x2dd20439(ZendeskNetworkModule zendeskNetworkModule, C25292a<ApplicationConfiguration> aVar) {
        this.module = zendeskNetworkModule;
        this.configurationProvider = aVar;
    }

    public static C25362x2dd20439 create(ZendeskNetworkModule zendeskNetworkModule, C25292a<ApplicationConfiguration> aVar) {
        return new C25362x2dd20439(zendeskNetworkModule, aVar);
    }

    public static ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ZendeskNetworkModule zendeskNetworkModule, ApplicationConfiguration applicationConfiguration) {
        ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor = zendeskNetworkModule.provideZendeskBasicHeadersInterceptor(applicationConfiguration);
        C13641g.m34117e(provideZendeskBasicHeadersInterceptor);
        return provideZendeskBasicHeadersInterceptor;
    }

    public ZendeskOauthIdHeaderInterceptor get() {
        return provideZendeskBasicHeadersInterceptor(this.module, this.configurationProvider.get());
    }
}

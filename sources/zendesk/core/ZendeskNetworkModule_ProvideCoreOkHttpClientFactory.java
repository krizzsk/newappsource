package zendesk.core;

import hi0.C23566v;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskNetworkModule_ProvideCoreOkHttpClientFactory implements C23588c<C23566v> {
    private final C25292a<AcceptHeaderInterceptor> acceptHeaderInterceptorProvider;
    private final C25292a<AcceptLanguageHeaderInterceptor> acceptLanguageHeaderInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final C25292a<C23566v> okHttpClientProvider;

    public ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, C25292a<C23566v> aVar, C25292a<AcceptLanguageHeaderInterceptor> aVar2, C25292a<AcceptHeaderInterceptor> aVar3) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = aVar;
        this.acceptLanguageHeaderInterceptorProvider = aVar2;
        this.acceptHeaderInterceptorProvider = aVar3;
    }

    public static ZendeskNetworkModule_ProvideCoreOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, C25292a<C23566v> aVar, C25292a<AcceptLanguageHeaderInterceptor> aVar2, C25292a<AcceptHeaderInterceptor> aVar3) {
        return new ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(zendeskNetworkModule, aVar, aVar2, aVar3);
    }

    public static C23566v provideCoreOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, C23566v vVar, Object obj, Object obj2) {
        C23566v provideCoreOkHttpClient = zendeskNetworkModule.provideCoreOkHttpClient(vVar, (AcceptLanguageHeaderInterceptor) obj, (AcceptHeaderInterceptor) obj2);
        C13641g.m34117e(provideCoreOkHttpClient);
        return provideCoreOkHttpClient;
    }

    public C23566v get() {
        return provideCoreOkHttpClient(this.module, this.okHttpClientProvider.get(), this.acceptLanguageHeaderInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get());
    }
}

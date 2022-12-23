package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ServiceModule_ProvideCustomNetworkConfigFactory implements C23588c<HelpCenterCachingNetworkConfig> {
    private final C25292a<HelpCenterCachingInterceptor> helpCenterCachingInterceptorProvider;

    public ServiceModule_ProvideCustomNetworkConfigFactory(C25292a<HelpCenterCachingInterceptor> aVar) {
        this.helpCenterCachingInterceptorProvider = aVar;
    }

    public static ServiceModule_ProvideCustomNetworkConfigFactory create(C25292a<HelpCenterCachingInterceptor> aVar) {
        return new ServiceModule_ProvideCustomNetworkConfigFactory(aVar);
    }

    public static HelpCenterCachingNetworkConfig provideCustomNetworkConfig(Object obj) {
        HelpCenterCachingNetworkConfig provideCustomNetworkConfig = ServiceModule.provideCustomNetworkConfig((HelpCenterCachingInterceptor) obj);
        C13641g.m34117e(provideCustomNetworkConfig);
        return provideCustomNetworkConfig;
    }

    public HelpCenterCachingNetworkConfig get() {
        return provideCustomNetworkConfig(this.helpCenterCachingInterceptorProvider.get());
    }
}

package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;
import zendesk.core.RestServiceProvider;

public final class ServiceModule_ProvidesHelpCenterServiceFactory implements C23588c<HelpCenterService> {
    private final C25292a<HelpCenterCachingNetworkConfig> helpCenterCachingNetworkConfigProvider;
    private final C25292a<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesHelpCenterServiceFactory(C25292a<RestServiceProvider> aVar, C25292a<HelpCenterCachingNetworkConfig> aVar2) {
        this.restServiceProvider = aVar;
        this.helpCenterCachingNetworkConfigProvider = aVar2;
    }

    public static ServiceModule_ProvidesHelpCenterServiceFactory create(C25292a<RestServiceProvider> aVar, C25292a<HelpCenterCachingNetworkConfig> aVar2) {
        return new ServiceModule_ProvidesHelpCenterServiceFactory(aVar, aVar2);
    }

    public static HelpCenterService providesHelpCenterService(RestServiceProvider restServiceProvider2, Object obj) {
        HelpCenterService providesHelpCenterService = ServiceModule.providesHelpCenterService(restServiceProvider2, (HelpCenterCachingNetworkConfig) obj);
        C13641g.m34117e(providesHelpCenterService);
        return providesHelpCenterService;
    }

    public HelpCenterService get() {
        return providesHelpCenterService(this.restServiceProvider.get(), this.helpCenterCachingNetworkConfigProvider.get());
    }
}

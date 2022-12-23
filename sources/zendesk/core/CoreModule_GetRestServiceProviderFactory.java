package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;

public final class CoreModule_GetRestServiceProviderFactory implements C23588c<RestServiceProvider> {
    private final CoreModule module;

    public CoreModule_GetRestServiceProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetRestServiceProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetRestServiceProviderFactory(coreModule);
    }

    public static RestServiceProvider getRestServiceProvider(CoreModule coreModule) {
        RestServiceProvider restServiceProvider = coreModule.getRestServiceProvider();
        C13641g.m34117e(restServiceProvider);
        return restServiceProvider;
    }

    public RestServiceProvider get() {
        return getRestServiceProvider(this.module);
    }
}

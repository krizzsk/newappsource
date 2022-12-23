package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;

public final class SupportModule_ProvidesRequestProviderFactory implements C23588c<RequestProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesRequestProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesRequestProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesRequestProviderFactory(supportModule);
    }

    public static RequestProvider providesRequestProvider(SupportModule supportModule) {
        RequestProvider providesRequestProvider = supportModule.providesRequestProvider();
        C13641g.m34117e(providesRequestProvider);
        return providesRequestProvider;
    }

    public RequestProvider get() {
        return providesRequestProvider(this.module);
    }
}

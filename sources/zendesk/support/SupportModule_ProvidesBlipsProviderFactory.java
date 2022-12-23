package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;

public final class SupportModule_ProvidesBlipsProviderFactory implements C23588c<SupportBlipsProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesBlipsProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesBlipsProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesBlipsProviderFactory(supportModule);
    }

    public static SupportBlipsProvider providesBlipsProvider(SupportModule supportModule) {
        SupportBlipsProvider providesBlipsProvider = supportModule.providesBlipsProvider();
        C13641g.m34117e(providesBlipsProvider);
        return providesBlipsProvider;
    }

    public SupportBlipsProvider get() {
        return providesBlipsProvider(this.module);
    }
}

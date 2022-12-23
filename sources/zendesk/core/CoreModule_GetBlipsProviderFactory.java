package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;

public final class CoreModule_GetBlipsProviderFactory implements C23588c<BlipsProvider> {
    private final CoreModule module;

    public CoreModule_GetBlipsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetBlipsProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetBlipsProviderFactory(coreModule);
    }

    public static BlipsProvider getBlipsProvider(CoreModule coreModule) {
        BlipsProvider blipsProvider = coreModule.getBlipsProvider();
        C13641g.m34117e(blipsProvider);
        return blipsProvider;
    }

    public BlipsProvider get() {
        return getBlipsProvider(this.module);
    }
}

package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;

public final class SupportModule_ProvidesSettingsProviderFactory implements C23588c<SupportSettingsProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesSettingsProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesSettingsProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesSettingsProviderFactory(supportModule);
    }

    public static SupportSettingsProvider providesSettingsProvider(SupportModule supportModule) {
        SupportSettingsProvider providesSettingsProvider = supportModule.providesSettingsProvider();
        C13641g.m34117e(providesSettingsProvider);
        return providesSettingsProvider;
    }

    public SupportSettingsProvider get() {
        return providesSettingsProvider(this.module);
    }
}

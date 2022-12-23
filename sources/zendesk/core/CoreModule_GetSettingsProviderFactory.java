package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;

public final class CoreModule_GetSettingsProviderFactory implements C23588c<SettingsProvider> {
    private final CoreModule module;

    public CoreModule_GetSettingsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetSettingsProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetSettingsProviderFactory(coreModule);
    }

    public static SettingsProvider getSettingsProvider(CoreModule coreModule) {
        SettingsProvider settingsProvider = coreModule.getSettingsProvider();
        C13641g.m34117e(settingsProvider);
        return settingsProvider;
    }

    public SettingsProvider get() {
        return getSettingsProvider(this.module);
    }
}

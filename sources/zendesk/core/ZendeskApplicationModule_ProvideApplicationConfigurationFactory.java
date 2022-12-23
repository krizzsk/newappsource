package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;

public final class ZendeskApplicationModule_ProvideApplicationConfigurationFactory implements C23588c<ApplicationConfiguration> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationConfigurationFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideApplicationConfigurationFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationConfigurationFactory(zendeskApplicationModule);
    }

    public static ApplicationConfiguration provideApplicationConfiguration(ZendeskApplicationModule zendeskApplicationModule) {
        ApplicationConfiguration provideApplicationConfiguration = zendeskApplicationModule.provideApplicationConfiguration();
        C13641g.m34117e(provideApplicationConfiguration);
        return provideApplicationConfiguration;
    }

    public ApplicationConfiguration get() {
        return provideApplicationConfiguration(this.module);
    }
}

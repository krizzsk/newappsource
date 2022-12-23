package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;

public final class SupportModule_ProvidesHelpCenterProviderFactory implements C23588c<HelpCenterProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesHelpCenterProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesHelpCenterProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesHelpCenterProviderFactory(supportModule);
    }

    public static HelpCenterProvider providesHelpCenterProvider(SupportModule supportModule) {
        HelpCenterProvider providesHelpCenterProvider = supportModule.providesHelpCenterProvider();
        C13641g.m34117e(providesHelpCenterProvider);
        return providesHelpCenterProvider;
    }

    public HelpCenterProvider get() {
        return providesHelpCenterProvider(this.module);
    }
}

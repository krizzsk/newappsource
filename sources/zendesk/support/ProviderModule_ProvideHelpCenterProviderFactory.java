package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ProviderModule_ProvideHelpCenterProviderFactory implements C23588c<HelpCenterProvider> {
    private final C25292a<ZendeskHelpCenterService> helpCenterServiceProvider;
    private final C25292a<HelpCenterSessionCache> helpCenterSessionCacheProvider;
    private final ProviderModule module;
    private final C25292a<SupportSettingsProvider> settingsProvider;
    private final C25292a<SupportBlipsProvider> supportBlipsProvider;
    private final C25292a<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideHelpCenterProviderFactory(ProviderModule providerModule, C25292a<SupportSettingsProvider> aVar, C25292a<SupportBlipsProvider> aVar2, C25292a<ZendeskHelpCenterService> aVar3, C25292a<HelpCenterSessionCache> aVar4, C25292a<ZendeskTracker> aVar5) {
        this.module = providerModule;
        this.settingsProvider = aVar;
        this.supportBlipsProvider = aVar2;
        this.helpCenterServiceProvider = aVar3;
        this.helpCenterSessionCacheProvider = aVar4;
        this.zendeskTrackerProvider = aVar5;
    }

    public static ProviderModule_ProvideHelpCenterProviderFactory create(ProviderModule providerModule, C25292a<SupportSettingsProvider> aVar, C25292a<SupportBlipsProvider> aVar2, C25292a<ZendeskHelpCenterService> aVar3, C25292a<HelpCenterSessionCache> aVar4, C25292a<ZendeskTracker> aVar5) {
        return new ProviderModule_ProvideHelpCenterProviderFactory(providerModule, aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static HelpCenterProvider provideHelpCenterProvider(ProviderModule providerModule, SupportSettingsProvider supportSettingsProvider, SupportBlipsProvider supportBlipsProvider2, Object obj, Object obj2, Object obj3) {
        HelpCenterProvider provideHelpCenterProvider = providerModule.provideHelpCenterProvider(supportSettingsProvider, supportBlipsProvider2, (ZendeskHelpCenterService) obj, (HelpCenterSessionCache) obj2, (ZendeskTracker) obj3);
        C13641g.m34117e(provideHelpCenterProvider);
        return provideHelpCenterProvider;
    }

    public HelpCenterProvider get() {
        return provideHelpCenterProvider(this.module, this.settingsProvider.get(), this.supportBlipsProvider.get(), this.helpCenterServiceProvider.get(), this.helpCenterSessionCacheProvider.get(), this.zendeskTrackerProvider.get());
    }
}

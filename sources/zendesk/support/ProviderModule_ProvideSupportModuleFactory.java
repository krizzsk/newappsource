package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;
import zendesk.core.RestServiceProvider;

public final class ProviderModule_ProvideSupportModuleFactory implements C23588c<SupportModule> {
    private final C25292a<ArticleVoteStorage> articleVoteStorageProvider;
    private final C25292a<SupportBlipsProvider> blipsProvider;
    private final C25292a<HelpCenterProvider> helpCenterProvider;
    private final ProviderModule module;
    private final C25292a<RequestProvider> requestProvider;
    private final C25292a<RestServiceProvider> restServiceProvider;
    private final C25292a<SupportSettingsProvider> settingsProvider;
    private final C25292a<UploadProvider> uploadProvider;
    private final C25292a<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideSupportModuleFactory(ProviderModule providerModule, C25292a<RequestProvider> aVar, C25292a<UploadProvider> aVar2, C25292a<HelpCenterProvider> aVar3, C25292a<SupportSettingsProvider> aVar4, C25292a<RestServiceProvider> aVar5, C25292a<SupportBlipsProvider> aVar6, C25292a<ZendeskTracker> aVar7, C25292a<ArticleVoteStorage> aVar8) {
        this.module = providerModule;
        this.requestProvider = aVar;
        this.uploadProvider = aVar2;
        this.helpCenterProvider = aVar3;
        this.settingsProvider = aVar4;
        this.restServiceProvider = aVar5;
        this.blipsProvider = aVar6;
        this.zendeskTrackerProvider = aVar7;
        this.articleVoteStorageProvider = aVar8;
    }

    public static ProviderModule_ProvideSupportModuleFactory create(ProviderModule providerModule, C25292a<RequestProvider> aVar, C25292a<UploadProvider> aVar2, C25292a<HelpCenterProvider> aVar3, C25292a<SupportSettingsProvider> aVar4, C25292a<RestServiceProvider> aVar5, C25292a<SupportBlipsProvider> aVar6, C25292a<ZendeskTracker> aVar7, C25292a<ArticleVoteStorage> aVar8) {
        return new ProviderModule_ProvideSupportModuleFactory(providerModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static SupportModule provideSupportModule(ProviderModule providerModule, RequestProvider requestProvider2, UploadProvider uploadProvider2, HelpCenterProvider helpCenterProvider2, SupportSettingsProvider supportSettingsProvider, RestServiceProvider restServiceProvider2, SupportBlipsProvider supportBlipsProvider, Object obj, ArticleVoteStorage articleVoteStorage) {
        SupportModule provideSupportModule = providerModule.provideSupportModule(requestProvider2, uploadProvider2, helpCenterProvider2, supportSettingsProvider, restServiceProvider2, supportBlipsProvider, (ZendeskTracker) obj, articleVoteStorage);
        C13641g.m34117e(provideSupportModule);
        return provideSupportModule;
    }

    public SupportModule get() {
        return provideSupportModule(this.module, this.requestProvider.get(), this.uploadProvider.get(), this.helpCenterProvider.get(), this.settingsProvider.get(), this.restServiceProvider.get(), this.blipsProvider.get(), this.zendeskTrackerProvider.get(), this.articleVoteStorageProvider.get());
    }
}

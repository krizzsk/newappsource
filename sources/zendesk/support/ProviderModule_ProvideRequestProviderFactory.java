package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;
import zendesk.core.AuthenticationProvider;

public final class ProviderModule_ProvideRequestProviderFactory implements C23588c<RequestProvider> {
    private final C25292a<AuthenticationProvider> authenticationProvider;
    private final C25292a<SupportBlipsProvider> blipsProvider;
    private final ProviderModule module;
    private final C25292a<ZendeskRequestService> requestServiceProvider;
    private final C25292a<RequestSessionCache> requestSessionCacheProvider;
    private final C25292a<RequestStorage> requestStorageProvider;
    private final C25292a<SupportSettingsProvider> settingsProvider;
    private final C25292a<SupportSdkMetadata> supportSdkMetadataProvider;
    private final C25292a<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideRequestProviderFactory(ProviderModule providerModule, C25292a<SupportSettingsProvider> aVar, C25292a<AuthenticationProvider> aVar2, C25292a<ZendeskRequestService> aVar3, C25292a<RequestStorage> aVar4, C25292a<RequestSessionCache> aVar5, C25292a<ZendeskTracker> aVar6, C25292a<SupportSdkMetadata> aVar7, C25292a<SupportBlipsProvider> aVar8) {
        this.module = providerModule;
        this.settingsProvider = aVar;
        this.authenticationProvider = aVar2;
        this.requestServiceProvider = aVar3;
        this.requestStorageProvider = aVar4;
        this.requestSessionCacheProvider = aVar5;
        this.zendeskTrackerProvider = aVar6;
        this.supportSdkMetadataProvider = aVar7;
        this.blipsProvider = aVar8;
    }

    public static ProviderModule_ProvideRequestProviderFactory create(ProviderModule providerModule, C25292a<SupportSettingsProvider> aVar, C25292a<AuthenticationProvider> aVar2, C25292a<ZendeskRequestService> aVar3, C25292a<RequestStorage> aVar4, C25292a<RequestSessionCache> aVar5, C25292a<ZendeskTracker> aVar6, C25292a<SupportSdkMetadata> aVar7, C25292a<SupportBlipsProvider> aVar8) {
        return new ProviderModule_ProvideRequestProviderFactory(providerModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static RequestProvider provideRequestProvider(ProviderModule providerModule, SupportSettingsProvider supportSettingsProvider, AuthenticationProvider authenticationProvider2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, SupportBlipsProvider supportBlipsProvider) {
        RequestProvider provideRequestProvider = providerModule.provideRequestProvider(supportSettingsProvider, authenticationProvider2, (ZendeskRequestService) obj, (RequestStorage) obj2, (RequestSessionCache) obj3, (ZendeskTracker) obj4, (SupportSdkMetadata) obj5, supportBlipsProvider);
        C13641g.m34117e(provideRequestProvider);
        return provideRequestProvider;
    }

    public RequestProvider get() {
        return provideRequestProvider(this.module, this.settingsProvider.get(), this.authenticationProvider.get(), this.requestServiceProvider.get(), this.requestStorageProvider.get(), this.requestSessionCacheProvider.get(), this.zendeskTrackerProvider.get(), this.supportSdkMetadataProvider.get(), this.blipsProvider.get());
    }
}

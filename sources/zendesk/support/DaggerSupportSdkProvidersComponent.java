package zendesk.support;

import android.content.Context;
import ie0.C23587b;
import ie0.C23590e;
import java.util.Locale;
import p389bl.C13641g;
import ye0.C25292a;
import zendesk.core.AuthenticationProvider;
import zendesk.core.BlipsProvider;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;
import zendesk.core.CoreModule_GetBlipsProviderFactory;
import zendesk.core.CoreModule_GetMemoryCacheFactory;
import zendesk.core.CoreModule_GetRestServiceProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.CoreModule_GetSettingsProviderFactory;
import zendesk.core.MemoryCache;
import zendesk.core.RestServiceProvider;
import zendesk.core.SessionStorage;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

final class DaggerSupportSdkProvidersComponent implements SupportSdkProvidersComponent {
    private final CoreModule coreModule;
    private C25292a<Context> getApplicationContextProvider;
    private C25292a<AuthenticationProvider> getAuthenticationProvider;
    private C25292a<BlipsProvider> getBlipsProvider;
    private C25292a<MemoryCache> getMemoryCacheProvider;
    private C25292a<RestServiceProvider> getRestServiceProvider;
    private C25292a<SessionStorage> getSessionStorageProvider;
    private C25292a<SettingsProvider> getSettingsProvider;
    private C25292a<ArticleVoteStorage> provideArticleVoteStorageProvider;
    private C25292a<HelpCenterCachingNetworkConfig> provideCustomNetworkConfigProvider;
    private C25292a<HelpCenterCachingInterceptor> provideHelpCenterCachingInterceptorProvider;
    private C25292a<HelpCenterProvider> provideHelpCenterProvider;
    private C25292a<HelpCenterSessionCache> provideHelpCenterSessionCacheProvider;
    private C25292a<Locale> provideLocaleProvider;
    private C25292a<SupportSdkMetadata> provideMetadataProvider;
    private C25292a<ProviderStore> provideProviderStoreProvider;
    private C25292a<RequestMigrator> provideRequestMigratorProvider;
    private C25292a<RequestProvider> provideRequestProvider;
    private C25292a<RequestSessionCache> provideRequestSessionCacheProvider;
    private C25292a<RequestStorage> provideRequestStorageProvider;
    private C25292a<SupportSettingsProvider> provideSdkSettingsProvider;
    private C25292a<SupportBlipsProvider> provideSupportBlipsProvider;
    private C25292a<SupportModule> provideSupportModuleProvider;
    private C25292a<UploadProvider> provideUploadProvider;
    private C25292a<ZendeskHelpCenterService> provideZendeskHelpCenterServiceProvider;
    private C25292a<ZendeskLocaleConverter> provideZendeskLocaleConverterProvider;
    private C25292a<ZendeskRequestService> provideZendeskRequestServiceProvider;
    private C25292a<ZendeskUploadService> provideZendeskUploadServiceProvider;
    private C25292a<HelpCenterService> providesHelpCenterServiceProvider;
    private C25292a<RequestService> providesRequestServiceProvider;
    private C25292a<UploadService> providesUploadServiceProvider;
    private C25292a<ZendeskTracker> providesZendeskTrackerProvider;

    public static final class Builder {
        private CoreModule coreModule;
        private ProviderModule providerModule;
        private StorageModule storageModule;
        private SupportApplicationModule supportApplicationModule;

        public SupportSdkProvidersComponent build() {
            C13641g.m34116d(SupportApplicationModule.class, this.supportApplicationModule);
            C13641g.m34116d(CoreModule.class, this.coreModule);
            if (this.providerModule == null) {
                this.providerModule = new ProviderModule();
            }
            if (this.storageModule == null) {
                this.storageModule = new StorageModule();
            }
            return new DaggerSupportSdkProvidersComponent(this.supportApplicationModule, this.coreModule, this.providerModule, this.storageModule);
        }

        public Builder coreModule(CoreModule coreModule2) {
            coreModule2.getClass();
            this.coreModule = coreModule2;
            return this;
        }

        public Builder providerModule(ProviderModule providerModule2) {
            providerModule2.getClass();
            this.providerModule = providerModule2;
            return this;
        }

        @Deprecated
        public Builder serviceModule(ServiceModule serviceModule) {
            serviceModule.getClass();
            return this;
        }

        public Builder storageModule(StorageModule storageModule2) {
            storageModule2.getClass();
            this.storageModule = storageModule2;
            return this;
        }

        public Builder supportApplicationModule(SupportApplicationModule supportApplicationModule2) {
            supportApplicationModule2.getClass();
            this.supportApplicationModule = supportApplicationModule2;
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(SupportApplicationModule supportApplicationModule, CoreModule coreModule2, ProviderModule providerModule, StorageModule storageModule) {
        this.getSettingsProvider = CoreModule_GetSettingsProviderFactory.create(coreModule2);
        this.provideLocaleProvider = C23587b.m57773b(SupportApplicationModule_ProvideLocaleFactory.create(supportApplicationModule));
        C25292a<ZendeskLocaleConverter> b = C23587b.m57773b(ProviderModule_ProvideZendeskLocaleConverterFactory.create(providerModule));
        this.provideZendeskLocaleConverterProvider = b;
        this.provideSdkSettingsProvider = C23587b.m57773b(ProviderModule_ProvideSdkSettingsProviderFactory.create(providerModule, this.getSettingsProvider, this.provideLocaleProvider, b));
        CoreModule_GetBlipsProviderFactory create = CoreModule_GetBlipsProviderFactory.create(coreModule2);
        this.getBlipsProvider = create;
        this.provideSupportBlipsProvider = C23587b.m57773b(ProviderModule_ProvideSupportBlipsProviderFactory.create(providerModule, create, this.provideLocaleProvider));
        this.getRestServiceProvider = CoreModule_GetRestServiceProviderFactory.create(coreModule2);
        C25292a<HelpCenterCachingInterceptor> a = C23590e.m57776a(ServiceModule_ProvideHelpCenterCachingInterceptorFactory.create());
        this.provideHelpCenterCachingInterceptorProvider = a;
        C25292a<HelpCenterCachingNetworkConfig> a2 = C23590e.m57776a(ServiceModule_ProvideCustomNetworkConfigFactory.create(a));
        this.provideCustomNetworkConfigProvider = a2;
        C25292a<HelpCenterService> b2 = C23587b.m57773b(ServiceModule_ProvidesHelpCenterServiceFactory.create(this.getRestServiceProvider, a2));
        this.providesHelpCenterServiceProvider = b2;
        this.provideZendeskHelpCenterServiceProvider = C23587b.m57773b(ServiceModule_ProvideZendeskHelpCenterServiceFactory.create(b2, this.provideZendeskLocaleConverterProvider));
        this.provideHelpCenterSessionCacheProvider = C23587b.m57773b(StorageModule_ProvideHelpCenterSessionCacheFactory.create(storageModule));
        C25292a<ZendeskTracker> b3 = C23587b.m57773b(SupportApplicationModule_ProvidesZendeskTrackerFactory.create(supportApplicationModule));
        this.providesZendeskTrackerProvider = b3;
        this.provideHelpCenterProvider = C23587b.m57773b(ProviderModule_ProvideHelpCenterProviderFactory.create(providerModule, this.provideSdkSettingsProvider, this.provideSupportBlipsProvider, this.provideZendeskHelpCenterServiceProvider, this.provideHelpCenterSessionCacheProvider, b3));
        this.getAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.create(coreModule2);
        C25292a<RequestService> b4 = C23587b.m57773b(ServiceModule_ProvidesRequestServiceFactory.create(this.getRestServiceProvider));
        this.providesRequestServiceProvider = b4;
        this.provideZendeskRequestServiceProvider = C23587b.m57773b(ServiceModule_ProvideZendeskRequestServiceFactory.create(b4));
        this.getSessionStorageProvider = CoreModule_GetSessionStorageFactory.create(coreModule2);
        CoreModule_GetApplicationContextFactory create2 = CoreModule_GetApplicationContextFactory.create(coreModule2);
        this.getApplicationContextProvider = create2;
        this.provideRequestMigratorProvider = C23587b.m57773b(StorageModule_ProvideRequestMigratorFactory.create(storageModule, create2));
        CoreModule_GetMemoryCacheFactory create3 = CoreModule_GetMemoryCacheFactory.create(coreModule2);
        this.getMemoryCacheProvider = create3;
        this.provideRequestStorageProvider = C23587b.m57773b(StorageModule_ProvideRequestStorageFactory.create(storageModule, this.getSessionStorageProvider, this.provideRequestMigratorProvider, create3));
        this.provideRequestSessionCacheProvider = C23587b.m57773b(StorageModule_ProvideRequestSessionCacheFactory.create(storageModule));
        C25292a<SupportSdkMetadata> b5 = C23587b.m57773b(SupportApplicationModule_ProvideMetadataFactory.create(supportApplicationModule, this.getApplicationContextProvider));
        this.provideMetadataProvider = b5;
        this.provideRequestProvider = C23587b.m57773b(ProviderModule_ProvideRequestProviderFactory.create(providerModule, this.provideSdkSettingsProvider, this.getAuthenticationProvider, this.provideZendeskRequestServiceProvider, this.provideRequestStorageProvider, this.provideRequestSessionCacheProvider, this.providesZendeskTrackerProvider, b5, this.provideSupportBlipsProvider));
        C25292a<UploadService> b6 = C23587b.m57773b(ServiceModule_ProvidesUploadServiceFactory.create(this.getRestServiceProvider));
        this.providesUploadServiceProvider = b6;
        C25292a<ZendeskUploadService> b7 = C23587b.m57773b(ServiceModule_ProvideZendeskUploadServiceFactory.create(b6));
        this.provideZendeskUploadServiceProvider = b7;
        C25292a<UploadProvider> b8 = C23587b.m57773b(ProviderModule_ProvideUploadProviderFactory.create(providerModule, b7));
        this.provideUploadProvider = b8;
        this.provideProviderStoreProvider = C23587b.m57773b(ProviderModule_ProvideProviderStoreFactory.create(providerModule, this.provideHelpCenterProvider, this.provideRequestProvider, b8));
        C25292a<ArticleVoteStorage> b9 = C23587b.m57773b(StorageModule_ProvideArticleVoteStorageFactory.create(storageModule, this.getSessionStorageProvider));
        this.provideArticleVoteStorageProvider = b9;
        this.provideSupportModuleProvider = C23587b.m57773b(ProviderModule_ProvideSupportModuleFactory.create(providerModule, this.provideRequestProvider, this.provideUploadProvider, this.provideHelpCenterProvider, this.provideSdkSettingsProvider, this.getRestServiceProvider, this.provideSupportBlipsProvider, this.providesZendeskTrackerProvider, b9));
    }

    private Support injectSupport(Support support) {
        Support_MembersInjector.injectProviderStore(support, this.provideProviderStoreProvider.get());
        Support_MembersInjector.injectSupportModule(support, this.provideSupportModuleProvider.get());
        Support_MembersInjector.injectRequestMigrator(support, this.provideRequestMigratorProvider.get());
        Support_MembersInjector.injectBlipsProvider(support, this.provideSupportBlipsProvider.get());
        Support_MembersInjector.injectActionHandlerRegistry(support, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
        Support_MembersInjector.injectRequestProvider(support, this.provideRequestProvider.get());
        Support_MembersInjector.injectAuthenticationProvider(support, CoreModule_GetAuthenticationProviderFactory.getAuthenticationProvider(this.coreModule));
        return support;
    }

    public Support inject(Support support) {
        return injectSupport(support);
    }

    private DaggerSupportSdkProvidersComponent(SupportApplicationModule supportApplicationModule, CoreModule coreModule2, ProviderModule providerModule, StorageModule storageModule) {
        this.coreModule = coreModule2;
        initialize(supportApplicationModule, coreModule2, providerModule, storageModule);
    }
}

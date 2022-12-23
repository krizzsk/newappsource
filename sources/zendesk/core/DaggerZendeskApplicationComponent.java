package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import ck0.C21268s;
import com.google.gson.Gson;
import hi0.C23522c;
import hi0.C23566v;
import ie0.C23587b;
import ie0.C23590e;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.logging.HttpLoggingInterceptor;
import p389bl.C13641g;
import ye0.C25292a;

final class DaggerZendeskApplicationComponent implements ZendeskApplicationComponent {
    private C25292a<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private C25292a<AcceptLanguageHeaderInterceptor> provideAcceptLanguageHeaderInterceptorProvider;
    private C25292a<ZendeskAccessInterceptor> provideAccessInterceptorProvider;
    private C25292a<AccessProvider> provideAccessProvider;
    private C25292a<AccessService> provideAccessServiceProvider;
    private C25292a<BaseStorage> provideAdditionalSdkBaseStorageProvider;
    private C25292a<ApplicationConfiguration> provideApplicationConfigurationProvider;
    private C25292a<Context> provideApplicationContextProvider;
    private C25292a<ZendeskAuthHeaderInterceptor> provideAuthHeaderInterceptorProvider;
    private C25292a<AuthenticationProvider> provideAuthProvider;
    private C25292a<Serializer> provideBase64SerializerProvider;
    private C25292a<C23566v> provideBaseOkHttpClientProvider;
    private C25292a<BlipsService> provideBlipsServiceProvider;
    private C25292a<C23522c> provideCacheProvider;
    private C25292a<CachingInterceptor> provideCachingInterceptorProvider;
    private C25292a<C23566v> provideCoreOkHttpClientProvider;
    private C25292a<C21268s> provideCoreRetrofitProvider;
    private C25292a<CoreModule> provideCoreSdkModuleProvider;
    private C25292a<CoreSettingsStorage> provideCoreSettingsStorageProvider;
    private C25292a<DeviceInfo> provideDeviceInfoProvider;
    private C25292a<ScheduledExecutorService> provideExecutorProvider;
    private C25292a<ExecutorService> provideExecutorServiceProvider;
    private C25292a<Gson> provideGsonProvider;
    private C25292a<HttpLoggingInterceptor> provideHttpLoggingInterceptorProvider;
    private C25292a<BaseStorage> provideIdentityBaseStorageProvider;
    private C25292a<IdentityManager> provideIdentityManagerProvider;
    private C25292a<IdentityStorage> provideIdentityStorageProvider;
    private C25292a<SharedPreferencesStorage> provideLegacyIdentityBaseStorageProvider;
    private C25292a<LegacyIdentityMigrator> provideLegacyIdentityStorageProvider;
    private C25292a<SharedPreferencesStorage> provideLegacyPushBaseStorageProvider;
    private C25292a<C23566v> provideMediaOkHttpClientProvider;
    private C25292a<MemoryCache> provideMemoryCacheProvider;
    private C25292a<C23566v> provideOkHttpClientProvider;
    private C25292a<ProviderStore> provideProviderStoreProvider;
    private C25292a<PushDeviceIdStorage> providePushDeviceIdStorageProvider;
    private C25292a<ZendeskPushInterceptor> providePushInterceptorProvider;
    private C25292a<C21268s> providePushProviderRetrofitProvider;
    private C25292a<PushRegistrationProvider> providePushRegistrationProvider;
    private C25292a<PushRegistrationProviderInternal> providePushRegistrationProviderInternalProvider;
    private C25292a<PushRegistrationService> providePushRegistrationServiceProvider;
    private C25292a<RestServiceProvider> provideRestServiceProvider;
    private C25292a<C21268s> provideRetrofitProvider;
    private C25292a<BaseStorage> provideSdkBaseStorageProvider;
    private C25292a<SettingsProvider> provideSdkSettingsProvider;
    private C25292a<SdkSettingsProviderInternal> provideSdkSettingsProviderInternalProvider;
    private C25292a<SdkSettingsService> provideSdkSettingsServiceProvider;
    private C25292a<Storage> provideSdkStorageProvider;
    private C25292a<Serializer> provideSerializerProvider;
    private C25292a<SessionStorage> provideSessionStorageProvider;
    private C25292a<BaseStorage> provideSettingsBaseStorageProvider;
    private C25292a<ZendeskSettingsInterceptor> provideSettingsInterceptorProvider;
    private C25292a<SettingsStorage> provideSettingsStorageProvider;
    private C25292a<UserProvider> provideUserProvider;
    private C25292a<UserService> provideUserServiceProvider;
    private C25292a<ZendeskOauthIdHeaderInterceptor> provideZendeskBasicHeadersInterceptorProvider;
    private C25292a<ZendeskLocaleConverter> provideZendeskLocaleConverterProvider;
    private C25292a<ZendeskShadow> provideZendeskProvider;
    private C25292a<ZendeskSettingsProvider> provideZendeskSdkSettingsProvider;
    private C25292a<ZendeskUnauthorizedInterceptor> provideZendeskUnauthorizedInterceptorProvider;
    private C25292a<BlipsCoreProvider> providerBlipsCoreProvider;
    private C25292a<BlipsProvider> providerBlipsProvider;
    private C25292a<ConnectivityManager> providerConnectivityManagerProvider;
    private C25292a<NetworkInfoProvider> providerNetworkInfoProvider;
    private C25292a<ZendeskBlipsProvider> providerZendeskBlipsProvider;
    private C25292a<AcceptHeaderInterceptor> providesAcceptHeaderInterceptorProvider;
    private C25292a<File> providesBelvedereDirProvider;
    private C25292a<File> providesCacheDirProvider;
    private C25292a<File> providesDataDirProvider;
    private C25292a<BaseStorage> providesDiskLruStorageProvider;
    private C25292a<UserAgentAndClientHeadersInterceptor> providesUserAgentHeaderInterceptorProvider;

    public static final class Builder {
        private ZendeskApplicationModule zendeskApplicationModule;
        private ZendeskNetworkModule zendeskNetworkModule;

        public ZendeskApplicationComponent build() {
            C13641g.m34116d(ZendeskApplicationModule.class, this.zendeskApplicationModule);
            if (this.zendeskNetworkModule == null) {
                this.zendeskNetworkModule = new ZendeskNetworkModule();
            }
            return new DaggerZendeskApplicationComponent(this.zendeskApplicationModule, this.zendeskNetworkModule);
        }

        public Builder zendeskApplicationModule(ZendeskApplicationModule zendeskApplicationModule2) {
            zendeskApplicationModule2.getClass();
            this.zendeskApplicationModule = zendeskApplicationModule2;
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule) {
        this.provideApplicationContextProvider = C23587b.m57773b(ZendeskApplicationModule_ProvideApplicationContextFactory.create(zendeskApplicationModule));
        C25292a<Gson> a = C23590e.m57776a(ZendeskApplicationModule_ProvideGsonFactory.create());
        this.provideGsonProvider = a;
        C25292a<Serializer> b = C23587b.m57773b(ZendeskStorageModule_ProvideSerializerFactory.create(a));
        this.provideSerializerProvider = b;
        C25292a<BaseStorage> b2 = C23587b.m57773b(ZendeskStorageModule_ProvideSettingsBaseStorageFactory.create(this.provideApplicationContextProvider, b));
        this.provideSettingsBaseStorageProvider = b2;
        this.provideSettingsStorageProvider = C23587b.m57773b(ZendeskStorageModule_ProvideSettingsStorageFactory.create(b2));
        C25292a<BaseStorage> b3 = C23587b.m57773b(ZendeskStorageModule_ProvideIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideIdentityBaseStorageProvider = b3;
        this.provideIdentityStorageProvider = C23587b.m57773b(ZendeskStorageModule_ProvideIdentityStorageFactory.create(b3));
        this.provideAdditionalSdkBaseStorageProvider = C23587b.m57773b(ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        C25292a<File> b4 = C23587b.m57773b(ZendeskStorageModule_ProvidesCacheDirFactory.create(this.provideApplicationContextProvider));
        this.providesCacheDirProvider = b4;
        this.providesDiskLruStorageProvider = C23587b.m57773b(ZendeskStorageModule_ProvidesDiskLruStorageFactory.create(b4, this.provideSerializerProvider));
        this.provideCacheProvider = C23587b.m57773b(ZendeskStorageModule_ProvideCacheFactory.create(this.providesCacheDirProvider));
        this.providesDataDirProvider = C23587b.m57773b(ZendeskStorageModule_ProvidesDataDirFactory.create(this.provideApplicationContextProvider));
        C25292a<File> b5 = C23587b.m57773b(ZendeskStorageModule_ProvidesBelvedereDirFactory.create(this.provideApplicationContextProvider));
        this.providesBelvedereDirProvider = b5;
        this.provideSessionStorageProvider = C23587b.m57773b(ZendeskStorageModule_ProvideSessionStorageFactory.create(this.provideIdentityStorageProvider, this.provideAdditionalSdkBaseStorageProvider, this.providesDiskLruStorageProvider, this.provideCacheProvider, this.providesCacheDirProvider, this.providesDataDirProvider, b5));
        this.provideSdkBaseStorageProvider = C23587b.m57773b(ZendeskStorageModule_ProvideSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        C25292a<MemoryCache> b6 = C23587b.m57773b(ZendeskStorageModule_ProvideMemoryCacheFactory.create());
        this.provideMemoryCacheProvider = b6;
        this.provideSdkStorageProvider = C23587b.m57773b(ZendeskStorageModule_ProvideSdkStorageFactory.create(this.provideSettingsStorageProvider, this.provideSessionStorageProvider, this.provideSdkBaseStorageProvider, b6));
        this.provideLegacyIdentityBaseStorageProvider = C23587b.m57773b(ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideLegacyPushBaseStorageProvider = C23587b.m57773b(ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideIdentityManagerProvider = C23587b.m57773b(ZendeskStorageModule_ProvideIdentityManagerFactory.create(this.provideIdentityStorageProvider));
        C25292a<PushDeviceIdStorage> b7 = C23587b.m57773b(ZendeskStorageModule_ProvidePushDeviceIdStorageFactory.create(this.provideAdditionalSdkBaseStorageProvider));
        this.providePushDeviceIdStorageProvider = b7;
        this.provideLegacyIdentityStorageProvider = C23587b.m57773b(ZendeskStorageModule_ProvideLegacyIdentityStorageFactory.create(this.provideLegacyIdentityBaseStorageProvider, this.provideLegacyPushBaseStorageProvider, this.provideIdentityStorageProvider, this.provideIdentityManagerProvider, b7));
        this.provideApplicationConfigurationProvider = C23587b.m57773b(ZendeskApplicationModule_ProvideApplicationConfigurationFactory.create(zendeskApplicationModule));
        this.provideHttpLoggingInterceptorProvider = C23590e.m57776a(ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory.create());
        this.provideZendeskBasicHeadersInterceptorProvider = C23590e.m57776a(C25362x2dd20439.create(zendeskNetworkModule, this.provideApplicationConfigurationProvider));
        this.providesUserAgentHeaderInterceptorProvider = C23590e.m57776a(ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory.create(zendeskNetworkModule));
        C25292a<ScheduledExecutorService> b8 = C23587b.m57773b(ZendeskApplicationModule_ProvideExecutorFactory.create());
        this.provideExecutorProvider = b8;
        C25292a<ExecutorService> b9 = C23587b.m57773b(ZendeskApplicationModule_ProvideExecutorServiceFactory.create(b8));
        this.provideExecutorServiceProvider = b9;
        this.provideBaseOkHttpClientProvider = C23587b.m57773b(ZendeskNetworkModule_ProvideBaseOkHttpClientFactory.create(zendeskNetworkModule, this.provideHttpLoggingInterceptorProvider, this.provideZendeskBasicHeadersInterceptorProvider, this.providesUserAgentHeaderInterceptorProvider, b9));
        this.provideAcceptLanguageHeaderInterceptorProvider = C23590e.m57776a(C25361x23150492.create(this.provideApplicationContextProvider));
        C25292a<AcceptHeaderInterceptor> a2 = C23590e.m57776a(ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory.create());
        this.providesAcceptHeaderInterceptorProvider = a2;
        C25292a<C23566v> b11 = C23587b.m57773b(ZendeskNetworkModule_ProvideCoreOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAcceptLanguageHeaderInterceptorProvider, a2));
        this.provideCoreOkHttpClientProvider = b11;
        C25292a<C21268s> b12 = C23587b.m57773b(ZendeskNetworkModule_ProvideCoreRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, b11));
        this.provideCoreRetrofitProvider = b12;
        this.provideBlipsServiceProvider = C23587b.m57773b(ZendeskProvidersModule_ProvideBlipsServiceFactory.create(b12));
        this.provideDeviceInfoProvider = C23587b.m57773b(ZendeskApplicationModule_ProvideDeviceInfoFactory.create(this.provideApplicationContextProvider));
        this.provideBase64SerializerProvider = C23590e.m57776a(ZendeskApplicationModule_ProvideBase64SerializerFactory.create(zendeskApplicationModule, this.provideSerializerProvider));
        C25292a<CoreSettingsStorage> b13 = C23587b.m57773b(ZendeskStorageModule_ProvideCoreSettingsStorageFactory.create(this.provideSettingsStorageProvider));
        this.provideCoreSettingsStorageProvider = b13;
        C25292a<ZendeskBlipsProvider> b14 = C23587b.m57773b(ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory.create(this.provideBlipsServiceProvider, this.provideDeviceInfoProvider, this.provideBase64SerializerProvider, this.provideIdentityManagerProvider, this.provideApplicationConfigurationProvider, b13, this.provideExecutorServiceProvider));
        this.providerZendeskBlipsProvider = b14;
        this.providerBlipsCoreProvider = C23587b.m57773b(ZendeskProvidersModule_ProviderBlipsCoreProviderFactory.create(b14));
        C25292a<ZendeskAuthHeaderInterceptor> a3 = C23590e.m57776a(ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory.create(this.provideIdentityManagerProvider));
        this.provideAuthHeaderInterceptorProvider = a3;
        C25292a<C21268s> b15 = C23587b.m57773b(ZendeskNetworkModule_ProvidePushProviderRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, this.provideCoreOkHttpClientProvider, a3));
        this.providePushProviderRetrofitProvider = b15;
        this.providePushRegistrationServiceProvider = C23590e.m57776a(ZendeskProvidersModule_ProvidePushRegistrationServiceFactory.create(b15));
        this.provideSdkSettingsServiceProvider = C23590e.m57776a(ZendeskProvidersModule_ProvideSdkSettingsServiceFactory.create(this.provideCoreRetrofitProvider));
        this.actionHandlerRegistryProvider = C23587b.m57773b(ZendeskProvidersModule_ActionHandlerRegistryFactory.create());
        C25292a<ZendeskLocaleConverter> b16 = C23587b.m57773b(ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory.create(zendeskApplicationModule));
        this.provideZendeskLocaleConverterProvider = b16;
        C25292a<ZendeskSettingsProvider> b17 = C23587b.m57773b(ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory.create(this.provideSdkSettingsServiceProvider, this.provideSettingsStorageProvider, this.provideCoreSettingsStorageProvider, this.actionHandlerRegistryProvider, this.provideSerializerProvider, b16, this.provideApplicationConfigurationProvider, this.provideApplicationContextProvider));
        this.provideZendeskSdkSettingsProvider = b17;
        C25292a<SettingsProvider> b18 = C23587b.m57773b(ZendeskProvidersModule_ProvideSdkSettingsProviderFactory.create(b17));
        this.provideSdkSettingsProvider = b18;
        this.providePushRegistrationProvider = C23587b.m57773b(ZendeskProvidersModule_ProvidePushRegistrationProviderFactory.create(this.providePushRegistrationServiceProvider, this.provideIdentityManagerProvider, b18, this.providerBlipsCoreProvider, this.providePushDeviceIdStorageProvider, this.provideApplicationContextProvider));
        C25292a<AccessService> a4 = C23590e.m57776a(ZendeskProvidersModule_ProvideAccessServiceFactory.create(this.provideCoreRetrofitProvider));
        this.provideAccessServiceProvider = a4;
        C25292a<AccessProvider> b19 = C23587b.m57773b(ZendeskProvidersModule_ProvideAccessProviderFactory.create(this.provideIdentityManagerProvider, a4));
        this.provideAccessProvider = b19;
        this.provideAccessInterceptorProvider = C23590e.m57776a(ZendeskNetworkModule_ProvideAccessInterceptorFactory.create(this.provideIdentityManagerProvider, b19, this.provideSdkStorageProvider, this.provideCoreSettingsStorageProvider));
        this.provideZendeskUnauthorizedInterceptorProvider = C23590e.m57776a(C25363x5893b2b5.create(this.provideSessionStorageProvider));
        C25292a<SdkSettingsProviderInternal> b21 = C23587b.m57773b(ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory.create(this.provideZendeskSdkSettingsProvider));
        this.provideSdkSettingsProviderInternalProvider = b21;
        this.provideSettingsInterceptorProvider = C23590e.m57776a(ZendeskNetworkModule_ProvideSettingsInterceptorFactory.create(b21, this.provideSettingsStorageProvider));
        C25292a<PushRegistrationProviderInternal> b22 = C23587b.m57773b(C25364xb2419e95.create(this.providePushRegistrationProvider));
        this.providePushRegistrationProviderInternalProvider = b22;
        C25292a<ZendeskPushInterceptor> a5 = C23590e.m57776a(ZendeskNetworkModule_ProvidePushInterceptorFactory.create(b22, this.providePushDeviceIdStorageProvider));
        this.providePushInterceptorProvider = a5;
        C25292a<C23566v> b23 = C23587b.m57773b(ZendeskNetworkModule_ProvideOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideZendeskUnauthorizedInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, this.providesAcceptHeaderInterceptorProvider, a5, this.provideCacheProvider));
        this.provideOkHttpClientProvider = b23;
        this.provideRetrofitProvider = C23587b.m57773b(ZendeskNetworkModule_ProvideRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, b23));
        C25292a<CachingInterceptor> a6 = C23590e.m57776a(ZendeskNetworkModule_ProvideCachingInterceptorFactory.create(this.providesDiskLruStorageProvider));
        this.provideCachingInterceptorProvider = a6;
        C25292a<C23566v> b24 = C23587b.m57773b(ZendeskNetworkModule_ProvideMediaOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, a6, this.provideZendeskUnauthorizedInterceptorProvider));
        this.provideMediaOkHttpClientProvider = b24;
        this.provideRestServiceProvider = C23587b.m57773b(ZendeskNetworkModule_ProvideRestServiceProviderFactory.create(zendeskNetworkModule, this.provideRetrofitProvider, b24, this.provideOkHttpClientProvider, this.provideCoreOkHttpClientProvider));
        this.providerBlipsProvider = C23587b.m57773b(ZendeskProvidersModule_ProviderBlipsProviderFactory.create(this.providerZendeskBlipsProvider));
        C25292a<ConnectivityManager> b25 = C23587b.m57773b(ZendeskProvidersModule_ProviderConnectivityManagerFactory.create(this.provideApplicationContextProvider));
        this.providerConnectivityManagerProvider = b25;
        this.providerNetworkInfoProvider = C23587b.m57773b(ZendeskProvidersModule_ProviderNetworkInfoProviderFactory.create(this.provideApplicationContextProvider, b25));
        C25292a<AuthenticationProvider> b26 = C23587b.m57773b(ZendeskStorageModule_ProvideAuthProviderFactory.create(this.provideIdentityManagerProvider));
        this.provideAuthProvider = b26;
        this.provideCoreSdkModuleProvider = C23590e.m57776a(ZendeskProvidersModule_ProvideCoreSdkModuleFactory.create(this.provideSdkSettingsProvider, this.provideRestServiceProvider, this.providerBlipsProvider, this.provideSessionStorageProvider, this.providerNetworkInfoProvider, this.provideMemoryCacheProvider, this.actionHandlerRegistryProvider, this.provideExecutorProvider, this.provideApplicationContextProvider, b26, this.provideApplicationConfigurationProvider, this.providePushRegistrationProvider));
        C25292a<UserService> a7 = C23590e.m57776a(ZendeskProvidersModule_ProvideUserServiceFactory.create(this.provideRetrofitProvider));
        this.provideUserServiceProvider = a7;
        C25292a<UserProvider> b27 = C23587b.m57773b(ZendeskProvidersModule_ProvideUserProviderFactory.create(a7));
        this.provideUserProvider = b27;
        C25292a<ProviderStore> b28 = C23587b.m57773b(ZendeskProvidersModule_ProvideProviderStoreFactory.create(b27, this.providePushRegistrationProvider));
        this.provideProviderStoreProvider = b28;
        this.provideZendeskProvider = C23587b.m57773b(ZendeskApplicationModule_ProvideZendeskFactory.create(this.provideSdkStorageProvider, this.provideLegacyIdentityStorageProvider, this.provideIdentityManagerProvider, this.providerBlipsCoreProvider, this.providePushRegistrationProvider, this.provideCoreSdkModuleProvider, b28));
    }

    public ZendeskShadow zendeskShadow() {
        return this.provideZendeskProvider.get();
    }

    private DaggerZendeskApplicationComponent(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule) {
        initialize(zendeskApplicationModule, zendeskNetworkModule);
    }
}

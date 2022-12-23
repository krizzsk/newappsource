package zendesk.core;

import ie0.C23588c;
import java.util.concurrent.ExecutorService;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory implements C23588c<ZendeskBlipsProvider> {
    private final C25292a<ApplicationConfiguration> applicationConfigurationProvider;
    private final C25292a<BlipsService> blipsServiceProvider;
    private final C25292a<CoreSettingsStorage> coreSettingsStorageProvider;
    private final C25292a<DeviceInfo> deviceInfoProvider;
    private final C25292a<ExecutorService> executorProvider;
    private final C25292a<IdentityManager> identityManagerProvider;
    private final C25292a<Serializer> serializerProvider;

    public ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(C25292a<BlipsService> aVar, C25292a<DeviceInfo> aVar2, C25292a<Serializer> aVar3, C25292a<IdentityManager> aVar4, C25292a<ApplicationConfiguration> aVar5, C25292a<CoreSettingsStorage> aVar6, C25292a<ExecutorService> aVar7) {
        this.blipsServiceProvider = aVar;
        this.deviceInfoProvider = aVar2;
        this.serializerProvider = aVar3;
        this.identityManagerProvider = aVar4;
        this.applicationConfigurationProvider = aVar5;
        this.coreSettingsStorageProvider = aVar6;
        this.executorProvider = aVar7;
    }

    public static ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory create(C25292a<BlipsService> aVar, C25292a<DeviceInfo> aVar2, C25292a<Serializer> aVar3, C25292a<IdentityManager> aVar4, C25292a<ApplicationConfiguration> aVar5, C25292a<CoreSettingsStorage> aVar6, C25292a<ExecutorService> aVar7) {
        return new ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static ZendeskBlipsProvider providerZendeskBlipsProvider(Object obj, Object obj2, Object obj3, Object obj4, ApplicationConfiguration applicationConfiguration, Object obj5, ExecutorService executorService) {
        ZendeskBlipsProvider providerZendeskBlipsProvider = ZendeskProvidersModule.providerZendeskBlipsProvider((BlipsService) obj, (DeviceInfo) obj2, (Serializer) obj3, (IdentityManager) obj4, applicationConfiguration, (CoreSettingsStorage) obj5, executorService);
        C13641g.m34117e(providerZendeskBlipsProvider);
        return providerZendeskBlipsProvider;
    }

    public ZendeskBlipsProvider get() {
        return providerZendeskBlipsProvider(this.blipsServiceProvider.get(), this.deviceInfoProvider.get(), this.serializerProvider.get(), this.identityManagerProvider.get(), this.applicationConfigurationProvider.get(), this.coreSettingsStorageProvider.get(), this.executorProvider.get());
    }
}

package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskApplicationModule_ProvideZendeskFactory implements C23588c<ZendeskShadow> {
    private final C25292a<BlipsCoreProvider> blipsCoreProvider;
    private final C25292a<CoreModule> coreModuleProvider;
    private final C25292a<IdentityManager> identityManagerProvider;
    private final C25292a<LegacyIdentityMigrator> legacyIdentityMigratorProvider;
    private final C25292a<ProviderStore> providerStoreProvider;
    private final C25292a<PushRegistrationProvider> pushRegistrationProvider;
    private final C25292a<Storage> storageProvider;

    public ZendeskApplicationModule_ProvideZendeskFactory(C25292a<Storage> aVar, C25292a<LegacyIdentityMigrator> aVar2, C25292a<IdentityManager> aVar3, C25292a<BlipsCoreProvider> aVar4, C25292a<PushRegistrationProvider> aVar5, C25292a<CoreModule> aVar6, C25292a<ProviderStore> aVar7) {
        this.storageProvider = aVar;
        this.legacyIdentityMigratorProvider = aVar2;
        this.identityManagerProvider = aVar3;
        this.blipsCoreProvider = aVar4;
        this.pushRegistrationProvider = aVar5;
        this.coreModuleProvider = aVar6;
        this.providerStoreProvider = aVar7;
    }

    public static ZendeskApplicationModule_ProvideZendeskFactory create(C25292a<Storage> aVar, C25292a<LegacyIdentityMigrator> aVar2, C25292a<IdentityManager> aVar3, C25292a<BlipsCoreProvider> aVar4, C25292a<PushRegistrationProvider> aVar5, C25292a<CoreModule> aVar6, C25292a<ProviderStore> aVar7) {
        return new ZendeskApplicationModule_ProvideZendeskFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static ZendeskShadow provideZendesk(Object obj, Object obj2, Object obj3, Object obj4, PushRegistrationProvider pushRegistrationProvider2, CoreModule coreModule, ProviderStore providerStore) {
        ZendeskShadow provideZendesk = ZendeskApplicationModule.provideZendesk((Storage) obj, (LegacyIdentityMigrator) obj2, (IdentityManager) obj3, (BlipsCoreProvider) obj4, pushRegistrationProvider2, coreModule, providerStore);
        C13641g.m34117e(provideZendesk);
        return provideZendesk;
    }

    public ZendeskShadow get() {
        return provideZendesk(this.storageProvider.get(), this.legacyIdentityMigratorProvider.get(), this.identityManagerProvider.get(), this.blipsCoreProvider.get(), this.pushRegistrationProvider.get(), this.coreModuleProvider.get(), this.providerStoreProvider.get());
    }
}

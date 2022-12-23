package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideLegacyIdentityStorageFactory implements C23588c<LegacyIdentityMigrator> {
    private final C25292a<IdentityManager> identityManagerProvider;
    private final C25292a<IdentityStorage> identityStorageProvider;
    private final C25292a<SharedPreferencesStorage> legacyIdentityBaseStorageProvider;
    private final C25292a<SharedPreferencesStorage> legacyPushBaseStorageProvider;
    private final C25292a<PushDeviceIdStorage> pushDeviceIdStorageProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(C25292a<SharedPreferencesStorage> aVar, C25292a<SharedPreferencesStorage> aVar2, C25292a<IdentityStorage> aVar3, C25292a<IdentityManager> aVar4, C25292a<PushDeviceIdStorage> aVar5) {
        this.legacyIdentityBaseStorageProvider = aVar;
        this.legacyPushBaseStorageProvider = aVar2;
        this.identityStorageProvider = aVar3;
        this.identityManagerProvider = aVar4;
        this.pushDeviceIdStorageProvider = aVar5;
    }

    public static ZendeskStorageModule_ProvideLegacyIdentityStorageFactory create(C25292a<SharedPreferencesStorage> aVar, C25292a<SharedPreferencesStorage> aVar2, C25292a<IdentityStorage> aVar3, C25292a<IdentityManager> aVar4, C25292a<PushDeviceIdStorage> aVar5) {
        return new ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static LegacyIdentityMigrator provideLegacyIdentityStorage(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        LegacyIdentityMigrator provideLegacyIdentityStorage = ZendeskStorageModule.provideLegacyIdentityStorage((SharedPreferencesStorage) obj, (SharedPreferencesStorage) obj2, (IdentityStorage) obj3, (IdentityManager) obj4, (PushDeviceIdStorage) obj5);
        C13641g.m34117e(provideLegacyIdentityStorage);
        return provideLegacyIdentityStorage;
    }

    public LegacyIdentityMigrator get() {
        return provideLegacyIdentityStorage(this.legacyIdentityBaseStorageProvider.get(), this.legacyPushBaseStorageProvider.get(), this.identityStorageProvider.get(), this.identityManagerProvider.get(), this.pushDeviceIdStorageProvider.get());
    }
}

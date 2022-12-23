package zendesk.core;

import com.zendesk.logger.Logger;
import fe0.C23345c;
import ge0.C23410c;

final class ZendeskShadow {
    private final BlipsCoreProvider blipsCoreProvider;
    private final CoreModule coreModule;
    private final IdentityManager identityManager;
    private final LegacyIdentityMigrator legacyIdentityMigrator;
    private final ProviderStore providerStore;
    private final PushRegistrationProvider pushRegistrationProvider;
    private final Storage storage;

    public ZendeskShadow(Storage storage2, LegacyIdentityMigrator legacyIdentityMigrator2, IdentityManager identityManager2, BlipsCoreProvider blipsCoreProvider2, PushRegistrationProvider pushRegistrationProvider2, CoreModule coreModule2, ProviderStore providerStore2) {
        this.storage = storage2;
        this.legacyIdentityMigrator = legacyIdentityMigrator2;
        this.identityManager = identityManager2;
        this.blipsCoreProvider = blipsCoreProvider2;
        this.pushRegistrationProvider = pushRegistrationProvider2;
        this.coreModule = coreModule2;
        this.providerStore = providerStore2;
    }

    private static boolean checkIdentityValid(Identity identity) {
        if (identity == null) {
            Logger.m57306e("setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.", new Object[0]);
            return false;
        } else if (!(identity instanceof AnonymousIdentity) && !(identity instanceof JwtIdentity)) {
            Logger.m57306e("setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.", new Object[0]);
            return false;
        } else if (!(identity instanceof JwtIdentity) || !C23410c.m57534b(((JwtIdentity) identity).getJwtUserIdentifier())) {
            return true;
        } else {
            Logger.m57306e("setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.", new Object[0]);
            return false;
        }
    }

    public void cleanupIfNewConfig(ApplicationConfiguration applicationConfiguration) {
        if (this.storage.hasSdkConfigChanged(applicationConfiguration)) {
            this.pushRegistrationProvider.unregisterDevice((C23345c<Void>) null);
        }
    }

    public CoreModule coreModule() {
        return this.coreModule;
    }

    public Identity getIdentity() {
        return this.identityManager.getIdentity();
    }

    public void init(ApplicationConfiguration applicationConfiguration, boolean z) {
        if (this.storage.hasSdkConfigChanged(applicationConfiguration)) {
            Logger.m57302a("SDK app config details have changed, cleaning up old config storage.", new Object[0]);
            this.storage.clear();
            this.storage.storeSdkHash(applicationConfiguration);
        } else if (z) {
            Logger.C23262c cVar = Logger.f59014a;
            Logger.Priority priority = Logger.Priority.VERBOSE;
            Logger.m57305d("Zendesk is already initialized with these details, skipping.", new Object[0]);
            return;
        }
        this.blipsCoreProvider.coreInitialized();
    }

    public ProviderStore providers() {
        return this.providerStore;
    }

    public void reset() {
        this.pushRegistrationProvider.unregisterDevice((C23345c<Void>) null);
        this.storage.getSessionStorage().clear();
        this.storage.clear();
    }

    public void setIdentity(Identity identity) {
        if (checkIdentityValid(identity)) {
            this.legacyIdentityMigrator.checkAndMigrateIdentity();
            if (this.identityManager.identityIsDifferent(identity)) {
                this.pushRegistrationProvider.unregisterDevice((C23345c<Void>) null);
                this.storage.getSessionStorage().clear();
                this.identityManager.updateAndPersistIdentity(identity);
                return;
            }
            Logger.C23262c cVar = Logger.f59014a;
            Logger.Priority priority = Logger.Priority.VERBOSE;
            Logger.m57305d("Zendesk is already initialized with this identity, skipping.", new Object[0]);
        }
    }
}

package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;

public final class StorageModule_ProvideHelpCenterSessionCacheFactory implements C23588c<HelpCenterSessionCache> {
    private final StorageModule module;

    public StorageModule_ProvideHelpCenterSessionCacheFactory(StorageModule storageModule) {
        this.module = storageModule;
    }

    public static StorageModule_ProvideHelpCenterSessionCacheFactory create(StorageModule storageModule) {
        return new StorageModule_ProvideHelpCenterSessionCacheFactory(storageModule);
    }

    public static HelpCenterSessionCache provideHelpCenterSessionCache(StorageModule storageModule) {
        HelpCenterSessionCache provideHelpCenterSessionCache = storageModule.provideHelpCenterSessionCache();
        C13641g.m34117e(provideHelpCenterSessionCache);
        return provideHelpCenterSessionCache;
    }

    public HelpCenterSessionCache get() {
        return provideHelpCenterSessionCache(this.module);
    }
}

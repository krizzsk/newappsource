package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;

public final class StorageModule_ProvideRequestSessionCacheFactory implements C23588c<RequestSessionCache> {
    private final StorageModule module;

    public StorageModule_ProvideRequestSessionCacheFactory(StorageModule storageModule) {
        this.module = storageModule;
    }

    public static StorageModule_ProvideRequestSessionCacheFactory create(StorageModule storageModule) {
        return new StorageModule_ProvideRequestSessionCacheFactory(storageModule);
    }

    public static RequestSessionCache provideRequestSessionCache(StorageModule storageModule) {
        RequestSessionCache provideRequestSessionCache = storageModule.provideRequestSessionCache();
        C13641g.m34117e(provideRequestSessionCache);
        return provideRequestSessionCache;
    }

    public RequestSessionCache get() {
        return provideRequestSessionCache(this.module);
    }
}

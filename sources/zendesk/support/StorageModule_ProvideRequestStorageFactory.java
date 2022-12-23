package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;
import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;

public final class StorageModule_ProvideRequestStorageFactory implements C23588c<RequestStorage> {
    private final C25292a<SessionStorage> baseStorageProvider;
    private final C25292a<MemoryCache> memoryCacheProvider;
    private final StorageModule module;
    private final C25292a<RequestMigrator> requestMigratorProvider;

    public StorageModule_ProvideRequestStorageFactory(StorageModule storageModule, C25292a<SessionStorage> aVar, C25292a<RequestMigrator> aVar2, C25292a<MemoryCache> aVar3) {
        this.module = storageModule;
        this.baseStorageProvider = aVar;
        this.requestMigratorProvider = aVar2;
        this.memoryCacheProvider = aVar3;
    }

    public static StorageModule_ProvideRequestStorageFactory create(StorageModule storageModule, C25292a<SessionStorage> aVar, C25292a<RequestMigrator> aVar2, C25292a<MemoryCache> aVar3) {
        return new StorageModule_ProvideRequestStorageFactory(storageModule, aVar, aVar2, aVar3);
    }

    public static RequestStorage provideRequestStorage(StorageModule storageModule, SessionStorage sessionStorage, Object obj, MemoryCache memoryCache) {
        RequestStorage provideRequestStorage = storageModule.provideRequestStorage(sessionStorage, (RequestMigrator) obj, memoryCache);
        C13641g.m34117e(provideRequestStorage);
        return provideRequestStorage;
    }

    public RequestStorage get() {
        return provideRequestStorage(this.module, this.baseStorageProvider.get(), this.requestMigratorProvider.get(), this.memoryCacheProvider.get());
    }
}

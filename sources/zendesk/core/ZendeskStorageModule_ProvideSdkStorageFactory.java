package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideSdkStorageFactory implements C23588c<Storage> {
    private final C25292a<MemoryCache> memoryCacheProvider;
    private final C25292a<BaseStorage> sdkBaseStorageProvider;
    private final C25292a<SessionStorage> sessionStorageProvider;
    private final C25292a<SettingsStorage> settingsStorageProvider;

    public ZendeskStorageModule_ProvideSdkStorageFactory(C25292a<SettingsStorage> aVar, C25292a<SessionStorage> aVar2, C25292a<BaseStorage> aVar3, C25292a<MemoryCache> aVar4) {
        this.settingsStorageProvider = aVar;
        this.sessionStorageProvider = aVar2;
        this.sdkBaseStorageProvider = aVar3;
        this.memoryCacheProvider = aVar4;
    }

    public static ZendeskStorageModule_ProvideSdkStorageFactory create(C25292a<SettingsStorage> aVar, C25292a<SessionStorage> aVar2, C25292a<BaseStorage> aVar3, C25292a<MemoryCache> aVar4) {
        return new ZendeskStorageModule_ProvideSdkStorageFactory(aVar, aVar2, aVar3, aVar4);
    }

    public static Storage provideSdkStorage(Object obj, SessionStorage sessionStorage, BaseStorage baseStorage, MemoryCache memoryCache) {
        Storage provideSdkStorage = ZendeskStorageModule.provideSdkStorage((SettingsStorage) obj, sessionStorage, baseStorage, memoryCache);
        C13641g.m34117e(provideSdkStorage);
        return provideSdkStorage;
    }

    public Storage get() {
        return provideSdkStorage(this.settingsStorageProvider.get(), this.sessionStorageProvider.get(), this.sdkBaseStorageProvider.get(), this.memoryCacheProvider.get());
    }
}

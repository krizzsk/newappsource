package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideSettingsStorageFactory implements C23588c<SettingsStorage> {
    private final C25292a<BaseStorage> baseStorageProvider;

    public ZendeskStorageModule_ProvideSettingsStorageFactory(C25292a<BaseStorage> aVar) {
        this.baseStorageProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideSettingsStorageFactory create(C25292a<BaseStorage> aVar) {
        return new ZendeskStorageModule_ProvideSettingsStorageFactory(aVar);
    }

    public static SettingsStorage provideSettingsStorage(BaseStorage baseStorage) {
        SettingsStorage provideSettingsStorage = ZendeskStorageModule.provideSettingsStorage(baseStorage);
        C13641g.m34117e(provideSettingsStorage);
        return provideSettingsStorage;
    }

    public SettingsStorage get() {
        return provideSettingsStorage(this.baseStorageProvider.get());
    }
}

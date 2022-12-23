package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideCoreSettingsStorageFactory implements C23588c<CoreSettingsStorage> {
    private final C25292a<SettingsStorage> settingsStorageProvider;

    public ZendeskStorageModule_ProvideCoreSettingsStorageFactory(C25292a<SettingsStorage> aVar) {
        this.settingsStorageProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideCoreSettingsStorageFactory create(C25292a<SettingsStorage> aVar) {
        return new ZendeskStorageModule_ProvideCoreSettingsStorageFactory(aVar);
    }

    public static CoreSettingsStorage provideCoreSettingsStorage(Object obj) {
        CoreSettingsStorage provideCoreSettingsStorage = ZendeskStorageModule.provideCoreSettingsStorage((SettingsStorage) obj);
        C13641g.m34117e(provideCoreSettingsStorage);
        return provideCoreSettingsStorage;
    }

    public CoreSettingsStorage get() {
        return provideCoreSettingsStorage(this.settingsStorageProvider.get());
    }
}

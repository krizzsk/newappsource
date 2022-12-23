package zendesk.core;

import java.util.Locale;
import p172m9.C5720b;

class ZendeskStorage implements Storage {
    private final MemoryCache memoryCache;
    private final BaseStorage sdkDetailsStorage;
    private final SessionStorage sessionStorage;
    private final SettingsStorage settingsStorage;

    public ZendeskStorage(SessionStorage sessionStorage2, SettingsStorage settingsStorage2, BaseStorage baseStorage, MemoryCache memoryCache2) {
        this.sessionStorage = sessionStorage2;
        this.settingsStorage = settingsStorage2;
        this.sdkDetailsStorage = baseStorage;
        this.memoryCache = memoryCache2;
    }

    private String generateSdkHash(ApplicationConfiguration applicationConfiguration) {
        Locale locale = Locale.US;
        return C5720b.m14040H(String.format(locale, "%s_%s_%s", new Object[]{applicationConfiguration.getZendeskUrl().toLowerCase(locale), applicationConfiguration.getApplicationId().toLowerCase(locale), applicationConfiguration.getOauthClientId().toLowerCase(locale)}));
    }

    public void clear() {
        this.sessionStorage.clear();
        this.settingsStorage.clear();
        this.memoryCache.clear();
    }

    public SessionStorage getSessionStorage() {
        return this.sessionStorage;
    }

    public boolean hasSdkConfigChanged(ApplicationConfiguration applicationConfiguration) {
        return !generateSdkHash(applicationConfiguration).equals(this.sdkDetailsStorage.get("sdk_hash"));
    }

    public void storeSdkHash(ApplicationConfiguration applicationConfiguration) {
        this.sdkDetailsStorage.put("sdk_hash", generateSdkHash(applicationConfiguration));
    }
}

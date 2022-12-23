package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskNetworkModule_ProvideSettingsInterceptorFactory implements C23588c<ZendeskSettingsInterceptor> {
    private final C25292a<SdkSettingsProviderInternal> sdkSettingsProvider;
    private final C25292a<SettingsStorage> settingsStorageProvider;

    public ZendeskNetworkModule_ProvideSettingsInterceptorFactory(C25292a<SdkSettingsProviderInternal> aVar, C25292a<SettingsStorage> aVar2) {
        this.sdkSettingsProvider = aVar;
        this.settingsStorageProvider = aVar2;
    }

    public static ZendeskNetworkModule_ProvideSettingsInterceptorFactory create(C25292a<SdkSettingsProviderInternal> aVar, C25292a<SettingsStorage> aVar2) {
        return new ZendeskNetworkModule_ProvideSettingsInterceptorFactory(aVar, aVar2);
    }

    public static ZendeskSettingsInterceptor provideSettingsInterceptor(Object obj, Object obj2) {
        ZendeskSettingsInterceptor provideSettingsInterceptor = ZendeskNetworkModule.provideSettingsInterceptor((SdkSettingsProviderInternal) obj, (SettingsStorage) obj2);
        C13641g.m34117e(provideSettingsInterceptor);
        return provideSettingsInterceptor;
    }

    public ZendeskSettingsInterceptor get() {
        return provideSettingsInterceptor(this.sdkSettingsProvider.get(), this.settingsStorageProvider.get());
    }
}

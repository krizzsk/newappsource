package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvideSdkSettingsProviderFactory implements C23588c<SettingsProvider> {
    private final C25292a<ZendeskSettingsProvider> sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(C25292a<ZendeskSettingsProvider> aVar) {
        this.sdkSettingsProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsProviderFactory create(C25292a<ZendeskSettingsProvider> aVar) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(aVar);
    }

    public static SettingsProvider provideSdkSettingsProvider(Object obj) {
        SettingsProvider provideSdkSettingsProvider = ZendeskProvidersModule.provideSdkSettingsProvider((ZendeskSettingsProvider) obj);
        C13641g.m34117e(provideSdkSettingsProvider);
        return provideSdkSettingsProvider;
    }

    public SettingsProvider get() {
        return provideSdkSettingsProvider(this.sdkSettingsProvider.get());
    }
}

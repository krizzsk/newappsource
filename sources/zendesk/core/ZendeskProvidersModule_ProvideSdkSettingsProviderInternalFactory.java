package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory implements C23588c<SdkSettingsProviderInternal> {
    private final C25292a<ZendeskSettingsProvider> sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(C25292a<ZendeskSettingsProvider> aVar) {
        this.sdkSettingsProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory create(C25292a<ZendeskSettingsProvider> aVar) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(aVar);
    }

    public static SdkSettingsProviderInternal provideSdkSettingsProviderInternal(Object obj) {
        SdkSettingsProviderInternal provideSdkSettingsProviderInternal = ZendeskProvidersModule.provideSdkSettingsProviderInternal((ZendeskSettingsProvider) obj);
        C13641g.m34117e(provideSdkSettingsProviderInternal);
        return provideSdkSettingsProviderInternal;
    }

    public SdkSettingsProviderInternal get() {
        return provideSdkSettingsProviderInternal(this.sdkSettingsProvider.get());
    }
}

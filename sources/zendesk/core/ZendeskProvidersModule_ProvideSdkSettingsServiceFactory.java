package zendesk.core;

import ck0.C21268s;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvideSdkSettingsServiceFactory implements C23588c<SdkSettingsService> {
    private final C25292a<C21268s> retrofitProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(C25292a<C21268s> aVar) {
        this.retrofitProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsServiceFactory create(C25292a<C21268s> aVar) {
        return new ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(aVar);
    }

    public static SdkSettingsService provideSdkSettingsService(C21268s sVar) {
        SdkSettingsService provideSdkSettingsService = ZendeskProvidersModule.provideSdkSettingsService(sVar);
        C13641g.m34117e(provideSdkSettingsService);
        return provideSdkSettingsService;
    }

    public SdkSettingsService get() {
        return provideSdkSettingsService(this.retrofitProvider.get());
    }
}

package zendesk.support;

import ie0.C23588c;
import java.util.Locale;
import p389bl.C13641g;
import ye0.C25292a;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

public final class ProviderModule_ProvideSdkSettingsProviderFactory implements C23588c<SupportSettingsProvider> {
    private final C25292a<ZendeskLocaleConverter> helpCenterLocaleConverterProvider;
    private final C25292a<Locale> localeProvider;
    private final ProviderModule module;
    private final C25292a<SettingsProvider> sdkSettingsProvider;

    public ProviderModule_ProvideSdkSettingsProviderFactory(ProviderModule providerModule, C25292a<SettingsProvider> aVar, C25292a<Locale> aVar2, C25292a<ZendeskLocaleConverter> aVar3) {
        this.module = providerModule;
        this.sdkSettingsProvider = aVar;
        this.localeProvider = aVar2;
        this.helpCenterLocaleConverterProvider = aVar3;
    }

    public static ProviderModule_ProvideSdkSettingsProviderFactory create(ProviderModule providerModule, C25292a<SettingsProvider> aVar, C25292a<Locale> aVar2, C25292a<ZendeskLocaleConverter> aVar3) {
        return new ProviderModule_ProvideSdkSettingsProviderFactory(providerModule, aVar, aVar2, aVar3);
    }

    public static SupportSettingsProvider provideSdkSettingsProvider(ProviderModule providerModule, SettingsProvider settingsProvider, Locale locale, ZendeskLocaleConverter zendeskLocaleConverter) {
        SupportSettingsProvider provideSdkSettingsProvider = providerModule.provideSdkSettingsProvider(settingsProvider, locale, zendeskLocaleConverter);
        C13641g.m34117e(provideSdkSettingsProvider);
        return provideSdkSettingsProvider;
    }

    public SupportSettingsProvider get() {
        return provideSdkSettingsProvider(this.module, this.sdkSettingsProvider.get(), this.localeProvider.get(), this.helpCenterLocaleConverterProvider.get());
    }
}

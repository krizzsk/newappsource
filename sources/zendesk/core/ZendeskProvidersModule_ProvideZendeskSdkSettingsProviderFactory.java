package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory implements C23588c<ZendeskSettingsProvider> {
    private final C25292a<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final C25292a<ApplicationConfiguration> configurationProvider;
    private final C25292a<Context> contextProvider;
    private final C25292a<CoreSettingsStorage> coreSettingsStorageProvider;
    private final C25292a<SdkSettingsService> sdkSettingsServiceProvider;
    private final C25292a<Serializer> serializerProvider;
    private final C25292a<SettingsStorage> settingsStorageProvider;
    private final C25292a<ZendeskLocaleConverter> zendeskLocaleConverterProvider;

    public ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(C25292a<SdkSettingsService> aVar, C25292a<SettingsStorage> aVar2, C25292a<CoreSettingsStorage> aVar3, C25292a<ActionHandlerRegistry> aVar4, C25292a<Serializer> aVar5, C25292a<ZendeskLocaleConverter> aVar6, C25292a<ApplicationConfiguration> aVar7, C25292a<Context> aVar8) {
        this.sdkSettingsServiceProvider = aVar;
        this.settingsStorageProvider = aVar2;
        this.coreSettingsStorageProvider = aVar3;
        this.actionHandlerRegistryProvider = aVar4;
        this.serializerProvider = aVar5;
        this.zendeskLocaleConverterProvider = aVar6;
        this.configurationProvider = aVar7;
        this.contextProvider = aVar8;
    }

    public static ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory create(C25292a<SdkSettingsService> aVar, C25292a<SettingsStorage> aVar2, C25292a<CoreSettingsStorage> aVar3, C25292a<ActionHandlerRegistry> aVar4, C25292a<Serializer> aVar5, C25292a<ZendeskLocaleConverter> aVar6, C25292a<ApplicationConfiguration> aVar7, C25292a<Context> aVar8) {
        return new ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static ZendeskSettingsProvider provideZendeskSdkSettingsProvider(Object obj, Object obj2, Object obj3, ActionHandlerRegistry actionHandlerRegistry, Object obj4, ZendeskLocaleConverter zendeskLocaleConverter, ApplicationConfiguration applicationConfiguration, Context context) {
        ZendeskSettingsProvider provideZendeskSdkSettingsProvider = ZendeskProvidersModule.provideZendeskSdkSettingsProvider((SdkSettingsService) obj, (SettingsStorage) obj2, (CoreSettingsStorage) obj3, actionHandlerRegistry, (Serializer) obj4, zendeskLocaleConverter, applicationConfiguration, context);
        C13641g.m34117e(provideZendeskSdkSettingsProvider);
        return provideZendeskSdkSettingsProvider;
    }

    public ZendeskSettingsProvider get() {
        return provideZendeskSdkSettingsProvider(this.sdkSettingsServiceProvider.get(), this.settingsStorageProvider.get(), this.coreSettingsStorageProvider.get(), this.actionHandlerRegistryProvider.get(), this.serializerProvider.get(), this.zendeskLocaleConverterProvider.get(), this.configurationProvider.get(), this.contextProvider.get());
    }
}

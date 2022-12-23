package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import java.util.concurrent.ScheduledExecutorService;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvideCoreSdkModuleFactory implements C23588c<CoreModule> {
    private final C25292a<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final C25292a<AuthenticationProvider> authenticationProvider;
    private final C25292a<BlipsProvider> blipsProvider;
    private final C25292a<Context> contextProvider;
    private final C25292a<ScheduledExecutorService> executorProvider;
    private final C25292a<MemoryCache> memoryCacheProvider;
    private final C25292a<NetworkInfoProvider> networkInfoProvider;
    private final C25292a<PushRegistrationProvider> pushRegistrationProvider;
    private final C25292a<RestServiceProvider> restServiceProvider;
    private final C25292a<SessionStorage> sessionStorageProvider;
    private final C25292a<SettingsProvider> settingsProvider;
    private final C25292a<ApplicationConfiguration> zendeskConfigurationProvider;

    public ZendeskProvidersModule_ProvideCoreSdkModuleFactory(C25292a<SettingsProvider> aVar, C25292a<RestServiceProvider> aVar2, C25292a<BlipsProvider> aVar3, C25292a<SessionStorage> aVar4, C25292a<NetworkInfoProvider> aVar5, C25292a<MemoryCache> aVar6, C25292a<ActionHandlerRegistry> aVar7, C25292a<ScheduledExecutorService> aVar8, C25292a<Context> aVar9, C25292a<AuthenticationProvider> aVar10, C25292a<ApplicationConfiguration> aVar11, C25292a<PushRegistrationProvider> aVar12) {
        this.settingsProvider = aVar;
        this.restServiceProvider = aVar2;
        this.blipsProvider = aVar3;
        this.sessionStorageProvider = aVar4;
        this.networkInfoProvider = aVar5;
        this.memoryCacheProvider = aVar6;
        this.actionHandlerRegistryProvider = aVar7;
        this.executorProvider = aVar8;
        this.contextProvider = aVar9;
        this.authenticationProvider = aVar10;
        this.zendeskConfigurationProvider = aVar11;
        this.pushRegistrationProvider = aVar12;
    }

    public static ZendeskProvidersModule_ProvideCoreSdkModuleFactory create(C25292a<SettingsProvider> aVar, C25292a<RestServiceProvider> aVar2, C25292a<BlipsProvider> aVar3, C25292a<SessionStorage> aVar4, C25292a<NetworkInfoProvider> aVar5, C25292a<MemoryCache> aVar6, C25292a<ActionHandlerRegistry> aVar7, C25292a<ScheduledExecutorService> aVar8, C25292a<Context> aVar9, C25292a<AuthenticationProvider> aVar10, C25292a<ApplicationConfiguration> aVar11, C25292a<PushRegistrationProvider> aVar12) {
        return new ZendeskProvidersModule_ProvideCoreSdkModuleFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12);
    }

    public static CoreModule provideCoreSdkModule(SettingsProvider settingsProvider2, RestServiceProvider restServiceProvider2, BlipsProvider blipsProvider2, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider2, MemoryCache memoryCache, ActionHandlerRegistry actionHandlerRegistry, ScheduledExecutorService scheduledExecutorService, Context context, AuthenticationProvider authenticationProvider2, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider2) {
        CoreModule provideCoreSdkModule = ZendeskProvidersModule.provideCoreSdkModule(settingsProvider2, restServiceProvider2, blipsProvider2, sessionStorage, networkInfoProvider2, memoryCache, actionHandlerRegistry, scheduledExecutorService, context, authenticationProvider2, applicationConfiguration, pushRegistrationProvider2);
        C13641g.m34117e(provideCoreSdkModule);
        return provideCoreSdkModule;
    }

    public CoreModule get() {
        return provideCoreSdkModule(this.settingsProvider.get(), this.restServiceProvider.get(), this.blipsProvider.get(), this.sessionStorageProvider.get(), this.networkInfoProvider.get(), this.memoryCacheProvider.get(), this.actionHandlerRegistryProvider.get(), this.executorProvider.get(), this.contextProvider.get(), this.authenticationProvider.get(), this.zendeskConfigurationProvider.get(), this.pushRegistrationProvider.get());
    }
}

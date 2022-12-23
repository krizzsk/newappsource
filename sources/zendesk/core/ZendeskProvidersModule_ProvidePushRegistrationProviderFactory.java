package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvidePushRegistrationProviderFactory implements C23588c<PushRegistrationProvider> {
    private final C25292a<BlipsCoreProvider> blipsProvider;
    private final C25292a<Context> contextProvider;
    private final C25292a<IdentityManager> identityManagerProvider;
    private final C25292a<PushDeviceIdStorage> pushDeviceIdStorageProvider;
    private final C25292a<PushRegistrationService> pushRegistrationServiceProvider;
    private final C25292a<SettingsProvider> settingsProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(C25292a<PushRegistrationService> aVar, C25292a<IdentityManager> aVar2, C25292a<SettingsProvider> aVar3, C25292a<BlipsCoreProvider> aVar4, C25292a<PushDeviceIdStorage> aVar5, C25292a<Context> aVar6) {
        this.pushRegistrationServiceProvider = aVar;
        this.identityManagerProvider = aVar2;
        this.settingsProvider = aVar3;
        this.blipsProvider = aVar4;
        this.pushDeviceIdStorageProvider = aVar5;
        this.contextProvider = aVar6;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationProviderFactory create(C25292a<PushRegistrationService> aVar, C25292a<IdentityManager> aVar2, C25292a<SettingsProvider> aVar3, C25292a<BlipsCoreProvider> aVar4, C25292a<PushDeviceIdStorage> aVar5, C25292a<Context> aVar6) {
        return new ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static PushRegistrationProvider providePushRegistrationProvider(Object obj, Object obj2, SettingsProvider settingsProvider2, Object obj3, Object obj4, Context context) {
        PushRegistrationProvider providePushRegistrationProvider = ZendeskProvidersModule.providePushRegistrationProvider((PushRegistrationService) obj, (IdentityManager) obj2, settingsProvider2, (BlipsCoreProvider) obj3, (PushDeviceIdStorage) obj4, context);
        C13641g.m34117e(providePushRegistrationProvider);
        return providePushRegistrationProvider;
    }

    public PushRegistrationProvider get() {
        return providePushRegistrationProvider(this.pushRegistrationServiceProvider.get(), this.identityManagerProvider.get(), this.settingsProvider.get(), this.blipsProvider.get(), this.pushDeviceIdStorageProvider.get(), this.contextProvider.get());
    }
}

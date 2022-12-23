package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvideProviderStoreFactory implements C23588c<ProviderStore> {
    private final C25292a<PushRegistrationProvider> pushRegistrationProvider;
    private final C25292a<UserProvider> userProvider;

    public ZendeskProvidersModule_ProvideProviderStoreFactory(C25292a<UserProvider> aVar, C25292a<PushRegistrationProvider> aVar2) {
        this.userProvider = aVar;
        this.pushRegistrationProvider = aVar2;
    }

    public static ZendeskProvidersModule_ProvideProviderStoreFactory create(C25292a<UserProvider> aVar, C25292a<PushRegistrationProvider> aVar2) {
        return new ZendeskProvidersModule_ProvideProviderStoreFactory(aVar, aVar2);
    }

    public static ProviderStore provideProviderStore(UserProvider userProvider2, PushRegistrationProvider pushRegistrationProvider2) {
        ProviderStore provideProviderStore = ZendeskProvidersModule.provideProviderStore(userProvider2, pushRegistrationProvider2);
        C13641g.m34117e(provideProviderStore);
        return provideProviderStore;
    }

    public ProviderStore get() {
        return provideProviderStore(this.userProvider.get(), this.pushRegistrationProvider.get());
    }
}

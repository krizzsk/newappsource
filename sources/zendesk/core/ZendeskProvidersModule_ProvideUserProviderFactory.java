package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvideUserProviderFactory implements C23588c<UserProvider> {
    private final C25292a<UserService> userServiceProvider;

    public ZendeskProvidersModule_ProvideUserProviderFactory(C25292a<UserService> aVar) {
        this.userServiceProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideUserProviderFactory create(C25292a<UserService> aVar) {
        return new ZendeskProvidersModule_ProvideUserProviderFactory(aVar);
    }

    public static UserProvider provideUserProvider(Object obj) {
        UserProvider provideUserProvider = ZendeskProvidersModule.provideUserProvider((UserService) obj);
        C13641g.m34117e(provideUserProvider);
        return provideUserProvider;
    }

    public UserProvider get() {
        return provideUserProvider(this.userServiceProvider.get());
    }
}

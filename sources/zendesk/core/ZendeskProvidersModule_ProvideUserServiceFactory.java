package zendesk.core;

import ck0.C21268s;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvideUserServiceFactory implements C23588c<UserService> {
    private final C25292a<C21268s> retrofitProvider;

    public ZendeskProvidersModule_ProvideUserServiceFactory(C25292a<C21268s> aVar) {
        this.retrofitProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideUserServiceFactory create(C25292a<C21268s> aVar) {
        return new ZendeskProvidersModule_ProvideUserServiceFactory(aVar);
    }

    public static UserService provideUserService(C21268s sVar) {
        UserService provideUserService = ZendeskProvidersModule.provideUserService(sVar);
        C13641g.m34117e(provideUserService);
        return provideUserService;
    }

    public UserService get() {
        return provideUserService(this.retrofitProvider.get());
    }
}

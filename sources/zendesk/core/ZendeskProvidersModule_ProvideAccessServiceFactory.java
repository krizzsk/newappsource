package zendesk.core;

import ck0.C21268s;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvideAccessServiceFactory implements C23588c<AccessService> {
    private final C25292a<C21268s> retrofitProvider;

    public ZendeskProvidersModule_ProvideAccessServiceFactory(C25292a<C21268s> aVar) {
        this.retrofitProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideAccessServiceFactory create(C25292a<C21268s> aVar) {
        return new ZendeskProvidersModule_ProvideAccessServiceFactory(aVar);
    }

    public static AccessService provideAccessService(C21268s sVar) {
        AccessService provideAccessService = ZendeskProvidersModule.provideAccessService(sVar);
        C13641g.m34117e(provideAccessService);
        return provideAccessService;
    }

    public AccessService get() {
        return provideAccessService(this.retrofitProvider.get());
    }
}

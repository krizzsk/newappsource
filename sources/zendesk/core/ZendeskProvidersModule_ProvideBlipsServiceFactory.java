package zendesk.core;

import ck0.C21268s;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvideBlipsServiceFactory implements C23588c<BlipsService> {
    private final C25292a<C21268s> retrofitProvider;

    public ZendeskProvidersModule_ProvideBlipsServiceFactory(C25292a<C21268s> aVar) {
        this.retrofitProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideBlipsServiceFactory create(C25292a<C21268s> aVar) {
        return new ZendeskProvidersModule_ProvideBlipsServiceFactory(aVar);
    }

    public static BlipsService provideBlipsService(C21268s sVar) {
        BlipsService provideBlipsService = ZendeskProvidersModule.provideBlipsService(sVar);
        C13641g.m34117e(provideBlipsService);
        return provideBlipsService;
    }

    public BlipsService get() {
        return provideBlipsService(this.retrofitProvider.get());
    }
}

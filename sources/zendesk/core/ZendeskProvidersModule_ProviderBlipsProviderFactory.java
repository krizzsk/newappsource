package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProviderBlipsProviderFactory implements C23588c<BlipsProvider> {
    private final C25292a<ZendeskBlipsProvider> zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsProviderFactory(C25292a<ZendeskBlipsProvider> aVar) {
        this.zendeskBlipsProvider = aVar;
    }

    public static ZendeskProvidersModule_ProviderBlipsProviderFactory create(C25292a<ZendeskBlipsProvider> aVar) {
        return new ZendeskProvidersModule_ProviderBlipsProviderFactory(aVar);
    }

    public static BlipsProvider providerBlipsProvider(Object obj) {
        BlipsProvider providerBlipsProvider = ZendeskProvidersModule.providerBlipsProvider((ZendeskBlipsProvider) obj);
        C13641g.m34117e(providerBlipsProvider);
        return providerBlipsProvider;
    }

    public BlipsProvider get() {
        return providerBlipsProvider(this.zendeskBlipsProvider.get());
    }
}

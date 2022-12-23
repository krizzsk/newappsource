package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProviderBlipsCoreProviderFactory implements C23588c<BlipsCoreProvider> {
    private final C25292a<ZendeskBlipsProvider> zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(C25292a<ZendeskBlipsProvider> aVar) {
        this.zendeskBlipsProvider = aVar;
    }

    public static ZendeskProvidersModule_ProviderBlipsCoreProviderFactory create(C25292a<ZendeskBlipsProvider> aVar) {
        return new ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(aVar);
    }

    public static BlipsCoreProvider providerBlipsCoreProvider(Object obj) {
        BlipsCoreProvider providerBlipsCoreProvider = ZendeskProvidersModule.providerBlipsCoreProvider((ZendeskBlipsProvider) obj);
        C13641g.m34117e(providerBlipsCoreProvider);
        return providerBlipsCoreProvider;
    }

    public BlipsCoreProvider get() {
        return providerBlipsCoreProvider(this.zendeskBlipsProvider.get());
    }
}

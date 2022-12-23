package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvideAccessProviderFactory implements C23588c<AccessProvider> {
    private final C25292a<AccessService> accessServiceProvider;
    private final C25292a<IdentityManager> identityManagerProvider;

    public ZendeskProvidersModule_ProvideAccessProviderFactory(C25292a<IdentityManager> aVar, C25292a<AccessService> aVar2) {
        this.identityManagerProvider = aVar;
        this.accessServiceProvider = aVar2;
    }

    public static ZendeskProvidersModule_ProvideAccessProviderFactory create(C25292a<IdentityManager> aVar, C25292a<AccessService> aVar2) {
        return new ZendeskProvidersModule_ProvideAccessProviderFactory(aVar, aVar2);
    }

    public static AccessProvider provideAccessProvider(Object obj, Object obj2) {
        AccessProvider provideAccessProvider = ZendeskProvidersModule.provideAccessProvider((IdentityManager) obj, (AccessService) obj2);
        C13641g.m34117e(provideAccessProvider);
        return provideAccessProvider;
    }

    public AccessProvider get() {
        return provideAccessProvider(this.identityManagerProvider.get(), this.accessServiceProvider.get());
    }
}

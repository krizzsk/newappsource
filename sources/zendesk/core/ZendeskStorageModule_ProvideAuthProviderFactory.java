package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideAuthProviderFactory implements C23588c<AuthenticationProvider> {
    private final C25292a<IdentityManager> identityManagerProvider;

    public ZendeskStorageModule_ProvideAuthProviderFactory(C25292a<IdentityManager> aVar) {
        this.identityManagerProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideAuthProviderFactory create(C25292a<IdentityManager> aVar) {
        return new ZendeskStorageModule_ProvideAuthProviderFactory(aVar);
    }

    public static AuthenticationProvider provideAuthProvider(Object obj) {
        AuthenticationProvider provideAuthProvider = ZendeskStorageModule.provideAuthProvider((IdentityManager) obj);
        C13641g.m34117e(provideAuthProvider);
        return provideAuthProvider;
    }

    public AuthenticationProvider get() {
        return provideAuthProvider(this.identityManagerProvider.get());
    }
}

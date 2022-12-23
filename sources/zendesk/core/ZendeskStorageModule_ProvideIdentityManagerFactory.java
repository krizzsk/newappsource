package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideIdentityManagerFactory implements C23588c<IdentityManager> {
    private final C25292a<IdentityStorage> identityStorageProvider;

    public ZendeskStorageModule_ProvideIdentityManagerFactory(C25292a<IdentityStorage> aVar) {
        this.identityStorageProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideIdentityManagerFactory create(C25292a<IdentityStorage> aVar) {
        return new ZendeskStorageModule_ProvideIdentityManagerFactory(aVar);
    }

    public static IdentityManager provideIdentityManager(Object obj) {
        IdentityManager provideIdentityManager = ZendeskStorageModule.provideIdentityManager((IdentityStorage) obj);
        C13641g.m34117e(provideIdentityManager);
        return provideIdentityManager;
    }

    public IdentityManager get() {
        return provideIdentityManager(this.identityStorageProvider.get());
    }
}

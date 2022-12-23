package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideIdentityStorageFactory implements C23588c<IdentityStorage> {
    private final C25292a<BaseStorage> baseStorageProvider;

    public ZendeskStorageModule_ProvideIdentityStorageFactory(C25292a<BaseStorage> aVar) {
        this.baseStorageProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideIdentityStorageFactory create(C25292a<BaseStorage> aVar) {
        return new ZendeskStorageModule_ProvideIdentityStorageFactory(aVar);
    }

    public static IdentityStorage provideIdentityStorage(BaseStorage baseStorage) {
        IdentityStorage provideIdentityStorage = ZendeskStorageModule.provideIdentityStorage(baseStorage);
        C13641g.m34117e(provideIdentityStorage);
        return provideIdentityStorage;
    }

    public IdentityStorage get() {
        return provideIdentityStorage(this.baseStorageProvider.get());
    }
}

package zendesk.core;

import hi0.C23522c;
import ie0.C23588c;
import java.io.File;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideSessionStorageFactory implements C23588c<SessionStorage> {
    private final C25292a<BaseStorage> additionalSdkStorageProvider;
    private final C25292a<File> belvedereDirProvider;
    private final C25292a<File> cacheDirProvider;
    private final C25292a<C23522c> cacheProvider;
    private final C25292a<File> dataDirProvider;
    private final C25292a<IdentityStorage> identityStorageProvider;
    private final C25292a<BaseStorage> mediaCacheProvider;

    public ZendeskStorageModule_ProvideSessionStorageFactory(C25292a<IdentityStorage> aVar, C25292a<BaseStorage> aVar2, C25292a<BaseStorage> aVar3, C25292a<C23522c> aVar4, C25292a<File> aVar5, C25292a<File> aVar6, C25292a<File> aVar7) {
        this.identityStorageProvider = aVar;
        this.additionalSdkStorageProvider = aVar2;
        this.mediaCacheProvider = aVar3;
        this.cacheProvider = aVar4;
        this.cacheDirProvider = aVar5;
        this.dataDirProvider = aVar6;
        this.belvedereDirProvider = aVar7;
    }

    public static ZendeskStorageModule_ProvideSessionStorageFactory create(C25292a<IdentityStorage> aVar, C25292a<BaseStorage> aVar2, C25292a<BaseStorage> aVar3, C25292a<C23522c> aVar4, C25292a<File> aVar5, C25292a<File> aVar6, C25292a<File> aVar7) {
        return new ZendeskStorageModule_ProvideSessionStorageFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static SessionStorage provideSessionStorage(Object obj, BaseStorage baseStorage, BaseStorage baseStorage2, C23522c cVar, File file, File file2, File file3) {
        SessionStorage provideSessionStorage = ZendeskStorageModule.provideSessionStorage((IdentityStorage) obj, baseStorage, baseStorage2, cVar, file, file2, file3);
        C13641g.m34117e(provideSessionStorage);
        return provideSessionStorage;
    }

    public SessionStorage get() {
        return provideSessionStorage(this.identityStorageProvider.get(), this.additionalSdkStorageProvider.get(), this.mediaCacheProvider.get(), this.cacheProvider.get(), this.cacheDirProvider.get(), this.dataDirProvider.get(), this.belvedereDirProvider.get());
    }
}

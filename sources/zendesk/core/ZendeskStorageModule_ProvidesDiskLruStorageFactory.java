package zendesk.core;

import ie0.C23588c;
import java.io.File;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvidesDiskLruStorageFactory implements C23588c<BaseStorage> {
    private final C25292a<File> fileProvider;
    private final C25292a<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvidesDiskLruStorageFactory(C25292a<File> aVar, C25292a<Serializer> aVar2) {
        this.fileProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvidesDiskLruStorageFactory create(C25292a<File> aVar, C25292a<Serializer> aVar2) {
        return new ZendeskStorageModule_ProvidesDiskLruStorageFactory(aVar, aVar2);
    }

    public static BaseStorage providesDiskLruStorage(File file, Object obj) {
        BaseStorage providesDiskLruStorage = ZendeskStorageModule.providesDiskLruStorage(file, (Serializer) obj);
        C13641g.m34117e(providesDiskLruStorage);
        return providesDiskLruStorage;
    }

    public BaseStorage get() {
        return providesDiskLruStorage(this.fileProvider.get(), this.serializerProvider.get());
    }
}

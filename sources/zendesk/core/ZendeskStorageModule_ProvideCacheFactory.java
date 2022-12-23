package zendesk.core;

import hi0.C23522c;
import ie0.C23588c;
import java.io.File;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideCacheFactory implements C23588c<C23522c> {
    private final C25292a<File> fileProvider;

    public ZendeskStorageModule_ProvideCacheFactory(C25292a<File> aVar) {
        this.fileProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideCacheFactory create(C25292a<File> aVar) {
        return new ZendeskStorageModule_ProvideCacheFactory(aVar);
    }

    public static C23522c provideCache(File file) {
        C23522c provideCache = ZendeskStorageModule.provideCache(file);
        C13641g.m34117e(provideCache);
        return provideCache;
    }

    public C23522c get() {
        return provideCache(this.fileProvider.get());
    }
}

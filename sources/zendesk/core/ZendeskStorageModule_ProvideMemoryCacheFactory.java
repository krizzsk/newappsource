package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;

public final class ZendeskStorageModule_ProvideMemoryCacheFactory implements C23588c<MemoryCache> {
    private static final ZendeskStorageModule_ProvideMemoryCacheFactory INSTANCE = new ZendeskStorageModule_ProvideMemoryCacheFactory();

    public static ZendeskStorageModule_ProvideMemoryCacheFactory create() {
        return INSTANCE;
    }

    public static MemoryCache provideMemoryCache() {
        MemoryCache provideMemoryCache = ZendeskStorageModule.provideMemoryCache();
        C13641g.m34117e(provideMemoryCache);
        return provideMemoryCache;
    }

    public MemoryCache get() {
        return provideMemoryCache();
    }
}

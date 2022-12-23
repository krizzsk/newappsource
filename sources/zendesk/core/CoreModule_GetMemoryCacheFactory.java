package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;

public final class CoreModule_GetMemoryCacheFactory implements C23588c<MemoryCache> {
    private final CoreModule module;

    public CoreModule_GetMemoryCacheFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetMemoryCacheFactory create(CoreModule coreModule) {
        return new CoreModule_GetMemoryCacheFactory(coreModule);
    }

    public static MemoryCache getMemoryCache(CoreModule coreModule) {
        MemoryCache memoryCache = coreModule.getMemoryCache();
        C13641g.m34117e(memoryCache);
        return memoryCache;
    }

    public MemoryCache get() {
        return getMemoryCache(this.module);
    }
}

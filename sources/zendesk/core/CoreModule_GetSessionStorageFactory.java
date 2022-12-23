package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;

public final class CoreModule_GetSessionStorageFactory implements C23588c<SessionStorage> {
    private final CoreModule module;

    public CoreModule_GetSessionStorageFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetSessionStorageFactory create(CoreModule coreModule) {
        return new CoreModule_GetSessionStorageFactory(coreModule);
    }

    public static SessionStorage getSessionStorage(CoreModule coreModule) {
        SessionStorage sessionStorage = coreModule.getSessionStorage();
        C13641g.m34117e(sessionStorage);
        return sessionStorage;
    }

    public SessionStorage get() {
        return getSessionStorage(this.module);
    }
}

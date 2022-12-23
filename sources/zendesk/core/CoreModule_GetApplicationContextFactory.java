package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;

public final class CoreModule_GetApplicationContextFactory implements C23588c<Context> {
    private final CoreModule module;

    public CoreModule_GetApplicationContextFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetApplicationContextFactory create(CoreModule coreModule) {
        return new CoreModule_GetApplicationContextFactory(coreModule);
    }

    public static Context getApplicationContext(CoreModule coreModule) {
        Context applicationContext = coreModule.getApplicationContext();
        C13641g.m34117e(applicationContext);
        return applicationContext;
    }

    public Context get() {
        return getApplicationContext(this.module);
    }
}

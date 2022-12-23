package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;

public final class ZendeskApplicationModule_ProvideApplicationContextFactory implements C23588c<Context> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationContextFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideApplicationContextFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationContextFactory(zendeskApplicationModule);
    }

    public static Context provideApplicationContext(ZendeskApplicationModule zendeskApplicationModule) {
        Context provideApplicationContext = zendeskApplicationModule.provideApplicationContext();
        C13641g.m34117e(provideApplicationContext);
        return provideApplicationContext;
    }

    public Context get() {
        return provideApplicationContext(this.module);
    }
}

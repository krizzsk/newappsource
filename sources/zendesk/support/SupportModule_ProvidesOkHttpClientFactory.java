package zendesk.support;

import hi0.C23566v;
import ie0.C23588c;
import p389bl.C13641g;

public final class SupportModule_ProvidesOkHttpClientFactory implements C23588c<C23566v> {
    private final SupportModule module;

    public SupportModule_ProvidesOkHttpClientFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesOkHttpClientFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesOkHttpClientFactory(supportModule);
    }

    public static C23566v providesOkHttpClient(SupportModule supportModule) {
        C23566v providesOkHttpClient = supportModule.providesOkHttpClient();
        C13641g.m34117e(providesOkHttpClient);
        return providesOkHttpClient;
    }

    public C23566v get() {
        return providesOkHttpClient(this.module);
    }
}

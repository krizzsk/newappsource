package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;

public final class SupportModule_ProvidesUploadProviderFactory implements C23588c<UploadProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesUploadProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesUploadProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesUploadProviderFactory(supportModule);
    }

    public static UploadProvider providesUploadProvider(SupportModule supportModule) {
        UploadProvider providesUploadProvider = supportModule.providesUploadProvider();
        C13641g.m34117e(providesUploadProvider);
        return providesUploadProvider;
    }

    public UploadProvider get() {
        return providesUploadProvider(this.module);
    }
}

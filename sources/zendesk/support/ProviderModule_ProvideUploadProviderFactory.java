package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ProviderModule_ProvideUploadProviderFactory implements C23588c<UploadProvider> {
    private final ProviderModule module;
    private final C25292a<ZendeskUploadService> uploadServiceProvider;

    public ProviderModule_ProvideUploadProviderFactory(ProviderModule providerModule, C25292a<ZendeskUploadService> aVar) {
        this.module = providerModule;
        this.uploadServiceProvider = aVar;
    }

    public static ProviderModule_ProvideUploadProviderFactory create(ProviderModule providerModule, C25292a<ZendeskUploadService> aVar) {
        return new ProviderModule_ProvideUploadProviderFactory(providerModule, aVar);
    }

    public static UploadProvider provideUploadProvider(ProviderModule providerModule, Object obj) {
        UploadProvider provideUploadProvider = providerModule.provideUploadProvider((ZendeskUploadService) obj);
        C13641g.m34117e(provideUploadProvider);
        return provideUploadProvider;
    }

    public UploadProvider get() {
        return provideUploadProvider(this.module, this.uploadServiceProvider.get());
    }
}

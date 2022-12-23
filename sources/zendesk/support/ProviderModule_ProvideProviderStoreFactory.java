package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ProviderModule_ProvideProviderStoreFactory implements C23588c<ProviderStore> {
    private final C25292a<HelpCenterProvider> helpCenterProvider;
    private final ProviderModule module;
    private final C25292a<RequestProvider> requestProvider;
    private final C25292a<UploadProvider> uploadProvider;

    public ProviderModule_ProvideProviderStoreFactory(ProviderModule providerModule, C25292a<HelpCenterProvider> aVar, C25292a<RequestProvider> aVar2, C25292a<UploadProvider> aVar3) {
        this.module = providerModule;
        this.helpCenterProvider = aVar;
        this.requestProvider = aVar2;
        this.uploadProvider = aVar3;
    }

    public static ProviderModule_ProvideProviderStoreFactory create(ProviderModule providerModule, C25292a<HelpCenterProvider> aVar, C25292a<RequestProvider> aVar2, C25292a<UploadProvider> aVar3) {
        return new ProviderModule_ProvideProviderStoreFactory(providerModule, aVar, aVar2, aVar3);
    }

    public static ProviderStore provideProviderStore(ProviderModule providerModule, HelpCenterProvider helpCenterProvider2, RequestProvider requestProvider2, UploadProvider uploadProvider2) {
        ProviderStore provideProviderStore = providerModule.provideProviderStore(helpCenterProvider2, requestProvider2, uploadProvider2);
        C13641g.m34117e(provideProviderStore);
        return provideProviderStore;
    }

    public ProviderStore get() {
        return provideProviderStore(this.module, this.helpCenterProvider.get(), this.requestProvider.get(), this.uploadProvider.get());
    }
}

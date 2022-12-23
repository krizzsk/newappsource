package zendesk.core;

import ck0.C21268s;
import hi0.C23566v;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskNetworkModule_ProvideRestServiceProviderFactory implements C23588c<RestServiceProvider> {
    private final C25292a<C23566v> coreOkHttpClientProvider;
    private final C25292a<C23566v> mediaOkHttpClientProvider;
    private final ZendeskNetworkModule module;
    private final C25292a<C21268s> retrofitProvider;
    private final C25292a<C23566v> standardOkHttpClientProvider;

    public ZendeskNetworkModule_ProvideRestServiceProviderFactory(ZendeskNetworkModule zendeskNetworkModule, C25292a<C21268s> aVar, C25292a<C23566v> aVar2, C25292a<C23566v> aVar3, C25292a<C23566v> aVar4) {
        this.module = zendeskNetworkModule;
        this.retrofitProvider = aVar;
        this.mediaOkHttpClientProvider = aVar2;
        this.standardOkHttpClientProvider = aVar3;
        this.coreOkHttpClientProvider = aVar4;
    }

    public static ZendeskNetworkModule_ProvideRestServiceProviderFactory create(ZendeskNetworkModule zendeskNetworkModule, C25292a<C21268s> aVar, C25292a<C23566v> aVar2, C25292a<C23566v> aVar3, C25292a<C23566v> aVar4) {
        return new ZendeskNetworkModule_ProvideRestServiceProviderFactory(zendeskNetworkModule, aVar, aVar2, aVar3, aVar4);
    }

    public static RestServiceProvider provideRestServiceProvider(ZendeskNetworkModule zendeskNetworkModule, C21268s sVar, C23566v vVar, C23566v vVar2, C23566v vVar3) {
        RestServiceProvider provideRestServiceProvider = zendeskNetworkModule.provideRestServiceProvider(sVar, vVar, vVar2, vVar3);
        C13641g.m34117e(provideRestServiceProvider);
        return provideRestServiceProvider;
    }

    public RestServiceProvider get() {
        return provideRestServiceProvider(this.module, this.retrofitProvider.get(), this.mediaOkHttpClientProvider.get(), this.standardOkHttpClientProvider.get(), this.coreOkHttpClientProvider.get());
    }
}

package zendesk.core;

import ck0.C21268s;
import com.google.gson.Gson;
import hi0.C23566v;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskNetworkModule_ProvidePushProviderRetrofitFactory implements C23588c<C21268s> {
    private final C25292a<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final C25292a<ApplicationConfiguration> configurationProvider;
    private final C25292a<Gson> gsonProvider;
    private final C25292a<C23566v> okHttpClientProvider;

    public ZendeskNetworkModule_ProvidePushProviderRetrofitFactory(C25292a<ApplicationConfiguration> aVar, C25292a<Gson> aVar2, C25292a<C23566v> aVar3, C25292a<ZendeskAuthHeaderInterceptor> aVar4) {
        this.configurationProvider = aVar;
        this.gsonProvider = aVar2;
        this.okHttpClientProvider = aVar3;
        this.authHeaderInterceptorProvider = aVar4;
    }

    public static ZendeskNetworkModule_ProvidePushProviderRetrofitFactory create(C25292a<ApplicationConfiguration> aVar, C25292a<Gson> aVar2, C25292a<C23566v> aVar3, C25292a<ZendeskAuthHeaderInterceptor> aVar4) {
        return new ZendeskNetworkModule_ProvidePushProviderRetrofitFactory(aVar, aVar2, aVar3, aVar4);
    }

    public static C21268s providePushProviderRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, C23566v vVar, Object obj) {
        C21268s providePushProviderRetrofit = ZendeskNetworkModule.providePushProviderRetrofit(applicationConfiguration, gson, vVar, (ZendeskAuthHeaderInterceptor) obj);
        C13641g.m34117e(providePushProviderRetrofit);
        return providePushProviderRetrofit;
    }

    public C21268s get() {
        return providePushProviderRetrofit(this.configurationProvider.get(), this.gsonProvider.get(), this.okHttpClientProvider.get(), this.authHeaderInterceptorProvider.get());
    }
}

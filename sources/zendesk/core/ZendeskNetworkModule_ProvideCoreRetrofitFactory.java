package zendesk.core;

import ck0.C21268s;
import com.google.gson.Gson;
import hi0.C23566v;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskNetworkModule_ProvideCoreRetrofitFactory implements C23588c<C21268s> {
    private final C25292a<ApplicationConfiguration> configurationProvider;
    private final C25292a<Gson> gsonProvider;
    private final C25292a<C23566v> okHttpClientProvider;

    public ZendeskNetworkModule_ProvideCoreRetrofitFactory(C25292a<ApplicationConfiguration> aVar, C25292a<Gson> aVar2, C25292a<C23566v> aVar3) {
        this.configurationProvider = aVar;
        this.gsonProvider = aVar2;
        this.okHttpClientProvider = aVar3;
    }

    public static ZendeskNetworkModule_ProvideCoreRetrofitFactory create(C25292a<ApplicationConfiguration> aVar, C25292a<Gson> aVar2, C25292a<C23566v> aVar3) {
        return new ZendeskNetworkModule_ProvideCoreRetrofitFactory(aVar, aVar2, aVar3);
    }

    public static C21268s provideCoreRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, C23566v vVar) {
        C21268s provideCoreRetrofit = ZendeskNetworkModule.provideCoreRetrofit(applicationConfiguration, gson, vVar);
        C13641g.m34117e(provideCoreRetrofit);
        return provideCoreRetrofit;
    }

    public C21268s get() {
        return provideCoreRetrofit(this.configurationProvider.get(), this.gsonProvider.get(), this.okHttpClientProvider.get());
    }
}

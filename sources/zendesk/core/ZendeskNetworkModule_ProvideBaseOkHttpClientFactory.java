package zendesk.core;

import hi0.C23566v;
import ie0.C23588c;
import java.util.concurrent.ExecutorService;
import okhttp3.logging.HttpLoggingInterceptor;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskNetworkModule_ProvideBaseOkHttpClientFactory implements C23588c<C23566v> {
    private final C25292a<ExecutorService> executorServiceProvider;
    private final C25292a<HttpLoggingInterceptor> loggingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final C25292a<ZendeskOauthIdHeaderInterceptor> oauthIdHeaderInterceptorProvider;
    private final C25292a<UserAgentAndClientHeadersInterceptor> userAgentAndClientHeadersInterceptorProvider;

    public ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, C25292a<HttpLoggingInterceptor> aVar, C25292a<ZendeskOauthIdHeaderInterceptor> aVar2, C25292a<UserAgentAndClientHeadersInterceptor> aVar3, C25292a<ExecutorService> aVar4) {
        this.module = zendeskNetworkModule;
        this.loggingInterceptorProvider = aVar;
        this.oauthIdHeaderInterceptorProvider = aVar2;
        this.userAgentAndClientHeadersInterceptorProvider = aVar3;
        this.executorServiceProvider = aVar4;
    }

    public static ZendeskNetworkModule_ProvideBaseOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, C25292a<HttpLoggingInterceptor> aVar, C25292a<ZendeskOauthIdHeaderInterceptor> aVar2, C25292a<UserAgentAndClientHeadersInterceptor> aVar3, C25292a<ExecutorService> aVar4) {
        return new ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(zendeskNetworkModule, aVar, aVar2, aVar3, aVar4);
    }

    public static C23566v provideBaseOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, HttpLoggingInterceptor httpLoggingInterceptor, Object obj, Object obj2, ExecutorService executorService) {
        C23566v provideBaseOkHttpClient = zendeskNetworkModule.provideBaseOkHttpClient(httpLoggingInterceptor, (ZendeskOauthIdHeaderInterceptor) obj, (UserAgentAndClientHeadersInterceptor) obj2, executorService);
        C13641g.m34117e(provideBaseOkHttpClient);
        return provideBaseOkHttpClient;
    }

    public C23566v get() {
        return provideBaseOkHttpClient(this.module, this.loggingInterceptorProvider.get(), this.oauthIdHeaderInterceptorProvider.get(), this.userAgentAndClientHeadersInterceptorProvider.get(), this.executorServiceProvider.get());
    }
}

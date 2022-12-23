package zendesk.core;

import ie0.C23588c;
import okhttp3.logging.HttpLoggingInterceptor;
import p389bl.C13641g;

public final class ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory implements C23588c<HttpLoggingInterceptor> {
    private static final ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory INSTANCE = new ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory();

    public static ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory create() {
        return INSTANCE;
    }

    public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor provideHttpLoggingInterceptor = ZendeskApplicationModule.provideHttpLoggingInterceptor();
        C13641g.m34117e(provideHttpLoggingInterceptor);
        return provideHttpLoggingInterceptor;
    }

    public HttpLoggingInterceptor get() {
        return provideHttpLoggingInterceptor();
    }
}

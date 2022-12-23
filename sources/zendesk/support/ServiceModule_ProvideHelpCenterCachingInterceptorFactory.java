package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;

public final class ServiceModule_ProvideHelpCenterCachingInterceptorFactory implements C23588c<HelpCenterCachingInterceptor> {
    private static final ServiceModule_ProvideHelpCenterCachingInterceptorFactory INSTANCE = new ServiceModule_ProvideHelpCenterCachingInterceptorFactory();

    public static ServiceModule_ProvideHelpCenterCachingInterceptorFactory create() {
        return INSTANCE;
    }

    public static HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor() {
        HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor = ServiceModule.provideHelpCenterCachingInterceptor();
        C13641g.m34117e(provideHelpCenterCachingInterceptor);
        return provideHelpCenterCachingInterceptor;
    }

    public HelpCenterCachingInterceptor get() {
        return provideHelpCenterCachingInterceptor();
    }
}

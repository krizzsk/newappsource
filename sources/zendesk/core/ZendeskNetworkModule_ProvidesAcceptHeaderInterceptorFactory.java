package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;

public final class ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory implements C23588c<AcceptHeaderInterceptor> {
    private static final ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory INSTANCE = new ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory();

    public static ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory create() {
        return INSTANCE;
    }

    public static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        AcceptHeaderInterceptor providesAcceptHeaderInterceptor = ZendeskNetworkModule.providesAcceptHeaderInterceptor();
        C13641g.m34117e(providesAcceptHeaderInterceptor);
        return providesAcceptHeaderInterceptor;
    }

    public AcceptHeaderInterceptor get() {
        return providesAcceptHeaderInterceptor();
    }
}

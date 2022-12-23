package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;

public final class ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory implements C23588c<UserAgentAndClientHeadersInterceptor> {
    private final ZendeskNetworkModule module;

    public ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(ZendeskNetworkModule zendeskNetworkModule) {
        this.module = zendeskNetworkModule;
    }

    public static ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory create(ZendeskNetworkModule zendeskNetworkModule) {
        return new ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(zendeskNetworkModule);
    }

    public static UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor(ZendeskNetworkModule zendeskNetworkModule) {
        UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor = zendeskNetworkModule.providesUserAgentHeaderInterceptor();
        C13641g.m34117e(providesUserAgentHeaderInterceptor);
        return providesUserAgentHeaderInterceptor;
    }

    public UserAgentAndClientHeadersInterceptor get() {
        return providesUserAgentHeaderInterceptor(this.module);
    }
}

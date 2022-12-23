package zendesk.support;

import hi0.C23566v;
import zendesk.core.CustomNetworkConfig;

class HelpCenterCachingNetworkConfig extends CustomNetworkConfig {
    private HelpCenterCachingInterceptor interceptor;

    public HelpCenterCachingNetworkConfig(HelpCenterCachingInterceptor helpCenterCachingInterceptor) {
        this.interceptor = helpCenterCachingInterceptor;
    }

    public void configureOkHttpClient(C23566v.C23568b bVar) {
        HelpCenterCachingInterceptor helpCenterCachingInterceptor = this.interceptor;
        if (helpCenterCachingInterceptor != null) {
            bVar.f59607f.add(helpCenterCachingInterceptor);
        } else {
            bVar.getClass();
            throw new IllegalArgumentException("interceptor == null");
        }
    }
}

package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskNetworkModule_ProvidePushInterceptorFactory implements C23588c<ZendeskPushInterceptor> {
    private final C25292a<PushDeviceIdStorage> pushDeviceIdStorageProvider;
    private final C25292a<PushRegistrationProviderInternal> pushProvider;

    public ZendeskNetworkModule_ProvidePushInterceptorFactory(C25292a<PushRegistrationProviderInternal> aVar, C25292a<PushDeviceIdStorage> aVar2) {
        this.pushProvider = aVar;
        this.pushDeviceIdStorageProvider = aVar2;
    }

    public static ZendeskNetworkModule_ProvidePushInterceptorFactory create(C25292a<PushRegistrationProviderInternal> aVar, C25292a<PushDeviceIdStorage> aVar2) {
        return new ZendeskNetworkModule_ProvidePushInterceptorFactory(aVar, aVar2);
    }

    public static ZendeskPushInterceptor providePushInterceptor(Object obj, Object obj2) {
        ZendeskPushInterceptor providePushInterceptor = ZendeskNetworkModule.providePushInterceptor((PushRegistrationProviderInternal) obj, (PushDeviceIdStorage) obj2);
        C13641g.m34117e(providePushInterceptor);
        return providePushInterceptor;
    }

    public ZendeskPushInterceptor get() {
        return providePushInterceptor(this.pushProvider.get(), this.pushDeviceIdStorageProvider.get());
    }
}

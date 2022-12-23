package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ServiceModule_ProvideZendeskRequestServiceFactory implements C23588c<ZendeskRequestService> {
    private final C25292a<RequestService> requestServiceProvider;

    public ServiceModule_ProvideZendeskRequestServiceFactory(C25292a<RequestService> aVar) {
        this.requestServiceProvider = aVar;
    }

    public static ServiceModule_ProvideZendeskRequestServiceFactory create(C25292a<RequestService> aVar) {
        return new ServiceModule_ProvideZendeskRequestServiceFactory(aVar);
    }

    public static ZendeskRequestService provideZendeskRequestService(Object obj) {
        ZendeskRequestService provideZendeskRequestService = ServiceModule.provideZendeskRequestService((RequestService) obj);
        C13641g.m34117e(provideZendeskRequestService);
        return provideZendeskRequestService;
    }

    public ZendeskRequestService get() {
        return provideZendeskRequestService(this.requestServiceProvider.get());
    }
}

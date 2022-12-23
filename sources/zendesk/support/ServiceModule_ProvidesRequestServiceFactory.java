package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;
import zendesk.core.RestServiceProvider;

public final class ServiceModule_ProvidesRequestServiceFactory implements C23588c<RequestService> {
    private final C25292a<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesRequestServiceFactory(C25292a<RestServiceProvider> aVar) {
        this.restServiceProvider = aVar;
    }

    public static ServiceModule_ProvidesRequestServiceFactory create(C25292a<RestServiceProvider> aVar) {
        return new ServiceModule_ProvidesRequestServiceFactory(aVar);
    }

    public static RequestService providesRequestService(RestServiceProvider restServiceProvider2) {
        RequestService providesRequestService = ServiceModule.providesRequestService(restServiceProvider2);
        C13641g.m34117e(providesRequestService);
        return providesRequestService;
    }

    public RequestService get() {
        return providesRequestService(this.restServiceProvider.get());
    }
}

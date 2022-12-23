package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;
import zendesk.core.RestServiceProvider;

public final class ServiceModule_ProvidesUploadServiceFactory implements C23588c<UploadService> {
    private final C25292a<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesUploadServiceFactory(C25292a<RestServiceProvider> aVar) {
        this.restServiceProvider = aVar;
    }

    public static ServiceModule_ProvidesUploadServiceFactory create(C25292a<RestServiceProvider> aVar) {
        return new ServiceModule_ProvidesUploadServiceFactory(aVar);
    }

    public static UploadService providesUploadService(RestServiceProvider restServiceProvider2) {
        UploadService providesUploadService = ServiceModule.providesUploadService(restServiceProvider2);
        C13641g.m34117e(providesUploadService);
        return providesUploadService;
    }

    public UploadService get() {
        return providesUploadService(this.restServiceProvider.get());
    }
}

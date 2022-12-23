package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ServiceModule_ProvideZendeskUploadServiceFactory implements C23588c<ZendeskUploadService> {
    private final C25292a<UploadService> uploadServiceProvider;

    public ServiceModule_ProvideZendeskUploadServiceFactory(C25292a<UploadService> aVar) {
        this.uploadServiceProvider = aVar;
    }

    public static ServiceModule_ProvideZendeskUploadServiceFactory create(C25292a<UploadService> aVar) {
        return new ServiceModule_ProvideZendeskUploadServiceFactory(aVar);
    }

    public static ZendeskUploadService provideZendeskUploadService(Object obj) {
        ZendeskUploadService provideZendeskUploadService = ServiceModule.provideZendeskUploadService((UploadService) obj);
        C13641g.m34117e(provideZendeskUploadService);
        return provideZendeskUploadService;
    }

    public ZendeskUploadService get() {
        return provideZendeskUploadService(this.uploadServiceProvider.get());
    }
}

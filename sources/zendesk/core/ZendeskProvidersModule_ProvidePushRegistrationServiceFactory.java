package zendesk.core;

import ck0.C21268s;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProvidePushRegistrationServiceFactory implements C23588c<PushRegistrationService> {
    private final C25292a<C21268s> retrofitProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(C25292a<C21268s> aVar) {
        this.retrofitProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationServiceFactory create(C25292a<C21268s> aVar) {
        return new ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(aVar);
    }

    public static PushRegistrationService providePushRegistrationService(C21268s sVar) {
        PushRegistrationService providePushRegistrationService = ZendeskProvidersModule.providePushRegistrationService(sVar);
        C13641g.m34117e(providePushRegistrationService);
        return providePushRegistrationService;
    }

    public PushRegistrationService get() {
        return providePushRegistrationService(this.retrofitProvider.get());
    }
}

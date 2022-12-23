package zendesk.core;

import hi0.C23529c0;
import hi0.C23560s;
import java.io.IOException;
import li0.C24319f;

class ZendeskPushInterceptor implements C23560s {
    private final PushDeviceIdStorage pushDeviceIdStorage;
    private final PushRegistrationProviderInternal pushProvider;

    public ZendeskPushInterceptor(PushRegistrationProviderInternal pushRegistrationProviderInternal, PushDeviceIdStorage pushDeviceIdStorage2) {
        this.pushProvider = pushRegistrationProviderInternal;
        this.pushDeviceIdStorage = pushDeviceIdStorage2;
    }

    public C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        C23529c0 a = ((C24319f) aVar).mo60464a(((C24319f) aVar).f61618e);
        PushRegistrationRequest pushRegistrationRequest = this.pushDeviceIdStorage.getPushRegistrationRequest();
        if (pushRegistrationRequest != null) {
            this.pushProvider.sendPushRegistrationRequest(pushRegistrationRequest);
        }
        return a;
    }
}

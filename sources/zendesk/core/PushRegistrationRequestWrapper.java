package zendesk.core;

import p384bg.C13622c;

class PushRegistrationRequestWrapper {
    @C13622c("push_notification_device")
    private PushRegistrationRequest pushRegistrationRequest;

    public PushRegistrationRequestWrapper(PushRegistrationRequest pushRegistrationRequest2) {
        this.pushRegistrationRequest = pushRegistrationRequest2;
    }

    public PushRegistrationRequest getPushRegistrationRequest() {
        return this.pushRegistrationRequest;
    }
}

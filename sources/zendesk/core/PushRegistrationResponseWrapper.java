package zendesk.core;

import p384bg.C13622c;

class PushRegistrationResponseWrapper {
    @C13622c("push_notification_device")
    private PushRegistrationResponse registrationResponse;

    public PushRegistrationResponse getRegistrationResponse() {
        return this.registrationResponse;
    }
}

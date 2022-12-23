package zendesk.core;

import ck0.C21226b;
import ek0.C23317a;
import ek0.C23318b;
import ek0.C23331o;
import ek0.C23335s;

interface PushRegistrationService {
    @C23331o("/api/mobile/push_notification_devices.json")
    C21226b<PushRegistrationResponseWrapper> registerDevice(@C23317a PushRegistrationRequestWrapper pushRegistrationRequestWrapper);

    @C23318b("/api/mobile/push_notification_devices/{id}.json")
    C21226b<Void> unregisterDevice(@C23335s("id") String str);
}

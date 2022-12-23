package zendesk.core;

interface PushDeviceIdStorage {
    PushRegistrationRequest getPushRegistrationRequest();

    String getRegisteredDeviceId();

    void removePushRegistrationRequest();

    void removeRegisteredDeviceId();

    void storeRegisteredDeviceId(String str);
}

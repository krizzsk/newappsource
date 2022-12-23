package zendesk.core;

class ZendeskPushDeviceIdStorage implements PushDeviceIdStorage {
    private final BaseStorage deviceIdStorage;

    public ZendeskPushDeviceIdStorage(BaseStorage baseStorage) {
        this.deviceIdStorage = baseStorage;
    }

    public PushRegistrationRequest getPushRegistrationRequest() {
        return (PushRegistrationRequest) this.deviceIdStorage.get("pushRegistrationRequest", PushRegistrationRequest.class);
    }

    public String getRegisteredDeviceId() {
        return this.deviceIdStorage.get("pushDeviceIdentifier");
    }

    public void removePushRegistrationRequest() {
        this.deviceIdStorage.remove("pushRegistrationRequest");
    }

    public void removeRegisteredDeviceId() {
        this.deviceIdStorage.remove("pushDeviceIdentifier");
    }

    public void storeRegisteredDeviceId(String str) {
        if (str != null) {
            this.deviceIdStorage.put("pushDeviceIdentifier", str);
        }
    }
}

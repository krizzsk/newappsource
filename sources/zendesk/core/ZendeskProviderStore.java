package zendesk.core;

class ZendeskProviderStore implements ProviderStore {
    private final PushRegistrationProvider pushRegistrationProvider;
    private final UserProvider userProvider;

    public ZendeskProviderStore(UserProvider userProvider2, PushRegistrationProvider pushRegistrationProvider2) {
        this.userProvider = userProvider2;
        this.pushRegistrationProvider = pushRegistrationProvider2;
    }
}

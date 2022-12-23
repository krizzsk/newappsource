package zendesk.core;

import ck0.C21267r;
import com.zendesk.logger.Logger;
import fe0.C23342b;
import fe0.C23345c;
import ge0.C23410c;
import java.io.IOException;
import java.util.Locale;

class ZendeskPushRegistrationProvider implements PushRegistrationProvider, PushRegistrationProviderInternal {
    /* access modifiers changed from: private */
    public final BlipsCoreProvider blipsProvider;
    private final IdentityManager identityManager;
    /* access modifiers changed from: private */
    public final PushDeviceIdStorage pushIdStorage;
    private final PushRegistrationService pushService;
    private final SettingsProvider settingsProvider;

    static {
        new C23342b.C23344b<PushRegistrationResponseWrapper, String>() {
            public String extract(PushRegistrationResponseWrapper pushRegistrationResponseWrapper) {
                return (pushRegistrationResponseWrapper == null || pushRegistrationResponseWrapper.getRegistrationResponse() == null || !C23410c.m57533a(pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier())) ? "" : pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier();
            }
        };
    }

    public ZendeskPushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager2, SettingsProvider settingsProvider2, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, Locale locale) {
        this.pushService = pushRegistrationService;
        this.identityManager = identityManager2;
        this.settingsProvider = settingsProvider2;
        this.blipsProvider = blipsCoreProvider;
        this.pushIdStorage = pushDeviceIdStorage;
    }

    private void onSuccessfulRegistration(String str) {
        this.pushIdStorage.storeRegisteredDeviceId(str);
        this.pushIdStorage.removePushRegistrationRequest();
        this.blipsProvider.corePushEnabled();
    }

    public String sendPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest) {
        try {
            C21267r<PushRegistrationResponseWrapper> C = this.pushService.registerDevice(new PushRegistrationRequestWrapper(pushRegistrationRequest)).mo53584C();
            T t = C.f53230b;
            if (t == null || ((PushRegistrationResponseWrapper) t).getRegistrationResponse() == null) {
                return "";
            }
            String identifier = ((PushRegistrationResponseWrapper) C.f53230b).getRegistrationResponse().getIdentifier();
            onSuccessfulRegistration(identifier);
            return identifier;
        } catch (IOException unused) {
            Logger.m57304c("Push registration request failed.", new Object[0]);
            return "";
        }
    }

    public void unregisterDevice(final C23345c<Void> cVar) {
        String registeredDeviceId = this.pushIdStorage.getRegisteredDeviceId();
        final Long userId = this.identityManager.getUserId();
        if (registeredDeviceId != null) {
            this.pushService.unregisterDevice(registeredDeviceId).mo53585K0(new C23342b(new PassThroughErrorZendeskCallback<Void>(cVar) {
                public void onSuccess(Void voidR) {
                    ZendeskPushRegistrationProvider.this.pushIdStorage.removeRegisteredDeviceId();
                    ZendeskPushRegistrationProvider.this.blipsProvider.corePushDisabled(userId);
                    C23345c cVar = cVar;
                    if (cVar != null) {
                        cVar.onSuccess(voidR);
                    }
                }
            }));
        }
    }
}

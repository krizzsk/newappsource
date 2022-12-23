package zendesk.core;

import com.appsflyer.ServerParameters;
import com.zendesk.logger.Logger;
import fe0.C23341a;
import fe0.C23342b;
import fe0.C23345c;
import ge0.C23410c;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p001a0.C0016g;

class ZendeskBlipsProvider implements BlipsProvider, BlipsCoreProvider {
    private final String appId;
    /* access modifiers changed from: private */
    public final BlipsService blipsService;
    private final CoreSettingsStorage coreSettingsStorage;
    private final DeviceInfo deviceInfo;
    private final Executor executor;
    private final IdentityManager identityManager;
    /* access modifiers changed from: private */
    public final Serializer serializer;

    public ZendeskBlipsProvider(BlipsService blipsService2, DeviceInfo deviceInfo2, Serializer serializer2, IdentityManager identityManager2, String str, CoreSettingsStorage coreSettingsStorage2, Executor executor2) {
        this.blipsService = blipsService2;
        this.deviceInfo = deviceInfo2;
        this.serializer = serializer2;
        this.identityManager = identityManager2;
        this.appId = str;
        this.coreSettingsStorage = coreSettingsStorage2;
        this.executor = executor2;
    }

    private Map<String, Object> addDeviceInfoToValue(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(ServerParameters.DEVICE_KEY, this.deviceInfo.getInfo());
        if (map != null && !map.isEmpty()) {
            hashMap.put("payload", map);
        }
        return hashMap;
    }

    public void coreInitialized() {
        sendBlip(new UserAction("3.0.3", "core_sdk", "CoreSDK", "init", (String) null, C0016g.m37u("code", "java")), BlipsGroup.REQUIRED);
    }

    public void corePushDisabled(Long l) {
        sendBlip(BlipsGroup.REQUIRED, new UserAction("3.0.3", "core_sdk", "CoreSDK", "PushOff"), l);
    }

    public void corePushEnabled() {
        sendBlip(new UserAction("3.0.3", "core_sdk", "CoreSDK", "PushOn"), BlipsGroup.REQUIRED);
    }

    public BlipsRequest createBlipsRequest(UserAction userAction, String str, String str2, Long l) {
        return BlipsRequest.buildUserAction(str, BlipsFormatHelper.nowAsString(new Date()), l, str2, userAction.getVersion(), userAction.getChannel(), userAction.getCategory(), userAction.getAction(), userAction.getLabel(), addDeviceInfoToValue(userAction.getValue()));
    }

    public void dispatchBlip(final BlipsRequest blipsRequest) {
        this.executor.execute(new Runnable() {
            public void run() {
                ZendeskBlipsProvider.this.blipsService.send(ZendeskBlipsProvider.this.serializer.serialize(blipsRequest)).mo53585K0(new C23342b(new C23345c<Void>(this) {
                    public void onError(C23341a aVar) {
                        Logger.m57302a("Unable to send Blip | Error: %s", aVar.mo2080b());
                    }

                    public void onSuccess(Void voidR) {
                    }
                }));
            }
        });
    }

    public void sendBlip(UserAction userAction, BlipsGroup blipsGroup) {
        sendBlip(blipsGroup, userAction, this.identityManager.getUserId());
    }

    public void sendBlip(BlipsGroup blipsGroup, UserAction userAction, Long l) {
        if (this.coreSettingsStorage.getBlipsSettings().getBlipsPermissions().isEnabled(blipsGroup) && C23410c.m57533a(userAction.getChannel())) {
            dispatchBlip(createBlipsRequest(userAction, this.identityManager.getBlipsUuid(), this.appId, l));
        }
    }

    public BlipsRequest createBlipsRequest(PageView pageView, String str, String str2, Long l) {
        return BlipsRequest.buildPageView(str, BlipsFormatHelper.nowAsString(new Date()), l, str2, pageView.getVersion(), pageView.getChannel(), pageView.getUrl(), pageView.getNavigatorLanguage(), pageView.getPageTitle(), addDeviceInfoToValue(pageView.getValue()));
    }

    public void sendBlip(PageView pageView, BlipsGroup blipsGroup) {
        if (this.coreSettingsStorage.getBlipsSettings().getBlipsPermissions().isEnabled(blipsGroup) && C23410c.m57533a(pageView.getChannel())) {
            dispatchBlip(createBlipsRequest(pageView, this.identityManager.getBlipsUuid(), this.appId, this.identityManager.getUserId()));
        }
    }
}

package zendesk.core;

import android.content.Context;
import ck0.C21267r;
import com.zendesk.logger.Logger;
import fe0.C23341a;
import fe0.C23342b;
import fe0.C23345c;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p359ag.C13450g;

class ZendeskSettingsProvider implements SettingsProvider, SdkSettingsProviderInternal {
    /* access modifiers changed from: private */
    public final ActionHandlerRegistry actionHandlerRegistry;
    private final String applicationId;
    private final Context context;
    /* access modifiers changed from: private */
    public final CoreSettingsStorage coreSettingsStorage;
    /* access modifiers changed from: private */
    public final Serializer serializer;
    private final SdkSettingsService settingsService;
    /* access modifiers changed from: private */
    public final SettingsStorage settingsStorage;
    private final ZendeskLocaleConverter zendeskLocaleConverter;

    public ZendeskSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage2, CoreSettingsStorage coreSettingsStorage2, ActionHandlerRegistry actionHandlerRegistry2, Serializer serializer2, ZendeskLocaleConverter zendeskLocaleConverter2, String str, Context context2) {
        this.settingsService = sdkSettingsService;
        this.settingsStorage = settingsStorage2;
        this.coreSettingsStorage = coreSettingsStorage2;
        this.actionHandlerRegistry = actionHandlerRegistry2;
        this.serializer = serializer2;
        this.zendeskLocaleConverter = zendeskLocaleConverter2;
        this.applicationId = str;
        this.context = context2;
    }

    private void getSettingsInternal(Locale locale, C23345c<Map<String, C13450g>> cVar) {
        this.settingsService.getSettings(this.zendeskLocaleConverter.toHelpCenterLocaleString(locale), this.applicationId).mo53585K0(new C23342b(cVar));
    }

    public CoreSettings extractCoreSettings(Map<String, C13450g> map) {
        C13450g gVar;
        if (map == null) {
            gVar = null;
        } else {
            gVar = map.get("core");
        }
        CoreSettings coreSettings = (CoreSettings) this.serializer.deserialize(gVar, CoreSettings.class);
        if (coreSettings != null) {
            return coreSettings;
        }
        return ZendeskCoreSettingsStorage.DEFAULT_CORE_SETTINGS;
    }

    public CoreSettings getCoreSettings() {
        if (this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            return this.coreSettingsStorage.getCoreSettings();
        }
        Map<String, C13450g> settingsInternal = getSettingsInternal(DeviceInfo.getCurrentLocale(this.context));
        if (settingsInternal.isEmpty()) {
            return new CoreSettings(new Date(0), (AuthenticationType) null);
        }
        this.actionHandlerRegistry.updateSettings(settingsInternal);
        this.settingsStorage.storeRawSettings(settingsInternal);
        return extractCoreSettings(settingsInternal);
    }

    public <E extends Settings> void getSettingsForSdk(final String str, final Class<E> cls, final C23345c<SettingsPack<E>> cVar) {
        if (!this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new C23345c<Map<String, C13450g>>() {
                public void onError(C23341a aVar) {
                    if (cVar != null) {
                        if (ZendeskSettingsProvider.this.settingsStorage.hasStoredSettings()) {
                            cVar.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings(), (Settings) ZendeskSettingsProvider.this.settingsStorage.getSettings(str, cls)));
                            return;
                        }
                        cVar.onError(aVar);
                    }
                }

                public void onSuccess(Map<String, C13450g> map) {
                    ZendeskSettingsProvider.this.actionHandlerRegistry.updateSettings(map);
                    ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                    if (cVar != null) {
                        cVar.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.extractCoreSettings(map), (Settings) ZendeskSettingsProvider.this.serializer.deserialize(map.get(str), cls)));
                    }
                }
            });
        } else if (cVar != null) {
            cVar.onSuccess(new SettingsPack(this.coreSettingsStorage.getCoreSettings(), (Settings) this.settingsStorage.getSettings(str, cls)));
        }
    }

    private Map<String, C13450g> getSettingsInternal(Locale locale) {
        try {
            C21267r<Map<String, C13450g>> C = this.settingsService.getSettings(this.zendeskLocaleConverter.toHelpCenterLocaleString(locale), this.applicationId).mo53584C();
            if (C.f53230b != null) {
                return new HashMap((Map) C.f53230b);
            }
            return new HashMap(0);
        } catch (IOException unused) {
            Logger.m57303b("Settings retrieval failed, returning empty map.", new Object[0]);
            return new HashMap(0);
        }
    }
}

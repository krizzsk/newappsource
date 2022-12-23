package zendesk.support;

import com.zendesk.logger.Logger;
import fe0.C23341a;
import fe0.C23345c;
import java.util.Locale;
import zendesk.core.AuthenticationType;
import zendesk.core.SettingsPack;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

class ZendeskSupportSettingsProvider implements SupportSettingsProvider {
    private static final String HELP_CENTER_KEY = "help_center";
    private static final String LOG_TAG = "ZendeskSettingsProvider";
    private static final String SUPPORT_KEY = "support";
    private final Locale deviceLocale;
    private final ZendeskLocaleConverter localeConverter;
    /* access modifiers changed from: private */
    public final SettingsProvider sdkSettingsProvider;

    public class LoadHelpCenterSettings extends C23345c<SettingsPack<HelpCenterSettings>> {
        private final C23345c<SupportSdkSettings> callback;
        private final SettingsPack<SupportSettings> supportSettingsPack;

        public LoadHelpCenterSettings(C23345c<SupportSdkSettings> cVar, SettingsPack<SupportSettings> settingsPack) {
            this.callback = cVar;
            this.supportSettingsPack = settingsPack;
        }

        public void onError(C23341a aVar) {
            if (this.callback != null) {
                Logger.m57302a("Returning default Help Center Settings.", new Object[0]);
                this.callback.onSuccess(new SupportSdkSettings(this.supportSettingsPack.getSettings(), HelpCenterSettings.defaultSettings(), this.supportSettingsPack.getCoreSettings().getAuthentication()));
            }
        }

        public void onSuccess(SettingsPack<HelpCenterSettings> settingsPack) {
            HelpCenterSettings settings = settingsPack.getSettings();
            AuthenticationType authentication = settingsPack.getCoreSettings().getAuthentication();
            ZendeskSupportSettingsProvider.this.logIfLocaleNotAvailable(settings);
            Logger.m57302a("Successfully retrieved Settings", new Object[0]);
            C23345c<SupportSdkSettings> cVar = this.callback;
            if (cVar != null) {
                cVar.onSuccess(new SupportSdkSettings(this.supportSettingsPack.getSettings(), settings, authentication));
            }
        }
    }

    public class LoadSupportSettings extends C23345c<SettingsPack<SupportSettings>> {
        private final C23345c<SupportSdkSettings> callback;

        public LoadSupportSettings(C23345c<SupportSdkSettings> cVar) {
            this.callback = cVar;
        }

        public void onError(C23341a aVar) {
            if (this.callback != null) {
                Logger.m57302a("Returning default Support Settings.", new Object[0]);
                this.callback.onSuccess(new SupportSdkSettings(SupportSettings.defaultSettings(), HelpCenterSettings.defaultSettings(), (AuthenticationType) null));
            }
        }

        public void onSuccess(SettingsPack<SupportSettings> settingsPack) {
            ZendeskSupportSettingsProvider.this.sdkSettingsProvider.getSettingsForSdk(ZendeskSupportSettingsProvider.HELP_CENTER_KEY, HelpCenterSettings.class, new LoadHelpCenterSettings(this.callback, settingsPack));
        }
    }

    public ZendeskSupportSettingsProvider(SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        this.sdkSettingsProvider = settingsProvider;
        this.localeConverter = zendeskLocaleConverter;
        this.deviceLocale = locale;
    }

    /* access modifiers changed from: private */
    public void logIfLocaleNotAvailable(HelpCenterSettings helpCenterSettings) {
        if (helpCenterSettings != null && helpCenterSettings.getLocale() != null) {
            String locale = helpCenterSettings.getLocale();
            String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(this.deviceLocale);
            if (!helpCenterLocaleString.equals(locale)) {
                Logger.m57306e("No support for %s, Help Center is %s in your application settings", helpCenterLocaleString, Boolean.valueOf(helpCenterSettings.isEnabled()));
            }
        }
    }

    public void getSettings(C23345c<SupportSdkSettings> cVar) {
        this.sdkSettingsProvider.getSettingsForSdk(SUPPORT_KEY, SupportSettings.class, new LoadSupportSettings(cVar));
    }
}

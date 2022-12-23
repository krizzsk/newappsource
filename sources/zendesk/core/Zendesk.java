package zendesk.core;

import android.content.Context;
import com.zendesk.logger.Logger;
import ge0.C23410c;
import java.util.HashMap;

public enum Zendesk {
    INSTANCE;
    
    private static final String LOG_TAG = "Zendesk";
    private ActionHandlerRegistry actionHandlerRegistry;
    private ZendeskShadow zendeskShadow;

    public static boolean checkConfig(Context context, String str, String str2, String str3) {
        boolean z;
        if (context != null) {
            String[] strArr = {str, str2, str3};
            HashMap hashMap = C23410c.f59193a;
            int i = 0;
            while (true) {
                if (i >= 3) {
                    z = true;
                    break;
                } else if (C23410c.m57534b(strArr[i])) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return true;
            }
        }
        Logger.m57303b(String.format("Invalid zendesk configuration provided | Context: %b | Url: %b | Application Id: %b | OauthClientId: %b", new Object[]{context, Boolean.valueOf(C23410c.m57533a(str)), Boolean.valueOf(C23410c.m57533a(str2)), Boolean.valueOf(C23410c.m57533a(str3))}), new Object[0]);
        return false;
    }

    public ActionHandlerRegistry actionHandlerRegistry() {
        return this.actionHandlerRegistry;
    }

    public CoreModule coreModule() {
        return this.zendeskShadow.coreModule();
    }

    public Identity getIdentity() {
        if (!isInitialized()) {
            return null;
        }
        return this.zendeskShadow.getIdentity();
    }

    public void init(Context context, String str, String str2, String str3) {
        checkConfig(context, str, str2, str3);
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration(str2, str, str3);
        init(DaggerZendeskApplicationComponent.builder().zendeskApplicationModule(new ZendeskApplicationModule(context, applicationConfiguration)).build(), applicationConfiguration);
    }

    public boolean isInitialized() {
        return this.zendeskShadow != null;
    }

    public ProviderStore provider() {
        if (!isInitialized()) {
            Logger.m57303b("Cannot get ProviderStore before SDK has been initialized. init() must be called before provider().", new Object[0]);
            return null;
        } else if (getIdentity() != null) {
            return this.zendeskShadow.providers();
        } else {
            Logger.m57303b("Cannot get ProviderStore before an identity has been set. Zendesk.INSTANCE.setIdentity() must be called before provider().", new Object[0]);
            return null;
        }
    }

    public void reset() {
        if (isInitialized()) {
            this.zendeskShadow.reset();
            this.zendeskShadow = null;
            Logger.C23262c cVar = Logger.f59014a;
            Logger.Priority priority = Logger.Priority.VERBOSE;
            Logger.m57305d("Tearing down Zendesk", new Object[0]);
            return;
        }
        Logger.C23262c cVar2 = Logger.f59014a;
        Logger.Priority priority2 = Logger.Priority.VERBOSE;
        Logger.m57305d("Cant reset, Zendesk is uninitialized", new Object[0]);
    }

    public void setIdentity(Identity identity) {
        if (!isInitialized()) {
            Logger.m57303b("Cannot get set identity before SDK has been initialized. init() must be called before setIdentity(...).", new Object[0]);
        } else {
            this.zendeskShadow.setIdentity(identity);
        }
    }

    public void init(ZendeskApplicationComponent zendeskApplicationComponent, ApplicationConfiguration applicationConfiguration) {
        ZendeskShadow zendeskShadow2 = this.zendeskShadow;
        boolean z = zendeskShadow2 != null;
        if (z) {
            zendeskShadow2.cleanupIfNewConfig(applicationConfiguration);
        }
        ZendeskShadow zendeskShadow3 = zendeskApplicationComponent.zendeskShadow();
        zendeskShadow3.init(applicationConfiguration, z);
        this.zendeskShadow = zendeskShadow3;
    }
}

package zendesk.core;

import com.google.android.gms.wallet.WalletConstants;
import com.zendesk.logger.Logger;
import hi0.C23529c0;
import hi0.C23560s;
import hi0.C23571x;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import li0.C24319f;
import okhttp3.Protocol;

class ZendeskSettingsInterceptor implements C23560s {
    private final SdkSettingsProviderInternal provider;
    private SettingsStorage settingsStorage;

    public ZendeskSettingsInterceptor(SdkSettingsProviderInternal sdkSettingsProviderInternal, SettingsStorage settingsStorage2) {
        this.provider = sdkSettingsProviderInternal;
        this.settingsStorage = settingsStorage2;
    }

    public C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        if (!this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            Logger.m57302a("Requesting SDK settings.", new Object[0]);
            if (this.provider.getCoreSettings() == null) {
                Logger.m57302a("Retrieved settings are null. Returning 404.", new Object[0]);
                C23529c0.C23530a aVar2 = new C23529c0.C23530a();
                aVar2.f59425b = Protocol.HTTP_2;
                C23571x xVar = ((C24319f) aVar).f61618e;
                aVar2.f59424a = xVar;
                aVar2.f59427d = xVar.f59637b;
                aVar2.f59426c = WalletConstants.ERROR_CODE_INVALID_PARAMETERS;
                return aVar2.mo58645a();
            }
        }
        Logger.m57302a("Proceeding with chain.", new Object[0]);
        C24319f fVar = (C24319f) aVar;
        return fVar.mo60464a(fVar.f61618e);
    }
}

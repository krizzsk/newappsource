package zendesk.core;

import com.zendesk.logger.Logger;
import hi0.C23529c0;
import hi0.C23536e0;
import hi0.C23560s;
import hi0.C23562t;
import java.io.IOException;
import li0.C24319f;
import okhttp3.Protocol;
import p001a0.C0016g;

class ZendeskAccessInterceptor implements C23560s {
    private AccessProvider accessProvider;
    private CoreSettingsStorage coreSettingsStorage;
    private IdentityManager identityManager;
    private Storage storage;

    public ZendeskAccessInterceptor(IdentityManager identityManager2, AccessProvider accessProvider2, Storage storage2, CoreSettingsStorage coreSettingsStorage2) {
        this.identityManager = identityManager2;
        this.accessProvider = accessProvider2;
        this.storage = storage2;
        this.coreSettingsStorage = coreSettingsStorage2;
    }

    public static String getErrorLogMessage(AuthenticationType authenticationType, Identity identity) {
        StringBuilder r = C0016g.m34r(160, "The expected type of authentication is ");
        if (authenticationType == null) {
            r.append("null. Check that settings have been downloaded.");
        } else if (authenticationType == AuthenticationType.ANONYMOUS) {
            r.append("anonymous.");
        } else if (authenticationType == AuthenticationType.JWT) {
            r.append("jwt.");
        }
        r.append(10);
        r.append("The local identity is");
        if (identity == null) {
            r.append(" not");
        }
        r.append(" present.\n");
        if (identity != null) {
            r.append("The local identity is ");
            if (identity instanceof AnonymousIdentity) {
                r.append("anonymous.");
            } else if (identity instanceof JwtIdentity) {
                r.append("jwt.");
            } else {
                r.append("unknown.");
            }
        }
        return r.toString();
    }

    public C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        Identity identity = this.identityManager.getIdentity();
        if (this.identityManager.getStoredAccessTokenAsBearerToken() == null) {
            Logger.m57302a("Access token is required, intercepting.", new Object[0]);
            AuthenticationType authentication = this.coreSettingsStorage.getCoreSettings().getAuthentication();
            if (AuthenticationType.ANONYMOUS == authentication && (identity instanceof AnonymousIdentity)) {
                Logger.m57302a("Anonymous Identity found. Requesting and storing auth token.", new Object[0]);
                this.accessProvider.getAndStoreAuthTokenViaAnonymous((AnonymousIdentity) identity);
            } else if (AuthenticationType.JWT != authentication || !(identity instanceof JwtIdentity)) {
                this.storage.clear();
                String errorLogMessage = getErrorLogMessage(authentication, identity);
                Logger.m57303b(errorLogMessage, new Object[0]);
                C23529c0.C23530a aVar2 = new C23529c0.C23530a();
                aVar2.f59424a = ((C24319f) aVar).f61618e;
                aVar2.f59425b = Protocol.HTTP_2;
                aVar2.f59426c = 400;
                aVar2.f59427d = errorLogMessage;
                aVar2.f59430g = C23536e0.m57676r("{}", C23562t.m57743c("txt/json"));
                return aVar2.mo58645a();
            } else {
                Logger.m57302a("JWT Identity found. Requesting and storing auth token.", new Object[0]);
                this.accessProvider.getAndStoreAuthTokenViaJwt((JwtIdentity) identity);
            }
        } else {
            Logger.m57302a("Access token present, no need to intercept.", new Object[0]);
        }
        C24319f fVar = (C24319f) aVar;
        return fVar.mo60464a(fVar.f61618e);
    }
}

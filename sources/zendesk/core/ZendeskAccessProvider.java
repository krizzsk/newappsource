package zendesk.core;

import ck0.C21267r;
import com.zendesk.logger.Logger;
import ge0.C23410c;
import java.io.IOException;

class ZendeskAccessProvider implements AccessProvider {
    private final AccessService accessService;
    private final IdentityManager identityManager;

    public ZendeskAccessProvider(IdentityManager identityManager2, AccessService accessService2) {
        this.identityManager = identityManager2;
        this.accessService = accessService2;
    }

    private void storeAccessTokenAndUserId(AccessToken accessToken) {
        this.identityManager.storeAccessToken(accessToken);
    }

    public AccessToken getAndStoreAuthTokenViaAnonymous(AnonymousIdentity anonymousIdentity) {
        C21267r<AuthenticationResponse> rVar;
        T t;
        Logger.m57302a("Requesting an access token for anonymous identity.", new Object[0]);
        AccessToken accessToken = null;
        try {
            rVar = this.accessService.getAuthTokenForAnonymous(new AuthenticationRequestWrapper(new ApiAnonymousIdentity(anonymousIdentity, this.identityManager.getSdkGuid()))).mo53584C();
        } catch (IOException e) {
            Logger.m57304c(e.getMessage(), new Object[0]);
            rVar = null;
        }
        if (!(rVar == null || (t = rVar.f53230b) == null || (accessToken = ((AuthenticationResponse) t).getAuthentication()) == null)) {
            storeAccessTokenAndUserId(accessToken);
        }
        return accessToken;
    }

    public AccessToken getAndStoreAuthTokenViaJwt(JwtIdentity jwtIdentity) {
        C21267r<AuthenticationResponse> rVar;
        T t;
        Logger.m57302a("Requesting an access token for jwt identity.", new Object[0]);
        AccessToken accessToken = null;
        if (C23410c.m57534b(jwtIdentity.getJwtUserIdentifier())) {
            Logger.m57303b("The jwt user identifier is null or empty. We cannot proceed to get an access token", new Object[0]);
            return null;
        }
        try {
            rVar = this.accessService.getAuthTokenForJwt(new AuthenticationRequestWrapper(jwtIdentity)).mo53584C();
        } catch (IOException e) {
            Logger.m57304c(e.getMessage(), new Object[0]);
            rVar = null;
        }
        if (!(rVar == null || (t = rVar.f53230b) == null || (accessToken = ((AuthenticationResponse) t).getAuthentication()) == null)) {
            storeAccessTokenAndUserId(accessToken);
        }
        return accessToken;
    }
}

package zendesk.core;

import ck0.C21226b;
import ek0.C23317a;
import ek0.C23331o;

interface AccessService {
    @C23331o("/access/sdk/anonymous")
    C21226b<AuthenticationResponse> getAuthTokenForAnonymous(@C23317a AuthenticationRequestWrapper authenticationRequestWrapper);

    @C23331o("/access/sdk/jwt")
    C21226b<AuthenticationResponse> getAuthTokenForJwt(@C23317a AuthenticationRequestWrapper authenticationRequestWrapper);
}

package z90;

import c70.C13752e;
import c70.C13778r;
import com.facebook.AccessToken;
import com.tranzmate.moovit.protocol.externalregistration.MVSetFacebookTokenRequest;
import p824tp.C19746x;

/* renamed from: z90.f */
public final class C13348f extends C13778r<C13348f, C13349g, MVSetFacebookTokenRequest> {
    public C13348f(C13752e eVar, AccessToken accessToken) {
        super(eVar, C19746x.server_path_app_server_secured_url, C19746x.api_path_update_facebook_token_path, C13349g.class);
        RO mVSetFacebookTokenRequest = new MVSetFacebookTokenRequest();
        mVSetFacebookTokenRequest.facebookId = accessToken.f8359j;
        mVSetFacebookTokenRequest.token = accessToken.f8355f;
        mVSetFacebookTokenRequest.isFriendsCountAllowed = accessToken.f8352c.contains("user_friends");
        mVSetFacebookTokenRequest.mo27169k();
        mVSetFacebookTokenRequest.isEmailAllowed = accessToken.f8352c.contains("email");
        mVSetFacebookTokenRequest.mo27168j();
        this.f33922v = mVSetFacebookTokenRequest;
    }
}

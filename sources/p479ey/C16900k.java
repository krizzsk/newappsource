package p479ey;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.users.MVGetUserAccessTokenRequest;

/* renamed from: ey.k */
public final class C16900k extends C13778r<C16900k, C16901l, MVGetUserAccessTokenRequest> {
    public C16900k(C13752e eVar, String str, String str2) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_get_access_token_request, C16901l.class);
        RO mVGetUserAccessTokenRequest = new MVGetUserAccessTokenRequest();
        mVGetUserAccessTokenRequest.email = str;
        mVGetUserAccessTokenRequest.password = str2;
        this.f33922v = mVGetUserAccessTokenRequest;
    }
}

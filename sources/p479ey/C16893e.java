package p479ey;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.users.MVCreateUserAccessTokenRequest;

/* renamed from: ey.e */
public final class C16893e extends C13778r<C16893e, C16894f, MVCreateUserAccessTokenRequest> {
    public C16893e(C13752e eVar, String str, String str2, String str3) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_create_access_token_request, C16894f.class);
        RO mVCreateUserAccessTokenRequest = new MVCreateUserAccessTokenRequest();
        mVCreateUserAccessTokenRequest.name = str;
        mVCreateUserAccessTokenRequest.email = str2;
        mVCreateUserAccessTokenRequest.password = str3;
        this.f33922v = mVCreateUserAccessTokenRequest;
    }
}

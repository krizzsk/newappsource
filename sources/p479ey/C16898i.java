package p479ey;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.users.MVUserForgetPasswordRequest;

/* renamed from: ey.i */
public final class C16898i extends C13778r<C16898i, C16899j, MVUserForgetPasswordRequest> {
    public C16898i(C13752e eVar, String str) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_forget_password_request, C16899j.class);
        RO mVUserForgetPasswordRequest = new MVUserForgetPasswordRequest();
        mVUserForgetPasswordRequest.email = str;
        this.f33922v = mVUserForgetPasswordRequest;
    }
}

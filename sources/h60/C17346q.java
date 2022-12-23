package h60;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBExternalAccountInfoRequest;
import v40.C25754i;

/* renamed from: h60.q */
public final class C17346q extends C13778r<C17346q, C17349r, MVPTBExternalAccountInfoRequest> {
    public C17346q(C13752e eVar) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_get_mot_external_account_info, C17349r.class);
        RO mVPTBExternalAccountInfoRequest = new MVPTBExternalAccountInfoRequest();
        mVPTBExternalAccountInfoRequest.context = "IsraelMot";
        this.f33922v = mVPTBExternalAccountInfoRequest;
    }
}

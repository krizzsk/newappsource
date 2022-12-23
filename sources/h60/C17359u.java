package h60;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.payments.MVDeleteProfileRequest;
import java.util.ArrayList;
import java.util.List;
import p543hq.C17478e;
import v40.C25754i;

/* renamed from: h60.u */
public final class C17359u extends C13778r<C17359u, C17362v, MVDeleteProfileRequest> {
    public C17359u(C13752e eVar, List<ServerId> list) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_account_delete_profiles_request, C17362v.class);
        ArrayList<O> c = C13720d.m34273c(list, (C13722f) null, new C17478e(16));
        RO mVDeleteProfileRequest = new MVDeleteProfileRequest();
        mVDeleteProfileRequest.profiles = c;
        this.f33922v = mVDeleteProfileRequest;
    }
}

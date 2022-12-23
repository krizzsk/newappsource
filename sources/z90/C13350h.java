package z90;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.ridesharing.MVSetUserInfoRequest;
import p824tp.C19746x;

/* renamed from: z90.h */
public final class C13350h extends C13778r<C13350h, C13351i, MVSetUserInfoRequest> {
    public C13350h(C13752e eVar, String str, String str2, String str3) {
        super(eVar, C19746x.server_path_app_server_secured_url, C19746x.api_path_update_personal_details_path, C13351i.class);
        RO mVSetUserInfoRequest = new MVSetUserInfoRequest();
        if (str != null) {
            mVSetUserInfoRequest.firstName = str;
        }
        if (str2 != null) {
            mVSetUserInfoRequest.lastName = str2;
        }
        if (str3 != null) {
            mVSetUserInfoRequest.email = str3;
        }
        this.f33922v = mVSetUserInfoRequest;
    }
}

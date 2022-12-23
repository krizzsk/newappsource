package h60;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.view.address.Address;
import com.tranzmate.moovit.protocol.ridesharing.MVSetUserInfoRequest;
import p001a0.C0017h;
import v40.C25754i;

/* renamed from: h60.f1 */
public final class C17315f1 extends C13778r<C17315f1, C17318g1, MVSetUserInfoRequest> {

    /* renamed from: w */
    public final String f44699w;

    /* renamed from: x */
    public final String f44700x;

    public C17315f1(C13752e eVar, String str, String str2, String str3, String str4, Address address) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_update_personal_details_path, C17318g1.class);
        this.f44700x = str4;
        RO mVSetUserInfoRequest = new MVSetUserInfoRequest();
        if (str != null) {
            mVSetUserInfoRequest.paymentContext = str;
        }
        if (str2 != null) {
            mVSetUserInfoRequest.firstName = str2;
        }
        if (str3 != null) {
            mVSetUserInfoRequest.lastName = str3;
        }
        if (str4 != null) {
            mVSetUserInfoRequest.email = str4;
        }
        if (address != null) {
            mVSetUserInfoRequest.address = C13749c.m34338x(address);
        }
        this.f33922v = mVSetUserInfoRequest;
        StringBuilder sb = new StringBuilder();
        sb.append(C17315f1.class.getName());
        sb.append("_");
        sb.append(str);
        sb.append("_");
        C0017h.m61R(sb, str2, "_", str3, "_");
        sb.append(str4);
        sb.append("_");
        sb.append(address);
        this.f44699w = sb.toString();
    }
}

package z90;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.taxi.MVGenerateRegistrationRequest;
import p824tp.C19746x;

/* renamed from: z90.j */
public final class C13352j extends C13778r<C13352j, C13353k, MVGenerateRegistrationRequest> {

    /* renamed from: w */
    public final String f33137w;

    /* renamed from: x */
    public final String f33138x;

    public C13352j(C13752e eVar, String str, String str2) {
        super(eVar, C19746x.server_path_app_server_secured_url, C19746x.api_path_update_phone_number_path, C13353k.class);
        this.f33137w = str;
        C21100e.m49373x(str2, "phoneNumber");
        this.f33138x = str2;
        RO mVGenerateRegistrationRequest = new MVGenerateRegistrationRequest();
        mVGenerateRegistrationRequest.phoneNumber = str2;
        mVGenerateRegistrationRequest.callingCode = str;
        this.f33922v = mVGenerateRegistrationRequest;
    }

    /* renamed from: O */
    public final String mo40234O() {
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C13352j.class, sb, "_");
        sb.append(this.f33137w);
        sb.append("_");
        sb.append(this.f33138x);
        return sb.toString();
    }
}

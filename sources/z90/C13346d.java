package z90;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.taxi.MVSourceFeature;
import com.tranzmate.moovit.protocol.taxi.MVVerificationRequest;
import p824tp.C19746x;

/* renamed from: z90.d */
public final class C13346d extends C13778r<C13346d, C13347e, MVVerificationRequest> {
    public C13346d(C13752e eVar, String str, MVSourceFeature mVSourceFeature) {
        super(eVar, C19746x.server_path_app_server_secured_url, C19746x.api_path_verify_phone_number_code_path, C13347e.class);
        RO mVVerificationRequest = new MVVerificationRequest();
        mVVerificationRequest.pinNumber = str;
        mVVerificationRequest.source = mVSourceFeature;
        this.f33922v = mVVerificationRequest;
    }
}

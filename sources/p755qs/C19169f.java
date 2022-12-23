package p755qs;

import android.content.Context;
import com.moovit.app.general.settings.privacy.C14894a;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.users.MVSetPrivacyPolicyRequest;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: qs.f */
public final class C19169f extends C13712f {
    public C19169f(Context context) {
        super(context);
    }

    /* renamed from: e */
    public static MVSetPrivacyPolicyRequest m46322e(Context context) {
        C14894a b = C14894a.m37560b(context);
        boolean d = b.mo45014d();
        boolean f = b.mo45016f();
        Boolean e = b.mo45015e();
        MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest = new MVSetPrivacyPolicyRequest();
        mVSetPrivacyPolicyRequest.locationDataAllowed = d;
        mVSetPrivacyPolicyRequest.mo35336i();
        mVSetPrivacyPolicyRequest.sellingDataAllowed = f;
        mVSetPrivacyPolicyRequest.mo35338k();
        if (e != null) {
            mVSetPrivacyPolicyRequest.personalizedAdsAllowed = e.booleanValue();
            mVSetPrivacyPolicyRequest.mo35337j();
        }
        return mVSetPrivacyPolicyRequest;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        MVSetPrivacyPolicyRequest e = m46322e(this.f33791b);
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.SET_PRIVACY_POLICY_REQUEST;
        mVServerMessage.value_ = e;
        return mVServerMessage;
    }
}

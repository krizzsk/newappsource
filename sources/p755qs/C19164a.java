package p755qs;

import android.content.Context;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.users.MVPrivacyPolicyApprovalRequest;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: qs.a */
public final class C19164a extends C13712f {

    /* renamed from: c */
    public final String f48744c;

    /* renamed from: d */
    public final String f48745d;

    public C19164a(Context context) {
        super(context);
        this.f48744c = context.getString(R.string.terms_of_use_url);
        this.f48745d = context.getString(R.string.privacy_url);
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        String str = this.f48744c;
        String str2 = this.f48745d;
        MVPrivacyPolicyApprovalRequest mVPrivacyPolicyApprovalRequest = new MVPrivacyPolicyApprovalRequest();
        mVPrivacyPolicyApprovalRequest.termOfUse = str;
        mVPrivacyPolicyApprovalRequest.privacyPolicy = str2;
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.PRIVACY_POLICY_APPROVAL;
        mVServerMessage.value_ = mVPrivacyPolicyApprovalRequest;
        return mVServerMessage;
    }
}

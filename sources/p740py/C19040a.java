package p740py;

import android.content.Context;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.users.MVUpdateConsentRequest;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: py.a */
public final class C19040a extends C13712f {

    /* renamed from: c */
    public final boolean f48427c;

    public C19040a(Context context, boolean z) {
        super(context);
        this.f48427c = z;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        boolean z = this.f48427c;
        MVUpdateConsentRequest mVUpdateConsentRequest = new MVUpdateConsentRequest();
        mVUpdateConsentRequest.isConsentGiven = z;
        mVUpdateConsentRequest.mo35387g();
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.THIRD_PARTY_DATA_CONSENT;
        mVServerMessage.value_ = mVUpdateConsentRequest;
        return mVServerMessage;
    }
}

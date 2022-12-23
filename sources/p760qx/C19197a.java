package p760qx;

import android.content.Context;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.transitcardalert.MVTCATopupUserRequest;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: qx.a */
public final class C19197a extends C13712f {
    public C19197a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        MVTCATopupUserRequest mVTCATopupUserRequest = new MVTCATopupUserRequest();
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.USER_TRANSIT_CARD_TOPUP_REQUEST;
        mVServerMessage.value_ = mVTCATopupUserRequest;
        return mVServerMessage;
    }
}

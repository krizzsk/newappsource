package p594jv;

import android.content.Context;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.Reports4_0.MVDeleteReportsRequest;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: jv.h */
public final class C17938h extends C13712f {

    /* renamed from: c */
    public String f46002c;

    public C17938h(Context context, String str) {
        super(context);
        C21100e.m49373x(str, "reportId");
        this.f46002c = str;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        String str = this.f46002c;
        MVDeleteReportsRequest mVDeleteReportsRequest = new MVDeleteReportsRequest();
        mVDeleteReportsRequest.reportId = str;
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.USER_REPORT_DELETE_REQUEST;
        mVServerMessage.value_ = mVDeleteReportsRequest;
        return mVServerMessage;
    }
}

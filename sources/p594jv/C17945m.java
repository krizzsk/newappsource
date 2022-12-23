package p594jv;

import ce0.C21100e;
import com.moovit.app.reports.list.ReportsListActivity;
import com.tranzmate.moovit.protocol.Reports4_0.MVFlagInAppropriateReportRequest;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: jv.m */
public final class C17945m extends C13712f {

    /* renamed from: c */
    public String f46010c;

    public C17945m(ReportsListActivity reportsListActivity, String str) {
        super(reportsListActivity);
        C21100e.m49373x(str, "reportId");
        this.f46010c = str;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        String str = this.f46010c;
        MVFlagInAppropriateReportRequest mVFlagInAppropriateReportRequest = new MVFlagInAppropriateReportRequest();
        mVFlagInAppropriateReportRequest.reportId = str;
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.USER_REPORT_FLAG_INAPPROPRIATE_REQUEST;
        mVServerMessage.value_ = mVFlagInAppropriateReportRequest;
        return mVServerMessage;
    }
}

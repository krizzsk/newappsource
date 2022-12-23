package p594jv;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.Reports4_0.MVLikeReportRequest;

/* renamed from: jv.j */
public final class C17940j extends C13778r<C17940j, C17941k, MVLikeReportRequest> {
    public C17940j(C13752e eVar, String str) {
        super(eVar, R.string.api_path_like_user_report, C17941k.class);
        RO mVLikeReportRequest = new MVLikeReportRequest();
        mVLikeReportRequest.reportId = str;
        this.f33922v = mVLikeReportRequest;
    }
}

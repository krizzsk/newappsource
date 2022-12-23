package p594jv;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.Reports4_0.MVUnLikeReportRequest;

/* renamed from: jv.n */
public final class C17946n extends C13778r<C17946n, C17947o, MVUnLikeReportRequest> {
    public C17946n(C13752e eVar, String str) {
        super(eVar, R.string.api_path_un_like_user_report, C17947o.class);
        RO mVUnLikeReportRequest = new MVUnLikeReportRequest();
        mVUnLikeReportRequest.reportId = str;
        this.f33922v = mVUnLikeReportRequest;
    }
}

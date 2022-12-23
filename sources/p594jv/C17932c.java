package p594jv;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.Reports4_0.MVDeleteReportsRequest;

/* renamed from: jv.c */
public final class C17932c extends C13778r<C17932c, C17933d, MVDeleteReportsRequest> {
    public C17932c(C13752e eVar, String str) {
        super(eVar, R.string.api_path_delete_user_report, C17933d.class);
        RO mVDeleteReportsRequest = new MVDeleteReportsRequest();
        mVDeleteReportsRequest.reportId = str;
        this.f33922v = mVDeleteReportsRequest;
    }
}

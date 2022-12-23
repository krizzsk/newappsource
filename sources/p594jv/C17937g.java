package p594jv;

import androidx.fragment.app.FragmentActivity;
import c70.C13749c;
import ce0.C21100e;
import com.moovit.app.reports.service.CreateReportRequestData;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.tranzmate.moovit.protocol.Reports4_0.MVCreateReportRequest;
import com.tranzmate.moovit.protocol.Reports4_0.MVReportCreationData;
import com.tranzmate.moovit.protocol.common.MVEntityIdentifier;
import com.tranzmate.moovit.protocol.common.MVEntityType;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import org.apache.thrift.TBase;
import p401bz.C13712f;
import p548hv.C17499b;

/* renamed from: jv.g */
public final class C17937g extends C13712f {

    /* renamed from: c */
    public CreateReportRequestData f45999c;

    /* renamed from: d */
    public String f46000d;

    /* renamed from: e */
    public String f46001e;

    public C17937g(FragmentActivity fragmentActivity, CreateReportRequestData createReportRequestData, String str, String str2) {
        super(fragmentActivity);
        C21100e.m49373x(createReportRequestData, "createReportRequestData");
        this.f45999c = createReportRequestData;
        this.f46000d = str;
        this.f46001e = str2;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        int i;
        CreateReportRequestData createReportRequestData = this.f45999c;
        ReportEntityType reportEntityType = createReportRequestData.f39212b;
        ServerId serverId = createReportRequestData.f39213c;
        MVEntityType a = C17499b.m43613a(reportEntityType);
        if (serverId == null) {
            i = 0;
        } else {
            i = serverId.f15142b;
        }
        MVEntityIdentifier mVEntityIdentifier = new MVEntityIdentifier(a, i);
        MVLatLon r = C13749c.m34332r(this.f45999c.f39215e);
        MVReportCreationData mVReportCreationData = new MVReportCreationData();
        CreateReportRequestData createReportRequestData2 = this.f45999c;
        mVReportCreationData.text = createReportRequestData2.f39217g;
        mVReportCreationData.categoryUnionType = C7841a.m17871i(createReportRequestData2.f39216f);
        mVReportCreationData.creationTime = System.currentTimeMillis();
        mVReportCreationData.mo25305m();
        CreateReportRequestData createReportRequestData3 = this.f45999c;
        mVReportCreationData.reportLocationName = createReportRequestData3.f39214d;
        mVReportCreationData.email = this.f46000d;
        mVReportCreationData.extra = this.f46001e;
        Integer num = createReportRequestData3.f39218h;
        if (num != null) {
            mVReportCreationData.index = num.intValue();
            mVReportCreationData.mo25306o();
        }
        MVCreateReportRequest mVCreateReportRequest = new MVCreateReportRequest(mVEntityIdentifier, mVReportCreationData, r);
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.USER_REPORT_CREATE_REQUEST;
        mVServerMessage.value_ = mVCreateReportRequest;
        return mVServerMessage;
    }
}

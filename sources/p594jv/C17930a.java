package p594jv;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.app.reports.service.CreateReportRequestData;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.Reports4_0.MVCreateReportRequest;
import com.tranzmate.moovit.protocol.Reports4_0.MVReportCreationData;
import com.tranzmate.moovit.protocol.common.MVEntityIdentifier;
import com.tranzmate.moovit.protocol.common.MVEntityType;
import p548hv.C17499b;

/* renamed from: jv.a */
public final class C17930a extends C13778r<C17930a, C17931b, MVCreateReportRequest> {
    public C17930a() {
        throw null;
    }

    public C17930a(C13752e eVar, CreateReportRequestData createReportRequestData, String str, String str2) {
        super(eVar, R.string.api_path_create_user_reports, C17931b.class);
        int i;
        MVReportCreationData mVReportCreationData = new MVReportCreationData();
        Integer num = createReportRequestData.f39218h;
        if (num != null) {
            mVReportCreationData.index = num.intValue();
            mVReportCreationData.mo25306o();
        }
        mVReportCreationData.text = createReportRequestData.f39217g;
        mVReportCreationData.categoryUnionType = C7841a.m17871i(createReportRequestData.f39216f);
        mVReportCreationData.creationTime = System.currentTimeMillis();
        mVReportCreationData.mo25305m();
        mVReportCreationData.reportLocationName = createReportRequestData.f39214d;
        mVReportCreationData.email = str;
        mVReportCreationData.extra = str2;
        RO mVCreateReportRequest = new MVCreateReportRequest();
        mVCreateReportRequest.data = mVReportCreationData;
        mVCreateReportRequest.reportLocationLatLon = C13749c.m34332r(createReportRequestData.f39215e);
        ReportEntityType reportEntityType = createReportRequestData.f39212b;
        ServerId serverId = createReportRequestData.f39213c;
        MVEntityType a = C17499b.m43613a(reportEntityType);
        if (serverId == null) {
            i = 0;
        } else {
            i = serverId.f15142b;
        }
        mVCreateReportRequest.entityId = new MVEntityIdentifier(a, i);
        this.f33922v = mVCreateReportRequest;
    }
}

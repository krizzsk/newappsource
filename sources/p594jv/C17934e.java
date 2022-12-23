package p594jv;

import c70.C13752e;
import c70.C13778r;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.Reports4_0.MVGetUserReportsAndAlertsRequest;
import com.tranzmate.moovit.protocol.common.MVEntityIdentifier;
import com.tranzmate.moovit.protocol.common.MVEntityType;
import p548hv.C17499b;

/* renamed from: jv.e */
public final class C17934e extends C13778r<C17934e, C17935f, MVGetUserReportsAndAlertsRequest> {
    public C17934e(C13752e eVar, ReportEntityType reportEntityType, ServerId serverId, String str) {
        super(eVar, R.string.api_path_get_user_reports, C17935f.class);
        int i;
        RO mVGetUserReportsAndAlertsRequest = new MVGetUserReportsAndAlertsRequest();
        MVEntityType a = C17499b.m43613a(reportEntityType);
        if (serverId == null) {
            i = 0;
        } else {
            i = serverId.f15142b;
        }
        mVGetUserReportsAndAlertsRequest.entityId = new MVEntityIdentifier(a, i);
        mVGetUserReportsAndAlertsRequest.maxResults = 11;
        mVGetUserReportsAndAlertsRequest.mo25276i();
        mVGetUserReportsAndAlertsRequest.nextPageIdToRetrieve = str;
        this.f33922v = mVGetUserReportsAndAlertsRequest;
    }
}

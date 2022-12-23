package p479ey;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.useraccount.campaigns.Campaign;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.ridesharing.MVCampaign;
import com.tranzmate.moovit.protocol.ridesharing.MVCampaignResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: ey.d */
public final class C16892d extends C13780t<C16891c, C16892d, MVCampaignResponse> {

    /* renamed from: m */
    public Campaign f43913m;

    public C16892d() {
        super(MVCampaignResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C16891c cVar = (C16891c) aVar;
        MVCampaignResponse mVCampaignResponse = (MVCampaignResponse) tBase;
        if (mVCampaignResponse.mo31113f()) {
            MVCampaign mVCampaign = mVCampaignResponse.campaign;
            this.f43913m = new Campaign(mVCampaign.campaignId, mVCampaign.campaignHtml);
        }
    }
}

package p598jz;

import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.mapitems.MVCommercialDetailsRequest;
import p824tp.C19746x;

/* renamed from: jz.d */
public final class C17985d extends C13778r<C17985d, C17986e, MVCommercialDetailsRequest> {
    public C17985d(ServerId serverId, C13752e eVar) {
        super(eVar, C19746x.api_path_get_commerical_details, C17986e.class);
        RO mVCommercialDetailsRequest = new MVCommercialDetailsRequest();
        mVCommercialDetailsRequest.commercialId = serverId.f15142b;
        this.f33922v = mVCommercialDetailsRequest;
    }
}

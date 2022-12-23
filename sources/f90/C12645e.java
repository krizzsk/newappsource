package f90;

import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueAutoloadCancelRequest;
import m80.C12873i;

/* renamed from: f90.e */
public final class C12645e extends C13778r<C12645e, C12646f, MVStoredValueAutoloadCancelRequest> {

    /* renamed from: w */
    public final ServerId f31260w;

    /* renamed from: x */
    public final String f31261x;

    public C12645e(C13752e eVar, ServerId serverId, String str) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_purchase_autoload_stored_value, C12646f.class);
        this.f31260w = serverId;
        this.f31261x = str;
        int i = serverId.f15142b;
        RO mVStoredValueAutoloadCancelRequest = new MVStoredValueAutoloadCancelRequest();
        mVStoredValueAutoloadCancelRequest.providerId = i;
        mVStoredValueAutoloadCancelRequest.mo32955h();
        mVStoredValueAutoloadCancelRequest.agencyKey = str;
        this.f33922v = mVStoredValueAutoloadCancelRequest;
    }
}

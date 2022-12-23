package t30;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfoRequest;
import l30.C5570c0;

/* renamed from: t30.h */
public final class C6567h extends C13778r<C6567h, C6568i, MVMicroMobilityItemInfoRequest> {

    /* renamed from: w */
    public final String f20380w;

    /* renamed from: x */
    public final String f20381x;

    public C6567h(C13752e eVar, String str, String str2) {
        super(eVar, C5570c0.server_path_app_server_url, C5570c0.api_path_micro_mobility_get_item_info, C6568i.class);
        this.f20380w = str;
        this.f20381x = str2;
        RO mVMicroMobilityItemInfoRequest = new MVMicroMobilityItemInfoRequest();
        mVMicroMobilityItemInfoRequest.serviceId = str;
        mVMicroMobilityItemInfoRequest.itemId = str2;
        this.f33922v = mVMicroMobilityItemInfoRequest;
    }
}

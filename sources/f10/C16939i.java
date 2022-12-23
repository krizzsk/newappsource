package f10;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.carpool.MVPushReceivedRequest;
import p824tp.C19746x;

/* renamed from: f10.i */
public final class C16939i extends C13778r<C16939i, C16940j, MVPushReceivedRequest> {
    public C16939i(C13752e eVar, String str) {
        super(eVar, C19746x.api_path_push_received_request, C16940j.class);
        RO mVPushReceivedRequest = new MVPushReceivedRequest();
        mVPushReceivedRequest.pushID = str;
        this.f33922v = mVPushReceivedRequest;
    }
}

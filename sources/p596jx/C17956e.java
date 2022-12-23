package p596jx;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodCancelSubscriptionRequest;
import mf0.C24362h;

/* renamed from: jx.e */
public final class C17956e extends C13778r<C17956e, C17957f, MVTodCancelSubscriptionRequest> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17956e(C13752e eVar, String str) {
        super(eVar, R.string.api_path_tod_shuttles_cancel_subscription_request, C17957f.class);
        C24362h.m61211f(str, "subscriptionId");
        RO mVTodCancelSubscriptionRequest = new MVTodCancelSubscriptionRequest();
        mVTodCancelSubscriptionRequest.subscriptionId = str;
        this.f33922v = mVTodCancelSubscriptionRequest;
    }
}

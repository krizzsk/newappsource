package p549hw;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import com.moovit.app.subscription.model.PurchaseDetails;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.subscriptions.MVUpdateSubscriptionsPurchaseRequest;
import java.util.ArrayList;
import java.util.List;
import p054d0.C4303q;

/* renamed from: hw.g */
public final class C17509g extends C13778r<C17509g, C17510h, MVUpdateSubscriptionsPurchaseRequest> {

    /* renamed from: w */
    public static final /* synthetic */ int f45077w = 0;

    public C17509g(C13752e eVar, List<PurchaseDetails> list) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_update_subscription, C17510h.class);
        ArrayList arrayList = new ArrayList();
        for (PurchaseDetails next : list) {
            arrayList.addAll(C13720d.m34273c(next.f39784b, (C13722f) null, new C17507e(next, 0)));
        }
        ArrayList c = C13720d.m34273c(arrayList, (C13722f) null, new C4303q(6));
        RO mVUpdateSubscriptionsPurchaseRequest = new MVUpdateSubscriptionsPurchaseRequest();
        mVUpdateSubscriptionsPurchaseRequest.paymentsData = c;
        this.f33922v = mVUpdateSubscriptionsPurchaseRequest;
    }
}

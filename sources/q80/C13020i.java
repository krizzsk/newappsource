package q80;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntentRequest;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import m80.C12873i;
import p80.C12991b;
import p828tt.C19759a;
import r80.C13048b;

/* renamed from: q80.i */
public final class C13020i extends C13778r<C13020i, C13021j, MVPurchaseIntentRequest> implements PurchaseIntent.C7644a<MVPurchaseIntent>, Callable<PurchaseStep> {

    /* renamed from: w */
    public final C12991b f32222w;

    public C13020i(C13752e eVar, C12991b bVar, PurchaseIntent purchaseIntent) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_purchase_intent, C13021j.class);
        C21100e.m49373x(bVar, "ticketingConfiguration");
        this.f32222w = bVar;
        ArrayList<O> c = C13720d.m34273c(C13048b.f32272c.mo39933a(eVar.f33852a), (C13722f) null, new C19759a(17));
        MVPurchaseIntent H1 = purchaseIntent.mo23996H1(this);
        RO mVPurchaseIntentRequest = new MVPurchaseIntentRequest();
        mVPurchaseIntentRequest.supportedEngines = c;
        mVPurchaseIntentRequest.intent = H1;
        this.f33922v = mVPurchaseIntentRequest;
        this.f51770m = new C14291m0(eVar, "ticketing_purchase_intent");
    }

    public final Object call() throws Exception {
        return ((C13021j) mo52626J()).f32223m;
    }
}

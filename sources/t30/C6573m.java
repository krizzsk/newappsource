package t30;

import c70.C13752e;
import c70.C13778r;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseIntent;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntent;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentRequest;
import java.util.concurrent.Callable;
import l30.C5570c0;

/* renamed from: t30.m */
public final class C6573m extends C13778r<C6573m, C6574n, MVMicroMobilityPurchaseIntentRequest> implements MicroMobilityPurchaseIntent.C4158a<MVMicroMobilityPurchaseIntent>, Callable<MicroMobilityPurchaseStep> {
    public C6573m(MicroMobilityPurchaseIntent microMobilityPurchaseIntent, C13752e eVar) {
        super(eVar, C5570c0.server_path_app_server_secured_url, C5570c0.api_path_micro_mobility_purchase_intent, C6574n.class);
        MVMicroMobilityPurchaseIntent P0 = microMobilityPurchaseIntent.mo19510P0(this);
        RO mVMicroMobilityPurchaseIntentRequest = new MVMicroMobilityPurchaseIntentRequest();
        mVMicroMobilityPurchaseIntentRequest.purchaseIntent = P0;
        this.f33922v = mVMicroMobilityPurchaseIntentRequest;
        this.f51770m = new C14291m0(eVar, "micro_mobility_purchase_intent");
    }

    public final Object call() throws Exception {
        return ((C6574n) mo52626J()).f20391m;
    }
}

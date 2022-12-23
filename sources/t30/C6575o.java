package t30;

import c70.C13752e;
import c70.C13778r;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStepResult;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest;
import java.util.concurrent.Callable;
import l30.C5570c0;

/* renamed from: t30.o */
public final class C6575o extends C13778r<C6575o, C6576p, MVMicroMobilityPurchaseCompleteStepRequest> implements Callable<MicroMobilityPurchaseStep>, MicroMobilityPurchaseStepResult.C4162a {
    public C6575o(MicroMobilityPurchaseStepResult microMobilityPurchaseStepResult, C13752e eVar) {
        super(eVar, C5570c0.server_path_app_server_secured_url, C5570c0.api_path_micro_mobility_purchase_step_complete, C6576p.class);
        microMobilityPurchaseStepResult.mo19524b(this);
        this.f51770m = new C14291m0(eVar, "micro_mobility_step_completed");
    }

    public final Object call() throws Exception {
        return ((C6576p) mo52626J()).f20392m;
    }
}

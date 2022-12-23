package t30;

import c70.C13752e;
import c70.C13778r;
import com.moovit.micromobility.damage.MicroMobilityDamageReport;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityDamageReportsRequest;
import java.util.List;
import java.util.concurrent.Callable;
import l30.C5570c0;

/* renamed from: t30.u */
public final class C6581u extends C13778r<C6581u, C6582v, MVMicroMobilityDamageReportsRequest> implements Callable<List<MicroMobilityDamageReport>> {
    public C6581u(C13752e eVar, String str, String str2) {
        super(eVar, C5570c0.server_path_app_server_secured_url, C5570c0.api_path_micro_mobility_reported_damages, C6582v.class);
        RO mVMicroMobilityDamageReportsRequest = new MVMicroMobilityDamageReportsRequest();
        mVMicroMobilityDamageReportsRequest.serviceId = str;
        mVMicroMobilityDamageReportsRequest.itemId = str2;
        this.f33922v = mVMicroMobilityDamageReportsRequest;
    }

    public final Object call() throws Exception {
        return ((C6582v) mo52626J()).f20400m;
    }
}

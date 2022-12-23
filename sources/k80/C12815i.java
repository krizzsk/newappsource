package k80;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertsByIdRequest;
import java.util.List;
import p824tp.C19746x;

/* renamed from: k80.i */
public final class C12815i extends C13778r<C12815i, C12816j, MVGetServiceAlertsByIdRequest> {
    public C12815i(C13752e eVar, List<String> list) {
        super(eVar, C19746x.api_path_service_alerts_by_id, C12816j.class);
        RO mVGetServiceAlertsByIdRequest = new MVGetServiceAlertsByIdRequest();
        mVGetServiceAlertsByIdRequest.alertIds = list;
        this.f33922v = mVGetServiceAlertsByIdRequest;
    }
}

package k80;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.servicealerts.ServiceAlert;
import com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertByIdResponse;
import j80.C12776e;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: k80.f */
public final class C12812f extends C13780t<C12811e, C12812f, MVGetServiceAlertByIdResponse> {

    /* renamed from: m */
    public ServiceAlert f31676m;

    public C12812f() {
        super(MVGetServiceAlertByIdResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        ServiceAlert serviceAlert;
        C12811e eVar = (C12811e) aVar;
        MVGetServiceAlertByIdResponse mVGetServiceAlertByIdResponse = (MVGetServiceAlertByIdResponse) tBase;
        if (mVGetServiceAlertByIdResponse.mo31579f()) {
            serviceAlert = C12776e.m32578b(mVGetServiceAlertByIdResponse.serviceAlert);
        } else {
            serviceAlert = null;
        }
        this.f31676m = serviceAlert;
    }
}

package k80;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.servicealerts.ServiceAlert;
import com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertsByIdResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p638lr.C18267n;

/* renamed from: k80.j */
public final class C12816j extends C13780t<C12815i, C12816j, MVGetServiceAlertsByIdResponse> {

    /* renamed from: m */
    public List<ServiceAlert> f31679m;

    public C12816j() {
        super(MVGetServiceAlertsByIdResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C12815i iVar = (C12815i) aVar;
        this.f31679m = Collections.unmodifiableList(C13720d.m34273c(((MVGetServiceAlertsByIdResponse) tBase).serviceAlerts, (C13722f) null, new C18267n(22)));
    }
}

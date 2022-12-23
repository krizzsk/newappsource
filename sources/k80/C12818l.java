package k80;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertsByLinesResponse;
import j80.C12776e;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;

/* renamed from: k80.l */
public final class C12818l extends C13780t<C12817k, C12818l, MVGetServiceAlertsByLinesResponse> {

    /* renamed from: m */
    public List<LineServiceAlertDigest> f31681m = Collections.emptyList();

    public C12818l() {
        super(MVGetServiceAlertsByLinesResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C12817k kVar = (C12817k) aVar;
        this.f31681m = Collections.unmodifiableList(C12776e.m32582f(((MVGetServiceAlertsByLinesResponse) tBase).alertsDigest));
    }
}

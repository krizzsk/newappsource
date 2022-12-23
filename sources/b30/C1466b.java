package b30;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.ticketingV2.MVAddExternalPaymentResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: b30.b */
public final class C1466b extends C13780t<C1465a, C1466b, MVAddExternalPaymentResponse> {

    /* renamed from: m */
    public String f5336m;

    public C1466b() {
        super(MVAddExternalPaymentResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C1465a aVar2 = (C1465a) aVar;
        this.f5336m = ((MVAddExternalPaymentResponse) tBase).paymentData;
    }
}

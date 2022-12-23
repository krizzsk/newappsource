package p428cv;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.payment.MVCustomerTokenResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: cv.b */
public final class C16500b extends C13780t<C16499a, C16500b, MVCustomerTokenResponse> {

    /* renamed from: m */
    public String f43098m;

    public C16500b() {
        super(MVCustomerTokenResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C16499a aVar2 = (C16499a) aVar;
        this.f43098m = ((MVCustomerTokenResponse) tBase).customerToken;
    }
}

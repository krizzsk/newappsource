package h60;

import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingStatementResponse;
import f60.C16947a;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p221q6.C6198o;
import p394br.C13659e;
import p638lr.C18267n;

/* renamed from: h60.o */
public final class C17340o extends C13780t<C17337n, C17340o, MVPTBBillingStatementResponse> {

    /* renamed from: m */
    public C6198o f44725m;

    public C17340o() {
        super(MVPTBBillingStatementResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        C17337n nVar = (C17337n) aVar;
        MVPTBBillingStatementResponse mVPTBBillingStatementResponse = (MVPTBBillingStatementResponse) tBase;
        C16947a o = C17353s0.m43401o(mVPTBBillingStatementResponse.upcomingStatement);
        ArrayList<O> c = C13720d.m34273c(mVPTBBillingStatementResponse.pastStatement, (C13722f) null, new C18267n(19));
        if (C13723g.m34286g(c, new C13659e(3)) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f44725m = new C6198o(o, c, z);
    }
}

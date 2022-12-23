package q80;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.ticketingV2.MVTransactionsResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p638lr.C18262i;

/* renamed from: q80.a0 */
public final class C13010a0 extends C13780t<C13039z, C13010a0, MVTransactionsResponse> {

    /* renamed from: m */
    public ArrayList f32200m;

    public C13010a0() {
        super(MVTransactionsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C13039z zVar = (C13039z) aVar;
        this.f32200m = C13720d.m34273c(((MVTransactionsResponse) tBase).transactions, (C13722f) null, new C18262i(26));
    }
}

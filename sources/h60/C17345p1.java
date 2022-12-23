package h60;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.payments.MVGetVeriffSessionUrlResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p977zz.C20964s0;

/* renamed from: h60.p1 */
public final class C17345p1 extends C13780t<C17342o1, C17345p1, MVGetVeriffSessionUrlResponse> {

    /* renamed from: m */
    public String f44730m;

    public C17345p1() {
        super(MVGetVeriffSessionUrlResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17342o1 o1Var = (C17342o1) aVar;
        String str = ((MVGetVeriffSessionUrlResponse) tBase).sessionUrl;
        this.f44730m = str;
        if (C20964s0.m49090h(str)) {
            throw new BadResponseException("Veriff session url may not be null/empty!");
        }
    }
}

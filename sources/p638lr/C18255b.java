package p638lr;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.carpool.MVGetCancelFeeResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: lr.b */
public final class C18255b extends C13780t<C18254a, C18255b, MVGetCancelFeeResponse> {

    /* renamed from: m */
    public CurrencyAmount f46572m;

    public C18255b() {
        super(MVGetCancelFeeResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C18254a aVar2 = (C18254a) aVar;
        this.f46572m = C13749c.m34317c(((MVGetCancelFeeResponse) tBase).cancelFee);
    }
}

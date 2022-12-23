package p737pv;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideReceiptResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: pv.p */
public final class C19026p extends C13780t<C19025o, C19026p, MVRSEventRideReceiptResponse> {

    /* renamed from: m */
    public String f48391m;

    /* renamed from: n */
    public String f48392n;

    public C19026p() {
        super(MVRSEventRideReceiptResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19025o oVar = (C19025o) aVar;
        MVRSEventRideReceiptResponse mVRSEventRideReceiptResponse = (MVRSEventRideReceiptResponse) tBase;
        this.f48391m = mVRSEventRideReceiptResponse.receipt;
        this.f48392n = mVRSEventRideReceiptResponse.phoneNumber;
    }
}

package p737pv;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelFeeResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: pv.l */
public final class C19021l extends C13780t<C19020k, C19021l, MVPassengerCancelFeeResponse> {

    /* renamed from: m */
    public CurrencyAmount f48382m = null;

    public C19021l() {
        super(MVPassengerCancelFeeResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        CurrencyAmount currencyAmount;
        C19020k kVar = (C19020k) aVar;
        MVPassengerCancelFeeResponse mVPassengerCancelFeeResponse = (MVPassengerCancelFeeResponse) tBase;
        if (mVPassengerCancelFeeResponse.mo31212f()) {
            currencyAmount = C13749c.m34318d(mVPassengerCancelFeeResponse.fee);
        } else {
            currencyAmount = null;
        }
        this.f48382m = currencyAmount;
    }
}

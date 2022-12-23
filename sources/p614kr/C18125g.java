package p614kr;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.app.carpool.payment.PassengerCredit;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.carpool.MVPassengerCreditHeaderResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;

/* renamed from: kr.g */
public final class C18125g extends C13780t<C18124f, C18125g, MVPassengerCreditHeaderResponse> {

    /* renamed from: m */
    public PassengerCredit f46339m;

    public C18125g() {
        super(MVPassengerCreditHeaderResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C18124f fVar = (C18124f) aVar;
        MVPassengerCreditHeaderResponse mVPassengerCreditHeaderResponse = (MVPassengerCreditHeaderResponse) tBase;
        this.f46339m = new PassengerCredit(C13749c.m34317c(mVPassengerCreditHeaderResponse.totalCredit), C13749c.m34317c(mVPassengerCreditHeaderResponse.nextRideCredit), mVPassengerCreditHeaderResponse.nextRideCreditExpiration);
    }
}

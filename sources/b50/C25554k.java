package b50;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.account.deposit.DepositInstructions;
import com.tranzmate.moovit.protocol.payments.MVGetDepositInstructionsResponse;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: b50.k */
public final class C25554k extends C13780t<C25553j, C25554k, MVGetDepositInstructionsResponse> {

    /* renamed from: m */
    public DepositInstructions f63814m;

    public C25554k() {
        super(MVGetDepositInstructionsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C25553j jVar = (C25553j) aVar;
        this.f63814m = C17353s0.m43391e(((MVGetDepositInstructionsResponse) tBase).depositInstructions);
    }
}

package b50;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.account.balance.BalancePaymentMethod;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.CreditCard3DSException;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.payment.clearance.PaymentMethodToken;
import com.tranzmate.moovit.protocol.payments.MVCreateDepositResponse;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;
import p977zz.C20964s0;

/* renamed from: b50.d */
public final class C25547d extends C13780t<C25546c, C25547d, MVCreateDepositResponse> implements PaymentMethod.C25688a<String, PaymentMethodToken> {
    public C25547d() {
        super(MVCreateDepositResponse.class);
    }

    /* renamed from: C1 */
    public final Object mo48923C1(CreditCardPaymentMethod creditCardPaymentMethod, Object obj) {
        return new CreditCardToken((String) obj, creditCardPaymentMethod.f63943e);
    }

    /* renamed from: K0 */
    public final Object mo48924K0(ExternalPaymentMethod externalPaymentMethod, Object obj) {
        return new PaymentMethodToken((String) obj);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C25546c cVar = (C25546c) aVar;
        MVCreateDepositResponse mVCreateDepositResponse = (MVCreateDepositResponse) tBase;
        String str = mVCreateDepositResponse.token;
        if (!C20964s0.m49090h(str)) {
            PaymentMethodToken paymentMethodToken = (PaymentMethodToken) cVar.f63801w.mo83416b(this, str);
            String str2 = mVCreateDepositResponse.verificationUrl;
            if (str2 == null) {
                return;
            }
            if (!(paymentMethodToken instanceof CreditCardToken)) {
                throw new BadResponseException("Only credit card verification supported.");
            }
            throw new CreditCard3DSException(str2, (CreditCardToken) paymentMethodToken, C17353s0.m43402p(mVCreateDepositResponse.returnUrls), (String) null);
        }
        throw new BadResponseException("Token can't be null.");
    }

    /* renamed from: u */
    public final Object mo48929u(BalancePaymentMethod balancePaymentMethod, Object obj) {
        return new PaymentMethodToken((String) obj);
    }

    /* renamed from: z0 */
    public final Object mo48930z0(BankPaymentMethod bankPaymentMethod, Object obj) {
        return new PaymentMethodToken((String) obj);
    }
}

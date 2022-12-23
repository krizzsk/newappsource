package b50;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.account.deposit.DepositInstructions;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.payments.MVCreateDepositRequest;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethodId;
import com.tranzmate.moovit.protocol.payments.MVTokenizeReturnUrls;
import h60.C17353s0;
import java.io.IOException;
import java.util.concurrent.Callable;
import v40.C25754i;

/* renamed from: b50.c */
public final class C25546c extends C13778r<C25546c, C25547d, MVCreateDepositRequest> implements Callable<C25547d> {

    /* renamed from: w */
    public final PaymentMethod f63801w;

    /* renamed from: x */
    public final String f63802x;

    public C25546c(DepositInstructions depositInstructions, PaymentMethod paymentMethod, WebInstruction webInstruction, C13752e eVar, String str) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_create_deposit, C25547d.class);
        C21100e.m49373x(paymentMethod, "paymentMethod");
        this.f63801w = paymentMethod;
        this.f63802x = str;
        MVPaymentMethodId s = C17353s0.m43405s(paymentMethod.f64052b);
        C21100e.m49373x(webInstruction, "webInstruction");
        MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls(webInstruction.f42777b, webInstruction.f42778c, webInstruction.f42779d, webInstruction.f42780e);
        CurrencyAmount currencyAmount = depositInstructions.f63959c;
        C21100e.m49373x(currencyAmount, "depositAmount");
        MVCurrencyAmount p = C13749c.m34330p(currencyAmount);
        String str2 = depositInstructions.f63958b;
        C21100e.m49373x(str2, "paymentContext");
        RO mVCreateDepositRequest = new MVCreateDepositRequest();
        mVCreateDepositRequest.paymentMethodId = s;
        mVCreateDepositRequest.returnUrls = mVTokenizeReturnUrls;
        mVCreateDepositRequest.depositAmount = p;
        mVCreateDepositRequest.paymentContext = str2;
        this.f33922v = mVCreateDepositRequest;
    }

    /* renamed from: H */
    public final void mo5818H() throws IOException, ServerException {
        if (this.f63802x != null) {
            ((MVCreateDepositRequest) this.f33922v).cvv = this.f63801w.f64052b.f64056b.getClearanceProvider().mo48832i(this.f63802x);
        }
        super.mo5818H();
    }

    public final Object call() throws Exception {
        return (C25547d) mo52626J();
    }
}

package b50;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.payments.MVGetDepositInstructionsRequest;
import java.util.concurrent.Callable;
import v40.C25754i;

/* renamed from: b50.j */
public final class C25553j extends C13778r<C25553j, C25554k, MVGetDepositInstructionsRequest> implements Callable<C25554k> {
    public C25553j(C13752e eVar, String str, CurrencyAmount currencyAmount) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_get_deposit_instructions, C25554k.class);
        C21100e.m49373x(currencyAmount, "depositAmount");
        MVCurrencyAmount p = C13749c.m34330p(currencyAmount);
        C21100e.m49373x(str, "paymentContext");
        RO mVGetDepositInstructionsRequest = new MVGetDepositInstructionsRequest();
        mVGetDepositInstructionsRequest.paymentContext = str;
        mVGetDepositInstructionsRequest.depositAmount = p;
        this.f33922v = mVGetDepositInstructionsRequest;
    }

    public final Object call() throws Exception {
        return (C25554k) mo52626J();
    }
}

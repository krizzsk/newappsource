package n50;

import c70.C13752e;
import c70.C13778r;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.model.Bank;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderType;
import com.tranzmate.moovit.protocol.payments.MVTokenizeBankRequest;
import com.tranzmate.moovit.protocol.payments.MVTokenizeReturnUrls;
import h60.C17353s0;
import java.util.concurrent.Callable;
import v40.C25754i;

/* renamed from: n50.b */
public final class C18523b extends C13778r<C18523b, C18524c, MVTokenizeBankRequest> implements Callable<C18524c> {

    /* renamed from: w */
    public final ClearanceProviderPaymentInstructions f47143w;

    public C18523b(C13752e eVar, Bank bank, String str, String str2, String str3, String str4, ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions, boolean z) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_tokenize_buckaroo_bank, C18524c.class);
        this.f47143w = clearanceProviderPaymentInstructions;
        MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls(str, str2, str3, str4);
        MVClearanceProviderType mVClearanceProviderType = MVClearanceProviderType.BUCKAROO;
        int i = bank.f42600c.f15142b;
        String str5 = bank.f42599b;
        RO mVTokenizeBankRequest = new MVTokenizeBankRequest();
        mVTokenizeBankRequest.clearanceProvider = mVClearanceProviderType;
        mVTokenizeBankRequest.returnUrls = mVTokenizeReturnUrls;
        mVTokenizeBankRequest.bankId = i;
        mVTokenizeBankRequest.mo30646k();
        mVTokenizeBankRequest.clearanceBankType = str5;
        if (clearanceProviderPaymentInstructions != null) {
            mVTokenizeBankRequest.paymentProperties = C17353s0.m43406t(clearanceProviderPaymentInstructions, z);
        }
        this.f33922v = mVTokenizeBankRequest;
    }

    public final Object call() throws Exception {
        return (C18524c) mo52626J();
    }
}

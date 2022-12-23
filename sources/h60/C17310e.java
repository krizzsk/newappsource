package h60;

import a60.C13393b;
import c70.C13752e;
import c70.C13778r;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import com.tranzmate.moovit.protocol.discounts.MVTypedDiscount;
import com.tranzmate.moovit.protocol.discounts.MVVoucherDiscount;
import com.tranzmate.moovit.protocol.payments.MVPaymentAddDiscountRequest;
import com.tranzmate.moovit.protocol.payments.MVPaymentRequestProperties;
import java.util.concurrent.Callable;
import v40.C25754i;
import w50.C20277a;
import z50.C20809a;

/* renamed from: h60.e */
public final class C17310e extends C13778r<C17310e, C17313f, MVPaymentAddDiscountRequest> implements Callable<PaymentSummaryInfo> {
    public C17310e(C20277a aVar, C20809a aVar2, C13752e eVar) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_discounts_add_discount, C17313f.class);
        MVPaymentRequestProperties u = C17353s0.m43407u(aVar);
        C13393b bVar = (C13393b) aVar2;
        bVar.getClass();
        String str = bVar.f33241a;
        MVVoucherDiscount mVVoucherDiscount = new MVVoucherDiscount();
        mVVoucherDiscount.voucherCode = str;
        MVTypedDiscount mVTypedDiscount = new MVTypedDiscount();
        mVTypedDiscount.setField_ = MVTypedDiscount._Fields.VOUCHER;
        mVTypedDiscount.value_ = mVVoucherDiscount;
        RO mVPaymentAddDiscountRequest = new MVPaymentAddDiscountRequest();
        mVPaymentAddDiscountRequest.requestProperties = u;
        mVPaymentAddDiscountRequest.discount = mVTypedDiscount;
        this.f33922v = mVPaymentAddDiscountRequest;
    }

    public final Object call() throws Exception {
        return ((C17313f) mo52626J()).f44696m;
    }
}

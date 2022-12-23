package w50;

import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import java.util.concurrent.Callable;

/* renamed from: w50.f */
public final /* synthetic */ class C20282f implements Callable {

    /* renamed from: b */
    public final /* synthetic */ PaymentOptions f51425b;

    /* renamed from: c */
    public final /* synthetic */ PaymentSummaryInfo f51426c;

    public /* synthetic */ C20282f(PaymentOptions paymentOptions, PaymentSummaryInfo paymentSummaryInfo) {
        this.f51425b = paymentOptions;
        this.f51426c = paymentSummaryInfo;
    }

    public final Object call() {
        return C20283g.m47845b(this.f51425b, this.f51426c);
    }
}

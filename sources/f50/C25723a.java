package f50;

import android.view.KeyEvent;
import android.widget.TextView;
import com.moovit.payment.account.personalinfo.PaymentAccountEditDetailsActivity;

/* renamed from: f50.a */
public final /* synthetic */ class C25723a implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ PaymentAccountEditDetailsActivity f64152b;

    public /* synthetic */ C25723a(PaymentAccountEditDetailsActivity paymentAccountEditDetailsActivity) {
        this.f64152b = paymentAccountEditDetailsActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        PaymentAccountEditDetailsActivity paymentAccountEditDetailsActivity = this.f64152b;
        int i2 = PaymentAccountEditDetailsActivity.f64077s0;
        if (i == 4) {
            paymentAccountEditDetailsActivity.mo83546z2();
            return false;
        }
        paymentAccountEditDetailsActivity.getClass();
        return false;
    }
}

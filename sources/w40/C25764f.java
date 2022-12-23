package w40;

import android.view.KeyEvent;
import android.widget.TextView;
import com.appboy.support.ValidationUtils;
import com.moovit.payment.account.PaymentAccountUpdateEmailActivity;
import com.moovit.payment.registration.steps.p420id.C16373a;
import com.moovit.reports.MissingLineReportActivity;

/* renamed from: w40.f */
public final /* synthetic */ class C25764f implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ int f64277b;

    /* renamed from: c */
    public final /* synthetic */ Object f64278c;

    public /* synthetic */ C25764f(Object obj, int i) {
        this.f64277b = i;
        this.f64278c = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.f64277b) {
            case 0:
                PaymentAccountUpdateEmailActivity paymentAccountUpdateEmailActivity = (PaymentAccountUpdateEmailActivity) this.f64278c;
                int i2 = PaymentAccountUpdateEmailActivity.f63839o0;
                if (i == 4) {
                    paymentAccountUpdateEmailActivity.mo83333y2();
                } else {
                    paymentAccountUpdateEmailActivity.getClass();
                }
                return false;
            case 1:
                C16373a aVar = (C16373a) this.f64278c;
                int i3 = C16373a.f42789y;
                if (i == 4) {
                    aVar.mo49059y2();
                } else {
                    aVar.getClass();
                }
                return false;
            default:
                MissingLineReportActivity missingLineReportActivity = (MissingLineReportActivity) this.f64278c;
                int i4 = MissingLineReportActivity.f42892m0;
                if ((i & ValidationUtils.APPBOY_STRING_MAX_LENGTH) == 6) {
                    missingLineReportActivity.mo49150z2();
                } else {
                    missingLineReportActivity.getClass();
                }
                return false;
        }
    }
}

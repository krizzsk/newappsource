package d60;

import android.content.DialogInterface;
import b60.C13571b;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodCvvTokenizer;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken;
import com.moovit.request.UserRequestError;

/* renamed from: d60.a */
public class C16535a extends C13571b {

    /* renamed from: l */
    public PaymentMethodCvvTokenizer f43163l;

    /* renamed from: S1 */
    public final void mo40452S1(CreditCardPaymentMethod creditCardPaymentMethod, String str) {
        PaymentMethodCvvTokenizer paymentMethodCvvTokenizer = this.f43163l;
        if (paymentMethodCvvTokenizer != null) {
            paymentMethodCvvTokenizer.mo48912b(new PaymentGateway.Tokenizer.Result(1, new PaymentMethodGatewayToken(creditCardPaymentMethod.f64052b, str), (UserRequestError) null));
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        PaymentMethodCvvTokenizer paymentMethodCvvTokenizer = this.f43163l;
        if (paymentMethodCvvTokenizer != null) {
            paymentMethodCvvTokenizer.cancel(true);
        }
    }

    public final void onStop() {
        super.onStop();
        PaymentMethodCvvTokenizer paymentMethodCvvTokenizer = this.f43163l;
        if (paymentMethodCvvTokenizer != null) {
            paymentMethodCvvTokenizer.cancel(true);
        }
    }
}

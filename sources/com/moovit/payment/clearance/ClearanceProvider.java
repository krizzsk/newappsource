package com.moovit.payment.clearance;

import androidx.fragment.app.Fragment;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import java.io.IOException;
import java.util.Set;

public interface ClearanceProvider {

    public enum Capabilities {
        REGISTER_SINGLE_PAYMENT_METHOD,
        CHANGE_SINGLE_PAYMENT_METHOD,
        REGISTER_MULTI_PAYMENT_METHOD,
        DELETE_PAYMENT_METHOD,
        PAYMENT
    }

    /* renamed from: com.moovit.payment.clearance.ClearanceProvider$a */
    public interface C16293a {
        /* renamed from: U */
        void mo48833U(ClearanceProviderType clearanceProviderType, String str);

        /* renamed from: o1 */
        void mo48834o1(ClearanceProviderType clearanceProviderType, PaymentMethod paymentMethod);
    }

    /* renamed from: f */
    Set<Capabilities> mo48829f();

    /* renamed from: g */
    Fragment mo48830g(CreditCardRequest creditCardRequest);

    /* renamed from: h */
    Fragment mo48831h(ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions);

    /* renamed from: i */
    String mo48832i(String str) throws IOException;
}

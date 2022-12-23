package i60;

import ce0.C21100e;
import com.moovit.payment.registration.AccountAuthType;
import com.moovit.payment.registration.PaymentRegistrationInstructions;

/* renamed from: i60.a */
public final class C17559a {

    /* renamed from: a */
    public final AccountAuthType f45165a;

    /* renamed from: b */
    public final String f45166b;

    /* renamed from: c */
    public final boolean f45167c;

    /* renamed from: d */
    public final PaymentRegistrationInstructions f45168d;

    public C17559a(AccountAuthType accountAuthType, String str, boolean z, PaymentRegistrationInstructions paymentRegistrationInstructions) {
        C21100e.m49373x(accountAuthType, "accountAuthType");
        this.f45165a = accountAuthType;
        C21100e.m49373x(str, "accountId");
        this.f45166b = str;
        this.f45167c = z;
        this.f45168d = paymentRegistrationInstructions;
    }
}

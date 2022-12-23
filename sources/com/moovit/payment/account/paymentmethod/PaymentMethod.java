package com.moovit.payment.account.paymentmethod;

import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.account.balance.BalancePaymentMethod;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import p583jk.C17884p;
import p977zz.C20975x0;

public abstract class PaymentMethod implements Parcelable {

    /* renamed from: b */
    public final PaymentMethodId f64052b;

    /* renamed from: c */
    public final boolean f64053c;

    /* renamed from: d */
    public final PaymentMethodStatus f64054d;

    /* renamed from: com.moovit.payment.account.paymentmethod.PaymentMethod$a */
    public interface C25688a<V, R> {
        /* renamed from: C1 */
        R mo48923C1(CreditCardPaymentMethod creditCardPaymentMethod, V v);

        /* renamed from: K0 */
        R mo48924K0(ExternalPaymentMethod externalPaymentMethod, V v);

        /* renamed from: u */
        R mo48929u(BalancePaymentMethod balancePaymentMethod, V v);

        /* renamed from: z0 */
        R mo48930z0(BankPaymentMethod bankPaymentMethod, V v);
    }

    public PaymentMethod(PaymentMethodId paymentMethodId, boolean z, PaymentMethodStatus paymentMethodStatus) {
        C21100e.m49373x(paymentMethodId, "paymentMethodId");
        this.f64052b = paymentMethodId;
        this.f64053c = z;
        this.f64054d = paymentMethodStatus;
    }

    /* renamed from: b */
    public abstract <V, R> R mo83416b(C25688a<V, R> aVar, V v);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        if (!this.f64052b.equals(paymentMethod.f64052b) || this.f64053c != paymentMethod.f64053c || !C20975x0.m49118e(this.f64054d, paymentMethod.f64054d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(getClass()), C17884p.m44335F(this.f64052b), this.f64053c, C17884p.m44335F(this.f64054d));
    }
}

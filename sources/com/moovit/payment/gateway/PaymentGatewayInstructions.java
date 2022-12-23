package com.moovit.payment.gateway;

import android.os.Parcel;
import android.os.Parcelable;
import c00.C13723g;
import com.moovit.payment.account.balance.BalancePaymentMethod;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.cash.CashGateway;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGateway;
import com.moovit.payment.gateway.googlepay.GooglePayGateway;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGateway;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import e20.C16774f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p583jk.C17884p;
import p977zz.C20946j0;
import p977zz.C20975x0;
import w40.C25761d;

public class PaymentGatewayInstructions implements Parcelable {
    public static final Parcelable.Creator<PaymentGatewayInstructions> CREATOR = new C16324a();

    /* renamed from: b */
    public final C16325b f42677b = new C16325b();

    /* renamed from: c */
    public final List<PaymentGateway> f42678c;

    /* renamed from: d */
    public final CreditCardInstructions f42679d;

    /* renamed from: e */
    public final PaymentRegistrationInstructions f42680e;

    /* renamed from: com.moovit.payment.gateway.PaymentGatewayInstructions$a */
    public class C16324a implements Parcelable.Creator<PaymentGatewayInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return new PaymentGatewayInstructions(parcel);
        }

        public final Object[] newArray(int i) {
            return new PaymentGatewayInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.gateway.PaymentGatewayInstructions$b */
    public static class C16325b implements PaymentGateway.C16321b<PaymentGatewayType, Boolean>, PaymentMethod.C25688a<PaymentGatewayType, Boolean> {
        /* renamed from: C1 */
        public final Object mo48923C1(CreditCardPaymentMethod creditCardPaymentMethod, Object obj) {
            PaymentGatewayType paymentGatewayType = (PaymentGatewayType) obj;
            return Boolean.valueOf(creditCardPaymentMethod.f64053c);
        }

        /* renamed from: K0 */
        public final Object mo48924K0(ExternalPaymentMethod externalPaymentMethod, Object obj) {
            PaymentGatewayType paymentGatewayType = (PaymentGatewayType) obj;
            return Boolean.valueOf(externalPaymentMethod.f64053c);
        }

        /* renamed from: O */
        public final Object mo48919O(ClearanceProviderGateway clearanceProviderGateway, Object obj) {
            clearanceProviderGateway.getClass();
            return Boolean.valueOf(C20975x0.m49118e((PaymentGatewayType) obj, PaymentGatewayType.CLEARANCE_PROVIDER));
        }

        /* renamed from: d1 */
        public final Object mo48920d1(GooglePayGateway googlePayGateway, Object obj) {
            googlePayGateway.getClass();
            return Boolean.valueOf(C20975x0.m49118e((PaymentGatewayType) obj, PaymentGatewayType.GOOGLE_PAY));
        }

        /* renamed from: u */
        public final Object mo48929u(BalancePaymentMethod balancePaymentMethod, Object obj) {
            PaymentGatewayType paymentGatewayType = (PaymentGatewayType) obj;
            return Boolean.valueOf(balancePaymentMethod.f64053c);
        }

        /* renamed from: u1 */
        public final Object mo48921u1(CashGateway cashGateway, Object obj) {
            cashGateway.getClass();
            return Boolean.valueOf(C20975x0.m49118e((PaymentGatewayType) obj, PaymentGatewayType.CASH));
        }

        /* renamed from: w1 */
        public final Object mo48922w1(PaymentMethodGateway paymentMethodGateway, Object obj) {
            PaymentGatewayType paymentGatewayType = (PaymentGatewayType) obj;
            paymentMethodGateway.getClass();
            if (C20975x0.m49118e(paymentGatewayType, PaymentGatewayType.PAYMENT_METHOD)) {
                return (Boolean) paymentMethodGateway.f42704b.mo83416b(this, paymentGatewayType);
            }
            return Boolean.FALSE;
        }

        /* renamed from: z0 */
        public final Object mo48930z0(BankPaymentMethod bankPaymentMethod, Object obj) {
            PaymentGatewayType paymentGatewayType = (PaymentGatewayType) obj;
            return Boolean.valueOf(bankPaymentMethod.f64053c);
        }
    }

    public PaymentGatewayInstructions(ArrayList arrayList, CreditCardInstructions creditCardInstructions, PaymentRegistrationInstructions paymentRegistrationInstructions) {
        this.f42678c = Collections.unmodifiableList(arrayList);
        this.f42679d = creditCardInstructions;
        this.f42680e = paymentRegistrationInstructions;
    }

    /* renamed from: b */
    public final PaymentGateway mo48937b() {
        return (PaymentGateway) C13723g.m34286g(this.f42678c, new C16774f(1, this, (PaymentGatewayType) C25761d.f64268e.mo19759a(C25761d.m64299a().mo83589d())));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentGatewayInstructions)) {
            return false;
        }
        PaymentGatewayInstructions paymentGatewayInstructions = (PaymentGatewayInstructions) obj;
        if (!this.f42678c.equals(paymentGatewayInstructions.f42678c) || !C20975x0.m49118e(this.f42679d, paymentGatewayInstructions.f42679d) || !C20975x0.m49118e(this.f42680e, paymentGatewayInstructions.f42680e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42678c), C17884p.m44335F(this.f42679d), C17884p.m44335F(this.f42680e));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C20946j0.m49055b(i, parcel, this.f42678c);
        parcel.writeParcelable(this.f42679d, i);
        parcel.writeParcelable(this.f42680e, i);
    }

    public PaymentGatewayInstructions(Parcel parcel) {
        this.f42678c = Collections.unmodifiableList(C20946j0.m49054a(parcel, PaymentGateway.class));
        this.f42679d = (CreditCardInstructions) parcel.readParcelable(CreditCardInstructions.class.getClassLoader());
        this.f42680e = (PaymentRegistrationInstructions) parcel.readParcelable(PaymentRegistrationInstructions.class.getClassLoader());
    }
}

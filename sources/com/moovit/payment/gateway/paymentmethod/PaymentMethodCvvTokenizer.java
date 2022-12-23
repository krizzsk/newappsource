package com.moovit.payment.gateway.paymentmethod;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.MoovitActivity;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.gateway.PaymentGateway;
import d60.C16535a;

public class PaymentMethodCvvTokenizer extends PaymentGateway.Tokenizer {
    public static final Parcelable.Creator<PaymentMethodCvvTokenizer> CREATOR = new C16343a();

    /* renamed from: d */
    public final CreditCardPaymentMethod f42702d;

    /* renamed from: e */
    public C16535a f42703e = null;

    /* renamed from: com.moovit.payment.gateway.paymentmethod.PaymentMethodCvvTokenizer$a */
    public class C16343a implements Parcelable.Creator<PaymentMethodCvvTokenizer> {
        public final Object createFromParcel(Parcel parcel) {
            return new PaymentMethodCvvTokenizer(parcel);
        }

        public final Object[] newArray(int i) {
            return new PaymentMethodCvvTokenizer[i];
        }
    }

    public PaymentMethodCvvTokenizer(CreditCardPaymentMethod creditCardPaymentMethod) {
        C21100e.m49373x(creditCardPaymentMethod, "paymentMethod");
        this.f42702d = creditCardPaymentMethod;
    }

    /* renamed from: d */
    public final void mo48914d() {
        C16535a aVar = this.f42703e;
        if (aVar != null) {
            aVar.dismissAllowingStateLoss();
            this.f42703e = null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void mo48908f(MoovitActivity moovitActivity) {
        CreditCardPaymentMethod creditCardPaymentMethod = this.f42702d;
        C16535a aVar = new C16535a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("paymentMethod", creditCardPaymentMethod);
        aVar.setArguments(bundle);
        this.f42703e = aVar;
        aVar.f43163l = this;
        aVar.show(moovitActivity.getSupportFragmentManager(), "payment_extra_info_cvv");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f42702d, i);
    }

    public PaymentMethodCvvTokenizer(Parcel parcel) {
        super(parcel);
        CreditCardPaymentMethod creditCardPaymentMethod = (CreditCardPaymentMethod) parcel.readParcelable(CreditCardPaymentMethod.class.getClassLoader());
        C21100e.m49373x(creditCardPaymentMethod, "paymentMethod");
        this.f42702d = creditCardPaymentMethod;
    }
}

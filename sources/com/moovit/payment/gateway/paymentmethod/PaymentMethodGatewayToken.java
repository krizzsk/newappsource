package com.moovit.payment.gateway.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.account.paymentmethod.PaymentMethodId;
import com.moovit.payment.gateway.PaymentGatewayToken;

public class PaymentMethodGatewayToken implements PaymentGatewayToken {
    public static final Parcelable.Creator<PaymentMethodGatewayToken> CREATOR = new C16346a();

    /* renamed from: b */
    public final PaymentMethodId f42706b;

    /* renamed from: c */
    public final String f42707c;

    /* renamed from: com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken$a */
    public class C16346a implements Parcelable.Creator<PaymentMethodGatewayToken> {
        public final Object createFromParcel(Parcel parcel) {
            return new PaymentMethodGatewayToken(parcel);
        }

        public final Object[] newArray(int i) {
            return new PaymentMethodGatewayToken[i];
        }
    }

    public PaymentMethodGatewayToken(PaymentMethodId paymentMethodId, String str) {
        C21100e.m49373x(paymentMethodId, "paymentMethodId");
        this.f42706b = paymentMethodId;
        this.f42707c = str;
    }

    /* renamed from: S */
    public final <V, R> R mo48944S(PaymentGatewayToken.C16326a<V, R> aVar, V v) {
        return aVar.mo22682f(this, v);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42706b, i);
        parcel.writeString(this.f42707c);
    }

    public PaymentMethodGatewayToken(Parcel parcel) {
        PaymentMethodId paymentMethodId = (PaymentMethodId) parcel.readParcelable(PaymentMethodId.class.getClassLoader());
        C21100e.m49373x(paymentMethodId, "paymentMethodId");
        this.f42706b = paymentMethodId;
        this.f42707c = parcel.readString();
    }
}

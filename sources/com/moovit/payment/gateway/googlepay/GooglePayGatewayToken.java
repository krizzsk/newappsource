package com.moovit.payment.gateway.googlepay;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.gateway.PaymentGatewayToken;

public class GooglePayGatewayToken implements PaymentGatewayToken {
    public static final Parcelable.Creator<GooglePayGatewayToken> CREATOR = new C16339a();

    /* renamed from: b */
    public final String f42698b;

    /* renamed from: com.moovit.payment.gateway.googlepay.GooglePayGatewayToken$a */
    public class C16339a implements Parcelable.Creator<GooglePayGatewayToken> {
        public final Object createFromParcel(Parcel parcel) {
            return new GooglePayGatewayToken(parcel);
        }

        public final Object[] newArray(int i) {
            return new GooglePayGatewayToken[i];
        }
    }

    public GooglePayGatewayToken(String str) {
        C21100e.m49373x(str, "paymentData");
        this.f42698b = str;
    }

    /* renamed from: S */
    public final <V, R> R mo48944S(PaymentGatewayToken.C16326a<V, R> aVar, V v) {
        return aVar.mo22683j(this, v);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42698b);
    }

    public GooglePayGatewayToken(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "paymentData");
        this.f42698b = readString;
    }
}

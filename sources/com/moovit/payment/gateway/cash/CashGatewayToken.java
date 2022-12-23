package com.moovit.payment.gateway.cash;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.payment.gateway.PaymentGatewayToken;

public class CashGatewayToken implements PaymentGatewayToken {
    public static final Parcelable.Creator<CashGatewayToken> CREATOR = new C16333a();

    /* renamed from: com.moovit.payment.gateway.cash.CashGatewayToken$a */
    public class C16333a implements Parcelable.Creator<CashGatewayToken> {
        public final Object createFromParcel(Parcel parcel) {
            return new CashGatewayToken();
        }

        public final Object[] newArray(int i) {
            return new CashGatewayToken[i];
        }
    }

    /* renamed from: S */
    public final <V, R> R mo48944S(PaymentGatewayToken.C16326a<V, R> aVar, V v) {
        return aVar.mo22679c(this, v);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}

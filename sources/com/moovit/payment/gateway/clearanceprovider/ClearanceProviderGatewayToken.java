package com.moovit.payment.gateway.clearanceprovider;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.gateway.PaymentGatewayToken;

public class ClearanceProviderGatewayToken implements PaymentGatewayToken {
    public static final Parcelable.Creator<ClearanceProviderGatewayToken> CREATOR = new C16336a();

    /* renamed from: b */
    public final ClearanceProviderType f42692b;

    /* renamed from: c */
    public final String f42693c;

    /* renamed from: com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGatewayToken$a */
    public class C16336a implements Parcelable.Creator<ClearanceProviderGatewayToken> {
        public final Object createFromParcel(Parcel parcel) {
            return new ClearanceProviderGatewayToken(parcel);
        }

        public final Object[] newArray(int i) {
            return new ClearanceProviderGatewayToken[i];
        }
    }

    public ClearanceProviderGatewayToken(ClearanceProviderType clearanceProviderType, String str) {
        this.f42692b = clearanceProviderType;
        this.f42693c = str;
    }

    /* renamed from: S */
    public final <V, R> R mo48944S(PaymentGatewayToken.C16326a<V, R> aVar, V v) {
        return aVar.mo22681d(this, v);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42692b, i);
        parcel.writeString(this.f42693c);
    }

    public ClearanceProviderGatewayToken(Parcel parcel) {
        ClearanceProviderType clearanceProviderType = (ClearanceProviderType) parcel.readParcelable(ClearanceProviderType.class.getClassLoader());
        C21100e.m49373x(clearanceProviderType, "type");
        this.f42692b = clearanceProviderType;
        String readString = parcel.readString();
        C21100e.m49373x(readString, "paymentToken");
        this.f42693c = readString;
    }
}

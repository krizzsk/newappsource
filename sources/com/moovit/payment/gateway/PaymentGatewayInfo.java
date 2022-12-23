package com.moovit.payment.gateway;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p583jk.C17884p;
import p977zz.C20975x0;

public class PaymentGatewayInfo implements Parcelable {
    public static final Parcelable.Creator<PaymentGatewayInfo> CREATOR = new C16323a();

    /* renamed from: b */
    public final String f42673b;

    /* renamed from: c */
    public final PurchaseVerificationType f42674c;

    /* renamed from: d */
    public final String f42675d;

    /* renamed from: e */
    public final Map<String, String> f42676e;

    /* renamed from: com.moovit.payment.gateway.PaymentGatewayInfo$a */
    public class C16323a implements Parcelable.Creator<PaymentGatewayInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new PaymentGatewayInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new PaymentGatewayInfo[i];
        }
    }

    public PaymentGatewayInfo(String str, PurchaseVerificationType purchaseVerificationType, String str2, Map<String, String> map) {
        Map<String, String> map2;
        C21100e.m49373x(str, "paymentContext");
        this.f42673b = str;
        C21100e.m49373x(purchaseVerificationType, "verificationType");
        this.f42674c = purchaseVerificationType;
        this.f42675d = str2;
        if (map == null) {
            map2 = Collections.emptyMap();
        } else {
            map2 = Collections.unmodifiableMap(map);
        }
        this.f42676e = map2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentGatewayInfo)) {
            return false;
        }
        PaymentGatewayInfo paymentGatewayInfo = (PaymentGatewayInfo) obj;
        if (!this.f42673b.equals(paymentGatewayInfo.f42673b) || this.f42674c != paymentGatewayInfo.f42674c || !C20975x0.m49118e(this.f42675d, paymentGatewayInfo.f42675d) || !this.f42676e.equals(paymentGatewayInfo.f42676e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42673b), C17884p.m44335F(this.f42674c), C17884p.m44335F(this.f42675d), C17884p.m44335F(this.f42676e));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42673b);
        parcel.writeParcelable(this.f42674c, i);
        parcel.writeString(this.f42675d);
        parcel.writeMap(this.f42676e);
    }

    public PaymentGatewayInfo(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "paymentContext");
        this.f42673b = readString;
        PurchaseVerificationType purchaseVerificationType = (PurchaseVerificationType) parcel.readParcelable(PurchaseVerificationType.class.getClassLoader());
        C21100e.m49373x(purchaseVerificationType, "verificationType");
        this.f42674c = purchaseVerificationType;
        this.f42675d = parcel.readString();
        HashMap hashMap = new HashMap();
        parcel.readMap(hashMap, String.class.getClassLoader());
        this.f42676e = Collections.unmodifiableMap(hashMap);
    }
}

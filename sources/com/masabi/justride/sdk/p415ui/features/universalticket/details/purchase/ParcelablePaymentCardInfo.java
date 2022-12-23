package com.masabi.justride.sdk.p415ui.features.universalticket.details.purchase;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/features/universalticket/details/purchase/ParcelablePaymentCardInfo;", "Landroid/os/Parcelable;", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.details.purchase.ParcelablePaymentCardInfo */
public final class ParcelablePaymentCardInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelablePaymentCardInfo> CREATOR = new C14671a();

    /* renamed from: b */
    public final String f37239b;

    /* renamed from: c */
    public final String f37240c;

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.details.purchase.ParcelablePaymentCardInfo$a */
    public static class C14671a implements Parcelable.Creator<ParcelablePaymentCardInfo> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new ParcelablePaymentCardInfo(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new ParcelablePaymentCardInfo[i];
        }
    }

    public ParcelablePaymentCardInfo(String str, String str2) {
        C24362h.m61211f(str, "maskedPan");
        C24362h.m61211f(str2, "paymentCardType");
        this.f37239b = str;
        this.f37240c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelablePaymentCardInfo)) {
            return false;
        }
        ParcelablePaymentCardInfo parcelablePaymentCardInfo = (ParcelablePaymentCardInfo) obj;
        return C24362h.m61206a(this.f37239b, parcelablePaymentCardInfo.f37239b) && C24362h.m61206a(this.f37240c, parcelablePaymentCardInfo.f37240c);
    }

    public final int hashCode() {
        String str = this.f37239b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f37240c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ParcelablePaymentCardInfo(maskedPan=");
        k.append(this.f37239b);
        k.append(", paymentCardType=");
        return C0016g.m31o(k, this.f37240c, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeString(this.f37239b);
        parcel.writeString(this.f37240c);
    }
}

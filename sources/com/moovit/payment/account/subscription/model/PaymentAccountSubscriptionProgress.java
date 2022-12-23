package com.moovit.payment.account.subscription.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/payment/account/subscription/model/PaymentAccountSubscriptionProgress;", "Landroid/os/Parcelable;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class PaymentAccountSubscriptionProgress implements Parcelable {
    public static final Parcelable.Creator<PaymentAccountSubscriptionProgress> CREATOR = new C25716a();

    /* renamed from: b */
    public final String f64140b;

    /* renamed from: c */
    public final String f64141c;

    /* renamed from: d */
    public final int f64142d;

    /* renamed from: com.moovit.payment.account.subscription.model.PaymentAccountSubscriptionProgress$a */
    public static final class C25716a implements Parcelable.Creator<PaymentAccountSubscriptionProgress> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new PaymentAccountSubscriptionProgress(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new PaymentAccountSubscriptionProgress[i];
        }
    }

    public PaymentAccountSubscriptionProgress(String str, String str2, int i) {
        C24362h.m61211f(str, "label");
        this.f64140b = str;
        this.f64141c = str2;
        this.f64142d = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentAccountSubscriptionProgress)) {
            return false;
        }
        PaymentAccountSubscriptionProgress paymentAccountSubscriptionProgress = (PaymentAccountSubscriptionProgress) obj;
        return C24362h.m61206a(this.f64140b, paymentAccountSubscriptionProgress.f64140b) && C24362h.m61206a(this.f64141c, paymentAccountSubscriptionProgress.f64141c) && this.f64142d == paymentAccountSubscriptionProgress.f64142d;
    }

    public final int hashCode() {
        int hashCode = this.f64140b.hashCode() * 31;
        String str = this.f64141c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f64142d;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PaymentAccountSubscriptionProgress(label=");
        k.append(this.f64140b);
        k.append(", accessibilityLabel=");
        k.append(this.f64141c);
        k.append(", percentValue=");
        return C16530d.m42014g(k, this.f64142d, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f64140b);
        parcel.writeString(this.f64141c);
        parcel.writeInt(this.f64142d);
    }
}

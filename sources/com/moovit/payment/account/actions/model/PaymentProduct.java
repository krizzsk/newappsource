package com.moovit.payment.account.actions.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.util.PriceInfo;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/model/PaymentProduct;", "Landroid/os/Parcelable;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class PaymentProduct implements Parcelable {
    public static final Parcelable.Creator<PaymentProduct> CREATOR = new C25622a();

    /* renamed from: b */
    public final String f63906b;

    /* renamed from: c */
    public final String f63907c;

    /* renamed from: d */
    public final PriceInfo f63908d;

    /* renamed from: com.moovit.payment.account.actions.model.PaymentProduct$a */
    public static final class C25622a implements Parcelable.Creator<PaymentProduct> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new PaymentProduct(parcel.readString(), parcel.readString(), (PriceInfo) parcel.readParcelable(PaymentProduct.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new PaymentProduct[i];
        }
    }

    public PaymentProduct(String str, String str2, PriceInfo priceInfo) {
        this.f63906b = str;
        this.f63907c = str2;
        this.f63908d = priceInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentProduct)) {
            return false;
        }
        PaymentProduct paymentProduct = (PaymentProduct) obj;
        return C24362h.m61206a(this.f63906b, paymentProduct.f63906b) && C24362h.m61206a(this.f63907c, paymentProduct.f63907c) && C24362h.m61206a(this.f63908d, paymentProduct.f63908d);
    }

    public final int hashCode() {
        String str = this.f63906b;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f63907c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PriceInfo priceInfo = this.f63908d;
        if (priceInfo != null) {
            i = priceInfo.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PaymentProduct(title=");
        k.append(this.f63906b);
        k.append(", subtitle=");
        k.append(this.f63907c);
        k.append(", priceInfo=");
        k.append(this.f63908d);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f63906b);
        parcel.writeString(this.f63907c);
        parcel.writeParcelable(this.f63908d, i);
    }
}

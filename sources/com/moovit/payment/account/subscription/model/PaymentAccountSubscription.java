package com.moovit.payment.account.subscription.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.util.InfoBoxData;
import com.moovit.util.PriceInfo;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/payment/account/subscription/model/PaymentAccountSubscription;", "Landroid/os/Parcelable;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class PaymentAccountSubscription implements Parcelable {
    public static final Parcelable.Creator<PaymentAccountSubscription> CREATOR = new C25715a();

    /* renamed from: b */
    public final String f64132b;

    /* renamed from: c */
    public final String f64133c;

    /* renamed from: d */
    public final String f64134d;

    /* renamed from: e */
    public final PriceInfo f64135e;

    /* renamed from: f */
    public final PaymentAccountSubscriptionProgress f64136f;

    /* renamed from: g */
    public final InfoBoxData f64137g;

    /* renamed from: h */
    public final String f64138h;

    /* renamed from: i */
    public final Long f64139i;

    /* renamed from: com.moovit.payment.account.subscription.model.PaymentAccountSubscription$a */
    public static final class C25715a implements Parcelable.Creator<PaymentAccountSubscription> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new PaymentAccountSubscription(parcel.readString(), parcel.readString(), parcel.readString(), (PriceInfo) parcel.readParcelable(PaymentAccountSubscription.class.getClassLoader()), parcel.readInt() == 0 ? null : PaymentAccountSubscriptionProgress.CREATOR.createFromParcel(parcel), (InfoBoxData) parcel.readParcelable(PaymentAccountSubscription.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        public final Object[] newArray(int i) {
            return new PaymentAccountSubscription[i];
        }
    }

    public PaymentAccountSubscription(String str, String str2, String str3, PriceInfo priceInfo, PaymentAccountSubscriptionProgress paymentAccountSubscriptionProgress, InfoBoxData infoBoxData, String str4, Long l) {
        C24362h.m61211f(str, "identifier");
        this.f64132b = str;
        this.f64133c = str2;
        this.f64134d = str3;
        this.f64135e = priceInfo;
        this.f64136f = paymentAccountSubscriptionProgress;
        this.f64137g = infoBoxData;
        this.f64138h = str4;
        this.f64139i = l;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentAccountSubscription)) {
            return false;
        }
        PaymentAccountSubscription paymentAccountSubscription = (PaymentAccountSubscription) obj;
        return C24362h.m61206a(this.f64132b, paymentAccountSubscription.f64132b) && C24362h.m61206a(this.f64133c, paymentAccountSubscription.f64133c) && C24362h.m61206a(this.f64134d, paymentAccountSubscription.f64134d) && C24362h.m61206a(this.f64135e, paymentAccountSubscription.f64135e) && C24362h.m61206a(this.f64136f, paymentAccountSubscription.f64136f) && C24362h.m61206a(this.f64137g, paymentAccountSubscription.f64137g) && C24362h.m61206a(this.f64138h, paymentAccountSubscription.f64138h) && C24362h.m61206a(this.f64139i, paymentAccountSubscription.f64139i);
    }

    public final int hashCode() {
        int hashCode = this.f64132b.hashCode() * 31;
        String str = this.f64133c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64134d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PriceInfo priceInfo = this.f64135e;
        int hashCode4 = (hashCode3 + (priceInfo == null ? 0 : priceInfo.hashCode())) * 31;
        PaymentAccountSubscriptionProgress paymentAccountSubscriptionProgress = this.f64136f;
        int hashCode5 = (hashCode4 + (paymentAccountSubscriptionProgress == null ? 0 : paymentAccountSubscriptionProgress.hashCode())) * 31;
        InfoBoxData infoBoxData = this.f64137g;
        int hashCode6 = (hashCode5 + (infoBoxData == null ? 0 : infoBoxData.hashCode())) * 31;
        String str3 = this.f64138h;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f64139i;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PaymentAccountSubscription(identifier=");
        k.append(this.f64132b);
        k.append(", title=");
        k.append(this.f64133c);
        k.append(", subtitle=");
        k.append(this.f64134d);
        k.append(", priceInfo=");
        k.append(this.f64135e);
        k.append(", progress=");
        k.append(this.f64136f);
        k.append(", infoBoxData=");
        k.append(this.f64137g);
        k.append(", detailsHtml=");
        k.append(this.f64138h);
        k.append(", startTime=");
        k.append(this.f64139i);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f64132b);
        parcel.writeString(this.f64133c);
        parcel.writeString(this.f64134d);
        parcel.writeParcelable(this.f64135e, i);
        PaymentAccountSubscriptionProgress paymentAccountSubscriptionProgress = this.f64136f;
        if (paymentAccountSubscriptionProgress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentAccountSubscriptionProgress.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f64137g, i);
        parcel.writeString(this.f64138h);
        Long l = this.f64139i;
        if (l == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l.longValue());
    }
}

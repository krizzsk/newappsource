package com.moovit.app.subscription.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.outgoing.TwitterUser;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import p583jk.C17884p;

public class SubscriptionDetails implements Parcelable {
    public static final Parcelable.Creator<SubscriptionDetails> CREATOR = new C15366a();

    /* renamed from: b */
    public final String f39788b;

    /* renamed from: c */
    public final CurrencyAmount f39789c;

    /* renamed from: d */
    public final String f39790d;

    /* renamed from: e */
    public final String f39791e;

    /* renamed from: f */
    public final SubscriptionPeriod f39792f;

    /* renamed from: g */
    public final String f39793g;

    /* renamed from: h */
    public final CurrencyAmount f39794h;

    /* renamed from: i */
    public final SubscriptionPeriod f39795i;

    /* renamed from: com.moovit.app.subscription.model.SubscriptionDetails$a */
    public class C15366a implements Parcelable.Creator<SubscriptionDetails> {
        public final Object createFromParcel(Parcel parcel) {
            return new SubscriptionDetails(parcel);
        }

        public final Object[] newArray(int i) {
            return new SubscriptionDetails[i];
        }
    }

    public SubscriptionDetails(String str, CurrencyAmount currencyAmount, String str2, String str3, SubscriptionPeriod subscriptionPeriod, String str4, SubscriptionPeriod subscriptionPeriod2) {
        C21100e.m49373x(str, "sku");
        this.f39788b = str;
        this.f39789c = currencyAmount;
        C21100e.m49373x(str2, "title");
        this.f39790d = str2;
        C21100e.m49373x(str3, TwitterUser.DESCRIPTION_KEY);
        this.f39791e = str3;
        this.f39792f = subscriptionPeriod;
        C21100e.m49373x(str4, "jsonSkuDetails");
        this.f39793g = str4;
        this.f39794h = m39324b(subscriptionPeriod, currencyAmount);
        this.f39795i = subscriptionPeriod2;
    }

    /* renamed from: b */
    public static CurrencyAmount m39324b(SubscriptionPeriod subscriptionPeriod, CurrencyAmount currencyAmount) {
        return new CurrencyAmount(currencyAmount.f23844b, new BigDecimal(Math.floor((currencyAmount.f23845c.doubleValue() / (((double) subscriptionPeriod.f39797c.toTotalMonths()) + ((((double) subscriptionPeriod.f39797c.getDays()) / 7.0d) / 4.0d))) * 100.0d) / 100.0d));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionDetails)) {
            return false;
        }
        return this.f39788b.equals(((SubscriptionDetails) obj).f39788b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f39788b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39788b);
        parcel.writeParcelable(this.f39789c, i);
        parcel.writeString(this.f39790d);
        parcel.writeString(this.f39791e);
        parcel.writeParcelable(this.f39792f, i);
        parcel.writeString(this.f39793g);
        parcel.writeParcelable(this.f39795i, i);
    }

    public SubscriptionDetails(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "sku");
        this.f39788b = readString;
        CurrencyAmount currencyAmount = (CurrencyAmount) parcel.readParcelable(CurrencyAmount.class.getClassLoader());
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f39789c = currencyAmount;
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "title");
        this.f39790d = readString2;
        String readString3 = parcel.readString();
        C21100e.m49373x(readString3, TwitterUser.DESCRIPTION_KEY);
        this.f39791e = readString3;
        SubscriptionPeriod subscriptionPeriod = (SubscriptionPeriod) parcel.readParcelable(SubscriptionPeriod.class.getClassLoader());
        C21100e.m49373x(subscriptionPeriod, "subscriptionPeriod");
        this.f39792f = subscriptionPeriod;
        String readString4 = parcel.readString();
        C21100e.m49373x(readString4, "jsonSkuDetails");
        this.f39793g = readString4;
        this.f39794h = m39324b(subscriptionPeriod, currencyAmount);
        this.f39795i = (SubscriptionPeriod) parcel.readParcelable(SubscriptionPeriod.class.getClassLoader());
    }
}

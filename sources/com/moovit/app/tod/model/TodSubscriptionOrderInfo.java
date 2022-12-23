package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/tod/model/TodSubscriptionOrderInfo;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodSubscriptionOrderInfo implements Parcelable {
    public static final Parcelable.Creator<TodSubscriptionOrderInfo> CREATOR = new C15521a();

    /* renamed from: b */
    public final int f40320b;

    /* renamed from: c */
    public final CurrencyAmount f40321c;

    /* renamed from: com.moovit.app.tod.model.TodSubscriptionOrderInfo$a */
    public static final class C15521a implements Parcelable.Creator<TodSubscriptionOrderInfo> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new TodSubscriptionOrderInfo(parcel.readInt(), (CurrencyAmount) parcel.readParcelable(TodSubscriptionOrderInfo.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new TodSubscriptionOrderInfo[i];
        }
    }

    public TodSubscriptionOrderInfo(int i, CurrencyAmount currencyAmount) {
        C24362h.m61211f(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f40320b = i;
        this.f40321c = currencyAmount;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodSubscriptionOrderInfo)) {
            return false;
        }
        TodSubscriptionOrderInfo todSubscriptionOrderInfo = (TodSubscriptionOrderInfo) obj;
        return this.f40320b == todSubscriptionOrderInfo.f40320b && C24362h.m61206a(this.f40321c, todSubscriptionOrderInfo.f40321c);
    }

    public final int hashCode() {
        return this.f40321c.hashCode() + (this.f40320b * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodSubscriptionOrderInfo(numberOfPassengers=");
        k.append(this.f40320b);
        k.append(", price=");
        k.append(this.f40321c);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeInt(this.f40320b);
        parcel.writeParcelable(this.f40321c, i);
    }
}

package com.moovit.app.wondo.tickets.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.outgoing.TwitterUser;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;

public class WondoOfferPrice implements Parcelable {
    public static final Parcelable.Creator<WondoOfferPrice> CREATOR = new C15660a();

    /* renamed from: b */
    public final List<Item> f40731b;

    /* renamed from: c */
    public final CurrencyAmount f40732c;

    /* renamed from: com.moovit.app.wondo.tickets.model.WondoOfferPrice$a */
    public class C15660a implements Parcelable.Creator<WondoOfferPrice> {
        public final Object createFromParcel(Parcel parcel) {
            return new WondoOfferPrice(parcel);
        }

        public final Object[] newArray(int i) {
            return new WondoOfferPrice[i];
        }
    }

    public WondoOfferPrice(ArrayList arrayList) {
        this.f40731b = arrayList;
        this.f40732c = m39980b(arrayList);
    }

    /* renamed from: b */
    public static CurrencyAmount m39980b(ArrayList arrayList) {
        CurrencyAmount currencyAmount = ((Item) arrayList.get(0)).f40734c;
        for (int i = 1; i < arrayList.size(); i++) {
            currencyAmount = CurrencyAmount.m17926b(currencyAmount, ((Item) arrayList.get(i)).f40734c);
        }
        return currencyAmount;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f40731b);
    }

    public static class Item implements Parcelable {
        public static final Parcelable.Creator<Item> CREATOR = new C15659a();

        /* renamed from: b */
        public final String f40733b;

        /* renamed from: c */
        public final CurrencyAmount f40734c;

        /* renamed from: com.moovit.app.wondo.tickets.model.WondoOfferPrice$Item$a */
        public class C15659a implements Parcelable.Creator<Item> {
            public final Object createFromParcel(Parcel parcel) {
                return new Item(parcel);
            }

            public final Object[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(String str, CurrencyAmount currencyAmount) {
            C21100e.m49373x(str, TwitterUser.DESCRIPTION_KEY);
            this.f40733b = str;
            C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
            this.f40734c = currencyAmount;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f40733b);
            parcel.writeParcelable(this.f40734c, i);
        }

        public Item(Parcel parcel) {
            this.f40733b = parcel.readString();
            this.f40734c = (CurrencyAmount) parcel.readParcelable(CurrencyAmount.class.getClassLoader());
        }
    }

    public WondoOfferPrice(Parcel parcel) {
        ArrayList<Item> createTypedArrayList = parcel.createTypedArrayList(Item.CREATOR);
        this.f40731b = createTypedArrayList;
        this.f40732c = m39980b(createTypedArrayList);
    }
}

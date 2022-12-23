package com.moovit.app.tod.shuttle.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.util.CurrencyAmount;

public class TodTripOrder implements Parcelable {
    public static final Parcelable.Creator<TodTripOrder> CREATOR = new C15564a();

    /* renamed from: b */
    public final String f40438b;

    /* renamed from: c */
    public final CurrencyAmount f40439c;

    /* renamed from: d */
    public final TodTripOrderProposals f40440d;

    /* renamed from: com.moovit.app.tod.shuttle.model.TodTripOrder$a */
    public class C15564a implements Parcelable.Creator<TodTripOrder> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodTripOrder(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodTripOrder[i];
        }
    }

    public TodTripOrder(String str, CurrencyAmount currencyAmount, TodTripOrderProposals todTripOrderProposals) {
        C21100e.m49373x(str, "rideId");
        this.f40438b = str;
        this.f40439c = currencyAmount;
        this.f40440d = todTripOrderProposals;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40438b);
        parcel.writeParcelable(this.f40439c, i);
        parcel.writeParcelable(this.f40440d, i);
    }

    public TodTripOrder(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "rideId");
        this.f40438b = readString;
        this.f40439c = (CurrencyAmount) parcel.readParcelable(CurrencyAmount.class.getClassLoader());
        TodTripOrderProposals todTripOrderProposals = (TodTripOrderProposals) parcel.readParcelable(TodTripOrderProposals.class.getClassLoader());
        C21100e.m49373x(todTripOrderProposals, "orderProposals");
        this.f40440d = todTripOrderProposals;
    }
}

package com.moovit.app.subscription.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import p988j$.time.Period;

public class SubscriptionPeriod implements Parcelable {
    public static final Parcelable.Creator<SubscriptionPeriod> CREATOR = new C15367a();

    /* renamed from: b */
    public final String f39796b;

    /* renamed from: c */
    public final Period f39797c;

    /* renamed from: com.moovit.app.subscription.model.SubscriptionPeriod$a */
    public class C15367a implements Parcelable.Creator<SubscriptionPeriod> {
        public final Object createFromParcel(Parcel parcel) {
            return new SubscriptionPeriod(parcel);
        }

        public final Object[] newArray(int i) {
            return new SubscriptionPeriod[i];
        }
    }

    public SubscriptionPeriod(String str) {
        C21100e.m49373x(str, "rawPeriod");
        this.f39796b = str;
        this.f39797c = Period.parse(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39796b);
    }

    public SubscriptionPeriod(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "rawPeriod");
        this.f39796b = readString;
        this.f39797c = Period.parse(readString);
    }
}

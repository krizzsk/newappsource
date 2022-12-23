package com.moovit.app.wondo.tickets.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.util.Collections;
import java.util.List;

public class WondoRewards implements Parcelable {
    public static final Parcelable.Creator<WondoRewards> CREATOR = new C15664a();

    /* renamed from: b */
    public final List<WondoReward> f40745b;

    /* renamed from: c */
    public final String f40746c;

    /* renamed from: com.moovit.app.wondo.tickets.model.WondoRewards$a */
    public class C15664a implements Parcelable.Creator<WondoRewards> {
        public final Object createFromParcel(Parcel parcel) {
            return new WondoRewards(parcel);
        }

        public final Object[] newArray(int i) {
            return new WondoRewards[i];
        }
    }

    public WondoRewards(List<WondoReward> list, String str) {
        C21100e.m49373x(list, "rewards");
        this.f40745b = Collections.unmodifiableList(list);
        this.f40746c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f40745b);
        parcel.writeString(this.f40746c);
    }

    public WondoRewards(Parcel parcel) {
        this.f40745b = parcel.createTypedArrayList(WondoReward.CREATOR);
        this.f40746c = parcel.readString();
    }
}

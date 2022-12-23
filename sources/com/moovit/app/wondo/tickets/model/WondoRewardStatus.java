package com.moovit.app.wondo.tickets.model;

import android.os.Parcel;
import android.os.Parcelable;

public enum WondoRewardStatus implements Parcelable {
    AVAILABLE,
    REDEEMED,
    CANCELLED,
    TEST_CODE;
    
    public static final Parcelable.Creator<WondoRewardStatus> CREATOR = null;

    /* renamed from: com.moovit.app.wondo.tickets.model.WondoRewardStatus$a */
    public class C15663a implements Parcelable.Creator<WondoRewardStatus> {
        public final Object createFromParcel(Parcel parcel) {
            return WondoRewardStatus.valueOf(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new WondoRewardStatus[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C15663a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

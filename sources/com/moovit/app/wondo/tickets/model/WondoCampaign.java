package com.moovit.app.wondo.tickets.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;

public class WondoCampaign implements Parcelable {
    public static final Parcelable.Creator<WondoCampaign> CREATOR = new C15652a();

    /* renamed from: b */
    public final String f40694b;

    /* renamed from: c */
    public final WondoFullScreenDisplayInfo f40695c;

    /* renamed from: com.moovit.app.wondo.tickets.model.WondoCampaign$a */
    public class C15652a implements Parcelable.Creator<WondoCampaign> {
        public final Object createFromParcel(Parcel parcel) {
            return new WondoCampaign(parcel);
        }

        public final Object[] newArray(int i) {
            return new WondoCampaign[i];
        }
    }

    public WondoCampaign(String str, WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo) {
        C21100e.m49373x(str, "label");
        this.f40694b = str;
        this.f40695c = wondoFullScreenDisplayInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40694b);
        parcel.writeParcelable(this.f40695c, i);
    }

    public WondoCampaign(Parcel parcel) {
        this.f40694b = parcel.readString();
        this.f40695c = (WondoFullScreenDisplayInfo) parcel.readParcelable(WondoRewardDisplayInfo.class.getClassLoader());
    }
}

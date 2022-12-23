package com.moovit.app.wondo.tickets.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.moovit.network.model.ServerId;
import java.util.List;

public class WondoReward implements Parcelable {
    public static final Parcelable.Creator<WondoReward> CREATOR = new C15661a();

    /* renamed from: b */
    public final ServerId f40735b;

    /* renamed from: c */
    public final WondoRewardStatus f40736c;

    /* renamed from: d */
    public final WondoRewardDisplayInfo f40737d;

    /* renamed from: e */
    public final List<String> f40738e;

    /* renamed from: com.moovit.app.wondo.tickets.model.WondoReward$a */
    public class C15661a implements Parcelable.Creator<WondoReward> {
        public final Object createFromParcel(Parcel parcel) {
            return new WondoReward(parcel);
        }

        public final Object[] newArray(int i) {
            return new WondoReward[i];
        }
    }

    public WondoReward(ServerId serverId, WondoRewardStatus wondoRewardStatus, WondoRewardDisplayInfo wondoRewardDisplayInfo, List<String> list) {
        this.f40735b = serverId;
        C21100e.m49373x(wondoRewardStatus, ServerParameters.STATUS);
        this.f40736c = wondoRewardStatus;
        this.f40737d = wondoRewardDisplayInfo;
        C21100e.m49373x(list, "providers");
        this.f40738e = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f40735b, i);
        parcel.writeParcelable(this.f40736c, i);
        parcel.writeParcelable(this.f40737d, i);
        parcel.writeStringList(this.f40738e);
    }

    public WondoReward(Parcel parcel) {
        this.f40735b = (ServerId) parcel.readParcelable(ServerId.class.getClassLoader());
        this.f40736c = (WondoRewardStatus) parcel.readParcelable(WondoRewardStatus.class.getClassLoader());
        this.f40737d = (WondoRewardDisplayInfo) parcel.readParcelable(WondoRewardDisplayInfo.class.getClassLoader());
        this.f40738e = parcel.createStringArrayList();
    }
}

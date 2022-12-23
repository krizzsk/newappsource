package com.moovit.app.wondo.tickets.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;

public class WondoCode implements Parcelable {
    public static final Parcelable.Creator<WondoCode> CREATOR = new C15653a();

    /* renamed from: b */
    public final ServerId f40696b;

    /* renamed from: c */
    public final String f40697c;

    /* renamed from: d */
    public final WondoCodeDisplayInfo f40698d;

    /* renamed from: e */
    public final boolean f40699e;

    /* renamed from: f */
    public final boolean f40700f;

    /* renamed from: com.moovit.app.wondo.tickets.model.WondoCode$a */
    public class C15653a implements Parcelable.Creator<WondoCode> {
        public final Object createFromParcel(Parcel parcel) {
            return new WondoCode(parcel);
        }

        public final Object[] newArray(int i) {
            return new WondoCode[i];
        }
    }

    public WondoCode(ServerId serverId, String str, WondoCodeDisplayInfo wondoCodeDisplayInfo, boolean z, boolean z2) {
        this.f40696b = serverId;
        C21100e.m49373x(str, "code");
        this.f40697c = str;
        this.f40698d = wondoCodeDisplayInfo;
        this.f40699e = z;
        this.f40700f = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f40696b, i);
        parcel.writeString(this.f40697c);
        parcel.writeParcelable(this.f40698d, i);
        parcel.writeInt(this.f40699e ? 1 : 0);
        parcel.writeInt(this.f40700f ? 1 : 0);
    }

    public WondoCode(Parcel parcel) {
        this.f40696b = (ServerId) parcel.readParcelable(ServerId.class.getClassLoader());
        this.f40697c = parcel.readString();
        this.f40698d = (WondoCodeDisplayInfo) parcel.readParcelable(WondoCodeDisplayInfo.class.getClassLoader());
        boolean z = false;
        this.f40699e = parcel.readInt() == 1;
        this.f40700f = parcel.readInt() == 1 ? true : z;
    }
}

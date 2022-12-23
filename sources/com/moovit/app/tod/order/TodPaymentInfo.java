package com.moovit.app.tod.order;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;

public class TodPaymentInfo implements Parcelable {
    public static final Parcelable.Creator<TodPaymentInfo> CREATOR = new C15528a();

    /* renamed from: b */
    public final String f40363b;

    /* renamed from: c */
    public final String f40364c;

    /* renamed from: d */
    public final String f40365d;

    /* renamed from: com.moovit.app.tod.order.TodPaymentInfo$a */
    public class C15528a implements Parcelable.Creator<TodPaymentInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodPaymentInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodPaymentInfo[i];
        }
    }

    public TodPaymentInfo(String str, String str2, String str3) {
        C21100e.m49373x(str, "paymentContext");
        this.f40363b = str;
        C21100e.m49373x(str2, "paymentDescription");
        this.f40364c = str2;
        this.f40365d = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40363b);
        parcel.writeString(this.f40364c);
        parcel.writeString(this.f40365d);
    }

    public TodPaymentInfo(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "paymentContext");
        this.f40363b = readString;
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "paymentDescription");
        this.f40364c = readString2;
        this.f40365d = parcel.readString();
    }
}

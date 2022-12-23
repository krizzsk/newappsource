package com.moovit.app.help.helpcenter.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import p583jk.C17884p;

public class HelpCenterSimpleSection implements Parcelable {
    public static final Parcelable.Creator<HelpCenterSimpleSection> CREATOR = new C14909a();

    /* renamed from: b */
    public final long f38124b;

    /* renamed from: c */
    public final String f38125c;

    /* renamed from: com.moovit.app.help.helpcenter.model.HelpCenterSimpleSection$a */
    public class C14909a implements Parcelable.Creator<HelpCenterSimpleSection> {
        public final Object createFromParcel(Parcel parcel) {
            return new HelpCenterSimpleSection(parcel);
        }

        public final Object[] newArray(int i) {
            return new HelpCenterSimpleSection[i];
        }
    }

    public HelpCenterSimpleSection(long j, String str) {
        this.f38124b = j;
        C21100e.m49373x(str, "name");
        this.f38125c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HelpCenterSimpleSection) && this.f38124b == ((HelpCenterSimpleSection) obj).f38124b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C17884p.m44334E(this.f38124b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f38124b);
        parcel.writeString(this.f38125c);
    }

    public HelpCenterSimpleSection(Parcel parcel) {
        this.f38124b = parcel.readLong();
        String readString = parcel.readString();
        C21100e.m49373x(readString, "name");
        this.f38125c = readString;
    }
}

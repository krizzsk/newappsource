package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C14211a();

    /* renamed from: b */
    public final int f35702b;

    /* renamed from: c */
    public int f35703c;

    /* renamed from: d */
    public int f35704d;

    /* renamed from: e */
    public int f35705e;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    public class C14211a implements Parcelable.Creator<TimeModel> {
        public final Object createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0, 0, 10, 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.f35703c == timeModel.f35703c && this.f35704d == timeModel.f35704d && this.f35702b == timeModel.f35702b && this.f35705e == timeModel.f35705e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f35702b), Integer.valueOf(this.f35703c), Integer.valueOf(this.f35704d), Integer.valueOf(this.f35705e)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f35703c);
        parcel.writeInt(this.f35704d);
        parcel.writeInt(this.f35705e);
        parcel.writeInt(this.f35702b);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f35703c = i;
        this.f35704d = i2;
        this.f35705e = i3;
        this.f35702b = i4;
    }
}

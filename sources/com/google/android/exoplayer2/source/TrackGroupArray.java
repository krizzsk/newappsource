package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class TrackGroupArray implements Parcelable {
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new C3982a();

    /* renamed from: e */
    public static final TrackGroupArray f14011e = new TrackGroupArray(new TrackGroup[0]);

    /* renamed from: b */
    public final int f14012b;

    /* renamed from: c */
    public final TrackGroup[] f14013c;

    /* renamed from: d */
    public int f14014d;

    /* renamed from: com.google.android.exoplayer2.source.TrackGroupArray$a */
    public class C3982a implements Parcelable.Creator<TrackGroupArray> {
        public final Object createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        public final Object[] newArray(int i) {
            return new TrackGroupArray[i];
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f14013c = trackGroupArr;
        this.f14012b = trackGroupArr.length;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        if (this.f14012b != trackGroupArray.f14012b || !Arrays.equals(this.f14013c, trackGroupArray.f14013c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f14014d == 0) {
            this.f14014d = Arrays.hashCode(this.f14013c);
        }
        return this.f14014d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14012b);
        for (int i2 = 0; i2 < this.f14012b; i2++) {
            parcel.writeParcelable(this.f14013c[i2], 0);
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f14012b = readInt;
        this.f14013c = new TrackGroup[readInt];
        for (int i = 0; i < this.f14012b; i++) {
            this.f14013c[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}

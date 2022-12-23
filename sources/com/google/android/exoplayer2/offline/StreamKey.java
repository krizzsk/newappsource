package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;

public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new C3979a();

    /* renamed from: b */
    public final int f14004b;

    /* renamed from: c */
    public final int f14005c;

    /* renamed from: d */
    public final int f14006d;

    /* renamed from: com.google.android.exoplayer2.offline.StreamKey$a */
    public class C3979a implements Parcelable.Creator<StreamKey> {
        public final Object createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        public final Object[] newArray(int i) {
            return new StreamKey[i];
        }
    }

    public StreamKey(Parcel parcel) {
        this.f14004b = parcel.readInt();
        this.f14005c = parcel.readInt();
        this.f14006d = parcel.readInt();
    }

    public final int compareTo(Object obj) {
        StreamKey streamKey = (StreamKey) obj;
        int i = this.f14004b - streamKey.f14004b;
        if (i != 0) {
            return i;
        }
        int i2 = this.f14005c - streamKey.f14005c;
        if (i2 == 0) {
            return this.f14006d - streamKey.f14006d;
        }
        return i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        if (this.f14004b == streamKey.f14004b && this.f14005c == streamKey.f14005c && this.f14006d == streamKey.f14006d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f14004b * 31) + this.f14005c) * 31) + this.f14006d;
    }

    public final String toString() {
        int i = this.f14004b;
        int i2 = this.f14005c;
        int i3 = this.f14006d;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14004b);
        parcel.writeInt(this.f14005c);
        parcel.writeInt(this.f14006d);
    }
}

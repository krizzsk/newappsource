package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p277ub.C6774a0;

public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new C4077a();

    /* renamed from: b */
    public final int f14615b;

    /* renamed from: c */
    public final int f14616c;

    /* renamed from: d */
    public final int f14617d;

    /* renamed from: e */
    public final byte[] f14618e;

    /* renamed from: f */
    public int f14619f;

    /* renamed from: com.google.android.exoplayer2.video.ColorInfo$a */
    public class C4077a implements Parcelable.Creator<ColorInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new ColorInfo[i];
        }
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.f14615b = i;
        this.f14616c = i2;
        this.f14617d = i3;
        this.f14618e = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        if (this.f14615b == colorInfo.f14615b && this.f14616c == colorInfo.f14616c && this.f14617d == colorInfo.f14617d && Arrays.equals(this.f14618e, colorInfo.f14618e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f14619f == 0) {
            this.f14619f = Arrays.hashCode(this.f14618e) + ((((((527 + this.f14615b) * 31) + this.f14616c) * 31) + this.f14617d) * 31);
        }
        return this.f14619f;
    }

    public final String toString() {
        int i = this.f14615b;
        int i2 = this.f14616c;
        int i3 = this.f14617d;
        boolean z = this.f14618e != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f14615b);
        parcel.writeInt(this.f14616c);
        parcel.writeInt(this.f14617d);
        if (this.f14618e != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = C6774a0.f20959a;
        parcel.writeInt(i2);
        byte[] bArr = this.f14618e;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(Parcel parcel) {
        this.f14615b = parcel.readInt();
        this.f14616c = parcel.readInt();
        this.f14617d = parcel.readInt();
        int i = C6774a0.f20959a;
        this.f14618e = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}

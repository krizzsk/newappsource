package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p277ub.C6774a0;

public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new C3960a();

    /* renamed from: c */
    public final int f13931c;

    /* renamed from: d */
    public final int f13932d;

    /* renamed from: e */
    public final int f13933e;

    /* renamed from: f */
    public final int[] f13934f;

    /* renamed from: g */
    public final int[] f13935g;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.MlltFrame$a */
    public class C3960a implements Parcelable.Creator<MlltFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new MlltFrame[i];
        }
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f13931c = i;
        this.f13932d = i2;
        this.f13933e = i3;
        this.f13934f = iArr;
        this.f13935g = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        if (this.f13931c == mlltFrame.f13931c && this.f13932d == mlltFrame.f13932d && this.f13933e == mlltFrame.f13933e && Arrays.equals(this.f13934f, mlltFrame.f13934f) && Arrays.equals(this.f13935g, mlltFrame.f13935g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f13934f);
        return Arrays.hashCode(this.f13935g) + ((hashCode + ((((((527 + this.f13931c) * 31) + this.f13932d) * 31) + this.f13933e) * 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13931c);
        parcel.writeInt(this.f13932d);
        parcel.writeInt(this.f13933e);
        parcel.writeIntArray(this.f13934f);
        parcel.writeIntArray(this.f13935g);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f13931c = parcel.readInt();
        this.f13932d = parcel.readInt();
        this.f13933e = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = C6774a0.f20959a;
        this.f13934f = createIntArray;
        this.f13935g = parcel.createIntArray();
    }
}

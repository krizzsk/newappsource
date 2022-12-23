package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C3954a();

    /* renamed from: c */
    public final byte[] f13908c;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.BinaryFrame$a */
    public class C3954a implements Parcelable.Creator<BinaryFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f13908c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        if (!this.f13927b.equals(binaryFrame.f13927b) || !Arrays.equals(this.f13908c, binaryFrame.f13908c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13908c) + C13715c.m34238d(this.f13927b, 527, 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13927b);
        parcel.writeByteArray(this.f13908c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BinaryFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = p277ub.C6774a0.f20959a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f13908c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.BinaryFrame.<init>(android.os.Parcel):void");
    }
}

package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001a0.C0016g;
import p277ub.C6774a0;

public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new C3961a();

    /* renamed from: c */
    public final String f13936c;

    /* renamed from: d */
    public final byte[] f13937d;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.PrivFrame$a */
    public class C3961a implements Parcelable.Creator<PrivFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f13936c = str;
        this.f13937d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        if (!C6774a0.m15941a(this.f13936c, privFrame.f13936c) || !Arrays.equals(this.f13937d, privFrame.f13937d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.f13936c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.f13937d) + ((527 + i) * 31);
    }

    public final String toString() {
        String str = this.f13927b;
        String str2 = this.f13936c;
        return C25541a.m63875e(C0016g.m25h(str2, C0016g.m25h(str, 8)), str, ": owner=", str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13936c);
        parcel.writeByteArray(this.f13937d);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13936c = readString;
        this.f13937d = parcel.createByteArray();
    }
}

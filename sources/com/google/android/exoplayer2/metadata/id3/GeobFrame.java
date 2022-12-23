package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001a0.C0016g;
import p001a0.C0017h;
import p277ub.C6774a0;

public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new C3958a();

    /* renamed from: c */
    public final String f13923c;

    /* renamed from: d */
    public final String f13924d;

    /* renamed from: e */
    public final String f13925e;

    /* renamed from: f */
    public final byte[] f13926f;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.GeobFrame$a */
    public class C3958a implements Parcelable.Creator<GeobFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f13923c = str;
        this.f13924d = str2;
        this.f13925e = str3;
        this.f13926f = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (!C6774a0.m15941a(this.f13923c, geobFrame.f13923c) || !C6774a0.m15941a(this.f13924d, geobFrame.f13924d) || !C6774a0.m15941a(this.f13925e, geobFrame.f13925e) || !Arrays.equals(this.f13926f, geobFrame.f13926f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f13923c;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.f13924d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f13925e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return Arrays.hashCode(this.f13926f) + ((i5 + i3) * 31);
    }

    public final String toString() {
        String str = this.f13927b;
        String str2 = this.f13923c;
        String str3 = this.f13924d;
        String str4 = this.f13925e;
        return C13715c.m34245k(C0017h.m58O(C0016g.m25h(str4, C0016g.m25h(str3, C0016g.m25h(str2, C0016g.m25h(str, 36)))), str, ": mimeType=", str2, ", filename="), str3, ", description=", str4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13923c);
        parcel.writeString(this.f13924d);
        parcel.writeString(this.f13925e);
        parcel.writeByteArray(this.f13926f);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13923c = readString;
        this.f13924d = parcel.readString();
        this.f13925e = parcel.readString();
        this.f13926f = parcel.createByteArray();
    }
}

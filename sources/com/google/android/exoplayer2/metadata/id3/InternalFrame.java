package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import p001a0.C0016g;
import p001a0.C0017h;
import p277ub.C6774a0;

public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new C3959a();

    /* renamed from: c */
    public final String f13928c;

    /* renamed from: d */
    public final String f13929d;

    /* renamed from: e */
    public final String f13930e;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.InternalFrame$a */
    public class C3959a implements Parcelable.Creator<InternalFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new InternalFrame[i];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f13928c = str;
        this.f13929d = str2;
        this.f13930e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        if (!C6774a0.m15941a(this.f13929d, internalFrame.f13929d) || !C6774a0.m15941a(this.f13928c, internalFrame.f13928c) || !C6774a0.m15941a(this.f13930e, internalFrame.f13930e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f13928c;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.f13929d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f13930e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        String str = this.f13927b;
        String str2 = this.f13928c;
        String str3 = this.f13929d;
        StringBuilder O = C0017h.m58O(C0016g.m25h(str3, C0016g.m25h(str2, C0016g.m25h(str, 23))), str, ": domain=", str2, ", description=");
        O.append(str3);
        return O.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13927b);
        parcel.writeString(this.f13928c);
        parcel.writeString(this.f13930e);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13928c = readString;
        this.f13929d = parcel.readString();
        this.f13930e = parcel.readString();
    }
}

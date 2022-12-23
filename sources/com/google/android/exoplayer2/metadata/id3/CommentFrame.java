package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import p001a0.C0016g;
import p001a0.C0017h;
import p277ub.C6774a0;

public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new C3957a();

    /* renamed from: c */
    public final String f13920c;

    /* renamed from: d */
    public final String f13921d;

    /* renamed from: e */
    public final String f13922e;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.CommentFrame$a */
    public class C3957a implements Parcelable.Creator<CommentFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f13920c = str;
        this.f13921d = str2;
        this.f13922e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (!C6774a0.m15941a(this.f13921d, commentFrame.f13921d) || !C6774a0.m15941a(this.f13920c, commentFrame.f13920c) || !C6774a0.m15941a(this.f13922e, commentFrame.f13922e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f13920c;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.f13921d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f13922e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        String str = this.f13927b;
        String str2 = this.f13920c;
        String str3 = this.f13921d;
        StringBuilder O = C0017h.m58O(C0016g.m25h(str3, C0016g.m25h(str2, C0016g.m25h(str, 25))), str, ": language=", str2, ", description=");
        O.append(str3);
        return O.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13927b);
        parcel.writeString(this.f13920c);
        parcel.writeString(this.f13922e);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13920c = readString;
        this.f13921d = parcel.readString();
        this.f13922e = parcel.readString();
    }
}

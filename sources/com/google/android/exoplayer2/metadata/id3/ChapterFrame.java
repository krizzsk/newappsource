package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p277ub.C6774a0;

public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new C3955a();

    /* renamed from: c */
    public final String f13909c;

    /* renamed from: d */
    public final int f13910d;

    /* renamed from: e */
    public final int f13911e;

    /* renamed from: f */
    public final long f13912f;

    /* renamed from: g */
    public final long f13913g;

    /* renamed from: h */
    public final Id3Frame[] f13914h;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterFrame$a */
    public class C3955a implements Parcelable.Creator<ChapterFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f13909c = str;
        this.f13910d = i;
        this.f13911e = i2;
        this.f13912f = j;
        this.f13913g = j2;
        this.f13914h = id3FrameArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        if (this.f13910d == chapterFrame.f13910d && this.f13911e == chapterFrame.f13911e && this.f13912f == chapterFrame.f13912f && this.f13913g == chapterFrame.f13913g && C6774a0.m15941a(this.f13909c, chapterFrame.f13909c) && Arrays.equals(this.f13914h, chapterFrame.f13914h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (((((((527 + this.f13910d) * 31) + this.f13911e) * 31) + ((int) this.f13912f)) * 31) + ((int) this.f13913g)) * 31;
        String str = this.f13909c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13909c);
        parcel.writeInt(this.f13910d);
        parcel.writeInt(this.f13911e);
        parcel.writeLong(this.f13912f);
        parcel.writeLong(this.f13913g);
        parcel.writeInt(this.f13914h.length);
        for (Id3Frame writeParcelable : this.f13914h) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13909c = readString;
        this.f13910d = parcel.readInt();
        this.f13911e = parcel.readInt();
        this.f13912f = parcel.readLong();
        this.f13913g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f13914h = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f13914h[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}

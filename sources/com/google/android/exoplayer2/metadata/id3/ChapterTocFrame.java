package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p277ub.C6774a0;

public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new C3956a();

    /* renamed from: c */
    public final String f13915c;

    /* renamed from: d */
    public final boolean f13916d;

    /* renamed from: e */
    public final boolean f13917e;

    /* renamed from: f */
    public final String[] f13918f;

    /* renamed from: g */
    public final Id3Frame[] f13919g;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterTocFrame$a */
    public class C3956a implements Parcelable.Creator<ChapterTocFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f13915c = str;
        this.f13916d = z;
        this.f13917e = z2;
        this.f13918f = strArr;
        this.f13919g = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.f13916d != chapterTocFrame.f13916d || this.f13917e != chapterTocFrame.f13917e || !C6774a0.m15941a(this.f13915c, chapterTocFrame.f13915c) || !Arrays.equals(this.f13918f, chapterTocFrame.f13918f) || !Arrays.equals(this.f13919g, chapterTocFrame.f13919g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = (((true + (this.f13916d ? 1 : 0)) * 31) + (this.f13917e ? 1 : 0)) * 31;
        String str = this.f13915c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13915c);
        parcel.writeByte(this.f13916d ? (byte) 1 : 0);
        parcel.writeByte(this.f13917e ? (byte) 1 : 0);
        parcel.writeStringArray(this.f13918f);
        parcel.writeInt(this.f13919g.length);
        for (Id3Frame writeParcelable : this.f13919g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13915c = readString;
        boolean z = true;
        this.f13916d = parcel.readByte() != 0;
        this.f13917e = parcel.readByte() == 0 ? false : z;
        this.f13918f = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f13919g = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f13919g[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}

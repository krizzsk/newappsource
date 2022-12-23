package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p099ga.C4910k0;
import p277ub.C6774a0;

public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new C3964a();

    /* renamed from: b */
    public final String f13942b;

    /* renamed from: c */
    public final byte[] f13943c;

    /* renamed from: d */
    public final int f13944d;

    /* renamed from: e */
    public final int f13945e;

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry$a */
    public class C3964a implements Parcelable.Creator<MdtaMetadataEntry> {
        public final Object createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel);
        }

        public final Object[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.f13942b = str;
        this.f13943c = bArr;
        this.f13944d = i;
        this.f13945e = i2;
    }

    /* renamed from: X1 */
    public final /* synthetic */ byte[] mo16090X1() {
        return null;
    }

    /* renamed from: c2 */
    public final /* synthetic */ void mo16091c2(C4910k0.C4911a aVar) {
    }

    /* renamed from: d0 */
    public final /* synthetic */ Format mo16092d0() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        if (!this.f13942b.equals(mdtaMetadataEntry.f13942b) || !Arrays.equals(this.f13943c, mdtaMetadataEntry.f13943c) || this.f13944d != mdtaMetadataEntry.f13944d || this.f13945e != mdtaMetadataEntry.f13945e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f13943c) + C13715c.m34238d(this.f13942b, 527, 31)) * 31) + this.f13944d) * 31) + this.f13945e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13942b);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13942b);
        parcel.writeByteArray(this.f13943c);
        parcel.writeInt(this.f13944d);
        parcel.writeInt(this.f13945e);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String readString = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13942b = readString;
        this.f13943c = parcel.createByteArray();
        this.f13944d = parcel.readInt();
        this.f13945e = parcel.readInt();
    }
}

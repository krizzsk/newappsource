package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p001a0.C0016g;
import p099ga.C4910k0;
import p277ub.C6774a0;

public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new C3949a();

    /* renamed from: b */
    public final int f13885b;

    /* renamed from: c */
    public final String f13886c;

    /* renamed from: d */
    public final String f13887d;

    /* renamed from: e */
    public final int f13888e;

    /* renamed from: f */
    public final int f13889f;

    /* renamed from: g */
    public final int f13890g;

    /* renamed from: h */
    public final int f13891h;

    /* renamed from: i */
    public final byte[] f13892i;

    /* renamed from: com.google.android.exoplayer2.metadata.flac.PictureFrame$a */
    public class C3949a implements Parcelable.Creator<PictureFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new PictureFrame[i];
        }
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f13885b = i;
        this.f13886c = str;
        this.f13887d = str2;
        this.f13888e = i2;
        this.f13889f = i3;
        this.f13890g = i4;
        this.f13891h = i5;
        this.f13892i = bArr;
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
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        if (this.f13885b == pictureFrame.f13885b && this.f13886c.equals(pictureFrame.f13886c) && this.f13887d.equals(pictureFrame.f13887d) && this.f13888e == pictureFrame.f13888e && this.f13889f == pictureFrame.f13889f && this.f13890g == pictureFrame.f13890g && this.f13891h == pictureFrame.f13891h && Arrays.equals(this.f13892i, pictureFrame.f13892i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int d = C13715c.m34238d(this.f13886c, (this.f13885b + 527) * 31, 31);
        return Arrays.hashCode(this.f13892i) + ((((((((C13715c.m34238d(this.f13887d, d, 31) + this.f13888e) * 31) + this.f13889f) * 31) + this.f13890g) * 31) + this.f13891h) * 31);
    }

    public final String toString() {
        String str = this.f13886c;
        String str2 = this.f13887d;
        StringBuilder sb = new StringBuilder(C0016g.m25h(str2, C0016g.m25h(str, 32)));
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13885b);
        parcel.writeString(this.f13886c);
        parcel.writeString(this.f13887d);
        parcel.writeInt(this.f13888e);
        parcel.writeInt(this.f13889f);
        parcel.writeInt(this.f13890g);
        parcel.writeInt(this.f13891h);
        parcel.writeByteArray(this.f13892i);
    }

    public PictureFrame(Parcel parcel) {
        this.f13885b = parcel.readInt();
        String readString = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13886c = readString;
        this.f13887d = parcel.readString();
        this.f13888e = parcel.readInt();
        this.f13889f = parcel.readInt();
        this.f13890g = parcel.readInt();
        this.f13891h = parcel.readInt();
        this.f13892i = parcel.createByteArray();
    }
}

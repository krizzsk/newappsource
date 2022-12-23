package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p001a0.C0016g;
import p099ga.C4910k0;
import p277ub.C6774a0;

public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C3950a();

    /* renamed from: b */
    public final String f13893b;

    /* renamed from: c */
    public final String f13894c;

    /* renamed from: com.google.android.exoplayer2.metadata.flac.VorbisComment$a */
    public class C3950a implements Parcelable.Creator<VorbisComment> {
        public final Object createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        public final Object[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f13893b = str;
        this.f13894c = str2;
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
        if (obj == null || VorbisComment.class != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        if (!this.f13893b.equals(vorbisComment.f13893b) || !this.f13894c.equals(vorbisComment.f13894c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13894c.hashCode() + C13715c.m34238d(this.f13893b, 527, 31);
    }

    public final String toString() {
        String str = this.f13893b;
        String str2 = this.f13894c;
        StringBuilder sb = new StringBuilder(C0016g.m25h(str2, C0016g.m25h(str, 5)));
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13893b);
        parcel.writeString(this.f13894c);
    }

    public VorbisComment(Parcel parcel) {
        String readString = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13893b = readString;
        this.f13894c = parcel.readString();
    }
}

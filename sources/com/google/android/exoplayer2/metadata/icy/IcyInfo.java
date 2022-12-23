package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p099ga.C4910k0;

public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new C3952a();

    /* renamed from: b */
    public final byte[] f13901b;

    /* renamed from: c */
    public final String f13902c;

    /* renamed from: d */
    public final String f13903d;

    /* renamed from: com.google.android.exoplayer2.metadata.icy.IcyInfo$a */
    public class C3952a implements Parcelable.Creator<IcyInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new IcyInfo[i];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f13901b = bArr;
        this.f13902c = str;
        this.f13903d = str2;
    }

    /* renamed from: X1 */
    public final /* synthetic */ byte[] mo16090X1() {
        return null;
    }

    /* renamed from: c2 */
    public final void mo16091c2(C4910k0.C4911a aVar) {
        String str = this.f13902c;
        if (str != null) {
            aVar.f16591a = str;
        }
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
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13901b, ((IcyInfo) obj).f13901b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13901b);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f13902c, this.f13903d, Integer.valueOf(this.f13901b.length)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f13901b);
        parcel.writeString(this.f13902c);
        parcel.writeString(this.f13903d);
    }

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f13901b = createByteArray;
        this.f13902c = parcel.readString();
        this.f13903d = parcel.readString();
    }
}

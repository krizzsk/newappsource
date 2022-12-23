package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p001a0.C0016g;
import p001a0.C0017h;
import p277ub.C6776b0;
import p583jk.C17875h;
import p988j$.util.Spliterator;

public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new C3981a();

    /* renamed from: b */
    public final int f14008b;

    /* renamed from: c */
    public final Format[] f14009c;

    /* renamed from: d */
    public int f14010d;

    /* renamed from: com.google.android.exoplayer2.source.TrackGroup$a */
    public class C3981a implements Parcelable.Creator<TrackGroup> {
        public final Object createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        public final Object[] newArray(int i) {
            return new TrackGroup[i];
        }
    }

    public TrackGroup(Format... formatArr) {
        int i = 1;
        C17875h.m44304o(formatArr.length > 0);
        this.f14009c = formatArr;
        this.f14008b = formatArr.length;
        String str = formatArr[0].f13409d;
        str = (str == null || str.equals("und")) ? "" : str;
        int i2 = formatArr[0].f13411f | Spliterator.SUBSIZED;
        while (true) {
            Format[] formatArr2 = this.f14009c;
            if (i < formatArr2.length) {
                String str2 = formatArr2[i].f13409d;
                if (!str.equals((str2 == null || str2.equals("und")) ? "" : str2)) {
                    Format[] formatArr3 = this.f14009c;
                    m10664b(i, "languages", formatArr3[0].f13409d, formatArr3[i].f13409d);
                    return;
                }
                Format[] formatArr4 = this.f14009c;
                if (i2 != (formatArr4[i].f13411f | Spliterator.SUBSIZED)) {
                    m10664b(i, "role flags", Integer.toBinaryString(formatArr4[0].f13411f), Integer.toBinaryString(this.f14009c[i].f13411f));
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m10664b(int i, String str, String str2, String str3) {
        StringBuilder O = C0017h.m58O(C0016g.m25h(str3, C0016g.m25h(str2, str.length() + 78)), "Different ", str, " combined in one TrackGroup: '", str2);
        O.append("' (track 0) and '");
        O.append(str3);
        O.append("' (track ");
        O.append(i);
        O.append(")");
        C6776b0.m15968a("", new IllegalStateException(O.toString()));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        if (this.f14008b != trackGroup.f14008b || !Arrays.equals(this.f14009c, trackGroup.f14009c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f14010d == 0) {
            this.f14010d = 527 + Arrays.hashCode(this.f14009c);
        }
        return this.f14010d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14008b);
        for (int i2 = 0; i2 < this.f14008b; i2++) {
            parcel.writeParcelable(this.f14009c[i2], 0);
        }
    }

    public TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f14008b = readInt;
        this.f14009c = new Format[readInt];
        for (int i = 0; i < this.f14008b; i++) {
            this.f14009c[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}

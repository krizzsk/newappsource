package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import p001a0.C0016g;
import p277ub.C6774a0;

public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C3963a();

    /* renamed from: c */
    public final String f13940c;

    /* renamed from: d */
    public final String f13941d;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame$a */
    public class C3963a implements Parcelable.Creator<UrlLinkFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f13940c = str2;
        this.f13941d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        if (!this.f13927b.equals(urlLinkFrame.f13927b) || !C6774a0.m15941a(this.f13940c, urlLinkFrame.f13940c) || !C6774a0.m15941a(this.f13941d, urlLinkFrame.f13941d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int d = C13715c.m34238d(this.f13927b, 527, 31);
        String str = this.f13940c;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (d + i) * 31;
        String str2 = this.f13941d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        String str = this.f13927b;
        String str2 = this.f13941d;
        return C25541a.m63875e(C0016g.m25h(str2, C0016g.m25h(str, 6)), str, ": url=", str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13927b);
        parcel.writeString(this.f13940c);
        parcel.writeString(this.f13941d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UrlLinkFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = p277ub.C6774a0.f20959a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f13940c = r0
            java.lang.String r3 = r3.readString()
            r2.f13941d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.<init>(android.os.Parcel):void");
    }
}

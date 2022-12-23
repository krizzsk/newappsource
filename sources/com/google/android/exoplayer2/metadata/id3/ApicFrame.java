package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001a0.C0016g;
import p001a0.C0017h;
import p099ga.C4910k0;
import p277ub.C6774a0;

public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C3953a();

    /* renamed from: c */
    public final String f13904c;

    /* renamed from: d */
    public final String f13905d;

    /* renamed from: e */
    public final int f13906e;

    /* renamed from: f */
    public final byte[] f13907f;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ApicFrame$a */
    public class C3953a implements Parcelable.Creator<ApicFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f13904c = str;
        this.f13905d = str2;
        this.f13906e = i;
        this.f13907f = bArr;
    }

    /* renamed from: c2 */
    public final void mo16091c2(C4910k0.C4911a aVar) {
        byte[] bArr;
        byte[] bArr2 = this.f13907f;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr2.clone();
        }
        aVar.f16599i = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.f13906e != apicFrame.f13906e || !C6774a0.m15941a(this.f13904c, apicFrame.f13904c) || !C6774a0.m15941a(this.f13905d, apicFrame.f13905d) || !Arrays.equals(this.f13907f, apicFrame.f13907f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = (527 + this.f13906e) * 31;
        String str = this.f13904c;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.f13905d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return Arrays.hashCode(this.f13907f) + ((i4 + i3) * 31);
    }

    public final String toString() {
        String str = this.f13927b;
        String str2 = this.f13904c;
        String str3 = this.f13905d;
        StringBuilder O = C0017h.m58O(C0016g.m25h(str3, C0016g.m25h(str2, C0016g.m25h(str, 25))), str, ": mimeType=", str2, ", description=");
        O.append(str3);
        return O.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13904c);
        parcel.writeString(this.f13905d);
        parcel.writeInt(this.f13906e);
        parcel.writeByteArray(this.f13907f);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13904c = readString;
        this.f13905d = parcel.readString();
        this.f13906e = parcel.readInt();
        this.f13907f = parcel.createByteArray();
    }
}

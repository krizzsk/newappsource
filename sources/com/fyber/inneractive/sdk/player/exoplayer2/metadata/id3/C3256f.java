package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f */
public final class C3256f extends C3261h {
    public static final Parcelable.Creator<C3256f> CREATOR = new C3257a();

    /* renamed from: b */
    public final String f11735b;

    /* renamed from: c */
    public final String f11736c;

    /* renamed from: d */
    public final String f11737d;

    /* renamed from: e */
    public final byte[] f11738e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f$a */
    public class C3257a implements Parcelable.Creator<C3256f> {
        public Object createFromParcel(Parcel parcel) {
            return new C3256f(parcel);
        }

        public Object[] newArray(int i) {
            return new C3256f[i];
        }
    }

    public C3256f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f11735b = str;
        this.f11736c = str2;
        this.f11737d = str3;
        this.f11738e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3256f.class != obj.getClass()) {
            return false;
        }
        C3256f fVar = (C3256f) obj;
        if (!C3406u.m8596a((Object) this.f11735b, (Object) fVar.f11735b) || !C3406u.m8596a((Object) this.f11736c, (Object) fVar.f11736c) || !C3406u.m8596a((Object) this.f11737d, (Object) fVar.f11737d) || !Arrays.equals(this.f11738e, fVar.f11738e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f11735b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 527) * 31;
        String str2 = this.f11736c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f11737d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return Arrays.hashCode(this.f11738e) + ((i5 + i3) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11735b);
        parcel.writeString(this.f11736c);
        parcel.writeString(this.f11737d);
        parcel.writeByteArray(this.f11738e);
    }

    public C3256f(Parcel parcel) {
        super("GEOB");
        this.f11735b = parcel.readString();
        this.f11736c = parcel.readString();
        this.f11737d = parcel.readString();
        this.f11738e = parcel.createByteArray();
    }
}

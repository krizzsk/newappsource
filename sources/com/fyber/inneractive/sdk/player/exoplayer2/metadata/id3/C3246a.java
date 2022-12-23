package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a */
public final class C3246a extends C3261h {
    public static final Parcelable.Creator<C3246a> CREATOR = new C3247a();

    /* renamed from: b */
    public final String f11716b;

    /* renamed from: c */
    public final String f11717c;

    /* renamed from: d */
    public final int f11718d;

    /* renamed from: e */
    public final byte[] f11719e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a$a */
    public class C3247a implements Parcelable.Creator<C3246a> {
        public Object createFromParcel(Parcel parcel) {
            return new C3246a(parcel);
        }

        public Object[] newArray(int i) {
            return new C3246a[i];
        }
    }

    public C3246a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f11716b = str;
        this.f11717c = str2;
        this.f11718d = i;
        this.f11719e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3246a.class != obj.getClass()) {
            return false;
        }
        C3246a aVar = (C3246a) obj;
        if (this.f11718d != aVar.f11718d || !C3406u.m8596a((Object) this.f11716b, (Object) aVar.f11716b) || !C3406u.m8596a((Object) this.f11717c, (Object) aVar.f11717c) || !Arrays.equals(this.f11719e, aVar.f11719e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = (this.f11718d + 527) * 31;
        String str = this.f11716b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.f11717c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return Arrays.hashCode(this.f11719e) + ((i4 + i3) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11716b);
        parcel.writeString(this.f11717c);
        parcel.writeInt(this.f11718d);
        parcel.writeByteArray(this.f11719e);
    }

    public C3246a(Parcel parcel) {
        super("APIC");
        this.f11716b = parcel.readString();
        this.f11717c = parcel.readString();
        this.f11718d = parcel.readInt();
        this.f11719e = parcel.createByteArray();
    }
}

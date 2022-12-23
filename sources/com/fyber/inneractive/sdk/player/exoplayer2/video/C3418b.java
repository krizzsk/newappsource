package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.b */
public final class C3418b implements Parcelable {
    public static final Parcelable.Creator<C3418b> CREATOR = new C3419a();

    /* renamed from: a */
    public final int f12214a;

    /* renamed from: b */
    public final int f12215b;

    /* renamed from: c */
    public final int f12216c;

    /* renamed from: d */
    public final byte[] f12217d;

    /* renamed from: e */
    public int f12218e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.b$a */
    public class C3419a implements Parcelable.Creator<C3418b> {
        public Object createFromParcel(Parcel parcel) {
            return new C3418b(parcel);
        }

        public Object[] newArray(int i) {
            return new C3418b[0];
        }
    }

    public C3418b(int i, int i2, int i3, byte[] bArr) {
        this.f12214a = i;
        this.f12215b = i2;
        this.f12216c = i3;
        this.f12217d = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3418b.class == obj.getClass()) {
            C3418b bVar = (C3418b) obj;
            if (this.f12214a == bVar.f12214a && this.f12215b == bVar.f12215b && this.f12216c == bVar.f12216c && Arrays.equals(this.f12217d, bVar.f12217d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        if (this.f12218e == 0) {
            this.f12218e = Arrays.hashCode(this.f12217d) + ((((((this.f12214a + 527) * 31) + this.f12215b) * 31) + this.f12216c) * 31);
        }
        return this.f12218e;
    }

    public String toString() {
        boolean z;
        StringBuilder k = C13555b.m33972k("ColorInfo(");
        k.append(this.f12214a);
        k.append(", ");
        k.append(this.f12215b);
        k.append(", ");
        k.append(this.f12216c);
        k.append(", ");
        if (this.f12217d != null) {
            z = true;
        } else {
            z = false;
        }
        return C25541a.m63885p(k, z, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f12214a);
        parcel.writeInt(this.f12215b);
        parcel.writeInt(this.f12216c);
        if (this.f12217d != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        byte[] bArr = this.f12217d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public C3418b(Parcel parcel) {
        this.f12214a = parcel.readInt();
        this.f12215b = parcel.readInt();
        this.f12216c = parcel.readInt();
        this.f12217d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}

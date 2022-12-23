package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b */
public final class C3248b extends C3261h {
    public static final Parcelable.Creator<C3248b> CREATOR = new C3249a();

    /* renamed from: b */
    public final byte[] f11720b;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b$a */
    public class C3249a implements Parcelable.Creator<C3248b> {
        public Object createFromParcel(Parcel parcel) {
            return new C3248b(parcel);
        }

        public Object[] newArray(int i) {
            return new C3248b[i];
        }
    }

    public C3248b(String str, byte[] bArr) {
        super(str);
        this.f11720b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3248b.class != obj.getClass()) {
            return false;
        }
        C3248b bVar = (C3248b) obj;
        if (!this.f11744a.equals(bVar.f11744a) || !Arrays.equals(this.f11720b, bVar.f11720b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f11720b) + C13715c.m34238d(this.f11744a, 527, 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11744a);
        parcel.writeByteArray(this.f11720b);
    }

    public C3248b(Parcel parcel) {
        super(parcel.readString());
        this.f11720b = parcel.createByteArray();
    }
}

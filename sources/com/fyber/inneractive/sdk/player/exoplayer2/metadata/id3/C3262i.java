package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i */
public final class C3262i extends C3261h {
    public static final Parcelable.Creator<C3262i> CREATOR = new C3263a();

    /* renamed from: b */
    public final String f11745b;

    /* renamed from: c */
    public final byte[] f11746c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i$a */
    public class C3263a implements Parcelable.Creator<C3262i> {
        public Object createFromParcel(Parcel parcel) {
            return new C3262i(parcel);
        }

        public Object[] newArray(int i) {
            return new C3262i[i];
        }
    }

    public C3262i(String str, byte[] bArr) {
        super("PRIV");
        this.f11745b = str;
        this.f11746c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3262i.class != obj.getClass()) {
            return false;
        }
        C3262i iVar = (C3262i) obj;
        if (!C3406u.m8596a((Object) this.f11745b, (Object) iVar.f11745b) || !Arrays.equals(this.f11746c, iVar.f11746c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.f11745b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.f11746c) + ((i + 527) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11745b);
        parcel.writeByteArray(this.f11746c);
    }

    public C3262i(Parcel parcel) {
        super("PRIV");
        this.f11745b = parcel.readString();
        this.f11746c = parcel.createByteArray();
    }
}

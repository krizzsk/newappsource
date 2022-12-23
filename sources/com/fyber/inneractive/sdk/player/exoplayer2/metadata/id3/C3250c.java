package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.c */
public final class C3250c extends C3261h {
    public static final Parcelable.Creator<C3250c> CREATOR = new C3251a();

    /* renamed from: b */
    public final String f11721b;

    /* renamed from: c */
    public final int f11722c;

    /* renamed from: d */
    public final int f11723d;

    /* renamed from: e */
    public final long f11724e;

    /* renamed from: f */
    public final long f11725f;

    /* renamed from: g */
    public final C3261h[] f11726g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.c$a */
    public class C3251a implements Parcelable.Creator<C3250c> {
        public Object createFromParcel(Parcel parcel) {
            return new C3250c(parcel);
        }

        public Object[] newArray(int i) {
            return new C3250c[i];
        }
    }

    public C3250c(String str, int i, int i2, long j, long j2, C3261h[] hVarArr) {
        super("CHAP");
        this.f11721b = str;
        this.f11722c = i;
        this.f11723d = i2;
        this.f11724e = j;
        this.f11725f = j2;
        this.f11726g = hVarArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3250c.class != obj.getClass()) {
            return false;
        }
        C3250c cVar = (C3250c) obj;
        if (this.f11722c == cVar.f11722c && this.f11723d == cVar.f11723d && this.f11724e == cVar.f11724e && this.f11725f == cVar.f11725f && C3406u.m8596a((Object) this.f11721b, (Object) cVar.f11721b) && Arrays.equals(this.f11726g, cVar.f11726g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (((((((this.f11722c + 527) * 31) + this.f11723d) * 31) + ((int) this.f11724e)) * 31) + ((int) this.f11725f)) * 31;
        String str = this.f11721b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11721b);
        parcel.writeInt(this.f11722c);
        parcel.writeInt(this.f11723d);
        parcel.writeLong(this.f11724e);
        parcel.writeLong(this.f11725f);
        parcel.writeInt(this.f11726g.length);
        for (C3261h writeParcelable : this.f11726g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C3250c(Parcel parcel) {
        super("CHAP");
        this.f11721b = parcel.readString();
        this.f11722c = parcel.readInt();
        this.f11723d = parcel.readInt();
        this.f11724e = parcel.readLong();
        this.f11725f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f11726g = new C3261h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f11726g[i] = (C3261h) parcel.readParcelable(C3261h.class.getClassLoader());
        }
    }
}

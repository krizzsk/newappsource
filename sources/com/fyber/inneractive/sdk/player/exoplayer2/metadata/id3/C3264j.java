package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j */
public final class C3264j extends C3261h {
    public static final Parcelable.Creator<C3264j> CREATOR = new C3265a();

    /* renamed from: b */
    public final String f11747b;

    /* renamed from: c */
    public final String f11748c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j$a */
    public class C3265a implements Parcelable.Creator<C3264j> {
        public Object createFromParcel(Parcel parcel) {
            return new C3264j(parcel);
        }

        public Object[] newArray(int i) {
            return new C3264j[i];
        }
    }

    public C3264j(String str, String str2, String str3) {
        super(str);
        this.f11747b = str2;
        this.f11748c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3264j.class != obj.getClass()) {
            return false;
        }
        C3264j jVar = (C3264j) obj;
        if (!this.f11744a.equals(jVar.f11744a) || !C3406u.m8596a((Object) this.f11747b, (Object) jVar.f11747b) || !C3406u.m8596a((Object) this.f11748c, (Object) jVar.f11748c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int d = C13715c.m34238d(this.f11744a, 527, 31);
        String str = this.f11747b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (d + i) * 31;
        String str2 = this.f11748c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11744a);
        parcel.writeString(this.f11747b);
        parcel.writeString(this.f11748c);
    }

    public C3264j(Parcel parcel) {
        super(parcel.readString());
        this.f11747b = parcel.readString();
        this.f11748c = parcel.readString();
    }
}

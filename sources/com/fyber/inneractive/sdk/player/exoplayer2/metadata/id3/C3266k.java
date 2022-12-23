package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.k */
public final class C3266k extends C3261h {
    public static final Parcelable.Creator<C3266k> CREATOR = new C3267a();

    /* renamed from: b */
    public final String f11749b;

    /* renamed from: c */
    public final String f11750c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.k$a */
    public class C3267a implements Parcelable.Creator<C3266k> {
        public Object createFromParcel(Parcel parcel) {
            return new C3266k(parcel);
        }

        public Object[] newArray(int i) {
            return new C3266k[i];
        }
    }

    public C3266k(String str, String str2, String str3) {
        super(str);
        this.f11749b = str2;
        this.f11750c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3266k.class != obj.getClass()) {
            return false;
        }
        C3266k kVar = (C3266k) obj;
        if (!this.f11744a.equals(kVar.f11744a) || !C3406u.m8596a((Object) this.f11749b, (Object) kVar.f11749b) || !C3406u.m8596a((Object) this.f11750c, (Object) kVar.f11750c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int d = C13715c.m34238d(this.f11744a, 527, 31);
        String str = this.f11749b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (d + i) * 31;
        String str2 = this.f11750c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11744a);
        parcel.writeString(this.f11749b);
        parcel.writeString(this.f11750c);
    }

    public C3266k(Parcel parcel) {
        super(parcel.readString());
        this.f11749b = parcel.readString();
        this.f11750c = parcel.readString();
    }
}

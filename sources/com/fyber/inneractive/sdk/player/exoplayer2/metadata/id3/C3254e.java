package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e */
public final class C3254e extends C3261h {
    public static final Parcelable.Creator<C3254e> CREATOR = new C3255a();

    /* renamed from: b */
    public final String f11732b;

    /* renamed from: c */
    public final String f11733c;

    /* renamed from: d */
    public final String f11734d;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e$a */
    public class C3255a implements Parcelable.Creator<C3254e> {
        public Object createFromParcel(Parcel parcel) {
            return new C3254e(parcel);
        }

        public Object[] newArray(int i) {
            return new C3254e[i];
        }
    }

    public C3254e(String str, String str2, String str3) {
        super("COMM");
        this.f11732b = str;
        this.f11733c = str2;
        this.f11734d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3254e.class != obj.getClass()) {
            return false;
        }
        C3254e eVar = (C3254e) obj;
        if (!C3406u.m8596a((Object) this.f11733c, (Object) eVar.f11733c) || !C3406u.m8596a((Object) this.f11732b, (Object) eVar.f11732b) || !C3406u.m8596a((Object) this.f11734d, (Object) eVar.f11734d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f11732b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 527) * 31;
        String str2 = this.f11733c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f11734d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11744a);
        parcel.writeString(this.f11732b);
        parcel.writeString(this.f11734d);
    }

    public C3254e(Parcel parcel) {
        super("COMM");
        this.f11732b = parcel.readString();
        this.f11733c = parcel.readString();
        this.f11734d = parcel.readString();
    }
}

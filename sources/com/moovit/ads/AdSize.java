package com.moovit.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/ads/AdSize;", "Landroid/os/Parcelable;", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class AdSize implements Parcelable {
    public static final Parcelable.Creator<AdSize> CREATOR = new C14697a();

    /* renamed from: b */
    public final int f37357b;

    /* renamed from: c */
    public final int f37358c;

    /* renamed from: com.moovit.ads.AdSize$a */
    public static final class C14697a implements Parcelable.Creator<AdSize> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new AdSize(parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new AdSize[i];
        }
    }

    public AdSize(int i, int i2) {
        this.f37357b = i;
        this.f37358c = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f37357b == adSize.f37357b && this.f37358c == adSize.f37358c;
    }

    public final int hashCode() {
        return (this.f37357b * 31) + this.f37358c;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AdSize(width=");
        k.append(this.f37357b);
        k.append(", height=");
        return C16530d.m42014g(k, this.f37358c, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeInt(this.f37357b);
        parcel.writeInt(this.f37358c);
    }
}

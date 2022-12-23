package com.moovit.ads;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.commons.geo.LatLonE6;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/ads/AdTargeting;", "Landroid/os/Parcelable;", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class AdTargeting implements Parcelable {
    public static final Parcelable.Creator<AdTargeting> CREATOR = new C14698a();

    /* renamed from: b */
    public final Location f37359b;

    /* renamed from: c */
    public final LatLonE6 f37360c;

    /* renamed from: com.moovit.ads.AdTargeting$a */
    public static final class C14698a implements Parcelable.Creator<AdTargeting> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new AdTargeting((Location) parcel.readParcelable(AdTargeting.class.getClassLoader()), (LatLonE6) parcel.readParcelable(AdTargeting.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new AdTargeting[i];
        }
    }

    public AdTargeting(Location location, LatLonE6 latLonE6) {
        this.f37359b = location;
        this.f37360c = latLonE6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdTargeting)) {
            return false;
        }
        AdTargeting adTargeting = (AdTargeting) obj;
        return C24362h.m61206a(this.f37359b, adTargeting.f37359b) && C24362h.m61206a(this.f37360c, adTargeting.f37360c);
    }

    public final int hashCode() {
        Location location = this.f37359b;
        int i = 0;
        int hashCode = (location == null ? 0 : location.hashCode()) * 31;
        LatLonE6 latLonE6 = this.f37360c;
        if (latLonE6 != null) {
            i = latLonE6.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AdTargeting(userLocation=");
        k.append(this.f37359b);
        k.append(", targetLocation=");
        k.append(this.f37360c);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f37359b, i);
        parcel.writeParcelable(this.f37360c, i);
    }
}

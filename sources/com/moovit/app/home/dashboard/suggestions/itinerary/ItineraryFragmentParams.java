package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.transit.LocationDescriptor;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/home/dashboard/suggestions/itinerary/ItineraryFragmentParams;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class ItineraryFragmentParams implements Parcelable {
    public static final Parcelable.Creator<ItineraryFragmentParams> CREATOR = new C14969a();

    /* renamed from: b */
    public final int f38310b;

    /* renamed from: c */
    public final LocationDescriptor f38311c;

    /* renamed from: d */
    public final LocationDescriptor f38312d;

    /* renamed from: e */
    public final String f38313e;

    /* renamed from: f */
    public final String f38314f;

    /* renamed from: g */
    public final int f38315g;

    /* renamed from: com.moovit.app.home.dashboard.suggestions.itinerary.ItineraryFragmentParams$a */
    public static final class C14969a implements Parcelable.Creator<ItineraryFragmentParams> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new ItineraryFragmentParams(parcel.readInt(), (LocationDescriptor) parcel.readParcelable(ItineraryFragmentParams.class.getClassLoader()), (LocationDescriptor) parcel.readParcelable(ItineraryFragmentParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new ItineraryFragmentParams[i];
        }
    }

    public ItineraryFragmentParams(int i, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, String str, String str2, int i2) {
        C24362h.m61211f(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        C24362h.m61211f(locationDescriptor2, "destination");
        C24362h.m61211f(str2, "source");
        this.f38310b = i;
        this.f38311c = locationDescriptor;
        this.f38312d = locationDescriptor2;
        this.f38313e = str;
        this.f38314f = str2;
        this.f38315g = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItineraryFragmentParams)) {
            return false;
        }
        ItineraryFragmentParams itineraryFragmentParams = (ItineraryFragmentParams) obj;
        return this.f38310b == itineraryFragmentParams.f38310b && C24362h.m61206a(this.f38311c, itineraryFragmentParams.f38311c) && C24362h.m61206a(this.f38312d, itineraryFragmentParams.f38312d) && C24362h.m61206a(this.f38313e, itineraryFragmentParams.f38313e) && C24362h.m61206a(this.f38314f, itineraryFragmentParams.f38314f) && this.f38315g == itineraryFragmentParams.f38315g;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f38311c.hashCode();
        int hashCode2 = (this.f38312d.hashCode() + ((hashCode + (this.f38310b * 31)) * 31)) * 31;
        String str = this.f38313e;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return C13715c.m34238d(this.f38314f, (hashCode2 + i) * 31, 31) + this.f38315g;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ItineraryFragmentParams(header=");
        k.append(this.f38310b);
        k.append(", origin=");
        k.append(this.f38311c);
        k.append(", destination=");
        k.append(this.f38312d);
        k.append(", title=");
        k.append(this.f38313e);
        k.append(", source=");
        k.append(this.f38314f);
        k.append(", index=");
        return C16530d.m42014g(k, this.f38315g, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeInt(this.f38310b);
        parcel.writeParcelable(this.f38311c, i);
        parcel.writeParcelable(this.f38312d, i);
        parcel.writeString(this.f38313e);
        parcel.writeString(this.f38314f);
        parcel.writeInt(this.f38315g);
    }
}

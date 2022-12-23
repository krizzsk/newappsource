package com.masabi.justride.sdk.p415ui.features.universalticket.details.trip;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/features/universalticket/details/trip/Trip;", "Landroid/os/Parcelable;", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.details.trip.Trip */
public final class Trip implements Parcelable {
    public static final Parcelable.Creator<Trip> CREATOR = new C14672a();

    /* renamed from: b */
    public final String f37241b;

    /* renamed from: c */
    public final String f37242c;

    /* renamed from: d */
    public final String f37243d;

    /* renamed from: e */
    public final String f37244e;

    /* renamed from: f */
    public final String f37245f;

    /* renamed from: g */
    public final String f37246g;

    /* renamed from: h */
    public final String f37247h;

    /* renamed from: i */
    public final String f37248i;

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.details.trip.Trip$a */
    public static class C14672a implements Parcelable.Creator<Trip> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new Trip(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new Trip[i];
        }
    }

    public Trip(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C24362h.m61211f(str6, "productDisplayName");
        this.f37241b = str;
        this.f37242c = str2;
        this.f37243d = str3;
        this.f37244e = str4;
        this.f37245f = str5;
        this.f37246g = str6;
        this.f37247h = str7;
        this.f37248i = str8;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trip)) {
            return false;
        }
        Trip trip = (Trip) obj;
        return C24362h.m61206a(this.f37241b, trip.f37241b) && C24362h.m61206a(this.f37242c, trip.f37242c) && C24362h.m61206a(this.f37243d, trip.f37243d) && C24362h.m61206a(this.f37244e, trip.f37244e) && C24362h.m61206a(this.f37245f, trip.f37245f) && C24362h.m61206a(this.f37246g, trip.f37246g) && C24362h.m61206a(this.f37247h, trip.f37247h) && C24362h.m61206a(this.f37248i, trip.f37248i);
    }

    public final int hashCode() {
        String str = this.f37241b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f37242c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f37243d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f37244e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f37245f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f37246g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f37247h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f37248i;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Trip(destinationName=");
        k.append(this.f37241b);
        k.append(", destinationZoneId=");
        k.append(this.f37242c);
        k.append(", formattedPrice=");
        k.append(this.f37243d);
        k.append(", originName=");
        k.append(this.f37244e);
        k.append(", originZoneId=");
        k.append(this.f37245f);
        k.append(", productDisplayName=");
        k.append(this.f37246g);
        k.append(", ticketStrapline=");
        k.append(this.f37247h);
        k.append(", compositeProductDisplayName=");
        return C0016g.m31o(k, this.f37248i, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeString(this.f37241b);
        parcel.writeString(this.f37242c);
        parcel.writeString(this.f37243d);
        parcel.writeString(this.f37244e);
        parcel.writeString(this.f37245f);
        parcel.writeString(this.f37246g);
        parcel.writeString(this.f37247h);
        parcel.writeString(this.f37248i);
    }
}

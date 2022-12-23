package com.moovit.app.tod.bookingflow.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.transit.LocationDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001a0.C0017h;
import p583jk.C17884p;
import p977zz.C20946j0;
import p977zz.C20975x0;

public class TodBookingDropOffInformation implements Parcelable {
    public static final Parcelable.Creator<TodBookingDropOffInformation> CREATOR = new C15468a();

    /* renamed from: b */
    public final List<TodZoneShape> f40087b;

    /* renamed from: c */
    public final List<LocationDescriptor> f40088c;

    /* renamed from: d */
    public final TodZoneDropOffRestrictions f40089d;

    /* renamed from: e */
    public final String f40090e;

    /* renamed from: com.moovit.app.tod.bookingflow.model.TodBookingDropOffInformation$a */
    public class C15468a implements Parcelable.Creator<TodBookingDropOffInformation> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodBookingDropOffInformation(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodBookingDropOffInformation[i];
        }
    }

    public TodBookingDropOffInformation(ArrayList arrayList, ArrayList arrayList2, TodZoneDropOffRestrictions todZoneDropOffRestrictions, String str) {
        this.f40087b = Collections.unmodifiableList(arrayList);
        this.f40088c = Collections.unmodifiableList(arrayList2);
        this.f40089d = todZoneDropOffRestrictions;
        this.f40090e = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TodBookingDropOffInformation)) {
            return false;
        }
        TodBookingDropOffInformation todBookingDropOffInformation = (TodBookingDropOffInformation) obj;
        if (!this.f40087b.equals(todBookingDropOffInformation.f40087b) || !this.f40088c.equals(todBookingDropOffInformation.f40088c) || !this.f40089d.equals(todBookingDropOffInformation.f40089d) || !C20975x0.m49118e(this.f40090e, todBookingDropOffInformation.f40090e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f40087b), C17884p.m44335F(this.f40088c), C17884p.m44335F(this.f40089d), C17884p.m44335F(this.f40090e));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodBookingOrderDropOffInformation[dropOffShapes=");
        k.append(this.f40087b);
        k.append(", dropOffStops=");
        k.append(this.f40088c);
        k.append(", restrictions=");
        k.append(this.f40089d);
        k.append(", dropOffExplanationUrl=");
        return C0017h.m57N(k, this.f40090e, ']');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C20946j0.m49055b(i, parcel, this.f40087b);
        C20946j0.m49055b(i, parcel, this.f40088c);
        parcel.writeParcelable(this.f40089d, i);
        parcel.writeString(this.f40090e);
    }

    public TodBookingDropOffInformation(Parcel parcel) {
        this.f40087b = Collections.unmodifiableList(C20946j0.m49054a(parcel, TodZoneShape.class));
        this.f40088c = Collections.unmodifiableList(C20946j0.m49054a(parcel, LocationDescriptor.class));
        TodZoneDropOffRestrictions todZoneDropOffRestrictions = (TodZoneDropOffRestrictions) parcel.readParcelable(TodZoneDropOffRestrictions.class.getClassLoader());
        C21100e.m49373x(todZoneDropOffRestrictions, "restrictions");
        this.f40089d = todZoneDropOffRestrictions;
        this.f40090e = parcel.readString();
    }
}

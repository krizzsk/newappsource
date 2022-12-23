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

public class TodBookingPickupInformation implements Parcelable {
    public static final Parcelable.Creator<TodBookingPickupInformation> CREATOR = new C15470a();

    /* renamed from: b */
    public final String f40094b;

    /* renamed from: c */
    public final List<TodZoneShape> f40095c;

    /* renamed from: d */
    public final List<LocationDescriptor> f40096d;

    /* renamed from: e */
    public final boolean f40097e;

    /* renamed from: f */
    public final String f40098f;

    /* renamed from: com.moovit.app.tod.bookingflow.model.TodBookingPickupInformation$a */
    public class C15470a implements Parcelable.Creator<TodBookingPickupInformation> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodBookingPickupInformation(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodBookingPickupInformation[i];
        }
    }

    public TodBookingPickupInformation(String str, ArrayList arrayList, ArrayList arrayList2, boolean z, String str2) {
        C21100e.m49373x(str, "providerId");
        this.f40094b = str;
        this.f40095c = Collections.unmodifiableList(arrayList);
        this.f40096d = Collections.unmodifiableList(arrayList2);
        this.f40097e = z;
        this.f40098f = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TodBookingPickupInformation)) {
            return false;
        }
        TodBookingPickupInformation todBookingPickupInformation = (TodBookingPickupInformation) obj;
        if (!this.f40094b.equals(todBookingPickupInformation.f40094b) || !this.f40095c.equals(todBookingPickupInformation.f40095c) || !this.f40096d.equals(todBookingPickupInformation.f40096d) || this.f40097e != todBookingPickupInformation.f40097e || !C20975x0.m49118e(this.f40098f, todBookingPickupInformation.f40098f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f40094b), C17884p.m44335F(this.f40095c), C17884p.m44335F(this.f40096d), this.f40097e, C17884p.m44335F(this.f40098f));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodBookingOrderPickupInformation[providerId=");
        k.append(this.f40094b);
        k.append(", pickupShapes=");
        k.append(this.f40095c);
        k.append(", pickupStops=");
        k.append(this.f40096d);
        k.append(", hasServiceArea=");
        k.append(this.f40097e);
        k.append(", pickupExplanationUrl=");
        return C0017h.m57N(k, this.f40098f, ']');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40094b);
        C20946j0.m49055b(i, parcel, this.f40095c);
        C20946j0.m49055b(i, parcel, this.f40096d);
        parcel.writeInt(this.f40097e ? 1 : 0);
        parcel.writeString(this.f40098f);
    }

    public TodBookingPickupInformation(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "providerId");
        this.f40094b = readString;
        this.f40095c = Collections.unmodifiableList(C20946j0.m49054a(parcel, TodZoneShape.class));
        this.f40096d = Collections.unmodifiableList(C20946j0.m49054a(parcel, LocationDescriptor.class));
        this.f40097e = parcel.readInt() != 1 ? false : true;
        this.f40098f = parcel.readString();
    }
}

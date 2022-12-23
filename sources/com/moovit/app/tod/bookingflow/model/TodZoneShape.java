package com.moovit.app.tod.bookingflow.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.Polygon;
import com.moovit.commons.geo.Polylon;

public class TodZoneShape implements Parcelable {
    public static final Parcelable.Creator<TodZoneShape> CREATOR = new C15473a();

    /* renamed from: b */
    public final String f40102b;

    /* renamed from: c */
    public final Polygon f40103c;

    /* renamed from: com.moovit.app.tod.bookingflow.model.TodZoneShape$a */
    public class C15473a implements Parcelable.Creator<TodZoneShape> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodZoneShape(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodZoneShape[i];
        }
    }

    public TodZoneShape(String str, Polylon polylon) {
        C21100e.m49373x(str, "id");
        this.f40102b = str;
        this.f40103c = polylon;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodZoneShape)) {
            return false;
        }
        return this.f40102b.equals(((TodZoneShape) obj).f40102b);
    }

    public final int hashCode() {
        return this.f40102b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodZoneShape{shapeId=");
        k.append(this.f40102b);
        k.append(", polygon=");
        k.append(this.f40103c);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40102b);
        parcel.writeParcelable(this.f40103c, i);
    }

    public TodZoneShape(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "shapeId");
        this.f40102b = readString;
        Polygon polygon = (Polygon) parcel.readParcelable(Polygon.class.getClassLoader());
        C21100e.m49373x(polygon, "polygon");
        this.f40103c = polygon;
    }
}

package com.nutiteq.components;

import android.os.Parcel;
import android.os.Parcelable;
import na0.C12930h;

public class MapPos implements Parcelable {
    public static final Parcelable.Creator<MapPos> CREATOR = new C7978a();

    /* renamed from: b */
    public final double f24175b;

    /* renamed from: c */
    public final double f24176c;

    /* renamed from: d */
    public final double f24177d;

    /* renamed from: com.nutiteq.components.MapPos$a */
    public class C7978a implements Parcelable.Creator<MapPos> {
        public final Object createFromParcel(Parcel parcel) {
            return new MapPos(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        public final Object[] newArray(int i) {
            return new MapPos[i];
        }
    }

    public MapPos(double d, double d2) {
        this.f24175b = d;
        this.f24176c = d2;
        this.f24177d = 0.0d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MapPos mapPos = (MapPos) obj;
        if (this.f24175b == mapPos.f24175b && this.f24176c == mapPos.f24176c && this.f24177d == mapPos.f24177d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MapPos [x=");
        k.append(this.f24175b);
        k.append(", y=");
        k.append(this.f24176c);
        k.append(", z=");
        k.append(this.f24177d);
        k.append("]");
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f24175b);
        parcel.writeDouble(this.f24176c);
        parcel.writeDouble(this.f24177d);
    }

    public MapPos(double d, double d2, double d3) {
        this.f24175b = d;
        this.f24176c = d2;
        this.f24177d = d3;
    }

    public MapPos(MapPos mapPos) {
        this.f24175b = mapPos.f24175b;
        this.f24176c = mapPos.f24176c;
        this.f24177d = mapPos.f24177d;
    }

    public MapPos(C12930h hVar) {
        this.f24175b = hVar.f32028a;
        this.f24176c = hVar.f32029b;
        this.f24177d = hVar.f32030c;
    }
}

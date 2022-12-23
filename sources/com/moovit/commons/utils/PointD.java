package com.moovit.commons.utils;

import android.os.Parcel;
import android.os.Parcelable;
import p583jk.C17884p;

public class PointD implements Parcelable {
    public static final Parcelable.Creator<PointD> CREATOR = new C15776a();

    /* renamed from: b */
    public double f41030b;

    /* renamed from: c */
    public double f41031c;

    /* renamed from: com.moovit.commons.utils.PointD$a */
    public class C15776a implements Parcelable.Creator<PointD> {
        public final Object createFromParcel(Parcel parcel) {
            PointD pointD = new PointD();
            pointD.f41030b = parcel.readDouble();
            pointD.f41031c = parcel.readDouble();
            return pointD;
        }

        public final Object[] newArray(int i) {
            return new PointD[i];
        }
    }

    public PointD() {
        this(0.0d, 0.0d);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointD)) {
            return false;
        }
        PointD pointD = (PointD) obj;
        if (Double.compare(this.f41030b, pointD.f41030b) == 0 && Double.compare(this.f41031c, pointD.f41031c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44334E(Double.doubleToLongBits(this.f41030b)), C17884p.m44334E(Double.doubleToLongBits(this.f41031c)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PointD(");
        k.append(this.f41030b);
        k.append(", ");
        k.append(this.f41031c);
        k.append(")");
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f41030b);
        parcel.writeDouble(this.f41031c);
    }

    public PointD(double d, double d2) {
        this.f41030b = d;
        this.f41031c = d2;
    }
}

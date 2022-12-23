package com.cubic.umo.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ<\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo59060d2 = {"Lcom/cubic/umo/model/GpsCoordinates;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "elevation", "radius", "copy", "(DDLjava/lang/Double;Ljava/lang/Double;)Lcom/cubic/umo/model/GpsCoordinates;", "<init>", "(DDLjava/lang/Double;Ljava/lang/Double;)V", "core_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class GpsCoordinates implements Parcelable {
    public static final Parcelable.Creator<GpsCoordinates> CREATOR = new C2237a();

    /* renamed from: b */
    public final double f7822b;

    /* renamed from: c */
    public final double f7823c;

    /* renamed from: d */
    public final Double f7824d;

    /* renamed from: e */
    public final Double f7825e;

    /* renamed from: com.cubic.umo.model.GpsCoordinates$a */
    public static final class C2237a implements Parcelable.Creator<GpsCoordinates> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new GpsCoordinates(parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        public final Object[] newArray(int i) {
            return new GpsCoordinates[i];
        }
    }

    public GpsCoordinates(@C12943g(name = "lat") double d, @C12943g(name = "lon") double d2, @C12943g(name = "ele") Double d3, @C12943g(name = "acc") Double d4) {
        this.f7822b = d;
        this.f7823c = d2;
        this.f7824d = d3;
        this.f7825e = d4;
    }

    public final GpsCoordinates copy(@C12943g(name = "lat") double d, @C12943g(name = "lon") double d2, @C12943g(name = "ele") Double d3, @C12943g(name = "acc") Double d4) {
        return new GpsCoordinates(d, d2, d3, d4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsCoordinates)) {
            return false;
        }
        GpsCoordinates gpsCoordinates = (GpsCoordinates) obj;
        return C24362h.m61206a(Double.valueOf(this.f7822b), Double.valueOf(gpsCoordinates.f7822b)) && C24362h.m61206a(Double.valueOf(this.f7823c), Double.valueOf(gpsCoordinates.f7823c)) && C24362h.m61206a(this.f7824d, gpsCoordinates.f7824d) && C24362h.m61206a(this.f7825e, gpsCoordinates.f7825e);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f7822b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f7823c);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        Double d = this.f7824d;
        int i2 = 0;
        int hashCode = (i + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f7825e;
        if (d2 != null) {
            i2 = d2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("GpsCoordinates(latitude=");
        k.append(this.f7822b);
        k.append(", longitude=");
        k.append(this.f7823c);
        k.append(", elevation=");
        k.append(this.f7824d);
        k.append(", radius=");
        k.append(this.f7825e);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeDouble(this.f7822b);
        parcel.writeDouble(this.f7823c);
        Double d = this.f7824d;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f7825e;
        if (d2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d2.doubleValue());
    }
}

package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;

@SafeParcelable.Class(creator = "LatLngBoundsCreator")
@SafeParcelable.Reserved({1})
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new zzf();
    @SafeParcelable.Field(mo65739id = 3)
    public final LatLng northeast;
    @SafeParcelable.Field(mo65739id = 2)
    public final LatLng southwest;

    public static final class Builder {
        private double zza = Double.POSITIVE_INFINITY;
        private double zzb = Double.NEGATIVE_INFINITY;
        private double zzc = Double.NaN;
        private double zzd = Double.NaN;

        public LatLngBounds build() {
            Preconditions.checkState(!Double.isNaN(this.zzc), "no included points");
            return new LatLngBounds(new LatLng(this.zza, this.zzc), new LatLng(this.zzb, this.zzd));
        }

        public Builder include(LatLng latLng) {
            Preconditions.checkNotNull(latLng, "point must not be null");
            this.zza = Math.min(this.zza, latLng.latitude);
            this.zzb = Math.max(this.zzb, latLng.latitude);
            double d = latLng.longitude;
            if (Double.isNaN(this.zzc)) {
                this.zzc = d;
                this.zzd = d;
            } else {
                double d2 = this.zzc;
                double d3 = this.zzd;
                if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                    Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                    if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                        this.zzc = d;
                    } else {
                        this.zzd = d;
                    }
                }
            }
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LatLngBounds(@SafeParcelable.Param(mo65742id = 2) LatLng latLng, @SafeParcelable.Param(mo65742id = 3) LatLng latLng2) {
        boolean z;
        Preconditions.checkNotNull(latLng, "southwest must not be null.");
        Preconditions.checkNotNull(latLng2, "northeast must not be null.");
        double d = latLng2.latitude;
        double d2 = latLng.latitude;
        if (d >= d2) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.latitude));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LatLngBounds createFromAttributes(Context context, AttributeSet attributeSet) {
        return GoogleMapOptions.zzb(context, attributeSet);
    }

    private final boolean zza(double d) {
        double d2 = this.southwest.longitude;
        double d3 = this.northeast.longitude;
        return d2 <= d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
    }

    public boolean contains(LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double d = latLng2.latitude;
        if (this.southwest.latitude > d || d > this.northeast.latitude || !zza(latLng2.longitude)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (!this.southwest.equals(latLngBounds.southwest) || !this.northeast.equals(latLngBounds.northeast)) {
            return false;
        }
        return true;
    }

    public LatLng getCenter() {
        LatLng latLng = this.southwest;
        double d = latLng.latitude;
        LatLng latLng2 = this.northeast;
        double d2 = (d + latLng2.latitude) / 2.0d;
        double d3 = latLng2.longitude;
        double d4 = latLng.longitude;
        if (d4 > d3) {
            d3 += 360.0d;
        }
        return new LatLng(d2, (d3 + d4) / 2.0d);
    }

    public int hashCode() {
        return Objects.hashCode(this.southwest, this.northeast);
    }

    public LatLngBounds including(LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double min = Math.min(this.southwest.latitude, latLng2.latitude);
        double max = Math.max(this.northeast.latitude, latLng2.latitude);
        double d = this.northeast.longitude;
        double d2 = this.southwest.longitude;
        double d3 = latLng2.longitude;
        if (!zza(d3)) {
            if (((d2 - d3) + 360.0d) % 360.0d < ((d3 - d) + 360.0d) % 360.0d) {
                d2 = d3;
            } else {
                d = d3;
            }
        }
        return new LatLngBounds(new LatLng(min, d2), new LatLng(max, d));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("southwest", this.southwest).add("northeast", this.northeast).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.southwest, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.northeast, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Distance;
import java.util.Locale;

@SafeParcelable.Class(creator = "DistanceImplCreator")
public final class zze extends AbstractSafeParcelable implements Distance {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    @SafeParcelable.VersionField(mo65748id = 1)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final int zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public final double zzc;

    public zze(int i, double d) {
        this(1, 1, Double.NaN);
    }

    public final int compareTo(Distance distance) {
        if (!Double.isNaN(this.zzc) || !Double.isNaN(distance.getMeters())) {
            return Double.compare(this.zzc, distance.getMeters());
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zze = (zze) obj;
        if (this.zzb == zze.zzb && compareTo((Distance) zze) == 0) {
            return true;
        }
        return false;
    }

    public final int getAccuracy() {
        return this.zzb;
    }

    public final double getMeters() {
        return this.zzc;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Double.valueOf(this.zzc));
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(this.zzc);
        objArr[1] = this.zzb != 1 ? "UNKNOWN" : "LOW";
        return String.format(locale, "(%.1fm, %s)", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeDouble(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) double d) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = d;
    }
}

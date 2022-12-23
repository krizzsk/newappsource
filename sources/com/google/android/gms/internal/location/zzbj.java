package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;

@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
@VisibleForTesting
public final class zzbj extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbj> CREATOR = new zzbk();
    @SafeParcelable.Field(getter = "getRequestId", mo65739id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getExpirationTime", mo65739id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getType", mo65739id = 3)
    private final short zzc;
    @SafeParcelable.Field(getter = "getLatitude", mo65739id = 4)
    private final double zzd;
    @SafeParcelable.Field(getter = "getLongitude", mo65739id = 5)
    private final double zze;
    @SafeParcelable.Field(getter = "getRadius", mo65739id = 6)
    private final float zzf;
    @SafeParcelable.Field(getter = "getTransitionTypes", mo65739id = 7)
    private final int zzg;
    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", mo65739id = 8)
    private final int zzh;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLoiteringDelay", mo65739id = 9)
    private final int zzi;

    @SafeParcelable.Constructor
    public zzbj(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 7) int i, @SafeParcelable.Param(mo65742id = 3) short s, @SafeParcelable.Param(mo65742id = 4) double d, @SafeParcelable.Param(mo65742id = 5) double d2, @SafeParcelable.Param(mo65742id = 6) float f, @SafeParcelable.Param(mo65742id = 2) long j, @SafeParcelable.Param(mo65742id = 8) int i2, @SafeParcelable.Param(mo65742id = 9) int i3) {
        String str2;
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "requestId is null or too long: ".concat(valueOf);
            } else {
                str2 = new String("requestId is null or too long: ");
            }
            throw new IllegalArgumentException(str2);
        } else if (f <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.zzc = s;
                this.zza = str;
                this.zzd = d;
                this.zze = d2;
                this.zzf = f;
                this.zzb = j;
                this.zzg = i4;
                this.zzh = i2;
                this.zzi = i3;
                return;
            }
            throw new IllegalArgumentException(C13715c.m34241g(46, "No supported transition specified: ", i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbj) {
            zzbj zzbj = (zzbj) obj;
            if (this.zzf == zzbj.zzf && this.zzd == zzbj.zzd && this.zze == zzbj.zze && this.zzc == zzbj.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final long getExpirationTime() {
        return this.zzb;
    }

    public final double getLatitude() {
        return this.zzd;
    }

    public final int getLoiteringDelay() {
        return this.zzi;
    }

    public final double getLongitude() {
        return this.zze;
    }

    public final int getNotificationResponsiveness() {
        return this.zzh;
    }

    public final float getRadius() {
        return this.zzf;
    }

    public final String getRequestId() {
        return this.zza;
    }

    public final int getTransitionTypes() {
        return this.zzg;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzd);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((Float.floatToIntBits(this.zzf) + ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s = this.zzc;
        if (s == -1) {
            str = "INVALID";
        } else if (s != 1) {
            str = "UNKNOWN";
        } else {
            str = "CIRCLE";
        }
        objArr[0] = str;
        objArr[1] = this.zza.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.zzg);
        objArr[3] = Double.valueOf(this.zzd);
        objArr[4] = Double.valueOf(this.zze);
        objArr[5] = Float.valueOf(this.zzf);
        objArr[6] = Integer.valueOf(this.zzh / 1000);
        objArr[7] = Integer.valueOf(this.zzi);
        objArr[8] = Long.valueOf(this.zzb);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeShort(parcel, 3, this.zzc);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzd);
        SafeParcelWriter.writeDouble(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

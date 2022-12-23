package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbo();
    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;
    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;
    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", mo65739id = 1)
    public int zza;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", mo65739id = 2)
    public long zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", mo65739id = 3)
    public long zzc;
    @SafeParcelable.Field(defaultValue = "false", mo65739id = 4)
    public boolean zzd;
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", mo65739id = 5)
    public long zze;
    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", mo65739id = 6)
    public int zzf;
    @SafeParcelable.Field(defaultValue = "0", mo65739id = 7)
    public float zzg;
    @SafeParcelable.Field(defaultValue = "0", mo65739id = 8)
    public long zzh;
    @SafeParcelable.Field(defaultValue = "false", mo65739id = 9)
    public boolean zzi;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000, 600000, false, Long.MAX_VALUE, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, 0, false);
    }

    public static LocationRequest create() {
        return new LocationRequest(102, 3600000, 600000, false, Long.MAX_VALUE, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, 0, true);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && this.zzb == locationRequest.zzb && this.zzc == locationRequest.zzc && this.zzd == locationRequest.zzd && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.zzi == locationRequest.zzi) {
                return true;
            }
            return false;
        }
        return false;
    }

    public long getExpirationTime() {
        return this.zze;
    }

    public long getFastestInterval() {
        return this.zzc;
    }

    public long getInterval() {
        return this.zzb;
    }

    public long getMaxWaitTime() {
        long j = this.zzh;
        long j2 = this.zzb;
        return j < j2 ? j2 : j;
    }

    public int getNumUpdates() {
        return this.zzf;
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzg), Long.valueOf(this.zzh));
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.zzd;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzi;
    }

    public LocationRequest setExpirationDuration(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = Long.MAX_VALUE;
        if (j <= Long.MAX_VALUE - elapsedRealtime) {
            j2 = j + elapsedRealtime;
        }
        this.zze = j2;
        if (j2 < 0) {
            this.zze = 0;
        }
        return this;
    }

    @Deprecated
    public LocationRequest setExpirationTime(long j) {
        this.zze = j;
        if (j < 0) {
            this.zze = 0;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "illegal fastest interval: %d", Long.valueOf(j));
        this.zzd = true;
        this.zzc = j;
        return this;
    }

    public LocationRequest setInterval(long j) {
        Preconditions.checkArgument(j >= 0, "illegal interval: %d", Long.valueOf(j));
        this.zzb = j;
        if (!this.zzd) {
            this.zzc = (long) (((double) j) / 6.0d);
        }
        return this;
    }

    public LocationRequest setMaxWaitTime(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "illegal max wait time: %d", Long.valueOf(j));
        this.zzh = j;
        return this;
    }

    public LocationRequest setNumUpdates(int i) {
        if (i > 0) {
            this.zzf = i;
            return this;
        }
        throw new IllegalArgumentException(C13715c.m34241g(31, "invalid numUpdates: ", i));
    }

    public LocationRequest setPriority(int i) {
        boolean z;
        if (!(i == 100 || i == 102 || i == 104)) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
                Preconditions.checkArgument(z, "illegal priority: %d", Integer.valueOf(i));
                this.zza = i;
                return this;
            }
        }
        z = true;
        Preconditions.checkArgument(z, "illegal priority: %d", Integer.valueOf(i));
        this.zza = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            this.zzg = f;
            return this;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("invalid displacement: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }

    public LocationRequest setWaitForAccurateLocation(boolean z) {
        this.zzi = z;
        return this;
    }

    public String toString() {
        String str;
        StringBuilder k = C13555b.m33972k("Request[");
        int i = this.zza;
        if (i == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i == 104) {
            str = "PRIORITY_LOW_POWER";
        } else if (i != 105) {
            str = "???";
        } else {
            str = "PRIORITY_NO_POWER";
        }
        k.append(str);
        if (this.zza != 105) {
            k.append(" requested=");
            k.append(this.zzb);
            k.append("ms");
        }
        k.append(" fastest=");
        k.append(this.zzc);
        k.append("ms");
        if (this.zzh > this.zzb) {
            k.append(" maxWait=");
            k.append(this.zzh);
            k.append("ms");
        }
        if (this.zzg > BitmapDescriptorFactory.HUE_RED) {
            k.append(" smallestDisplacement=");
            k.append(this.zzg);
            k.append(InneractiveMediationDefs.GENDER_MALE);
        }
        long j = this.zze;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            k.append(" expireIn=");
            k.append(j - elapsedRealtime);
            k.append("ms");
        }
        if (this.zzf != Integer.MAX_VALUE) {
            k.append(" num=");
            k.append(this.zzf);
        }
        k.append(']');
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) long j, @SafeParcelable.Param(mo65742id = 3) long j2, @SafeParcelable.Param(mo65742id = 4) boolean z, @SafeParcelable.Param(mo65742id = 5) long j3, @SafeParcelable.Param(mo65742id = 6) int i2, @SafeParcelable.Param(mo65742id = 7) float f, @SafeParcelable.Param(mo65742id = 8) long j4, @SafeParcelable.Param(mo65742id = 9) boolean z2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = z;
        this.zze = j3;
        this.zzf = i2;
        this.zzg = f;
        this.zzh = j4;
        this.zzi = z2;
    }
}

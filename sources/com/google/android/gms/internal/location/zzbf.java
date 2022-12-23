package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "LocationRequestInternalCreator")
@SafeParcelable.Reserved({2, 3, 4, 1000})
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbg();
    public static final List zza = Collections.emptyList();
    @SafeParcelable.Field(defaultValueUnchecked = "null", mo65739id = 1)
    public final LocationRequest zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_CLIENTS", mo65739id = 5)
    public final List zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "null", mo65739id = 6)
    public final String zzd;
    @SafeParcelable.Field(defaultValue = "false", mo65739id = 7)
    public final boolean zze;
    @SafeParcelable.Field(defaultValue = "false", mo65739id = 8)
    public final boolean zzf;
    @SafeParcelable.Field(defaultValue = "false", mo65739id = 9)
    public final boolean zzg;
    @SafeParcelable.Field(defaultValueUnchecked = "null", mo65739id = 10)
    public final String zzh;
    @SafeParcelable.Field(defaultValue = "false", mo65739id = 11)
    public final boolean zzi;
    @SafeParcelable.Field(defaultValue = "false", mo65739id = 12)
    public boolean zzj;
    @SafeParcelable.Field(defaultValueUnchecked = "null", mo65739id = 13)
    public final String zzk;
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", mo65739id = 14)
    public long zzl;

    @SafeParcelable.Constructor
    public zzbf(@SafeParcelable.Param(mo65742id = 1) LocationRequest locationRequest, @SafeParcelable.Param(mo65742id = 5) List list, @SafeParcelable.Param(mo65742id = 6) String str, @SafeParcelable.Param(mo65742id = 7) boolean z, @SafeParcelable.Param(mo65742id = 8) boolean z2, @SafeParcelable.Param(mo65742id = 9) boolean z3, @SafeParcelable.Param(mo65742id = 10) String str2, @SafeParcelable.Param(mo65742id = 11) boolean z4, @SafeParcelable.Param(mo65742id = 12) boolean z5, @SafeParcelable.Param(mo65742id = 13) String str3, @SafeParcelable.Param(mo65742id = 14) long j) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        this.zzh = str2;
        this.zzi = z4;
        this.zzj = z5;
        this.zzk = str3;
        this.zzl = j;
    }

    public static zzbf zzc(String str, LocationRequest locationRequest) {
        return new zzbf(locationRequest, zzbx.zzk(), (String) null, false, false, false, (String) null, false, false, (String) null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbf) {
            zzbf zzbf = (zzbf) obj;
            if (!Objects.equal(this.zzb, zzbf.zzb) || !Objects.equal(this.zzc, zzbf.zzc) || !Objects.equal(this.zzd, zzbf.zzd) || this.zze != zzbf.zze || this.zzf != zzbf.zzf || this.zzg != zzbf.zzg || !Objects.equal(this.zzh, zzbf.zzh) || this.zzi != zzbf.zzi || this.zzj != zzbf.zzj || !Objects.equal(this.zzk, zzbf.zzk)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        if (this.zzd != null) {
            sb.append(" tag=");
            sb.append(this.zzd);
        }
        if (this.zzh != null) {
            sb.append(" moduleId=");
            sb.append(this.zzh);
        }
        if (this.zzk != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.zzk);
        }
        sb.append(" hideAppOps=");
        sb.append(this.zze);
        sb.append(" clients=");
        sb.append(this.zzc);
        sb.append(" forceCoarseLocation=");
        sb.append(this.zzf);
        if (this.zzg) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzg);
        SafeParcelWriter.writeString(parcel, 10, this.zzh, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzj);
        SafeParcelWriter.writeString(parcel, 13, this.zzk, false);
        SafeParcelWriter.writeLong(parcel, 14, this.zzl);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        return this.zzl;
    }

    public final LocationRequest zzb() {
        return this.zzb;
    }

    @Deprecated
    public final zzbf zzd(boolean z) {
        this.zzj = true;
        return this;
    }

    public final zzbf zze(long j) {
        if (this.zzb.getMaxWaitTime() <= this.zzb.getInterval()) {
            this.zzl = j;
            return this;
        }
        long interval = this.zzb.getInterval();
        long maxWaitTime = this.zzb.getMaxWaitTime();
        StringBuilder sb = new StringBuilder(120);
        sb.append("could not set max age when location batching is requested, interval=");
        sb.append(interval);
        sb.append("maxWaitTime=");
        sb.append(maxWaitTime);
        throw new IllegalArgumentException(sb.toString());
    }

    public final List zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzi;
    }
}

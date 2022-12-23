package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "OnBandwidthChangedParamsCreator")
public final class zzkq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkq> CREATOR = new zzkr();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", mo65739id = 1)
    private String zza;
    @SafeParcelable.Field(getter = "getQuality", mo65739id = 2)
    private int zzb;
    @SafeParcelable.Field(defaultValue = "0", getter = "getMedium", mo65739id = 3)
    private final int zzc;
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", mo65739id = 4)
    private final int zzd;
    @SafeParcelable.Field(getter = "getPresenceDevice", mo65739id = 5)
    private zznv zze;

    private zzkq() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzkq) {
            zzkq zzkq = (zzkq) obj;
            if (!Objects.equal(this.zza, zzkq.zza) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzkq.zzb)) || !Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzkq.zzc)) || !Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(zzkq.zzd)) || !Objects.equal(this.zze, zzkq.zze)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzkq(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) int i2, @SafeParcelable.Param(mo65742id = 4) int i3, @SafeParcelable.Param(mo65742id = 5) zznv zznv) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = zznv;
    }
}

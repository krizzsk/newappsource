package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "OnPayloadReceivedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzli extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzli> CREATOR = new zzlj();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", mo65739id = 1)
    private String zza;
    @SafeParcelable.Field(getter = "getPayload", mo65739id = 2)
    private zzmb zzb;
    @SafeParcelable.Field(getter = "getIsReliable", mo65739id = 3)
    private boolean zzc;
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", mo65739id = 4)
    private final int zzd;
    @SafeParcelable.Field(getter = "getPresenceDevice", mo65739id = 5)
    private zznv zze;

    private zzli() {
        this.zzd = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzli) {
            zzli zzli = (zzli) obj;
            if (!Objects.equal(this.zza, zzli.zza) || !Objects.equal(this.zzb, zzli.zzb) || !Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(zzli.zzc)) || !Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(zzli.zzd)) || !Objects.equal(this.zze, zzli.zze)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Boolean.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzmb zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    public zzli(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) zzmb zzmb, @SafeParcelable.Param(mo65742id = 3) boolean z, @SafeParcelable.Param(mo65742id = 4) int i, @SafeParcelable.Param(mo65742id = 5) zznv zznv) {
        this.zza = str;
        this.zzb = zzmb;
        this.zzc = z;
        this.zzd = i;
        this.zze = zznv;
    }
}

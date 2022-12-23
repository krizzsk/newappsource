package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "OnDisconnectedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzla extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzla> CREATOR = new zzlb();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", mo65739id = 1)
    private String zza;
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", mo65739id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getPresenceDevice", mo65739id = 3)
    private zznv zzc;

    private zzla() {
        this.zzb = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzla) {
            zzla zzla = (zzla) obj;
            if (!Objects.equal(this.zza, zzla.zza) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzla.zzb)) || !Objects.equal(this.zzc, zzla.zzc)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzla(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) zznv zznv) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zznv;
    }
}

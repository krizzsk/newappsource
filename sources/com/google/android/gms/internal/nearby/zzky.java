package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "OnConnectionResultParamsCreator")
public final class zzky extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzky> CREATOR = new zzkz();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", mo65739id = 1)
    private String zza;
    @SafeParcelable.Field(getter = "getStatusCode", mo65739id = 2)
    private int zzb;
    @SafeParcelable.Field(getter = "getHandshakeData", mo65739id = 3)
    private byte[] zzc;
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", mo65739id = 4)
    private final int zzd;
    @SafeParcelable.Field(getter = "getPresenceDevice", mo65739id = 5)
    private zznv zze;

    private zzky() {
        this.zzd = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzky) {
            zzky zzky = (zzky) obj;
            if (!Objects.equal(this.zza, zzky.zza) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzky.zzb)) || !Arrays.equals(this.zzc, zzky.zzc) || !Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(zzky.zzd)) || !Objects.equal(this.zze, zzky.zze)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(this.zzd), this.zze);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzky(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) byte[] bArr, @SafeParcelable.Param(mo65742id = 4) int i2, @SafeParcelable.Param(mo65742id = 5) zznv zznv) {
        this.zza = str;
        this.zzb = i;
        this.zzc = bArr;
        this.zzd = i2;
        this.zze = zznv;
    }
}

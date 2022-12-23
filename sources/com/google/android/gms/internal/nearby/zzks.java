package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "OnConnectionInitiatedParamsCreator")
public final class zzks extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzks> CREATOR = new zzkt();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", mo65739id = 1)
    private String zza;
    @SafeParcelable.Field(getter = "getRemoteEndpointName", mo65739id = 2)
    private String zzb;
    @SafeParcelable.Field(getter = "getAuthenticationToken", mo65739id = 3)
    private String zzc;
    @SafeParcelable.Field(getter = "getIsIncomingConnection", mo65739id = 4)
    private boolean zzd;
    @SafeParcelable.Field(getter = "getHandshakeData", mo65739id = 5)
    private byte[] zze;
    @SafeParcelable.Field(getter = "getRawAuthenticationToken", mo65739id = 6)
    private byte[] zzf;
    @SafeParcelable.Field(getter = "getRemoteEndpointInfo", mo65739id = 7)
    private byte[] zzg;
    @SafeParcelable.Field(getter = "getIsConnectionVerified", mo65739id = 8)
    private boolean zzh;
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", mo65739id = 9)
    private final int zzi;
    @SafeParcelable.Field(getter = "getPresenceDevice", mo65739id = 10)
    private zznv zzj;

    private zzks() {
        this.zzi = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzks) {
            zzks zzks = (zzks) obj;
            if (!Objects.equal(this.zza, zzks.zza) || !Objects.equal(this.zzb, zzks.zzb) || !Objects.equal(this.zzc, zzks.zzc) || !Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(zzks.zzd)) || !Arrays.equals(this.zze, zzks.zze) || !Arrays.equals(this.zzf, zzks.zzf) || !Arrays.equals(this.zzg, zzks.zzg) || !Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(zzks.zzh)) || !Objects.equal(Integer.valueOf(this.zzi), Integer.valueOf(zzks.zzi)) || !Objects.equal(this.zzj, zzks.zzj)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, Boolean.valueOf(this.zzd), Integer.valueOf(Arrays.hashCode(this.zze)), Integer.valueOf(Arrays.hashCode(this.zzf)), Integer.valueOf(Arrays.hashCode(this.zzg)), Boolean.valueOf(this.zzh), Integer.valueOf(this.zzi), this.zzj);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zze, false);
        SafeParcelWriter.writeByteArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzh;
    }

    public final boolean zze() {
        return this.zzd;
    }

    public final byte[] zzf() {
        return this.zzf;
    }

    public final byte[] zzg() {
        return this.zzg;
    }

    @SafeParcelable.Constructor
    public zzks(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) String str3, @SafeParcelable.Param(mo65742id = 4) boolean z, @SafeParcelable.Param(mo65742id = 5) byte[] bArr, @SafeParcelable.Param(mo65742id = 6) byte[] bArr2, @SafeParcelable.Param(mo65742id = 7) byte[] bArr3, @SafeParcelable.Param(mo65742id = 8) boolean z2, @SafeParcelable.Param(mo65742id = 9) int i, @SafeParcelable.Param(mo65742id = 10) zznv zznv) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z;
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = bArr3;
        this.zzh = z2;
        this.zzi = i;
        this.zzj = zznv;
    }
}

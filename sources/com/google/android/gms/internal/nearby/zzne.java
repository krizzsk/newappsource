package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "BleFilterCreator")
public final class zzne extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzne> CREATOR = new zznf();
    @SafeParcelable.VersionField(getter = "getVersionCode", mo65748id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getServiceUuid", mo65739id = 4)
    private final ParcelUuid zzb;
    @SafeParcelable.Field(getter = "getServiceUuidMask", mo65739id = 5)
    private final ParcelUuid zzc;
    @SafeParcelable.Field(getter = "getServiceDataUuid", mo65739id = 6)
    private final ParcelUuid zzd;
    @SafeParcelable.Field(getter = "getServiceData", mo65739id = 7)
    private final byte[] zze;
    @SafeParcelable.Field(getter = "getServiceDataMask", mo65739id = 8)
    private final byte[] zzf;
    @SafeParcelable.Field(getter = "getManufacturerId", mo65739id = 9)
    private final int zzg;
    @SafeParcelable.Field(getter = "getManufacturerData", mo65739id = 10)
    private final byte[] zzh;
    @SafeParcelable.Field(getter = "getManufacturerDataMask", mo65739id = 11)
    private final byte[] zzi;

    @SafeParcelable.Constructor
    public zzne(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 4) ParcelUuid parcelUuid, @SafeParcelable.Param(mo65742id = 5) ParcelUuid parcelUuid2, @SafeParcelable.Param(mo65742id = 6) ParcelUuid parcelUuid3, @SafeParcelable.Param(mo65742id = 7) byte[] bArr, @SafeParcelable.Param(mo65742id = 8) byte[] bArr2, @SafeParcelable.Param(mo65742id = 9) int i2, @SafeParcelable.Param(mo65742id = 10) byte[] bArr3, @SafeParcelable.Param(mo65742id = 11) byte[] bArr4) {
        this.zza = i;
        this.zzb = parcelUuid;
        this.zzc = parcelUuid2;
        this.zzd = parcelUuid3;
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = i2;
        this.zzh = bArr3;
        this.zzi = bArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzne.class == obj.getClass()) {
            zzne zzne = (zzne) obj;
            if (this.zzg != zzne.zzg || !Arrays.equals(this.zzh, zzne.zzh) || !Arrays.equals(this.zzi, zzne.zzi) || !Objects.equal(this.zzd, zzne.zzd) || !Arrays.equals(this.zze, zzne.zze) || !Arrays.equals(this.zzf, zzne.zzf) || !Objects.equal(this.zzb, zzne.zzb) || !Objects.equal(this.zzc, zzne.zzc)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzg), Integer.valueOf(Arrays.hashCode(this.zzh)), Integer.valueOf(Arrays.hashCode(this.zzi)), this.zzd, Integer.valueOf(Arrays.hashCode(this.zze)), Integer.valueOf(Arrays.hashCode(this.zzf)), this.zzb, this.zzc);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzd, i, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zze, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzg);
        SafeParcelWriter.writeByteArray(parcel, 10, this.zzh, false);
        SafeParcelWriter.writeByteArray(parcel, 11, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

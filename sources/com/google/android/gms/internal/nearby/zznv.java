package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

@SafeParcelable.Class(creator = "PresenceDeviceCreator")
public final class zznv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznv> CREATOR = new zznw();
    @SafeParcelable.Field(getter = "getDeviceId", mo65739id = 1)
    private final long zza;
    @SafeParcelable.Field(getter = "getDeviceName", mo65739id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getDeviceType", mo65739id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getDeviceImageUrl", mo65739id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getDiscoveryTimestampMillis", mo65739id = 5)
    private final long zze;
    @SafeParcelable.Field(getter = "getEndpointId", mo65739id = 6)
    private final String zzf;
    @SafeParcelable.Field(getter = "getEndpointInfo", mo65739id = 7)
    private final byte[] zzg;
    @SafeParcelable.Field(getter = "getBluetoothMacAddress", mo65739id = 8)
    private final byte[] zzh;
    @SafeParcelable.Field(getter = "getActions", mo65739id = 9)
    private final List zzi;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.nearby.presence.PresenceIdentity.IdentityType.PRIVATE", getter = "getIdentityType", mo65739id = 10)
    private final int zzj;

    @SafeParcelable.Constructor
    public zznv(@SafeParcelable.Param(mo65742id = 1) long j, @SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) int i, @SafeParcelable.Param(mo65742id = 4) String str2, @SafeParcelable.Param(mo65742id = 5) long j2, @SafeParcelable.Param(mo65742id = 6) String str3, @SafeParcelable.Param(mo65742id = 7) byte[] bArr, @SafeParcelable.Param(mo65742id = 8) byte[] bArr2, @SafeParcelable.Param(mo65742id = 9) List list, @SafeParcelable.Param(mo65742id = 10) int i2) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
        this.zzd = str2;
        this.zze = j2;
        this.zzf = str3;
        this.zzg = bArr;
        this.zzh = bArr2;
        this.zzi = list;
        this.zzj = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zznv) {
            zznv zznv = (zznv) obj;
            if (!Objects.equal(Long.valueOf(this.zza), Long.valueOf(zznv.zza)) || !Objects.equal(this.zzb, zznv.zzb) || !Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zznv.zzc)) || !Objects.equal(this.zzd, zznv.zzd) || !Objects.equal(this.zzf, zznv.zzf) || !Arrays.equals(this.zzg, zznv.zzg) || !Arrays.equals(this.zzh, zznv.zzh) || !Objects.equal(this.zzi, zznv.zzi) || !Objects.equal(Integer.valueOf(this.zzj), Integer.valueOf(zznv.zzj))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zzf, Integer.valueOf(Arrays.hashCode(this.zzg)), Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi, Integer.valueOf(this.zzj));
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[10];
        objArr[0] = Long.valueOf(this.zza);
        objArr[1] = this.zzb;
        objArr[2] = Integer.valueOf(this.zzc);
        objArr[3] = this.zzd;
        objArr[4] = Long.valueOf(this.zze);
        objArr[5] = this.zzf;
        byte[] bArr = this.zzg;
        Integer num = null;
        if (bArr == null) {
            str = null;
        } else {
            str = Arrays.toString(bArr);
        }
        objArr[6] = str;
        byte[] bArr2 = this.zzh;
        if (bArr2 != null) {
            num = Integer.valueOf(Arrays.hashCode(bArr2));
        }
        objArr[7] = num;
        objArr[8] = this.zzi;
        objArr[9] = Integer.valueOf(this.zzj);
        return String.format("PresenceDevice:<deviceId: %s, deviceName: %s, deviceType: %s, deviceImageUrl: %s, discoveryTimestampMillis: %s, endpointId: %s, endpointInfo: %s, bluetoothMacAddress hash: %s, actions: %s, identityType: %s>", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzsq zzsq;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeByteArray(parcel, 7, zzb(), false);
        SafeParcelWriter.writeByteArray(parcel, 8, zza(), false);
        List list = this.zzi;
        if (list == null) {
            zzsq = zzsq.zzl();
        } else {
            zzsq = zzsq.zzk(list);
        }
        SafeParcelWriter.writeTypedList(parcel, 9, zzsq, false);
        SafeParcelWriter.writeInt(parcel, 10, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final byte[] zza() {
        byte[] bArr = this.zzh;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzg;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }
}

package com.google.android.gms.internal.nearby;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "OnEndpointFoundParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzle> CREATOR = new zzlf();
    @SafeParcelable.Field(getter = "getEndpointId", mo65739id = 1)
    private String zza;
    @SafeParcelable.Field(getter = "getServiceId", mo65739id = 2)
    private String zzb;
    @SafeParcelable.Field(getter = "getEndpointName", mo65739id = 3)
    private String zzc;
    @SafeParcelable.Field(getter = "getBluetoothDevice", mo65739id = 4)
    private BluetoothDevice zzd;
    @SafeParcelable.Field(getter = "getEndpointInfo", mo65739id = 5)
    private byte[] zze;

    private zzle() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzle) {
            zzle zzle = (zzle) obj;
            if (!Objects.equal(this.zza, zzle.zza) || !Objects.equal(this.zzb, zzle.zzb) || !Objects.equal(this.zzc, zzle.zzc) || !Objects.equal(this.zzd, zzle.zzd) || !Arrays.equals(this.zze, zzle.zze)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, Integer.valueOf(Arrays.hashCode(this.zze)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final BluetoothDevice zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final byte[] zze() {
        return this.zze;
    }

    @SafeParcelable.Constructor
    public zzle(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) String str3, @SafeParcelable.Param(mo65742id = 4) BluetoothDevice bluetoothDevice, @SafeParcelable.Param(mo65742id = 5) byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bluetoothDevice;
        this.zze = bArr;
    }
}

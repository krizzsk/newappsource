package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "RangingParametersParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzpy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpy> CREATOR = new zzpz();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getUwbConfigId", mo65739id = 1)
    public int zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getSessionId", mo65739id = 2)
    public int zzb;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getSessionKeyInfo", mo65739id = 3)
    public byte[] zzc;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getComplexChannel", mo65739id = 4)
    public zzqv zzd;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getRangingUpdateRate", mo65739id = 5)
    public int zze;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getPeerDevices", mo65739id = 6)
    public zzrv[] zzf;

    private zzpy() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzpy) {
            zzpy zzpy = (zzpy) obj;
            if (!Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzpy.zza)) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzpy.zzb)) || !Arrays.equals(this.zzc, zzpy.zzc) || !Objects.equal(this.zzd, zzpy.zzd) || !Objects.equal(Integer.valueOf(this.zze), Integer.valueOf(zzpy.zze)) || !Arrays.equals(this.zzf, zzpy.zzf)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd, Integer.valueOf(this.zze), Integer.valueOf(Arrays.hashCode(this.zzf)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzpy(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) byte[] bArr, @SafeParcelable.Param(mo65742id = 4) zzqv zzqv, @SafeParcelable.Param(mo65742id = 5) int i3, @SafeParcelable.Param(mo65742id = 6) zzrv[] zzrvArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = bArr;
        this.zzd = zzqv;
        this.zze = i3;
        this.zzf = zzrvArr;
    }

    public /* synthetic */ zzpy(zzpx zzpx) {
    }
}

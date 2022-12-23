package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "OnConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzku extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzku> CREATOR = new zzkv();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", mo65739id = 1)
    private String zza;
    @SafeParcelable.Field(getter = "getRemoteEndpointName", mo65739id = 2)
    private String zzb;
    @SafeParcelable.Field(getter = "getHandshakeData", mo65739id = 3)
    private byte[] zzc;

    private zzku() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzku) {
            zzku zzku = (zzku) obj;
            if (!Objects.equal(this.zza, zzku.zza) || !Objects.equal(this.zzb, zzku.zzb) || !Arrays.equals(this.zzc, zzku.zzc)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final byte[] zzc() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    public zzku(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
    }
}

package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

@SafeParcelable.Class(creator = "OnPayloadTransferUpdateParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzlk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlk> CREATOR = new zzll();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", mo65739id = 1)
    private String zza;
    @SafeParcelable.Field(getter = "getUpdate", mo65739id = 2)
    private PayloadTransferUpdate zzb;
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", mo65739id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getPresenceDevice", mo65739id = 4)
    private zznv zzd;

    private zzlk() {
        this.zzc = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlk) {
            zzlk zzlk = (zzlk) obj;
            if (!Objects.equal(this.zza, zzlk.zza) || !Objects.equal(this.zzb, zzlk.zzb) || !Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzlk.zzc)) || !Objects.equal(this.zzd, zzlk.zzd)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final PayloadTransferUpdate zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzlk(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) PayloadTransferUpdate payloadTransferUpdate, @SafeParcelable.Param(mo65742id = 3) int i, @SafeParcelable.Param(mo65742id = 4) zznv zznv) {
        this.zza = str;
        this.zzb = payloadTransferUpdate;
        this.zzc = i;
        this.zzd = zznv;
    }
}

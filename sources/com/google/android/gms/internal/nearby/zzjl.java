package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DisconnectFromEndpointParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzjl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjl> CREATOR = new zzjm();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", mo65739id = 1)
    public String zza;
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", mo65739id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getPresenceDevice", mo65739id = 3)
    private zznv zzc;

    private zzjl() {
        this.zzb = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjl) {
            zzjl zzjl = (zzjl) obj;
            if (!Objects.equal(this.zza, zzjl.zza) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzjl.zzb)) || !Objects.equal(this.zzc, zzjl.zzc)) {
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

    public /* synthetic */ zzjl(zzjk zzjk) {
        this.zzb = 0;
    }

    @SafeParcelable.Constructor
    public zzjl(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) zznv zznv) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zznv;
    }
}

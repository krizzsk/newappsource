package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UwbDeviceParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzrv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrv> CREATOR = new zzrw();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getAddress", mo65739id = 1)
    public zzqq zza;

    private zzrv() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzrv) {
            return Objects.equal(this.zza, ((zzrv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzqq zza() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzrv(@SafeParcelable.Param(mo65742id = 1) zzqq zzqq) {
        this.zza = zzqq;
    }

    public /* synthetic */ zzrv(zzru zzru) {
    }
}

package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "UwbAddressParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqq> CREATOR = new zzqr();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getAddress", mo65739id = 1)
    public byte[] zza;
    @SafeParcelable.Field(getter = "getStatusCode", mo65739id = 2)
    private int zzb;

    private zzqq() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqq) {
            zzqq zzqq = (zzqq) obj;
            if (!Arrays.equals(this.zza, zzqq.zza) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzqq.zzb))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final byte[] zzb() {
        return this.zza;
    }

    public /* synthetic */ zzqq(zzqp zzqp) {
    }

    @SafeParcelable.Constructor
    public zzqq(@SafeParcelable.Param(mo65742id = 1) byte[] bArr, @SafeParcelable.Param(mo65742id = 2) int i) {
        this.zza = bArr;
        this.zzb = i;
    }
}

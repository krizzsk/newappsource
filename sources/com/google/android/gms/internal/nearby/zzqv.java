package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UwbComplexChannelParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqv> CREATOR = new zzqw();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getChannel", mo65739id = 1)
    public int zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getPreambleIndex", mo65739id = 2)
    public int zzb;
    @SafeParcelable.Field(getter = "getStatusCode", mo65739id = 3)
    private int zzc;

    private zzqv() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqv) {
            zzqv zzqv = (zzqv) obj;
            if (!Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzqv.zza)) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzqv.zzb)) || !Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzqv.zzc))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    public zzqv(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public /* synthetic */ zzqv(zzqu zzqu) {
    }
}

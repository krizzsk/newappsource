package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();
    @SafeParcelable.Field(mo65739id = 2)
    public final String zza;
    @SafeParcelable.Field(mo65739id = 3)
    public final zzau zzb;
    @SafeParcelable.Field(mo65739id = 4)
    public final String zzc;
    @SafeParcelable.Field(mo65739id = 5)
    public final long zzd;

    public zzaw(zzaw zzaw, long j) {
        Preconditions.checkNotNull(zzaw);
        this.zza = zzaw.zza;
        this.zzb = zzaw.zzb;
        this.zzc = zzaw.zzc;
        this.zzd = j;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        StringBuilder h = C16759e.m42352h("origin=", str, ",name=", str2, ",params=");
        h.append(valueOf);
        return h.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzax.zza(this, parcel, i);
    }

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) zzau zzau, @SafeParcelable.Param(mo65742id = 4) String str2, @SafeParcelable.Param(mo65742id = 5) long j) {
        this.zza = str;
        this.zzb = zzau;
        this.zzc = str2;
        this.zzd = j;
    }
}

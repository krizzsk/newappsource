package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzfcx;
import com.google.android.gms.internal.ads.zzfpg;

@SafeParcelable.Class(creator = "ExceptionParcelCreator")
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    @SafeParcelable.Field(mo65739id = 1)
    public final String zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzaz(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    public static zzaz zza(Throwable th) {
        String str;
        zze zza2 = zzfcx.zza(th);
        if (zzfpg.zzd(th.getMessage())) {
            str = zza2.zzb;
        } else {
            str = th.getMessage();
        }
        return new zzaz(str, zza2.zza);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

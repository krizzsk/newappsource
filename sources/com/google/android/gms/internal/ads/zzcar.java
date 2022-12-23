package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RewardedVideoAdRequestParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzcar extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcar> CREATOR = new zzcas();
    @SafeParcelable.Field(mo65739id = 2)
    public final zzl zza;
    @SafeParcelable.Field(mo65739id = 3)
    public final String zzb;

    @SafeParcelable.Constructor
    public zzcar(@SafeParcelable.Param(mo65742id = 2) zzl zzl, @SafeParcelable.Param(mo65742id = 3) String str) {
        this.zza = zzl;
        this.zzb = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

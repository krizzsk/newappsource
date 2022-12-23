package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignalConfigurationParcelCreator")
public final class zzced extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzced> CREATOR = new zzcee();
    @SafeParcelable.Field(mo65739id = 1)
    @Deprecated
    public final String zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final String zzb;
    @SafeParcelable.Field(mo65739id = 3)
    @Deprecated
    public final zzq zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public final zzl zzd;

    @SafeParcelable.Constructor
    public zzced(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) zzq zzq, @SafeParcelable.Param(mo65742id = 4) zzl zzl) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzq;
        this.zzd = zzl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AdapterStatusParcelCreator")
public final class zzbqf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqf> CREATOR = new zzbqg();
    @SafeParcelable.Field(mo65739id = 1)
    public final String zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final boolean zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public final int zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public final String zzd;

    @SafeParcelable.Constructor
    public zzbqf(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) boolean z, @SafeParcelable.Param(mo65742id = 3) int i, @SafeParcelable.Param(mo65742id = 4) String str2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
        this.zzd = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

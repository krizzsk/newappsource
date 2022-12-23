package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "InstreamAdConfigurationParcelCreator")
public final class zzbqr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqr> CREATOR = new zzbqs();
    @SafeParcelable.VersionField(mo65748id = 1000)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 1)
    public final int zzb;
    @SafeParcelable.Field(mo65739id = 2)
    public final String zzc;
    @SafeParcelable.Field(mo65739id = 3)
    public final int zzd;

    @SafeParcelable.Constructor
    public zzbqr(@SafeParcelable.Param(mo65742id = 1000) int i, @SafeParcelable.Param(mo65742id = 1) int i2, @SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        SafeParcelWriter.writeString(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

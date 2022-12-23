package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "NonagonRequestParcelCreator")
public final class zzbzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbzu> CREATOR = new zzbzv();
    @SafeParcelable.Field(mo65739id = 1)
    public final Bundle zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final zzcfo zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public final ApplicationInfo zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public final String zzd;
    @SafeParcelable.Field(mo65739id = 5)
    public final List zze;
    @SafeParcelable.Field(mo65739id = 6)
    public final PackageInfo zzf;
    @SafeParcelable.Field(mo65739id = 7)
    public final String zzg;
    @SafeParcelable.Field(mo65739id = 9)
    public final String zzh;
    @SafeParcelable.Field(mo65739id = 10)
    public zzfdu zzi;
    @SafeParcelable.Field(mo65739id = 11)
    public String zzj;

    @SafeParcelable.Constructor
    public zzbzu(@SafeParcelable.Param(mo65742id = 1) Bundle bundle, @SafeParcelable.Param(mo65742id = 2) zzcfo zzcfo, @SafeParcelable.Param(mo65742id = 3) ApplicationInfo applicationInfo, @SafeParcelable.Param(mo65742id = 4) String str, @SafeParcelable.Param(mo65742id = 5) List list, @SafeParcelable.Param(mo65742id = 6) PackageInfo packageInfo, @SafeParcelable.Param(mo65742id = 7) String str2, @SafeParcelable.Param(mo65742id = 9) String str3, @SafeParcelable.Param(mo65742id = 10) zzfdu zzfdu, @SafeParcelable.Param(mo65742id = 11) String str4) {
        this.zza = bundle;
        this.zzb = zzcfo;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfdu;
        this.zzj = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

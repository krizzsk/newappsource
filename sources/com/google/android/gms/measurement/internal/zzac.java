package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();
    @SafeParcelable.Field(mo65739id = 2)
    public String zza;
    @SafeParcelable.Field(mo65739id = 3)
    public String zzb;
    @SafeParcelable.Field(mo65739id = 4)
    public zzlc zzc;
    @SafeParcelable.Field(mo65739id = 5)
    public long zzd;
    @SafeParcelable.Field(mo65739id = 6)
    public boolean zze;
    @SafeParcelable.Field(mo65739id = 7)
    public String zzf;
    @SafeParcelable.Field(mo65739id = 8)
    public final zzaw zzg;
    @SafeParcelable.Field(mo65739id = 9)
    public long zzh;
    @SafeParcelable.Field(mo65739id = 10)
    public zzaw zzi;
    @SafeParcelable.Field(mo65739id = 11)
    public final long zzj;
    @SafeParcelable.Field(mo65739id = 12)
    public final zzaw zzk;

    public zzac(zzac zzac) {
        Preconditions.checkNotNull(zzac);
        this.zza = zzac.zza;
        this.zzb = zzac.zzb;
        this.zzc = zzac.zzc;
        this.zzd = zzac.zzd;
        this.zze = zzac.zze;
        this.zzf = zzac.zzf;
        this.zzg = zzac.zzg;
        this.zzh = zzac.zzh;
        this.zzi = zzac.zzi;
        this.zzj = zzac.zzj;
        this.zzk = zzac.zzk;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) zzlc zzlc, @SafeParcelable.Param(mo65742id = 5) long j, @SafeParcelable.Param(mo65742id = 6) boolean z, @SafeParcelable.Param(mo65742id = 7) String str3, @SafeParcelable.Param(mo65742id = 8) zzaw zzaw, @SafeParcelable.Param(mo65742id = 9) long j2, @SafeParcelable.Param(mo65742id = 10) zzaw zzaw2, @SafeParcelable.Param(mo65742id = 11) long j3, @SafeParcelable.Param(mo65742id = 12) zzaw zzaw3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzlc;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzaw;
        this.zzh = j2;
        this.zzi = zzaw2;
        this.zzj = j3;
        this.zzk = zzaw3;
    }
}
